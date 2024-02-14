package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaiv implements zzaiu {

    /* renamed from: a */
    private final zzzl f24789a;

    /* renamed from: b */
    private final zzaap f24790b;

    /* renamed from: c */
    private final zzaix f24791c;

    /* renamed from: d */
    private final zzaf f24792d;

    /* renamed from: e */
    private final int f24793e;

    /* renamed from: f */
    private long f24794f;

    /* renamed from: g */
    private int f24795g;

    /* renamed from: h */
    private long f24796h;

    public zzaiv(zzzl zzzl, zzaap zzaap, zzaix zzaix, String str, int i) throws zzbu {
        this.f24789a = zzzl;
        this.f24790b = zzaap;
        this.f24791c = zzaix;
        int i2 = (zzaix.f24806b * zzaix.f24809e) / 8;
        int i3 = zzaix.f24808d;
        if (i3 == i2) {
            int i4 = zzaix.f24807c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f24793e = max;
            zzad zzad = new zzad();
            zzad.mo41343s(str);
            zzad.mo41324d0(i5);
            zzad.mo41339o(i5);
            zzad.mo41336l(max);
            zzad.mo41326e0(zzaix.f24806b);
            zzad.mo41344t(zzaix.f24807c);
            zzad.mo41338n(i);
            this.f24792d = zzad.mo41349y();
            return;
        }
        throw zzbu.m44135a("Expected block size: " + i2 + "; got: " + i3, (Throwable) null);
    }

    /* renamed from: c */
    public final void mo41520c(long j) {
        this.f24794f = j;
        this.f24795g = 0;
        this.f24796h = 0;
    }

    /* renamed from: d */
    public final void mo41521d(int i, long j) {
        this.f24789a.mo41254h(new zzaja(this.f24791c, 1, (long) i, j));
        this.f24790b.mo41214d(this.f24792d);
    }

    /* renamed from: e */
    public final boolean mo41522e(zzzj zzzj, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i <= 0 || (i2 = this.f24795g) >= (i3 = this.f24793e)) {
                zzaix zzaix = this.f24791c;
                int i4 = zzaix.f24808d;
                int i5 = this.f24795g / i4;
            } else {
                int a = zzaan.m40937a(this.f24790b, zzzj, (int) Math.min((long) (i3 - i2), j2), true);
                if (a == -1) {
                    j2 = 0;
                } else {
                    this.f24795g += a;
                    j2 -= (long) a;
                }
            }
        }
        zzaix zzaix2 = this.f24791c;
        int i42 = zzaix2.f24808d;
        int i52 = this.f24795g / i42;
        if (i52 > 0) {
            long j3 = this.f24794f;
            long g0 = zzen.m49165g0(this.f24796h, 1000000, (long) zzaix2.f24807c);
            int i6 = i52 * i42;
            int i7 = this.f24795g - i6;
            this.f24790b.mo41216f(j3 + g0, 1, i6, i7, (zzaao) null);
            this.f24796h += (long) i52;
            this.f24795g = i7;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }
}
