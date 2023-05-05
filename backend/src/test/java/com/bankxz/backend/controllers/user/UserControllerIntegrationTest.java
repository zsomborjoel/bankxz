package com.bankxz.backend.controllers.user;

import com.bankxz.backend.generated.tables.daos.UserDao;
import com.bankxz.backend.generated.tables.pojos.User;
import org.jooq.DSLContext;
import org.jooq.Records;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDate;
import java.util.UUID;

import static com.bankxz.backend.generated.tables.User.USER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@JooqTest
@Transactional
@AutoConfigureMockMvc
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
class UserControllerIntegrationTest {

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private UserDao userDao;

    @Autowired
    private MockMvc mockMvc;

    private MockHttpServletRequestBuilder saveUserBuilder;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();

        saveUserBuilder = MockMvcRequestBuilders.post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            """
            {
                "email": "zsomborjoel@gmail.com",
                "firstName": "Zsombor Joel",
                "lastName": "Gyurkovics",
                "taxId": "12345678-1-12",
                "socialSecurityNumber": "123456789",
                "dateOfBirth": "1994-10-19",
                "placeOfBirth": "Budapest",
                "addresses": [
                    {
                        "postalCode": "1222",
                        "city": "Budapest",
                        "street": "Gador utca",
                        "houseNumber": "32"
                    },
                    {
                        "postalCode": "1027",
                        "city": "Budapest",
                        "street": "Frankel Leo ut",
                        "houseNumber": "32",
                        "floor": "2"
                    }
                ],
                "phones": [
                    {
                        "number": "+36309540316"
                    },
                    {
                        "number": "+36309554321"
                    }
                ]
            }
            """
    })
    void shouldSaveValidUser(final String requestJson) throws Exception {
        saveUserBuilder.content(requestJson);

        final String actualUserId = mockMvc.perform(saveUserBuilder)
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        final User savedUser = userDao.findById(UUID.fromString(actualUserId.replace("\"","")));

        assertEquals("zsomborjoel@gmail.com", savedUser.getEmail());
        assertEquals("Zsombor Joel", savedUser.getFirstName());
        assertEquals("Gyurkovics", savedUser.getLastName());
        assertEquals("12345678-1-12", savedUser.getTaxId());
        assertEquals("123456789", savedUser.getSocialSecurityNumber());
        assertEquals(LocalDate.of(1994, 10, 19), savedUser.getDateOfBirth());
        assertEquals("Budapest", savedUser.getPlaceOfBirth());
    }

    @ParameterizedTest
    @ValueSource(strings = {
            """
            {
                "email": "zsomborjoel.gmail.com",
                "firstName": "Zsombor Joel",
                "lastName": "Gyurkovics",
                "taxId": "12345678-1-12",
                "socialSecurityNumber": "123456789",
                "dateOfBirth": "1994.10.19",
                "placeOfBirth": "Budapest",
            }
            """
    })
    void shouldReturnBadRequestForInvalidData(final String requestJson) throws Exception {
        saveUserBuilder.content(requestJson);
        mockMvc.perform(saveUserBuilder)
                .andExpect(status().isBadRequest());
    }

}
