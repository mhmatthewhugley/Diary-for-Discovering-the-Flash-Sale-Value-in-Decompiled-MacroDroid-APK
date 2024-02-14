package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqu implements zzap {

    /* renamed from: a */
    private final zzdr f40349a;

    public zzqu(byte[] bArr) throws GeneralSecurityException {
        this.f40349a = new zzdr(bArr);
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f40349a.mo49387b(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
