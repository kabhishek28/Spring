package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LaptopDto {

    @NotNull(message = "Brand cannot be null")
    @Size(min = 2, max = 20, message = "Brand must be 2-20 chars")
    private String brand;

    @NotNull(message = "Model cannot be null")
    @Size(min = 2, max = 20, message = "Model must be 2-20 chars")
    private String model;

    @NotNull(message = "Processor cannot be null")
    @Size(min = 2, max = 20, message = "Processor must be 2-20 chars")
    private String processor;

    @NotNull(message = "RAM cannot be null")
    @Size(min = 1, max = 10, message = "RAM must be 1-10 chars")
    private String ram;

    @NotNull(message = "Storage cannot be null")
    @Size(min = 1, max = 20, message = "Storage must be 1-20 chars")
    private String storage;

    @NotNull(message = "OS cannot be null")
    @Size(min = 2, max = 20, message = "OS must be 2-20 chars")
    private String os;

    @Min(value = 100, message = "Price must be at least 100")
    private double price;
}
