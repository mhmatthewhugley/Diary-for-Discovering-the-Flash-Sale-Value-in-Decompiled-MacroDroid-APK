package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzdm extends zzdn {
    public zzdm(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo49382a() {
        return 12;
    }

    /* renamed from: b */
    public final int[] mo49383b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            zzdj.m57128b(iArr2, this.f39976a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
