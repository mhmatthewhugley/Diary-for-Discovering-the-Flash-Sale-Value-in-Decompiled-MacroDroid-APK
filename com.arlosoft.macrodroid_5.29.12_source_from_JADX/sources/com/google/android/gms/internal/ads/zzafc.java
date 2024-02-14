package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzafc implements zzafa {

    /* renamed from: a */
    private final int f24232a;

    /* renamed from: b */
    private final int f24233b;

    /* renamed from: c */
    private final zzef f24234c;

    public zzafc(zzaew zzaew, zzaf zzaf) {
        zzef zzef = zzaew.f24179b;
        this.f24234c = zzef;
        zzef.mo45230f(12);
        int v = zzef.mo45246v();
        if ("audio/raw".equals(zzaf.f24213l)) {
            int Y = zzen.m49150Y(zzaf.f24196A, zzaf.f24226y);
            if (v == 0 || v % Y != 0) {
                zzdw.m48255e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + Y + ", stsz sample size: " + v);
                v = Y;
            }
        }
        this.f24232a = v == 0 ? -1 : v;
        this.f24233b = zzef.mo45246v();
    }

    /* renamed from: a */
    public final int mo41428a() {
        int i = this.f24232a;
        return i == -1 ? this.f24234c.mo45246v() : i;
    }

    public final int zza() {
        return this.f24232a;
    }

    public final int zzb() {
        return this.f24233b;
    }
}
