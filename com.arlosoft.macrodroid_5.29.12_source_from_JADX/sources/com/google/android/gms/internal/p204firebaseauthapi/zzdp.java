package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzdp {

    /* renamed from: a */
    private final zzdn f39978a;

    /* renamed from: b */
    private final zzdn f39979b;

    public zzdp(byte[] bArr) throws GeneralSecurityException {
        if (zzdv.m57153a(1)) {
            this.f39978a = mo49386a(bArr, 1);
            this.f39979b = mo49386a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract zzdn mo49386a(byte[] bArr, int i) throws InvalidKeyException;

    /* renamed from: b */
    public final byte[] mo49387b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                byte[] bArr4 = new byte[32];
                this.f39979b.mo49384c(bArr, 0).get(bArr4);
                int remaining = byteBuffer.remaining();
                int i = remaining % 16;
                int i2 = i == 0 ? remaining : (remaining + 16) - i;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(byteBuffer);
                order.position(i2);
                order.putLong(0);
                order.putLong((long) remaining);
                if (zzpp.m57920b(zzds.m57146a(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.f39978a.mo49385d(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: c */
    public final byte[] mo49388c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return mo49387b(ByteBuffer.wrap(bArr2), bArr, bArr3);
    }
}
