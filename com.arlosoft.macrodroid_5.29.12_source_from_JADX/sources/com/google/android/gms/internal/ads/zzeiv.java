package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeiv implements zzehc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzcxz f34135a;

    /* renamed from: b */
    private final zzeic f34136b;

    /* renamed from: c */
    private final zzfzq f34137c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzddc f34138d;

    /* renamed from: e */
    private final ScheduledExecutorService f34139e;

    public zzeiv(zzcxz zzcxz, zzeic zzeic, zzddc zzddc, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzq) {
        this.f34135a = zzcxz;
        this.f34136b = zzeic;
        this.f34138d = zzddc;
        this.f34139e = scheduledExecutorService;
        this.f34137c = zzfzq;
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        return zzfdw.f35589a.f35583a.mo45626a() != null && this.f34136b.mo45298a(zzfdw, zzfdk);
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        return this.f34137c.mo46579F(new zzeis(this, zzfdw, zzfdk));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzcxc mo45327c(zzfdw zzfdw, zzfdk zzfdk) throws Exception {
        return this.f34135a.mo44292b(new zzczt(zzfdw, zzfdk, (String) null), new zzcym(zzfdw.f35589a.f35583a.mo45626a(), new zzeit(this, zzfdw, zzfdk))).zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo45328f(zzfdw zzfdw, zzfdk zzfdk) {
        zzfzg.m51423r(zzfzg.m51420o(this.f34136b.mo45299b(zzfdw, zzfdk), (long) zzfdk.f35511S, TimeUnit.SECONDS, this.f34139e), new zzeiu(this), this.f34137c);
    }
}
