package com.tpusher.creational.prototype.items;

public class Driver {
    public static void main(String[] args) {
        // instantiate the registry
        Registry registry = new Registry();

        Movie endGame = (Movie) registry.get("movie");
        endGame.setTitle("End Game");
        endGame.setGenre(MovieGenre.ACTION);
        System.out.println(endGame);

        Book atomicHabits = (Book) registry.get("book");
        atomicHabits.setName("Atomic Habits");
        atomicHabits.setAuthor("James Clear");
        atomicHabits.setNumberOfPages(500);
        atomicHabits.setBookCoverType(BookCoverType.SOFT);
        System.out.println(atomicHabits);

    }
}
