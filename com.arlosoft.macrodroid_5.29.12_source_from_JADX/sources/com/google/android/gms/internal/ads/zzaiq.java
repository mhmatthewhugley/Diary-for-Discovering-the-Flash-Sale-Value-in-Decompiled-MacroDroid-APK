package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaiq {
    /* renamed from: a */
    public static int m41545a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public static long m41546b(zzef zzef, int i, int i2) {
        zzef.mo45230f(i);
        if (zzef.mo45233i() < 5) {
            return -9223372036854775807L;
        }
        int m = zzef.mo45237m();
        if ((8388608 & m) != 0 || ((m >> 8) & 8191) != i2 || (m & 32) == 0 || zzef.mo45243s() < 7 || zzef.mo45233i() < 7 || (zzef.mo45243s() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzef.mo45226b(bArr, 0, 6);
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
