package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzeq implements zzet {

    /* renamed from: a */
    private final int f40012a;

    zzeq(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            this.f40012a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    /* renamed from: a */
    public final byte[] mo49393a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.f40012a) {
            return new zzdl(bArr, false).mo49381a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    public final int zza() {
        return this.f40012a;
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.f40012a;
        if (i == 16) {
            return zzff.f40042i;
        }
        if (i == 32) {
            return zzff.f40043j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
