package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzff */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzff {

    /* renamed from: a */
    public static final byte[] f40034a = m57239c(1, 0);

    /* renamed from: b */
    public static final byte[] f40035b = m57239c(2, 32);

    /* renamed from: c */
    public static final byte[] f40036c = m57239c(2, 16);

    /* renamed from: d */
    public static final byte[] f40037d = m57239c(2, 17);

    /* renamed from: e */
    public static final byte[] f40038e = m57239c(2, 18);

    /* renamed from: f */
    public static final byte[] f40039f = m57239c(2, 1);

    /* renamed from: g */
    public static final byte[] f40040g = m57239c(2, 2);

    /* renamed from: h */
    public static final byte[] f40041h = m57239c(2, 3);

    /* renamed from: i */
    public static final byte[] f40042i = m57239c(2, 1);

    /* renamed from: j */
    public static final byte[] f40043j = m57239c(2, 2);

    /* renamed from: k */
    public static final byte[] f40044k = m57239c(2, 3);

    /* renamed from: l */
    public static final byte[] f40045l = new byte[0];

    /* renamed from: m */
    private static final byte[] f40046m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n */
    private static final byte[] f40047n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o */
    private static final byte[] f40048o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    static void m57237a(zznh zznh) throws GeneralSecurityException {
        if (zznh.mo49637H() == 2 || zznh.mo49637H() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(zznb.m57726a(zznh.mo49637H())));
        }
        String str = "UNRECOGNIZED";
        if (zznh.mo49636G() == 2 || zznh.mo49636G() == 1) {
            int G = zznh.mo49636G();
            if (G == 2) {
                str = "KDF_UNKNOWN";
            } else if (G == 3) {
                str = "HKDF_SHA256";
            } else if (G == 4) {
                str = "HKDF_SHA384";
            } else if (G == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (zznh.mo49635F() == 2 || zznh.mo49635F() == 1) {
            int F = zznh.mo49635F();
            if (F == 2) {
                str = "AEAD_UNKNOWN";
            } else if (F == 3) {
                str = "AES_128_GCM";
            } else if (F == 4) {
                str = "AES_256_GCM";
            } else if (F == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    static byte[] m57238b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzpp.m57921c(f40047n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m57239c(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: d */
    static byte[] m57240d(byte[] bArr) throws GeneralSecurityException {
        return zzpp.m57921c(f40046m, bArr);
    }

    /* renamed from: e */
    static byte[] m57241e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzpp.m57921c(f40048o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: f */
    static byte[] m57242f(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzpp.m57921c(m57239c(2, i), f40048o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: g */
    static int m57243g(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
