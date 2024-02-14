package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgbz {

    /* renamed from: a */
    public static final Charset f36676a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static zzgmp m51577a(zzgmk zzgmk) {
        zzgmm F = zzgmp.m52358F();
        F.mo47001o(zzgmk.mo46998G());
        for (zzgmj zzgmj : zzgmk.mo46999L()) {
            zzgmn F2 = zzgmo.m52351F();
            F2.mo47003o(zzgmj.mo46993G().mo46972J());
            F2.mo47005v(zzgmj.mo46995M());
            F2.mo47004u(zzgmj.mo46996N());
            F2.mo47002n(zzgmj.mo46992F());
            F.mo47000n((zzgmo) F2.mo47341h());
        }
        return (zzgmp) F.mo47341h();
    }

    /* renamed from: b */
    public static void m51578b(zzgmk zzgmk) throws GeneralSecurityException {
        int G = zzgmk.mo46998G();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgmj zzgmj : zzgmk.mo46999L()) {
            if (zzgmj.mo46995M() == 3) {
                if (!zzgmj.mo46994L()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzgmj.mo46992F())}));
                } else if (zzgmj.mo46996N() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzgmj.mo46992F())}));
                } else if (zzgmj.mo46995M() != 2) {
                    if (zzgmj.mo46992F() == G) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= zzgmj.mo46993G().mo46973M() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzgmj.mo46992F())}));
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
