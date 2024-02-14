package com.google.android.material.theme.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.material.C10462R;

public class MaterialThemeOverlay {

    /* renamed from: a */
    private static final int[] f50599a = {16842752, C10462R.attr.theme};

    /* renamed from: b */
    private static final int[] f50600b = {C10462R.attr.materialThemeOverlay};

    private MaterialThemeOverlay() {
    }

    @StyleRes
    /* renamed from: a */
    private static int m69955a(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f50599a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @StyleRes
    /* renamed from: b */
    private static int m69956b(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f50600b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    /* renamed from: c */
    public static Context m69957c(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        int b = m69956b(context, attributeSet, i, i2);
        boolean z = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).getThemeResId() == b;
        if (b == 0 || z) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, b);
        int a = m69955a(context, attributeSet);
        if (a != 0) {
            contextThemeWrapper.getTheme().applyStyle(a, true);
        }
        return contextThemeWrapper;
    }
}
