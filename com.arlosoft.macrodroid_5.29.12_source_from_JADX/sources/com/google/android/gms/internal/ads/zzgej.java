package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgej implements zzgas {

    /* renamed from: a */
    final zzgbu f36728a;

    public zzgej(zzgbu zzgbu) {
        this.f36728a = zzgbu;
    }

    /* renamed from: a */
    public final byte[] mo46661a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgbu zzgbu = this.f36728a;
        if (zzgbu.mo46710a() != null) {
            return zzgnv.m52433c(zzgbu.mo46710a().mo46702d(), ((zzgas) this.f36728a.mo46710a().mo46701c()).mo46661a(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
