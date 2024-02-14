package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbad {

    /* renamed from: a */
    private static final byte[] f26393a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f26394b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f26395c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair m42928a(byte[] bArr) {
        zzbaj zzbaj = new zzbaj(bArr, bArr.length);
        int c = m42930c(zzbaj);
        int d = m42931d(zzbaj);
        int a = zzbaj.mo42314a(4);
        if (c == 5 || c == 29) {
            d = m42931d(zzbaj);
            if (m42930c(zzbaj) == 22) {
                a = zzbaj.mo42314a(4);
            }
        }
        int i = f26395c[a];
        zzbac.m42924c(i != -1);
        return Pair.create(Integer.valueOf(d), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static byte[] m42929b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(f26393a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    /* renamed from: c */
    private static int m42930c(zzbaj zzbaj) {
        int a = zzbaj.mo42314a(5);
        return a == 31 ? zzbaj.mo42314a(6) + 32 : a;
    }

    /* renamed from: d */
    private static int m42931d(zzbaj zzbaj) {
        int a = zzbaj.mo42314a(4);
        if (a == 15) {
            return zzbaj.mo42314a(24);
        }
        zzbac.m42924c(a < 13);
        return f26394b[a];
    }
}
