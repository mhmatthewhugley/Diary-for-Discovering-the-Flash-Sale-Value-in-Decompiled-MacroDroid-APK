package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class MessagePart extends GenericJson {
    @Key
    private MessagePartBody body;
    @Key
    private String filename;
    @Key
    private List<MessagePartHeader> headers;
    @Key
    private String mimeType;
    @Key
    private String partId;
    @Key
    private List<MessagePart> parts;

    /* renamed from: k */
    public MessagePart mo60137e() {
        return (MessagePart) super.clone();
    }

    /* renamed from: l */
    public MessagePart mo60138f(String str, Object obj) {
        return (MessagePart) super.mo60078d(str, obj);
    }
}
