package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzgdk {

    /* renamed from: a */
    int[] f36703a;

    /* renamed from: b */
    private final int f36704b;

    public zzgdk(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f36703a = zzgdg.m51697d(bArr);
            this.f36704b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: f */
    private final void m51704f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == mo46742a()) {
            int remaining = byteBuffer2.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer c = mo46744c(bArr, this.f36704b + i2);
                if (i2 == i - 1) {
                    zzgnv.m52431a(byteBuffer, byteBuffer2, c, remaining % 64);
                } else {
                    zzgnv.m52431a(byteBuffer, byteBuffer2, c, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo46742a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo46742a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int[] mo46743b(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ByteBuffer mo46744c(byte[] bArr, int i) {
        int[] b = mo46743b(zzgdg.m51697d(bArr), i);
        int[] iArr = (int[]) b.clone();
        zzgdg.m51696c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final void mo46745d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            m51704f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: e */
    public final byte[] mo46746e(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        m51704f(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
