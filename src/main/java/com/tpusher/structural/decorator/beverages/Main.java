package com.tpusher.structural.decorator.beverages;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println("plain coffee costs:" + coffee.cost());

        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println("milk added, total cost:" + coffeeWithMilk.cost());

        Coffee coffeeWithCream = new CreamDecorator(coffeeWithMilk);
        System.out.println("cream added, total cost:" + coffeeWithCream.cost());
    }
}
