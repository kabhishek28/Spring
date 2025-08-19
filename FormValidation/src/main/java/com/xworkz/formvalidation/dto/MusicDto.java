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
public class MusicDto {

    @NotNull(message = "Title cannot be null")
    @Size(min = 2, max = 50, message = "Title must be 2-50 chars")
    private String title;

    @NotNull(message = "Artist cannot be null")
    @Size(min = 2, max = 50, message = "Artist must be 2-50 chars")
    private String artist;

    @NotNull(message = "Album cannot be null")
    @Size(min = 2, max = 50, message = "Album must be 2-50 chars")
    private String album;

    @NotNull(message = "Genre cannot be null")
    @Size(min = 2, max = 30, message = "Genre must be 2-30 chars")
    private String genre;

    @Min(value = 0, message = "Duration must be positive")
    private int duration;

    @NotNull(message = "Language cannot be null")
    @Size(min = 2, max = 20, message = "Language must be 2-20 chars")
    private String language;

    @NotNull(message = "Release Year cannot be null")
    @Size(min = 4, max = 4, message = "Release Year must be 4 digits")
    private String releaseYear;
}
