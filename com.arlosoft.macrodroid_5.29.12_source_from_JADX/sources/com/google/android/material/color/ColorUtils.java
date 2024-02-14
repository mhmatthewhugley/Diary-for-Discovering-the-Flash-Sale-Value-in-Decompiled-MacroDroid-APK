package com.google.android.material.color;

import java.util.Arrays;

final class ColorUtils {

    /* renamed from: a */
    private static final float[] f49094a = {95.047f, 100.0f, 108.883f};

    private ColorUtils() {
    }

    /* renamed from: a */
    public static final float[] m68093a() {
        return Arrays.copyOf(f49094a, 3);
    }

    /* renamed from: b */
    public static float m68094b(float f) {
        return (f > 8.0f ? (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
