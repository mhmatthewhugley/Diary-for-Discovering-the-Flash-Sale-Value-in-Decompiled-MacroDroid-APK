package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzavt {

    /* renamed from: d */
    private static final long[] f25848d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f25849a = new byte[8];

    /* renamed from: b */
    private int f25850b;

    /* renamed from: c */
    private int f25851c;

    /* renamed from: b */
    public static int m42624b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f25848d[i2] & ((long) i)) > 0 ? 1 : ((f25848d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m42625c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f25848d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo42129a() {
        return this.f25851c;
    }

    /* renamed from: d */
    public final void mo42130d() {
        this.f25850b = 0;
        this.f25851c = 0;
    }

    /* renamed from: e */
    public final long mo42131e(zzauy zzauy, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f25850b == 0) {
            if (!zzauy.mo42100h(this.f25849a, 0, 1, z)) {
                return -1;
            }
            int b = m42624b(this.f25849a[0] & 255);
            this.f25851c = b;
            if (b != -1) {
                this.f25850b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f25851c;
        if (i2 > i) {
            this.f25850b = 0;
            return -2;
        }
        if (i2 != 1) {
            zzauy.mo42100h(this.f25849a, 1, i2 - 1, false);
        }
        this.f25850b = 0;
        return m42625c(this.f25849a, this.f25851c, z2);
    }
}
