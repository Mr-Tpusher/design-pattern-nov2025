package com.tpusher.structural.adapter.meta;

public class WhatsappUserAdapter implements IUserAdapter {
    WhatsappUser whatsappUser;

    public WhatsappUserAdapter(WhatsappUser whatsappUser) {
        this.whatsappUser = whatsappUser;
    }

    @Override
    public String getUserId() {
        return whatsappUser.getName();
    }
}
