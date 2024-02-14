package com.fasterxml.jackson.core.p072io;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: com.fasterxml.jackson.core.io.i */
/* compiled from: NumberOutput */
public final class C6816i {

    /* renamed from: a */
    private static int f15843a = 1000000;

    /* renamed from: b */
    private static int f15844b = 1000000000;

    /* renamed from: c */
    private static long f15845c = 10000000000L;

    /* renamed from: d */
    private static long f15846d = 1000;

    /* renamed from: e */
    private static long f15847e = -2147483648L;

    /* renamed from: f */
    private static long f15848f = 2147483647L;

    /* renamed from: g */
    static final String f15849g = String.valueOf(Long.MIN_VALUE);

    /* renamed from: h */
    static final char[] f15850h = new char[4000];

    /* renamed from: i */
    static final char[] f15851i = new char[4000];

    /* renamed from: j */
    static final byte[] f15852j = new byte[4000];

    /* renamed from: k */
    static final String[] f15853k = {"0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "10"};

    /* renamed from: l */
    static final String[] f15854l = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        int i2 = 0;
        while (i < 10) {
            char c = (char) (i + 48);
            char c2 = i == 0 ? 0 : c;
            int i3 = 0;
            while (i3 < 10) {
                char c3 = (char) (i3 + 48);
                char c4 = (i == 0 && i3 == 0) ? 0 : c3;
                for (int i4 = 0; i4 < 10; i4++) {
                    char c5 = (char) (i4 + 48);
                    char[] cArr = f15850h;
                    cArr[i2] = c2;
                    int i5 = i2 + 1;
                    cArr[i5] = c4;
                    int i6 = i2 + 2;
                    cArr[i6] = c5;
                    char[] cArr2 = f15851i;
                    cArr2[i2] = c;
                    cArr2[i5] = c3;
                    cArr2[i6] = c5;
                    i2 += 4;
                }
                i3++;
            }
            i++;
        }
        for (int i7 = 0; i7 < 4000; i7++) {
            f15852j[i7] = (byte) f15851i[i7];
        }
    }

    /* renamed from: a */
    private static int m25619a(long j) {
        int i = 10;
        for (long j2 = f15845c; j >= j2 && i != 19; j2 = (j2 << 1) + (j2 << 3)) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    private static int m25620b(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        byte[] bArr2 = f15852j;
        int i5 = i3 + 1;
        bArr[i2] = bArr2[i3];
        int i6 = i4 + 1;
        bArr[i4] = bArr2[i5];
        int i7 = i6 + 1;
        bArr[i6] = bArr2[i5 + 1];
        return i7;
    }

    /* renamed from: c */
    private static int m25621c(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        char[] cArr2 = f15851i;
        int i5 = i3 + 1;
        cArr[i2] = cArr2[i3];
        int i6 = i4 + 1;
        cArr[i4] = cArr2[i5];
        int i7 = i6 + 1;
        cArr[i6] = cArr2[i5 + 1];
        return i7;
    }

    /* renamed from: d */
    public static int m25622d(int i, byte[] bArr, int i2) {
        int i3;
        int i4;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m25626h((long) i, bArr, i2);
            }
            bArr[i2] = Framer.STDIN_FRAME_PREFIX;
            i = -i;
            i2++;
        }
        if (r4 >= f15843a) {
            int i5 = f15844b;
            boolean z = r4 >= i5;
            if (z) {
                r4 -= i5;
                if (r4 >= i5) {
                    r4 -= i5;
                    i4 = i2 + 1;
                    bArr[i2] = Framer.STDERR_FRAME_PREFIX;
                } else {
                    i4 = i2 + 1;
                    bArr[i2] = Framer.STDOUT_FRAME_PREFIX;
                }
                i2 = i4;
            }
            int i6 = r4 / 1000;
            int i7 = r4 - (i6 * 1000);
            int i8 = i6 / 1000;
            int i9 = i6 - (i8 * 1000);
            if (z) {
                i3 = m25620b(i8, bArr, i2);
            } else {
                i3 = m25624f(i8, bArr, i2);
            }
            return m25620b(i7, bArr, m25620b(i9, bArr, i3));
        } else if (r4 >= 1000) {
            int i10 = r4 / 1000;
            return m25620b(r4 - (i10 * 1000), bArr, m25624f(i10, bArr, i2));
        } else if (r4 >= 10) {
            return m25624f(r4, bArr, i2);
        } else {
            int i11 = i2 + 1;
            bArr[i2] = (byte) (r4 + 48);
            return i11;
        }
    }

    /* renamed from: e */
    public static int m25623e(int i, char[] cArr, int i2) {
        int i3;
        int i4;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return m25627i((long) i, cArr, i2);
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (r4 >= f15843a) {
            int i5 = f15844b;
            boolean z = r4 >= i5;
            if (z) {
                r4 -= i5;
                if (r4 >= i5) {
                    r4 -= i5;
                    i4 = i2 + 1;
                    cArr[i2] = '2';
                } else {
                    i4 = i2 + 1;
                    cArr[i2] = '1';
                }
                i2 = i4;
            }
            int i6 = r4 / 1000;
            int i7 = r4 - (i6 * 1000);
            int i8 = i6 / 1000;
            int i9 = i6 - (i8 * 1000);
            if (z) {
                i3 = m25621c(i8, cArr, i2);
            } else {
                i3 = m25625g(i8, cArr, i2);
            }
            return m25621c(i7, cArr, m25621c(i9, cArr, i3));
        } else if (r4 >= 1000) {
            int i10 = r4 / 1000;
            return m25621c(r4 - (i10 * 1000), cArr, m25625g(i10, cArr, i2));
        } else if (r4 >= 10) {
            return m25625g(r4, cArr, i2);
        } else {
            int i11 = i2 + 1;
            cArr[i2] = (char) (r4 + 48);
            return i11;
        }
    }

    /* renamed from: f */
    private static int m25624f(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        char[] cArr = f15850h;
        int i4 = i3 + 1;
        char c = cArr[i3];
        if (c != 0) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int i5 = i4 + 1;
        char c2 = cArr[i4];
        if (c2 != 0) {
            bArr[i2] = (byte) c2;
            i2++;
        }
        int i6 = i2 + 1;
        bArr[i2] = (byte) cArr[i5];
        return i6;
    }

    /* renamed from: g */
    private static int m25625g(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        char[] cArr2 = f15850h;
        int i4 = i3 + 1;
        char c = cArr2[i3];
        if (c != 0) {
            cArr[i2] = c;
            i2++;
        }
        int i5 = i4 + 1;
        char c2 = cArr2[i4];
        if (c2 != 0) {
            cArr[i2] = c2;
            i2++;
        }
        int i6 = i2 + 1;
        cArr[i2] = cArr2[i5];
        return i6;
    }

    /* renamed from: h */
    public static int m25626h(long j, byte[] bArr, int i) {
        if (j < 0) {
            if (j > f15847e) {
                return m25622d((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                int length = f15849g.length();
                int i2 = 0;
                while (i2 < length) {
                    bArr[i] = (byte) f15849g.charAt(i2);
                    i2++;
                    i++;
                }
                return i;
            }
            bArr[i] = Framer.STDIN_FRAME_PREFIX;
            j = -j;
            i++;
        } else if (j <= f15848f) {
            return m25622d((int) j, bArr, i);
        }
        int a = m25619a(j) + i;
        int i3 = a;
        while (j > f15848f) {
            i3 -= 3;
            long j2 = f15846d;
            long j3 = j / j2;
            m25620b((int) (j - (j2 * j3)), bArr, i3);
            j = j3;
        }
        int i4 = (int) j;
        while (i4 >= 1000) {
            i3 -= 3;
            int i5 = i4 / 1000;
            m25620b(i4 - (i5 * 1000), bArr, i3);
            i4 = i5;
        }
        m25624f(i4, bArr, i);
        return a;
    }

    /* renamed from: i */
    public static int m25627i(long j, char[] cArr, int i) {
        if (j < 0) {
            if (j > f15847e) {
                return m25623e((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                String str = f15849g;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return i + length;
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= f15848f) {
            return m25623e((int) j, cArr, i);
        }
        int a = m25619a(j) + i;
        int i2 = a;
        while (j > f15848f) {
            i2 -= 3;
            long j2 = f15846d;
            long j3 = j / j2;
            m25621c((int) (j - (j2 * j3)), cArr, i2);
            j = j3;
        }
        int i3 = (int) j;
        while (i3 >= 1000) {
            i2 -= 3;
            int i4 = i3 / 1000;
            m25621c(i3 - (i4 * 1000), cArr, i2);
            i3 = i4;
        }
        m25625g(i3, cArr, i);
        return a;
    }
}
