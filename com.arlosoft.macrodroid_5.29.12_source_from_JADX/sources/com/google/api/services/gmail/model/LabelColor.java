package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class LabelColor extends GenericJson {
    @Key
    private String backgroundColor;
    @Key
    private String textColor;

    /* renamed from: k */
    public LabelColor mo60137e() {
        return (LabelColor) super.clone();
    }

    /* renamed from: l */
    public LabelColor mo60138f(String str, Object obj) {
        return (LabelColor) super.mo60078d(str, obj);
    }
}
