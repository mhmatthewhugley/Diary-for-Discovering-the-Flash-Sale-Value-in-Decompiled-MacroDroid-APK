package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaja implements zzaal {

    /* renamed from: a */
    private final zzaix f24821a;

    /* renamed from: b */
    private final int f24822b;

    /* renamed from: c */
    private final long f24823c;

    /* renamed from: d */
    private final long f24824d;

    /* renamed from: e */
    private final long f24825e;

    public zzaja(zzaix zzaix, int i, long j, long j2) {
        this.f24821a = zzaix;
        this.f24822b = i;
        this.f24823c = j;
        long j3 = (j2 - j) / ((long) zzaix.f24808d);
        this.f24824d = j3;
        this.f24825e = m41574a(j3);
    }

    /* renamed from: a */
    private final long m41574a(long j) {
        return zzen.m49165g0(j * ((long) this.f24822b), 1000000, (long) this.f24821a.f24807c);
    }

    /* renamed from: b */
    public final long mo41193b() {
        return this.f24825e;
    }

    /* renamed from: c */
    public final zzaaj mo41194c(long j) {
        long b0 = zzen.m49155b0((((long) this.f24821a.f24807c) * j) / (((long) this.f24822b) * 1000000), 0, this.f24824d - 1);
        long j2 = this.f24823c;
        int i = this.f24821a.f24808d;
        long a = m41574a(b0);
        zzaam zzaam = new zzaam(a, j2 + (((long) i) * b0));
        if (a >= j || b0 == this.f24824d - 1) {
            return new zzaaj(zzaam, zzaam);
        }
        long j3 = b0 + 1;
        return new zzaaj(zzaam, new zzaam(m41574a(j3), this.f24823c + (j3 * ((long) this.f24821a.f24808d))));
    }

    /* renamed from: e */
    public final boolean mo41195e() {
        return true;
    }
}
