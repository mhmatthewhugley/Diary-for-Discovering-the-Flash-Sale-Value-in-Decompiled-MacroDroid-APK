package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C10462R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: a */
    private void m69950a(@NonNull Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C10462R.styleable.MaterialTextAppearance);
        int f = m69953f(getContext(), obtainStyledAttributes, C10462R.styleable.MaterialTextAppearance_android_lineHeight, C10462R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (f >= 0) {
            setLineHeight(f);
        }
    }

    /* renamed from: b */
    private static boolean m69951b(Context context) {
        return MaterialAttributes.m69117b(context, C10462R.attr.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: d */
    private static int m69952d(@NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C10462R.styleable.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C10462R.styleable.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: f */
    private static int m69953f(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes @NonNull int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = MaterialResources.m69123c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: o */
    private static boolean m69954o(@NonNull Context context, @NonNull Resources.Theme theme, @Nullable AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C10462R.styleable.MaterialTextView, i, i2);
        int f = m69953f(context, obtainStyledAttributes, C10462R.styleable.MaterialTextView_android_lineHeight, C10462R.styleable.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (f != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(@NonNull Context context, int i) {
        super.setTextAppearance(context, i);
        if (m69951b(context)) {
            m69950a(context.getTheme(), i);
        }
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(MaterialThemeOverlay.m69957c(context, attributeSet, i, i2), attributeSet, i);
        int d;
        Context context2 = getContext();
        if (m69951b(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m69954o(context2, theme, attributeSet, i, i2) && (d = m69952d(theme, attributeSet, i, i2)) != -1) {
                m69950a(theme, d);
            }
        }
    }
}
