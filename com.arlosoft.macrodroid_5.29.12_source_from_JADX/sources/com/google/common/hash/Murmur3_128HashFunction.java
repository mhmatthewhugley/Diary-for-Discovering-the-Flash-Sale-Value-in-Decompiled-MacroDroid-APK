package com.google.common.hash;

import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@ElementTypesAreNonnullByDefault
@Immutable
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: a */
    static final HashFunction f17570a = new Murmur3_128HashFunction(0);

    /* renamed from: c */
    static final HashFunction f17571c = new Murmur3_128HashFunction(Hashing.f17540a);
    private static final long serialVersionUID = 0;
    private final int seed;

    private static final class Murmur3_128Hasher extends AbstractStreamingHasher {

        /* renamed from: d */
        private long f17572d;

        /* renamed from: e */
        private long f17573e;

        /* renamed from: f */
        private int f17574f = 0;

        Murmur3_128Hasher(int i) {
            super(16);
            long j = (long) i;
            this.f17572d = j;
            this.f17573e = j;
        }

        /* renamed from: o */
        private void m29808o(long j, long j2) {
            long q = m29810q(j) ^ this.f17572d;
            this.f17572d = q;
            long rotateLeft = Long.rotateLeft(q, 27);
            long j3 = this.f17573e;
            this.f17572d = ((rotateLeft + j3) * 5) + 1390208809;
            long r = m29811r(j2) ^ j3;
            this.f17573e = r;
            this.f17573e = ((Long.rotateLeft(r, 31) + this.f17572d) * 5) + 944331445;
        }

        /* renamed from: p */
        private static long m29809p(long j) {
            long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
            long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
            return j3 ^ (j3 >>> 33);
        }

        /* renamed from: q */
        private static long m29810q(long j) {
            return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
        }

        /* renamed from: r */
        private static long m29811r(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public HashCode mo36970i() {
            long j = this.f17572d;
            int i = this.f17574f;
            long j2 = j ^ ((long) i);
            long j3 = this.f17573e ^ ((long) i);
            long j4 = j2 + j3;
            this.f17572d = j4;
            this.f17573e = j3 + j4;
            this.f17572d = m29809p(j4);
            long p = m29809p(this.f17573e);
            long j5 = this.f17572d + p;
            this.f17572d = j5;
            this.f17573e = p + j5;
            return HashCode.m29715f(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f17572d).putLong(this.f17573e).array());
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo36971l(ByteBuffer byteBuffer) {
            m29808o(byteBuffer.getLong(), byteBuffer.getLong());
            this.f17574f += 16;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(11))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(10))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(9))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
            r0 = r0 ^ ((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(8)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
            r2 = r12.getLong() ^ 0;
            r6 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(5))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(4))) << 32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(3))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cf, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(2))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dd, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(1))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
            r2 = ((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(0))) ^ r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
            r11.f17572d ^= m29810q(r2);
            r11.f17573e ^= m29811r(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(13))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.m73668c(r12.get(12))) << 32);
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36972m(java.nio.ByteBuffer r12) {
            /*
                r11 = this;
                int r0 = r11.f17574f
                int r1 = r12.remaining()
                int r0 = r0 + r1
                r11.f17574f = r0
                int r0 = r12.remaining()
                r1 = 48
                r2 = 40
                r3 = 32
                r4 = 24
                r5 = 16
                r6 = 0
                r8 = 8
                switch(r0) {
                    case 1: goto L_0x00ea;
                    case 2: goto L_0x00dc;
                    case 3: goto L_0x00ce;
                    case 4: goto L_0x00c0;
                    case 5: goto L_0x00b1;
                    case 6: goto L_0x00a3;
                    case 7: goto L_0x0095;
                    case 8: goto L_0x008d;
                    case 9: goto L_0x0081;
                    case 10: goto L_0x0072;
                    case 11: goto L_0x0063;
                    case 12: goto L_0x0054;
                    case 13: goto L_0x0044;
                    case 14: goto L_0x0035;
                    case 15: goto L_0x0026;
                    default: goto L_0x001e;
                }
            L_0x001e:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r12.<init>(r0)
                throw r12
            L_0x0026:
                r0 = 14
                byte r0 = r12.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.m73668c(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x0036
            L_0x0035:
                r0 = r6
            L_0x0036:
                r9 = 13
                byte r9 = r12.get(r9)
                int r9 = com.google.common.primitives.UnsignedBytes.m73668c(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x0045
            L_0x0044:
                r0 = r6
            L_0x0045:
                r2 = 12
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x0055
            L_0x0054:
                r0 = r6
            L_0x0055:
                r2 = 11
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x0064
            L_0x0063:
                r0 = r6
            L_0x0064:
                r2 = 10
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x0073
            L_0x0072:
                r0 = r6
            L_0x0073:
                r2 = 9
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x0082
            L_0x0081:
                r0 = r6
            L_0x0082:
                byte r2 = r12.get(r8)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r2 = (long) r2
                long r0 = r0 ^ r2
                goto L_0x008e
            L_0x008d:
                r0 = r6
            L_0x008e:
                long r2 = r12.getLong()
                long r2 = r2 ^ r6
                r6 = r0
                goto L_0x00f6
            L_0x0095:
                r0 = 6
                byte r0 = r12.get(r0)
                int r0 = com.google.common.primitives.UnsignedBytes.m73668c(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x00a4
            L_0x00a3:
                r0 = r6
            L_0x00a4:
                r9 = 5
                byte r9 = r12.get(r9)
                int r9 = com.google.common.primitives.UnsignedBytes.m73668c(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x00b2
            L_0x00b1:
                r0 = r6
            L_0x00b2:
                r2 = 4
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x00c1
            L_0x00c0:
                r0 = r6
            L_0x00c1:
                r2 = 3
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x00cf
            L_0x00ce:
                r0 = r6
            L_0x00cf:
                r2 = 2
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x00dd
            L_0x00dc:
                r0 = r6
            L_0x00dd:
                r2 = 1
                byte r2 = r12.get(r2)
                int r2 = com.google.common.primitives.UnsignedBytes.m73668c(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x00eb
            L_0x00ea:
                r0 = r6
            L_0x00eb:
                r2 = 0
                byte r12 = r12.get(r2)
                int r12 = com.google.common.primitives.UnsignedBytes.m73668c(r12)
                long r2 = (long) r12
                long r2 = r2 ^ r0
            L_0x00f6:
                long r0 = r11.f17572d
                long r2 = m29810q(r2)
                long r0 = r0 ^ r2
                r11.f17572d = r0
                long r0 = r11.f17573e
                long r2 = m29811r(r6)
                long r0 = r0 ^ r2
                r11.f17573e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Murmur3_128HashFunction.Murmur3_128Hasher.mo36972m(java.nio.ByteBuffer):void");
        }
    }

    Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    /* renamed from: b */
    public int mo36981b() {
        return 128;
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        return new Murmur3_128Hasher(this.seed);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_128HashFunction) || this.seed != ((Murmur3_128HashFunction) obj).seed) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    public String toString() {
        int i = this.seed;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
