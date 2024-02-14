package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Booleans {

    @GwtCompatible
    private static class BooleanArrayAsList extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final boolean[] array;
        final int end;
        final int start;

        BooleanArrayAsList(boolean[] zArr, int i, int i2) {
            this.array = zArr;
            this.start = i;
            this.end = i2;
        }

        /* renamed from: c */
        public Boolean get(int i) {
            Preconditions.m5390q(i, size());
            return Boolean.valueOf(this.array[this.start + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && Booleans.m73513e(this.array, ((Boolean) obj).booleanValue(), this.start, this.end) != -1;
        }

        /* renamed from: d */
        public Boolean set(int i, Boolean bool) {
            Preconditions.m5390q(i, size());
            boolean[] zArr = this.array;
            int i2 = this.start;
            boolean z = zArr[i2 + i];
            zArr[i2 + i] = ((Boolean) Preconditions.m5392s(bool)).booleanValue();
            return Boolean.valueOf(z);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BooleanArrayAsList)) {
                return super.equals(obj);
            }
            BooleanArrayAsList booleanArrayAsList = (BooleanArrayAsList) obj;
            int size = size();
            if (booleanArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != booleanArrayAsList.array[booleanArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Booleans.m73512d(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Boolean) || (a = Booleans.m73513e(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return a - this.start;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Boolean) || (b = Booleans.m73514f(this.array, ((Boolean) obj).booleanValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return b - this.start;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Boolean> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.array;
            int i3 = this.start;
            return new BooleanArrayAsList(zArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.array[this.start] ? "[true" : "[false");
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(this.array[i] ? ", true" : ", false");
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }
    }

    private enum BooleanComparator implements Comparator<Boolean> {
        TRUE_FIRST(1, "Booleans.trueFirst()"),
        FALSE_FIRST(-1, "Booleans.falseFirst()");
        
        private final String toString;
        private final int trueValue;

        private BooleanComparator(int i, String str) {
            this.trueValue = i;
            this.toString = str;
        }

        /* renamed from: d */
        public int compare(Boolean bool, Boolean bool2) {
            int i = 0;
            int i2 = bool.booleanValue() ? this.trueValue : 0;
            if (bool2.booleanValue()) {
                i = this.trueValue;
            }
            return i - i2;
        }

        public String toString() {
            return this.toString;
        }
    }

    private enum LexicographicalComparator implements Comparator<boolean[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i = 0; i < min; i++) {
                int c = Booleans.m73511c(zArr[i], zArr2[i]);
                if (c != 0) {
                    return c;
                }
            }
            return zArr.length - zArr2.length;
        }

        public String toString() {
            return "Booleans.lexicographicalComparator()";
        }
    }

    private Booleans() {
    }

    /* renamed from: c */
    public static int m73511c(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    /* renamed from: d */
    public static int m73512d(boolean z) {
        return z ? 1231 : 1237;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m73513e(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m73514f(boolean[] zArr, boolean z, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (zArr[i3] == z) {
                return i3;
            }
        }
        return -1;
    }
}
