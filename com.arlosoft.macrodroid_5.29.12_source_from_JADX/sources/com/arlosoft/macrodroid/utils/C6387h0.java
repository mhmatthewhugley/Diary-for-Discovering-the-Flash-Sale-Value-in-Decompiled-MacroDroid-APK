package com.arlosoft.macrodroid.utils;

import java.util.Locale;

/* renamed from: com.arlosoft.macrodroid.utils.h0 */
/* compiled from: HexHelper */
class C6387h0 {
    /* renamed from: a */
    public static byte[] m24641a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        int length = lowerCase.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            char charAt = lowerCase.charAt(i2);
            byte b = (byte) ((charAt >= 'a' ? (charAt - 'a') + 10 : charAt - '0') << 4);
            int i4 = i3 + 1;
            char charAt2 = lowerCase.charAt(i3);
            bArr[i] = (byte) (b | ((byte) (charAt2 >= 'a' ? (charAt2 - 'a') + 10 : charAt2 - '0')));
            i++;
            i2 = i4;
        }
        return bArr;
    }
}
