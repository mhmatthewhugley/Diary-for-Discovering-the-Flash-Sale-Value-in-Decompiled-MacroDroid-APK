package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class UnicodeEscaper extends Escaper {
    protected UnicodeEscaper() {
    }

    /* renamed from: b */
    protected static int m29234b(CharSequence charSequence, int i, int i2) {
        Preconditions.m5392s(charSequence);
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                String valueOf = String.valueOf(charSequence);
                StringBuilder sb = new StringBuilder(valueOf.length() + 88);
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append(charAt);
                sb.append(" at index ");
                sb.append(i3 - 1);
                sb.append(" in '");
                sb.append(valueOf);
                sb.append("'");
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                String valueOf2 = String.valueOf(charSequence);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 89);
                sb2.append("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append("' with value ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i3);
                sb2.append(" in '");
                sb2.append(valueOf2);
                sb2.append("'");
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    /* renamed from: e */
    private static char[] m29235e(char[] cArr, int i, int i2) {
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
        int f = mo36791f(str, 0, length);
        return f == length ? str : mo36800d(str, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract char[] mo36790c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo36800d(String str, int i) {
        int length = str.length();
        char[] a = Platform.m29232a();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int b = m29234b(str, i, length);
            if (b >= 0) {
                char[] c = mo36790c(b);
                int i4 = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
                if (c != null) {
                    int i5 = i - i2;
                    int i6 = i3 + i5;
                    int length2 = c.length + i6;
                    if (a.length < length2) {
                        a = m29235e(a, i3, length2 + (length - i) + 32);
                    }
                    if (i5 > 0) {
                        str.getChars(i2, i, a, i3);
                        i3 = i6;
                    }
                    if (c.length > 0) {
                        System.arraycopy(c, 0, a, i3, c.length);
                        i3 += c.length;
                    }
                    i2 = i4;
                }
                i = mo36791f(str, i4, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (a.length < i8) {
                a = m29235e(a, i3, i8);
            }
            str.getChars(i2, length, a, i3);
            i3 = i8;
        }
        return new String(a, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo36791f(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            int b = m29234b(charSequence, i, i2);
            if (b < 0 || mo36790c(b) != null) {
                break;
            }
            i += Character.isSupplementaryCodePoint(b) ? 2 : 1;
        }
        return i;
    }
}
