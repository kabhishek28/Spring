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
public class MovieDto {

    @NotNull(message = "Title cannot be null")
    @Size(min = 2, max = 50, message = "Title must be 2-50 chars")
    private String title;

    @NotNull(message = "Director cannot be null")
    @Size(min = 2, max = 50, message = "Director must be 2-50 chars")
    private String director;

    @NotNull(message = "Producer cannot be null")
    @Size(min = 2, max = 50, message = "Producer must be 2-50 chars")
    private String producer;

    @Min(value = 1900, message = "Year must be after 1900")
    private int year;

    @NotNull(message = "Genre cannot be null")
    @Size(min = 2, max = 30, message = "Genre must be 2-30 chars")
    private String genre;

    @Min(value = 0, message = "Rating cannot be negative")
    private double rating;

    @NotNull(message = "Language cannot be null")
    @Size(min = 2, max = 20, message = "Language must be 2-20 chars")
    private String language;
}
