package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "university_classes")
public class UniversityClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_class_id", nullable = false)
    private Long universityClassId;

    private Long careerId;
    private String classCode;
    private String className;

    @OneToMany(mappedBy="universityClass")
    private Set<Student> students;
}
