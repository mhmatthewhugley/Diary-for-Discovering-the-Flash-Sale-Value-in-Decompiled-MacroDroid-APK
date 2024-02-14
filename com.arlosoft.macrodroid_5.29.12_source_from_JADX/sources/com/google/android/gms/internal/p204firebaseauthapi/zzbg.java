package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbg {
    /* renamed from: a */
    public static zzbf m56949a(String str) throws GeneralSecurityException {
        zzbf zzbf = (zzbf) zzbz.m57007l().get(str);
        if (zzbf != null) {
            return zzbf;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
