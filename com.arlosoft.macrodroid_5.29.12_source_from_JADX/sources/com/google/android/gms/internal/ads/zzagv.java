package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzagv implements zzahc {

    /* renamed from: a */
    private final zzee f24464a;

    /* renamed from: b */
    private final zzef f24465b;
    @Nullable

    /* renamed from: c */
    private final String f24466c;

    /* renamed from: d */
    private String f24467d;

    /* renamed from: e */
    private zzaap f24468e;

    /* renamed from: f */
    private int f24469f;

    /* renamed from: g */
    private int f24470g;

    /* renamed from: h */
    private boolean f24471h;

    /* renamed from: i */
    private long f24472i;

    /* renamed from: j */
    private zzaf f24473j;

    /* renamed from: k */
    private int f24474k;

    /* renamed from: l */
    private long f24475l;

    public zzagv() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24469f = 0;
        this.f24470g = 0;
        this.f24471h = false;
        this.f24475l = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo41468c(zzef zzef) {
        int s;
        byte b;
        zzdd.m47208b(this.f24468e);
        while (zzef.mo45233i() > 0) {
            int i = this.f24469f;
            if (i == 0) {
                while (true) {
                    if (zzef.mo45233i() <= 0) {
                        break;
                    } else if (!this.f24471h) {
                        this.f24471h = zzef.mo45243s() == 172;
                    } else {
                        s = zzef.mo45243s();
                        this.f24471h = s == 172;
                        b = 64;
                        if (s == 64) {
                            break;
                        } else if (s == 65) {
                            s = 65;
                            break;
                        }
                    }
                }
                this.f24469f = 1;
                zzef zzef2 = this.f24465b;
                zzef2.mo45232h()[0] = -84;
                byte[] h = zzef2.mo45232h();
                if (s == 65) {
                    b = 65;
                }
                h[1] = b;
                this.f24470g = 2;
            } else if (i != 1) {
                int min = Math.min(zzef.mo45233i(), this.f24474k - this.f24470g);
                this.f24468e.mo41215e(zzef, min);
                int i2 = this.f24470g + min;
                this.f24470g = i2;
                int i3 = this.f24474k;
                if (i2 == i3) {
                    long j = this.f24475l;
                    if (j != -9223372036854775807L) {
                        this.f24468e.mo41216f(j, 1, i3, 0, (zzaao) null);
                        this.f24475l += this.f24472i;
                    }
                    this.f24469f = 0;
                }
            } else {
                byte[] h2 = this.f24465b.mo45232h();
                int min2 = Math.min(zzef.mo45233i(), 16 - this.f24470g);
                zzef.mo45226b(h2, this.f24470g, min2);
                int i4 = this.f24470g + min2;
                this.f24470g = i4;
                if (i4 == 16) {
                    this.f24464a.mo45203h(0);
                    zzyl a = zzym.m55433a(this.f24464a);
                    zzaf zzaf = this.f24473j;
                    if (zzaf == null || zzaf.f24226y != 2 || a.f38976a != zzaf.f24227z || !"audio/ac4".equals(zzaf.f24213l)) {
                        zzad zzad = new zzad();
                        zzad.mo41331h(this.f24467d);
                        zzad.mo41343s("audio/ac4");
                        zzad.mo41326e0(2);
                        zzad.mo41344t(a.f38976a);
                        zzad.mo41335k(this.f24466c);
                        zzaf y = zzad.mo41349y();
                        this.f24473j = y;
                        this.f24468e.mo41214d(y);
                    }
                    this.f24474k = a.f38977b;
                    this.f24472i = (((long) a.f38978c) * 1000000) / ((long) this.f24473j.f24227z);
                    this.f24465b.mo45230f(0);
                    this.f24468e.mo41215e(this.f24465b, 16);
                    this.f24469f = 2;
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24467d = zzaio.mo41516b();
        this.f24468e = zzzl.mo41256k(zzaio.mo41515a(), 1);
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24475l = j;
        }
    }

    public zzagv(@Nullable String str) {
        zzee zzee = new zzee(new byte[16], 16);
        this.f24464a = zzee;
        this.f24465b = new zzef(zzee.f33777a);
        this.f24469f = 0;
        this.f24470g = 0;
        this.f24471h = false;
        this.f24475l = -9223372036854775807L;
        this.f24466c = str;
    }
}
