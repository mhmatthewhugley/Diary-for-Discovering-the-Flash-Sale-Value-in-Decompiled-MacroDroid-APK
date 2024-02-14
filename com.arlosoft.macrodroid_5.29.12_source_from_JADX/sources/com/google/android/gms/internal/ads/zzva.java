package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzva implements Comparable {

    /* renamed from: a */
    private final boolean f38670a;

    /* renamed from: c */
    private final boolean f38671c;

    public zzva(zzaf zzaf, int i) {
        this.f38670a = 1 != (zzaf.f24205d & 1) ? false : true;
        this.f38671c = zzvr.m55210r(i, false);
    }

    /* renamed from: b */
    public final int compareTo(zzva zzva) {
        return zzfvc.m51088i().mo46397d(this.f38671c, zzva.f38671c).mo46397d(this.f38670a, zzva.f38670a).mo46394a();
    }
}
