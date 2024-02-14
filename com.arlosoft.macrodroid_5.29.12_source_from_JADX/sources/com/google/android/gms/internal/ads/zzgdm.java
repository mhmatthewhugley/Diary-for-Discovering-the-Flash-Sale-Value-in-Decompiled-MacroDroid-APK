package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzgdm {

    /* renamed from: a */
    private final zzgdk f36705a;

    /* renamed from: b */
    private final zzgdk f36706b;

    public zzgdm(byte[] bArr) throws GeneralSecurityException {
        if (zzgds.m51728a(1)) {
            this.f36705a = mo46747a(bArr, 1);
            this.f36706b = mo46747a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: e */
    private final byte[] m51711e(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.f36706b.mo46744c(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: f */
    private static byte[] m51712f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i = length & 15;
        int i2 = i == 0 ? length : (length + 16) - i;
        int remaining = byteBuffer.remaining();
        int i3 = remaining % 16;
        int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
        ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i2);
        order.put(byteBuffer);
        order.position(i4);
        order.putLong((long) length);
        order.putLong((long) remaining);
        return order.array();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract zzgdk mo46747a(byte[] bArr, int i) throws InvalidKeyException;

    /* renamed from: b */
    public final void mo46748b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.f36705a.mo46745d(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] a = zzgdp.m51720a(m51711e(bArr), m51712f(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: c */
    public final byte[] mo46749c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                if (zzgnv.m52432b(zzgdp.m51720a(m51711e(bArr), m51712f(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    return this.f36705a.mo46746e(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: d */
    public final byte[] mo46750d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length <= 2147483631) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            mo46748b(allocate, bArr, bArr2, bArr3);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
