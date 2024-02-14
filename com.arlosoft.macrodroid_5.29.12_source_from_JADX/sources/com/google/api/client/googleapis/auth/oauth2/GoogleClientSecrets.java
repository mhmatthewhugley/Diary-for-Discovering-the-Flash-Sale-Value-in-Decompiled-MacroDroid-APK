package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

public final class GoogleClientSecrets extends GenericJson {
    @Key
    private Details installed;
    @Key
    private Details web;

    public static final class Details extends GenericJson {
        @Key("auth_uri")
        private String authUri;
        @Key("client_id")
        private String clientId;
        @Key("client_secret")
        private String clientSecret;
        @Key("redirect_uris")
        private List<String> redirectUris;
        @Key("token_uri")
        private String tokenUri;

        /* renamed from: k */
        public Details mo60137e() {
            return (Details) super.clone();
        }

        /* renamed from: l */
        public Details mo60138f(String str, Object obj) {
            return (Details) super.mo60078d(str, obj);
        }
    }

    /* renamed from: k */
    public GoogleClientSecrets mo60137e() {
        return (GoogleClientSecrets) super.clone();
    }

    /* renamed from: l */
    public GoogleClientSecrets mo60138f(String str, Object obj) {
        return (GoogleClientSecrets) super.mo60078d(str, obj);
    }
}
