package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzahq implements zzahc {

    /* renamed from: a */
    private final zzef f24657a;

    /* renamed from: b */
    private final zzaab f24658b;
    @Nullable

    /* renamed from: c */
    private final String f24659c;

    /* renamed from: d */
    private zzaap f24660d;

    /* renamed from: e */
    private String f24661e;

    /* renamed from: f */
    private int f24662f;

    /* renamed from: g */
    private int f24663g;

    /* renamed from: h */
    private boolean f24664h;

    /* renamed from: i */
    private boolean f24665i;

    /* renamed from: j */
    private long f24666j;

    /* renamed from: k */
    private int f24667k;

    /* renamed from: l */
    private long f24668l;

    public zzahq() {
        this((String) null);
    }

    /* renamed from: a */
    public final void mo41466a() {
    }

    /* renamed from: b */
    public final void mo41467b() {
        this.f24662f = 0;
        this.f24663g = 0;
        this.f24665i = false;
        this.f24668l = -9223372036854775807L;
    }

    /* renamed from: c */
    public final void mo41468c(zzef zzef) {
        zzdd.m47208b(this.f24660d);
        while (zzef.mo45233i() > 0) {
            int i = this.f24662f;
            if (i == 0) {
                byte[] h = zzef.mo45232h();
                int k = zzef.mo45235k();
                int l = zzef.mo45236l();
                while (true) {
                    if (k >= l) {
                        zzef.mo45230f(l);
                        break;
                    }
                    byte b = h[k];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f24665i && (b & 224) == 224;
                    this.f24665i = z;
                    if (z2) {
                        zzef.mo45230f(k + 1);
                        this.f24665i = false;
                        this.f24657a.mo45232h()[1] = h[k];
                        this.f24663g = 2;
                        this.f24662f = 1;
                        break;
                    }
                    k++;
                }
            } else if (i != 1) {
                int min = Math.min(zzef.mo45233i(), this.f24667k - this.f24663g);
                this.f24660d.mo41215e(zzef, min);
                int i2 = this.f24663g + min;
                this.f24663g = i2;
                int i3 = this.f24667k;
                if (i2 >= i3) {
                    long j = this.f24668l;
                    if (j != -9223372036854775807L) {
                        this.f24660d.mo41216f(j, 1, i3, 0, (zzaao) null);
                        this.f24668l += this.f24666j;
                    }
                    this.f24663g = 0;
                    this.f24662f = 0;
                }
            } else {
                int min2 = Math.min(zzef.mo45233i(), 4 - this.f24663g);
                zzef.mo45226b(this.f24657a.mo45232h(), this.f24663g, min2);
                int i4 = this.f24663g + min2;
                this.f24663g = i4;
                if (i4 >= 4) {
                    this.f24657a.mo45230f(0);
                    if (!this.f24658b.mo41196a(this.f24657a.mo45237m())) {
                        this.f24663g = 0;
                        this.f24662f = 1;
                    } else {
                        zzaab zzaab = this.f24658b;
                        this.f24667k = zzaab.f23705c;
                        if (!this.f24664h) {
                            this.f24666j = (((long) zzaab.f23709g) * 1000000) / ((long) zzaab.f23706d);
                            zzad zzad = new zzad();
                            zzad.mo41331h(this.f24661e);
                            zzad.mo41343s(this.f24658b.f23704b);
                            zzad.mo41336l(4096);
                            zzad.mo41326e0(this.f24658b.f23707e);
                            zzad.mo41344t(this.f24658b.f23706d);
                            zzad.mo41335k(this.f24659c);
                            this.f24660d.mo41214d(zzad.mo41349y());
                            this.f24664h = true;
                        }
                        this.f24657a.mo45230f(0);
                        this.f24660d.mo41215e(this.f24657a, 4);
                        this.f24662f = 2;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo41469d(zzzl zzzl, zzaio zzaio) {
        zzaio.mo41517c();
        this.f24661e = zzaio.mo41516b();
        this.f24660d = zzzl.mo41256k(zzaio.mo41515a(), 1);
    }

    /* renamed from: e */
    public final void mo41470e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f24668l = j;
        }
    }

    public zzahq(@Nullable String str) {
        this.f24662f = 0;
        zzef zzef = new zzef(4);
        this.f24657a = zzef;
        zzef.mo45232h()[0] = -1;
        this.f24658b = new zzaab();
        this.f24668l = -9223372036854775807L;
        this.f24659c = str;
    }
}
