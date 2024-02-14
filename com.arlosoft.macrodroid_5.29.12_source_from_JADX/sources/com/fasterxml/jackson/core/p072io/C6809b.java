package com.fasterxml.jackson.core.p072io;

import com.android.p023dx.p026io.Opcodes;
import java.util.Arrays;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.fasterxml.jackson.core.io.b */
/* compiled from: CharTypes */
public final class C6809b {

    /* renamed from: a */
    private static final char[] f15812a;

    /* renamed from: b */
    private static final byte[] f15813b;

    /* renamed from: c */
    static final int[] f15814c;

    /* renamed from: d */
    static final int[] f15815d;

    /* renamed from: e */
    static final int[] f15816e;

    /* renamed from: f */
    static final int[] f15817f;

    /* renamed from: g */
    static final int[] f15818g;

    /* renamed from: h */
    static final int[] f15819h;

    /* renamed from: i */
    static final int[] f15820i;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f15812a = charArray;
        int length = charArray.length;
        f15813b = new byte[length];
        for (int i = 0; i < length; i++) {
            f15813b[i] = (byte) f15812a[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f15814c = iArr;
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        for (int i3 = 128; i3 < 256; i3++) {
            iArr2[i3] = (i3 & Opcodes.SHL_INT_LIT8) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
        }
        f15815d = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i4 = 33; i4 < 256; i4++) {
            if (Character.isJavaIdentifierPart((char) i4)) {
                iArr3[i4] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        f15816e = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
        Arrays.fill(iArr4, 128, 128, 0);
        f15817f = iArr4;
        int[] iArr5 = new int[256];
        f15818g = iArr5;
        System.arraycopy(f15815d, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        int[] iArr6 = new int[128];
        for (int i5 = 0; i5 < 32; i5++) {
            iArr6[i5] = -1;
        }
        iArr6[34] = 34;
        iArr6[92] = 92;
        iArr6[8] = 98;
        iArr6[9] = 116;
        iArr6[12] = 102;
        iArr6[10] = 110;
        iArr6[13] = 114;
        f15819h = iArr6;
        int[] iArr7 = new int[128];
        f15820i = iArr7;
        Arrays.fill(iArr7, -1);
        for (int i6 = 0; i6 < 10; i6++) {
            f15820i[i6 + 48] = i6;
        }
        for (int i7 = 0; i7 < 6; i7++) {
            int[] iArr8 = f15820i;
            int i8 = i7 + 10;
            iArr8[i7 + 97] = i8;
            iArr8[i7 + 65] = i8;
        }
    }

    /* renamed from: a */
    public static void m25586a(StringBuilder sb, String str) {
        int[] iArr = f15819h;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    int i3 = -(i2 + 1);
                    char[] cArr = f15812a;
                    sb.append(cArr[i3 >> 4]);
                    sb.append(cArr[i3 & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m25587b(int i) {
        if (i > 127) {
            return -1;
        }
        return f15820i[i];
    }

    /* renamed from: c */
    public static byte[] m25588c() {
        return (byte[]) f15813b.clone();
    }

    /* renamed from: d */
    public static char[] m25589d() {
        return (char[]) f15812a.clone();
    }

    /* renamed from: e */
    public static int[] m25590e() {
        return f15819h;
    }

    /* renamed from: f */
    public static int[] m25591f() {
        return f15818g;
    }

    /* renamed from: g */
    public static int[] m25592g() {
        return f15814c;
    }

    /* renamed from: h */
    public static int[] m25593h() {
        return f15816e;
    }

    /* renamed from: i */
    public static int[] m25594i() {
        return f15815d;
    }

    /* renamed from: j */
    public static int[] m25595j() {
        return f15817f;
    }
}
