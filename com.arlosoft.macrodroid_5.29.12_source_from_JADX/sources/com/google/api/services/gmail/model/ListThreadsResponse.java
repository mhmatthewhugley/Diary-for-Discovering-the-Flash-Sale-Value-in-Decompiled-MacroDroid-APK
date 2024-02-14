package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListThreadsResponse extends GenericJson {
    @Key
    private String nextPageToken;
    @Key
    private Long resultSizeEstimate;
    @Key
    private List<Thread> threads;

    /* renamed from: k */
    public ListThreadsResponse mo60137e() {
        return (ListThreadsResponse) super.clone();
    }

    /* renamed from: l */
    public ListThreadsResponse mo60138f(String str, Object obj) {
        return (ListThreadsResponse) super.mo60078d(str, obj);
    }
}
