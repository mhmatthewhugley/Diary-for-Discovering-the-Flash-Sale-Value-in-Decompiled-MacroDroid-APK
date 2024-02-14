package com.google.api.client.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public class TokenErrorResponse extends GenericJson {
    @Key
    private String error;
    @Key("error_description")
    private String errorDescription;
    @Key("error_uri")
    private String errorUri;

    /* renamed from: k */
    public TokenErrorResponse mo60137e() {
        return (TokenErrorResponse) super.clone();
    }

    /* renamed from: l */
    public TokenErrorResponse mo60138f(String str, Object obj) {
        return (TokenErrorResponse) super.mo60078d(str, obj);
    }
}
