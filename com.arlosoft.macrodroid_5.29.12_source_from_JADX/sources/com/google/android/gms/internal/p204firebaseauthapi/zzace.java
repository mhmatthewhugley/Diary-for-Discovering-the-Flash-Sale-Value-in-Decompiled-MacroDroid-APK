package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzace */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzace extends zzacg {

    /* renamed from: f */
    private final byte[] f39638f;

    /* renamed from: g */
    private int f39639g;

    /* renamed from: h */
    private int f39640h;

    /* renamed from: i */
    private int f39641i;

    /* renamed from: j */
    private int f39642j;

    /* renamed from: k */
    private int f39643k = Integer.MAX_VALUE;

    /* synthetic */ zzace(byte[] bArr, int i, int i2, boolean z, zzacd zzacd) {
        super((zzacf) null);
        this.f39638f = bArr;
        this.f39639g = i2;
        this.f39641i = 0;
    }

    /* renamed from: v */
    private final void m56177v() {
        int i = this.f39639g + this.f39640h;
        this.f39639g = i;
        int i2 = this.f39643k;
        if (i > i2) {
            int i3 = i - i2;
            this.f39640h = i3;
            this.f39639g = i - i3;
            return;
        }
        this.f39640h = 0;
    }

    /* renamed from: a */
    public final int mo48909a() {
        return this.f39641i;
    }

    /* renamed from: b */
    public final int mo48910b(int i) throws zzadn {
        if (i >= 0) {
            int i2 = i + this.f39641i;
            if (i2 >= 0) {
                int i3 = this.f39643k;
                if (i2 <= i3) {
                    this.f39643k = i2;
                    m56177v();
                    return i3;
                }
                throw zzadn.m56472i();
            }
            throw zzadn.m56471g();
        }
        throw zzadn.m56470f();
    }

    /* renamed from: c */
    public final int mo48911c() throws IOException {
        if (mo48917i()) {
            this.f39642j = 0;
            return 0;
        }
        int q = mo48922q();
        this.f39642j = q;
        if ((q >>> 3) != 0) {
            return q;
        }
        throw zzadn.m56467c();
    }

    /* renamed from: d */
    public final zzacc mo48912d() throws IOException {
        int q = mo48922q();
        if (q > 0) {
            int i = this.f39639g;
            int i2 = this.f39641i;
            if (q <= i - i2) {
                zzacc u = zzacc.m56160u(this.f39638f, i2, q);
                this.f39641i += q;
                return u;
            }
        }
        if (q == 0) {
            return zzacc.f39635a;
        }
        if (q > 0) {
            int i3 = this.f39639g;
            int i4 = this.f39641i;
            if (q <= i3 - i4) {
                int i5 = q + i4;
                this.f39641i = i5;
                return zzacc.m56162z(Arrays.copyOfRange(this.f39638f, i4, i5));
            }
        }
        if (q <= 0) {
            throw zzadn.m56470f();
        }
        throw zzadn.m56472i();
    }

    /* renamed from: e */
    public final String mo48913e() throws IOException {
        int q = mo48922q();
        if (q > 0) {
            int i = this.f39639g;
            int i2 = this.f39641i;
            if (q <= i - i2) {
                String str = new String(this.f39638f, i2, q, zzadl.f39746b);
                this.f39641i += q;
                return str;
            }
        }
        if (q == 0) {
            return "";
        }
        if (q < 0) {
            throw zzadn.m56470f();
        }
        throw zzadn.m56472i();
    }

    /* renamed from: f */
    public final String mo48914f() throws IOException {
        int q = mo48922q();
        if (q > 0) {
            int i = this.f39639g;
            int i2 = this.f39641i;
            if (q <= i - i2) {
                String d = zzagc.m56875d(this.f39638f, i2, q);
                this.f39641i += q;
                return d;
            }
        }
        if (q == 0) {
            return "";
        }
        if (q <= 0) {
            throw zzadn.m56470f();
        }
        throw zzadn.m56472i();
    }

    /* renamed from: g */
    public final void mo48915g(int i) throws zzadn {
        if (this.f39642j != i) {
            throw zzadn.m56466b();
        }
    }

    /* renamed from: h */
    public final void mo48916h(int i) {
        this.f39643k = i;
        m56177v();
    }

    /* renamed from: i */
    public final boolean mo48917i() throws IOException {
        return this.f39641i == this.f39639g;
    }

    /* renamed from: j */
    public final boolean mo48918j() throws IOException {
        return mo48924s() != 0;
    }

    /* renamed from: k */
    public final boolean mo48919k(int i) throws IOException {
        int c;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f39639g - this.f39641i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f39638f;
                    int i4 = this.f39641i;
                    this.f39641i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzadn.m56469e();
            }
            while (i3 < 10) {
                if (mo48920o() < 0) {
                    i3++;
                }
            }
            throw zzadn.m56469e();
            return true;
        } else if (i2 == 1) {
            mo48926u(8);
            return true;
        } else if (i2 == 2) {
            mo48926u(mo48922q());
            return true;
        } else if (i2 == 3) {
            do {
                c = mo48911c();
                if (c == 0 || !mo48919k(c)) {
                    mo48915g(((i >>> 3) << 3) | 4);
                }
                c = mo48911c();
                break;
            } while (!mo48919k(c));
            mo48915g(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo48926u(4);
                return true;
            }
            throw zzadn.m56465a();
        }
    }

    /* renamed from: o */
    public final byte mo48920o() throws IOException {
        int i = this.f39641i;
        if (i != this.f39639g) {
            byte[] bArr = this.f39638f;
            this.f39641i = i + 1;
            return bArr[i];
        }
        throw zzadn.m56472i();
    }

    /* renamed from: p */
    public final int mo48921p() throws IOException {
        int i = this.f39641i;
        if (this.f39639g - i >= 4) {
            byte[] bArr = this.f39638f;
            this.f39641i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzadn.m56472i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo48922q() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f39641i
            int r1 = r5.f39639g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f39638f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f39641i = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006c
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0023
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0069
        L_0x0023:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0030
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002e:
            r1 = r3
            goto L_0x0069
        L_0x0030:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0069
        L_0x003e:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0069
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002e
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006c
        L_0x0069:
            r5.f39641i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo48925t()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzace.mo48922q():int");
    }

    /* renamed from: r */
    public final long mo48923r() throws IOException {
        int i = this.f39641i;
        if (this.f39639g - i >= 8) {
            byte[] bArr = this.f39638f;
            this.f39641i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzadn.m56472i();
    }

    /* renamed from: s */
    public final long mo48924s() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f39641i;
        int i2 = this.f39639g;
        if (i2 != i) {
            byte[] bArr = this.f39638f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f39641i = i3;
                return (long) b2;
            } else if (i2 - i3 >= 9) {
                int i4 = i3 + 1;
                byte b3 = b2 ^ (bArr[i3] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i5 = i4 + 1;
                    byte b4 = b3 ^ (bArr[i4] << 14);
                    if (b4 >= 0) {
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i4 = i5 + 1;
                        byte b5 = b4 ^ (bArr[i5] << 21);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i5 = i4 + 1;
                            long j5 = (((long) bArr[i4]) << 28) ^ ((long) b5);
                            if (j5 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i6 = i5 + 1;
                                long j6 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i5 = i6 + 1;
                                    j5 = j6 ^ (((long) bArr[i6]) << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i5 + 1;
                                        j6 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i5 = i6 + 1;
                                            j2 = (j6 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i6 = i5 + 1;
                                                if (((long) bArr[i5]) >= 0) {
                                                    j = j2;
                                                    i4 = i6;
                                                    this.f39641i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f39641i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f39641i = i4;
                    return j;
                }
                j = (long) b;
                this.f39641i = i4;
                return j;
            }
        }
        return mo48925t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final long mo48925t() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte o = mo48920o();
            j |= ((long) (o & Byte.MAX_VALUE)) << i;
            if ((o & 128) == 0) {
                return j;
            }
        }
        throw zzadn.m56469e();
    }

    /* renamed from: u */
    public final void mo48926u(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f39639g;
            int i3 = this.f39641i;
            if (i <= i2 - i3) {
                this.f39641i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzadn.m56470f();
        }
        throw zzadn.m56472i();
    }
}
