package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;

public class TokenResponse extends GenericJson {
    @Key("access_token")
    private String accessToken;
    @Key("expires_in")
    private Long expiresInSeconds;
    @Key("refresh_token")
    private String refreshToken;
    @Key
    private String scope;
    @Key("token_type")
    private String tokenType;

    /* renamed from: k */
    public TokenResponse mo60137e() {
        return (TokenResponse) super.clone();
    }

    /* renamed from: l */
    public final String mo60146l() {
        return this.accessToken;
    }

    /* renamed from: n */
    public final Long mo60147n() {
        return this.expiresInSeconds;
    }

    /* renamed from: o */
    public final String mo60148o() {
        return this.refreshToken;
    }

    /* renamed from: p */
    public TokenResponse mo60138f(String str, Object obj) {
        return (TokenResponse) super.mo60078d(str, obj);
    }

    /* renamed from: q */
    public TokenResponse mo60150q(String str) {
        this.accessToken = (String) Preconditions.m72716d(str);
        return this;
    }
}
