package com.tpusher.structural.adapter.meta;

import java.util.ArrayList;
import java.util.List;

public class Analytics {
    List<IUserAdapter> activeUsers = new ArrayList<>();

    public void addFbUser(FacebookUser facebookUser) {
        activeUsers.add(new FbUserAdapter(facebookUser));
    }

    public void addInstagramUser(InstagramUser instagramUser) {
        activeUsers.add(new InstagramUserAdapter(instagramUser));
    }

    public void addWhatsappUser(WhatsappUser whatsappUser) {
        activeUsers.add(new WhatsappUserAdapter(whatsappUser));
    }

    public void printCurrentActiveUsers() {
        activeUsers.forEach(u -> System.out.println(u.getUserId()));
    }
}
