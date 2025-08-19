package com.xworkz.formvalidation.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "college")
public class CollegeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "principal")
    private String principal;

    @Column(name = "location")
    private String location;

    @Column(name = "established_year")
    private int establishedYear;

    @Column(name = "students")
    private int students;

    @Column(name = "courses")
    private String courses;

    @Column(name = "affiliation")
    private String affiliation;
}
