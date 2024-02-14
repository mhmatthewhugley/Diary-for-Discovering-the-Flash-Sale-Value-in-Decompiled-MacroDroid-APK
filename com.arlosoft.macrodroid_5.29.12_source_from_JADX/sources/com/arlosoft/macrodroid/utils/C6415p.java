package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.exifinterface.media.ExifInterface;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.settings.C5163j2;

/* renamed from: com.arlosoft.macrodroid.utils.p */
/* compiled from: ColorUtils */
public class C6415p {
    @ColorInt
    /* renamed from: a */
    public static int m24699a(Context context, @ColorInt int i) {
        int i2 = context.getResources().getConfiguration().uiMode & 48;
        if (i2 != 0) {
            if (i2 == 16) {
                return m24700b(i, 0.9f);
            }
            if (i2 != 32) {
                return m24703e(i, 0.4f);
            }
            return m24703e(i, 0.4f);
        } else if (C5163j2.m19977H(context).equals(ExifInterface.GPS_MEASUREMENT_2D)) {
            return m24703e(i, 0.4f);
        } else {
            return m24700b(i, 0.9f);
        }
    }

    @ColorInt
    /* renamed from: b */
    public static int m24700b(@ColorInt int i, float f) {
        return Color.argb(Color.alpha(i), Math.max((int) (((float) Color.red(i)) * f), 0), Math.max((int) (((float) Color.green(i)) * f), 0), Math.max((int) (((float) Color.blue(i)) * f), 0));
    }

    @ColorRes
    /* renamed from: c */
    public static int m24701c(int i) {
        return i != 0 ? i != 1 ? C17528R$color.constraints_primary_dark : C17528R$color.actions_primary_dark : C17528R$color.trigger_primary_dark;
    }

    @ColorRes
    /* renamed from: d */
    public static int m24702d(int i) {
        return i != 0 ? i != 1 ? C17528R$color.constraints_primary : C17528R$color.actions_primary : C17528R$color.trigger_primary;
    }

    @ColorInt
    /* renamed from: e */
    public static int m24703e(@ColorInt int i, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Color.alpha(i), (int) ((((((float) Color.red(i)) * f2) / 255.0f) + f) * 255.0f), (int) ((((((float) Color.green(i)) * f2) / 255.0f) + f) * 255.0f), (int) ((((((float) Color.blue(i)) * f2) / 255.0f) + f) * 255.0f));
    }
}
