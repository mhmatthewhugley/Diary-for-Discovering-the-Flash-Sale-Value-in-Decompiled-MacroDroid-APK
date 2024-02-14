package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaux implements zzavg {

    /* renamed from: a */
    public final int[] f25719a;

    /* renamed from: b */
    public final long[] f25720b;

    /* renamed from: c */
    public final long[] f25721c;

    /* renamed from: d */
    public final long[] f25722d;

    /* renamed from: e */
    private final long f25723e;

    public zzaux(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f25719a = iArr;
        this.f25720b = jArr;
        this.f25721c = jArr2;
        this.f25722d = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f25723e = jArr2[i] + jArr3[i];
            return;
        }
        this.f25723e = 0;
    }

    /* renamed from: a */
    public final boolean mo42090a() {
        return true;
    }

    /* renamed from: c */
    public final long mo42091c(long j) {
        return this.f25720b[zzbar.m42987c(this.f25722d, j, true, true)];
    }

    public final long zza() {
        return this.f25723e;
    }
}
