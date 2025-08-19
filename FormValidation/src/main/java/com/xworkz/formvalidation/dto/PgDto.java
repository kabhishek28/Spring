package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PgDto {

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 50, message = "Name must be 2-50 chars")
    private String name;

    @NotNull(message = "Location cannot be null")
    @Size(min = 2, max = 50, message = "Location must be 2-50 chars")
    private String location;

    private int rooms;

    @NotNull(message = "Owner cannot be null")
    @Size(min = 2, max = 50, message = "Owner must be 2-50 chars")
    private String owner;

    @NotNull(message = "Email cannot be null")
    @Size(min = 5, max = 50, message = "Email must be 5-50 chars")
    private String email;

    @NotNull(message = "Phone cannot be null")
    @Size(min = 10, max = 15, message = "Phone must be 10-15 digits")
    private String phone;

    @Size(min = 2, max = 100, message = "Facilities must be 2-100 chars")
    private String facilities;
}
