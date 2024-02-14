package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: com.jaredrummler.android.colorpicker.d */
/* compiled from: DrawingUtils */
final class C11692d {
    /* renamed from: a */
    static int m81826a(Context context, float f) {
        float applyDimension = TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        int i = (int) (((double) applyDimension) + 0.5d);
        if (i != 0 || applyDimension <= 0.0f) {
            return i;
        }
        return 1;
    }
}
