package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class PopSettings extends GenericJson {
    @Key
    private String accessWindow;
    @Key
    private String disposition;

    /* renamed from: k */
    public PopSettings mo60137e() {
        return (PopSettings) super.clone();
    }

    /* renamed from: l */
    public PopSettings mo60138f(String str, Object obj) {
        return (PopSettings) super.mo60078d(str, obj);
    }
}
