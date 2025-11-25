package com.tpusher.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Grass grass1 = new Grass();
        grass1.addGrass(10, 20);
        grass1.addGrass(20, 30);
        grass1.addGrass(40, 50);
    }
}
