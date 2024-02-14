package com.google.api.client.http.apache;

import com.google.api.client.util.Preconditions;
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

final class HttpExtensionMethod extends HttpEntityEnclosingRequestBase {

    /* renamed from: a */
    private final String f52516a;

    public HttpExtensionMethod(String str, String str2) {
        this.f52516a = (String) Preconditions.m72716d(str);
        setURI(URI.create(str2));
    }

    public String getMethod() {
        return this.f52516a;
    }
}
