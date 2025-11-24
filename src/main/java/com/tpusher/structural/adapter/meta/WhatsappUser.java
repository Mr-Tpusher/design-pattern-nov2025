package com.tpusher.structural.adapter.meta;

public class WhatsappUser {
    private String name;
    private String password;

    public WhatsappUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }
}
