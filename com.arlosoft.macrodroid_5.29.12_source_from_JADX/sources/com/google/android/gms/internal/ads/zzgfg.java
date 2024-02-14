package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgfg implements zzgeu {

    /* renamed from: a */
    private final zzgep f36785a;

    zzgfg(zzgep zzgep) {
        this.f36785a = zzgep;
    }

    /* renamed from: X */
    public final zzgev mo46764X(byte[] bArr) throws GeneralSecurityException {
        byte[] b = zzgpa.m52497b();
        byte[] a = zzgpa.m52496a(b, bArr);
        byte[] c = zzgpa.m52498c(b);
        byte[] c2 = zzgnv.m52433c(c, bArr);
        byte[] d = zzgfd.m51815d(zzgfd.f36767b);
        zzgep zzgep = this.f36785a;
        return new zzgev(zzgep.mo46758b((byte[]) null, a, "eae_prk", c2, "shared_secret", d, zzgep.mo46757a()), c);
    }

    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.f36785a.mo46759c(), zzgfd.f36771f)) {
            return zzgfd.f36767b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
