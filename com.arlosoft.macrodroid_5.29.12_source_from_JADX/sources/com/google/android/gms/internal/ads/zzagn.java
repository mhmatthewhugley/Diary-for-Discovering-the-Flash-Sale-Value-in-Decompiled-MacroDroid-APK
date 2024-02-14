package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzagn {

    /* renamed from: a */
    private final zzagg f24419a = new zzagg();

    /* renamed from: b */
    private zzaap f24420b;

    /* renamed from: c */
    private zzzl f24421c;

    /* renamed from: d */
    private zzagi f24422d;

    /* renamed from: e */
    private long f24423e;

    /* renamed from: f */
    private long f24424f;

    /* renamed from: g */
    private long f24425g;

    /* renamed from: h */
    private int f24426h;

    /* renamed from: i */
    private int f24427i;

    /* renamed from: j */
    private zzagk f24428j = new zzagk();

    /* renamed from: k */
    private long f24429k;

    /* renamed from: l */
    private boolean f24430l;

    /* renamed from: m */
    private boolean f24431m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo41449a(zzef zzef);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41450b(boolean z) {
        int i;
        if (z) {
            this.f24428j = new zzagk();
            this.f24424f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f24426h = i;
        this.f24423e = -1;
        this.f24425g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo41451c(zzef zzef, long j, zzagk zzagk) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo41460d(zzzj zzzj, zzaai zzaai) throws IOException {
        zzzj zzzj2 = zzzj;
        zzdd.m47208b(this.f24420b);
        int i = zzen.f34500a;
        int i2 = this.f24426h;
        if (i2 == 0) {
            while (this.f24419a.mo41456e(zzzj2)) {
                long c = zzzj.mo41252c();
                long j = this.f24424f;
                this.f24429k = c - j;
                if (mo41451c(this.f24419a.mo41452a(), j, this.f24428j)) {
                    this.f24424f = zzzj.mo41252c();
                } else {
                    zzaf zzaf = this.f24428j.f24417a;
                    this.f24427i = zzaf.f24227z;
                    if (!this.f24431m) {
                        this.f24420b.mo41214d(zzaf);
                        this.f24431m = true;
                    }
                    zzagi zzagi = this.f24428j.f24418b;
                    if (zzagi != null) {
                        this.f24422d = zzagi;
                    } else if (zzzj.mo41253d() == -1) {
                        this.f24422d = new zzagm((zzagl) null);
                    } else {
                        zzagh b = this.f24419a.mo41453b();
                        this.f24422d = new zzagb(this, this.f24424f, zzzj.mo41253d(), (long) (b.f24410d + b.f24411e), b.f24408b, (b.f24407a & 4) != 0);
                    }
                    this.f24426h = 2;
                    this.f24419a.mo41455d();
                    return 0;
                }
            }
            this.f24426h = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzyy) zzzj2).mo48459p((int) this.f24424f, false);
            this.f24426h = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long a = this.f24422d.mo41445a(zzzj2);
            if (a >= 0) {
                zzaai.f23733a = a;
                return 1;
            }
            if (a < -1) {
                mo41464h(-(a + 2));
            }
            if (!this.f24430l) {
                zzaal b2 = this.f24422d.mo41446b();
                zzdd.m47208b(b2);
                this.f24421c.mo41254h(b2);
                this.f24430l = true;
            }
            if (this.f24429k > 0 || this.f24419a.mo41456e(zzzj2)) {
                this.f24429k = 0;
                zzef a2 = this.f24419a.mo41452a();
                long a3 = mo41449a(a2);
                if (a3 >= 0) {
                    long j2 = this.f24425g;
                    if (j2 + a3 >= this.f24423e) {
                        long e = mo41461e(j2);
                        zzaan.m40938b(this.f24420b, a2, a2.mo45236l());
                        this.f24420b.mo41216f(e, 1, a2.mo45236l(), 0, (zzaao) null);
                        this.f24423e = -1;
                    }
                }
                this.f24425g += a3;
                return 0;
            }
            this.f24426h = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final long mo41461e(long j) {
        return (j * 1000000) / ((long) this.f24427i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final long mo41462f(long j) {
        return (((long) this.f24427i) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo41463g(zzzl zzzl, zzaap zzaap) {
        this.f24421c = zzzl;
        this.f24420b = zzaap;
        mo41450b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo41464h(long j) {
        this.f24425g = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo41465i(long j, long j2) {
        this.f24419a.mo41454c();
        if (j == 0) {
            mo41450b(!this.f24430l);
        } else if (this.f24426h != 0) {
            long f = mo41462f(j2);
            this.f24423e = f;
            zzagi zzagi = this.f24422d;
            int i = zzen.f34500a;
            zzagi.mo41447c(f);
            this.f24426h = 2;
        }
    }
}
