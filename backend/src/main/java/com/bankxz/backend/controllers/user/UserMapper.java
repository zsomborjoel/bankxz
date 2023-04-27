package com.bankxz.backend.controllers.user;

import com.bankxz.backend.controllers.address.AddressMapper;
import com.bankxz.backend.controllers.phone.PhoneMapper;
import com.bankxz.backend.generated.tables.pojos.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(uses = {AddressMapper.class, PhoneMapper.class})
public interface UserMapper {

    UserDTO toDTO(User user);

    List<UserDTO> toDTOList(List<User> users);

    User fromDTO(UserDTO userDTO);

    List<User> fromDTOList(List<UserDTO> userDTOS);

}
