package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

public class AuthorizationRequestUrl extends GenericUrl {
    @Key("client_id")
    private String clientId;
    @Key("redirect_uri")
    private String redirectUri;
    @Key("response_type")
    private String responseTypes;
    @Key("scope")
    private String scopes;
    @Key
    private String state;

    /* renamed from: E */
    public AuthorizationRequestUrl mo60079n() {
        return (AuthorizationRequestUrl) super.clone();
    }

    /* renamed from: G */
    public AuthorizationRequestUrl mo60080u(String str, Object obj) {
        return (AuthorizationRequestUrl) super.mo60078d(str, obj);
    }
}
