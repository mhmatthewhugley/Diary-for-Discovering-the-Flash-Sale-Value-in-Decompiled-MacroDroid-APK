package com.google.api.client.util.escape;

public abstract class UnicodeEscaper extends Escaper {
    /* renamed from: b */
    protected static int m72758b(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                StringBuilder sb = new StringBuilder(82);
                sb.append("Unexpected low surrogate character '");
                sb.append(charAt);
                sb.append("' with value ");
                sb.append(charAt);
                sb.append(" at index ");
                sb.append(i3 - 1);
                throw new IllegalArgumentException(sb.toString());
            } else if (i3 == i2) {
                return -charAt;
            } else {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return Character.toCodePoint(charAt, charAt2);
                }
                StringBuilder sb2 = new StringBuilder(83);
                sb2.append("Expected low surrogate but got char '");
                sb2.append(charAt2);
                sb2.append("' with value ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
    }

    /* renamed from: e */
    private static char[] m72759e(char[] cArr, int i, int i2) {
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract char[] mo60790c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo60794d(String str, int i) {
        int length = str.length();
        char[] a = Platform.m72756a();
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int b = m72758b(str, i, length);
            if (b >= 0) {
                char[] c = mo60790c(b);
                int i4 = (Character.isSupplementaryCodePoint(b) ? 2 : 1) + i;
                if (c != null) {
                    int i5 = i - i2;
                    int i6 = i3 + i5;
                    int length2 = c.length + i6;
                    if (a.length < length2) {
                        a = m72759e(a, i3, ((length2 + length) - i) + 32);
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
                i = mo60791f(str, i4, length);
            } else {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (a.length < i8) {
                a = m72759e(a, i3, i8);
            }
            str.getChars(i2, length, a, i3);
            i3 = i8;
        }
        return new String(a, 0, i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract int mo60791f(CharSequence charSequence, int i, int i2);
}
