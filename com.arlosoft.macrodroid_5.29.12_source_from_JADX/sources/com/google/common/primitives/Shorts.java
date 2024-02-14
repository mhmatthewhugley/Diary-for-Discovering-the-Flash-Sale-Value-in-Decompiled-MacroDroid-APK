package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Shorts extends ShortsMethodsForWeb {

    private enum LexicographicalComparator implements Comparator<short[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < min; i++) {
                int c = Shorts.m73651c(sArr[i], sArr2[i]);
                if (c != 0) {
                    return c;
                }
            }
            return sArr.length - sArr2.length;
        }

        public String toString() {
            return "Shorts.lexicographicalComparator()";
        }
    }

    @GwtCompatible
    private static class ShortArrayAsList extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final short[] array;
        final int end;
        final int start;

        ShortArrayAsList(short[] sArr, int i, int i2) {
            this.array = sArr;
            this.start = i;
            this.end = i2;
        }

        /* renamed from: c */
        public Short get(int i) {
            Preconditions.m5390q(i, size());
            return Short.valueOf(this.array[this.start + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Short) && Shorts.m73653e(this.array, ((Short) obj).shortValue(), this.start, this.end) != -1;
        }

        /* renamed from: d */
        public Short set(int i, Short sh) {
            Preconditions.m5390q(i, size());
            short[] sArr = this.array;
            int i2 = this.start;
            short s = sArr[i2 + i];
            sArr[i2 + i] = ((Short) Preconditions.m5392s(sh)).shortValue();
            return Short.valueOf(s);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShortArrayAsList)) {
                return super.equals(obj);
            }
            ShortArrayAsList shortArrayAsList = (ShortArrayAsList) obj;
            int size = size();
            if (shortArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != shortArrayAsList.array[shortArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Shorts.m73652d(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Short) || (a = Shorts.m73653e(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return a - this.start;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Short) || (b = Shorts.m73654f(this.array, ((Short) obj).shortValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return b - this.start;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Short> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            short[] sArr = this.array;
            int i3 = this.start;
            return new ShortArrayAsList(sArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
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

    private static final class ShortConverter extends Converter<String, Short> implements Serializable {

        /* renamed from: a */
        static final ShortConverter f53243a = new ShortConverter();
        private static final long serialVersionUID = 1;

        private ShortConverter() {
        }

        private Object readResolve() {
            return f53243a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo22095d(Short sh) {
            return sh.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public Short mo22096e(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    private Shorts() {
    }

    /* renamed from: c */
    public static int m73651c(short s, short s2) {
        return s - s2;
    }

    /* renamed from: d */
    public static int m73652d(short s) {
        return s;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m73653e(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m73654f(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }
}
