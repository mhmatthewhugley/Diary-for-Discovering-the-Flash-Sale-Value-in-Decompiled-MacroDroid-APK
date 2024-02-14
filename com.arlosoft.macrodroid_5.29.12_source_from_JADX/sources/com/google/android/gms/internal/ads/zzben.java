package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzben {

    /* renamed from: a */
    private final InputStream f26706a;

    /* renamed from: b */
    private final boolean f26707b;

    /* renamed from: c */
    private final boolean f26708c;

    /* renamed from: d */
    private final long f26709d;

    /* renamed from: e */
    private final boolean f26710e;

    private zzben(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f26706a = inputStream;
        this.f26707b = z;
        this.f26708c = z2;
        this.f26709d = j;
        this.f26710e = z3;
    }

    /* renamed from: b */
    public static zzben m43234b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new zzben(inputStream, z, z2, j, z3);
    }

    /* renamed from: a */
    public final long mo42544a() {
        return this.f26709d;
    }

    /* renamed from: c */
    public final InputStream mo42545c() {
        return this.f26706a;
    }

    /* renamed from: d */
    public final boolean mo42546d() {
        return this.f26707b;
    }

    /* renamed from: e */
    public final boolean mo42547e() {
        return this.f26710e;
    }

    /* renamed from: f */
    public final boolean mo42548f() {
        return this.f26708c;
    }
}
