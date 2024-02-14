package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgel {
    /* renamed from: a */
    public static void m51765a(zzgkk zzgkk) throws GeneralSecurityException {
        zzgoe.m52454k(m51767c(zzgkk.mo46910J().mo46930K()));
        m51766b(zzgkk.mo46910J().mo46931L());
        if (zzgkk.mo46911M() != 2) {
            zzgby.m51562c(zzgkk.mo46909F().mo46903I());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m51766b(int i) throws NoSuchAlgorithmException {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzgkx.m52195a(i))));
    }

    /* renamed from: c */
    public static int m51767c(int i) throws GeneralSecurityException {
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
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzgkv.m52194a(i))));
    }

    /* renamed from: d */
    public static int m51768d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzgkb.m52123a(i))));
            }
        }
        return i3;
    }
}
