package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

public abstract class BaseProgressIndicatorSpec {
    @C0144Px

    /* renamed from: a */
    public int f49813a;
    @C0144Px

    /* renamed from: b */
    public int f49814b;
    @NonNull

    /* renamed from: c */
    public int[] f49815c = new int[0];
    @ColorInt

    /* renamed from: d */
    public int f49816d;

    /* renamed from: e */
    public int f49817e;

    /* renamed from: f */
    public int f49818f;

    protected BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C10462R.dimen.mtrl_progress_track_thickness);
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.f49813a = MaterialResources.m69123c(context, h, C10462R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f49814b = Math.min(MaterialResources.m69123c(context, h, C10462R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.f49813a / 2);
        this.f49817e = h.getInt(C10462R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f49818f = h.getInt(C10462R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        m68963c(context, h);
        m68964d(context, h);
        h.recycle();
    }

    /* renamed from: c */
    private void m68963c(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i = C10462R.styleable.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.f49815c = new int[]{MaterialColors.m68102b(context, C10462R.attr.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f49815c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f49815c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    private void m68964d(@NonNull Context context, @NonNull TypedArray typedArray) {
        int i = C10462R.styleable.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            this.f49816d = typedArray.getColor(i, -1);
            return;
        }
        this.f49816d = this.f49815c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f49816d = MaterialColors.m68101a(this.f49816d, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public boolean mo58499a() {
        return this.f49818f != 0;
    }

    /* renamed from: b */
    public boolean mo58500b() {
        return this.f49817e != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo58501e();
}
