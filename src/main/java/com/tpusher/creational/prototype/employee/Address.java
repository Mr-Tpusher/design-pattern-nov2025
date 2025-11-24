package com.tpusher.creational.prototype.employee;

public class Address {
    private String city;
    private String pin;

    public Address(String city, String pin) {
        this.city = city;
        this.pin = pin;
    }

    // constructor for deep copy
    public Address(Address copy) {
        this.city = copy.city;
        this.pin = copy.pin;
    }

    @Override
    public String toString() {
        return city + ", " + pin;
    }
}
