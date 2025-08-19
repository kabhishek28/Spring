package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollegeDto {
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotNull(message = "Principal cannot be null")
    @Size(min = 3, max = 50, message = "Principal name must be between 3 and 50 characters")
    private String principal;

    @NotNull(message = "Location cannot be null")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters")
    private String location;

    @Min(value = 1900, message = "Established year must be 1900 or later")
    @Max(value = 2030, message = "Established year cannot be after 2030")
    private int establishedYear;

    @Min(value = 50, message = "Students must be at least 50")
    @Max(value = 10000, message = "Students cannot exceed 10000")
    private int students;

    @NotNull(message = "Courses cannot be null")
    @Size(min = 3, max = 100, message = "Courses description must be between 3 and 100 characters")
    private String courses;

    @NotNull(message = "Affiliation cannot be null")
    @Size(min = 3, max = 50, message = "Affiliation must be between 3 and 50 characters")
    private String affiliation;
}
