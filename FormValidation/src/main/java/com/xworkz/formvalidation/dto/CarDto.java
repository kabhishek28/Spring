package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor



public class CarDto {

    @NotNull(message = "Brand cannot be null")
    @Size(min = 2, max = 20, message = "Brand must be between 2 and 20 characters")
    private String brand;

    @NotNull(message = "Model cannot be null")
    @Size(min = 1, max = 20, message = "Model must be between 1 and 20 characters")
    private String model;

    @NotNull(message = "Color cannot be null")
    @Size(min = 3, max = 15, message = "Color must be between 3 and 15 characters")
    private String color;

    @Min(value = 1990, message = "Year must not be before 1990")
    @Max(value = 2030, message = "Year must not exceed 2030")
    private int year;

    @NotNull(message = "Owner name cannot be null")
    @Size(min = 3, max = 30, message = "Owner name must be between 3 and 30 characters")
    private String ownerName;

    @Min(value = 1000, message = "Price must be at least 1000")
    @Max(value = 1000000, message = "Price must not exceed 1,000,000")
    private double price;

    @NotNull(message = "Registration number cannot be null")
    @Size(min = 5, max = 15, message = "Registration number must be between 5 and 15 characters")
    private String registrationNumber;
}

