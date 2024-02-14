package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.C0144Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    @C0144Px

    /* renamed from: g */
    public int f49839g;
    @C0144Px

    /* renamed from: h */
    public int f49840h;

    /* renamed from: i */
    public int f49841i;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.circularProgressIndicatorStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo58501e() {
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f49838G);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C10462R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C10462R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.CircularProgressIndicator, i, i2, new int[0]);
        this.f49839g = Math.max(MaterialResources.m69123c(context, h, C10462R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f49813a * 2);
        this.f49840h = MaterialResources.m69123c(context, h, C10462R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f49841i = h.getInt(C10462R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        h.recycle();
        mo58501e();
    }
}
