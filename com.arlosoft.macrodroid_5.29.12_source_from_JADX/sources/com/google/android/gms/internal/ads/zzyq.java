package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzyq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f38993a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f38994b;

    /* renamed from: c */
    private final long f38995c;

    /* renamed from: d */
    private long f38996d = 0;

    /* renamed from: e */
    private long f38997e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f38998f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f38999g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f39000h;

    protected zzyq(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f38993a = j;
        long j8 = j2;
        this.f38994b = j8;
        long j9 = j4;
        this.f38997e = j9;
        long j10 = j5;
        this.f38998f = j10;
        long j11 = j6;
        this.f38999g = j11;
        long j12 = j7;
        this.f38995c = j12;
        this.f39000h = m55451f(j8, 0, j9, j10, j11, j12);
    }

    /* renamed from: f */
    protected static long m55451f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return zzen.m49155b0(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m55452g(zzyq zzyq, long j, long j2) {
        zzyq.f38997e = j;
        zzyq.f38999g = j2;
        zzyq.m55454i();
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m55453h(zzyq zzyq, long j, long j2) {
        zzyq.f38996d = j;
        zzyq.f38998f = j2;
        zzyq.m55454i();
    }

    /* renamed from: i */
    private final void m55454i() {
        this.f39000h = m55451f(this.f38994b, this.f38996d, this.f38997e, this.f38998f, this.f38999g, this.f38995c);
    }
}
