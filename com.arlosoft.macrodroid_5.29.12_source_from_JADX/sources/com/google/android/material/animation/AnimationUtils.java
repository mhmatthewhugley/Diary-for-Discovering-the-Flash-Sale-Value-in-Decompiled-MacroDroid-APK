package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class AnimationUtils {

    /* renamed from: a */
    public static final TimeInterpolator f48521a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f48522b = new FastOutSlowInInterpolator();

    /* renamed from: c */
    public static final TimeInterpolator f48523c = new FastOutLinearInInterpolator();

    /* renamed from: d */
    public static final TimeInterpolator f48524d = new LinearOutSlowInInterpolator();

    /* renamed from: e */
    public static final TimeInterpolator f48525e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m67220a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m67221b(float f, float f2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f3, @FloatRange(from = 0.0d, mo592to = 1.0d) float f4, @FloatRange(from = 0.0d, mo592to = 1.0d) float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : m67220a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m67222c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
