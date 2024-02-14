package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class MessagePartBody extends GenericJson {
    @Key
    private String attachmentId;
    @Key
    private String data;
    @Key
    private Integer size;

    /* renamed from: k */
    public MessagePartBody mo60137e() {
        return (MessagePartBody) super.clone();
    }

    /* renamed from: l */
    public MessagePartBody mo60138f(String str, Object obj) {
        return (MessagePartBody) super.mo60078d(str, obj);
    }
}
