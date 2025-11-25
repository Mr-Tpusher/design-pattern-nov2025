package com.tpusher.structural.decorator.beverages;

public class CreamDecorator extends CoffeeDecorator {

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int cost() {
        return 7 + coffee.cost();
    }
}
