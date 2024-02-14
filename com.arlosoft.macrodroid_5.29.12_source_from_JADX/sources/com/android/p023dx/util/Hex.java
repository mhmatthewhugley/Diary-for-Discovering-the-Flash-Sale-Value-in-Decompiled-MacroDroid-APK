package com.android.p023dx.util;

/* renamed from: com.android.dx.util.Hex */
public final class Hex {
    private Hex() {
    }

    public static String dump(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        String str;
        int i6 = i + i2;
        if ((i | i2 | i6) < 0 || i6 > bArr.length) {
            throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i + "..!" + i6);
        } else if (i3 < 0) {
            throw new IllegalArgumentException("outOffset < 0");
        } else if (i2 == 0) {
            return "";
        } else {
            StringBuffer stringBuffer = new StringBuffer((i2 * 4) + 6);
            int i7 = 0;
            while (i2 > 0) {
                if (i7 == 0) {
                    if (i5 == 2) {
                        str = m906u1(i3);
                    } else if (i5 == 4) {
                        str = m907u2(i3);
                    } else if (i5 != 6) {
                        str = m909u4(i3);
                    } else {
                        str = m908u3(i3);
                    }
                    stringBuffer.append(str);
                    stringBuffer.append(": ");
                } else if ((i7 & 1) == 0) {
                    stringBuffer.append(' ');
                }
                stringBuffer.append(m906u1(bArr[i]));
                i3++;
                i++;
                i7++;
                if (i7 == i4) {
                    stringBuffer.append(10);
                    i7 = 0;
                }
                i2--;
            }
            if (i7 != 0) {
                stringBuffer.append(10);
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: s1 */
    public static String m902s1(int i) {
        char[] cArr = new char[3];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[2 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: s2 */
    public static String m903s2(int i) {
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: s4 */
    public static String m904s4(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: s8 */
    public static String m905s8(long j) {
        char[] cArr = new char[17];
        if (j < 0) {
            cArr[0] = '-';
            j = -j;
        } else {
            cArr[0] = '+';
        }
        for (int i = 0; i < 16; i++) {
            cArr[16 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: u1 */
    public static String m906u1(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: u2 */
    public static String m907u2(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String u2or4(int i) {
        if (i == ((char) i)) {
            return m907u2(i);
        }
        return m909u4(i);
    }

    /* renamed from: u3 */
    public static String m908u3(int i) {
        char[] cArr = new char[6];
        for (int i2 = 0; i2 < 6; i2++) {
            cArr[5 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: u4 */
    public static String m909u4(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* renamed from: u8 */
    public static String m910u8(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public static String uNibble(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }
}
