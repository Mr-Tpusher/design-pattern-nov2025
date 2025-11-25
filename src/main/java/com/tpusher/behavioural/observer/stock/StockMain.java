package com.tpusher.behavioural.observer.stock;

public class StockMain {
    public static void main(String[] args) {
        // create a meta stock
        Stock stock = new Stock("Meta", 100);

        // add observers
        stock.addObserver(new EmailObserver());
        stock.addObserver(new LoggerObserver());

        stock.setPrice(200);
        stock.setPrice(150);
    }
}
