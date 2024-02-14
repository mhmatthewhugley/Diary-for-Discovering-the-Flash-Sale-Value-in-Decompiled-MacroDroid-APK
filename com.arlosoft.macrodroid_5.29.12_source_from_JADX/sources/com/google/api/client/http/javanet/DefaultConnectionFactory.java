package com.google.api.client.http.javanet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public class DefaultConnectionFactory implements ConnectionFactory {

    /* renamed from: a */
    private final Proxy f52518a;

    public DefaultConnectionFactory() {
        this((Proxy) null);
    }

    /* renamed from: a */
    public HttpURLConnection mo60508a(URL url) throws IOException {
        Proxy proxy = this.f52518a;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }

    public DefaultConnectionFactory(Proxy proxy) {
        this.f52518a = proxy;
    }
}
