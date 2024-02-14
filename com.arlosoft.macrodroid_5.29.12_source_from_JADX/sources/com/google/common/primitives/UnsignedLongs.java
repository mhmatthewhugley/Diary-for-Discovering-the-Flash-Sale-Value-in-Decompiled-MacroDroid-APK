package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.math.BigInteger;
import java.util.Comparator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class UnsignedLongs {

    enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                if (jArr[i] != jArr2[i]) {
                    return UnsignedLongs.m73686a(jArr[i], jArr2[i]);
                }
            }
            return jArr.length - jArr2.length;
        }

        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    private static final class ParseOverflowDetection {

        /* renamed from: a */
        static final long[] f53265a = new long[37];

        /* renamed from: b */
        static final int[] f53266b = new int[37];

        /* renamed from: c */
        static final int[] f53267c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = (long) i;
                f53265a[i] = UnsignedLongs.m73687b(-1, j);
                f53266b[i] = (int) UnsignedLongs.m73689d(-1, j);
                f53267c[i] = bigInteger.toString(i).length() - 1;
            }
        }

        private ParseOverflowDetection() {
        }
    }

    private UnsignedLongs() {
    }

    /* renamed from: a */
    public static int m73686a(long j, long j2) {
        return Longs.m73633c(m73688c(j), m73688c(j2));
    }

    /* renamed from: b */
    public static long m73687b(long j, long j2) {
        if (j2 < 0) {
            return m73686a(j, j2) < 0 ? 0 : 1;
        }
        if (j >= 0) {
            return j / j2;
        }
        int i = 1;
        long j3 = ((j >>> 1) / j2) << 1;
        if (m73686a(j - (j3 * j2), j2) < 0) {
            i = 0;
        }
        return j3 + ((long) i);
    }

    /* renamed from: c */
    private static long m73688c(long j) {
        return j ^ Long.MIN_VALUE;
    }

    /* renamed from: d */
    public static long m73689d(long j, long j2) {
        if (j2 < 0) {
            return m73686a(j, j2) < 0 ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (m73686a(j3, j2) < 0) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: e */
    public static String m73690e(long j) {
        return m73691f(j, 10);
    }

    /* renamed from: f */
    public static String m73691f(long j, int i) {
        long j2;
        Preconditions.m5381h(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                j2 = (j >>> 1) / ((long) (i >>> 1));
            } else {
                j2 = m73687b(j, (long) i);
            }
            long j3 = (long) i;
            cArr[63] = Character.forDigit((int) (j - (j2 * j3)), i);
            i3 = 63;
            while (j2 > 0) {
                i3--;
                cArr[i3] = Character.forDigit((int) (j2 % j3), i);
                j2 /= j3;
            }
        }
        return new String(cArr, i3, 64 - i3);
    }
}
