package com.tpusher.behavioural.observer.stock;

public class EmailObserver implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("Email observer: " + message);
    }
}
