package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpy implements zzap {

    /* renamed from: a */
    private final zzqk f40318a;

    /* renamed from: b */
    private final zzbm f40319b;

    /* renamed from: c */
    private final int f40320c;

    public zzpy(zzqk zzqk, zzbm zzbm, int i) {
        this.f40318a = zzqk;
        this.f40319b = zzbm;
        this.f40320c = i;
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f40320c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f40320c, length);
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
            this.f40319b.mo49341a(copyOfRange2, zzpp.m57921c(bArr2, copyOfRange, copyOf));
            return this.f40318a.mo49711X(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
