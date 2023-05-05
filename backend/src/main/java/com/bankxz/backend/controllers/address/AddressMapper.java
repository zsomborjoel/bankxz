package com.bankxz.backend.controllers.address;

import com.bankxz.backend.generated.tables.pojos.Address;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface AddressMapper {

    @Mapping(target = "userId", ignore = true)
    Address fromDTO(AddressDTO addressDTO);

    List<Address> fromDTOList(List<AddressDTO> addressDTOS);

}
