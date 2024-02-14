package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzsw implements zzsg, zzsf {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzsg f38449a;

    /* renamed from: c */
    private final long f38450c;

    /* renamed from: d */
    private zzsf f38451d;

    public zzsw(zzsg zzsg, long j) {
        this.f38449a = zzsg;
        this.f38450c = j;
    }

    /* renamed from: F */
    public final void mo48128F(long j) {
        this.f38449a.mo48128F(j - this.f38450c);
    }

    /* renamed from: a */
    public final long mo48129a() {
        long a = this.f38449a.mo48129a();
        if (a == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return a + this.f38450c;
    }

    /* renamed from: b */
    public final boolean mo48130b(long j) {
        return this.f38449a.mo48130b(j - this.f38450c);
    }

    /* renamed from: c */
    public final long mo48131c(zzvt[] zzvtArr, boolean[] zArr, zztz[] zztzArr, boolean[] zArr2, long j) {
        zztz[] zztzArr2 = zztzArr;
        zztz[] zztzArr3 = new zztz[zztzArr2.length];
        int i = 0;
        while (true) {
            zztz zztz = null;
            if (i >= zztzArr2.length) {
                break;
            }
            zzsx zzsx = (zzsx) zztzArr2[i];
            if (zzsx != null) {
                zztz = zzsx.mo48187e();
            }
            zztzArr3[i] = zztz;
            i++;
        }
        long c = this.f38449a.mo48131c(zzvtArr, zArr, zztzArr3, zArr2, j - this.f38450c);
        for (int i2 = 0; i2 < zztzArr2.length; i2++) {
            zztz zztz2 = zztzArr3[i2];
            if (zztz2 == null) {
                zztzArr2[i2] = null;
            } else {
                zztz zztz3 = zztzArr2[i2];
                if (zztz3 == null || ((zzsx) zztz3).mo48187e() != zztz2) {
                    zztzArr2[i2] = new zzsx(zztz2, this.f38450c);
                }
            }
        }
        return c + this.f38450c;
    }

    /* renamed from: d */
    public final long mo48132d() {
        long d = this.f38449a.mo48132d();
        if (d == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return d + this.f38450c;
    }

    /* renamed from: e */
    public final zzuh mo48133e() {
        return this.f38449a.mo48133e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo47685f(zzub zzub) {
        zzsg zzsg = (zzsg) zzub;
        zzsf zzsf = this.f38451d;
        Objects.requireNonNull(zzsf);
        zzsf.mo47685f(this);
    }

    /* renamed from: g */
    public final void mo47686g(zzsg zzsg) {
        zzsf zzsf = this.f38451d;
        Objects.requireNonNull(zzsf);
        zzsf.mo47686g(this);
    }

    /* renamed from: i */
    public final void mo48135i() throws IOException {
        this.f38449a.mo48135i();
    }

    /* renamed from: l */
    public final long mo48137l(long j, zzkd zzkd) {
        return this.f38449a.mo48137l(j - this.f38450c, zzkd) + this.f38450c;
    }

    /* renamed from: m */
    public final boolean mo48138m() {
        return this.f38449a.mo48138m();
    }

    /* renamed from: n */
    public final long mo48139n(long j) {
        return this.f38449a.mo48139n(j - this.f38450c) + this.f38450c;
    }

    /* renamed from: o */
    public final void mo48140o(long j, boolean z) {
        this.f38449a.mo48140o(j - this.f38450c, false);
    }

    /* renamed from: q */
    public final void mo48141q(zzsf zzsf, long j) {
        this.f38451d = zzsf;
        this.f38449a.mo48141q(this, j - this.f38450c);
    }

    public final long zzb() {
        long zzb = this.f38449a.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.f38450c;
    }
}
