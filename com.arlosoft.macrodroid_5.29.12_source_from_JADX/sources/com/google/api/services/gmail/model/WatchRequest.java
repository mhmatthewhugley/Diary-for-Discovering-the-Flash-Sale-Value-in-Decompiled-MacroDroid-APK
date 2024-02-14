package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class WatchRequest extends GenericJson {
    @Key
    private String labelFilterAction;
    @Key
    private List<String> labelIds;
    @Key
    private String topicName;

    /* renamed from: k */
    public WatchRequest mo60137e() {
        return (WatchRequest) super.clone();
    }

    /* renamed from: l */
    public WatchRequest mo60138f(String str, Object obj) {
        return (WatchRequest) super.mo60078d(str, obj);
    }
}
