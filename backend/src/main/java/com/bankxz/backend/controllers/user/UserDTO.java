package com.bankxz.backend.controllers.user;

import com.bankxz.backend.controllers.address.AddressDTO;
import com.bankxz.backend.controllers.phone.PhoneDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class UserDTO {

    private UUID id;
    @Email(message = "Invalid email")
    private String email;
    private String firstName;
    private String lastName;
    private String mothersName;
    private String taxId;
    private String socialSecurityNumber;
    @Past(message = "Date have to be in the past")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;
    private String placeOfBirth;

}
