package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmz {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m60872a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m60876e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m60876e(b3) || m60876e(b4)) {
            throw zzkp.m60548c();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m60873b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m60876e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m60876e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkp.m60548c();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m60874c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m60876e(b2)) {
            throw zzkp.m60548c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m60875d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m60876e(byte b) {
        return b > -65;
    }
}
