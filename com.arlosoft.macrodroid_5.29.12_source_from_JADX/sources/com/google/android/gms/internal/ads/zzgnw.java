package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgnw implements zzgak {

    /* renamed from: a */
    private final zzgdl f36938a;

    public zzgnw(byte[] bArr) throws GeneralSecurityException {
        this.f36938a = new zzgdl(bArr);
    }

    /* renamed from: a */
    public final byte[] mo46654a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.f36938a.mo46749c(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo46655b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] a = zzgox.m52491a(12);
        allocate.put(a);
        this.f36938a.mo46748b(allocate, a, bArr, bArr2);
        return allocate.array();
    }
}
