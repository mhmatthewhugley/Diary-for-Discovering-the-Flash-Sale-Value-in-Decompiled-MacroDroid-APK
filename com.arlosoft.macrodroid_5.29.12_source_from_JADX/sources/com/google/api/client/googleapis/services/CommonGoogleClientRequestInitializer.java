package com.google.api.client.googleapis.services;

import java.io.IOException;

public class CommonGoogleClientRequestInitializer implements GoogleClientRequestInitializer {

    /* renamed from: a */
    private final String f52376a;

    /* renamed from: b */
    private final String f52377b;

    public CommonGoogleClientRequestInitializer() {
        this((String) null);
    }

    /* renamed from: a */
    public void mo60322a(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        String str = this.f52376a;
        if (str != null) {
            abstractGoogleClientRequest.put("key", str);
        }
        String str2 = this.f52377b;
        if (str2 != null) {
            abstractGoogleClientRequest.put("userIp", str2);
        }
    }

    public CommonGoogleClientRequestInitializer(String str) {
        this(str, (String) null);
    }

    public CommonGoogleClientRequestInitializer(String str, String str2) {
        this.f52376a = str;
        this.f52377b = str2;
    }
}
