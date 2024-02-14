package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaet implements zzaes {

    /* renamed from: a */
    private final long[] f24166a;

    /* renamed from: b */
    private final long[] f24167b;

    /* renamed from: c */
    private final long f24168c;

    /* renamed from: d */
    private final long f24169d;

    private zzaet(long[] jArr, long[] jArr2, long j, long j2) {
        this.f24166a = jArr;
        this.f24167b = jArr2;
        this.f24168c = j;
        this.f24169d = j2;
    }

    @Nullable
    /* renamed from: a */
    public static zzaet m41206a(long j, long j2, zzaab zzaab, zzef zzef) {
        int i;
        long j3 = j;
        zzaab zzaab2 = zzaab;
        zzef zzef2 = zzef;
        zzef2.mo45231g(10);
        int m = zzef.mo45237m();
        if (m <= 0) {
            return null;
        }
        int i2 = zzaab2.f23706d;
        long g0 = zzen.m49165g0((long) m, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, (long) i2);
        int w = zzef.mo45247w();
        int w2 = zzef.mo45247w();
        int w3 = zzef.mo45247w();
        zzef2.mo45231g(2);
        long j4 = j2 + ((long) zzaab2.f23705c);
        long[] jArr = new long[w];
        long[] jArr2 = new long[w];
        int i3 = 0;
        long j5 = j2;
        while (i3 < w) {
            int i4 = w2;
            jArr[i3] = (((long) i3) * g0) / ((long) w);
            long j6 = j4;
            jArr2[i3] = Math.max(j5, j6);
            if (w3 == 1) {
                i = zzef.mo45243s();
            } else if (w3 == 2) {
                i = zzef.mo45247w();
            } else if (w3 == 3) {
                i = zzef.mo45245u();
            } else if (w3 != 4) {
                return null;
            } else {
                i = zzef.mo45246v();
            }
            long j7 = (long) i;
            int i5 = i4;
            j5 += j7 * ((long) i5);
            i3++;
            jArr = jArr;
            w2 = i5;
            j4 = j6;
        }
        long[] jArr3 = jArr;
        if (!(j3 == -1 || j3 == j5)) {
            zzdw.m48255e("VbriSeeker", "VBRI data size mismatch: " + j3 + ", " + j5);
        }
        return new zzaet(jArr3, jArr2, g0, j5);
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f24168c;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        int N = zzen.m49139N(this.f24166a, j, true, true);
        zzaam zzaam = new zzaam(this.f24166a[N], this.f24167b[N]);
        if (zzaam.f23739a < j) {
            long[] jArr = this.f24166a;
            if (N != jArr.length - 1) {
                int i = N + 1;
                return new zzaaj(zzaam, new zzaam(jArr[i], this.f24167b[i]));
            }
        }
        return new zzaaj(zzaam, zzaam);
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }

    /* renamed from: f */
    public final long mo41412f(long j) {
        return this.f24166a[zzen.m49139N(this.f24167b, j, true, true)];
    }

    public final long zzb() {
        return this.f24169d;
    }
}
