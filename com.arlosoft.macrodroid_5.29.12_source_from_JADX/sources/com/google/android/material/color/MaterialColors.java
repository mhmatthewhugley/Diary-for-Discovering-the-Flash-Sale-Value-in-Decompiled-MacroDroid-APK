package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.resources.MaterialAttributes;

public class MaterialColors {
    private MaterialColors() {
    }

    @ColorInt
    /* renamed from: a */
    public static int m68101a(@ColorInt int i, @IntRange(from = 0, mo610to = 255) int i2) {
        return ColorUtils.setAlphaComponent(i, (Color.alpha(i) * i2) / 255);
    }

    @ColorInt
    /* renamed from: b */
    public static int m68102b(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        TypedValue a = MaterialAttributes.m69116a(context, i);
        return a != null ? a.data : i2;
    }

    @ColorInt
    /* renamed from: c */
    public static int m68103c(Context context, @AttrRes int i, String str) {
        return MaterialAttributes.m69119d(context, i, str);
    }

    @ColorInt
    /* renamed from: d */
    public static int m68104d(@NonNull View view, @AttrRes int i) {
        return MaterialAttributes.m69120e(view, i);
    }

    @ColorInt
    /* renamed from: e */
    public static int m68105e(@NonNull View view, @AttrRes int i, @ColorInt int i2) {
        return m68102b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static boolean m68106f(@ColorInt int i) {
        return i != 0 && ColorUtils.calculateLuminance(i) > 0.5d;
    }

    @ColorInt
    /* renamed from: g */
    public static int m68107g(@ColorInt int i, @ColorInt int i2) {
        return ColorUtils.compositeColors(i2, i);
    }

    @ColorInt
    /* renamed from: h */
    public static int m68108h(@ColorInt int i, @ColorInt int i2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        return m68107g(i, ColorUtils.setAlphaComponent(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    @ColorInt
    /* renamed from: i */
    public static int m68109i(@NonNull View view, @AttrRes int i, @AttrRes int i2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        return m68108h(m68104d(view, i), m68104d(view, i2), f);
    }
}
