package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d */
    final Rect f48637d = new Rect();

    /* renamed from: e */
    final Rect f48638e = new Rect();

    /* renamed from: f */
    private int f48639f = 0;

    /* renamed from: g */
    private int f48640g;

    public HeaderScrollingViewBehavior() {
    }

    /* renamed from: j */
    private static int m67386j(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo56783b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View d = mo56697d(coordinatorLayout.getDependencies(view));
        if (d != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.f48637d;
            rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, d.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + d.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(view)) {
                rect.left += lastWindowInsets.getSystemWindowInsetLeft();
                rect.right -= lastWindowInsets.getSystemWindowInsetRight();
            }
            Rect rect2 = this.f48638e;
            GravityCompat.apply(m67386j(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int e = mo56784e(d);
            view.layout(rect2.left, rect2.top - e, rect2.right, rect2.bottom - e);
            this.f48639f = rect2.top - d.getBottom();
            return;
        }
        super.mo56783b(coordinatorLayout, view, i);
        this.f48639f = 0;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: d */
    public abstract View mo56697d(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo56784e(View view) {
        if (this.f48640g == 0) {
            return 0;
        }
        float f = mo56698f(view);
        int i = this.f48640g;
        return MathUtils.clamp((int) (f * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo56698f(View view) {
        return 1.0f;
    }

    /* renamed from: g */
    public final int mo56785g() {
        return this.f48640g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo56699h(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo56786i() {
        return this.f48639f;
    }

    /* renamed from: k */
    public final void mo56787k(int i) {
        this.f48640g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo56788l() {
        return false;
    }

    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
        View d;
        WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (d = mo56697d(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.getFitsSystemWindows(d) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetTop() + lastWindowInsets.getSystemWindowInsetBottom();
        }
        int h = size + mo56699h(d);
        int measuredHeight = d.getMeasuredHeight();
        if (mo56788l()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            h -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(h, i5 == -1 ? BasicMeasure.EXACTLY : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
