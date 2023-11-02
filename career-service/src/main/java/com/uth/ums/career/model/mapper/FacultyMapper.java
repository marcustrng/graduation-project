package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.FacultyDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.Faculty;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface FacultyMapper {
    FacultyDto toDto(Faculty entity);
    Faculty toEntity(FacultyDto dto);
}
