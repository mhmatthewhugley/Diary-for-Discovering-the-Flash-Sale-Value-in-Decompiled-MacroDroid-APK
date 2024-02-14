package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import java.util.Arrays;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class CompactHashing {
    private CompactHashing() {
    }

    /* renamed from: a */
    static Object m26648a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    /* renamed from: b */
    static int m26649b(int i, int i2) {
        return i & (~i2);
    }

    /* renamed from: c */
    static int m26650c(int i, int i2) {
        return i & i2;
    }

    /* renamed from: d */
    static int m26651d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: e */
    static int m26652e(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: f */
    static int m26653f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int d = Hashing.m27250d(obj);
        int i4 = d & i;
        int h = m26655h(obj3, i4);
        if (h == 0) {
            return -1;
        }
        int b = m26649b(d, i);
        int i5 = -1;
        while (true) {
            i2 = h - 1;
            i3 = iArr[i2];
            if (m26649b(i3, i) != b || !Objects.m5349a(obj, objArr[i2]) || (objArr2 != null && !Objects.m5349a(obj2, objArr2[i2]))) {
                int c = m26650c(i3, i);
                if (c == 0) {
                    return -1;
                }
                int i6 = c;
                i5 = i2;
                h = i6;
            }
        }
        int c2 = m26650c(i3, i);
        if (i5 == -1) {
            m26656i(obj3, i4, c2);
        } else {
            iArr[i5] = m26651d(iArr[i5], c2, i);
        }
        return i2;
    }

    /* renamed from: g */
    static void m26654g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: h */
    static int m26655h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: i */
    static void m26656i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: j */
    static int m26657j(int i) {
        return Math.max(4, Hashing.m27247a(i + 1, 1.0d));
    }
}
