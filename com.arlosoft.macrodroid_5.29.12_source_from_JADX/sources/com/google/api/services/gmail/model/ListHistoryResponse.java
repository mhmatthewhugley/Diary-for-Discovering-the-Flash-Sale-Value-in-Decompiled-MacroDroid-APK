package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.math.BigInteger;
import java.util.List;

public final class ListHistoryResponse extends GenericJson {
    @Key
    private List<History> history;
    @JsonString
    @Key
    private BigInteger historyId;
    @Key
    private String nextPageToken;

    static {
        Data.m72658i(History.class);
    }

    /* renamed from: k */
    public ListHistoryResponse mo60137e() {
        return (ListHistoryResponse) super.clone();
    }

    /* renamed from: l */
    public ListHistoryResponse mo60138f(String str, Object obj) {
        return (ListHistoryResponse) super.mo60078d(str, obj);
    }
}
