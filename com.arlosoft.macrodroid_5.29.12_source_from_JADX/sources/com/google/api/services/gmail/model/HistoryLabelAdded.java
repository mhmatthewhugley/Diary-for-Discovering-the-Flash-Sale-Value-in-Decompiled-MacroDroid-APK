package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class HistoryLabelAdded extends GenericJson {
    @Key
    private List<String> labelIds;
    @Key
    private Message message;

    /* renamed from: k */
    public HistoryLabelAdded mo60137e() {
        return (HistoryLabelAdded) super.clone();
    }

    /* renamed from: l */
    public HistoryLabelAdded mo60138f(String str, Object obj) {
        return (HistoryLabelAdded) super.mo60078d(str, obj);
    }
}
