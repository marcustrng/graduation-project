package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "career_enrollment")
public class CareerEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "career_enrollment_id", nullable = false)
    private Long careerEnrollmentId;

    private int studentId;
    private int careerId;
    private LocalDate enrollmentDate;
    private int careerStatusId;
    private LocalDate careerStatusDate;
}
