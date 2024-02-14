package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class BatchDeleteMessagesRequest extends GenericJson {
    @Key
    private List<String> ids;

    /* renamed from: k */
    public BatchDeleteMessagesRequest mo60137e() {
        return (BatchDeleteMessagesRequest) super.clone();
    }

    /* renamed from: l */
    public BatchDeleteMessagesRequest mo60138f(String str, Object obj) {
        return (BatchDeleteMessagesRequest) super.mo60078d(str, obj);
    }
}
