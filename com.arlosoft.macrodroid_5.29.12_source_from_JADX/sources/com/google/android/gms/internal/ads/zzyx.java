package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzyx implements zzaal {

    /* renamed from: a */
    private final long f39015a;

    /* renamed from: b */
    private final long f39016b;

    /* renamed from: c */
    private final int f39017c;

    /* renamed from: d */
    private final long f39018d;

    /* renamed from: e */
    private final int f39019e;

    /* renamed from: f */
    private final long f39020f;

    public zzyx(long j, long j2, int i, int i2, boolean z) {
        long d;
        this.f39015a = j;
        this.f39016b = j2;
        this.f39017c = i2 == -1 ? 1 : i2;
        this.f39019e = i;
        if (j == -1) {
            this.f39018d = -1;
            d = -9223372036854775807L;
        } else {
            this.f39018d = j - j2;
            d = m55476d(j, j2, i);
        }
        this.f39020f = d;
    }

    /* renamed from: d */
    private static long m55476d(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: a */
    public final long mo48450a(long j) {
        return m55476d(j, this.f39016b, this.f39019e);
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f39020f;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        long j2 = this.f39018d;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i != 0) {
            int i2 = this.f39019e;
            long j3 = (long) this.f39017c;
            long j4 = (((((long) i2) * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.f39016b + Math.max(j4, 0);
            long a = mo48450a(max);
            zzaam zzaam = new zzaam(a, max);
            if (this.f39018d != -1 && a < j) {
                long j5 = max + ((long) this.f39017c);
                if (j5 < this.f39015a) {
                    return new zzaaj(zzaam, new zzaam(mo48450a(j5), j5));
                }
            }
            return new zzaaj(zzaam, zzaam);
        }
        zzaam zzaam2 = new zzaam(0, this.f39016b);
        return new zzaaj(zzaam2, zzaam2);
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return this.f39018d != -1;
    }
}
