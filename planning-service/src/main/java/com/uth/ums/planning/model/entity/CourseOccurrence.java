package com.uth.ums.planning.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "course_occurrence")
public class CourseOccurrence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_occurrence_id", nullable = false)
    private Long courseOccurrenceId;


}
