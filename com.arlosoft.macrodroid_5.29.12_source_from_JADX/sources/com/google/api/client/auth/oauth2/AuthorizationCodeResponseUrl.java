package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

public class AuthorizationCodeResponseUrl extends GenericUrl {
    @Key
    private String code;
    @Key
    private String error;
    @Key("error_description")
    private String errorDescription;
    @Key("error_uri")
    private String errorUri;
    @Key
    private String state;

    /* renamed from: E */
    public AuthorizationCodeResponseUrl mo60079n() {
        return (AuthorizationCodeResponseUrl) super.clone();
    }

    /* renamed from: G */
    public AuthorizationCodeResponseUrl mo60080u(String str, Object obj) {
        return (AuthorizationCodeResponseUrl) super.mo60078d(str, obj);
    }
}
