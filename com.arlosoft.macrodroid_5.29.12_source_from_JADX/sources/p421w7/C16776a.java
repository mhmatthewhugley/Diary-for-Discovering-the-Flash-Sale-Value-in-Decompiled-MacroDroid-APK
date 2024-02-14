package p421w7;

/* renamed from: w7.a */
/* compiled from: MD4 */
public final class C16776a {

    /* renamed from: f */
    private static final byte[] f67735f;

    /* renamed from: a */
    private final int[] f67736a = new int[4];

    /* renamed from: b */
    private final int[] f67737b = new int[16];

    /* renamed from: c */
    private final byte[] f67738c = new byte[64];

    /* renamed from: d */
    private int f67739d;

    /* renamed from: e */
    private long f67740e;

    static {
        byte[] bArr = new byte[136];
        f67735f = bArr;
        bArr[0] = Byte.MIN_VALUE;
    }

    public C16776a() {
        m99494h();
    }

    /* renamed from: a */
    private static int m99488a(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + (((~i2) & i4) | (i3 & i2)) + i5;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    /* renamed from: b */
    private static int m99489b(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 & i4) | (i2 & i3) | (i3 & i4)) + i5 + 1518500249;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    /* renamed from: c */
    private static int m99490c(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i + ((i2 ^ i3) ^ i4) + i5 + 1859775393;
        return (i7 >>> (32 - i6)) | (i7 << i6);
    }

    /* renamed from: e */
    private void m99491e(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            if (i < 0 || i2 < 0 || i > bArr.length - i2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (this.f67740e < 0) {
                m99494h();
            }
            this.f67740e += (long) i2;
            int i3 = this.f67739d;
            if (i3 != 0) {
                int min = Math.min(i2, 64 - i3);
                System.arraycopy(bArr, i, this.f67738c, this.f67739d, min);
                int i4 = this.f67739d + min;
                this.f67739d = i4;
                i += min;
                i2 -= min;
                if (i4 >= 64) {
                    m99492f(this.f67738c, 0);
                    this.f67739d = 0;
                }
            }
            while (i2 >= 64) {
                m99492f(bArr, i);
                i2 -= 64;
                i += 64;
            }
            if (i2 > 0) {
                System.arraycopy(bArr, i, this.f67738c, 0, i2);
                this.f67739d = i2;
            }
        }
    }

    /* renamed from: f */
    private void m99492f(byte[] bArr, int i) {
        int i2 = i;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f67737b;
            if (i3 < iArr.length) {
                iArr[i3] = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24);
                i2 += 4;
                i3++;
            } else {
                int[] iArr2 = this.f67736a;
                int i4 = iArr2[0];
                int i5 = iArr2[1];
                int i6 = iArr2[2];
                int i7 = iArr2[3];
                int a = m99488a(i4, i5, i6, i7, iArr[0], 3);
                int a2 = m99488a(i7, a, i5, i6, this.f67737b[1], 7);
                int a3 = m99488a(i6, a2, a, i5, this.f67737b[2], 11);
                int a4 = m99488a(i5, a3, a2, a, this.f67737b[3], 19);
                int a5 = m99488a(a, a4, a3, a2, this.f67737b[4], 3);
                int a6 = m99488a(a2, a5, a4, a3, this.f67737b[5], 7);
                int a7 = m99488a(a3, a6, a5, a4, this.f67737b[6], 11);
                int a8 = m99488a(a4, a7, a6, a5, this.f67737b[7], 19);
                int a9 = m99488a(a5, a8, a7, a6, this.f67737b[8], 3);
                int a10 = m99488a(a6, a9, a8, a7, this.f67737b[9], 7);
                int a11 = m99488a(a7, a10, a9, a8, this.f67737b[10], 11);
                int a12 = m99488a(a8, a11, a10, a9, this.f67737b[11], 19);
                int a13 = m99488a(a9, a12, a11, a10, this.f67737b[12], 3);
                int a14 = m99488a(a10, a13, a12, a11, this.f67737b[13], 7);
                int a15 = m99488a(a11, a14, a13, a12, this.f67737b[14], 11);
                int a16 = m99488a(a12, a15, a14, a13, this.f67737b[15], 19);
                int b = m99489b(a13, a16, a15, a14, this.f67737b[0], 3);
                int b2 = m99489b(a14, b, a16, a15, this.f67737b[4], 5);
                int b3 = m99489b(a15, b2, b, a16, this.f67737b[8], 9);
                int b4 = m99489b(a16, b3, b2, b, this.f67737b[12], 13);
                int b5 = m99489b(b, b4, b3, b2, this.f67737b[1], 3);
                int b6 = m99489b(b2, b5, b4, b3, this.f67737b[5], 5);
                int b7 = m99489b(b3, b6, b5, b4, this.f67737b[9], 9);
                int b8 = m99489b(b4, b7, b6, b5, this.f67737b[13], 13);
                int b9 = m99489b(b5, b8, b7, b6, this.f67737b[2], 3);
                int b10 = m99489b(b6, b9, b8, b7, this.f67737b[6], 5);
                int b11 = m99489b(b7, b10, b9, b8, this.f67737b[10], 9);
                int b12 = m99489b(b8, b11, b10, b9, this.f67737b[14], 13);
                int b13 = m99489b(b9, b12, b11, b10, this.f67737b[3], 3);
                int i8 = b13;
                int b14 = m99489b(b10, i8, b12, b11, this.f67737b[7], 5);
                int b15 = m99489b(b11, b14, b13, b12, this.f67737b[11], 9);
                int b16 = m99489b(b12, b15, b14, b13, this.f67737b[15], 13);
                int c = m99490c(i8, b16, b15, b14, this.f67737b[0], 3);
                int c2 = m99490c(b14, c, b16, b15, this.f67737b[8], 9);
                int c3 = m99490c(b15, c2, c, b16, this.f67737b[4], 11);
                int c4 = m99490c(b16, c3, c2, c, this.f67737b[12], 15);
                int c5 = m99490c(c, c4, c3, c2, this.f67737b[2], 3);
                int c6 = m99490c(c2, c5, c4, c3, this.f67737b[10], 9);
                int c7 = m99490c(c3, c6, c5, c4, this.f67737b[6], 11);
                int c8 = m99490c(c4, c7, c6, c5, this.f67737b[14], 15);
                int c9 = m99490c(c5, c8, c7, c6, this.f67737b[1], 3);
                int c10 = m99490c(c6, c9, c8, c7, this.f67737b[9], 9);
                int c11 = m99490c(c7, c10, c9, c8, this.f67737b[5], 11);
                int c12 = m99490c(c8, c11, c10, c9, this.f67737b[13], 15);
                int c13 = m99490c(c9, c12, c11, c10, this.f67737b[3], 3);
                int c14 = m99490c(c10, c13, c12, c11, this.f67737b[11], 9);
                int i9 = c14;
                int i10 = c13;
                int c15 = m99490c(c11, i9, i10, c12, this.f67737b[7], 11);
                int c16 = m99490c(c12, c15, i9, i10, this.f67737b[15], 15);
                int[] iArr3 = this.f67736a;
                iArr3[0] = iArr3[0] + c13;
                iArr3[1] = iArr3[1] + c16;
                iArr3[2] = iArr3[2] + c15;
                iArr3[3] = iArr3[3] + c14;
                return;
            }
        }
    }

    /* renamed from: g */
    private void m99493g(byte[] bArr, int i) {
        long j = this.f67740e;
        long j2 = j << 3;
        int i2 = ((int) j) & 63;
        int i3 = 0;
        m99491e(f67735f, 0, i2 < 56 ? 56 - i2 : 120 - i2);
        byte[] bArr2 = this.f67738c;
        bArr2[56] = (byte) ((int) j2);
        bArr2[57] = (byte) ((int) (j2 >> 8));
        bArr2[58] = (byte) ((int) (j2 >> 16));
        bArr2[59] = (byte) ((int) (j2 >> 24));
        bArr2[60] = (byte) ((int) (j2 >> 32));
        bArr2[61] = (byte) ((int) (j2 >> 40));
        bArr2[62] = (byte) ((int) (j2 >> 48));
        bArr2[63] = (byte) ((int) (j2 >> 56));
        m99492f(bArr2, 0);
        while (true) {
            int[] iArr = this.f67736a;
            if (i3 < iArr.length) {
                int i4 = iArr[i3];
                int i5 = i + 1;
                bArr[i] = (byte) i4;
                int i6 = i5 + 1;
                bArr[i5] = (byte) (i4 >> 8);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (i4 >> 16);
                i = i7 + 1;
                bArr[i7] = (byte) (i4 >> 24);
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private void m99494h() {
        int[] iArr = this.f67736a;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        this.f67739d = 0;
        this.f67740e = 0;
    }

    /* renamed from: d */
    public byte[] mo79759d(byte[] bArr) {
        m99494h();
        m99491e(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[16];
        m99493g(bArr2, 0);
        return bArr2;
    }
}
