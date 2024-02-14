package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzags implements zzahc {

    /* renamed from: a */
    private final zzee f24447a;

    /* renamed from: b */
    private final zzef f24448b;
    @Nullable

    /* renamed from: c */
    private final String f24449c;

    /* renamed from: d */
    private String f24450d;

    /* renamed from: e */
    private zzaap f24451e;

    /* renamed from: f */
    private int f24452f;

    /* renamed from: g */
    private int f24453g;

    /* renamed from: h */
    private boolean f24454h;

    /* renamed from: i */
    private long f24455i;

    /* renamed from: j */
    private zzaf f24456j;

    /* renamed from: k */
    private int f24457k;

    /* renamed from: l */
    private long f24458l;

    public zzags() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24452f = 0;
        this.f24453g = 0;
        this.f24454h = false;
        this.f24458l = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo41468c(zzef zzef) {
        zzdd.m47208b(this.f24451e);
        while (zzef.mo45233i() > 0) {
            int i = this.f24452f;
            if (i == 0) {
                while (true) {
                    if (zzef.mo45233i() <= 0) {
                        break;
                    } else if (!this.f24454h) {
                        this.f24454h = zzef.mo45243s() == 11;
                    } else {
                        int s = zzef.mo45243s();
                        if (s == 119) {
                            this.f24454h = false;
                            this.f24452f = 1;
                            zzef zzef2 = this.f24448b;
                            zzef2.mo45232h()[0] = 11;
                            zzef2.mo45232h()[1] = 119;
                            this.f24453g = 2;
                            break;
                        }
                        this.f24454h = s == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzef.mo45233i(), this.f24457k - this.f24453g);
                this.f24451e.mo41215e(zzef, min);
                int i2 = this.f24453g + min;
                this.f24453g = i2;
                int i3 = this.f24457k;
                if (i2 == i3) {
                    long j = this.f24458l;
                    if (j != -9223372036854775807L) {
                        this.f24451e.mo41216f(j, 1, i3, 0, (zzaao) null);
                        this.f24458l += this.f24455i;
                    }
                    this.f24452f = 0;
                }
            } else {
                byte[] h = this.f24448b.mo45232h();
                int min2 = Math.min(zzef.mo45233i(), 128 - this.f24453g);
                zzef.mo45226b(h, this.f24453g, min2);
                int i4 = this.f24453g + min2;
                this.f24453g = i4;
                if (i4 == 128) {
                    this.f24447a.mo45203h(0);
                    zzyi e = zzyj.m55431e(this.f24447a);
                    zzaf zzaf = this.f24456j;
                    if (zzaf == null || e.f38966c != zzaf.f24226y || e.f38965b != zzaf.f24227z || !zzen.m49181t(e.f38964a, zzaf.f24213l)) {
                        zzad zzad = new zzad();
                        zzad.mo41331h(this.f24450d);
                        zzad.mo41343s(e.f38964a);
                        zzad.mo41326e0(e.f38966c);
                        zzad.mo41344t(e.f38965b);
                        zzad.mo41335k(this.f24449c);
                        zzaf y = zzad.mo41349y();
                        this.f24456j = y;
                        this.f24451e.mo41214d(y);
                    }
                    this.f24457k = e.f38967d;
                    this.f24455i = (((long) e.f38968e) * 1000000) / ((long) this.f24456j.f24227z);
                    this.f24448b.mo45230f(0);
                    this.f24451e.mo41215e(this.f24448b, 128);
                    this.f24452f = 2;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24450d = zzaio.mo41516b();
        this.f24451e = zzzl.mo41256k(zzaio.mo41515a(), 1);
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24458l = j;
        }
    }

    public zzags(@Nullable String str) {
        zzee zzee = new zzee(new byte[128], 128);
        this.f24447a = zzee;
        this.f24448b = new zzef(zzee.f33777a);
        this.f24452f = 0;
        this.f24458l = -9223372036854775807L;
        this.f24449c = str;
    }
}
