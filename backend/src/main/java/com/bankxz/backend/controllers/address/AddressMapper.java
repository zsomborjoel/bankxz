package com.bankxz.backend.controllers.address;

import com.bankxz.backend.generated.tables.records.AddressRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface AddressMapper {

    @Mapping(target = "userId", ignore = true)
    AddressRecord fromDTO(AddressDTO addressDTO);

    List<AddressRecord> fromDTOList(List<AddressDTO> addressDTOS);

}
