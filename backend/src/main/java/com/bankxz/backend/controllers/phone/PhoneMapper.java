package com.bankxz.backend.controllers.phone;

import com.bankxz.backend.generated.tables.pojos.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper
public interface PhoneMapper {

    @Mapping(target = "userId", ignore = true)
    Phone fromDTO(PhoneDTO phoneDTO);

    List<Phone> fromDTOList(List<PhoneDTO> phoneDTOS);

}
