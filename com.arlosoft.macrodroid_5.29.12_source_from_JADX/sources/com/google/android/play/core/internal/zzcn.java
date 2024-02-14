package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzcn extends zzcm {

    /* renamed from: a */
    private final zzcm f51707a;

    /* renamed from: c */
    private final long f51708c;

    /* renamed from: d */
    private final long f51709d;

    public zzcn(zzcm zzcm, long j, long j2) {
        this.f51707a = zzcm;
        long f = m70938f(j);
        this.f51708c = f;
        this.f51709d = m70938f(f + j2);
    }

    /* renamed from: f */
    private final long m70938f(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f51707a.mo59655b() ? this.f51707a.mo59655b() : j;
    }

    /* renamed from: b */
    public final long mo59655b() {
        return this.f51709d - this.f51708c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final InputStream mo59656c(long j, long j2) throws IOException {
        long f = m70938f(this.f51708c);
        return this.f51707a.mo59656c(f, m70938f(j2 + f) - f);
    }

    public final void close() throws IOException {
    }
}
