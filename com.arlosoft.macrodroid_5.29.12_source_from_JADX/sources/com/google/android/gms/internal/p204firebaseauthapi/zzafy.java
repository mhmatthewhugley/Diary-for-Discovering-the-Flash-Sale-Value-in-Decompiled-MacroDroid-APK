package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafy {
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m56860a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m56864e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m56864e(b3) || m56864e(b4)) {
            throw zzadn.m56468d();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m56861b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m56864e(b2)) {
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
            if (!m56864e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzadn.m56468d();
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ void m56862c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m56864e(b2)) {
            throw zzadn.m56468d();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: d */
    static /* bridge */ /* synthetic */ boolean m56863d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m56864e(byte b) {
        return b > -65;
    }
}
