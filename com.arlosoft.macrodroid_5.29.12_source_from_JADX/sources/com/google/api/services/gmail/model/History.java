package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;
import java.math.BigInteger;
import java.util.List;

public final class History extends GenericJson {
    @JsonString
    @Key

    /* renamed from: id */
    private BigInteger f52890id;
    @Key
    private List<HistoryLabelAdded> labelsAdded;
    @Key
    private List<HistoryLabelRemoved> labelsRemoved;
    @Key
    private List<Message> messages;
    @Key
    private List<HistoryMessageAdded> messagesAdded;
    @Key
    private List<HistoryMessageDeleted> messagesDeleted;

    /* renamed from: k */
    public History mo60137e() {
        return (History) super.clone();
    }

    /* renamed from: l */
    public History mo60138f(String str, Object obj) {
        return (History) super.mo60078d(str, obj);
    }
}
