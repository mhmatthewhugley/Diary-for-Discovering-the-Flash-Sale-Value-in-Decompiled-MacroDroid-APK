package com.google.api.client.auth.openidconnect;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Key;

@Beta
public class IdTokenResponse extends TokenResponse {
    @Key("id_token")
    private String idToken;

    /* renamed from: r */
    public IdTokenResponse mo60145k() {
        return (IdTokenResponse) super.mo60137e();
    }

    /* renamed from: s */
    public IdTokenResponse mo60149p(String str, Object obj) {
        return (IdTokenResponse) super.mo60138f(str, obj);
    }

    /* renamed from: t */
    public IdTokenResponse mo60150q(String str) {
        super.mo60150q(str);
        return this;
    }
}
