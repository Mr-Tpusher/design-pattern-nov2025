package com.tpusher.creational.prototype.employee;

public class PrototypeMain {
    public static void main(String[] args) {
        // creating some prototypes
        Employee alan = new Employee("Alan turing", new Address("Earth", "100"));
        Employee Charles = new Employee("Charles Babbage", new Address("Earth", "200"));

        // register with registry
        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addPrototype("Alan", alan);
        registry.addPrototype("charles", Charles);

        // retrieve clones
        Employee alanCopy = (Employee) registry.get("Alan");
        Employee charlesCopy = (Employee) registry.get("Charles");

        // modify Alan's clone
        alanCopy.setAddress(new Address("Mars", "001"));

        System.out.println("original Alan:" + alan);
        System.out.println("copy Alan: " + alanCopy);
    }
}
