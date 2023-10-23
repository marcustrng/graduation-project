package com.uth.ums.enrollment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "career_status")
public class CareerStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "career_status_id", nullable = false)
    private Long careerStatusId;

    private String careerStatusName;
}
