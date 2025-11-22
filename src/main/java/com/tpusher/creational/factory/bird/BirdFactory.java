package com.tpusher.creational.factory.bird;

public class BirdFactory {
    public static Bird create(String type) {
        return switch (type.toLowerCase()) {
            case "parrot" -> new Parrot();
            case "hen" -> new Hen();
            case "kiwi" -> new Kiwi();
            default -> throw new IllegalArgumentException("bird type " + type + " does not exist.");
        };
    }
}
