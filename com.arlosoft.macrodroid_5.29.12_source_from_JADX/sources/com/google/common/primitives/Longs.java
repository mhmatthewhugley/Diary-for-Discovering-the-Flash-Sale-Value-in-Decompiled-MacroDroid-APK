package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Longs {

    static final class AsciiDigits {

        /* renamed from: a */
        private static final byte[] f53235a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            f53235a = bArr;
        }

        private AsciiDigits() {
        }
    }

    private enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                int c = Longs.m73633c(jArr[i], jArr2[i]);
                if (c != 0) {
                    return c;
                }
            }
            return jArr.length - jArr2.length;
        }

        public String toString() {
            return "Longs.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    private static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;
        final int end;
        final int start;

        LongArrayAsList(long[] jArr, int i, int i2) {
            this.array = jArr;
            this.start = i;
            this.end = i2;
        }

        /* renamed from: c */
        public Long get(int i) {
            Preconditions.m5390q(i, size());
            return Long.valueOf(this.array[this.start + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Long) && Longs.m73636f(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        /* renamed from: d */
        public Long set(int i, Long l) {
            Preconditions.m5390q(i, size());
            long[] jArr = this.array;
            int i2 = this.start;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) Preconditions.m5392s(l)).longValue();
            return Long.valueOf(j);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != longArrayAsList.array[longArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Longs.m73635e(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Long) || (a = Longs.m73636f(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return a - this.start;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Long) || (b = Longs.m73637g(this.array, ((Long) obj).longValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return b - this.start;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Long> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.array;
            int i3 = this.start;
            return new LongArrayAsList(jArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append(this.array[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    private static final class LongConverter extends Converter<String, Long> implements Serializable {

        /* renamed from: a */
        static final LongConverter f53238a = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return f53238a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo22095d(Long l) {
            return l.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public Long mo22096e(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    private Longs() {
    }

    /* renamed from: c */
    public static int m73633c(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: d */
    public static long m73634d(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* renamed from: e */
    public static int m73635e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m73636f(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m73637g(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static byte[] m73638h(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
        }
        return bArr;
    }
}
