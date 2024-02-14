package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzfi implements zzex {

    /* renamed from: a */
    private final zzes f40053a;

    zzfi(zzes zzes) {
        this.f40053a = zzes;
    }

    /* renamed from: a */
    public final byte[] mo49402a(byte[] bArr, zzey zzey) throws GeneralSecurityException {
        byte[] a = zzqt.m57982a(zzey.zza().mo49722c(), bArr);
        byte[] c = zzpp.m57921c(bArr, zzey.zzb().mo49722c());
        byte[] d = zzff.m57240d(zzff.f40035b);
        zzes zzes = this.f40053a;
        return zzes.mo49397b((byte[]) null, a, "eae_prk", c, "shared_secret", d, zzes.mo49396a());
    }

    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.f40053a.mo49398c(), zzff.f40039f)) {
            return zzff.f40035b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
