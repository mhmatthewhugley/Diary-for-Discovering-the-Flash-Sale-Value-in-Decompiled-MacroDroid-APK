package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;

@ElementTypesAreNonnullByDefault
@Immutable
final class SipHashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: a */
    static final HashFunction f17583a = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f17584c;

    /* renamed from: d */
    private final int f17585d;

    /* renamed from: k0 */
    private final long f17586k0;

    /* renamed from: k1 */
    private final long f17587k1;

    private static final class SipHasher extends AbstractStreamingHasher {

        /* renamed from: d */
        private final int f17588d;

        /* renamed from: e */
        private final int f17589e;

        /* renamed from: f */
        private long f17590f;

        /* renamed from: g */
        private long f17591g;

        /* renamed from: h */
        private long f17592h;

        /* renamed from: i */
        private long f17593i;

        /* renamed from: j */
        private long f17594j = 0;

        /* renamed from: k */
        private long f17595k = 0;

        SipHasher(int i, int i2, long j, long j2) {
            super(8);
            this.f17588d = i;
            this.f17589e = i2;
            this.f17590f = 8317987319222330741L ^ j;
            this.f17591g = 7237128888997146477L ^ j2;
            this.f17592h = 7816392313619706465L ^ j;
            this.f17593i = 8387220255154660723L ^ j2;
        }

        /* renamed from: o */
        private void m29849o(long j) {
            this.f17593i ^= j;
            m29850p(this.f17588d);
            this.f17590f = j ^ this.f17590f;
        }

        /* renamed from: p */
        private void m29850p(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f17590f;
                long j2 = this.f17591g;
                this.f17590f = j + j2;
                this.f17592h += this.f17593i;
                this.f17591g = Long.rotateLeft(j2, 13);
                long rotateLeft = Long.rotateLeft(this.f17593i, 16);
                long j3 = this.f17591g;
                long j4 = this.f17590f;
                this.f17591g = j3 ^ j4;
                this.f17593i = rotateLeft ^ this.f17592h;
                long rotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f17592h;
                long j6 = this.f17591g;
                this.f17592h = j5 + j6;
                this.f17590f = rotateLeft2 + this.f17593i;
                this.f17591g = Long.rotateLeft(j6, 17);
                long rotateLeft3 = Long.rotateLeft(this.f17593i, 21);
                long j7 = this.f17591g;
                long j8 = this.f17592h;
                this.f17591g = j7 ^ j8;
                this.f17593i = rotateLeft3 ^ this.f17590f;
                this.f17592h = Long.rotateLeft(j8, 32);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public HashCode mo36970i() {
            long j = this.f17595k ^ (this.f17594j << 56);
            this.f17595k = j;
            m29849o(j);
            this.f17592h ^= 255;
            m29850p(this.f17589e);
            return HashCode.m29717h(((this.f17590f ^ this.f17591g) ^ this.f17592h) ^ this.f17593i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo36971l(ByteBuffer byteBuffer) {
            this.f17594j += 8;
            m29849o(byteBuffer.getLong());
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public void mo36972m(ByteBuffer byteBuffer) {
            this.f17594j += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.f17595k ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }
    }

    SipHashFunction(int i, int i2, long j, long j2) {
        boolean z = true;
        Preconditions.m5381h(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", i);
        Preconditions.m5381h(i2 <= 0 ? false : z, "The number of SipRound iterations (d=%s) during Finalization must be positive.", i2);
        this.f17584c = i;
        this.f17585d = i2;
        this.f17586k0 = j;
        this.f17587k1 = j2;
    }

    /* renamed from: b */
    public int mo36981b() {
        return 64;
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        return new SipHasher(this.f17584c, this.f17585d, this.f17586k0, this.f17587k1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) obj;
        if (this.f17584c == sipHashFunction.f17584c && this.f17585d == sipHashFunction.f17585d && this.f17586k0 == sipHashFunction.f17586k0 && this.f17587k1 == sipHashFunction.f17587k1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((SipHashFunction.class.hashCode() ^ this.f17584c) ^ this.f17585d)) ^ this.f17586k0) ^ this.f17587k1);
    }

    public String toString() {
        int i = this.f17584c;
        int i2 = this.f17585d;
        long j = this.f17586k0;
        long j2 = this.f17587k1;
        StringBuilder sb = new StringBuilder(81);
        sb.append("Hashing.sipHash");
        sb.append(i);
        sb.append(i2);
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
