package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class HistoryLabelRemoved extends GenericJson {
    @Key
    private List<String> labelIds;
    @Key
    private Message message;

    /* renamed from: k */
    public HistoryLabelRemoved mo60137e() {
        return (HistoryLabelRemoved) super.clone();
    }

    /* renamed from: l */
    public HistoryLabelRemoved mo60138f(String str, Object obj) {
        return (HistoryLabelRemoved) super.mo60078d(str, obj);
    }
}
