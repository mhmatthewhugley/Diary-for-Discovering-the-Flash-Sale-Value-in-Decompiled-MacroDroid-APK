package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class SmtpMsa extends GenericJson {
    @Key
    private String host;
    @Key
    private String password;
    @Key
    private Integer port;
    @Key
    private String securityMode;
    @Key
    private String username;

    /* renamed from: k */
    public SmtpMsa mo60137e() {
        return (SmtpMsa) super.clone();
    }

    /* renamed from: l */
    public SmtpMsa mo60138f(String str, Object obj) {
        return (SmtpMsa) super.mo60078d(str, obj);
    }
}
