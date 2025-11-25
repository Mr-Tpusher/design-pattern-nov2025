package com.tpusher.behavioural.strategy;

public class UPIPayment implements IPaymentStrategy {
    private final String UPIId;

    public UPIPayment(String UPIId) {
        this.UPIId = UPIId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("amount of " + amount + " paid through upi id " + UPIId);
    }
}
