package com.uth.ums.career.service;

import com.uth.ums.career.model.dto.CourseEnrollmentDto;

import java.util.List;

public interface CourseEnrollmentService {
    List<CourseEnrollmentDto> getAll();
    CourseEnrollmentDto getById(Long id);
    CourseEnrollmentDto createNew(CourseEnrollmentDto dto);
    CourseEnrollmentDto update(Long id, CourseEnrollmentDto dto);
    void delete(Long id);
}
