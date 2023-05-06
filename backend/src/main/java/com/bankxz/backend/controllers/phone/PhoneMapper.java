package com.bankxz.backend.controllers.phone;

import com.bankxz.backend.generated.tables.records.PhoneRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface PhoneMapper {

    @Mapping(target = "userId", ignore = true)
    PhoneRecord fromDTO(PhoneDTO phoneDTO);

    List<PhoneRecord> fromDTOList(List<PhoneDTO> phoneDTOS);

}
