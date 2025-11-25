package com.tpusher.behavioural.observer.stock;

public interface Subject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(String message);
}
