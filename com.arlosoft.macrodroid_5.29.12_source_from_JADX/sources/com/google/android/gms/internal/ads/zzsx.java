package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzsx implements zztz {

    /* renamed from: a */
    private final zztz f38452a;

    /* renamed from: b */
    private final long f38453b;

    public zzsx(zztz zztz, long j) {
        this.f38452a = zztz;
        this.f38453b = j;
    }

    /* renamed from: a */
    public final int mo48123a(zzjg zzjg, zzgi zzgi, int i) {
        int a = this.f38452a.mo48123a(zzjg, zzgi, i);
        if (a != -4) {
            return a;
        }
        zzgi.f36863e = Math.max(0, zzgi.f36863e + this.f38453b);
        return -4;
    }

    /* renamed from: b */
    public final boolean mo48124b() {
        return this.f38452a.mo48124b();
    }

    /* renamed from: c */
    public final int mo48125c(long j) {
        return this.f38452a.mo48125c(j - this.f38453b);
    }

    /* renamed from: d */
    public final void mo48126d() throws IOException {
        this.f38452a.mo48126d();
    }

    /* renamed from: e */
    public final zztz mo48187e() {
        return this.f38452a;
    }
}
