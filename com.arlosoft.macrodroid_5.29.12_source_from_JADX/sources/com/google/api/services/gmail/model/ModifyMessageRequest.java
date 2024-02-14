package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class ModifyMessageRequest extends GenericJson {
    @Key
    private List<String> addLabelIds;
    @Key
    private List<String> removeLabelIds;

    /* renamed from: k */
    public ModifyMessageRequest mo60137e() {
        return (ModifyMessageRequest) super.clone();
    }

    /* renamed from: l */
    public ModifyMessageRequest mo60138f(String str, Object obj) {
        return (ModifyMessageRequest) super.mo60078d(str, obj);
    }
}
