package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class BatchModifyMessagesRequest extends GenericJson {
    @Key
    private List<String> addLabelIds;
    @Key
    private List<String> ids;
    @Key
    private List<String> removeLabelIds;

    /* renamed from: k */
    public BatchModifyMessagesRequest mo60137e() {
        return (BatchModifyMessagesRequest) super.clone();
    }

    /* renamed from: l */
    public BatchModifyMessagesRequest mo60138f(String str, Object obj) {
        return (BatchModifyMessagesRequest) super.mo60078d(str, obj);
    }
}
