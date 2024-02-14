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
public final class Floats extends FloatsMethodsForWeb {

    @GwtCompatible
    private static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        FloatArrayAsList(float[] fArr, int i, int i2) {
            this.array = fArr;
            this.start = i;
            this.end = i2;
        }

        /* renamed from: c */
        public Float get(int i) {
            Preconditions.m5390q(i, size());
            return Float.valueOf(this.array[this.start + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Float) && Floats.m73555d(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
        }

        /* renamed from: d */
        public Float set(int i, Float f) {
            Preconditions.m5390q(i, size());
            float[] fArr = this.array;
            int i2 = this.start;
            float f2 = fArr[i2 + i];
            fArr[i2 + i] = ((Float) Preconditions.m5392s(f)).floatValue();
            return Float.valueOf(f2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FloatArrayAsList)) {
                return super.equals(obj);
            }
            FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
            int size = size();
            if (floatArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != floatArrayAsList.array[floatArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Floats.m73554c(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Float) || (a = Floats.m73555d(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return a - this.start;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Float) || (b = Floats.m73556e(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return b - this.start;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Float> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            float[] fArr = this.array;
            int i3 = this.start;
            return new FloatArrayAsList(fArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
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

    private static final class FloatConverter extends Converter<String, Float> implements Serializable {

        /* renamed from: a */
        static final FloatConverter f53221a = new FloatConverter();
        private static final long serialVersionUID = 1;

        private FloatConverter() {
        }

        private Object readResolve() {
            return f53221a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo22095d(Float f) {
            return f.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public Float mo22096e(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    private enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Float.compare(fArr[i], fArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }

        public String toString() {
            return "Floats.lexicographicalComparator()";
        }
    }

    private Floats() {
    }

    /* renamed from: c */
    public static int m73554c(float f) {
        return Float.valueOf(f).hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m73555d(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m73556e(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }
}
