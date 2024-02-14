package com.google.common.hash;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.charset.Charset;
import javax.mail.UIDFolder;

@ElementTypesAreNonnullByDefault
@Immutable
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {

    /* renamed from: a */
    static final HashFunction f17575a = new Murmur3_32HashFunction(0, false);

    /* renamed from: c */
    static final HashFunction f17576c = new Murmur3_32HashFunction(0, true);

    /* renamed from: d */
    static final HashFunction f17577d = new Murmur3_32HashFunction(Hashing.f17540a, true);
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;

    @CanIgnoreReturnValue
    private static final class Murmur3_32Hasher extends AbstractHasher {

        /* renamed from: a */
        private int f17578a;

        /* renamed from: b */
        private long f17579b;

        /* renamed from: c */
        private int f17580c;

        /* renamed from: d */
        private int f17581d = 0;

        /* renamed from: e */
        private boolean f17582e = false;

        Murmur3_32Hasher(int i) {
            this.f17578a = i;
        }

        /* renamed from: i */
        private void m29833i(int i, long j) {
            long j2 = this.f17579b;
            long j3 = j & UIDFolder.MAXUID;
            int i2 = this.f17580c;
            long j4 = (j3 << i2) | j2;
            this.f17579b = j4;
            int i3 = i2 + (i * 8);
            this.f17580c = i3;
            this.f17581d += i;
            if (i3 >= 32) {
                this.f17578a = Murmur3_32HashFunction.m29827v(this.f17578a, Murmur3_32HashFunction.m29828w((int) j4));
                this.f17579b >>>= 32;
                this.f17580c -= 32;
            }
        }

        /* renamed from: g */
        public HashCode mo36963g() {
            Preconditions.m5398y(!this.f17582e);
            this.f17582e = true;
            int h = this.f17578a ^ Murmur3_32HashFunction.m29828w((int) this.f17579b);
            this.f17578a = h;
            return Murmur3_32HashFunction.m29825t(h, this.f17581d);
        }

        /* renamed from: h */
        public Hasher mo36951h(char c) {
            m29833i(2, (long) c);
            return this;
        }

        /* renamed from: b */
        public Hasher m29835b(byte b) {
            m29833i(1, (long) (b & 255));
            return this;
        }

        /* renamed from: d */
        public Hasher m29837d(byte[] bArr, int i, int i2) {
            Preconditions.m5397x(i, i + i2, bArr.length);
            int i3 = 0;
            while (true) {
                int i4 = i3 + 4;
                if (i4 > i2) {
                    break;
                }
                m29833i(4, (long) Murmur3_32HashFunction.m29826u(bArr, i3 + i));
                i3 = i4;
            }
            while (i3 < i2) {
                m29835b(bArr[i + i3]);
                i3++;
            }
            return this;
        }

        /* renamed from: e */
        public Hasher m29839e(CharSequence charSequence, Charset charset) {
            if (!Charsets.f4139c.equals(charset)) {
                return super.m29625e(charSequence, charset);
            }
            int length = charSequence.length();
            int i = 0;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i);
                char charAt2 = charSequence.charAt(i + 1);
                char charAt3 = charSequence.charAt(i + 2);
                char charAt4 = charSequence.charAt(i + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                m29833i(4, (long) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i = i2;
            }
            while (i < length) {
                char charAt5 = charSequence.charAt(i);
                if (charAt5 < 128) {
                    m29833i(1, (long) charAt5);
                } else if (charAt5 < 2048) {
                    m29833i(2, Murmur3_32HashFunction.m29823q(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    m29833i(3, Murmur3_32HashFunction.m29822p(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i);
                    if (codePointAt == charAt5) {
                        m29618a(charSequence.subSequence(i, length).toString().getBytes(charset));
                        return this;
                    }
                    i++;
                    m29833i(4, Murmur3_32HashFunction.m29824r(codePointAt));
                }
                i++;
            }
            return this;
        }

        public Hasher putInt(int i) {
            m29833i(4, (long) i);
            return this;
        }

        public Hasher putLong(long j) {
            m29833i(4, (long) ((int) j));
            m29833i(4, j >>> 32);
            return this;
        }
    }

    Murmur3_32HashFunction(int i, boolean z) {
        this.seed = i;
        this.supplementaryPlaneFix = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static long m29822p(char c) {
        return ((long) (c >>> 12)) | 224 | ((long) ((((c >>> 6) & 63) | 128) << 8)) | ((long) (((c & '?') | 128) << 16));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static long m29823q(char c) {
        return ((long) (c >>> 6)) | 192 | ((long) (((c & '?') | 128) << 8));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static long m29824r(int i) {
        return ((long) (i >>> 18)) | 240 | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static HashCode m29825t(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * -2048144789;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477387;
        return HashCode.m29716g(i5 ^ (i5 >>> 16));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static int m29826u(byte[] bArr, int i) {
        return Ints.m73617f(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static int m29827v(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static int m29828w(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* renamed from: a */
    public HashCode mo36964a(CharSequence charSequence, Charset charset) {
        int i;
        if (!Charsets.f4139c.equals(charset)) {
            return mo36966f(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i2 = this.seed;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 4;
            if (i6 > length) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            char charAt2 = charSequence.charAt(i4 + 1);
            char charAt3 = charSequence.charAt(i4 + 2);
            char charAt4 = charSequence.charAt(i4 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i2 = m29827v(i2, m29828w((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i5 = i + 4;
            i4 = i6;
        }
        long j = 0;
        while (i4 < length) {
            char charAt5 = charSequence.charAt(i4);
            if (charAt5 < 128) {
                j |= ((long) charAt5) << i3;
                i3 += 8;
                i++;
            } else if (charAt5 < 2048) {
                j |= m29823q(charAt5) << i3;
                i3 += 16;
                i += 2;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j |= m29822p(charAt5) << i3;
                i3 += 24;
                i += 3;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i4);
                if (codePointAt == charAt5) {
                    return mo36966f(charSequence.toString().getBytes(charset));
                }
                i4++;
                j |= m29824r(codePointAt) << i3;
                if (this.supplementaryPlaneFix) {
                    i3 += 32;
                }
                i += 4;
            }
            if (i3 >= 32) {
                i2 = m29827v(i2, m29828w((int) j));
                j >>>= 32;
                i3 -= 32;
            }
            i4++;
        }
        return m29825t(m29828w((int) j) ^ i2, i);
    }

    /* renamed from: b */
    public int mo36981b() {
        return 32;
    }

    /* renamed from: d */
    public Hasher mo36958d() {
        return new Murmur3_32Hasher(this.seed);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Murmur3_32HashFunction)) {
            return false;
        }
        Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
        if (this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public HashCode mo36967g(byte[] bArr, int i, int i2) {
        Preconditions.m5397x(i, i + i2, bArr.length);
        int i3 = this.seed;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i5 + 4;
            if (i6 > i2) {
                break;
            }
            i3 = m29827v(i3, m29828w(m29826u(bArr, i5 + i)));
            i5 = i6;
        }
        int i7 = i5;
        int i8 = 0;
        while (i7 < i2) {
            i4 ^= UnsignedBytes.m73668c(bArr[i + i7]) << i8;
            i7++;
            i8 += 8;
        }
        return m29825t(m29828w(i4) ^ i3, i2);
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.seed;
    }

    public String toString() {
        int i = this.seed;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
