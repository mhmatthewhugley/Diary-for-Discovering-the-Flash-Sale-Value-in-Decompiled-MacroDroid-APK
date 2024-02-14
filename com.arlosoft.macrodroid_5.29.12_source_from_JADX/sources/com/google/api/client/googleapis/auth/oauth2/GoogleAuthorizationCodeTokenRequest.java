package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.http.GenericUrl;
import java.io.IOException;

public class GoogleAuthorizationCodeTokenRequest extends AuthorizationCodeTokenRequest {
    /* renamed from: r */
    public GoogleTokenResponse mo60141e() throws IOException {
        return (GoogleTokenResponse) mo60142f().mo60458l(GoogleTokenResponse.class);
    }

    /* renamed from: s */
    public GoogleAuthorizationCodeTokenRequest mo60086o(String str, Object obj) {
        return (GoogleAuthorizationCodeTokenRequest) super.mo60083g(str, obj);
    }

    /* renamed from: t */
    public GoogleAuthorizationCodeTokenRequest mo60087p(String str) {
        return (GoogleAuthorizationCodeTokenRequest) super.mo60084k(str);
    }

    /* renamed from: u */
    public GoogleAuthorizationCodeTokenRequest mo60088q(GenericUrl genericUrl) {
        return (GoogleAuthorizationCodeTokenRequest) super.mo60085n(genericUrl);
    }
}
