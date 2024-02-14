package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class ByteArrayContent extends AbstractInputStreamContent {

    /* renamed from: c */
    private final byte[] f52401c;

    /* renamed from: d */
    private final int f52402d;

    /* renamed from: e */
    private final int f52403e;

    public ByteArrayContent(String str, byte[] bArr, int i, int i2) {
        super(str);
        this.f52401c = (byte[]) Preconditions.m72716d(bArr);
        Preconditions.m72715c(i >= 0 && i2 >= 0 && i + i2 <= bArr.length, "offset %s, length %s, array length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length));
        this.f52402d = i;
        this.f52403e = i2;
    }

    /* renamed from: a */
    public boolean mo60338a() {
        return true;
    }

    /* renamed from: b */
    public long mo60339b() {
        return (long) this.f52403e;
    }

    /* renamed from: d */
    public InputStream mo60345d() {
        return new ByteArrayInputStream(this.f52401c, this.f52402d, this.f52403e);
    }

    /* renamed from: g */
    public ByteArrayContent mo60347f(String str) {
        return (ByteArrayContent) super.mo60347f(str);
    }
}
