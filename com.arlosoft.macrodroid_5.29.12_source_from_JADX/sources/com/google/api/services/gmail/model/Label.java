package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class Label extends GenericJson {
    @Key
    private LabelColor color;
    @Key

    /* renamed from: id */
    private String f52891id;
    @Key
    private String labelListVisibility;
    @Key
    private String messageListVisibility;
    @Key
    private Integer messagesTotal;
    @Key
    private Integer messagesUnread;
    @Key
    private String name;
    @Key
    private Integer threadsTotal;
    @Key
    private Integer threadsUnread;
    @Key
    private String type;

    /* renamed from: k */
    public Label mo60137e() {
        return (Label) super.clone();
    }

    /* renamed from: l */
    public Label mo60138f(String str, Object obj) {
        return (Label) super.mo60078d(str, obj);
    }
}
