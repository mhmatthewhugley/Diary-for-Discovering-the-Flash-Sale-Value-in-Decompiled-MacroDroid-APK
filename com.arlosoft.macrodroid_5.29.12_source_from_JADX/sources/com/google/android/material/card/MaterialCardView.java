package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import com.google.android.material.C10462R;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

public class MaterialCardView extends CardView implements Checkable, Shapeable {

    /* renamed from: o */
    private static final int[] f48933o = {16842911};

    /* renamed from: p */
    private static final int[] f48934p = {16842912};

    /* renamed from: s */
    private static final int[] f48935s = {C10462R.attr.state_dragged};

    /* renamed from: z */
    private static final int f48936z = C10462R.style.Widget_MaterialComponents_CardView;
    @NonNull

    /* renamed from: a */
    private final MaterialCardViewHelper f48937a;

    /* renamed from: c */
    private boolean f48938c;

    /* renamed from: d */
    private boolean f48939d;

    /* renamed from: f */
    private boolean f48940f;

    /* renamed from: g */
    private OnCheckedChangeListener f48941g;

    public interface OnCheckedChangeListener {
        /* renamed from: a */
        void mo57137a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.materialCardViewStyle);
    }

    /* renamed from: f */
    private void m67791f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f48937a.mo57163i();
        }
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f48937a.mo57164j().getBounds());
        return rectF;
    }

    /* renamed from: g */
    public boolean mo57095g() {
        MaterialCardViewHelper materialCardViewHelper = this.f48937a;
        return materialCardViewHelper != null && materialCardViewHelper.mo57139C();
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f48937a.mo57165k();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f48937a.mo57166l();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f48937a.mo57167m();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f48937a.mo57168n();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f48937a.mo57169o();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f48937a.mo57170p();
    }

    public int getContentPaddingBottom() {
        return this.f48937a.mo57178z().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f48937a.mo57178z().left;
    }

    public int getContentPaddingRight() {
        return this.f48937a.mo57178z().right;
    }

    public int getContentPaddingTop() {
        return this.f48937a.mo57178z().top;
    }

    @FloatRange(from = 0.0d, mo592to = 1.0d)
    public float getProgress() {
        return this.f48937a.mo57172t();
    }

    public float getRadius() {
        return this.f48937a.mo57171r();
    }

    public ColorStateList getRippleColor() {
        return this.f48937a.mo57173u();
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f48937a.mo57174v();
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        return this.f48937a.mo57175w();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f48937a.mo57176x();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f48937a.mo57177y();
    }

    /* renamed from: h */
    public boolean mo57107h() {
        return this.f48940f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo57108i(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    public boolean isChecked() {
        return this.f48939d;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69255f(this, this.f48937a.mo57164j());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo57095g()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f48933o);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f48934p);
        }
        if (mo57107h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f48935s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo57095g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f48937a.mo57141E(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f48938c) {
            if (!this.f48937a.mo57138B()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f48937a.mo57142F(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        this.f48937a.mo57143G(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f48937a.mo57160Z();
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        this.f48937a.mo57144H(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f48937a.mo57145I(z);
    }

    public void setChecked(boolean z) {
        if (this.f48939d != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f48937a.mo57147K(drawable);
    }

    public void setCheckedIconMargin(@Dimension int i) {
        this.f48937a.mo57148L(i);
    }

    public void setCheckedIconMarginResource(@DimenRes int i) {
        if (i != -1) {
            this.f48937a.mo57148L(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        this.f48937a.mo57147K(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setCheckedIconSize(@Dimension int i) {
        this.f48937a.mo57149M(i);
    }

    public void setCheckedIconSizeResource(@DimenRes int i) {
        if (i != 0) {
            this.f48937a.mo57149M(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        this.f48937a.mo57150N(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        MaterialCardViewHelper materialCardViewHelper = this.f48937a;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.mo57158X();
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f48937a.mo57157U(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f48940f != z) {
            this.f48940f = z;
            refreshDrawableState();
            m67791f();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f48937a.mo57161b0();
    }

    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener onCheckedChangeListener) {
        this.f48941g = onCheckedChangeListener;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f48937a.mo57161b0();
        this.f48937a.mo57159Y();
    }

    public void setProgress(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        this.f48937a.mo57152P(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f48937a.mo57151O(f);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        this.f48937a.mo57153Q(colorStateList);
    }

    public void setRippleColorResource(@ColorRes int i) {
        this.f48937a.mo57153Q(AppCompatResources.getColorStateList(getContext(), i));
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.mo58706u(getBoundsAsRectF()));
        this.f48937a.mo57154R(shapeAppearanceModel);
    }

    public void setStrokeColor(@ColorInt int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(@Dimension int i) {
        this.f48937a.mo57156T(i);
        invalidate();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f48937a.mo57161b0();
        this.f48937a.mo57159Y();
    }

    public void toggle() {
        if (mo57095g() && isEnabled()) {
            this.f48939d = !this.f48939d;
            refreshDrawableState();
            m67791f();
            this.f48937a.mo57146J(this.f48939d);
            OnCheckedChangeListener onCheckedChangeListener = this.f48941g;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.mo57137a(this, this.f48939d);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f48936z
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f48939d = r8
            r7.f48940f = r8
            r0 = 1
            r7.f48938c = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.MaterialCardViewHelper r0 = new com.google.android.material.card.MaterialCardViewHelper
            r0.<init>(r7, r9, r10, r6)
            r7.f48937a = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.mo57143G(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.mo57157U(r9, r10, r1, r2)
            r0.mo57140D(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f48937a.mo57143G(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f48937a.mo57155S(colorStateList);
        invalidate();
    }
}
