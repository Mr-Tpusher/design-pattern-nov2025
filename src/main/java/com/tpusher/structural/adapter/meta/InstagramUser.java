package com.tpusher.structural.adapter.meta;

public class InstagramUser {
    private String handle;
    private String password;

    public InstagramUser(String handle, String password) {
        this.handle = handle;
        this.password = password;
    }

    public String getHandle() {
        return this.handle;
    }
}
