package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzagc implements zzagi {

    /* renamed from: a */
    private final zzzv f24391a;

    /* renamed from: b */
    private final zzzu f24392b;

    /* renamed from: c */
    private long f24393c = -1;

    /* renamed from: d */
    private long f24394d = -1;

    public zzagc(zzzv zzzv, zzzu zzzu) {
        this.f24391a = zzzv;
        this.f24392b = zzzu;
    }

    /* renamed from: a */
    public final long mo41445a(zzzj zzzj) {
        long j = this.f24394d;
        if (j < 0) {
            return -1;
        }
        this.f24394d = -1;
        return -(j + 2);
    }

    /* renamed from: b */
    public final zzaal mo41446b() {
        zzdd.m47212f(this.f24393c != -1);
        return new zzzt(this.f24391a, this.f24393c);
    }

    /* renamed from: c */
    public final void mo41447c(long j) {
        long[] jArr = this.f24392b.f39048a;
        this.f24394d = jArr[zzen.m49139N(jArr, j, true, true)];
    }

    /* renamed from: d */
    public final void mo41448d(long j) {
        this.f24393c = j;
    }
}
