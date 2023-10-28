package com.uth.ums.enrollment.model.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.uth.ums.enrollment.model.entity.UniversityClass}
 */
@Value
public class UniversityClassDto implements Serializable {
    Long universityClassId;
    Long careerId;
    String classCode;
    String className;
    Set<StudentDto> students;
}