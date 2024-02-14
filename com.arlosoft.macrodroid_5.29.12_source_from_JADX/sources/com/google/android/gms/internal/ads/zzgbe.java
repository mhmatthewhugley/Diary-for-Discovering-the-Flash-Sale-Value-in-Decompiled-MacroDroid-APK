package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbe {
    /* renamed from: a */
    public static zzgbd m51525a(String str) throws GeneralSecurityException {
        zzgbd zzgbd = (zzgbd) zzgby.m51570k().get(str);
        if (zzgbd != null) {
            return zzgbd;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
