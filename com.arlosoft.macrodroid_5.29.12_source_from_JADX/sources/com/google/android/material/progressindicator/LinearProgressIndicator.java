package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: G */
    public static final int f49896G = C10462R.style.Widget_MaterialComponents_LinearProgressIndicator;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.linearProgressIndicatorStyle);
    }

    /* renamed from: s */
    private void m69106s() {
        setIndeterminateDrawable(IndeterminateDrawable.m69053r(getContext(), (LinearProgressIndicatorSpec) this.f49800a));
        setProgressDrawable(DeterminateDrawable.m69006t(getContext(), (LinearProgressIndicatorSpec) this.f49800a));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f49800a).f49897g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f49800a).f49898h;
    }

    /* renamed from: o */
    public void mo58477o(int i, boolean z) {
        S s = this.f49800a;
        if (s == null || ((LinearProgressIndicatorSpec) s).f49897g != 0 || !isIndeterminate()) {
            super.mo58477o(i, z);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f49800a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (!(((LinearProgressIndicatorSpec) s).f49898h == 1 || ((ViewCompat.getLayoutDirection(this) == 1 && ((LinearProgressIndicatorSpec) this.f49800a).f49898h == 2) || (ViewCompat.getLayoutDirection(this) == 0 && ((LinearProgressIndicatorSpec) this.f49800a).f49898h == 3)))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f49899i = z2;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        IndeterminateDrawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        DeterminateDrawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public LinearProgressIndicatorSpec mo58474i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f49800a).f49897g != i) {
            if (!mo58484q() || !isIndeterminate()) {
                S s = this.f49800a;
                ((LinearProgressIndicatorSpec) s).f49897g = i;
                ((LinearProgressIndicatorSpec) s).mo58501e();
                if (i == 0) {
                    getIndeterminateDrawable().mo58572u(new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) this.f49800a));
                } else {
                    getIndeterminateDrawable().mo58572u(new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) this.f49800a));
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f49800a).mo58501e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f49800a;
        ((LinearProgressIndicatorSpec) s).f49898h = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (!(i == 1 || ((ViewCompat.getLayoutDirection(this) == 1 && ((LinearProgressIndicatorSpec) this.f49800a).f49898h == 2) || (ViewCompat.getLayoutDirection(this) == 0 && i == 3)))) {
            z = false;
        }
        linearProgressIndicatorSpec.f49899i = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f49800a).mo58501e();
        invalidate();
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, f49896G);
        m69106s();
    }
}
