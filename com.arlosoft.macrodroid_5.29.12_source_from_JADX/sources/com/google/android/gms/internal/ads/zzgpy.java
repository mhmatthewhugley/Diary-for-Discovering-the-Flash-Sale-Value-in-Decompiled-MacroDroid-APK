package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgpy extends zzgqe {

    /* renamed from: f */
    private final byte[] f37015f;

    /* renamed from: g */
    private int f37016g;

    /* renamed from: h */
    private int f37017h;

    /* renamed from: i */
    private int f37018i;

    /* renamed from: j */
    private final int f37019j;

    /* renamed from: k */
    private int f37020k;

    /* renamed from: l */
    private int f37021l = Integer.MAX_VALUE;

    /* synthetic */ zzgpy(byte[] bArr, int i, int i2, boolean z, zzgpx zzgpx) {
        super((zzgqd) null);
        this.f37015f = bArr;
        this.f37016g = i2 + i;
        this.f37018i = i;
        this.f37019j = i;
    }

    /* renamed from: D */
    private final void m52591D() {
        int i = this.f37016g + this.f37017h;
        this.f37016g = i;
        int i2 = i - this.f37019j;
        int i3 = this.f37021l;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f37017h = i4;
            this.f37016g = i - i4;
            return;
        }
        this.f37017h = 0;
    }

    /* renamed from: A */
    public final String mo47112A() throws IOException {
        int G = mo47117G();
        if (G > 0) {
            int i = this.f37016g;
            int i2 = this.f37018i;
            if (G <= i - i2) {
                String h = zzgun.m53477h(this.f37015f, i2, G);
                this.f37018i += G;
                return h;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw zzgrq.m53037f();
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: B */
    public final void mo47113B(int i) throws zzgrq {
        if (this.f37020k != i) {
            throw zzgrq.m53033b();
        }
    }

    /* renamed from: C */
    public final void mo47114C(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f37016g;
            int i3 = this.f37018i;
            if (i <= i2 - i3) {
                this.f37018i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzgrq.m53037f();
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: E */
    public final byte mo47115E() throws IOException {
        int i = this.f37018i;
        if (i != this.f37016g) {
            byte[] bArr = this.f37015f;
            this.f37018i = i + 1;
            return bArr[i];
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: F */
    public final int mo47116F() throws IOException {
        int i = this.f37018i;
        if (this.f37016g - i >= 4) {
            byte[] bArr = this.f37015f;
            this.f37018i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzgrq.m53040j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        if (r2[r3] >= 0) goto L_0x0069;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47117G() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f37018i
            int r1 = r5.f37016g
            if (r1 != r0) goto L_0x0007
            goto L_0x006c
        L_0x0007:
            byte[] r2 = r5.f37015f
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f37018i = r3
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
            r5.f37018i = r1
            return r0
        L_0x006c:
            long r0 = r5.mo47120J()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgpy.mo47117G():int");
    }

    /* renamed from: H */
    public final long mo47118H() throws IOException {
        int i = this.f37018i;
        if (this.f37016g - i >= 8) {
            byte[] bArr = this.f37015f;
            this.f37018i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: I */
    public final long mo47119I() throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        byte b;
        int i = this.f37018i;
        int i2 = this.f37016g;
        if (i2 != i) {
            byte[] bArr = this.f37015f;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.f37018i = i3;
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
                                                    this.f37018i = i4;
                                                    return j;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j3 ^ j6;
                                i4 = i6;
                                this.f37018i = i4;
                                return j;
                            }
                            j2 = j5 ^ j4;
                        }
                    }
                    i4 = i5;
                    j = j2;
                    this.f37018i = i4;
                    return j;
                }
                j = (long) b;
                this.f37018i = i4;
                return j;
            }
        }
        return mo47120J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final long mo47120J() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte E = mo47115E();
            j |= ((long) (E & Byte.MAX_VALUE)) << i;
            if ((E & 128) == 0) {
                return j;
            }
        }
        throw zzgrq.m53036e();
    }

    /* renamed from: a */
    public final void mo47121a(int i) {
        this.f37021l = i;
        m52591D();
    }

    /* renamed from: b */
    public final boolean mo47122b() throws IOException {
        return this.f37018i == this.f37016g;
    }

    /* renamed from: c */
    public final boolean mo47123c() throws IOException {
        return mo47119I() != 0;
    }

    /* renamed from: d */
    public final boolean mo47124d(int i) throws IOException {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f37016g - this.f37018i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f37015f;
                    int i4 = this.f37018i;
                    this.f37018i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzgrq.m53036e();
            }
            while (i3 < 10) {
                if (mo47115E() < 0) {
                    i3++;
                }
            }
            throw zzgrq.m53036e();
            return true;
        } else if (i2 == 1) {
            mo47114C(8);
            return true;
        } else if (i2 == 2) {
            mo47114C(mo47117G());
            return true;
        } else if (i2 == 3) {
            do {
                r = mo47134r();
                if (r == 0 || !mo47124d(r)) {
                    mo47113B(((i >>> 3) << 3) | 4);
                }
                r = mo47134r();
                break;
            } while (!mo47124d(r));
            mo47113B(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                mo47114C(4);
                return true;
            }
            throw zzgrq.m53032a();
        }
    }

    /* renamed from: i */
    public final double mo47125i() throws IOException {
        return Double.longBitsToDouble(mo47118H());
    }

    /* renamed from: j */
    public final float mo47126j() throws IOException {
        return Float.intBitsToFloat(mo47116F());
    }

    /* renamed from: k */
    public final int mo47127k() {
        return this.f37018i - this.f37019j;
    }

    /* renamed from: l */
    public final int mo47128l(int i) throws zzgrq {
        if (i >= 0) {
            int i2 = i + (this.f37018i - this.f37019j);
            if (i2 >= 0) {
                int i3 = this.f37021l;
                if (i2 <= i3) {
                    this.f37021l = i2;
                    m52591D();
                    return i3;
                }
                throw zzgrq.m53040j();
            }
            throw zzgrq.m53038g();
        }
        throw zzgrq.m53037f();
    }

    /* renamed from: m */
    public final int mo47129m() throws IOException {
        return mo47117G();
    }

    /* renamed from: n */
    public final int mo47130n() throws IOException {
        return mo47116F();
    }

    /* renamed from: o */
    public final int mo47131o() throws IOException {
        return mo47117G();
    }

    /* renamed from: p */
    public final int mo47132p() throws IOException {
        return mo47116F();
    }

    /* renamed from: q */
    public final int mo47133q() throws IOException {
        return zzgqe.m52703e(mo47117G());
    }

    /* renamed from: r */
    public final int mo47134r() throws IOException {
        if (mo47122b()) {
            this.f37020k = 0;
            return 0;
        }
        int G = mo47117G();
        this.f37020k = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw zzgrq.m53034c();
    }

    /* renamed from: s */
    public final int mo47135s() throws IOException {
        return mo47117G();
    }

    /* renamed from: t */
    public final long mo47136t() throws IOException {
        return mo47118H();
    }

    /* renamed from: u */
    public final long mo47137u() throws IOException {
        return mo47119I();
    }

    /* renamed from: v */
    public final long mo47138v() throws IOException {
        return mo47118H();
    }

    /* renamed from: w */
    public final long mo47139w() throws IOException {
        return zzgqe.m52704f(mo47119I());
    }

    /* renamed from: x */
    public final long mo47140x() throws IOException {
        return mo47119I();
    }

    /* renamed from: y */
    public final zzgpw mo47141y() throws IOException {
        int G = mo47117G();
        if (G > 0) {
            int i = this.f37016g;
            int i2 = this.f37018i;
            if (G <= i - i2) {
                zzgpw T = zzgpw.m52565T(this.f37015f, i2, G);
                this.f37018i += G;
                return T;
            }
        }
        if (G == 0) {
            return zzgpw.f37012a;
        }
        if (G > 0) {
            int i3 = this.f37016g;
            int i4 = this.f37018i;
            if (G <= i3 - i4) {
                int i5 = G + i4;
                this.f37018i = i5;
                return zzgpw.m52568X(Arrays.copyOfRange(this.f37015f, i4, i5));
            }
        }
        if (G <= 0) {
            throw zzgrq.m53037f();
        }
        throw zzgrq.m53040j();
    }

    /* renamed from: z */
    public final String mo47142z() throws IOException {
        int G = mo47117G();
        if (G > 0) {
            int i = this.f37016g;
            int i2 = this.f37018i;
            if (G <= i - i2) {
                String str = new String(this.f37015f, i2, G, zzgro.f37162b);
                this.f37018i += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw zzgrq.m53037f();
        }
        throw zzgrq.m53040j();
    }
}
