package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends Escaper {
    protected CharEscaper() {
    }

    /* renamed from: d */
    private static char[] m29215d(char[] cArr, int i, int i2) {
        if (i2 >= 0) {
            char[] cArr2 = new char[i2];
            if (i > 0) {
                System.arraycopy(cArr, 0, cArr2, 0, i);
            }
            return cArr2;
        }
        throw new AssertionError("Cannot increase internal buffer any further");
    }

    /* renamed from: a */
    public String mo36786a(String str) {
        Preconditions.m5392s(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (mo36787b(str.charAt(i)) != null) {
                return mo36793c(str, i);
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract char[] mo36787b(char c);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo36793c(String str, int i) {
        int length = str.length();
        char[] a = Platform.m29232a();
        int length2 = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] b = mo36787b(str.charAt(i));
            if (b != null) {
                int length3 = b.length;
                int i4 = i - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    length2 = ((length - i) * 2) + i6;
                    a = m29215d(a, i3, length2);
                }
                if (i4 > 0) {
                    str.getChars(i2, i, a, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(b, 0, a, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (length2 < i8) {
                a = m29215d(a, i3, i8);
            }
            str.getChars(i2, length, a, i3);
            i3 = i8;
        }
        return new String(a, 0, i3);
    }
}
