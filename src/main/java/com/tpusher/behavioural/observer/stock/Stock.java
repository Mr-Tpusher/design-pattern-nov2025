package com.tpusher.behavioural.observer.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String name;
    private int price;
    private int prevPrice;
    private List<IObserver> observers;

    public Stock(String name, int price) {
        this.name = name;
        this.price = price;
        this.prevPrice = 0;
    }

    public void setPrice(int price) {
        this.prevPrice = this.price;
        this.price = price;
        int priceDiff = Math.abs(this.prevPrice - this.price);

        String message = prevPrice > price ? "stock price decreased by " : "stock price increased by ";
        message += priceDiff;

        notifyObservers(message);
    }

    @Override
    public void addObserver(IObserver observer) {
        if (observers == null) {
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        if (observers == null) return;

        for (IObserver observer : observers) {
            observer.update(message);
        }
    }
}
