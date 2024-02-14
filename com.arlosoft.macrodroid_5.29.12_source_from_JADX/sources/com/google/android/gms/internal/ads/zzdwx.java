package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdwx implements zzfii {

    /* renamed from: a */
    private final Map f33280a;

    /* renamed from: c */
    private final zzbep f33281c;

    zzdwx(zzbep zzbep, Map map) {
        this.f33280a = map;
        this.f33281c = zzbep;
    }

    /* renamed from: a */
    public final void mo45028a(zzfib zzfib, String str) {
        if (this.f33280a.containsKey(zzfib)) {
            this.f33281c.mo42551c(((zzdww) this.f33280a.get(zzfib)).f33277a);
        }
    }

    /* renamed from: b */
    public final void mo45029b(zzfib zzfib, String str) {
    }

    /* renamed from: c */
    public final void mo45030c(zzfib zzfib, String str) {
        if (this.f33280a.containsKey(zzfib)) {
            this.f33281c.mo42551c(((zzdww) this.f33280a.get(zzfib)).f33278b);
        }
    }

    /* renamed from: e */
    public final void mo45031e(zzfib zzfib, String str, Throwable th) {
        if (this.f33280a.containsKey(zzfib)) {
            this.f33281c.mo42551c(((zzdww) this.f33280a.get(zzfib)).f33279c);
        }
    }
}
