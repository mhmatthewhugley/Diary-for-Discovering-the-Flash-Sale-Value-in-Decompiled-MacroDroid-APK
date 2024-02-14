package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzget implements zzgas {

    /* renamed from: e */
    private static final byte[] f36748e = new byte[0];

    /* renamed from: a */
    private final zzglu f36749a;

    /* renamed from: b */
    private final zzgeu f36750b;

    /* renamed from: c */
    private final zzgeq f36751c;

    /* renamed from: d */
    private final zzgep f36752d;

    private zzget(zzglu zzglu, zzgeu zzgeu, zzgep zzgep, zzgeq zzgeq, byte[] bArr) {
        this.f36749a = zzglu;
        this.f36750b = zzgeu;
        this.f36752d = zzgep;
        this.f36751c = zzgeq;
    }

    /* renamed from: b */
    static zzget m51785b(zzglu zzglu) throws GeneralSecurityException {
        if (!zzglu.mo46966L().mo47107h()) {
            zzglo G = zzglu.mo46965G();
            return new zzget(zzglu, zzgex.m51791b(G), zzgex.m51792c(G), zzgex.m51790a(G), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    /* renamed from: a */
    public final byte[] mo46661a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzglu zzglu = this.f36749a;
        zzgeu zzgeu = this.f36750b;
        zzgep zzgep = this.f36752d;
        zzgeq zzgeq = this.f36751c;
        zzgev X = zzgeu.mo46764X(zzglu.mo46966L().mo47109i());
        zzger c = zzger.m51780c(X.mo46766a(), X.mo46767b(), zzgeu, zzgep, zzgeq, bArr3);
        return zzgnv.m52433c(c.mo46762a(), c.mo46763b(bArr, f36748e));
    }
}
