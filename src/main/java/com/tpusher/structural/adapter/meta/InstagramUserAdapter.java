package com.tpusher.structural.adapter.meta;

public class InstagramUserAdapter implements IUserAdapter {
    InstagramUser instagramUser;

    public InstagramUserAdapter(InstagramUser instagramUser) {
        this.instagramUser = instagramUser;
    }

    @Override
    public String getUserId() {
        return instagramUser.getHandle();
    }
}
