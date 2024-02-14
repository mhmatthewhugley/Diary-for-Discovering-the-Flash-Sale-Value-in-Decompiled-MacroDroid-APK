package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpn implements zzap {

    /* renamed from: a */
    private final zzdl f40297a;

    public zzpn(byte[] bArr) throws GeneralSecurityException {
        if (zzdv.m57153a(2)) {
            this.f40297a = new zzdl(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f40297a.mo49381a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
