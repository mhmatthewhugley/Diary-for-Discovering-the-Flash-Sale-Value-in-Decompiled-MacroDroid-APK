package com.google.api.client.http;

import java.io.IOException;

public final class BasicAuthentication implements HttpRequestInitializer, HttpExecuteInterceptor {

    /* renamed from: a */
    private final String f52399a;

    /* renamed from: b */
    private final String f52400b;

    /* renamed from: b */
    public void mo60066b(HttpRequest httpRequest) throws IOException {
        httpRequest.mo60420e().mo60378D(this.f52399a, this.f52400b);
    }

    /* renamed from: c */
    public void mo60067c(HttpRequest httpRequest) throws IOException {
        httpRequest.mo60436u(this);
    }
}
