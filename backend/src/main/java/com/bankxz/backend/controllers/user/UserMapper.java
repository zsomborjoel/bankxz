package com.bankxz.backend.controllers.user;

import com.bankxz.backend.generated.tables.records.UserRecord;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    UserDTO toDTO(UserRecord user);

    List<UserDTO> toDTOList(List<UserRecord> users);

    UserRecord fromDTO(UserDTO userDTO);

    List<UserRecord> fromDTOList(List<UserDTO> userDTOS);

}
