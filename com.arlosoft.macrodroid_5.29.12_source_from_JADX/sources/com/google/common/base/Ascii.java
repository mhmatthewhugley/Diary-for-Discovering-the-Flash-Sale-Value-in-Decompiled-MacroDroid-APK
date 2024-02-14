package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Ascii {
    private Ascii() {
    }

    /* renamed from: a */
    public static boolean m5145a(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: b */
    public static boolean m5146b(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: c */
    public static String m5147c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m5146b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m5146b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: d */
    public static char m5148d(char c) {
        return m5145a(c) ? (char) (c ^ ' ') : c;
    }

    /* renamed from: e */
    public static String m5149e(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m5145a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m5145a(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: f */
    public static String m5150f(CharSequence charSequence, int i, String str) {
        Preconditions.m5392s(charSequence);
        int length = i - str.length();
        Preconditions.m5382i(length >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", i, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i) {
                return charSequence2;
            }
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(str2, 0, length);
        sb.append(str);
        return sb.toString();
    }
}
