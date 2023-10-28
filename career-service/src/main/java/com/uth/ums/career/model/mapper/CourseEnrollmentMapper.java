package com.uth.ums.career.model.mapper;

import com.uth.ums.career.model.dto.CourseEnrollmentDto;
import com.uth.ums.career.model.entity.CourseEnrollment;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface CourseEnrollmentMapper {
    CourseEnrollmentDto toDto(CourseEnrollment entity);
    CourseEnrollment toEntity(CourseEnrollmentDto dto);
}
