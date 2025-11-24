package com.tpusher.structural.adapter.meta;

public class Main {
    public static void main(String[] args) {
        Analytics analytics = new Analytics();
        loadUsers(analytics);

        analytics.printCurrentActiveUsers();

    }

    public static void loadUsers(Analytics analytics) {

        FacebookUser fbUser = new FacebookUser("Alpha", "Alpha");
        analytics.addFbUser(fbUser);
        InstagramUser instagramUser = new InstagramUser("Beta", "Beta");
        analytics.addInstagramUser(instagramUser);
        WhatsappUser whatsappUser = new WhatsappUser("Gamma", "Gamma");
        analytics.addWhatsappUser(whatsappUser);
    }
}
