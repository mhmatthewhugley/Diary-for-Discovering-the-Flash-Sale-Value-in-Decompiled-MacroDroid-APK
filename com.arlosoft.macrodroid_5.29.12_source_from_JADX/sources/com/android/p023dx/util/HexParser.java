package com.android.p023dx.util;

/* renamed from: com.android.dx.util.HexParser */
public final class HexParser {
    private HexParser() {
    }

    public static byte[] parse(String str) {
        String str2;
        int indexOf;
        String str3 = str;
        int length = str.length();
        int i = length / 2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int indexOf2 = str3.indexOf(10, i3);
            if (indexOf2 < 0) {
                indexOf2 = length;
            }
            int indexOf3 = str3.indexOf(35, i3);
            if (indexOf3 < 0 || indexOf3 >= indexOf2) {
                str2 = str3.substring(i3, indexOf2);
            } else {
                str2 = str3.substring(i3, indexOf3);
            }
            int i5 = indexOf2 + 1;
            int indexOf4 = str2.indexOf(58);
            if (indexOf4 != -1 && ((indexOf = str2.indexOf(34)) == -1 || indexOf >= indexOf4)) {
                String trim = str2.substring(i2, indexOf4).trim();
                str2 = str2.substring(indexOf4 + 1);
                if (Integer.parseInt(trim, 16) != i4) {
                    throw new RuntimeException("bogus offset marker: " + trim);
                }
            }
            int length2 = str2.length();
            int i6 = -1;
            boolean z = false;
            for (int i7 = 0; i7 < length2; i7++) {
                char charAt = str2.charAt(i7);
                if (z) {
                    if (charAt == '\"') {
                        z = false;
                    } else {
                        bArr[i4] = (byte) charAt;
                        i4++;
                    }
                } else if (charAt > ' ') {
                    if (charAt != '\"') {
                        int digit = Character.digit(charAt, 16);
                        if (digit == -1) {
                            throw new RuntimeException("bogus digit character: \"" + charAt + "\"");
                        } else if (i6 == -1) {
                            i6 = digit;
                        } else {
                            bArr[i4] = (byte) ((i6 << 4) | digit);
                            i4++;
                            i6 = -1;
                        }
                    } else if (i6 == -1) {
                        z = true;
                    } else {
                        throw new RuntimeException("spare digit around offset " + Hex.m909u4(i4));
                    }
                }
            }
            if (i6 != -1) {
                throw new RuntimeException("spare digit around offset " + Hex.m909u4(i4));
            } else if (!z) {
                i3 = i5;
                i2 = 0;
            } else {
                throw new RuntimeException("unterminated quote around offset " + Hex.m909u4(i4));
            }
        }
        if (i4 >= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }
}
