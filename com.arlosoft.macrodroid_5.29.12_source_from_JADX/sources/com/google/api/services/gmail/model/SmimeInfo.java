package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonString;
import com.google.api.client.util.Key;

public final class SmimeInfo extends GenericJson {
    @Key
    private String encryptedKeyPassword;
    @JsonString
    @Key
    private Long expiration;
    @Key

    /* renamed from: id */
    private String f52893id;
    @Key
    private Boolean isDefault;
    @Key
    private String issuerCn;
    @Key
    private String pem;
    @Key
    private String pkcs12;

    /* renamed from: k */
    public SmimeInfo mo60137e() {
        return (SmimeInfo) super.clone();
    }

    /* renamed from: l */
    public SmimeInfo mo60138f(String str, Object obj) {
        return (SmimeInfo) super.mo60078d(str, obj);
    }
}
