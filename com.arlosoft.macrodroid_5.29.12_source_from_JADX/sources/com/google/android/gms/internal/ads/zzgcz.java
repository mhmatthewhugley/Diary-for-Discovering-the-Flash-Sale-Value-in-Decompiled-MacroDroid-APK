package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgcz implements zzgak {

    /* renamed from: c */
    private static final byte[] f36694c = new byte[0];

    /* renamed from: a */
    private final zzgmc f36695a;

    /* renamed from: b */
    private final zzgak f36696b;

    public zzgcz(zzgmc zzgmc, zzgak zzgak) {
        this.f36695a = zzgmc;
        this.f36696b = zzgak;
    }

    /* renamed from: a */
    public final byte[] mo46654a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
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
            return ((zzgak) zzgby.m51568i(this.f36695a.mo46978J(), this.f36696b.mo46654a(bArr3, f36694c), zzgak.class)).mo46654a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* renamed from: b */
    public final byte[] mo46655b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] p = zzgby.m51563d(this.f36695a).mo47050p();
        byte[] b = this.f36696b.mo46655b(p, f36694c);
        byte[] b2 = ((zzgak) zzgby.m51568i(this.f36695a.mo46978J(), p, zzgak.class)).mo46655b(bArr, bArr2);
        int length = b.length;
        return ByteBuffer.allocate(length + 4 + b2.length).putInt(length).put(b).put(b2).array();
    }
}
