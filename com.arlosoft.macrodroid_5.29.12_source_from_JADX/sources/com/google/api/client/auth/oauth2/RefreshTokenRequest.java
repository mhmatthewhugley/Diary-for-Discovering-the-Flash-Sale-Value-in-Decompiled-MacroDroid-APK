package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;

public class RefreshTokenRequest extends TokenRequest {
    @Key("refresh_token")
    private String refreshToken;

    public RefreshTokenRequest(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        super(httpTransport, jsonFactory, genericUrl, "refresh_token");
        mo60125r(str);
    }

    /* renamed from: o */
    public RefreshTokenRequest mo60083g(String str, Object obj) {
        return (RefreshTokenRequest) super.mo60078d(str, obj);
    }

    /* renamed from: p */
    public RefreshTokenRequest mo60123p(HttpExecuteInterceptor httpExecuteInterceptor) {
        return (RefreshTokenRequest) super.mo60143h(httpExecuteInterceptor);
    }

    /* renamed from: q */
    public RefreshTokenRequest mo60084k(String str) {
        return (RefreshTokenRequest) super.mo60084k(str);
    }

    /* renamed from: r */
    public RefreshTokenRequest mo60125r(String str) {
        this.refreshToken = (String) Preconditions.m72716d(str);
        return this;
    }

    /* renamed from: s */
    public RefreshTokenRequest mo60126s(HttpRequestInitializer httpRequestInitializer) {
        return (RefreshTokenRequest) super.mo60144l(httpRequestInitializer);
    }

    /* renamed from: t */
    public RefreshTokenRequest mo60085n(GenericUrl genericUrl) {
        return (RefreshTokenRequest) super.mo60085n(genericUrl);
    }
}
