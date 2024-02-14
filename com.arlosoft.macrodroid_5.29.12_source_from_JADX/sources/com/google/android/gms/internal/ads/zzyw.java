package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzyw implements zzaal {

    /* renamed from: a */
    public final int f39009a;

    /* renamed from: b */
    public final int[] f39010b;

    /* renamed from: c */
    public final long[] f39011c;

    /* renamed from: d */
    public final long[] f39012d;

    /* renamed from: e */
    public final long[] f39013e;

    /* renamed from: f */
    private final long f39014f;

    public zzyw(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f39010b = iArr;
        this.f39011c = jArr;
        this.f39012d = jArr2;
        this.f39013e = jArr3;
        int length = iArr.length;
        this.f39009a = length;
        if (length > 0) {
            int i = length - 1;
            this.f39014f = jArr2[i] + jArr3[i];
            return;
        }
        this.f39014f = 0;
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f39014f;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        int N = zzen.m49139N(this.f39013e, j, true, true);
        zzaam zzaam = new zzaam(this.f39013e[N], this.f39011c[N]);
        if (zzaam.f23739a >= j || N == this.f39009a - 1) {
            return new zzaaj(zzaam, zzaam);
        }
        int i = N + 1;
        return new zzaaj(zzaam, new zzaam(this.f39013e[i], this.f39011c[i]));
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }

    public final String toString() {
        int i = this.f39009a;
        String arrays = Arrays.toString(this.f39010b);
        String arrays2 = Arrays.toString(this.f39011c);
        String arrays3 = Arrays.toString(this.f39013e);
        String arrays4 = Arrays.toString(this.f39012d);
        return "ChunkIndex(length=" + i + ", sizes=" + arrays + ", offsets=" + arrays2 + ", timeUs=" + arrays3 + ", durationsUs=" + arrays4 + ")";
    }
}
