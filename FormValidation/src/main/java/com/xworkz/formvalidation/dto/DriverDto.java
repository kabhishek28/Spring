package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 80, message = "Age must not exceed 80")
    private int age;

    @NotNull(message = "Phone cannot be null")
    @Pattern(regexp="\\d{10}", message="Phone must be 10 digits")
    private String phone;

    @NotNull(message = "Email cannot be null")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Place cannot be null")
    @Size(min = 3, max = 50, message = "Place must be between 3 and 50 characters")
    private String place;

    @NotNull(message = "License Number cannot be null")
    @Size(min = 5, max = 20, message = "License Number must be between 5 and 20 characters")
    private String licenseNumber;

    @NotNull(message = "Vehicle Type cannot be null")
    @Size(min = 3, max = 20, message = "Vehicle Type must be between 3 and 20 characters")
    private String vehicleType;
}
