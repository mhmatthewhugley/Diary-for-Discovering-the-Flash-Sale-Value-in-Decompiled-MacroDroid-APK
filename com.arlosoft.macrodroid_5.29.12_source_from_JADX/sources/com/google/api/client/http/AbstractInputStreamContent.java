package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class AbstractInputStreamContent implements HttpContent {

    /* renamed from: a */
    private String f52397a;

    /* renamed from: b */
    private boolean f52398b = true;

    public AbstractInputStreamContent(String str) {
        mo60347f(str);
    }

    /* renamed from: c */
    public final boolean mo60344c() {
        return this.f52398b;
    }

    /* renamed from: d */
    public abstract InputStream mo60345d() throws IOException;

    /* renamed from: e */
    public AbstractInputStreamContent mo60346e(boolean z) {
        this.f52398b = z;
        return this;
    }

    /* renamed from: f */
    public AbstractInputStreamContent mo60347f(String str) {
        this.f52397a = str;
        return this;
    }

    public String getType() {
        return this.f52397a;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        IOUtils.m72694c(mo60345d(), outputStream, this.f52398b);
        outputStream.flush();
    }
}
