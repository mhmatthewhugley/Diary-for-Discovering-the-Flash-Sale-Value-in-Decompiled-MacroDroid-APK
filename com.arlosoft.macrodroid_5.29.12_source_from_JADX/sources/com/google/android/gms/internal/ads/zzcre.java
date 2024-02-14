package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcre implements zzdyq {

    /* renamed from: a */
    private final zzcpw f30607a;

    /* renamed from: b */
    private final zzcrk f30608b;

    /* renamed from: c */
    private Long f30609c;

    /* renamed from: d */
    private String f30610d;

    /* synthetic */ zzcre(zzcpw zzcpw, zzcrk zzcrk, zzcrd zzcrd) {
        this.f30607a = zzcpw;
        this.f30608b = zzcrk;
    }

    /* renamed from: a */
    public final zzdyr mo44313a() {
        zzgxq.m53659c(this.f30609c, Long.class);
        zzgxq.m53659c(this.f30610d, String.class);
        return new zzcrg(this.f30607a, this.f30608b, this.f30609c, this.f30610d, (zzcrf) null);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ zzdyq mo44314c(long j) {
        this.f30609c = Long.valueOf(j);
        return this;
    }

    /* renamed from: o */
    public final /* synthetic */ zzdyq mo44315o(String str) {
        Objects.requireNonNull(str);
        this.f30610d = str;
        return this;
    }
}
