package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class ModifyThreadRequest extends GenericJson {
    @Key
    private List<String> addLabelIds;
    @Key
    private List<String> removeLabelIds;

    /* renamed from: k */
    public ModifyThreadRequest mo60137e() {
        return (ModifyThreadRequest) super.clone();
    }

    /* renamed from: l */
    public ModifyThreadRequest mo60138f(String str, Object obj) {
        return (ModifyThreadRequest) super.mo60078d(str, obj);
    }
}
