package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class ForwardingAddress extends GenericJson {
    @Key
    private String forwardingEmail;
    @Key
    private String verificationStatus;

    /* renamed from: k */
    public ForwardingAddress mo60137e() {
        return (ForwardingAddress) super.clone();
    }

    /* renamed from: l */
    public ForwardingAddress mo60138f(String str, Object obj) {
        return (ForwardingAddress) super.mo60078d(str, obj);
    }
}
