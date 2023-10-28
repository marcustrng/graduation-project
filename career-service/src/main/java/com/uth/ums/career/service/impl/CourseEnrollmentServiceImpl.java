package com.uth.ums.career.service.impl;

import com.uth.ums.career.model.entity.CourseEnrollment;
import com.uth.ums.career.repository.CourseEnrollmentRepository;
import com.uth.ums.career.service.CourseEnrollmentService;
import com.uth.ums.career.model.dto.CourseEnrollmentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseEnrollmentServiceImpl implements CourseEnrollmentService {
    private final CourseEnrollmentRepository courseEnrollmentRepository;
    @Override
    public List<CourseEnrollmentDto> getAll() {
        return null;
    }

    @Override
    public CourseEnrollmentDto getById(Long id) {
        return null;
    }

    @Override
    public CourseEnrollmentDto createNew(CourseEnrollmentDto dto) {
        return null;
    }

    @Override
    public CourseEnrollmentDto update(Long id, CourseEnrollmentDto dto) {
        return null;
    }

    @Override
    public void delete(Long id) {
        CourseEnrollment courseEnrollment = courseEnrollmentRepository.findById(id).orElseThrow();
        courseEnrollmentRepository.delete(courseEnrollment);
    }
}
