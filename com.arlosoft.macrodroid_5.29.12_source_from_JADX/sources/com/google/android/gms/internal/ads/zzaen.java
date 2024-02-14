package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaen implements zzaes {

    /* renamed from: a */
    private final long[] f24143a;

    /* renamed from: b */
    private final long[] f24144b;

    /* renamed from: c */
    private final long f24145c;

    private zzaen(long[] jArr, long[] jArr2, long j) {
        this.f24143a = jArr;
        this.f24144b = jArr2;
        this.f24145c = j == -9223372036854775807L ? zzen.m49163f0(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static zzaen m41186a(long j, zzadh zzadh, long j2) {
        int length = zzadh.f23995g.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzadh.f23993d + zzadh.f23995g[i3]);
            j3 += (long) (zzadh.f23994f + zzadh.f23996o[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzaen(jArr, jArr2, j2);
    }

    /* renamed from: d */
    private static Pair m41187d(long j, long[] jArr, long[] jArr2) {
        int N = zzen.m49139N(jArr, j, true, true);
        long j2 = jArr[N];
        long j3 = jArr2[N];
        int i = N + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f24145c;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        Pair d = m41187d(zzen.m49171j0(zzen.m49155b0(j, 0, this.f24145c)), this.f24144b, this.f24143a);
        long longValue = ((Long) d.first).longValue();
        zzaam zzaam = new zzaam(zzen.m49163f0(longValue), ((Long) d.second).longValue());
        return new zzaaj(zzaam, zzaam);
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }

    /* renamed from: f */
    public final long mo41412f(long j) {
        return zzen.m49163f0(((Long) m41187d(j, this.f24143a, this.f24144b).second).longValue());
    }

    public final long zzb() {
        return -1;
    }
}
