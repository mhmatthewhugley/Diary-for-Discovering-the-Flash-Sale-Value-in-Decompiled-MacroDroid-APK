package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgv {

    /* renamed from: a */
    private final long f37340a;

    /* renamed from: b */
    private final long f37341b;

    /* renamed from: c */
    private long f37342c = -9223372036854775807L;

    /* renamed from: d */
    private long f37343d = -9223372036854775807L;

    /* renamed from: e */
    private long f37344e = -9223372036854775807L;

    /* renamed from: f */
    private long f37345f = -9223372036854775807L;

    /* renamed from: g */
    private long f37346g = -9223372036854775807L;

    /* renamed from: h */
    private long f37347h = -9223372036854775807L;

    /* renamed from: i */
    private float f37348i = 1.03f;

    /* renamed from: j */
    private float f37349j = 0.97f;

    /* renamed from: k */
    private float f37350k = 1.0f;

    /* renamed from: l */
    private long f37351l = -9223372036854775807L;

    /* renamed from: m */
    private long f37352m = -9223372036854775807L;

    /* renamed from: n */
    private long f37353n = -9223372036854775807L;

    /* synthetic */ zzgv(float f, float f2, long j, float f3, long j2, long j3, float f4, zzgu zzgu) {
        this.f37340a = j2;
        this.f37341b = j3;
    }

    /* renamed from: f */
    private static long m53505f(long j, long j2, float f) {
        return (long) ((((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f));
    }

    /* renamed from: g */
    private final void m53506g() {
        long j = this.f37342c;
        if (j != -9223372036854775807L) {
            long j2 = this.f37343d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f37345f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f37346g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f37344e != j) {
            this.f37344e = j;
            this.f37347h = j;
            this.f37352m = -9223372036854775807L;
            this.f37353n = -9223372036854775807L;
            this.f37351l = -9223372036854775807L;
        }
    }

    /* renamed from: a */
    public final float mo47550a(long j, long j2) {
        long j3;
        if (this.f37342c == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.f37352m;
        if (j5 == -9223372036854775807L) {
            this.f37352m = j4;
            this.f37353n = 0;
        } else {
            long max = Math.max(j4, m53505f(j5, j4, 0.999f));
            this.f37352m = max;
            this.f37353n = m53505f(this.f37353n, Math.abs(j4 - max), 0.999f);
        }
        if (this.f37351l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f37351l < 1000) {
            return this.f37350k;
        }
        this.f37351l = SystemClock.elapsedRealtime();
        long j6 = this.f37352m + (this.f37353n * 3);
        if (this.f37347h > j6) {
            long f0 = zzen.m49163f0(1000);
            float f = (float) f0;
            long[] jArr = {j6, this.f37344e, this.f37347h - (((long) ((this.f37350k - 4.0f) * f)) + ((long) ((this.f37348i - 4.0f) * f)))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.f37347h = j3;
        } else {
            j3 = zzen.m49155b0(j - ((long) (Math.max(0.0f, this.f37350k - 4.0f) / 1.0E-7f)), this.f37347h, j6);
            this.f37347h = j3;
            long j8 = this.f37346g;
            if (j8 != -9223372036854775807L && j3 > j8) {
                this.f37347h = j8;
                j3 = j8;
            }
        }
        long j9 = j - j3;
        if (Math.abs(j9) < this.f37340a) {
            this.f37350k = 1.0f;
            return 1.0f;
        }
        float A = zzen.m49126A((((float) j9) * 1.0E-7f) + 1.0f, this.f37349j, this.f37348i);
        this.f37350k = A;
        return A;
    }

    /* renamed from: b */
    public final long mo47551b() {
        return this.f37347h;
    }

    /* renamed from: c */
    public final void mo47552c() {
        long j = this.f37347h;
        if (j != -9223372036854775807L) {
            long j2 = j + this.f37341b;
            this.f37347h = j2;
            long j3 = this.f37346g;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.f37347h = j3;
            }
            this.f37351l = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public final void mo47553d(zzaw zzaw) {
        long j = zzaw.f25964a;
        this.f37342c = zzen.m49163f0(-9223372036854775807L);
        this.f37345f = zzen.m49163f0(-9223372036854775807L);
        this.f37346g = zzen.m49163f0(-9223372036854775807L);
        this.f37349j = 0.97f;
        this.f37348i = 1.03f;
        m53506g();
    }

    /* renamed from: e */
    public final void mo47554e(long j) {
        this.f37343d = j;
        m53506g();
    }
}
