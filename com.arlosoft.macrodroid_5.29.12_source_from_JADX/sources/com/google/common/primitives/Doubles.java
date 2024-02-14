package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.regex.Pattern;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Doubles extends DoublesMethodsForWeb {
    @GwtIncompatible

    /* renamed from: a */
    static final Pattern f53217a = m73540c();

    @GwtCompatible
    private static class DoubleArrayAsList extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final double[] array;
        final int end;
        final int start;

        DoubleArrayAsList(double[] dArr, int i, int i2) {
            this.array = dArr;
            this.start = i;
            this.end = i2;
        }

        /* renamed from: c */
        public Double get(int i) {
            Preconditions.m5390q(i, size());
            return Double.valueOf(this.array[this.start + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Double) && Doubles.m73542e(this.array, ((Double) obj).doubleValue(), this.start, this.end) != -1;
        }

        /* renamed from: d */
        public Double set(int i, Double d) {
            Preconditions.m5390q(i, size());
            double[] dArr = this.array;
            int i2 = this.start;
            double d2 = dArr[i2 + i];
            dArr[i2 + i] = ((Double) Preconditions.m5392s(d)).doubleValue();
            return Double.valueOf(d2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoubleArrayAsList)) {
                return super.equals(obj);
            }
            DoubleArrayAsList doubleArrayAsList = (DoubleArrayAsList) obj;
            int size = size();
            if (doubleArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != doubleArrayAsList.array[doubleArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Doubles.m73541d(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Double) || (a = Doubles.m73542e(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return a - this.start;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Double) || (b = Doubles.m73543f(this.array, ((Double) obj).doubleValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return b - this.start;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Double> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            double[] dArr = this.array;
            int i3 = this.start;
            return new DoubleArrayAsList(dArr, i + i3, i3 + i2);
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

    private static final class DoubleConverter extends Converter<String, Double> implements Serializable {

        /* renamed from: a */
        static final DoubleConverter f53218a = new DoubleConverter();
        private static final long serialVersionUID = 1;

        private DoubleConverter() {
        }

        private Object readResolve() {
            return f53218a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo22095d(Double d) {
            return d.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public Double mo22096e(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    private enum LexicographicalComparator implements Comparator<double[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(double[] dArr, double[] dArr2) {
            int min = Math.min(dArr.length, dArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Double.compare(dArr[i], dArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return dArr.length - dArr2.length;
        }

        public String toString() {
            return "Doubles.lexicographicalComparator()";
        }
    }

    private Doubles() {
    }

    @GwtIncompatible
    /* renamed from: c */
    private static Pattern m73540c() {
        String concat = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)".concat("(?:[eE][+-]?\\d+#)?[fFdD]?");
        StringBuilder sb = new StringBuilder("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)".length() + 25);
        sb.append("0[xX]");
        sb.append("(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)");
        sb.append("[pP][+-]?\\d+#[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(concat).length() + 23 + String.valueOf(sb2).length());
        sb3.append("[+-]?(?:NaN|Infinity|");
        sb3.append(concat);
        sb3.append("|");
        sb3.append(sb2);
        sb3.append(")");
        return Pattern.compile(sb3.toString().replace("#", "+"));
    }

    /* renamed from: d */
    public static int m73541d(double d) {
        return Double.valueOf(d).hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m73542e(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m73543f(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }
}
