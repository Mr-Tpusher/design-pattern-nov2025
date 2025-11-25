package com.tpusher.structural.flyweight;

public class Grass {
    int x;
    int y;
    GrassImage image;

    public void addGrass(int x, int y) {
        if (image == null) {
            System.out.println("creating first grass object.");
            image = new GrassImage();
        } else {
            System.out.println("reusing the grass object.");
        }
        System.out.println("Drawing grass at x:" + x + " y:" + y);
    }
}
