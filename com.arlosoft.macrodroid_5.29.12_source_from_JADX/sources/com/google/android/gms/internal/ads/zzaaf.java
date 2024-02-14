package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaaf {

    /* renamed from: a */
    public static final byte[] f23725a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f23726b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f23727c = new Object();

    /* renamed from: d */
    private static int[] f23728d = new int[10];

    /* renamed from: a */
    public static int m40914a(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        int i3 = i2 - i;
        boolean z2 = false;
        zzdd.m47212f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m40918e(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m40918e(zArr);
            return i - 2;
        } else if (i3 <= 2 || !zArr[2] || bArr[i] != 0 || bArr[i + 1] != 1) {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m40918e(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !(zArr[2] && bArr[i2 - 2] == 0 && bArr[i4] == 1) : !(bArr[i2 - 3] == 0 && bArr[i2 - 2] == 0 && bArr[i4] == 1)) {
                z = false;
            } else {
                z = true;
            }
            zArr[0] = z;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z2 = true;
            }
            zArr[2] = z2;
            return i2;
        } else {
            m40918e(zArr);
            return i - 1;
        }
    }

    /* renamed from: b */
    public static int m40915b(byte[] bArr, int i) {
        int i2;
        synchronized (f23727c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f23728d;
                    int length = iArr.length;
                    if (length <= i4) {
                        f23728d = Arrays.copyOf(iArr, length + length);
                    }
                    f23728d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f23728d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i10 + 1;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* renamed from: c */
    public static zzaad m40916c(byte[] bArr, int i, int i2) {
        zzaah zzaah = new zzaah(bArr, 4, i2);
        int c = zzaah.mo41199c();
        int c2 = zzaah.mo41199c();
        zzaah.mo41200d();
        return new zzaad(c, c2, zzaah.mo41202f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaae m40917d(byte[] r23, int r24, int r25) {
        /*
            com.google.android.gms.internal.ads.zzaah r0 = new com.google.android.gms.internal.ads.zzaah
            r1 = r23
            r2 = r24
            r3 = r25
            r0.<init>(r1, r2, r3)
            r1 = 8
            int r2 = r0.mo41197a(r1)
            int r5 = r0.mo41197a(r1)
            int r6 = r0.mo41197a(r1)
            int r7 = r0.mo41199c()
            r3 = 138(0x8a, float:1.93E-43)
            r4 = 3
            r8 = 16
            r10 = 1
            r11 = 100
            if (r2 == r11) goto L_0x004f
            r11 = 110(0x6e, float:1.54E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 122(0x7a, float:1.71E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 244(0xf4, float:3.42E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 44
            if (r2 == r11) goto L_0x004f
            r11 = 83
            if (r2 == r11) goto L_0x004f
            r11 = 86
            if (r2 == r11) goto L_0x004f
            r11 = 118(0x76, float:1.65E-43)
            if (r2 == r11) goto L_0x004f
            r11 = 128(0x80, float:1.794E-43)
            if (r2 == r11) goto L_0x004f
            if (r2 != r3) goto L_0x004c
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x004f
        L_0x004c:
            r3 = 1
            r12 = 0
            goto L_0x00a4
        L_0x004f:
            int r3 = r0.mo41199c()
            if (r3 != r4) goto L_0x005b
            boolean r11 = r0.mo41202f()
            r12 = 3
            goto L_0x005d
        L_0x005b:
            r12 = r3
            r11 = 0
        L_0x005d:
            r0.mo41199c()
            r0.mo41199c()
            r0.mo41200d()
            boolean r13 = r0.mo41202f()
            if (r13 == 0) goto L_0x00a3
            if (r12 == r4) goto L_0x0071
            r12 = 8
            goto L_0x0073
        L_0x0071:
            r12 = 12
        L_0x0073:
            r13 = 0
        L_0x0074:
            if (r13 >= r12) goto L_0x00a3
            boolean r14 = r0.mo41202f()
            if (r14 == 0) goto L_0x00a0
            r14 = 6
            if (r13 >= r14) goto L_0x0082
            r14 = 16
            goto L_0x0084
        L_0x0082:
            r14 = 64
        L_0x0084:
            r15 = 0
            r16 = 8
            r17 = 8
        L_0x0089:
            if (r15 >= r14) goto L_0x00a0
            if (r16 == 0) goto L_0x0099
            int r16 = r0.mo41198b()
            int r9 = r17 + r16
            int r9 = r9 + 256
            int r9 = r9 % 256
            r16 = r9
        L_0x0099:
            if (r16 == 0) goto L_0x009d
            r17 = r16
        L_0x009d:
            int r15 = r15 + 1
            goto L_0x0089
        L_0x00a0:
            int r13 = r13 + 1
            goto L_0x0074
        L_0x00a3:
            r12 = r11
        L_0x00a4:
            int r9 = r0.mo41199c()
            int r14 = r9 + 4
            int r9 = r0.mo41199c()
            if (r9 != 0) goto L_0x00bf
            int r11 = r0.mo41199c()
            int r11 = r11 + 4
            r25 = r2
            r13 = r5
            r1 = r9
            r16 = r11
        L_0x00bc:
            r17 = 0
            goto L_0x00ec
        L_0x00bf:
            if (r9 != r10) goto L_0x00e5
            boolean r9 = r0.mo41202f()
            r0.mo41198b()
            r0.mo41198b()
            int r11 = r0.mo41199c()
            r25 = r2
            long r1 = (long) r11
            r13 = r5
            r11 = 0
        L_0x00d4:
            long r4 = (long) r11
            int r16 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r16 >= 0) goto L_0x00df
            r0.mo41199c()
            int r11 = r11 + 1
            goto L_0x00d4
        L_0x00df:
            r17 = r9
            r1 = 1
            r16 = 0
            goto L_0x00ec
        L_0x00e5:
            r25 = r2
            r13 = r5
            r1 = r9
            r16 = 0
            goto L_0x00bc
        L_0x00ec:
            int r2 = r0.mo41199c()
            r0.mo41200d()
            int r4 = r0.mo41199c()
            int r4 = r4 + r10
            int r5 = r0.mo41199c()
            boolean r18 = r0.mo41202f()
            int r9 = 2 - r18
            int r5 = r5 + r10
            int r5 = r5 * r9
            if (r18 != 0) goto L_0x010a
            r0.mo41200d()
        L_0x010a:
            r0.mo41200d()
            int r4 = r4 * 16
            int r5 = r5 * 16
            boolean r11 = r0.mo41202f()
            if (r11 == 0) goto L_0x0143
            int r11 = r0.mo41199c()
            int r19 = r0.mo41199c()
            int r20 = r0.mo41199c()
            int r21 = r0.mo41199c()
            if (r3 != 0) goto L_0x012a
            goto L_0x0138
        L_0x012a:
            r22 = 2
            r15 = 3
            if (r3 != r15) goto L_0x0131
            r15 = 1
            goto L_0x0132
        L_0x0131:
            r15 = 2
        L_0x0132:
            if (r3 != r10) goto L_0x0135
            r10 = 2
        L_0x0135:
            int r9 = r9 * r10
            r10 = r15
        L_0x0138:
            int r11 = r11 + r19
            int r11 = r11 * r10
            int r4 = r4 - r11
            int r20 = r20 + r21
            int r20 = r20 * r9
            int r5 = r5 - r20
        L_0x0143:
            r9 = r4
            r10 = r5
            boolean r3 = r0.mo41202f()
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x018e
            boolean r3 = r0.mo41202f()
            if (r3 == 0) goto L_0x018e
            r3 = 8
            int r3 = r0.mo41197a(r3)
            r5 = 255(0xff, float:3.57E-43)
            if (r3 != r5) goto L_0x016e
            int r3 = r0.mo41197a(r8)
            int r0 = r0.mo41197a(r8)
            if (r3 == 0) goto L_0x018e
            if (r0 == 0) goto L_0x018e
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            r11 = r3
            goto L_0x0190
        L_0x016e:
            r0 = 17
            if (r3 >= r0) goto L_0x0178
            float[] r0 = f23726b
            r0 = r0[r3]
            r11 = r0
            goto L_0x0190
        L_0x0178:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Unexpected aspect_ratio_idc value: "
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzdw.m48255e(r3, r0)
        L_0x018e:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x0190:
            com.google.android.gms.internal.ads.zzaae r0 = new com.google.android.gms.internal.ads.zzaae
            r3 = r0
            r4 = r25
            r5 = r13
            r8 = r2
            r13 = r18
            r15 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaf.m40917d(byte[], int, int):com.google.android.gms.internal.ads.zzaae");
    }

    /* renamed from: e */
    public static void m40918e(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
