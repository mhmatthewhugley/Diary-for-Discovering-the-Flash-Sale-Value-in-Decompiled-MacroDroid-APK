package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzer */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzer implements zzet {
    zzer() {
    }

    /* renamed from: a */
    public final byte[] mo49393a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new zzdo(bArr).mo49388c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    public final int zza() {
        return 32;
    }

    public final byte[] zzb() {
        return zzff.f40044k;
    }
}
