package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.RefreshTokenRequest;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import java.io.IOException;

public class GoogleRefreshTokenRequest extends RefreshTokenRequest {
    /* renamed from: A */
    public GoogleRefreshTokenRequest mo60126s(HttpRequestInitializer httpRequestInitializer) {
        return (GoogleRefreshTokenRequest) super.mo60126s(httpRequestInitializer);
    }

    /* renamed from: B */
    public GoogleRefreshTokenRequest mo60127t(GenericUrl genericUrl) {
        return (GoogleRefreshTokenRequest) super.mo60085n(genericUrl);
    }

    /* renamed from: u */
    public GoogleTokenResponse mo60141e() throws IOException {
        return (GoogleTokenResponse) mo60142f().mo60458l(GoogleTokenResponse.class);
    }

    /* renamed from: v */
    public GoogleRefreshTokenRequest mo60122o(String str, Object obj) {
        return (GoogleRefreshTokenRequest) super.mo60083g(str, obj);
    }

    /* renamed from: x */
    public GoogleRefreshTokenRequest mo60123p(HttpExecuteInterceptor httpExecuteInterceptor) {
        return (GoogleRefreshTokenRequest) super.mo60123p(httpExecuteInterceptor);
    }

    /* renamed from: y */
    public GoogleRefreshTokenRequest mo60124q(String str) {
        return (GoogleRefreshTokenRequest) super.mo60084k(str);
    }

    /* renamed from: z */
    public GoogleRefreshTokenRequest mo60125r(String str) {
        return (GoogleRefreshTokenRequest) super.mo60125r(str);
    }
}
