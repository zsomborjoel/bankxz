package com.bankxz.backend.controllers.address;

import com.bankxz.backend.entities.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface AddressMapper {

    @Mapping(target = "user", ignore = true)
    Address fromDTO(AddressDTO addressDTO);

    List<Address> fromDTOList(List<AddressDTO> addressDTOS);

}
