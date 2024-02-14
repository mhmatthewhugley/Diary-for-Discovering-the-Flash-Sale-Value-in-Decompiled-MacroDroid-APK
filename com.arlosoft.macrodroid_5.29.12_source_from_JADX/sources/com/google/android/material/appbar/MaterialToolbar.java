package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;

public class MaterialToolbar extends Toolbar {

    /* renamed from: f */
    private static final int f48641f = C10462R.style.Widget_MaterialComponents_Toolbar;
    @Nullable

    /* renamed from: a */
    private Integer f48642a;

    /* renamed from: c */
    private boolean f48643c;

    /* renamed from: d */
    private boolean f48644d;

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.toolbarStyle);
    }

    /* renamed from: a */
    private Pair<Integer, Integer> m67396a(@Nullable TextView textView, @Nullable TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: b */
    private void m67397b(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.mo58656a0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.mo58649P(context);
            materialShapeDrawable.mo58655Z(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, materialShapeDrawable);
        }
    }

    /* renamed from: c */
    private void m67398c(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, BasicMeasure.EXACTLY), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: d */
    private void m67399d() {
        if (this.f48643c || this.f48644d) {
            TextView e = ToolbarUtils.m68828e(this);
            TextView c = ToolbarUtils.m68826c(this);
            if (e != null || c != null) {
                Pair<Integer, Integer> a = m67396a(e, c);
                if (this.f48643c && e != null) {
                    m67398c(e, a);
                }
                if (this.f48644d && c != null) {
                    m67398c(c, a);
                }
            }
        }
    }

    @Nullable
    /* renamed from: e */
    private Drawable m67400e(@Nullable Drawable drawable) {
        if (drawable == null || this.f48642a == null) {
            return drawable;
        }
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(wrap, this.f48642a.intValue());
        return wrap;
    }

    @ColorInt
    @Nullable
    public Integer getNavigationIconTint() {
        return this.f48642a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.m69254e(this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m67399d();
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.m69253d(this, f);
    }

    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(m67400e(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f48642a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f48644d != z) {
            this.f48644d = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f48643c != z) {
            this.f48643c = z;
            requestLayout();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f48641f
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.m69957c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.C10462R.styleable.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.m68822h(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.C10462R.styleable.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0029
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = com.google.android.material.C10462R.styleable.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f48643c = r10
            int r10 = com.google.android.material.C10462R.styleable.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f48644d = r10
            r9.recycle()
            r7.m67397b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
