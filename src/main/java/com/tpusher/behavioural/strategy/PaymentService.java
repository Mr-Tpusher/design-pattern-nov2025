package com.tpusher.behavioural.strategy;

public class PaymentService {
    IPaymentStrategy paymentStrategy;

    void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void makePayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
