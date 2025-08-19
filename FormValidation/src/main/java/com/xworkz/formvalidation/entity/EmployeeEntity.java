package com.xworkz.formvalidation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_age")
    private int age;

    @Column(name = "employee_email")
    private String email;

    @Column(name = "employee_department")
    private String department;

    @Column(name = "employee_phone")
    private String phone;

    @Column(name = "employee_salary")
    private double salary;

    @Column(name = "employee_designation")
    private String designation;
}
