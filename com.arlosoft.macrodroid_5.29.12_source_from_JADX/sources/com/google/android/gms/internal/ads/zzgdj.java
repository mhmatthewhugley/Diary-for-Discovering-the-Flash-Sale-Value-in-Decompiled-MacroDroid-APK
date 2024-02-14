package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgdj extends zzgdk {
    public zzgdj(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo46742a() {
        return 12;
    }

    /* renamed from: b */
    public final int[] mo46743b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzgdg.m51695b(iArr2, this.f36703a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
