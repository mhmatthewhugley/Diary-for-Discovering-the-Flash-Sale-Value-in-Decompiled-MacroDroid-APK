package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import javax.mail.UIDFolder;

@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {

    /* renamed from: a */
    static final HashFunction f17528a = new FarmHashFingerprint64();

    FarmHashFingerprint64() {
    }

    @VisibleForTesting
    /* renamed from: h */
    static long m29678h(byte[] bArr, int i, int i2) {
        if (i2 <= 32) {
            if (i2 <= 16) {
                return m29679i(bArr, i, i2);
            }
            return m29681k(bArr, i, i2);
        } else if (i2 <= 64) {
            return m29682l(bArr, i, i2);
        } else {
            return m29683m(bArr, i, i2);
        }
    }

    /* renamed from: i */
    private static long m29679i(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j = ((long) (i2 * 2)) - 7286425919675154353L;
            long b = LittleEndianByteArray.m29770b(bArr, i) - 7286425919675154353L;
            long b2 = LittleEndianByteArray.m29770b(bArr, (i + i2) - 8);
            return m29680j((Long.rotateRight(b2, 37) * j) + b, (Long.rotateRight(b, 25) + b2) * j, j);
        } else if (i2 >= 4) {
            return m29680j(((long) i2) + ((((long) LittleEndianByteArray.m29769a(bArr, i)) & UIDFolder.MAXUID) << 3), ((long) LittleEndianByteArray.m29769a(bArr, (i + i2) - 4)) & UIDFolder.MAXUID, ((long) (i2 * 2)) - 7286425919675154353L);
        } else if (i2 <= 0) {
            return -7286425919675154353L;
        } else {
            return m29684n((((long) ((bArr[i] & 255) + ((bArr[(i2 >> 1) + i] & 255) << 8))) * -7286425919675154353L) ^ (((long) (i2 + ((bArr[i + (i2 - 1)] & 255) << 2))) * -4348849565147123417L)) * -7286425919675154353L;
        }
    }

    /* renamed from: j */
    private static long m29680j(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: k */
    private static long m29681k(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long j = ((long) (i2 * 2)) - 7286425919675154353L;
        long b = LittleEndianByteArray.m29770b(bArr, i) * -5435081209227447693L;
        long b2 = LittleEndianByteArray.m29770b(bArr2, i + 8);
        int i3 = i + i2;
        long b3 = LittleEndianByteArray.m29770b(bArr2, i3 - 8) * j;
        return m29680j((LittleEndianByteArray.m29770b(bArr2, i3 - 16) * -7286425919675154353L) + Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30), b + Long.rotateRight(b2 - 7286425919675154353L, 18) + b3, j);
    }

    /* renamed from: l */
    private static long m29682l(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long j = ((long) (i2 * 2)) - 7286425919675154353L;
        long b = LittleEndianByteArray.m29770b(bArr, i) * -7286425919675154353L;
        long b2 = LittleEndianByteArray.m29770b(bArr2, i + 8);
        int i3 = i + i2;
        long b3 = LittleEndianByteArray.m29770b(bArr2, i3 - 8) * j;
        long rotateRight = Long.rotateRight(b + b2, 43) + Long.rotateRight(b3, 30) + (LittleEndianByteArray.m29770b(bArr2, i3 - 16) * -7286425919675154353L);
        long j2 = m29680j(rotateRight, b3 + Long.rotateRight(b2 - 7286425919675154353L, 18) + b, j);
        long b4 = LittleEndianByteArray.m29770b(bArr2, i + 16) * j;
        long b5 = LittleEndianByteArray.m29770b(bArr2, i + 24);
        long b6 = (rotateRight + LittleEndianByteArray.m29770b(bArr2, i3 - 32)) * j;
        return m29680j(((j2 + LittleEndianByteArray.m29770b(bArr2, i3 - 24)) * j) + Long.rotateRight(b4 + b5, 43) + Long.rotateRight(b6, 30), b4 + Long.rotateRight(b5 + b, 18) + b6, j);
    }

    /* renamed from: m */
    private static long m29683m(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        long j = (long) 81;
        long j2 = (j * -5435081209227447693L) + 113;
        long n = m29684n((j2 * -7286425919675154353L) + 113) * -7286425919675154353L;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long b = (j * -7286425919675154353L) + LittleEndianByteArray.m29770b(bArr, i);
        int i3 = i2 - 1;
        int i4 = i + ((i3 / 64) * 64);
        int i5 = i3 & 63;
        int i6 = (i4 + i5) - 63;
        int i7 = i;
        while (true) {
            long rotateRight = (Long.rotateRight(((b + j2) + jArr[0]) + LittleEndianByteArray.m29770b(bArr2, i7 + 8), 37) * -5435081209227447693L) ^ jArr2[1];
            long rotateRight2 = (Long.rotateRight(j2 + jArr[1] + LittleEndianByteArray.m29770b(bArr2, i7 + 48), 42) * -5435081209227447693L) + jArr[0] + LittleEndianByteArray.m29770b(bArr2, i7 + 40);
            long rotateRight3 = Long.rotateRight(n + jArr2[0], 33) * -5435081209227447693L;
            m29685p(bArr, i7, jArr[1] * -5435081209227447693L, rotateRight + jArr2[0], jArr);
            m29685p(bArr, i7 + 32, rotateRight3 + jArr2[1], rotateRight2 + LittleEndianByteArray.m29770b(bArr2, i7 + 16), jArr2);
            int i8 = i7 + 64;
            if (i8 == i4) {
                long j3 = -5435081209227447693L + ((rotateRight & 255) << 1);
                jArr2[0] = jArr2[0] + ((long) i5);
                jArr[0] = jArr[0] + jArr2[0];
                jArr2[0] = jArr2[0] + jArr[0];
                long rotateRight4 = (Long.rotateRight(((rotateRight3 + rotateRight2) + jArr[0]) + LittleEndianByteArray.m29770b(bArr2, i6 + 8), 37) * j3) ^ (jArr2[1] * 9);
                long rotateRight5 = (Long.rotateRight(rotateRight2 + jArr[1] + LittleEndianByteArray.m29770b(bArr2, i6 + 48), 42) * j3) + (jArr[0] * 9) + LittleEndianByteArray.m29770b(bArr2, i6 + 40);
                long rotateRight6 = Long.rotateRight(rotateRight + jArr2[0], 33) * j3;
                byte[] bArr3 = bArr;
                m29685p(bArr3, i6, jArr[1] * j3, rotateRight4 + jArr2[0], jArr);
                m29685p(bArr3, i6 + 32, rotateRight6 + jArr2[1], rotateRight5 + LittleEndianByteArray.m29770b(bArr2, i6 + 16), jArr2);
                long j4 = j3;
                return m29680j(m29680j(jArr[0], jArr2[0], j4) + (m29684n(rotateRight5) * -4348849565147123417L) + rotateRight4, m29680j(jArr[1], jArr2[1], j4) + rotateRight6, j4);
            }
            i7 = i8;
            n = rotateRight;
            j2 = rotateRight2;
            b = rotateRight3;
        }
    }

    /* renamed from: n */
    private static long m29684n(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: p */
    private static void m29685p(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = LittleEndianByteArray.m29770b(bArr, i);
        long b2 = LittleEndianByteArray.m29770b(bArr, i + 8);
        long b3 = LittleEndianByteArray.m29770b(bArr, i + 16);
        long b4 = LittleEndianByteArray.m29770b(bArr, i + 24);
        long j3 = j + b;
        long j4 = b2 + j3 + b3;
        jArr[0] = j4 + b4;
        jArr[1] = Long.rotateRight(j2 + j3 + b4, 21) + Long.rotateRight(j4, 44) + j3;
    }

    /* renamed from: b */
    public int mo36981b() {
        return 64;
    }

    /* renamed from: g */
    public HashCode mo36967g(byte[] bArr, int i, int i2) {
        Preconditions.m5397x(i, i + i2, bArr.length);
        return HashCode.m29717h(m29678h(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
