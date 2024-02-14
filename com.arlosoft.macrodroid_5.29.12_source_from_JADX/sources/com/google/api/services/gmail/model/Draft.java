package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class Draft extends GenericJson {
    @Key

    /* renamed from: id */
    private String f52887id;
    @Key
    private Message message;

    /* renamed from: k */
    public Draft mo60137e() {
        return (Draft) super.clone();
    }

    /* renamed from: l */
    public Draft mo60138f(String str, Object obj) {
        return (Draft) super.mo60078d(str, obj);
    }
}
