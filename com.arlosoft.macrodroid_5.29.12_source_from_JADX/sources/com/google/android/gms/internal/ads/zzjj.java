package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzjj {

    /* renamed from: a */
    public final zzsg f37626a;

    /* renamed from: b */
    public final Object f37627b;

    /* renamed from: c */
    public final zztz[] f37628c;

    /* renamed from: d */
    public boolean f37629d;

    /* renamed from: e */
    public boolean f37630e;

    /* renamed from: f */
    public zzjk f37631f;

    /* renamed from: g */
    public boolean f37632g;

    /* renamed from: h */
    private final boolean[] f37633h;

    /* renamed from: i */
    private final zzkb[] f37634i;

    /* renamed from: j */
    private final zzvz f37635j;

    /* renamed from: k */
    private final zzjt f37636k;
    @Nullable

    /* renamed from: l */
    private zzjj f37637l;

    /* renamed from: m */
    private zzuh f37638m = zzuh.f38622d;

    /* renamed from: n */
    private zzwa f37639n;

    /* renamed from: o */
    private long f37640o;

    public zzjj(zzkb[] zzkbArr, long j, zzvz zzvz, zzwi zzwi, zzjt zzjt, zzjk zzjk, zzwa zzwa, byte[] bArr) {
        zzjk zzjk2 = zzjk;
        this.f37634i = zzkbArr;
        this.f37640o = j;
        this.f37635j = zzvz;
        this.f37636k = zzjt;
        zzsi zzsi = zzjk2.f37641a;
        this.f37627b = zzsi.f27569a;
        this.f37631f = zzjk2;
        this.f37639n = zzwa;
        this.f37628c = new zztz[2];
        this.f37633h = new boolean[2];
        long j2 = zzjk2.f37642b;
        long j3 = zzjk2.f37644d;
        zzwi zzwi2 = zzwi;
        zzsg o = zzjt.mo47749o(zzsi, zzwi, j2);
        this.f37626a = j3 != -9223372036854775807L ? new zzrn(o, true, 0, j3) : o;
    }

    /* renamed from: s */
    private final void m53886s() {
        if (m53888u()) {
            int i = 0;
            while (true) {
                zzwa zzwa = this.f37639n;
                if (i < zzwa.f38761a) {
                    zzwa.mo48330b(i);
                    zzvt zzvt = this.f37639n.f38763c[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private final void m53887t() {
        if (m53888u()) {
            int i = 0;
            while (true) {
                zzwa zzwa = this.f37639n;
                if (i < zzwa.f38761a) {
                    zzwa.mo48330b(i);
                    zzvt zzvt = this.f37639n.f38763c[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    private final boolean m53888u() {
        return this.f37637l == null;
    }

    /* renamed from: a */
    public final long mo47689a(zzwa zzwa, long j, boolean z) {
        return mo47690b(zzwa, j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo47690b(zzwa zzwa, long j, boolean z, boolean[] zArr) {
        zzwa zzwa2 = zzwa;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzwa2.f38761a) {
                break;
            }
            boolean[] zArr2 = this.f37633h;
            if (z || !zzwa.mo48329a(this.f37639n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzkb[] zzkbArr = this.f37634i;
            if (i2 >= 2) {
                break;
            }
            zzkbArr[i2].zzb();
            i2++;
        }
        m53886s();
        this.f37639n = zzwa2;
        m53887t();
        long c = this.f37626a.mo48131c(zzwa2.f38763c, this.f37633h, this.f37628c, zArr, j);
        int i3 = 0;
        while (true) {
            zzkb[] zzkbArr2 = this.f37634i;
            if (i3 >= 2) {
                break;
            }
            zzkbArr2[i3].zzb();
            i3++;
        }
        this.f37630e = false;
        int i4 = 0;
        while (true) {
            zztz[] zztzArr = this.f37628c;
            if (i4 >= 2) {
                return c;
            }
            if (zztzArr[i4] != null) {
                zzdd.m47212f(zzwa.mo48330b(i4));
                this.f37634i[i4].zzb();
                this.f37630e = true;
            } else {
                zzdd.m47212f(zzwa2.f38763c[i4] == null);
            }
            i4++;
        }
    }

    /* renamed from: c */
    public final long mo47691c() {
        if (!this.f37629d) {
            return this.f37631f.f37642b;
        }
        long zzb = this.f37630e ? this.f37626a.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.f37631f.f37645e : zzb;
    }

    /* renamed from: d */
    public final long mo47692d() {
        if (!this.f37629d) {
            return 0;
        }
        return this.f37626a.mo48129a();
    }

    /* renamed from: e */
    public final long mo47693e() {
        return this.f37640o;
    }

    /* renamed from: f */
    public final long mo47694f() {
        return this.f37631f.f37642b + this.f37640o;
    }

    @Nullable
    /* renamed from: g */
    public final zzjj mo47695g() {
        return this.f37637l;
    }

    /* renamed from: h */
    public final zzuh mo47696h() {
        return this.f37638m;
    }

    /* renamed from: i */
    public final zzwa mo47697i() {
        return this.f37639n;
    }

    /* renamed from: j */
    public final zzwa mo47698j(float f, zzcn zzcn) throws zzha {
        zzwa d = this.f37635j.mo48320d(this.f37634i, this.f37638m, this.f37631f.f37641a, zzcn);
        for (zzvt zzvt : d.f38763c) {
        }
        return d;
    }

    /* renamed from: k */
    public final void mo47699k(long j) {
        zzdd.m47212f(m53888u());
        this.f37626a.mo48130b(j - this.f37640o);
    }

    /* renamed from: l */
    public final void mo47700l(float f, zzcn zzcn) throws zzha {
        this.f37629d = true;
        this.f37638m = this.f37626a.mo48133e();
        zzwa j = mo47698j(f, zzcn);
        zzjk zzjk = this.f37631f;
        long j2 = zzjk.f37642b;
        long j3 = zzjk.f37645e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0, j3 - 1);
        }
        long a = mo47689a(j, j2, false);
        long j4 = this.f37640o;
        zzjk zzjk2 = this.f37631f;
        this.f37640o = j4 + (zzjk2.f37642b - a);
        this.f37631f = zzjk2.mo47708b(a);
    }

    /* renamed from: m */
    public final void mo47701m(long j) {
        zzdd.m47212f(m53888u());
        if (this.f37629d) {
            this.f37626a.mo48128F(j - this.f37640o);
        }
    }

    /* renamed from: n */
    public final void mo47702n() {
        m53886s();
        zzjt zzjt = this.f37636k;
        zzsg zzsg = this.f37626a;
        try {
            if (zzsg instanceof zzrn) {
                zzjt.mo47742h(((zzrn) zzsg).f38363a);
            } else {
                zzjt.mo47742h(zzsg);
            }
        } catch (RuntimeException e) {
            zzdw.m48253c("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    /* renamed from: o */
    public final void mo47703o(@Nullable zzjj zzjj) {
        if (zzjj != this.f37637l) {
            m53886s();
            this.f37637l = zzjj;
            m53887t();
        }
    }

    /* renamed from: p */
    public final void mo47704p(long j) {
        this.f37640o = 1000000000000L;
    }

    /* renamed from: q */
    public final void mo47705q() {
        zzsg zzsg = this.f37626a;
        if (zzsg instanceof zzrn) {
            long j = this.f37631f.f37644d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzrn) zzsg).mo48134h(0, j);
        }
    }

    /* renamed from: r */
    public final boolean mo47706r() {
        return this.f37629d && (!this.f37630e || this.f37626a.zzb() == Long.MIN_VALUE);
    }
}
