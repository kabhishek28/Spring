package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WoodlandDto {

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 50, message = "Name must be 2-50 chars")
    private String name;

    @NotNull(message = "Location cannot be null")
    @Size(min = 2, max = 100, message = "Location must be 2-100 chars")
    private String location;

    @NotNull(message = "Owner cannot be null")
    @Size(min = 2, max = 50, message = "Owner must be 2-50 chars")
    private String owner;

    @NotNull(message = "Area cannot be null")
    @Size(min = 2, max = 50, message = "Area must be 2-50 chars")
    private String area;

    @NotNull(message = "Type cannot be null")
    @Size(min = 2, max = 50, message = "Type must be 2-50 chars")
    private String type;

    @NotNull(message = "Contact cannot be null")
    @Size(min = 10, max = 15, message = "Contact must be 10-15 digits")
    private String contact;

    @NotNull(message = "Facilities cannot be null")
    @Size(min = 2, max = 100, message = "Facilities must be 2-100 chars")
    private String facilities;
}
