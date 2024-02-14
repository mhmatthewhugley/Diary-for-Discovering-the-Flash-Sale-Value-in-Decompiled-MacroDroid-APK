package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzges implements zzgar {

    /* renamed from: a */
    private final zzgew f36744a;

    /* renamed from: b */
    private final zzgeu f36745b;

    /* renamed from: c */
    private final zzgeq f36746c;

    /* renamed from: d */
    private final zzgep f36747d;

    private zzges(zzgew zzgew, zzgeu zzgeu, zzgep zzgep, zzgeq zzgeq, int i, byte[] bArr) {
        this.f36744a = zzgew;
        this.f36745b = zzgeu;
        this.f36747d = zzgep;
        this.f36746c = zzgeq;
    }

    /* renamed from: a */
    static zzges m51784a(zzglr zzglr) throws GeneralSecurityException {
        zzgew zzgew;
        if (!zzglr.mo46960O()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzglr.mo46958J().mo46967P()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzglr.mo46959K().mo47107h()) {
            zzglo G = zzglr.mo46958J().mo46965G();
            zzgeu b = zzgex.m51791b(G);
            zzgep c = zzgex.m51792c(G);
            zzgeq a = zzgex.m51790a(G);
            int K = G.mo46953K();
            int i = 1;
            if (K - 2 == 1) {
                int K2 = zzglr.mo46958J().mo46965G().mo46953K() - 2;
                if (K2 == 1) {
                    zzgew = zzgfh.m51822a(zzglr.mo46959K().mo47109i());
                } else if (K2 == 2 || K2 == 3 || K2 == 4) {
                    byte[] i2 = zzglr.mo46959K().mo47109i();
                    byte[] i3 = zzglr.mo46958J().mo46966L().mo47109i();
                    int K3 = zzglr.mo46958J().mo46965G().mo46953K() - 2;
                    if (K3 != 2) {
                        if (K3 == 3) {
                            i = 2;
                        } else if (K3 == 4) {
                            i = 3;
                        } else {
                            throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                        }
                    }
                    zzgew = zzgff.m51820a(i2, i3, i);
                } else {
                    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                }
                return new zzges(zzgew, b, c, a, 32, (byte[]) null);
            }
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgli.m52232a(K)));
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }
}
