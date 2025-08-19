package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {

    @NotNull
    @Size(min = 3, max = 50, message = "Invalid name")
    private String name;

    @NotNull
    @Size(min = 3, max = 50, message = "Invalid location")
    private String location;

    @Min(value = 1, message = "Rooms must be at least 1")
    private int rooms;

    @NotNull
    @Size(min = 3, max = 50, message = "Invalid manager name")
    private String manager;

    @NotNull
    @Email(message = "Invalid email")
    private String email;

    @NotNull
    @Size(min = 10, max = 15, message = "Invalid phone number")
    private String phone;

    @NotNull
    @Size(min = 1, max = 10, message = "Invalid rating")
    private String rating;
}
