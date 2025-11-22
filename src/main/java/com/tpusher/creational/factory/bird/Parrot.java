package com.tpusher.creational.factory.bird;

public class Parrot extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Parrot is flying.");
    }
}
