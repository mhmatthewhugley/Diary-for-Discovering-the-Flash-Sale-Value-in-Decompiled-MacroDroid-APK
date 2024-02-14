package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawr {

    /* renamed from: a */
    public final int f26110a;

    /* renamed from: b */
    public final long[] f26111b;

    /* renamed from: c */
    public final int[] f26112c;

    /* renamed from: d */
    public final int f26113d;

    /* renamed from: e */
    public final long[] f26114e;

    /* renamed from: f */
    public final int[] f26115f;

    public zzawr(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z = true;
        zzbac.m42924c(iArr.length == length);
        int length2 = jArr.length;
        zzbac.m42924c(length2 == length);
        zzbac.m42924c(iArr2.length != length ? false : z);
        this.f26111b = jArr;
        this.f26112c = iArr;
        this.f26113d = i;
        this.f26114e = jArr2;
        this.f26115f = iArr2;
        this.f26110a = length2;
    }

    /* renamed from: a */
    public final int mo42146a(long j) {
        for (int c = zzbar.m42987c(this.f26114e, j, true, false); c >= 0; c--) {
            if ((this.f26115f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo42147b(long j) {
        for (int b = zzbar.m42986b(this.f26114e, j, true, false); b < this.f26114e.length; b++) {
            if ((this.f26115f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
