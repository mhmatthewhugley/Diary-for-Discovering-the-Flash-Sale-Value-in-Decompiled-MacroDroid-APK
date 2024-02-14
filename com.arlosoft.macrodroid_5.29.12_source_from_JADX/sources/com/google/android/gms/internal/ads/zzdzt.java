package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdzt implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33475a;

    /* renamed from: b */
    private final zzgxv f33476b;

    /* renamed from: c */
    private final zzgxv f33477c;

    /* renamed from: d */
    private final zzgxv f33478d;

    /* renamed from: e */
    private final zzgxv f33479e;

    /* renamed from: f */
    private final zzgxv f33480f;

    /* renamed from: g */
    private final zzgxv f33481g;

    /* renamed from: h */
    private final zzgxv f33482h;

    /* renamed from: i */
    private final zzgxv f33483i;

    /* renamed from: j */
    private final zzgxv f33484j;

    public zzdzt(zzgxv zzgxv, zzgxv zzgxv2, zzgxv zzgxv3, zzgxv zzgxv4, zzgxv zzgxv5, zzgxv zzgxv6, zzgxv zzgxv7, zzgxv zzgxv8, zzgxv zzgxv9, zzgxv zzgxv10) {
        this.f33475a = zzgxv;
        this.f33476b = zzgxv2;
        this.f33477c = zzgxv3;
        this.f33478d = zzgxv4;
        this.f33479e = zzgxv5;
        this.f33480f = zzgxv6;
        this.f33481g = zzgxv7;
        this.f33482h = zzgxv8;
        this.f33483i = zzgxv9;
        this.f33484j = zzgxv10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = ((zzcos) this.f33476b).mo44226a();
        WeakReference a2 = ((zzcot) this.f33477c).mo44227a();
        zzfzq zzfzq = zzchc.f28456a;
        zzgxq.m53658b(zzfzq);
        return new zzdzs((Executor) this.f33475a.zzb(), a, a2, zzfzq, (zzdvl) this.f33479e.zzb(), (ScheduledExecutorService) this.f33480f.zzb(), (zzdxz) this.f33481g.zzb(), ((zzcpc) this.f33482h).mo44235a(), ((zzdjs) this.f33483i).zzb(), (zzfjw) this.f33484j.zzb());
    }
}
