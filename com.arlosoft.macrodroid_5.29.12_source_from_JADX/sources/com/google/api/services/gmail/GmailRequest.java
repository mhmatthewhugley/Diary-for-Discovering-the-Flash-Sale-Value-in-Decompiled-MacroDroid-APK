package com.google.api.services.gmail;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.util.Key;

public abstract class GmailRequest<T> extends AbstractGoogleJsonClientRequest<T> {
    @Key
    private String alt;
    @Key
    private String fields;
    @Key
    private String key;
    @Key("oauth_token")
    private String oauthToken;
    @Key
    private Boolean prettyPrint;
    @Key
    private String quotaUser;
    @Key
    private String userIp;

    public GmailRequest(Gmail gmail, String str, String str2, Object obj, Class<T> cls) {
        super(gmail, str, str2, obj, cls);
    }

    /* renamed from: t */
    public final Gmail mo60328q() {
        return (Gmail) super.mo60318n();
    }

    /* renamed from: u */
    public GmailRequest<T> mo60330s(String str, Object obj) {
        return (GmailRequest) super.mo60320p(str, obj);
    }
}
