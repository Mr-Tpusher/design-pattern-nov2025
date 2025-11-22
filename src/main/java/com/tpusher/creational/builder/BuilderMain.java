package com.tpusher.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        SubwaySandwich sandwich = new SubwaySandwich.Builder()
                .setBread("bread")
                .setSalad("salad")
                .setSauce("sauce")
                .build();

        System.out.println(sandwich);
    }
}
