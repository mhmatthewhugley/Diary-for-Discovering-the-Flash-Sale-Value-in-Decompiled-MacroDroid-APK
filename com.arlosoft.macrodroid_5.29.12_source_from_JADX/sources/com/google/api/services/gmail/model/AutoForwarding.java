package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class AutoForwarding extends GenericJson {
    @Key
    private String disposition;
    @Key
    private String emailAddress;
    @Key
    private Boolean enabled;

    /* renamed from: k */
    public AutoForwarding mo60137e() {
        return (AutoForwarding) super.clone();
    }

    /* renamed from: l */
    public AutoForwarding mo60138f(String str, Object obj) {
        return (AutoForwarding) super.mo60078d(str, obj);
    }
}
