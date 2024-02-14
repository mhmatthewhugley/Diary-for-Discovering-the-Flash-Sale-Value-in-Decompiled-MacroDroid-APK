package com.google.api.client.json;

import com.google.api.client.util.Charsets;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;

public abstract class JsonFactory {
    /* renamed from: h */
    private ByteArrayOutputStream m72239h(Object obj, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JsonGenerator a = mo60171a(byteArrayOutputStream, Charsets.f52746a);
        if (z) {
            a.mo60177a();
        }
        a.mo60525c(obj);
        a.mo60178b();
        return byteArrayOutputStream;
    }

    /* renamed from: k */
    private String m72240k(Object obj, boolean z) throws IOException {
        return m72239h(obj, z).toString("UTF-8");
    }

    /* renamed from: a */
    public abstract JsonGenerator mo60171a(OutputStream outputStream, Charset charset) throws IOException;

    /* renamed from: b */
    public abstract JsonParser mo60172b(InputStream inputStream) throws IOException;

    /* renamed from: c */
    public abstract JsonParser mo60173c(InputStream inputStream, Charset charset) throws IOException;

    /* renamed from: d */
    public abstract JsonParser mo60174d(Reader reader) throws IOException;

    /* renamed from: e */
    public abstract JsonParser mo60175e(String str) throws IOException;

    /* renamed from: f */
    public final <T> T mo60521f(InputStream inputStream, Class<T> cls) throws IOException {
        return mo60172b(inputStream).mo60536t(cls);
    }

    /* renamed from: g */
    public final byte[] mo60522g(Object obj) throws IOException {
        return m72239h(obj, false).toByteArray();
    }

    /* renamed from: i */
    public final String mo60523i(Object obj) throws IOException {
        return m72240k(obj, true);
    }

    /* renamed from: j */
    public final String mo60524j(Object obj) throws IOException {
        return m72240k(obj, false);
    }
}
