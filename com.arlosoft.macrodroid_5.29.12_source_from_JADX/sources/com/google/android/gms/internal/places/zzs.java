package com.google.android.gms.internal.places;

import java.io.IOException;

final class zzs {
    /* renamed from: a */
    static int m63840a(int i, byte[] bArr, int i2, int i3, zzbh<?> zzbh, zzr zzr) {
        zzbe zzbe = (zzbe) zzbh;
        int j = m63849j(bArr, i2, zzr);
        zzbe.mo53468f(zzr.f45464a);
        while (j < i3) {
            int j2 = m63849j(bArr, j, zzr);
            if (i != zzr.f45464a) {
                break;
            }
            j = m63849j(bArr, j2, zzr);
            zzbe.mo53468f(zzr.f45464a);
        }
        return j;
    }

    /* renamed from: b */
    static int m63841b(int i, byte[] bArr, int i2, int i3, zzdr zzdr, zzr zzr) throws zzbk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int k = m63850k(bArr, i2, zzr);
                zzdr.mo53599f(i, Long.valueOf(zzr.f45465b));
                return k;
            } else if (i4 == 1) {
                zzdr.mo53599f(i, Long.valueOf(m63851l(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m63849j(bArr, i2, zzr);
                int i5 = zzr.f45464a;
                if (i5 < 0) {
                    throw zzbk.m63363b();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        zzdr.mo53599f(i, zzw.f45474a);
                    } else {
                        zzdr.mo53599f(i, zzw.m63867p(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzbk.m63362a();
                }
            } else if (i4 == 3) {
                zzdr j2 = zzdr.m63624j();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j3 = m63849j(bArr, i2, zzr);
                    int i8 = zzr.f45464a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j3;
                        break;
                    }
                    int b = m63841b(i7, bArr, j3, i3, j2, zzr);
                    i7 = i8;
                    i2 = b;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzbk.m63366e();
                }
                zzdr.mo53599f(i, j2);
                return i2;
            } else if (i4 == 5) {
                zzdr.mo53599f(i, Integer.valueOf(m63847h(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzbk.m63364c();
            }
        } else {
            throw zzbk.m63364c();
        }
    }

    /* renamed from: c */
    static int m63842c(int i, byte[] bArr, int i2, int i3, zzr zzr) throws zzbk {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m63850k(bArr, i2, zzr);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m63849j(bArr, i2, zzr) + zzr.f45464a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m63849j(bArr, i2, zzr);
                    i6 = zzr.f45464a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m63842c(i6, bArr, i2, i3, zzr);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzbk.m63366e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzbk.m63364c();
            }
        } else {
            throw zzbk.m63364c();
        }
    }

    /* renamed from: d */
    static int m63843d(int i, byte[] bArr, int i2, zzr zzr) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzr.f45464a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzr.f45464a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzr.f45464a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzr.f45464a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzr.f45464a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: e */
    static int m63844e(zzda<?> zzda, int i, byte[] bArr, int i2, int i3, zzbh<?> zzbh, zzr zzr) throws IOException {
        int g = m63846g(zzda, bArr, i2, i3, zzr);
        zzbh.add(zzr.f45466c);
        while (g < i3) {
            int j = m63849j(bArr, g, zzr);
            if (i != zzr.f45464a) {
                break;
            }
            g = m63846g(zzda, bArr, j, i3, zzr);
            zzbh.add(zzr.f45466c);
        }
        return g;
    }

    /* renamed from: f */
    static int m63845f(zzda zzda, byte[] bArr, int i, int i2, int i3, zzr zzr) throws IOException {
        zzco zzco = (zzco) zzda;
        Object newInstance = zzco.newInstance();
        int s = zzco.mo53544s(newInstance, bArr, i, i2, i3, zzr);
        zzco.mo53535a(newInstance);
        zzr.f45466c = newInstance;
        return s;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m63846g(com.google.android.gms.internal.places.zzda r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.places.zzr r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m63843d(r8, r7, r0, r10)
            int r8 = r10.f45464a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo53538d(r1, r2, r3, r4, r5)
            r6.mo53535a(r9)
            r10.f45466c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.places.zzbk r6 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzs.m63846g(com.google.android.gms.internal.places.zzda, byte[], int, int, com.google.android.gms.internal.places.zzr):int");
    }

    /* renamed from: h */
    static int m63847h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    static int m63848i(byte[] bArr, int i, zzbh<?> zzbh, zzr zzr) throws IOException {
        zzbe zzbe = (zzbe) zzbh;
        int j = m63849j(bArr, i, zzr);
        int i2 = zzr.f45464a + j;
        while (j < i2) {
            j = m63849j(bArr, j, zzr);
            zzbe.mo53468f(zzr.f45464a);
        }
        if (j == i2) {
            return j;
        }
        throw zzbk.m63362a();
    }

    /* renamed from: j */
    static int m63849j(byte[] bArr, int i, zzr zzr) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m63843d(b, bArr, i2, zzr);
        }
        zzr.f45464a = b;
        return i2;
    }

    /* renamed from: k */
    static int m63850k(byte[] bArr, int i, zzr zzr) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzr.f45465b = j;
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
        zzr.f45465b = j2;
        return i3;
    }

    /* renamed from: l */
    static long m63851l(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: m */
    static double m63852m(byte[] bArr, int i) {
        return Double.longBitsToDouble(m63851l(bArr, i));
    }

    /* renamed from: n */
    static int m63853n(byte[] bArr, int i, zzr zzr) throws zzbk {
        int j = m63849j(bArr, i, zzr);
        int i2 = zzr.f45464a;
        if (i2 < 0) {
            throw zzbk.m63363b();
        } else if (i2 == 0) {
            zzr.f45466c = "";
            return j;
        } else {
            zzr.f45466c = new String(bArr, j, i2, zzbd.f45276a);
            return j + i2;
        }
    }

    /* renamed from: o */
    static float m63854o(byte[] bArr, int i) {
        return Float.intBitsToFloat(m63847h(bArr, i));
    }

    /* renamed from: p */
    static int m63855p(byte[] bArr, int i, zzr zzr) throws zzbk {
        int j = m63849j(bArr, i, zzr);
        int i2 = zzr.f45464a;
        if (i2 < 0) {
            throw zzbk.m63363b();
        } else if (i2 == 0) {
            zzr.f45466c = "";
            return j;
        } else {
            zzr.f45466c = zzea.m63765j(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: q */
    static int m63856q(byte[] bArr, int i, zzr zzr) throws zzbk {
        int j = m63849j(bArr, i, zzr);
        int i2 = zzr.f45464a;
        if (i2 < 0) {
            throw zzbk.m63363b();
        } else if (i2 > bArr.length - j) {
            throw zzbk.m63362a();
        } else if (i2 == 0) {
            zzr.f45466c = zzw.f45474a;
            return j;
        } else {
            zzr.f45466c = zzw.m63867p(bArr, j, i2);
            return j + i2;
        }
    }
}
