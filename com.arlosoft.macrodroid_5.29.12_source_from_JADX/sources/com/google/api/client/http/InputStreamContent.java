package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.InputStream;

public final class InputStreamContent extends AbstractInputStreamContent {

    /* renamed from: c */
    private long f52482c = -1;

    /* renamed from: d */
    private boolean f52483d;

    /* renamed from: e */
    private final InputStream f52484e;

    public InputStreamContent(String str, InputStream inputStream) {
        super(str);
        this.f52484e = (InputStream) Preconditions.m72716d(inputStream);
    }

    /* renamed from: a */
    public boolean mo60338a() {
        return this.f52483d;
    }

    /* renamed from: b */
    public long mo60339b() {
        return this.f52482c;
    }

    /* renamed from: d */
    public InputStream mo60345d() {
        return this.f52484e;
    }

    /* renamed from: g */
    public InputStreamContent mo60470g(boolean z) {
        return (InputStreamContent) super.mo60346e(z);
    }

    /* renamed from: h */
    public InputStreamContent mo60471h(long j) {
        this.f52482c = j;
        return this;
    }

    /* renamed from: i */
    public InputStreamContent mo60472i(boolean z) {
        this.f52483d = z;
        return this;
    }

    /* renamed from: j */
    public InputStreamContent mo60347f(String str) {
        return (InputStreamContent) super.mo60347f(str);
    }
}
