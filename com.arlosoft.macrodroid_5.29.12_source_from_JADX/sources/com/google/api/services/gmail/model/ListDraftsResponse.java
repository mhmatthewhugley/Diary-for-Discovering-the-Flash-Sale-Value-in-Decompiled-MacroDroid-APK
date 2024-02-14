package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Data;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListDraftsResponse extends GenericJson {
    @Key
    private List<Draft> drafts;
    @Key
    private String nextPageToken;
    @Key
    private Long resultSizeEstimate;

    static {
        Data.m72658i(Draft.class);
    }

    /* renamed from: k */
    public ListDraftsResponse mo60137e() {
        return (ListDraftsResponse) super.clone();
    }

    /* renamed from: l */
    public ListDraftsResponse mo60138f(String str, Object obj) {
        return (ListDraftsResponse) super.mo60078d(str, obj);
    }
}
