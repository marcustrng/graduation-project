package com.uth.ums.career.model.dto;

import com.uth.ums.career.model.entity.UniversityClass;
import lombok.Value;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link UniversityClass}
 */
@Value
public class UniversityClassDto implements Serializable {
    Long universityClassId;
    Long careerId;
    String classCode;
    String className;
    Set<StudentDto> students;
}