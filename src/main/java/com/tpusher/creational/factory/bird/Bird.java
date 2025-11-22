package com.tpusher.creational.factory.bird;

public abstract class Bird {
    String name;
    String colour;

    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }
}
