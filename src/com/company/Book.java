package com.company;

public class Book {
    private String name;
    private String author;
    private String genre;
    private int numberOfPage;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String name, String author, String genre, int numberOfPage, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.numberOfPage = numberOfPage;
        this.year = year;
    }
    public Book() {

    }
}
