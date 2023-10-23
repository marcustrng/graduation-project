package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "course_enrollment")
public class CourseEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_enrollment_id", nullable = false)
    private Long courseEnrollmentId;

    private int studentId;
    private int courseOccurrenceId;
    private double attendanceScore;
    private double progressScore;
    private double midtermExamScore;
    private double finalExamScore;
    private double finalScore;
}
