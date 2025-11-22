package com.tpusher.creational.factory.bird;

public class FactoryMain {
    public static void main(String[] args) {
        Bird parrot = BirdFactory.create("parrot");
        parrot.eat();

        Bird hen = BirdFactory.create("hen");
        hen.eat();

        Bird kiwi = BirdFactory.create("kiwi");
        kiwi.eat();

    }
}
