package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class HistoryMessageDeleted extends GenericJson {
    @Key
    private Message message;

    /* renamed from: k */
    public HistoryMessageDeleted mo60137e() {
        return (HistoryMessageDeleted) super.clone();
    }

    /* renamed from: l */
    public HistoryMessageDeleted mo60138f(String str, Object obj) {
        return (HistoryMessageDeleted) super.mo60078d(str, obj);
    }
}
