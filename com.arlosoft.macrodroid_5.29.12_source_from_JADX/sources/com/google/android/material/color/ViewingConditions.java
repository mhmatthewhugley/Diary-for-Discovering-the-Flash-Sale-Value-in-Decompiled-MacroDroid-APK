package com.google.android.material.color;

final class ViewingConditions {

    /* renamed from: k */
    public static final ViewingConditions f49104k = m68111a(ColorUtils.m68093a(), (float) ((((double) ColorUtils.m68094b(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f49105a;

    /* renamed from: b */
    private final float f49106b;

    /* renamed from: c */
    private final float f49107c;

    /* renamed from: d */
    private final float f49108d;

    /* renamed from: e */
    private final float f49109e;

    /* renamed from: f */
    private final float f49110f;

    /* renamed from: g */
    private final float[] f49111g;

    /* renamed from: h */
    private final float f49112h;

    /* renamed from: i */
    private final float f49113i;

    /* renamed from: j */
    private final float f49114j;

    private ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f49110f = f;
        this.f49105a = f2;
        this.f49106b = f3;
        this.f49107c = f4;
        this.f49108d = f5;
        this.f49109e = f6;
        this.f49111g = fArr;
        this.f49112h = f7;
        this.f49113i = f8;
        this.f49114j = f9;
    }

    /* renamed from: a */
    static ViewingConditions m68111a(float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5;
        float f6 = f;
        float[][] fArr2 = Cam16.f49092a;
        float f7 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f8 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f9 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f10 = (f3 / 10.0f) + 0.8f;
        if (((double) f10) >= 0.9d) {
            f4 = MathUtils.m68110a(0.59f, 0.69f, (f10 - 0.9f) * 10.0f);
        } else {
            f4 = MathUtils.m68110a(0.525f, 0.59f, (f10 - 0.8f) * 10.0f);
        }
        float f11 = f4;
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = (1.0f - (((float) Math.exp((double) (((-f6) - 42.0f) / 92.0f))) * 0.2777778f)) * f10;
        }
        double d = (double) f5;
        if (d > 1.0d) {
            f5 = 1.0f;
        } else if (d < 0.0d) {
            f5 = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f7) * f5) + 1.0f) - f5, (((100.0f / f8) * f5) + 1.0f) - f5, (((100.0f / f9) * f5) + 1.0f) - f5};
        float f12 = 1.0f / ((5.0f * f6) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f6) + (0.1f * f14 * f14 * ((float) Math.cbrt(((double) f6) * 5.0d)));
        float b = ColorUtils.m68094b(f2) / fArr[1];
        double d2 = (double) b;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f8)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f9)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(b, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, f11, f10, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }
}
