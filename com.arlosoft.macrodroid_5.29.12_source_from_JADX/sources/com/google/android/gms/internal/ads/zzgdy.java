package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgdy implements zzgaq {

    /* renamed from: a */
    private final zzgbu f36715a;

    /* renamed from: b */
    private final zzghn f36716b;

    /* renamed from: c */
    private final zzghn f36717c;

    public zzgdy(zzgbu zzgbu) {
        zzghn zzghn;
        this.f36715a = zzgbu;
        if (zzgbu.mo46715f()) {
            zzgho b = zzgfx.m51847a().mo46782b();
            zzght a = zzgfu.m51845a(zzgbu);
            this.f36716b = b.mo46781a(a, "daead", "encrypt");
            zzghn = b.mo46781a(a, "daead", "decrypt");
        } else {
            zzghn = zzgfu.f36802a;
            this.f36716b = zzghn;
        }
        this.f36717c = zzghn;
    }

    /* renamed from: a */
    public final byte[] mo46660a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] c = zzgnv.m52433c(this.f36715a.mo46710a().mo46702d(), ((zzgaq) this.f36715a.mo46710a().mo46701c()).mo46660a(bArr, bArr2));
            this.f36715a.mo46710a().mo46699a();
            int length = bArr.length;
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
