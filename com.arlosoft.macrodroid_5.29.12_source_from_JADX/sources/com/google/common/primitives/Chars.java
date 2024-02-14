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
public final class Chars {

    @GwtCompatible
    private static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        CharArrayAsList(char[] cArr, int i, int i2) {
            this.array = cArr;
            this.start = i;
            this.end = i2;
        }

        /* renamed from: c */
        public Character get(int i) {
            Preconditions.m5390q(i, size());
            return Character.valueOf(this.array[this.start + i]);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Character) && Chars.m73532e(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        /* renamed from: d */
        public Character set(int i, Character ch) {
            Preconditions.m5390q(i, size());
            char[] cArr = this.array;
            int i2 = this.start;
            char c = cArr[i2 + i];
            cArr[i2 + i] = ((Character) Preconditions.m5392s(ch)).charValue();
            return Character.valueOf(c);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CharArrayAsList)) {
                return super.equals(obj);
            }
            CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
            int size = size();
            if (charArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != charArrayAsList.array[charArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Chars.m73531d(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            int a;
            if (!(obj instanceof Character) || (a = Chars.m73532e(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return a - this.start;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            int b;
            if (!(obj instanceof Character) || (b = Chars.m73533f(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return b - this.start;
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Character> subList(int i, int i2) {
            Preconditions.m5397x(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            char[] cArr = this.array;
            int i3 = this.start;
            return new CharArrayAsList(cArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
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

    private enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        /* renamed from: d */
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < min; i++) {
                int c = Chars.m73530c(cArr[i], cArr2[i]);
                if (c != 0) {
                    return c;
                }
            }
            return cArr.length - cArr2.length;
        }

        public String toString() {
            return "Chars.lexicographicalComparator()";
        }
    }

    private Chars() {
    }

    /* renamed from: c */
    public static int m73530c(char c, char c2) {
        return c - c2;
    }

    /* renamed from: d */
    public static int m73531d(char c) {
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m73532e(char[] cArr, char c, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static int m73533f(char[] cArr, char c, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (cArr[i3] == c) {
                return i3;
            }
        }
        return -1;
    }
}
