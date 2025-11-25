package com.tpusher.structural.decorator.beverages;

public class Espresso implements Coffee {

    @Override
    public int cost() {
        return 20;
    }
}
