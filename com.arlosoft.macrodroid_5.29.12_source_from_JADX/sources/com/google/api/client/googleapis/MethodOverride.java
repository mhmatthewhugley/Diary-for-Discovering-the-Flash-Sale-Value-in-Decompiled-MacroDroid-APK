package com.google.api.client.googleapis;

import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.UrlEncodedContent;
import java.io.IOException;

public final class MethodOverride implements HttpExecuteInterceptor, HttpRequestInitializer {

    /* renamed from: a */
    private final boolean f52233a;

    public static final class Builder {
    }

    public MethodOverride() {
        this(false);
    }

    /* renamed from: a */
    private boolean m71687a(HttpRequest httpRequest) throws IOException {
        String i = httpRequest.mo60424i();
        if (i.equals("POST")) {
            return false;
        }
        if (!i.equals("GET") ? !this.f52233a : httpRequest.mo60430o().mo60360h().length() <= 2048) {
            return !httpRequest.mo60428m().mo60469e(i);
        }
        return true;
    }

    /* renamed from: b */
    public void mo60066b(HttpRequest httpRequest) throws IOException {
        if (m71687a(httpRequest)) {
            String i = httpRequest.mo60424i();
            httpRequest.mo60438w("POST");
            httpRequest.mo60420e().mo60078d("X-HTTP-Method-Override", i);
            if (i.equals("GET")) {
                httpRequest.mo60433r(new UrlEncodedContent(httpRequest.mo60430o().clone()));
                httpRequest.mo60430o().clear();
            } else if (httpRequest.mo60417b() == null) {
                httpRequest.mo60433r(new EmptyContent());
            }
        }
    }

    /* renamed from: c */
    public void mo60067c(HttpRequest httpRequest) {
        httpRequest.mo60436u(this);
    }

    MethodOverride(boolean z) {
        this.f52233a = z;
    }
}
