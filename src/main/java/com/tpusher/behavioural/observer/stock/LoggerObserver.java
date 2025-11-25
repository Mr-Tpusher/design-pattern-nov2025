package com.tpusher.behavioural.observer.stock;

public class LoggerObserver implements IObserver {

    @Override
    public void update(String message) {
        System.out.println("Logger observer : " + message);
    }
}
