package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzecg implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33675a;

    /* renamed from: b */
    private final zzgxv f33676b;

    /* renamed from: c */
    private final zzgxv f33677c;

    /* renamed from: d */
    private final zzgxv f33678d;

    public zzecg(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4) {
        this.f33675a = zzgxv;
        this.f33676b = zzgxv2;
        this.f33677c = zzgxv3;
        this.f33678d = zzgxv4;
    }

    /* renamed from: a */
    public final zzecf zzb() {
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        return new zzecf((ScheduledExecutorService) this.f33675a.zzb(), zzfzq, ((zzecx) this.f33677c).zzb(), zzgxh.m53645a(this.f33678d));
    }
}
