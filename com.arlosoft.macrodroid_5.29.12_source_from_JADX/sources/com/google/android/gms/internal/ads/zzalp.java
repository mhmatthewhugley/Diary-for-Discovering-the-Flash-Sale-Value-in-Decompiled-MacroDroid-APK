package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzalp {
    /* renamed from: a */
    public static double m41709a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    /* renamed from: b */
    public static double m41710b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return ((double) (((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255))) / 65536.0d;
    }

    /* renamed from: c */
    public static int m41711c(byte b) {
        return b < 0 ? b + 256 : b;
    }

    /* renamed from: d */
    public static int m41712d(ByteBuffer byteBuffer) {
        return (m41711c(byteBuffer.get()) << 8) + m41711c(byteBuffer.get());
    }

    /* renamed from: e */
    public static long m41713e(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    /* renamed from: f */
    public static long m41714f(ByteBuffer byteBuffer) {
        long e = m41713e(byteBuffer) << 32;
        if (e >= 0) {
            return e + m41713e(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
