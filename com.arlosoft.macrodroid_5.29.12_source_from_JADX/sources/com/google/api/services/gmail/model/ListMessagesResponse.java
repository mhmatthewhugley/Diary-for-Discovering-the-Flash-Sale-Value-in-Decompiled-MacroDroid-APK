package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class ListMessagesResponse extends GenericJson {
    @Key
    private List<Message> messages;
    @Key
    private String nextPageToken;
    @Key
    private Long resultSizeEstimate;

    /* renamed from: k */
    public ListMessagesResponse mo60137e() {
        return (ListMessagesResponse) super.clone();
    }

    /* renamed from: l */
    public ListMessagesResponse mo60138f(String str, Object obj) {
        return (ListMessagesResponse) super.mo60078d(str, obj);
    }
}
