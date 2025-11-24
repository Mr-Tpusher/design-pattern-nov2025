package com.tpusher.structural.adapter.meta;

public class FacebookUser {
    private String fbUserName;
    private String fbPassword;

    public FacebookUser(String fbUserName, String fbPassword) {
        this.fbUserName = fbUserName;
        this.fbPassword = fbPassword;
    }

    public String getFbUserName() {
        return fbUserName;
    }

}
