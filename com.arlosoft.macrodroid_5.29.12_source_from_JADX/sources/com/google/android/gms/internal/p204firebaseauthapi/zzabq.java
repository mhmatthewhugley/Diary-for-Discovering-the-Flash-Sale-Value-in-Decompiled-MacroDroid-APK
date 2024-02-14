package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzabq {
    /* renamed from: a */
    static int m56120a(byte[] bArr, int i, zzabp zzabp) throws zzadn {
        int j = m56129j(bArr, i, zzabp);
        int i2 = zzabp.f39624a;
        if (i2 < 0) {
            throw zzadn.m56470f();
        } else if (i2 > bArr.length - j) {
            throw zzadn.m56472i();
        } else if (i2 == 0) {
            zzabp.f39626c = zzacc.f39635a;
            return j;
        } else {
            zzabp.f39626c = zzacc.m56160u(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m56121b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m56122c(zzaew zzaew, byte[] bArr, int i, int i2, int i3, zzabp zzabp) throws IOException {
        Object b = zzaew.mo49141b();
        int n = m56133n(b, zzaew, bArr, i, i2, i3, zzabp);
        zzaew.mo49143d(b);
        zzabp.f39626c = b;
        return n;
    }

    /* renamed from: d */
    static int m56123d(zzaew zzaew, byte[] bArr, int i, int i2, zzabp zzabp) throws IOException {
        Object b = zzaew.mo49141b();
        int o = m56134o(b, zzaew, bArr, i, i2, zzabp);
        zzaew.mo49143d(b);
        zzabp.f39626c = b;
        return o;
    }

    /* renamed from: e */
    static int m56124e(zzaew zzaew, int i, byte[] bArr, int i2, int i3, zzadk zzadk, zzabp zzabp) throws IOException {
        int d = m56123d(zzaew, bArr, i2, i3, zzabp);
        zzadk.add(zzabp.f39626c);
        while (d < i3) {
            int j = m56129j(bArr, d, zzabp);
            if (i != zzabp.f39624a) {
                break;
            }
            d = m56123d(zzaew, bArr, j, i3, zzabp);
            zzadk.add(zzabp.f39626c);
        }
        return d;
    }

    /* renamed from: f */
    static int m56125f(byte[] bArr, int i, zzadk zzadk, zzabp zzabp) throws IOException {
        zzadg zzadg = (zzadg) zzadk;
        int j = m56129j(bArr, i, zzabp);
        int i2 = zzabp.f39624a + j;
        while (j < i2) {
            j = m56129j(bArr, j, zzabp);
            zzadg.mo49093f(zzabp.f39624a);
        }
        if (j == i2) {
            return j;
        }
        throw zzadn.m56472i();
    }

    /* renamed from: g */
    static int m56126g(byte[] bArr, int i, zzabp zzabp) throws zzadn {
        int j = m56129j(bArr, i, zzabp);
        int i2 = zzabp.f39624a;
        if (i2 < 0) {
            throw zzadn.m56470f();
        } else if (i2 == 0) {
            zzabp.f39626c = "";
            return j;
        } else {
            zzabp.f39626c = new String(bArr, j, i2, zzadl.f39746b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m56127h(byte[] bArr, int i, zzabp zzabp) throws zzadn {
        int j = m56129j(bArr, i, zzabp);
        int i2 = zzabp.f39624a;
        if (i2 < 0) {
            throw zzadn.m56470f();
        } else if (i2 == 0) {
            zzabp.f39626c = "";
            return j;
        } else {
            zzabp.f39626c = zzagc.m56875d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m56128i(int i, byte[] bArr, int i2, int i3, zzafo zzafo, zzabp zzabp) throws zzadn {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m56132m(bArr, i2, zzabp);
                zzafo.mo49219j(i, Long.valueOf(zzabp.f39625b));
                return m;
            } else if (i4 == 1) {
                zzafo.mo49219j(i, Long.valueOf(m56135p(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m56129j(bArr, i2, zzabp);
                int i5 = zzabp.f39624a;
                if (i5 < 0) {
                    throw zzadn.m56470f();
                } else if (i5 <= bArr.length - j) {
                    if (i5 == 0) {
                        zzafo.mo49219j(i, zzacc.f39635a);
                    } else {
                        zzafo.mo49219j(i, zzacc.m56160u(bArr, j, i5));
                    }
                    return j + i5;
                } else {
                    throw zzadn.m56472i();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                zzafo f = zzafo.m56766f();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m56129j(bArr, i2, zzabp);
                    int i8 = zzabp.f39624a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = j2;
                        break;
                    }
                    i7 = i8;
                    i2 = m56128i(i8, bArr, j2, i3, f, zzabp);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzadn.m56471g();
                }
                zzafo.mo49219j(i, f);
                return i2;
            } else if (i4 == 5) {
                zzafo.mo49219j(i, Integer.valueOf(m56121b(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzadn.m56467c();
            }
        } else {
            throw zzadn.m56467c();
        }
    }

    /* renamed from: j */
    static int m56129j(byte[] bArr, int i, zzabp zzabp) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m56130k(b, bArr, i2, zzabp);
        }
        zzabp.f39624a = b;
        return i2;
    }

    /* renamed from: k */
    static int m56130k(int i, byte[] bArr, int i2, zzabp zzabp) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzabp.f39624a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzabp.f39624a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzabp.f39624a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzabp.f39624a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzabp.f39624a = i11;
                return i12;
            }
        }
    }

    /* renamed from: l */
    static int m56131l(int i, byte[] bArr, int i2, int i3, zzadk zzadk, zzabp zzabp) {
        zzadg zzadg = (zzadg) zzadk;
        int j = m56129j(bArr, i2, zzabp);
        zzadg.mo49093f(zzabp.f39624a);
        while (j < i3) {
            int j2 = m56129j(bArr, j, zzabp);
            if (i != zzabp.f39624a) {
                break;
            }
            j = m56129j(bArr, j2, zzabp);
            zzadg.mo49093f(zzabp.f39624a);
        }
        return j;
    }

    /* renamed from: m */
    static int m56132m(byte[] bArr, int i, zzabp zzabp) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzabp.f39625b = j;
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
        zzabp.f39625b = j2;
        return i3;
    }

    /* renamed from: n */
    static int m56133n(Object obj, zzaew zzaew, byte[] bArr, int i, int i2, int i3, zzabp zzabp) throws IOException {
        int O = ((zzaen) zzaew).mo49139O(obj, bArr, i, i2, i3, zzabp);
        zzabp.f39626c = obj;
        return O;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m56134o(java.lang.Object r6, com.google.android.gms.internal.p204firebaseauthapi.zzaew r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.p204firebaseauthapi.zzabp r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m56130k(r9, r8, r0, r11)
            int r9 = r11.f39624a
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
            r0.mo49149j(r1, r2, r3, r4, r5)
            r11.f39626c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.firebase-auth-api.zzadn r6 = com.google.android.gms.internal.p204firebaseauthapi.zzadn.m56472i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzabq.m56134o(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzaew, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzabp):int");
    }

    /* renamed from: p */
    static long m56135p(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
