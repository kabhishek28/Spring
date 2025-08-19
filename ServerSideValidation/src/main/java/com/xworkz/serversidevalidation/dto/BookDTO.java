package com.xworkz.serversidevalidation.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BookDTO {

@NotEmpty
@NotNull
@NotBlank
    private String bookName;

    private String author;

    private int price;

    private String genre;

    public BookDTO(String bookName, String author, int price, String genre, String publishedDate) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.publishedDate = publishedDate;
    }

    private String publishedDate;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", publishedDate='" + publishedDate + '\'' +
                '}';
    }

    public BookDTO() {
    }
}
