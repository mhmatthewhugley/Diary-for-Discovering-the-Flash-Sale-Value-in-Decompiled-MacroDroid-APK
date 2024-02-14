package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ThemeEnforcement;

public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {

    /* renamed from: g */
    public int f49897g;

    /* renamed from: h */
    public int f49898h;

    /* renamed from: i */
    boolean f49899i;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.linearProgressIndicatorStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo58501e() {
        if (this.f49897g != 0) {
            return;
        }
        if (this.f49814b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f49815c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f49896G);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        boolean z = false;
        TypedArray h = ThemeEnforcement.m68822h(context, attributeSet, C10462R.styleable.LinearProgressIndicator, C10462R.attr.linearProgressIndicatorStyle, LinearProgressIndicator.f49896G, new int[0]);
        this.f49897g = h.getInt(C10462R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f49898h = h.getInt(C10462R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        h.recycle();
        mo58501e();
        this.f49899i = this.f49898h == 1 ? true : z;
    }
}
