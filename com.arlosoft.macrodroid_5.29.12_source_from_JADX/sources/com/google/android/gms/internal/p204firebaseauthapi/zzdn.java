package com.google.android.gms.internal.p204firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdn */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class zzdn {

    /* renamed from: a */
    int[] f39976a;

    /* renamed from: b */
    private final int f39977b;

    public zzdn(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f39976a = zzdj.m57130d(bArr);
            this.f39977b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo49382a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int[] mo49383b(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ByteBuffer mo49384c(byte[] bArr, int i) {
        int[] b = mo49383b(zzdj.m57130d(bArr), i);
        int[] iArr = (int[]) b.clone();
        zzdj.m57129c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final byte[] mo49385d(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == mo49382a()) {
            int remaining = byteBuffer.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer c = mo49384c(bArr, this.f39977b + i2);
                if (i2 == i - 1) {
                    zzpp.m57919a(allocate, byteBuffer, c, remaining % 64);
                } else {
                    zzpp.m57919a(allocate, byteBuffer, c, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo49382a());
    }
}
