package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgfe implements zzgeu {

    /* renamed from: a */
    private final zzgep f36781a;

    /* renamed from: b */
    private final int f36782b;

    private zzgfe(zzgep zzgep, int i) {
        this.f36781a = zzgep;
        this.f36782b = i;
    }

    /* renamed from: a */
    static zzgfe m51818a(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 == 0) {
            return new zzgfe(new zzgep("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new zzgfe(new zzgep("HmacSha512"), 3);
        }
        return new zzgfe(new zzgep("HmacSha384"), 2);
    }

    /* renamed from: X */
    public final zzgev mo46764X(byte[] bArr) throws GeneralSecurityException {
        KeyPair c = zzgoe.m52446c(zzgoe.m52454k(this.f36782b));
        byte[] g = zzgoe.m52450g((ECPrivateKey) c.getPrivate(), zzgoe.m52453j(zzgoe.m52454k(this.f36782b), 1, bArr));
        int i = this.f36782b;
        byte[] l = zzgoe.m52455l(zzgoe.m52454k(i).getCurve(), 1, ((ECPublicKey) c.getPublic()).getW());
        byte[] c2 = zzgnv.m52433c(l, bArr);
        byte[] d = zzgfd.m51815d(zzb());
        zzgep zzgep = this.f36781a;
        return new zzgev(zzgep.mo46758b((byte[]) null, g, "eae_prk", c2, "shared_secret", d, zzgep.mo46757a()), l);
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.f36782b - 1;
        if (i == 0) {
            return zzgfd.f36768c;
        }
        if (i != 1) {
            return zzgfd.f36770e;
        }
        return zzgfd.f36769d;
    }
}
