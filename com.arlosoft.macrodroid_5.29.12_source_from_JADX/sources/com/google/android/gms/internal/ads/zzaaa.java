package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaaa implements zzaal {

    /* renamed from: a */
    private final long[] f23699a;

    /* renamed from: b */
    private final long[] f23700b;

    /* renamed from: c */
    private final long f23701c;

    /* renamed from: d */
    private final boolean f23702d;

    public zzaaa(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdd.m47210d(length == length2);
        boolean z = length2 > 0;
        this.f23702d = z;
        if (!z || jArr2[0] <= 0) {
            this.f23699a = jArr;
            this.f23700b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f23699a = jArr3;
            long[] jArr4 = new long[i];
            this.f23700b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f23701c = j;
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f23701c;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        if (!this.f23702d) {
            zzaam zzaam = zzaam.f23738c;
            return new zzaaj(zzaam, zzaam);
        }
        int N = zzen.m49139N(this.f23700b, j, true, true);
        zzaam zzaam2 = new zzaam(this.f23700b[N], this.f23699a[N]);
        if (zzaam2.f23739a != j) {
            long[] jArr = this.f23700b;
            if (N != jArr.length - 1) {
                int i = N + 1;
                return new zzaaj(zzaam2, new zzaam(jArr[i], this.f23699a[i]));
            }
        }
        return new zzaaj(zzaam2, zzaam2);
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return this.f23702d;
    }
}
