package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfgo {

    /* renamed from: a */
    private final long f35752a;

    /* renamed from: b */
    private final zzfgn f35753b = new zzfgn();

    /* renamed from: c */
    private long f35754c;

    /* renamed from: d */
    private int f35755d = 0;

    /* renamed from: e */
    private int f35756e = 0;

    /* renamed from: f */
    private int f35757f = 0;

    public zzfgo() {
        long a = zzt.m2889b().mo21950a();
        this.f35752a = a;
        this.f35754c = a;
    }

    /* renamed from: a */
    public final int mo45717a() {
        return this.f35755d;
    }

    /* renamed from: b */
    public final long mo45718b() {
        return this.f35752a;
    }

    /* renamed from: c */
    public final long mo45719c() {
        return this.f35754c;
    }

    /* renamed from: d */
    public final zzfgn mo45720d() {
        zzfgn a = this.f35753b.clone();
        zzfgn zzfgn = this.f35753b;
        zzfgn.f35750a = false;
        zzfgn.f35751c = 0;
        return a;
    }

    /* renamed from: e */
    public final String mo45721e() {
        return "Created: " + this.f35752a + " Last accessed: " + this.f35754c + " Accesses: " + this.f35755d + "\nEntries retrieved: Valid: " + this.f35756e + " Stale: " + this.f35757f;
    }

    /* renamed from: f */
    public final void mo45722f() {
        this.f35754c = zzt.m2889b().mo21950a();
        this.f35755d++;
    }

    /* renamed from: g */
    public final void mo45723g() {
        this.f35757f++;
        this.f35753b.f35751c++;
    }

    /* renamed from: h */
    public final void mo45724h() {
        this.f35756e++;
        this.f35753b.f35750a = true;
    }
}
