package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;

@ElementTypesAreNonnullByDefault
public abstract class HashCode {

    /* renamed from: a */
    private static final char[] f17539a = "0123456789abcdef".toCharArray();

    private static final class BytesHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final byte[] bytes;

        BytesHashCode(byte[] bArr) {
            this.bytes = (byte[]) Preconditions.m5392s(bArr);
        }

        /* renamed from: a */
        public byte[] mo37008a() {
            return (byte[]) this.bytes.clone();
        }

        /* renamed from: b */
        public int mo37009b() {
            byte[] bArr = this.bytes;
            Preconditions.m5370A(bArr.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", bArr.length);
            byte[] bArr2 = this.bytes;
            return ((bArr2[3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16);
        }

        /* renamed from: c */
        public long mo37010c() {
            byte[] bArr = this.bytes;
            Preconditions.m5370A(bArr.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", bArr.length);
            return mo37019l();
        }

        /* renamed from: d */
        public int mo37011d() {
            return this.bytes.length * 8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo37012e(HashCode hashCode) {
            if (this.bytes.length != hashCode.mo37015i().length) {
                return false;
            }
            int i = 0;
            boolean z = true;
            while (true) {
                byte[] bArr = this.bytes;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == hashCode.mo37015i()[i];
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public byte[] mo37015i() {
            return this.bytes;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo37017k(byte[] bArr, int i, int i2) {
            System.arraycopy(this.bytes, 0, bArr, i, i2);
        }

        /* renamed from: l */
        public long mo37019l() {
            long j = (long) (this.bytes[0] & 255);
            for (int i = 1; i < Math.min(this.bytes.length, 8); i++) {
                j |= (((long) this.bytes[i]) & 255) << (i * 8);
            }
            return j;
        }
    }

    private static final class IntHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final int hash;

        IntHashCode(int i) {
            this.hash = i;
        }

        /* renamed from: a */
        public byte[] mo37008a() {
            int i = this.hash;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        /* renamed from: b */
        public int mo37009b() {
            return this.hash;
        }

        /* renamed from: c */
        public long mo37010c() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        /* renamed from: d */
        public int mo37011d() {
            return 32;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo37012e(HashCode hashCode) {
            return this.hash == hashCode.mo37009b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo37017k(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.hash >> (i3 * 8));
            }
        }
    }

    private static final class LongHashCode extends HashCode implements Serializable {
        private static final long serialVersionUID = 0;
        final long hash;

        LongHashCode(long j) {
            this.hash = j;
        }

        /* renamed from: a */
        public byte[] mo37008a() {
            long j = this.hash;
            return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
        }

        /* renamed from: b */
        public int mo37009b() {
            return (int) this.hash;
        }

        /* renamed from: c */
        public long mo37010c() {
            return this.hash;
        }

        /* renamed from: d */
        public int mo37011d() {
            return 64;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo37012e(HashCode hashCode) {
            return this.hash == hashCode.mo37010c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo37017k(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) ((int) (this.hash >> (i3 * 8)));
            }
        }
    }

    HashCode() {
    }

    /* renamed from: f */
    static HashCode m29715f(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    /* renamed from: g */
    public static HashCode m29716g(int i) {
        return new IntHashCode(i);
    }

    /* renamed from: h */
    public static HashCode m29717h(long j) {
        return new LongHashCode(j);
    }

    /* renamed from: a */
    public abstract byte[] mo37008a();

    /* renamed from: b */
    public abstract int mo37009b();

    /* renamed from: c */
    public abstract long mo37010c();

    /* renamed from: d */
    public abstract int mo37011d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract boolean mo37012e(HashCode hashCode);

    public final boolean equals(Object obj) {
        if (!(obj instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) obj;
        if (mo37011d() != hashCode.mo37011d() || !mo37012e(hashCode)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (mo37011d() >= 32) {
            return mo37009b();
        }
        byte[] i = mo37015i();
        byte b = i[0] & 255;
        for (int i2 = 1; i2 < i.length; i2++) {
            b |= (i[i2] & 255) << (i2 * 8);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public byte[] mo37015i() {
        return mo37008a();
    }

    @CanIgnoreReturnValue
    /* renamed from: j */
    public int mo37016j(byte[] bArr, int i, int i2) {
        int j = Ints.m73621j(i2, mo37011d() / 8);
        Preconditions.m5397x(i, i + j, bArr.length);
        mo37017k(bArr, i, j);
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo37017k(byte[] bArr, int i, int i2);

    public final String toString() {
        byte[] i = mo37015i();
        StringBuilder sb = new StringBuilder(i.length * 2);
        for (byte b : i) {
            char[] cArr = f17539a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
