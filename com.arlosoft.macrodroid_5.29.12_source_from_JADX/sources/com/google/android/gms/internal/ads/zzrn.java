package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.location.LocationRequestCompat;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzrn implements zzsg, zzsf {

    /* renamed from: a */
    public final zzsg f38363a;
    @Nullable

    /* renamed from: c */
    private zzsf f38364c;

    /* renamed from: d */
    private zzrm[] f38365d = new zzrm[0];

    /* renamed from: f */
    private long f38366f = 0;

    /* renamed from: g */
    long f38367g;

    public zzrn(zzsg zzsg, boolean z, long j, long j2) {
        this.f38363a = zzsg;
        this.f38367g = j2;
    }

    /* renamed from: F */
    public final void mo48128F(long j) {
        this.f38363a.mo48128F(j);
    }

    /* renamed from: a */
    public final long mo48129a() {
        long a = this.f38363a.mo48129a();
        if (a != Long.MIN_VALUE) {
            long j = this.f38367g;
            if (j == Long.MIN_VALUE || a < j) {
                return a;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final boolean mo48130b(long j) {
        return this.f38363a.mo48130b(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r4 > r7) goto L_0x005c;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo48131c(com.google.android.gms.internal.ads.zzvt[] r15, boolean[] r16, com.google.android.gms.internal.ads.zztz[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.zzrm[] r3 = new com.google.android.gms.internal.ads.zzrm[r2]
            r0.f38365d = r3
            com.google.android.gms.internal.ads.zztz[] r2 = new com.google.android.gms.internal.ads.zztz[r2]
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L_0x0021
            com.google.android.gms.internal.ads.zzrm[] r5 = r0.f38365d
            r6 = r1[r4]
            com.google.android.gms.internal.ads.zzrm r6 = (com.google.android.gms.internal.ads.zzrm) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.zztz r11 = r6.f38360a
        L_0x001c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0021:
            com.google.android.gms.internal.ads.zzsg r4 = r0.f38363a
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.mo48131c(r5, r6, r7, r8, r9)
            boolean r6 = r14.mo48136j()
            r7 = 0
            if (r6 == 0) goto L_0x003d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            r9 = r7
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f38366f = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x005d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x005c
            long r7 = r0.f38367g
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x005d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.zzdd.m47212f(r6)
        L_0x0060:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0086
            r6 = r2[r3]
            if (r6 != 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzrm[] r6 = r0.f38365d
            r6[r3] = r11
            goto L_0x007d
        L_0x006c:
            com.google.android.gms.internal.ads.zzrm[] r7 = r0.f38365d
            r8 = r7[r3]
            if (r8 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.zztz r8 = r8.f38360a
            if (r8 == r6) goto L_0x007d
        L_0x0076:
            com.google.android.gms.internal.ads.zzrm r8 = new com.google.android.gms.internal.ads.zzrm
            r8.<init>(r14, r6)
            r7[r3] = r8
        L_0x007d:
            com.google.android.gms.internal.ads.zzrm[] r6 = r0.f38365d
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0060
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrn.mo48131c(com.google.android.gms.internal.ads.zzvt[], boolean[], com.google.android.gms.internal.ads.zztz[], boolean[], long):long");
    }

    /* renamed from: d */
    public final long mo48132d() {
        if (mo48136j()) {
            long j = this.f38366f;
            this.f38366f = -9223372036854775807L;
            long d = mo48132d();
            return d != -9223372036854775807L ? d : j;
        }
        long d2 = this.f38363a.mo48132d();
        if (d2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        zzdd.m47212f(d2 >= 0);
        long j2 = this.f38367g;
        if (j2 == Long.MIN_VALUE || d2 <= j2) {
            z = true;
        }
        zzdd.m47212f(z);
        return d2;
    }

    /* renamed from: e */
    public final zzuh mo48133e() {
        return this.f38363a.mo48133e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo47685f(zzub zzub) {
        zzsg zzsg = (zzsg) zzub;
        zzsf zzsf = this.f38364c;
        Objects.requireNonNull(zzsf);
        zzsf.mo47685f(this);
    }

    /* renamed from: g */
    public final void mo47686g(zzsg zzsg) {
        zzsf zzsf = this.f38364c;
        Objects.requireNonNull(zzsf);
        zzsf.mo47686g(this);
    }

    /* renamed from: h */
    public final void mo48134h(long j, long j2) {
        this.f38367g = j2;
    }

    /* renamed from: i */
    public final void mo48135i() throws IOException {
        this.f38363a.mo48135i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo48136j() {
        return this.f38366f != -9223372036854775807L;
    }

    /* renamed from: l */
    public final long mo48137l(long j, zzkd zzkd) {
        if (j == 0) {
            return 0;
        }
        long b0 = zzen.m49155b0(zzkd.f37738a, 0, j);
        long j2 = zzkd.f37739b;
        long j3 = this.f38367g;
        long b02 = zzen.m49155b0(j2, 0, j3 == Long.MIN_VALUE ? LocationRequestCompat.PASSIVE_INTERVAL : j3 - j);
        if (!(b0 == zzkd.f37738a && b02 == zzkd.f37739b)) {
            zzkd = new zzkd(b0, b02);
        }
        return this.f38363a.mo48137l(j, zzkd);
    }

    /* renamed from: m */
    public final boolean mo48138m() {
        return this.f38363a.mo48138m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 > r8) goto L_0x0036;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo48139n(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f38366f = r0
            com.google.android.gms.internal.ads.zzrm[] r0 = r7.f38365d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo48127e()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.gms.internal.ads.zzsg r0 = r7.f38363a
            long r0 = r0.mo48139n(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0036
            long r8 = r7.f38367g
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            com.google.android.gms.internal.ads.zzdd.m47212f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrn.mo48139n(long):long");
    }

    /* renamed from: o */
    public final void mo48140o(long j, boolean z) {
        this.f38363a.mo48140o(j, false);
    }

    /* renamed from: q */
    public final void mo48141q(zzsf zzsf, long j) {
        this.f38364c = zzsf;
        this.f38363a.mo48141q(this, j);
    }

    public final long zzb() {
        long zzb = this.f38363a.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.f38367g;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }
}
