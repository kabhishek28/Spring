package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 50, message = "Name must be 2-50 chars")
    private String name;

    private int age;

    @NotNull(message = "Roll Number cannot be null")
    @Size(min = 2, max = 20, message = "Roll Number must be 2-20 chars")
    private String rollNumber;

    @NotNull(message = "Course cannot be null")
    @Size(min = 2, max = 50, message = "Course must be 2-50 chars")
    private String course;

    @NotNull(message = "Email cannot be null")
    @Size(min = 5, max = 50, message = "Email must be 5-50 chars")
    private String email;

    @NotNull(message = "Phone cannot be null")
    @Size(min = 10, max = 15, message = "Phone must be 10-15 digits")
    private String phone;

    @NotNull(message = "College cannot be null")
    @Size(min = 2, max = 50, message = "College must be 2-50 chars")
    private String college;
}
