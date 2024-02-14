package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzca {

    /* renamed from: a */
    private final zzy f28038a = new zzy();

    /* renamed from: a */
    public final zzca mo43241a(int i) {
        this.f28038a.mo48419a(i);
        return this;
    }

    /* renamed from: b */
    public final zzca mo43242b(zzcc zzcc) {
        zzy zzy = this.f28038a;
        zzaa a = zzcc.f28206a;
        for (int i = 0; i < a.mo41189b(); i++) {
            zzy.mo48419a(a.mo41188a(i));
        }
        return this;
    }

    /* renamed from: c */
    public final zzca mo43243c(int... iArr) {
        zzy zzy = this.f28038a;
        for (int i = 0; i < 21; i++) {
            zzy.mo48419a(iArr[i]);
        }
        return this;
    }

    /* renamed from: d */
    public final zzca mo43244d(int i, boolean z) {
        zzy zzy = this.f28038a;
        if (z) {
            zzy.mo48419a(i);
        }
        return this;
    }

    /* renamed from: e */
    public final zzcc mo43245e() {
        return new zzcc(this.f28038a.mo48420b(), (zzcb) null);
    }
}
