package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgpb implements zzgak {

    /* renamed from: a */
    private final zzgdo f36989a;

    public zzgpb(byte[] bArr) throws GeneralSecurityException {
        this.f36989a = new zzgdo(bArr);
    }

    /* renamed from: a */
    public final byte[] mo46654a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.f36989a.mo46749c(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo46655b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] a = zzgox.m52491a(24);
        allocate.put(a);
        this.f36989a.mo46748b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
