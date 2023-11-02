package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CareerDto;
import com.uth.ums.career.model.dto.CourseDto;
import com.uth.ums.career.model.entity.Career;
import com.uth.ums.career.model.entity.Course;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface CourseMapper {
    CourseDto toDto(Course entity);
    Course toEntity(CourseDto dto);
}
