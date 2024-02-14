package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class FilterAction extends GenericJson {
    @Key
    private List<String> addLabelIds;
    @Key
    private String forward;
    @Key
    private List<String> removeLabelIds;

    /* renamed from: k */
    public FilterAction mo60137e() {
        return (FilterAction) super.clone();
    }

    /* renamed from: l */
    public FilterAction mo60138f(String str, Object obj) {
        return (FilterAction) super.mo60078d(str, obj);
    }
}
