package com.tpusher.structural.adapter.meta;

public class FbUserAdapter implements IUserAdapter {

    private FacebookUser facebookUser;

    public FbUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String  getUserId() {
        return facebookUser.getFbUserName();
    }
}
