package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzcb {

    /* renamed from: a */
    public static final Charset f39942a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static zzok m57015a(zzof zzof) {
        zzoh C = zzok.m57851C();
        C.mo49685o(zzof.mo49681D());
        for (zzoe zzoe : zzof.mo49683I()) {
            zzoi D = zzoj.m57843D();
            D.mo49688q(zzoe.mo49676D().mo49659H());
            D.mo49689r(zzoe.mo49679L());
            D.mo49687o(zzoe.mo49677G());
            D.mo49686n(zzoe.mo49675C());
            C.mo49684n((zzoj) D.mo49069f());
        }
        return (zzok) C.mo49069f();
    }

    /* renamed from: b */
    public static void m57016b(zzof zzof) throws GeneralSecurityException {
        int D = zzof.mo49681D();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzoe zzoe : zzof.mo49683I()) {
            if (zzoe.mo49679L() == 3) {
                if (!zzoe.mo49678K()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzoe.mo49675C())}));
                } else if (zzoe.mo49677G() == zzoy.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzoe.mo49675C())}));
                } else if (zzoe.mo49679L() != 2) {
                    if (zzoe.mo49675C() == D) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= zzoe.mo49676D().mo49657D() == zznr.ASYMMETRIC_PUBLIC;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzoe.mo49675C())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
