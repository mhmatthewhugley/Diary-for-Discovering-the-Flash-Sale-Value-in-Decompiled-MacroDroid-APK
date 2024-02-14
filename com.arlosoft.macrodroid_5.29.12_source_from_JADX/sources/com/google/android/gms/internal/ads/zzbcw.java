package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbcw extends zzbcr {

    /* renamed from: c */
    private MessageDigest f26635c;

    /* renamed from: b */
    public final byte[] mo42483b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int a = zzbcv.m43143a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else {
            if (length < 5) {
                bArr2 = new byte[(length + length)];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int a2 = zzbcv.m43143a(split[i2]);
                    char c = (a2 >> 16) ^ ((char) a2);
                    byte[] bArr3 = {(byte) c, (byte) (c >> 8)};
                    int i3 = i2 + i2;
                    bArr2[i3] = bArr3[0];
                    bArr2[i3 + 1] = bArr3[1];
                }
            } else {
                bArr2 = new byte[length];
                for (int i4 = 0; i4 < split.length; i4++) {
                    int a3 = zzbcv.m43143a(split[i4]);
                    bArr2[i4] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
                }
            }
            bArr = bArr2;
        }
        this.f26635c = mo42482a();
        synchronized (this.f26630a) {
            MessageDigest messageDigest = this.f26635c;
            if (messageDigest == null) {
                byte[] bArr4 = new byte[0];
                return bArr4;
            }
            messageDigest.reset();
            this.f26635c.update(bArr);
            byte[] digest = this.f26635c.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr5 = new byte[i];
            System.arraycopy(digest, 0, bArr5, 0, i);
            return bArr5;
        }
    }
}
