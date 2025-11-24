package com.tpusher.creational.prototype.items;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Registry {
    private Map<String, Prototype> registry;

    public Registry() {
        registry = new HashMap<>();
        loadPrototypes();
    }

    public Prototype get(String itemType) {
        /* Prototype prototype = registry.get(itemType.toLowerCase());
        if (prototype == null) {
            throw new IllegalArgumentException("item type does not exist:" + itemType);
        }
        return prototype.clone();
         */

        Optional<Prototype> prototype = Optional.ofNullable(registry.get(itemType.toLowerCase()));

        return prototype
                .orElseThrow(() -> new IllegalArgumentException("item type does not exist: " + itemType))
                .clone();

    }

    private void loadPrototypes() {
        // basic movie prototype
        Movie basicMovie = new Movie("Basic Movie", MovieGenre.COMEDY);
        registry.put("movie", basicMovie);

        // basic book prototype
        Book basicBook = new Book("Basic Book", "John Doe", 100, BookCoverType.HARD);
        registry.put("book", basicBook);
    }
}
