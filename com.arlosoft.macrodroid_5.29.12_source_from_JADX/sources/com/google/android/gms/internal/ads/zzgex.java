package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgex {
    /* renamed from: a */
    static zzgeq m51790a(zzglo zzglo) throws GeneralSecurityException {
        if (zzglo.mo46951I() == 3) {
            return new zzgen(16);
        }
        if (zzglo.mo46951I() == 4) {
            return new zzgen(32);
        }
        if (zzglo.mo46951I() == 5) {
            return new zzgeo();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    static zzgeu m51791b(zzglo zzglo) throws GeneralSecurityException {
        if (zzglo.mo46953K() == 3) {
            return new zzgfg(new zzgep("HmacSha256"));
        }
        if (zzglo.mo46953K() == 4) {
            return zzgfe.m51818a(1);
        }
        if (zzglo.mo46953K() == 5) {
            return zzgfe.m51818a(2);
        }
        if (zzglo.mo46953K() == 6) {
            return zzgfe.m51818a(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    static zzgep m51792c(zzglo zzglo) {
        if (zzglo.mo46952J() == 3) {
            return new zzgep("HmacSha256");
        }
        if (zzglo.mo46952J() == 4) {
            return new zzgep("HmacSha384");
        }
        if (zzglo.mo46952J() == 5) {
            return new zzgep("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
