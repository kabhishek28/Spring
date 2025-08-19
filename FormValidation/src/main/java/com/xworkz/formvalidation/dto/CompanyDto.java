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
public class CompanyDto {
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;

    @NotNull(message = "CEO cannot be null")
    @Size(min = 3, max = 50, message = "CEO name must be between 3 and 50 characters")
    private String ceo;

    @NotNull(message = "Industry cannot be null")
    @Size(min = 3, max = 50, message = "Industry must be between 3 and 50 characters")
    private String industry;

    @NotNull(message = "Headquarters cannot be null")
    @Size(min = 3, max = 50, message = "Headquarters must be between 3 and 50 characters")
    private String headquarters;

    @Min(value = 1, message = "Employees must be at least 1")
    @Max(value = 1000000, message = "Employees cannot exceed 1000000")
    private int employees;

    @Min(value = 0, message = "Revenue cannot be negative")
    private double revenue;

    @NotNull(message = "Founded cannot be null")
    @Size(min = 4, max = 20, message = "Founded must be between 4 and 20 characters")
    private String founded;
}
