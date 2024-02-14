package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

public class PasswordTokenRequest extends TokenRequest {
    @Key
    private String password;
    @Key
    private String username;

    /* renamed from: o */
    public PasswordTokenRequest mo60083g(String str, Object obj) {
        return (PasswordTokenRequest) super.mo60078d(str, obj);
    }

    /* renamed from: p */
    public PasswordTokenRequest mo60084k(String str) {
        return (PasswordTokenRequest) super.mo60084k(str);
    }

    /* renamed from: q */
    public PasswordTokenRequest mo60085n(GenericUrl genericUrl) {
        return (PasswordTokenRequest) super.mo60085n(genericUrl);
    }
}
