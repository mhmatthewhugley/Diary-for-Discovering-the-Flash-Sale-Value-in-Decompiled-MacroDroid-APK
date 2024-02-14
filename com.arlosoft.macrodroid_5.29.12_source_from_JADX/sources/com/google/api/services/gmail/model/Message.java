package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;
import java.util.List;

public final class Message extends GenericJson {
    @JsonString
    @Key
    private BigInteger historyId;
    @Key

    /* renamed from: id */
    private String f52892id;
    @JsonString
    @Key
    private Long internalDate;
    @Key
    private List<String> labelIds;
    @Key
    private MessagePart payload;
    @Key
    private String raw;
    @Key
    private Integer sizeEstimate;
    @Key
    private String snippet;
    @Key
    private String threadId;

    /* renamed from: k */
    public Message mo60137e() {
        return (Message) super.clone();
    }

    /* renamed from: l */
    public String mo60924l() {
        return this.raw;
    }

    /* renamed from: n */
    public Message mo60138f(String str, Object obj) {
        return (Message) super.mo60078d(str, obj);
    }

    /* renamed from: o */
    public Message mo60926o(String str) {
        this.raw = str;
        return this;
    }
}
