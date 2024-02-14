package com.google.api.client.http;

import com.google.api.client.util.Charsets;
import com.google.api.client.util.IOUtils;
import java.io.IOException;
import java.nio.charset.Charset;

public abstract class AbstractHttpContent implements HttpContent {

    /* renamed from: a */
    private HttpMediaType f52395a;

    /* renamed from: b */
    private long f52396b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected AbstractHttpContent(String str) {
        this(str == null ? null : new HttpMediaType(str));
    }

    /* renamed from: d */
    public static long m71954d(HttpContent httpContent) throws IOException {
        if (!httpContent.mo60338a()) {
            return -1;
        }
        return IOUtils.m72692a(httpContent);
    }

    /* renamed from: a */
    public boolean mo60338a() {
        return true;
    }

    /* renamed from: b */
    public long mo60339b() throws IOException {
        if (this.f52396b == -1) {
            this.f52396b = mo60340c();
        }
        return this.f52396b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo60340c() throws IOException {
        return m71954d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Charset mo60341e() {
        HttpMediaType httpMediaType = this.f52395a;
        return (httpMediaType == null || httpMediaType.mo60403e() == null) ? Charsets.f52746a : this.f52395a.mo60403e();
    }

    /* renamed from: f */
    public final HttpMediaType mo60342f() {
        return this.f52395a;
    }

    public String getType() {
        HttpMediaType httpMediaType = this.f52395a;
        if (httpMediaType == null) {
            return null;
        }
        return httpMediaType.mo60401a();
    }

    protected AbstractHttpContent(HttpMediaType httpMediaType) {
        this.f52396b = -1;
        this.f52395a = httpMediaType;
    }
}
