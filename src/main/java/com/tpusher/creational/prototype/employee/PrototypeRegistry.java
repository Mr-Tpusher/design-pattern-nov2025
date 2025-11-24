package com.tpusher.creational.prototype.employee;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String, Prototype>  registry = new HashMap<>();

    // add a prototype to the type
    public void addPrototype(String key, Prototype prototype) {
        registry.put(key.toLowerCase(), prototype);
    }

    public Prototype get(String key) {
        Prototype prototype = registry.get(key.toLowerCase());
        if (prototype == null) {
            throw new IllegalArgumentException("no prototype found for the key:" + key);
        }
        return prototype.clone();
    }
}
