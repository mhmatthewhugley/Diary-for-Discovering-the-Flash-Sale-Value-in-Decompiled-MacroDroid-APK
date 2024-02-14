package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class MessagePartHeader extends GenericJson {
    @Key
    private String name;
    @Key
    private String value;

    /* renamed from: k */
    public MessagePartHeader mo60137e() {
        return (MessagePartHeader) super.clone();
    }

    /* renamed from: l */
    public MessagePartHeader mo60138f(String str, Object obj) {
        return (MessagePartHeader) super.mo60078d(str, obj);
    }
}
