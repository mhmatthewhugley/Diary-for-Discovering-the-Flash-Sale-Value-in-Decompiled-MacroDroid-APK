package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;

public final class Profile extends GenericJson {
    @Key
    private String emailAddress;
    @JsonString
    @Key
    private BigInteger historyId;
    @Key
    private Integer messagesTotal;
    @Key
    private Integer threadsTotal;

    /* renamed from: k */
    public Profile mo60137e() {
        return (Profile) super.clone();
    }

    /* renamed from: l */
    public Profile mo60138f(String str, Object obj) {
        return (Profile) super.mo60078d(str, obj);
    }
}
