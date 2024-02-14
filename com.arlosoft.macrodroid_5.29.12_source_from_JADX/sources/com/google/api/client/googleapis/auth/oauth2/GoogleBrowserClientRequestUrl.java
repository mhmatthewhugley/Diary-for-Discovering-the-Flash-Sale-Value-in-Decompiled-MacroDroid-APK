package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.BrowserClientRequestUrl;
import com.google.api.client.util.Key;

public class GoogleBrowserClientRequestUrl extends BrowserClientRequestUrl {
    @Key("approval_prompt")
    private String approvalPrompt;

    /* renamed from: L */
    public GoogleBrowserClientRequestUrl mo60079n() {
        return (GoogleBrowserClientRequestUrl) super.mo60079n();
    }

    /* renamed from: M */
    public GoogleBrowserClientRequestUrl mo60080u(String str, Object obj) {
        return (GoogleBrowserClientRequestUrl) super.mo60080u(str, obj);
    }
}
