package com.tpusher.creational.prototype.items;

public class Movie implements Prototype {
    private String title;
    private MovieGenre genre;

    public Movie(String title, MovieGenre genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public Prototype clone() {
        return new Movie(this.title, this.genre);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }
}
