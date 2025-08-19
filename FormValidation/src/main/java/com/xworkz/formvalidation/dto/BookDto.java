package com.xworkz.formvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    @NotNull
    @Size(min=3,max=10,message = "invalid Title")
    private String title;
    @NotNull
    @Size(min=3,max=10,message = "invalid AuthorName")
    private String author;
    @NotNull
    @Size(min=3,max=10,message = "invalid PublisherName")
    private String publisher;
    @NotNull
    private int year;
    @NotNull
    @Size(min=3,max=5,message = "invalid isbn")
    private String isbn;
    @NotNull
    @Min(value = 300,message = "below minimum")
    @Max(value = 500,message = "Above max")
    private double price;
    @Size(min=3,max=10,message = "invalid invalid genre")
    private String genre;

}
