package com.tpusher.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Runnable r = () -> DatabaseConnection.getInstance("1.2.3.4", "user", "passoword");

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

    }
}
