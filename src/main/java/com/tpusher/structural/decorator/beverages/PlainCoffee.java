package com.tpusher.structural.decorator.beverages;

public class PlainCoffee implements Coffee {

    @Override
    public int cost() {
        return 10;
    }
}
