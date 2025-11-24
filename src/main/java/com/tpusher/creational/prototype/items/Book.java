package com.tpusher.creational.prototype.items;

public class Book implements Prototype {
    private String name;
    private String author;
    private int numberOfPages;
    private BookCoverType bookCoverType;

    public Book(String name, String author, int numberOfPages, BookCoverType bookCoverType) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.bookCoverType = bookCoverType;
    }

    @Override
    public Prototype clone() {
        return new Book(this.name, this.author, this.numberOfPages, this.bookCoverType);

    }

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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public BookCoverType getBookCoverType() {
        return bookCoverType;
    }

    public void setBookCoverType(BookCoverType bookCoverType) {
        this.bookCoverType = bookCoverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", bookCoverType=" + bookCoverType +
                '}';
    }
}
