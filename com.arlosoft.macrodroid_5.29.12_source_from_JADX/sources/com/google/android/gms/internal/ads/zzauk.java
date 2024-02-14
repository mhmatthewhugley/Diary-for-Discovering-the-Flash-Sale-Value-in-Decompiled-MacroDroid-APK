package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzauk {

    /* renamed from: a */
    private final int f25655a;

    /* renamed from: b */
    private final int f25656b;

    /* renamed from: c */
    private final int f25657c;

    /* renamed from: d */
    private final int f25658d;

    /* renamed from: e */
    private final int f25659e;

    /* renamed from: f */
    private final short[] f25660f;

    /* renamed from: g */
    private int f25661g;

    /* renamed from: h */
    private short[] f25662h;

    /* renamed from: i */
    private int f25663i;

    /* renamed from: j */
    private short[] f25664j;

    /* renamed from: k */
    private int f25665k;

    /* renamed from: l */
    private short[] f25666l;

    /* renamed from: m */
    private int f25667m = 0;

    /* renamed from: n */
    private int f25668n = 0;

    /* renamed from: o */
    private float f25669o = 1.0f;

    /* renamed from: p */
    private float f25670p = 1.0f;

    /* renamed from: q */
    private int f25671q;

    /* renamed from: r */
    private int f25672r;

    /* renamed from: s */
    private int f25673s;

    /* renamed from: t */
    private int f25674t;

    /* renamed from: u */
    private int f25675u = 0;

    /* renamed from: v */
    private int f25676v;

    /* renamed from: w */
    private int f25677w;

    /* renamed from: x */
    private int f25678x;

    public zzauk(int i, int i2) {
        this.f25655a = i;
        this.f25656b = i2;
        this.f25657c = i / 400;
        int i3 = i / 65;
        this.f25658d = i3;
        int i4 = i3 + i3;
        this.f25659e = i4;
        this.f25660f = new short[i4];
        this.f25661g = i4;
        int i5 = i2 * i4;
        this.f25662h = new short[i5];
        this.f25663i = i4;
        this.f25664j = new short[i5];
        this.f25665k = i4;
        this.f25666l = new short[i5];
    }

    /* renamed from: g */
    private final int m42517g(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f25656b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
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
        this.f25677w = i5 / i7;
        this.f25678x = i8 / i6;
        return i7;
    }

    /* renamed from: h */
    private final void m42518h(short[] sArr, int i, int i2) {
        m42521k(i2);
        int i3 = this.f25656b;
        System.arraycopy(sArr, i * i3, this.f25664j, this.f25672r * i3, i3 * i2);
        this.f25672r += i2;
    }

    /* renamed from: i */
    private final void m42519i(short[] sArr, int i, int i2) {
        int i3 = this.f25659e / i2;
        int i4 = this.f25656b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f25660f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: j */
    private final void m42520j(int i) {
        int i2 = this.f25671q;
        int i3 = this.f25661g;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f25661g = i4;
            this.f25662h = Arrays.copyOf(this.f25662h, i4 * this.f25656b);
        }
    }

    /* renamed from: k */
    private final void m42521k(int i) {
        int i2 = this.f25672r;
        int i3 = this.f25663i;
        if (i2 + i > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f25663i = i4;
            this.f25664j = Arrays.copyOf(this.f25664j, i4 * this.f25656b);
        }
    }

    /* renamed from: l */
    private static void m42522l(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: m */
    private final void m42523m() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.f25672r;
        float f = this.f25669o / this.f25670p;
        double d = (double) f;
        int i10 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f25671q;
            if (i11 >= this.f25659e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f25674t;
                    if (i13 > 0) {
                        int min = Math.min(this.f25659e, i13);
                        m42518h(this.f25662h, i12, min);
                        this.f25674t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f25662h;
                        int i14 = this.f25655a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f25656b == i10 && i15 == i10) {
                            i5 = m42517g(sArr, i12, this.f25657c, this.f25658d);
                        } else {
                            m42519i(sArr, i12, i15);
                            int g = m42517g(this.f25660f, 0, this.f25657c / i15, this.f25658d / i15);
                            if (i15 != i10) {
                                int i16 = g * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f25657c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f25658d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f25656b == i10) {
                                    i5 = m42517g(sArr, i12, i18, i19);
                                } else {
                                    m42519i(sArr, i12, i10);
                                    i5 = m42517g(this.f25660f, 0, i18, i19);
                                }
                            } else {
                                i5 = g;
                            }
                        }
                        int i22 = this.f25677w;
                        int i23 = (i22 == 0 || (i8 = this.f25675u) == 0 || this.f25678x > i22 * 3 || i22 + i22 <= this.f25676v * 3) ? i5 : i8;
                        this.f25676v = i22;
                        this.f25675u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f25662h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i23) / (-1.0f + f));
                            } else {
                                this.f25674t = (int) ((((float) i23) * (2.0f - f)) / (-1.0f + f));
                                i7 = i23;
                            }
                            m42521k(i7);
                            int i24 = i7;
                            m42522l(i7, this.f25656b, this.f25664j, this.f25672r, sArr2, i12, sArr2, i12 + i23);
                            this.f25672r += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f25662h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i25) * f) / (1.0f - f));
                            } else {
                                this.f25674t = (int) ((((float) i25) * ((f + f) - 4.0f)) / (1.0f - f));
                                i6 = i25;
                            }
                            int i26 = i25 + i6;
                            m42521k(i26);
                            int i27 = this.f25656b;
                            System.arraycopy(sArr3, i12 * i27, this.f25664j, this.f25672r * i27, i27 * i25);
                            m42522l(i6, this.f25656b, this.f25664j, this.f25672r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.f25672r += i26;
                            i12 += i6;
                        }
                    }
                    if (this.f25659e + i12 > i11) {
                        break;
                    }
                    i10 = 1;
                }
                int i28 = this.f25671q - i12;
                short[] sArr4 = this.f25662h;
                int i29 = this.f25656b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.f25671q = i28;
            }
        } else {
            m42518h(this.f25662h, 0, this.f25671q);
            this.f25671q = 0;
        }
        float f2 = this.f25670p;
        if (f2 != 1.0f && this.f25672r != i9) {
            int i30 = this.f25655a;
            int i31 = (int) (((float) i30) / f2);
            while (true) {
                if (i31 <= 16384 && i30 <= 16384) {
                    break;
                }
                i31 /= 2;
                i30 /= 2;
            }
            int i32 = this.f25672r - i9;
            int i33 = this.f25673s;
            int i34 = this.f25665k;
            if (i33 + i32 > i34) {
                int i35 = i34 + (i34 / 2) + i32;
                this.f25665k = i35;
                this.f25666l = Arrays.copyOf(this.f25666l, i35 * this.f25656b);
            }
            short[] sArr5 = this.f25664j;
            int i36 = this.f25656b;
            System.arraycopy(sArr5, i9 * i36, this.f25666l, this.f25673s * i36, i36 * i32);
            this.f25672r = i9;
            this.f25673s += i32;
            int i37 = 0;
            while (true) {
                i = this.f25673s;
                i2 = i - 1;
                if (i37 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f25667m + 1;
                    i4 = this.f25668n;
                    if (i3 * i31 <= i4 * i30) {
                        break;
                    }
                    m42521k(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f25656b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.f25664j;
                        int i40 = this.f25672r;
                        short[] sArr7 = this.f25666l;
                        int i41 = (i37 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.f25668n;
                        int i43 = this.f25667m;
                        int i44 = (i43 + 1) * i31;
                        int i45 = i44 - (i42 * i30);
                        int i46 = i44 - (i43 * i31);
                        sArr6[(i40 * i39) + i38] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i38++;
                    }
                    this.f25668n++;
                    this.f25672r++;
                }
                this.f25667m = i3;
                if (i3 == i30) {
                    this.f25667m = 0;
                    zzbac.m42926e(i4 == i31);
                    this.f25668n = 0;
                }
                i37++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.f25666l;
                int i47 = this.f25656b;
                System.arraycopy(sArr8, i2 * i47, sArr8, 0, (i - i2) * i47);
                this.f25673s -= i2;
            }
        }
    }

    /* renamed from: a */
    public final int mo42054a() {
        return this.f25672r;
    }

    /* renamed from: b */
    public final void mo42055b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f25656b, this.f25672r);
        shortBuffer.put(this.f25664j, 0, this.f25656b * min);
        int i = this.f25672r - min;
        this.f25672r = i;
        short[] sArr = this.f25664j;
        int i2 = this.f25656b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: c */
    public final void mo42056c() {
        int i;
        int i2 = this.f25671q;
        float f = this.f25669o;
        float f2 = this.f25670p;
        int i3 = this.f25672r + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f25673s)) / f2) + 0.5f));
        int i4 = this.f25659e;
        m42520j(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.f25659e;
            i = i6 + i6;
            int i7 = this.f25656b;
            if (i5 >= i * i7) {
                break;
            }
            this.f25662h[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.f25671q += i;
        m42523m();
        if (this.f25672r > i3) {
            this.f25672r = i3;
        }
        this.f25671q = 0;
        this.f25674t = 0;
        this.f25673s = 0;
    }

    /* renamed from: d */
    public final void mo42057d(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f25656b;
        int i2 = remaining / i;
        int i3 = i * i2;
        m42520j(i2);
        shortBuffer.get(this.f25662h, this.f25671q * this.f25656b, (i3 + i3) / 2);
        this.f25671q += i2;
        m42523m();
    }

    /* renamed from: e */
    public final void mo42058e(float f) {
        this.f25670p = f;
    }

    /* renamed from: f */
    public final void mo42059f(float f) {
        this.f25669o = f;
    }
}
