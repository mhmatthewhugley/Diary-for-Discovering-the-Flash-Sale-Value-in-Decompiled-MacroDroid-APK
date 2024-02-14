package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class HistoryMessageAdded extends GenericJson {
    @Key
    private Message message;

    /* renamed from: k */
    public HistoryMessageAdded mo60137e() {
        return (HistoryMessageAdded) super.clone();
    }

    /* renamed from: l */
    public HistoryMessageAdded mo60138f(String str, Object obj) {
        return (HistoryMessageAdded) super.mo60078d(str, obj);
    }
}
