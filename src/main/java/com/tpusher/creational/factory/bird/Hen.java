package com.tpusher.creational.factory.bird;

public class Hen extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Hen is flying.");
    }
}
