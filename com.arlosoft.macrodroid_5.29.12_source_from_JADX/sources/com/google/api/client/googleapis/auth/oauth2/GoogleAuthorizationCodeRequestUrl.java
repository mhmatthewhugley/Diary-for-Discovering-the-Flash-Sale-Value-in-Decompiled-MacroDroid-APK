package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeRequestUrl;
import com.google.api.client.util.Key;

public class GoogleAuthorizationCodeRequestUrl extends AuthorizationCodeRequestUrl {
    @Key("access_type")
    private String accessType;
    @Key("approval_prompt")
    private String approvalPrompt;

    /* renamed from: L */
    public GoogleAuthorizationCodeRequestUrl mo60079n() {
        return (GoogleAuthorizationCodeRequestUrl) super.mo60079n();
    }

    /* renamed from: M */
    public GoogleAuthorizationCodeRequestUrl mo60080u(String str, Object obj) {
        return (GoogleAuthorizationCodeRequestUrl) super.mo60080u(str, obj);
    }
}
