package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzis {
    /* renamed from: a */
    static int m60323a(byte[] bArr, int i, zzir zzir) throws zzkp {
        int j = m60332j(bArr, i, zzir);
        int i2 = zzir.f41528a;
        if (i2 < 0) {
            throw zzkp.m60549d();
        } else if (i2 > bArr.length - j) {
            throw zzkp.m60551f();
        } else if (i2 == 0) {
            zzir.f41530c = zzje.f41539a;
            return j;
        } else {
            zzir.f41530c = zzje.m60358p(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m60324b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m60325c(zzlx zzlx, byte[] bArr, int i, int i2, int i3, zzir zzir) throws IOException {
        Object b = zzlx.mo51510b();
        int n = m60336n(b, zzlx, bArr, i, i2, i3, zzir);
        zzlx.mo51512d(b);
        zzir.f41530c = b;
        return n;
    }

    /* renamed from: d */
    static int m60326d(zzlx zzlx, byte[] bArr, int i, int i2, zzir zzir) throws IOException {
        Object b = zzlx.mo51510b();
        int o = m60337o(b, zzlx, bArr, i, i2, zzir);
        zzlx.mo51512d(b);
        zzir.f41530c = b;
        return o;
    }

    /* renamed from: e */
    static int m60327e(zzlx zzlx, int i, byte[] bArr, int i2, int i3, zzkm zzkm, zzir zzir) throws IOException {
        int d = m60326d(zzlx, bArr, i2, i3, zzir);
        zzkm.add(zzir.f41530c);
        while (d < i3) {
            int j = m60332j(bArr, d, zzir);
            if (i != zzir.f41528a) {
                break;
            }
            d = m60326d(zzlx, bArr, j, i3, zzir);
            zzkm.add(zzir.f41530c);
        }
        return d;
    }

    /* renamed from: f */
    static int m60328f(byte[] bArr, int i, zzkm zzkm, zzir zzir) throws IOException {
        zzkg zzkg = (zzkg) zzkm;
        int j = m60332j(bArr, i, zzir);
        int i2 = zzir.f41528a + j;
        while (j < i2) {
            j = m60332j(bArr, j, zzir);
            zzkg.mo51461E(zzir.f41528a);
        }
        if (j == i2) {
            return j;
        }
        throw zzkp.m60551f();
    }

    /* renamed from: g */
    static int m60329g(byte[] bArr, int i, zzir zzir) throws zzkp {
        int j = m60332j(bArr, i, zzir);
        int i2 = zzir.f41528a;
        if (i2 < 0) {
            throw zzkp.m60549d();
        } else if (i2 == 0) {
            zzir.f41530c = "";
            return j;
        } else {
            zzir.f41530c = new String(bArr, j, i2, zzkn.f41635b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m60330h(byte[] bArr, int i, zzir zzir) throws zzkp {
        int j = m60332j(bArr, i, zzir);
        int i2 = zzir.f41528a;
        if (i2 < 0) {
            throw zzkp.m60549d();
        } else if (i2 == 0) {
            zzir.f41530c = "";
            return j;
        } else {
            zzir.f41530c = zznd.m60884d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m60331i(int i, byte[] bArr, int i2, int i3, zzmp zzmp, zzir zzir) throws zzkp {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m60335m(bArr, i2, zzir);
                zzmp.mo51576j(i, Long.valueOf(zzir.f41529b));
                return m;
            } else if (i4 == 1) {
                zzmp.mo51576j(i, Long.valueOf(m60338p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m60332j(bArr, i2, zzir);
                int i5 = zzir.f41528a;
                if (i5 < 0) {
                    throw zzkp.m60549d();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        zzmp.mo51576j(i, zzje.f41539a);
                    } else {
                        zzmp.mo51576j(i, zzje.m60358p(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzkp.m60551f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                zzmp f = zzmp.m60786f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m60332j(bArr, i2, zzir);
                    int i8 = zzir.f41528a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m60331i(i8, bArr, j2, i3, f, zzir);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzkp.m60550e();
                }
                zzmp.mo51576j(i, f);
                return i2;
            } else if (i4 == 5) {
                zzmp.mo51576j(i, Integer.valueOf(m60324b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzkp.m60547b();
            }
        } else {
            throw zzkp.m60547b();
        }
    }

    /* renamed from: j */
    static int m60332j(byte[] bArr, int i, zzir zzir) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m60333k(b, bArr, i2, zzir);
        }
        zzir.f41528a = b;
        return i2;
    }

    /* renamed from: k */
    static int m60333k(int i, byte[] bArr, int i2, zzir zzir) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzir.f41528a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzir.f41528a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzir.f41528a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzir.f41528a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzir.f41528a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m60334l(int i, byte[] bArr, int i2, int i3, zzkm zzkm, zzir zzir) {
        zzkg zzkg = (zzkg) zzkm;
        int j = m60332j(bArr, i2, zzir);
        zzkg.mo51461E(zzir.f41528a);
        while (j < i3) {
            int j2 = m60332j(bArr, j, zzir);
            if (i != zzir.f41528a) {
                break;
            }
            j = m60332j(bArr, j2, zzir);
            zzkg.mo51461E(zzir.f41528a);
        }
        return j;
    }

    /* renamed from: m */
    static int m60335m(byte[] bArr, int i, zzir zzir) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzir.f41529b = j;
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
        zzir.f41529b = j2;
        return i3;
    }

    /* renamed from: n */
    static int m60336n(Object obj, zzlx zzlx, byte[] bArr, int i, int i2, int i3, zzir zzir) throws IOException {
        int J = ((zzlp) zzlx).mo51508J(obj, bArr, i, i2, i3, zzir);
        zzir.f41530c = obj;
        return J;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m60337o(java.lang.Object r6, com.google.android.gms.internal.measurement.zzlx r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.zzir r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m60333k(r9, r8, r0, r11)
            int r9 = r11.f41528a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.mo51517i(r1, r2, r3, r4, r5)
            r11.f41530c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.zzkp r6 = com.google.android.gms.internal.measurement.zzkp.m60551f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzis.m60337o(java.lang.Object, com.google.android.gms.internal.measurement.zzlx, byte[], int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    /* renamed from: p */
    static long m60338p(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
