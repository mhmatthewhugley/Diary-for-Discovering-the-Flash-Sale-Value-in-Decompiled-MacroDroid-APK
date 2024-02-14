package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzpd {

    /* renamed from: a */
    private final int f38139a;

    /* renamed from: b */
    private final int f38140b;

    /* renamed from: c */
    private final float f38141c;

    /* renamed from: d */
    private final float f38142d;

    /* renamed from: e */
    private final float f38143e;

    /* renamed from: f */
    private final int f38144f;

    /* renamed from: g */
    private final int f38145g;

    /* renamed from: h */
    private final int f38146h;

    /* renamed from: i */
    private final short[] f38147i;

    /* renamed from: j */
    private short[] f38148j;

    /* renamed from: k */
    private int f38149k;

    /* renamed from: l */
    private short[] f38150l;

    /* renamed from: m */
    private int f38151m;

    /* renamed from: n */
    private short[] f38152n;

    /* renamed from: o */
    private int f38153o;

    /* renamed from: p */
    private int f38154p;

    /* renamed from: q */
    private int f38155q;

    /* renamed from: r */
    private int f38156r;

    /* renamed from: s */
    private int f38157s;

    /* renamed from: t */
    private int f38158t;

    /* renamed from: u */
    private int f38159u;

    /* renamed from: v */
    private int f38160v;

    public zzpd(int i, int i2, float f, float f2, int i3) {
        this.f38139a = i;
        this.f38140b = i2;
        this.f38141c = f;
        this.f38142d = f2;
        this.f38143e = ((float) i) / ((float) i3);
        this.f38144f = i / 400;
        int i4 = i / 65;
        this.f38145g = i4;
        int i5 = i4 + i4;
        this.f38146h = i5;
        this.f38147i = new short[i5];
        int i6 = i5 * i2;
        this.f38148j = new short[i6];
        this.f38150l = new short[i6];
        this.f38152n = new short[i6];
    }

    /* renamed from: g */
    private final int m54523g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f38140b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            int i11 = i9 * i7;
            int i12 = i5 * i2;
            if (i11 < i12) {
                i5 = i9;
            }
            if (i11 < i12) {
                i7 = i2;
            }
            int i13 = i9 * i6;
            int i14 = i8 * i2;
            if (i13 > i14) {
                i8 = i9;
            }
            if (i13 > i14) {
                i6 = i2;
            }
            i2++;
        }
        this.f38159u = i5 / i7;
        this.f38160v = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m54524h(short[] sArr, int i, int i2) {
        short[] l = m54528l(this.f38150l, this.f38151m, i2);
        this.f38150l = l;
        int i3 = this.f38140b;
        System.arraycopy(sArr, i * i3, l, this.f38151m * i3, i3 * i2);
        this.f38151m += i2;
    }

    /* renamed from: i */
    private final void m54525i(short[] sArr, int i, int i2) {
        int i3 = this.f38146h / i2;
        int i4 = this.f38140b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f38147i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private static void m54526j(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: k */
    private final void m54527k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f38151m;
        float f = this.f38141c;
        float f2 = this.f38142d;
        float f3 = f / f2;
        float f4 = this.f38143e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f38149k;
            if (i11 >= this.f38146h) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f38156r;
                    if (i13 > 0) {
                        int min = Math.min(this.f38146h, i13);
                        m54524h(this.f38148j, i12, min);
                        this.f38156r -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f38148j;
                        int i14 = this.f38139a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f38140b == i10 && i15 == i10) {
                            i5 = m54523g(sArr, i12, this.f38144f, this.f38145g);
                        } else {
                            m54525i(sArr, i12, i15);
                            int g = m54523g(this.f38147i, 0, this.f38144f / i15, this.f38145g / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f38144f;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f38145g;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f38140b == i10) {
                                    i5 = m54523g(sArr, i12, i18, i19);
                                } else {
                                    m54525i(sArr, i12, i10);
                                    i5 = m54523g(this.f38147i, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f38159u;
                        int i23 = (i22 == 0 || (i8 = this.f38157s) == 0 || this.f38160v > i22 * 3 || i22 + i22 <= this.f38158t * 3) ? i5 : i8;
                        this.f38158t = i22;
                        this.f38157s = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f38148j;
                            if (f3 >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f3));
                            } else {
                                this.f38156r = (int) ((((float) i23) * (2.0f - f3)) / (-1.0f + f3));
                                i7 = i23;
                            }
                            short[] l = m54528l(this.f38150l, this.f38151m, i7);
                            this.f38150l = l;
                            int i24 = i7;
                            short[] sArr3 = sArr2;
                            m54526j(i7, this.f38140b, l, this.f38151m, sArr3, i12, sArr3, i12 + i23);
                            this.f38151m += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr4 = this.f38148j;
                            if (f3 < 0.5f) {
                                i6 = (int) ((((float) i25) * f3) / (f5 - f3));
                            } else {
                                this.f38156r = (int) ((((float) i25) * ((f3 + f3) - 4.0f)) / (f5 - f3));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            short[] l2 = m54528l(this.f38150l, this.f38151m, i26);
                            this.f38150l = l2;
                            int i27 = this.f38140b;
                            System.arraycopy(sArr4, i12 * i27, l2, this.f38151m * i27, i27 * i25);
                            m54526j(i6, this.f38140b, this.f38150l, this.f38151m + i25, sArr4, i12 + i25, sArr4, i12);
                            this.f38151m += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f38146h + i12 > i11) {
                        break;
                    }
                    f5 = 1.0f;
                    i10 = 1;
                }
                int i28 = this.f38149k - i12;
                short[] sArr5 = this.f38148j;
                int i29 = this.f38140b;
                System.arraycopy(sArr5, i12 * i29, sArr5, 0, i29 * i28);
                this.f38149k = i28;
                f5 = 1.0f;
            }
        } else {
            m54524h(this.f38148j, 0, this.f38149k);
            this.f38149k = 0;
        }
        if (f4 != f5 && this.f38151m != i9) {
            int i30 = this.f38139a;
            int i31 = (int) (((float) i30) / f4);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f38151m - i9;
            short[] l3 = m54528l(this.f38152n, this.f38153o, i32);
            this.f38152n = l3;
            short[] sArr6 = this.f38150l;
            int i33 = this.f38140b;
            System.arraycopy(sArr6, i9 * i33, l3, this.f38153o * i33, i33 * i32);
            this.f38151m = i9;
            this.f38153o += i32;
            int i34 = 0;
            while (true) {
                i = this.f38153o;
                i2 = i - 1;
                if (i34 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f38154p + 1;
                    i4 = this.f38155q;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    this.f38150l = m54528l(this.f38150l, this.f38151m, 1);
                    int i35 = 0;
                    while (true) {
                        int i36 = this.f38140b;
                        if (i35 >= i36) {
                            break;
                        }
                        short[] sArr7 = this.f38150l;
                        int i37 = this.f38151m;
                        short[] sArr8 = this.f38152n;
                        int i38 = (i34 * i36) + i35;
                        short s = sArr8[i38];
                        short s2 = sArr8[i38 + i36];
                        int i39 = this.f38155q;
                        int i40 = this.f38154p;
                        int i41 = (i40 + 1) * i31;
                        int i42 = i41 - (i39 * i30);
                        int i43 = i41 - (i40 * i31);
                        sArr7[(i37 * i36) + i35] = (short) (((s * i42) + ((i43 - i42) * s2)) / i43);
                        i35++;
                    }
                    this.f38155q++;
                    this.f38151m++;
                }
                this.f38154p = i3;
                if (i3 == i30) {
                    this.f38154p = 0;
                    zzdd.m47212f(i4 == i31);
                    this.f38155q = 0;
                }
                i34++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.f38152n;
                int i44 = this.f38140b;
                System.arraycopy(sArr9, i2 * i44, sArr9, 0, (i - i2) * i44);
                this.f38153o -= i2;
            }
        }
    }

    /* renamed from: l */
    private final short[] m54528l(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f38140b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: a */
    public final int mo48000a() {
        int i = this.f38151m * this.f38140b;
        return i + i;
    }

    /* renamed from: b */
    public final int mo48001b() {
        int i = this.f38149k * this.f38140b;
        return i + i;
    }

    /* renamed from: c */
    public final void mo48002c() {
        this.f38149k = 0;
        this.f38151m = 0;
        this.f38153o = 0;
        this.f38154p = 0;
        this.f38155q = 0;
        this.f38156r = 0;
        this.f38157s = 0;
        this.f38158t = 0;
        this.f38159u = 0;
        this.f38160v = 0;
    }

    /* renamed from: d */
    public final void mo48003d(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f38140b, this.f38151m);
        shortBuffer.put(this.f38150l, 0, this.f38140b * min);
        int i = this.f38151m - min;
        this.f38151m = i;
        short[] sArr = this.f38150l;
        int i2 = this.f38140b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: e */
    public final void mo48004e() {
        int i;
        int i2 = this.f38149k;
        float f = this.f38141c;
        float f2 = this.f38142d;
        int i3 = this.f38151m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f38153o)) / (this.f38143e * f2)) + 0.5f));
        short[] sArr = this.f38148j;
        int i4 = this.f38146h;
        this.f38148j = m54528l(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f38146h;
            i = i6 + i6;
            int i7 = this.f38140b;
            if (i5 >= i * i7) {
                break;
            }
            this.f38148j[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f38149k += i;
        m54527k();
        if (this.f38151m > i3) {
            this.f38151m = i3;
        }
        this.f38149k = 0;
        this.f38156r = 0;
        this.f38153o = 0;
    }

    /* renamed from: f */
    public final void mo48005f(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f38140b;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] l = m54528l(this.f38148j, this.f38149k, i2);
        this.f38148j = l;
        shortBuffer.get(l, this.f38149k * this.f38140b, (i3 + i3) / 2);
        this.f38149k += i2;
        m54527k();
    }
}
