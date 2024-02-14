package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaeu implements zzaes {

    /* renamed from: a */
    private final long f24170a;

    /* renamed from: b */
    private final int f24171b;

    /* renamed from: c */
    private final long f24172c;

    /* renamed from: d */
    private final long f24173d;

    /* renamed from: e */
    private final long f24174e;
    @Nullable

    /* renamed from: f */
    private final long[] f24175f;

    private zzaeu(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f24170a = j;
        this.f24171b = i;
        this.f24172c = j2;
        this.f24175f = jArr;
        this.f24173d = j3;
        this.f24174e = j3 != -1 ? j + j3 : -1;
    }

    @Nullable
    /* renamed from: a */
    public static zzaeu m41211a(long j, long j2, zzaab zzaab, zzef zzef) {
        int v;
        long j3 = j;
        zzaab zzaab2 = zzaab;
        int i = zzaab2.f23709g;
        int i2 = zzaab2.f23706d;
        int m = zzef.mo45237m();
        if ((m & 1) != 1 || (v = zzef.mo45246v()) == 0) {
            return null;
        }
        long g0 = zzen.m49165g0((long) v, ((long) i) * 1000000, (long) i2);
        if ((m & 6) != 6) {
            return new zzaeu(j2, zzaab2.f23705c, g0, -1, (long[]) null);
        }
        long A = zzef.mo45217A();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) zzef.mo45243s();
        }
        if (j3 != -1) {
            long j4 = j2 + A;
            if (j3 != j4) {
                zzdw.m48255e("XingSeeker", "XING data size mismatch: " + j3 + ", " + j4);
            }
        }
        return new zzaeu(j2, zzaab2.f23705c, g0, A, jArr);
    }

    /* renamed from: d */
    private final long m41212d(int i) {
        return (this.f24172c * ((long) i)) / 100;
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f24172c;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        double d;
        if (!mo41195e()) {
            zzaam zzaam = new zzaam(0, this.f24170a + ((long) this.f24171b));
            return new zzaaj(zzaam, zzaam);
        }
        long b0 = zzen.m49155b0(j, 0, this.f24172c);
        double d2 = (((double) b0) * 100.0d) / ((double) this.f24172c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = (long[]) zzdd.m47208b(this.f24175f);
                double d4 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                d3 = d4 + ((d2 - ((double) i)) * (d - d4));
            }
        }
        zzaam zzaam2 = new zzaam(b0, this.f24170a + zzen.m49155b0(Math.round((d3 / 256.0d) * ((double) this.f24173d)), (long) this.f24171b, this.f24173d - 1));
        return new zzaaj(zzaam2, zzaam2);
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return this.f24175f != null;
    }

    /* renamed from: f */
    public final long mo41412f(long j) {
        long j2;
        long j3 = j - this.f24170a;
        if (!mo41195e() || j3 <= ((long) this.f24171b)) {
            return 0;
        }
        long[] jArr = (long[]) zzdd.m47208b(this.f24175f);
        double d = (((double) j3) * 256.0d) / ((double) this.f24173d);
        int N = zzen.m49139N(jArr, (long) d, true, true);
        long d2 = m41212d(N);
        long j4 = jArr[N];
        int i = N + 1;
        long d3 = m41212d(i);
        if (N == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        return d2 + Math.round((j4 == j2 ? 0.0d : (d - ((double) j4)) / ((double) (j2 - j4))) * ((double) (d3 - d2)));
    }

    public final long zzb() {
        return this.f24174e;
    }
}
