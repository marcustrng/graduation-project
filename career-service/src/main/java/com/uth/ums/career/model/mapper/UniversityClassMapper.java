package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.UniversityClassDto;
import com.uth.ums.career.model.entity.UniversityClass;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface UniversityClassMapper {
    UniversityClassDto toDto(UniversityClass entity);
    UniversityClass toEntity(UniversityClassDto dto);
}
