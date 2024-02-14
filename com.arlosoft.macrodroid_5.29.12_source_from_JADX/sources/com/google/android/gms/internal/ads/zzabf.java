package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzabf {

    /* renamed from: a */
    protected final zzaap f23814a;

    /* renamed from: b */
    private final int f23815b;

    /* renamed from: c */
    private final int f23816c;

    /* renamed from: d */
    private final long f23817d;

    /* renamed from: e */
    private final int f23818e;

    /* renamed from: f */
    private int f23819f;

    /* renamed from: g */
    private int f23820g;

    /* renamed from: h */
    private int f23821h;

    /* renamed from: i */
    private int f23822i;

    /* renamed from: j */
    private int f23823j;

    /* renamed from: k */
    private long[] f23824k;

    /* renamed from: l */
    private int[] f23825l;

    public zzabf(int i, int i2, long j, int i3, zzaap zzaap) {
        i2 = i2 != 1 ? 2 : i2;
        this.f23817d = j;
        this.f23818e = i3;
        this.f23814a = zzaap;
        this.f23815b = m40977i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f23816c = i2 == 2 ? m40977i(i, 1650720768) : -1;
        this.f23824k = new long[512];
        this.f23825l = new int[512];
    }

    /* renamed from: i */
    private static int m40977i(int i, int i2) {
        return ((i / 10) + 48) | (((i % 10) + 48) << 8) | i2;
    }

    /* renamed from: j */
    private final long m40978j(int i) {
        return (this.f23817d * ((long) i)) / ((long) this.f23818e);
    }

    /* renamed from: k */
    private final zzaam m40979k(int i) {
        return new zzaam(((long) this.f23825l[i]) * m40978j(1), this.f23824k[i]);
    }

    /* renamed from: a */
    public final zzaaj mo41233a(long j) {
        int j2 = (int) (j / m40978j(1));
        int M = zzen.m49138M(this.f23825l, j2, true, true);
        if (this.f23825l[M] == j2) {
            zzaam k = m40979k(M);
            return new zzaaj(k, k);
        }
        zzaam k2 = m40979k(M);
        int i = M + 1;
        return i < this.f23824k.length ? new zzaaj(k2, m40979k(i)) : new zzaaj(k2, k2);
    }

    /* renamed from: b */
    public final void mo41234b(long j) {
        if (this.f23823j == this.f23825l.length) {
            long[] jArr = this.f23824k;
            this.f23824k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f23825l;
            this.f23825l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f23824k;
        int i = this.f23823j;
        jArr2[i] = j;
        this.f23825l[i] = this.f23822i;
        this.f23823j = i + 1;
    }

    /* renamed from: c */
    public final void mo41235c() {
        this.f23824k = Arrays.copyOf(this.f23824k, this.f23823j);
        this.f23825l = Arrays.copyOf(this.f23825l, this.f23823j);
    }

    /* renamed from: d */
    public final void mo41236d() {
        this.f23822i++;
    }

    /* renamed from: e */
    public final void mo41237e(int i) {
        this.f23819f = i;
        this.f23820g = i;
    }

    /* renamed from: f */
    public final void mo41238f(long j) {
        if (this.f23823j == 0) {
            this.f23821h = 0;
            return;
        }
        this.f23821h = this.f23825l[zzen.m49139N(this.f23824k, j, true, true)];
    }

    /* renamed from: g */
    public final boolean mo41239g(int i) {
        return this.f23815b == i || this.f23816c == i;
    }

    /* renamed from: h */
    public final boolean mo41240h(zzzj zzzj) throws IOException {
        int i = this.f23820g;
        int a = i - this.f23814a.mo41211a(zzzj, i, false);
        this.f23820g = a;
        boolean z = a == 0;
        if (z) {
            if (this.f23819f > 0) {
                this.f23814a.mo41216f(m40978j(this.f23821h), Arrays.binarySearch(this.f23825l, this.f23821h) >= 0 ? 1 : 0, this.f23819f, 0, (zzaao) null);
            }
            this.f23821h++;
        }
        return z;
    }
}
