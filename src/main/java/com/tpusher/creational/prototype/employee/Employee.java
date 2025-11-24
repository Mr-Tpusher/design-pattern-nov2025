package com.tpusher.creational.prototype.employee;

public class Employee implements Prototype {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // copy constructor for deep copy
    public Employee(Employee copy) {
        this.name = copy.name;
        this.address = new Address(copy.address);
    }

    @Override
    public Employee clone() {
        // use copy constructor to create a copy/clone
        return new Employee(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " lives at : " + address;
    }
}
