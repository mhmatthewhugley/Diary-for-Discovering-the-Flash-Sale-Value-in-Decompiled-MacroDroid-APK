package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {

    /* renamed from: a */
    static final HashFunction f17529a = new Fingerprint2011();

    Fingerprint2011() {
    }

    @VisibleForTesting
    /* renamed from: h */
    static long m29688h(byte[] bArr, int i, int i2) {
        long j;
        if (i2 <= 32) {
            j = m29692l(bArr, i, i2, -1397348546323613475L);
        } else if (i2 <= 64) {
            j = m29691k(bArr, i, i2);
        } else {
            j = m29689i(bArr, i, i2);
        }
        long j2 = -6505348102511208375L;
        long b = i2 >= 8 ? LittleEndianByteArray.m29770b(bArr, i) : -6505348102511208375L;
        if (i2 >= 9) {
            j2 = LittleEndianByteArray.m29770b(bArr, (i + i2) - 8);
        }
        long j3 = m29690j(j + j2, b);
        return (j3 == 0 || j3 == 1) ? j3 - 2 : j3;
    }

    /* renamed from: i */
    private static long m29689i(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i2;
        long b = LittleEndianByteArray.m29770b(bArr, i);
        int i4 = i + i3;
        long b2 = LittleEndianByteArray.m29770b(bArr2, i4 - 16) ^ -8261664234251669945L;
        long b3 = LittleEndianByteArray.m29770b(bArr2, i4 - 56) ^ -6505348102511208375L;
        long[] jArr = new long[2];
        long j = (long) i3;
        byte[] bArr3 = bArr;
        long[] jArr2 = new long[2];
        long[] jArr3 = jArr;
        m29694n(bArr3, i4 - 64, j, b2, jArr);
        m29694n(bArr3, i4 - 32, j * -8261664234251669945L, -6505348102511208375L, jArr2);
        long m = b3 + (m29693m(jArr3[1]) * -8261664234251669945L);
        long rotateRight = Long.rotateRight(m + b, 39) * -8261664234251669945L;
        long rotateRight2 = Long.rotateRight(b2, 33) * -8261664234251669945L;
        int i5 = i;
        int i6 = (i3 - 1) & -64;
        while (true) {
            long rotateRight3 = (Long.rotateRight(((rotateRight + rotateRight2) + jArr3[0]) + LittleEndianByteArray.m29770b(bArr2, i5 + 16), 37) * -8261664234251669945L) ^ jArr2[1];
            long rotateRight4 = (Long.rotateRight((rotateRight2 + jArr3[1]) + LittleEndianByteArray.m29770b(bArr2, i5 + 48), 42) * -8261664234251669945L) ^ jArr3[0];
            long rotateRight5 = Long.rotateRight(m ^ jArr2[0], 33);
            byte[] bArr4 = bArr;
            m29694n(bArr4, i5, jArr3[1] * -8261664234251669945L, rotateRight3 + jArr2[0], jArr3);
            m29694n(bArr4, i5 + 32, jArr2[1] + rotateRight5, rotateRight4, jArr2);
            i5 += 64;
            i6 -= 64;
            if (i6 == 0) {
                return m29690j(m29690j(jArr3[0], jArr2[0]) + (m29693m(rotateRight4) * -8261664234251669945L) + rotateRight3, m29690j(jArr3[1], jArr2[1]) + rotateRight5);
            }
            rotateRight = rotateRight5;
            m = rotateRight3;
            rotateRight2 = rotateRight4;
        }
    }

    @VisibleForTesting
    /* renamed from: j */
    static long m29690j(long j, long j2) {
        long j3 = (j2 ^ j) * -4132994306676758123L;
        long j4 = (j ^ (j3 ^ (j3 >>> 47))) * -4132994306676758123L;
        return (j4 ^ (j4 >>> 47)) * -4132994306676758123L;
    }

    /* renamed from: k */
    private static long m29691k(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        int i3 = i2;
        long b = LittleEndianByteArray.m29770b(bArr2, i + 24);
        long j = (long) i3;
        int i4 = i + i3;
        int i5 = i4 - 16;
        long b2 = LittleEndianByteArray.m29770b(bArr, i) + ((j + LittleEndianByteArray.m29770b(bArr2, i5)) * -6505348102511208375L);
        long rotateRight = Long.rotateRight(b2 + b, 52);
        long rotateRight2 = Long.rotateRight(b2, 37);
        long b3 = b2 + LittleEndianByteArray.m29770b(bArr2, i + 8);
        int i6 = i + 16;
        long b4 = b3 + LittleEndianByteArray.m29770b(bArr2, i6);
        long j2 = b + b4;
        long rotateRight3 = rotateRight + Long.rotateRight(b4, 31) + rotateRight2 + Long.rotateRight(b3, 7);
        long b5 = LittleEndianByteArray.m29770b(bArr2, i6) + LittleEndianByteArray.m29770b(bArr2, i4 - 32);
        long b6 = LittleEndianByteArray.m29770b(bArr2, i4 - 8);
        long j3 = rotateRight3;
        long rotateRight4 = Long.rotateRight(b5 + b6, 52);
        long rotateRight5 = Long.rotateRight(b5, 37);
        long b7 = b5 + LittleEndianByteArray.m29770b(bArr2, i4 - 24);
        long b8 = b7 + LittleEndianByteArray.m29770b(bArr2, i5);
        long rotateRight6 = rotateRight4 + Long.rotateRight(b8, 31);
        long j4 = j3;
        return m29693m((m29693m(((j2 + rotateRight6 + rotateRight5 + Long.rotateRight(b7, 7)) * -4288712594273399085L) + ((b6 + b8 + j4) * -6505348102511208375L)) * -6505348102511208375L) + j4) * -4288712594273399085L;
    }

    @VisibleForTesting
    /* renamed from: l */
    static long m29692l(byte[] bArr, int i, int i2, long j) {
        int i3 = i2 & -8;
        int i4 = i2 & 7;
        long j2 = j ^ (((long) i2) * -4132994306676758123L);
        for (int i5 = 0; i5 < i3; i5 += 8) {
            j2 = (j2 ^ (m29693m(LittleEndianByteArray.m29770b(bArr, i + i5) * -4132994306676758123L) * -4132994306676758123L)) * -4132994306676758123L;
        }
        if (i4 != 0) {
            j2 = (LittleEndianByteArray.m29771c(bArr, i + i3, i4) ^ j2) * -4132994306676758123L;
        }
        return m29693m(m29693m(j2) * -4132994306676758123L);
    }

    /* renamed from: m */
    private static long m29693m(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: n */
    private static void m29694n(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = LittleEndianByteArray.m29770b(bArr, i);
        long b2 = LittleEndianByteArray.m29770b(bArr, i + 8);
        long b3 = LittleEndianByteArray.m29770b(bArr, i + 16);
        long b4 = LittleEndianByteArray.m29770b(bArr, i + 24);
        long j3 = j + b;
        long j4 = b2 + j3 + b3;
        jArr[0] = j4 + b4;
        jArr[1] = Long.rotateRight(j2 + j3 + b4, 51) + Long.rotateRight(j4, 23) + j3;
    }

    /* renamed from: b */
    public int mo36981b() {
        return 64;
    }

    /* renamed from: g */
    public HashCode mo36967g(byte[] bArr, int i, int i2) {
        Preconditions.m5397x(i, i + i2, bArr.length);
        return HashCode.m29717h(m29688h(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
