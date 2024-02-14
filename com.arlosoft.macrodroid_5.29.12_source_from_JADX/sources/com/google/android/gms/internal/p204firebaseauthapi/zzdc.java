package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzdc implements zzap {

    /* renamed from: c */
    private static final byte[] f39967c = new byte[0];

    /* renamed from: a */
    private final zznx f39968a;

    /* renamed from: b */
    private final zzap f39969b;

    public zzdc(zznx zznx, zzap zzap) {
        this.f39968a = zznx;
        this.f39969b = zzap;
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzap) zzbz.m57005j(this.f39968a.mo49665H(), this.f39969b.mo49299a(bArr3, f39967c), zzap.class)).mo49299a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
