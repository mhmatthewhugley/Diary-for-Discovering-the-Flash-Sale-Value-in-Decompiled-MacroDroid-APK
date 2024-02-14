package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgof implements zzgak {

    /* renamed from: a */
    private final zzgor f36958a;

    /* renamed from: b */
    private final zzgbj f36959b;

    /* renamed from: c */
    private final int f36960c;

    public zzgof(zzgor zzgor, zzgbj zzgbj, int i) {
        this.f36958a = zzgor;
        this.f36959b = zzgbj;
        this.f36960c = i;
    }

    /* renamed from: a */
    public final byte[] mo46654a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f36960c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.f36960c, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
            this.f36959b.mo46693a(copyOfRange2, zzgnv.m52433c(bArr2, copyOfRange, copyOf));
            return this.f36958a.mo47025X(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo46655b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] b = this.f36958a.mo47026b(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(0).array(), 8);
        return zzgnv.m52433c(b, this.f36959b.mo46694b(zzgnv.m52433c(bArr2, b, copyOf)));
    }
}
