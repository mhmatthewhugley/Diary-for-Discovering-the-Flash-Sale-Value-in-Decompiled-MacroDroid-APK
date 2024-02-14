package com.google.android.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RippleDrawableCompat extends Drawable implements Shapeable, TintAwareDrawable {

    /* renamed from: a */
    private RippleDrawableCompatState f49930a;

    @NonNull
    /* renamed from: a */
    public RippleDrawableCompat mutate() {
        this.f49930a = new RippleDrawableCompatState(this.f49930a);
        return this;
    }

    public void draw(Canvas canvas) {
        RippleDrawableCompatState rippleDrawableCompatState = this.f49930a;
        if (rippleDrawableCompatState.f49932b) {
            rippleDrawableCompatState.f49931a.draw(canvas);
        }
    }

    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f49930a;
    }

    public int getOpacity() {
        return this.f49930a.f49931a.getOpacity();
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f49930a.f49931a.getShapeAppearanceModel();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f49930a.f49931a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f49930a.f49931a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = RippleUtils.m69156e(iArr);
        RippleDrawableCompatState rippleDrawableCompatState = this.f49930a;
        if (rippleDrawableCompatState.f49932b == e) {
            return onStateChange;
        }
        rippleDrawableCompatState.f49932b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.f49930a.f49931a.setAlpha(i);
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f49930a.f49931a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.f49930a.f49931a.setShapeAppearanceModel(shapeAppearanceModel);
    }

    public void setTint(@ColorInt int i) {
        this.f49930a.f49931a.setTint(i);
    }

    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f49930a.f49931a.setTintList(colorStateList);
    }

    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f49930a.f49931a.setTintMode(mode);
    }

    public RippleDrawableCompat(ShapeAppearanceModel shapeAppearanceModel) {
        this(new RippleDrawableCompatState(new MaterialShapeDrawable(shapeAppearanceModel)));
    }

    static final class RippleDrawableCompatState extends Drawable.ConstantState {
        @NonNull

        /* renamed from: a */
        MaterialShapeDrawable f49931a;

        /* renamed from: b */
        boolean f49932b;

        public RippleDrawableCompatState(MaterialShapeDrawable materialShapeDrawable) {
            this.f49931a = materialShapeDrawable;
            this.f49932b = false;
        }

        @NonNull
        /* renamed from: a */
        public RippleDrawableCompat newDrawable() {
            return new RippleDrawableCompat(new RippleDrawableCompatState(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public RippleDrawableCompatState(@NonNull RippleDrawableCompatState rippleDrawableCompatState) {
            this.f49931a = (MaterialShapeDrawable) rippleDrawableCompatState.f49931a.getConstantState().newDrawable();
            this.f49932b = rippleDrawableCompatState.f49932b;
        }
    }

    private RippleDrawableCompat(RippleDrawableCompatState rippleDrawableCompatState) {
        this.f49930a = rippleDrawableCompatState;
    }
}
