package com.google.api.client.http;

import java.io.IOException;
import org.apache.http.client.methods.HttpPut;

public final class HttpRequestFactory {

    /* renamed from: a */
    private final HttpTransport f52461a;

    /* renamed from: b */
    private final HttpRequestInitializer f52462b;

    HttpRequestFactory(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.f52461a = httpTransport;
        this.f52462b = httpRequestInitializer;
    }

    /* renamed from: a */
    public HttpRequest mo60444a(GenericUrl genericUrl) throws IOException {
        return mo60447d("GET", genericUrl, (HttpContent) null);
    }

    /* renamed from: b */
    public HttpRequest mo60445b(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return mo60447d("POST", genericUrl, httpContent);
    }

    /* renamed from: c */
    public HttpRequest mo60446c(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return mo60447d(HttpPut.METHOD_NAME, genericUrl, httpContent);
    }

    /* renamed from: d */
    public HttpRequest mo60447d(String str, GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        HttpRequest a = this.f52461a.mo60466a();
        HttpRequestInitializer httpRequestInitializer = this.f52462b;
        if (httpRequestInitializer != null) {
            httpRequestInitializer.mo60067c(a);
        }
        a.mo60438w(str);
        if (genericUrl != null) {
            a.mo60415A(genericUrl);
        }
        if (httpContent != null) {
            a.mo60433r(httpContent);
        }
        return a;
    }
}
