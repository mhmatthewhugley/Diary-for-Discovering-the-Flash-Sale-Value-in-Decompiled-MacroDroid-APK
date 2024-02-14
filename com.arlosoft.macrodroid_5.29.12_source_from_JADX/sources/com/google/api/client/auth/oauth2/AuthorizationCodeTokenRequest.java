package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

public class AuthorizationCodeTokenRequest extends TokenRequest {
    @Key
    private String code;
    @Key("redirect_uri")
    private String redirectUri;

    /* renamed from: o */
    public AuthorizationCodeTokenRequest mo60083g(String str, Object obj) {
        return (AuthorizationCodeTokenRequest) super.mo60078d(str, obj);
    }

    /* renamed from: p */
    public AuthorizationCodeTokenRequest mo60084k(String str) {
        return (AuthorizationCodeTokenRequest) super.mo60084k(str);
    }

    /* renamed from: q */
    public AuthorizationCodeTokenRequest mo60085n(GenericUrl genericUrl) {
        return (AuthorizationCodeTokenRequest) super.mo60085n(genericUrl);
    }
}
