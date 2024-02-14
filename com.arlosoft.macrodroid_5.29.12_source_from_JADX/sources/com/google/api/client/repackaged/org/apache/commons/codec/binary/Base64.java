package com.google.api.client.repackaged.org.apache.commons.codec.binary;

public class Base64 extends BaseNCodec {

    /* renamed from: r */
    static final byte[] f52657r = {13, 10};

    /* renamed from: s */
    private static final byte[] f52658s = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: t */
    private static final byte[] f52659t = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};

    /* renamed from: u */
    private static final byte[] f52660u = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51};

    /* renamed from: l */
    private final byte[] f52661l;

    /* renamed from: m */
    private final byte[] f52662m;

    /* renamed from: n */
    private final byte[] f52663n;

    /* renamed from: o */
    private final int f52664o;

    /* renamed from: p */
    private final int f52665p;

    /* renamed from: q */
    private int f52666q;

    public Base64() {
        this(0);
    }

    /* renamed from: o */
    public static byte[] m72518o(String str) {
        return new Base64().mo60630d(str);
    }

    /* renamed from: p */
    public static byte[] m72519p(byte[] bArr, boolean z) {
        return m72520q(bArr, z, false);
    }

    /* renamed from: q */
    public static byte[] m72520q(byte[] bArr, boolean z, boolean z2) {
        return m72521r(bArr, z, z2, Integer.MAX_VALUE);
    }

    /* renamed from: r */
    public static byte[] m72521r(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z ? new Base64(z2) : new Base64(0, f52657r, z2);
        long j = base64.mo60635j(bArr);
        if (j <= ((long) i)) {
            return base64.mo60632g(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + j + ") than the specified maximum size of " + i);
    }

    /* renamed from: s */
    public static String m72522s(byte[] bArr) {
        return StringUtils.m72545e(m72519p(bArr, false));
    }

    /* renamed from: t */
    public static String m72523t(byte[] bArr) {
        return StringUtils.m72545e(m72520q(bArr, false, true));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo60625c(byte[] bArr, int i, int i2) {
        byte b;
        if (!this.f52675i) {
            if (i2 < 0) {
                this.f52675i = true;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                mo60633h(this.f52664o);
                int i4 = i + 1;
                byte b2 = bArr[i];
                if (b2 == 61) {
                    this.f52675i = true;
                    break;
                }
                if (b2 >= 0) {
                    byte[] bArr2 = f52660u;
                    if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                        int i5 = (this.f52677k + 1) % 4;
                        this.f52677k = i5;
                        int i6 = (this.f52666q << 6) + b;
                        this.f52666q = i6;
                        if (i5 == 0) {
                            byte[] bArr3 = this.f52672f;
                            int i7 = this.f52673g;
                            int i8 = i7 + 1;
                            this.f52673g = i8;
                            bArr3[i7] = (byte) ((i6 >> 16) & 255);
                            int i9 = i8 + 1;
                            this.f52673g = i9;
                            bArr3[i8] = (byte) ((i6 >> 8) & 255);
                            this.f52673g = i9 + 1;
                            bArr3[i9] = (byte) (i6 & 255);
                        }
                    }
                }
                i3++;
                i = i4;
            }
            if (this.f52675i && this.f52677k != 0) {
                mo60633h(this.f52664o);
                int i10 = this.f52677k;
                if (i10 == 2) {
                    int i11 = this.f52666q >> 4;
                    this.f52666q = i11;
                    byte[] bArr4 = this.f52672f;
                    int i12 = this.f52673g;
                    this.f52673g = i12 + 1;
                    bArr4[i12] = (byte) (i11 & 255);
                } else if (i10 == 3) {
                    int i13 = this.f52666q >> 2;
                    this.f52666q = i13;
                    byte[] bArr5 = this.f52672f;
                    int i14 = this.f52673g;
                    int i15 = i14 + 1;
                    this.f52673g = i15;
                    bArr5[i14] = (byte) ((i13 >> 8) & 255);
                    this.f52673g = i15 + 1;
                    bArr5[i15] = (byte) (i13 & 255);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60626f(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            boolean r0 = r9.f52675i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r12 >= 0) goto L_0x00a9
            r9.f52675i = r1
            int r10 = r9.f52677k
            if (r10 != 0) goto L_0x0014
            int r10 = r9.f52670d
            if (r10 != 0) goto L_0x0014
            return
        L_0x0014:
            int r10 = r9.f52665p
            r9.mo60633h(r10)
            int r10 = r9.f52673g
            int r11 = r9.f52677k
            r12 = 61
            if (r11 == r1) goto L_0x005a
            r1 = 2
            if (r11 == r1) goto L_0x0025
            goto L_0x0088
        L_0x0025:
            byte[] r11 = r9.f52672f
            int r2 = r10 + 1
            r9.f52673g = r2
            byte[] r3 = r9.f52661l
            int r4 = r9.f52666q
            int r5 = r4 >> 10
            r5 = r5 & 63
            byte r5 = r3[r5]
            r11[r10] = r5
            int r5 = r2 + 1
            r9.f52673g = r5
            int r6 = r4 >> 4
            r6 = r6 & 63
            byte r6 = r3[r6]
            r11[r2] = r6
            int r2 = r5 + 1
            r9.f52673g = r2
            int r1 = r4 << 2
            r1 = r1 & 63
            byte r1 = r3[r1]
            r11[r5] = r1
            byte[] r1 = f52658s
            if (r3 != r1) goto L_0x0088
            int r1 = r2 + 1
            r9.f52673g = r1
            r11[r2] = r12
            goto L_0x0088
        L_0x005a:
            byte[] r11 = r9.f52672f
            int r1 = r10 + 1
            r9.f52673g = r1
            byte[] r2 = r9.f52661l
            int r3 = r9.f52666q
            int r4 = r3 >> 2
            r4 = r4 & 63
            byte r4 = r2[r4]
            r11[r10] = r4
            int r4 = r1 + 1
            r9.f52673g = r4
            int r3 = r3 << 4
            r3 = r3 & 63
            byte r3 = r2[r3]
            r11[r1] = r3
            byte[] r1 = f52658s
            if (r2 != r1) goto L_0x0088
            int r1 = r4 + 1
            r9.f52673g = r1
            r11[r4] = r12
            int r2 = r1 + 1
            r9.f52673g = r2
            r11[r1] = r12
        L_0x0088:
            int r11 = r9.f52676j
            int r12 = r9.f52673g
            int r10 = r12 - r10
            int r11 = r11 + r10
            r9.f52676j = r11
            int r10 = r9.f52670d
            if (r10 <= 0) goto L_0x011d
            if (r11 <= 0) goto L_0x011d
            byte[] r10 = r9.f52663n
            byte[] r11 = r9.f52672f
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r0, r11, r12, r1)
            int r10 = r9.f52673g
            byte[] r11 = r9.f52663n
            int r11 = r11.length
            int r10 = r10 + r11
            r9.f52673g = r10
            goto L_0x011d
        L_0x00a9:
            r2 = 0
        L_0x00aa:
            if (r2 >= r12) goto L_0x011d
            int r3 = r9.f52665p
            r9.mo60633h(r3)
            int r3 = r9.f52677k
            int r3 = r3 + r1
            int r3 = r3 % 3
            r9.f52677k = r3
            int r4 = r11 + 1
            byte r11 = r10[r11]
            if (r11 >= 0) goto L_0x00c0
            int r11 = r11 + 256
        L_0x00c0:
            int r5 = r9.f52666q
            int r5 = r5 << 8
            int r5 = r5 + r11
            r9.f52666q = r5
            if (r3 != 0) goto L_0x0119
            byte[] r11 = r9.f52672f
            int r3 = r9.f52673g
            int r6 = r3 + 1
            r9.f52673g = r6
            byte[] r7 = r9.f52661l
            int r8 = r5 >> 18
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r3] = r8
            int r3 = r6 + 1
            r9.f52673g = r3
            int r8 = r5 >> 12
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r6] = r8
            int r6 = r3 + 1
            r9.f52673g = r6
            int r8 = r5 >> 6
            r8 = r8 & 63
            byte r8 = r7[r8]
            r11[r3] = r8
            int r3 = r6 + 1
            r9.f52673g = r3
            r5 = r5 & 63
            byte r5 = r7[r5]
            r11[r6] = r5
            int r5 = r9.f52676j
            int r5 = r5 + 4
            r9.f52676j = r5
            int r6 = r9.f52670d
            if (r6 <= 0) goto L_0x0119
            if (r6 > r5) goto L_0x0119
            byte[] r5 = r9.f52663n
            int r6 = r5.length
            java.lang.System.arraycopy(r5, r0, r11, r3, r6)
            int r11 = r9.f52673g
            byte[] r3 = r9.f52663n
            int r3 = r3.length
            int r11 = r11 + r3
            r9.f52673g = r11
            r9.f52676j = r0
        L_0x0119:
            int r2 = r2 + 1
            r11 = r4
            goto L_0x00aa
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.repackaged.org.apache.commons.codec.binary.Base64.mo60626f(byte[], int, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo60627k(byte b) {
        if (b >= 0) {
            byte[] bArr = this.f52662m;
            return b < bArr.length && bArr[b] != -1;
        }
    }

    public Base64(boolean z) {
        this(76, f52657r, z);
    }

    public Base64(int i) {
        this(i, f52657r);
    }

    public Base64(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Base64(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.f52662m = f52660u;
        if (bArr == null) {
            this.f52665p = 4;
            this.f52663n = null;
        } else if (mo60629b(bArr)) {
            String e = StringUtils.m72545e(bArr);
            throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + e + "]");
        } else if (i > 0) {
            this.f52665p = bArr.length + 4;
            byte[] bArr2 = new byte[bArr.length];
            this.f52663n = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            this.f52665p = 4;
            this.f52663n = null;
        }
        this.f52664o = this.f52665p - 1;
        this.f52661l = z ? f52659t : f52658s;
    }
}
