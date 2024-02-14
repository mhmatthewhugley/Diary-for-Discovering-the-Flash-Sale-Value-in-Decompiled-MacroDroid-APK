package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.IOException;

public abstract class LowLevelHttpRequest {

    /* renamed from: a */
    private long f52485a = -1;

    /* renamed from: b */
    private String f52486b;

    /* renamed from: c */
    private String f52487c;

    /* renamed from: d */
    private StreamingContent f52488d;

    /* renamed from: a */
    public abstract void mo60255a(String str, String str2) throws IOException;

    /* renamed from: b */
    public abstract LowLevelHttpResponse mo60256b() throws IOException;

    /* renamed from: c */
    public final String mo60474c() {
        return this.f52486b;
    }

    /* renamed from: d */
    public final long mo60475d() {
        return this.f52485a;
    }

    /* renamed from: e */
    public final String mo60476e() {
        return this.f52487c;
    }

    /* renamed from: f */
    public final StreamingContent mo60477f() {
        return this.f52488d;
    }

    /* renamed from: g */
    public final void mo60478g(String str) throws IOException {
        this.f52486b = str;
    }

    /* renamed from: h */
    public final void mo60479h(long j) throws IOException {
        this.f52485a = j;
    }

    /* renamed from: i */
    public final void mo60480i(String str) throws IOException {
        this.f52487c = str;
    }

    /* renamed from: j */
    public final void mo60481j(StreamingContent streamingContent) throws IOException {
        this.f52488d = streamingContent;
    }

    /* renamed from: k */
    public void mo60482k(int i, int i2) throws IOException {
    }
}
