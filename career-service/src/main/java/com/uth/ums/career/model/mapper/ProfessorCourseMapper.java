package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.ProfessorCourseDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.ProfessorCourse;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface ProfessorCourseMapper {
    ProfessorCourseDto toDto(ProfessorCourse entity);
    ProfessorCourse toEntity(ProfessorCourseDto dto);
}
