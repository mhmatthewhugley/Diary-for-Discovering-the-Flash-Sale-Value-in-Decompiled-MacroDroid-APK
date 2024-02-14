package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0144Px;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.shape.MaterialShapeDrawable;

public class MaterialDivider extends View {

    /* renamed from: o */
    private static final int f49288o = C10462R.style.Widget_MaterialComponents_MaterialDivider;
    @NonNull

    /* renamed from: a */
    private final MaterialShapeDrawable f49289a;

    /* renamed from: c */
    private int f49290c;
    @ColorInt

    /* renamed from: d */
    private int f49291d;

    /* renamed from: f */
    private int f49292f;

    /* renamed from: g */
    private int f49293g;

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.materialDividerStyle);
    }

    public int getDividerColor() {
        return this.f49291d;
    }

    @C0144Px
    public int getDividerInsetEnd() {
        return this.f49293g;
    }

    @C0144Px
    public int getDividerInsetStart() {
        return this.f49292f;
    }

    public int getDividerThickness() {
        return this.f49290c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(@NonNull Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        boolean z = true;
        if (ViewCompat.getLayoutDirection(this) != 1) {
            z = false;
        }
        int i3 = z ? this.f49293g : this.f49292f;
        if (z) {
            i2 = getWidth();
            i = this.f49292f;
        } else {
            i2 = getWidth();
            i = this.f49293g;
        }
        this.f49289a.setBounds(i3, 0, i2 - i, getBottom() - getTop());
        this.f49289a.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f49290c;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i) {
        if (this.f49291d != i) {
            this.f49291d = i;
            this.f49289a.mo58656a0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i) {
        setDividerColor(ContextCompat.getColor(getContext(), i));
    }

    public void setDividerInsetEnd(@C0144Px int i) {
        this.f49293g = i;
    }

    public void setDividerInsetEndResource(@DimenRes int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@C0144Px int i) {
        this.f49292f = i;
    }

    public void setDividerInsetStartResource(@DimenRes int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@C0144Px int i) {
        if (this.f49290c != i) {
            this.f49290c = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f49288o
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            r7.f49289a = r0
            int[] r2 = com.google.android.material.C10462R.styleable.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C10462R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C10462R.dimen.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.f49290c = r10
            int r10 = com.google.android.material.C10462R.styleable.MaterialDivider_dividerInsetStart
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f49292f = r10
            int r10 = com.google.android.material.C10462R.styleable.MaterialDivider_dividerInsetEnd
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f49293g = r10
            int r10 = com.google.android.material.C10462R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = com.google.android.material.resources.MaterialResources.m69121a(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
