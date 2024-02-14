package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.C0144Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.C10462R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: G */
    public static final int f49838G = C10462R.style.Widget_MaterialComponents_CircularProgressIndicator;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.circularProgressIndicatorStyle);
    }

    /* renamed from: s */
    private void m68999s() {
        setIndeterminateDrawable(IndeterminateDrawable.m69052q(getContext(), (CircularProgressIndicatorSpec) this.f49800a));
        setProgressDrawable(DeterminateDrawable.m69005s(getContext(), (CircularProgressIndicatorSpec) this.f49800a));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f49800a).f49841i;
    }

    @C0144Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f49800a).f49840h;
    }

    @C0144Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f49800a).f49839g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public CircularProgressIndicatorSpec mo58474i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f49800a).f49841i = i;
        invalidate();
    }

    public void setIndicatorInset(@C0144Px int i) {
        S s = this.f49800a;
        if (((CircularProgressIndicatorSpec) s).f49840h != i) {
            ((CircularProgressIndicatorSpec) s).f49840h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@C0144Px int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f49800a;
        if (((CircularProgressIndicatorSpec) s).f49839g != max) {
            ((CircularProgressIndicatorSpec) s).f49839g = max;
            ((CircularProgressIndicatorSpec) s).mo58501e();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f49800a).mo58501e();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, f49838G);
        m68999s();
    }
}
