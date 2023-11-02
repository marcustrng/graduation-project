package com.uth.ums.career.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "semesters")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semester_id", nullable = false)
    private Long semesterId;

    private Integer semesterNo;

    @ManyToOne
    @JoinColumn(name="career_id", nullable=false)
    private Career career;

    @OneToMany(mappedBy="semester")
    private Set<SemesterCourse> semesterCourses;

}
