package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.math.BigInteger;
import java.util.List;

public final class Thread extends GenericJson {
    @JsonString
    @Key
    private BigInteger historyId;
    @Key

    /* renamed from: id */
    private String f52894id;
    @Key
    private List<Message> messages;
    @Key
    private String snippet;

    static {
        Data.m72658i(Message.class);
    }

    /* renamed from: k */
    public Thread mo60137e() {
        return (Thread) super.clone();
    }

    /* renamed from: l */
    public Thread mo60138f(String str, Object obj) {
        return (Thread) super.mo60078d(str, obj);
    }
}
