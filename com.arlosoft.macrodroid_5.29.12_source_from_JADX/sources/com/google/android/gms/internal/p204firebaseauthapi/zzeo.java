package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzeo {
    /* renamed from: a */
    public static void m57194a(zzma zzma) throws GeneralSecurityException {
        zzpx.m57941l(m57196c(zzma.mo49591G().mo49611H()));
        m57195b(zzma.mo49591G().mo49612I());
        if (zzma.mo49592J() != 2) {
            zzbz.m56998c(zzma.mo49590C().mo49584F());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: b */
    public static String m57195b(int i) throws NoSuchAlgorithmException {
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
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzmq.m57689a(i))));
    }

    /* renamed from: c */
    public static int m57196c(int i) throws GeneralSecurityException {
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
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzml.m57679a(i))));
    }

    /* renamed from: d */
    public static int m57197d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzlr.m57608a(i))));
            }
        }
        return i3;
    }
}
