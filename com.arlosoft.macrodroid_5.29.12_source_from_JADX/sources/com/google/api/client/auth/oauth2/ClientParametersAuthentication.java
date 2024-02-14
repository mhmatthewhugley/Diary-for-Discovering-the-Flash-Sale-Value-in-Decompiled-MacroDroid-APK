package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import java.io.IOException;
import java.util.Map;

public class ClientParametersAuthentication implements HttpRequestInitializer, HttpExecuteInterceptor {

    /* renamed from: a */
    private final String f52174a;

    /* renamed from: b */
    private final String f52175b;

    /* renamed from: b */
    public void mo60066b(HttpRequest httpRequest) throws IOException {
        Map<String, Object> f = Data.m72655f(UrlEncodedContent.m72180h(httpRequest).mo60495i());
        f.put("client_id", this.f52174a);
        String str = this.f52175b;
        if (str != null) {
            f.put("client_secret", str);
        }
    }

    /* renamed from: c */
    public void mo60067c(HttpRequest httpRequest) throws IOException {
        httpRequest.mo60436u(this);
    }
}
