package com.tpusher.behavioural.strategy;

public class PaymentMain {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCardPayment("1234 5678 90"));
        paymentService.makePayment(100);

        paymentService.setPaymentStrategy(new UPIPayment("abcd@xyzBank"));
        paymentService.makePayment(200);
    }
}
