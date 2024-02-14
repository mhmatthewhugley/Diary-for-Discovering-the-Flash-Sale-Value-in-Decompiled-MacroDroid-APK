package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.util.Key;

public class GoogleTokenResponse extends TokenResponse {
    @Key("id_token")
    private String idToken;

    /* renamed from: r */
    public GoogleTokenResponse mo60145k() {
        return (GoogleTokenResponse) super.mo60137e();
    }

    /* renamed from: s */
    public GoogleTokenResponse mo60149p(String str, Object obj) {
        return (GoogleTokenResponse) super.mo60138f(str, obj);
    }

    /* renamed from: t */
    public GoogleTokenResponse mo60150q(String str) {
        return (GoogleTokenResponse) super.mo60150q(str);
    }
}
