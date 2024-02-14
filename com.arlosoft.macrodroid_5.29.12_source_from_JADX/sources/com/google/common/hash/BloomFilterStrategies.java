package com.google.common.hash;

import androidx.core.location.LocationRequestCompat;
import com.google.common.base.Preconditions;
import com.google.common.hash.BloomFilter;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLongArray;

@ElementTypesAreNonnullByDefault
enum BloomFilterStrategies implements BloomFilter.Strategy {
    MURMUR128_MITZ_32 {
        /* renamed from: K */
        public <T> boolean mo36976K(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
            long a = lockFreeBitArray.mo36977a();
            long c = Hashing.m29759b().mo36965e(t, funnel).mo37010c();
            int i2 = (int) c;
            int i3 = (int) (c >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 = ~i5;
                }
                if (!lockFreeBitArray.mo36978b(((long) i5) % a)) {
                    return false;
                }
            }
            return true;
        }
    },
    MURMUR128_MITZ_64 {
        /* renamed from: d */
        private long m29659d(byte[] bArr) {
            return Longs.m73634d(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        /* renamed from: e */
        private long m29660e(byte[] bArr) {
            return Longs.m73634d(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }

        /* renamed from: K */
        public <T> boolean mo36976K(@ParametricNullness T t, Funnel<? super T> funnel, int i, LockFreeBitArray lockFreeBitArray) {
            long a = lockFreeBitArray.mo36977a();
            byte[] i2 = Hashing.m29759b().mo36965e(t, funnel).mo37015i();
            long d = m29659d(i2);
            long e = m29660e(i2);
            for (int i3 = 0; i3 < i; i3++) {
                if (!lockFreeBitArray.mo36978b((LocationRequestCompat.PASSIVE_INTERVAL & d) % a)) {
                    return false;
                }
                d += e;
            }
            return true;
        }
    };

    static final class LockFreeBitArray {

        /* renamed from: a */
        final AtomicLongArray f17515a;

        /* renamed from: b */
        private final LongAddable f17516b;

        LockFreeBitArray(long[] jArr) {
            Preconditions.m5378e(jArr.length > 0, "data length is zero!");
            this.f17515a = new AtomicLongArray(jArr);
            this.f17516b = LongAddables.m29783a();
            long j = 0;
            for (long bitCount : jArr) {
                j += (long) Long.bitCount(bitCount);
            }
            this.f17516b.mo37035a(j);
        }

        /* renamed from: c */
        public static long[] m29662c(AtomicLongArray atomicLongArray) {
            int length = atomicLongArray.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = atomicLongArray.get(i);
            }
            return jArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo36977a() {
            return ((long) this.f17515a.length()) * 64;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo36978b(long j) {
            return ((1 << ((int) j)) & this.f17515a.get((int) (j >>> 6))) != 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof LockFreeBitArray) {
                return Arrays.equals(m29662c(this.f17515a), m29662c(((LockFreeBitArray) obj).f17515a));
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(m29662c(this.f17515a));
        }
    }
}
