package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgfd {

    /* renamed from: a */
    public static final byte[] f36766a = m51814c(1, 0);

    /* renamed from: b */
    public static final byte[] f36767b = m51814c(2, 32);

    /* renamed from: c */
    public static final byte[] f36768c = m51814c(2, 16);

    /* renamed from: d */
    public static final byte[] f36769d = m51814c(2, 17);

    /* renamed from: e */
    public static final byte[] f36770e = m51814c(2, 18);

    /* renamed from: f */
    public static final byte[] f36771f = m51814c(2, 1);

    /* renamed from: g */
    public static final byte[] f36772g = m51814c(2, 2);

    /* renamed from: h */
    public static final byte[] f36773h = m51814c(2, 3);

    /* renamed from: i */
    public static final byte[] f36774i = m51814c(2, 1);

    /* renamed from: j */
    public static final byte[] f36775j = m51814c(2, 2);

    /* renamed from: k */
    public static final byte[] f36776k = m51814c(2, 3);

    /* renamed from: l */
    public static final byte[] f36777l = new byte[0];

    /* renamed from: m */
    private static final byte[] f36778m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n */
    private static final byte[] f36779n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o */
    private static final byte[] f36780o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    static void m51812a(zzglo zzglo) throws GeneralSecurityException {
        if (zzglo.mo46953K() == 2 || zzglo.mo46953K() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(zzgli.m52232a(zzglo.mo46953K())));
        }
        String str = "UNRECOGNIZED";
        if (zzglo.mo46952J() == 2 || zzglo.mo46952J() == 1) {
            int J = zzglo.mo46952J();
            if (J == 2) {
                str = "KDF_UNKNOWN";
            } else if (J == 3) {
                str = "HKDF_SHA256";
            } else if (J == 4) {
                str = "HKDF_SHA384";
            } else if (J == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (zzglo.mo46951I() == 2 || zzglo.mo46951I() == 1) {
            int I = zzglo.mo46951I();
            if (I == 2) {
                str = "AEAD_UNKNOWN";
            } else if (I == 3) {
                str = "AES_128_GCM";
            } else if (I == 4) {
                str = "AES_256_GCM";
            } else if (I == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    static byte[] m51813b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzgnv.m52433c(f36779n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m51814c(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: d */
    static byte[] m51815d(byte[] bArr) throws GeneralSecurityException {
        return zzgnv.m52433c(f36778m, bArr);
    }

    /* renamed from: e */
    static byte[] m51816e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzgnv.m52433c(f36780o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: f */
    static byte[] m51817f(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzgnv.m52433c(m51814c(2, i), f36780o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
