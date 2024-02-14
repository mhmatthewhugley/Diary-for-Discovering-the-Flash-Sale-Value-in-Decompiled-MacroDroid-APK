package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgpj {
    /* renamed from: a */
    static int m52516a(byte[] bArr, int i, zzgpi zzgpi) throws zzgrq {
        int j = m52525j(bArr, i, zzgpi);
        int i2 = zzgpi.f36996a;
        if (i2 < 0) {
            throw zzgrq.m53037f();
        } else if (i2 > bArr.length - j) {
            throw zzgrq.m53040j();
        } else if (i2 == 0) {
            zzgpi.f36998c = zzgpw.f37012a;
            return j;
        } else {
            zzgpi.f36998c = zzgpw.m52565T(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m52517b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m52518c(zzgth zzgth, byte[] bArr, int i, int i2, int i3, zzgpi zzgpi) throws IOException {
        zzgsr zzgsr = (zzgsr) zzgth;
        Object b = zzgsr.mo47413b();
        int I = zzgsr.mo47411I(b, bArr, i, i2, i3, zzgpi);
        zzgsr.mo47415d(b);
        zzgpi.f36998c = b;
        return I;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m52519d(com.google.android.gms.internal.ads.zzgth r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.zzgpi r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m52526k(r8, r7, r0, r10)
            int r8 = r10.f36996a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo47413b()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo47421j(r1, r2, r3, r4, r5)
            r6.mo47415d(r9)
            r10.f36998c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzgrq r6 = com.google.android.gms.internal.ads.zzgrq.m53040j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpj.m52519d(com.google.android.gms.internal.ads.zzgth, byte[], int, int, com.google.android.gms.internal.ads.zzgpi):int");
    }

    /* renamed from: e */
    static int m52520e(zzgth zzgth, int i, byte[] bArr, int i2, int i3, zzgrn zzgrn, zzgpi zzgpi) throws IOException {
        int d = m52519d(zzgth, bArr, i2, i3, zzgpi);
        zzgrn.add(zzgpi.f36998c);
        while (d < i3) {
            int j = m52525j(bArr, d, zzgpi);
            if (i != zzgpi.f36996a) {
                break;
            }
            d = m52519d(zzgth, bArr, j, i3, zzgpi);
            zzgrn.add(zzgpi.f36998c);
        }
        return d;
    }

    /* renamed from: f */
    static int m52521f(byte[] bArr, int i, zzgrn zzgrn, zzgpi zzgpi) throws IOException {
        zzgrf zzgrf = (zzgrf) zzgrn;
        int j = m52525j(bArr, i, zzgpi);
        int i2 = zzgpi.f36996a + j;
        while (j < i2) {
            j = m52525j(bArr, j, zzgpi);
            zzgrf.mo47354E(zzgpi.f36996a);
        }
        if (j == i2) {
            return j;
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: g */
    static int m52522g(byte[] bArr, int i, zzgpi zzgpi) throws zzgrq {
        int j = m52525j(bArr, i, zzgpi);
        int i2 = zzgpi.f36996a;
        if (i2 < 0) {
            throw zzgrq.m53037f();
        } else if (i2 == 0) {
            zzgpi.f36998c = "";
            return j;
        } else {
            zzgpi.f36998c = new String(bArr, j, i2, zzgro.f37162b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m52523h(byte[] bArr, int i, zzgpi zzgpi) throws zzgrq {
        int j = m52525j(bArr, i, zzgpi);
        int i2 = zzgpi.f36996a;
        if (i2 < 0) {
            throw zzgrq.m53037f();
        } else if (i2 == 0) {
            zzgpi.f36998c = "";
            return j;
        } else {
            zzgpi.f36998c = zzgun.m53477h(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m52524i(int i, byte[] bArr, int i2, int i3, zzgtz zzgtz, zzgpi zzgpi) throws zzgrq {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m52528m(bArr, i2, zzgpi);
                zzgtz.mo47494h(i, Long.valueOf(zzgpi.f36997b));
                return m;
            } else if (i4 == 1) {
                zzgtz.mo47494h(i, Long.valueOf(m52529n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m52525j(bArr, i2, zzgpi);
                int i5 = zzgpi.f36996a;
                if (i5 < 0) {
                    throw zzgrq.m53037f();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        zzgtz.mo47494h(i, zzgpw.f37012a);
                    } else {
                        zzgtz.mo47494h(i, zzgpw.m52565T(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzgrq.m53040j();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                zzgtz e = zzgtz.m53357e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m52525j(bArr, i2, zzgpi);
                    int i8 = zzgpi.f36996a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m52524i(i8, bArr, j2, i3, e, zzgpi);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzgrq.m53038g();
                }
                zzgtz.mo47494h(i, e);
                return i2;
            } else if (i4 == 5) {
                zzgtz.mo47494h(i, Integer.valueOf(m52517b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzgrq.m53034c();
            }
        } else {
            throw zzgrq.m53034c();
        }
    }

    /* renamed from: j */
    static int m52525j(byte[] bArr, int i, zzgpi zzgpi) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m52526k(b, bArr, i2, zzgpi);
        }
        zzgpi.f36996a = b;
        return i2;
    }

    /* renamed from: k */
    static int m52526k(int i, byte[] bArr, int i2, zzgpi zzgpi) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzgpi.f36996a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzgpi.f36996a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgpi.f36996a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgpi.f36996a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzgpi.f36996a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m52527l(int i, byte[] bArr, int i2, int i3, zzgrn zzgrn, zzgpi zzgpi) {
        zzgrf zzgrf = (zzgrf) zzgrn;
        int j = m52525j(bArr, i2, zzgpi);
        zzgrf.mo47354E(zzgpi.f36996a);
        while (j < i3) {
            int j2 = m52525j(bArr, j, zzgpi);
            if (i != zzgpi.f36996a) {
                break;
            }
            j = m52525j(bArr, j2, zzgpi);
            zzgrf.mo47354E(zzgpi.f36996a);
        }
        return j;
    }

    /* renamed from: m */
    static int m52528m(byte[] bArr, int i, zzgpi zzgpi) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzgpi.f36997b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        zzgpi.f36997b = j2;
        return i3;
    }

    /* renamed from: n */
    static long m52529n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
