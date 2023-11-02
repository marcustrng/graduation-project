package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.SemesterDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.Semester;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface SemesterMapper {
    SemesterDto toDto(Semester entity);
    Semester toEntity(SemesterDto dto);
}
