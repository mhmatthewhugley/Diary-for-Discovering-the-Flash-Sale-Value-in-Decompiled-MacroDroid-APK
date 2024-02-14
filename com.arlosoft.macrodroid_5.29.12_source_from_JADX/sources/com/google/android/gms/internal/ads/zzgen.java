package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgen implements zzgeq {

    /* renamed from: a */
    private final int f36735a;

    zzgen(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            this.f36735a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    /* renamed from: a */
    public final byte[] mo46754a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.f36735a) {
            return new zzgdi(bArr, false).mo46741b(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    public final int zza() {
        return this.f36735a;
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.f36735a;
        if (i == 16) {
            return zzgfd.f36774i;
        }
        if (i == 32) {
            return zzgfd.f36775j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
