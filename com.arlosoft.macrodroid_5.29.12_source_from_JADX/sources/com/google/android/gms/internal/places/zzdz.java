package com.google.android.gms.internal.places;

final class zzdz {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m63738a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzbk {
        if (m63749l(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m63749l(b3) || m63749l(b4)) {
            throw zzbk.m63367f();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m63739b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzbk {
        if (m63749l(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m63749l(b3)))) {
            throw zzbk.m63367f();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m63740c(byte b, byte b2, char[] cArr, int i) throws zzbk {
        if (b < -62 || m63749l(b2)) {
            throw zzbk.m63367f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m63741d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m63746i(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m63747j(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static boolean m63748k(byte b) {
        return b < -16;
    }

    /* renamed from: l */
    private static boolean m63749l(byte b) {
        return b > -65;
    }
}
