package com.tpusher.structural.decorator.beverages;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return 5 + coffee.cost();
    }
}
