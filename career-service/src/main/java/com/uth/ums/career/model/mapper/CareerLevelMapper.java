package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.CareerLevelDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.CareerLevel;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface CareerLevelMapper {
    CareerLevelDto toDto(CareerLevel entity);
    CareerLevel toEntity(CareerLevelDto dto);
}
