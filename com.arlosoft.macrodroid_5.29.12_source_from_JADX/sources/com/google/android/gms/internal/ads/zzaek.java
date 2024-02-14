package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaek {

    /* renamed from: d */
    private static final long[] f24139d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f24140a = new byte[8];

    /* renamed from: b */
    private int f24141b;

    /* renamed from: c */
    private int f24142c;

    /* renamed from: b */
    public static int m41176b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f24139d[i2] & ((long) i)) > 0 ? 1 : ((f24139d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m41177c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f24139d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo41409a() {
        return this.f24142c;
    }

    /* renamed from: d */
    public final long mo41410d(zzzj zzzj, boolean z, boolean z2, int i) throws IOException {
        if (this.f24141b == 0) {
            if (!zzzj.mo48453i(this.f24140a, 0, 1, z)) {
                return -1;
            }
            int b = m41176b(this.f24140a[0] & 255);
            this.f24142c = b;
            if (b != -1) {
                this.f24141b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f24142c;
        if (i2 > i) {
            this.f24141b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((zzyy) zzzj).mo48453i(this.f24140a, 1, i2 - 1, false);
        }
        this.f24141b = 0;
        return m41177c(this.f24140a, this.f24142c, z2);
    }

    /* renamed from: e */
    public final void mo41411e() {
        this.f24141b = 0;
        this.f24142c = 0;
    }
}
