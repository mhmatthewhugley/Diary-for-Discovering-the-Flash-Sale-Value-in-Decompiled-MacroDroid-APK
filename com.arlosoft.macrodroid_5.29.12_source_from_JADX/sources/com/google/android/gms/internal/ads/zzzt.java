package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzzt implements zzaal {

    /* renamed from: a */
    private final zzzv f39046a;

    /* renamed from: b */
    private final long f39047b;

    public zzzt(zzzv zzzv, long j) {
        this.f39046a = zzzv;
        this.f39047b = j;
    }

    /* renamed from: a */
    private final zzaam m55553a(long j, long j2) {
        return new zzaam((j * 1000000) / ((long) this.f39046a.f39054e), this.f39047b + j2);
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f39046a.mo48464a();
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        long j2;
        zzdd.m47208b(this.f39046a.f39060k);
        zzzv zzzv = this.f39046a;
        zzzu zzzu = zzzv.f39060k;
        long[] jArr = zzzu.f39048a;
        long[] jArr2 = zzzu.f39049b;
        int N = zzen.m49139N(jArr, zzzv.mo48465b(j), true, false);
        long j3 = 0;
        if (N == -1) {
            j2 = 0;
        } else {
            j2 = jArr[N];
        }
        if (N != -1) {
            j3 = jArr2[N];
        }
        zzaam a = m55553a(j2, j3);
        if (a.f23739a == j || N == jArr.length - 1) {
            return new zzaaj(a, a);
        }
        int i = N + 1;
        return new zzaaj(a, m55553a(jArr[i], jArr2[i]));
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }
}
