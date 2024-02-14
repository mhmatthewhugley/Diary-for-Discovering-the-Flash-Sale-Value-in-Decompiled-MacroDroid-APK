package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzafy {

    /* renamed from: a */
    public final zzafv f24370a;

    /* renamed from: b */
    public final int f24371b;

    /* renamed from: c */
    public final long[] f24372c;

    /* renamed from: d */
    public final int[] f24373d;

    /* renamed from: e */
    public final int f24374e;

    /* renamed from: f */
    public final long[] f24375f;

    /* renamed from: g */
    public final int[] f24376g;

    /* renamed from: h */
    public final long f24377h;

    public zzafy(zzafv zzafv, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        zzdd.m47210d(length == length2);
        int length3 = jArr.length;
        zzdd.m47210d(length3 == length2);
        int length4 = iArr2.length;
        zzdd.m47210d(length4 != length2 ? false : z);
        this.f24370a = zzafv;
        this.f24372c = jArr;
        this.f24373d = iArr;
        this.f24374e = i;
        this.f24375f = jArr2;
        this.f24376g = iArr2;
        this.f24377h = j;
        this.f24371b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo41443a(long j) {
        for (int N = zzen.m49139N(this.f24375f, j, true, false); N >= 0; N--) {
            if ((this.f24376g[N] & 1) != 0) {
                return N;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo41444b(long j) {
        for (int L = zzen.m49137L(this.f24375f, j, true, false); L < this.f24375f.length; L++) {
            if ((this.f24376g[L] & 1) != 0) {
                return L;
            }
        }
        return -1;
    }
}
