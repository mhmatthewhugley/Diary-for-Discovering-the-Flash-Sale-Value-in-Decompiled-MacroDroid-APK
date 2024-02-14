package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

public final class WatchResponse extends GenericJson {
    @JsonString
    @Key
    private Long expiration;
    @JsonString
    @Key
    private BigInteger historyId;

    /* renamed from: k */
    public WatchResponse mo60137e() {
        return (WatchResponse) super.clone();
    }

    /* renamed from: l */
    public WatchResponse mo60138f(String str, Object obj) {
        return (WatchResponse) super.mo60078d(str, obj);
    }
}
