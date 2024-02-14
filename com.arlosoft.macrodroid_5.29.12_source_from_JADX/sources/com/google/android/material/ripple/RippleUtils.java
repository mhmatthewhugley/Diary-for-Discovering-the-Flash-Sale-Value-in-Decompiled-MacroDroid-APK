package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.ColorUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleUtils {

    /* renamed from: a */
    public static final boolean f49933a = true;

    /* renamed from: b */
    private static final int[] f49934b = {16842919};

    /* renamed from: c */
    private static final int[] f49935c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f49936d = {16842908};

    /* renamed from: e */
    private static final int[] f49937e = {16843623};

    /* renamed from: f */
    private static final int[] f49938f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f49939g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f49940h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f49941i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f49942j = {16842913};

    /* renamed from: k */
    private static final int[] f49943k = {16842910, 16842919};
    @VisibleForTesting

    /* renamed from: l */
    static final String f49944l = RippleUtils.class.getSimpleName();

    private RippleUtils() {
    }

    @NonNull
    /* renamed from: a */
    public static ColorStateList m69152a(@Nullable ColorStateList colorStateList) {
        if (f49933a) {
            return new ColorStateList(new int[][]{f49942j, StateSet.NOTHING}, new int[]{m69154c(colorStateList, f49938f), m69154c(colorStateList, f49934b)});
        }
        int[] iArr = f49938f;
        int[] iArr2 = f49939g;
        int[] iArr3 = f49940h;
        int[] iArr4 = f49941i;
        int[] iArr5 = f49934b;
        int[] iArr6 = f49935c;
        int[] iArr7 = f49936d;
        int[] iArr8 = f49937e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f49942j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m69154c(colorStateList, iArr), m69154c(colorStateList, iArr2), m69154c(colorStateList, iArr3), m69154c(colorStateList, iArr4), 0, m69154c(colorStateList, iArr5), m69154c(colorStateList, iArr6), m69154c(colorStateList, iArr7), m69154c(colorStateList, iArr8), 0});
    }

    @ColorInt
    /* renamed from: b */
    private static int m69153b(@ColorInt int i) {
        return ColorUtils.setAlphaComponent(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @ColorInt
    /* renamed from: c */
    private static int m69154c(@Nullable ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f49933a ? m69153b(colorForState) : colorForState;
    }

    @NonNull
    /* renamed from: d */
    public static ColorStateList m69155d(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f49943k, 0)) != 0) {
            Log.w(f49944l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: e */
    public static boolean m69156e(@NonNull int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
