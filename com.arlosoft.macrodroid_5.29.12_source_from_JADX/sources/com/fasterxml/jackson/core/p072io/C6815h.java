package com.fasterxml.jackson.core.p072io;

import androidx.core.location.LocationRequestCompat;

/* renamed from: com.fasterxml.jackson.core.io.h */
/* compiled from: NumberInput */
public final class C6815h {

    /* renamed from: a */
    static final String f15841a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* renamed from: b */
    static final String f15842b = String.valueOf(LocationRequestCompat.PASSIVE_INTERVAL);

    /* renamed from: a */
    public static boolean m25615a(char[] cArr, int i, int i2, boolean z) {
        String str = z ? f15841a : f15842b;
        int length = str.length();
        if (i2 < length) {
            return true;
        }
        if (i2 > length) {
            return false;
        }
        int i3 = 0;
        while (i3 < length) {
            int charAt = cArr[i + i3] - str.charAt(i3);
            if (charAt == 0) {
                i3++;
            } else if (charAt < 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static double m25616b(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    /* renamed from: c */
    public static int m25617c(char[] cArr, int i, int i2) {
        int i3 = cArr[i] - '0';
        int i4 = i2 + i;
        int i5 = i + 1;
        if (i5 >= i4) {
            return i3;
        }
        int i6 = (i3 * 10) + (cArr[i5] - '0');
        int i7 = i5 + 1;
        if (i7 >= i4) {
            return i6;
        }
        int i8 = (i6 * 10) + (cArr[i7] - '0');
        int i9 = i7 + 1;
        if (i9 >= i4) {
            return i8;
        }
        int i10 = (i8 * 10) + (cArr[i9] - '0');
        int i11 = i9 + 1;
        if (i11 >= i4) {
            return i10;
        }
        int i12 = (i10 * 10) + (cArr[i11] - '0');
        int i13 = i11 + 1;
        if (i13 >= i4) {
            return i12;
        }
        int i14 = (i12 * 10) + (cArr[i13] - '0');
        int i15 = i13 + 1;
        if (i15 >= i4) {
            return i14;
        }
        int i16 = (i14 * 10) + (cArr[i15] - '0');
        int i17 = i15 + 1;
        if (i17 >= i4) {
            return i16;
        }
        int i18 = (i16 * 10) + (cArr[i17] - '0');
        int i19 = i17 + 1;
        return i19 < i4 ? (i18 * 10) + (cArr[i19] - '0') : i18;
    }

    /* renamed from: d */
    public static long m25618d(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (((long) m25617c(cArr, i, i3)) * 1000000000) + ((long) m25617c(cArr, i + i3, 9));
    }
}
