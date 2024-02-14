package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzddp implements zzgxi {

    /* renamed from: a */
    private final zzgxv f32169a;

    /* renamed from: b */
    private final zzgxv f32170b;

    /* renamed from: c */
    private final zzgxv f32171c;

    /* renamed from: d */
    private final zzgxv f32172d;

    public zzddp(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4) {
        this.f32169a = zzgxv;
        this.f32170b = zzgxv2;
        this.f32171c = zzgxv3;
        this.f32172d = zzgxv4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzddm a = ((zzddo) this.f32169a).zzb();
        Set b = ((zzgxt) this.f32170b).zzb();
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        return new zzddn(a, b, zzfzq, (ScheduledExecutorService) this.f32172d.zzb());
    }
}
