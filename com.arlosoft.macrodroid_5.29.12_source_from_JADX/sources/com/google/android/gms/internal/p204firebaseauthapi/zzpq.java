package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpq implements zzap {

    /* renamed from: a */
    private final zzdo f40302a;

    public zzpq(byte[] bArr) throws GeneralSecurityException {
        this.f40302a = new zzdo(bArr);
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f40302a.mo49387b(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
