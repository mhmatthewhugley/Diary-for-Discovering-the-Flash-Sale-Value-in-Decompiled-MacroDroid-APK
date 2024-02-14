package com.google.android.material.math;

public final class MathUtils {
    private MathUtils() {
    }

    /* renamed from: a */
    public static float m68852a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    public static float m68853b(float f, float f2, float f3, float f4, float f5, float f6) {
        return m68856e(m68852a(f, f2, f3, f4), m68852a(f, f2, f5, f4), m68852a(f, f2, f5, f6), m68852a(f, f2, f3, f6));
    }

    /* renamed from: c */
    public static boolean m68854c(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: d */
    public static float m68855d(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: e */
    private static float m68856e(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
