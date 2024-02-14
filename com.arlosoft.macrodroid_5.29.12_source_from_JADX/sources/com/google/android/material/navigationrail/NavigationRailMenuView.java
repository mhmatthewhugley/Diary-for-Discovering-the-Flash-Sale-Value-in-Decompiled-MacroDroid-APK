package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0144Px;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {
    @C0144Px

    /* renamed from: V */
    private int f49789V = -1;

    /* renamed from: W */
    private final FrameLayout.LayoutParams f49790W;

    public NavigationRailMenuView(@NonNull Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f49790W = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    /* renamed from: m */
    private int m68930m(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.f49789V;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    /* renamed from: n */
    private int m68931n(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    /* renamed from: o */
    private int m68932o(int i, int i2, int i3, View view) {
        int i4;
        m68930m(i, i2, i3);
        if (view == null) {
            i4 = m68930m(i, i2, i3);
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                i5 += m68931n(childAt, i, i4);
            }
        }
        return i5;
    }

    /* renamed from: p */
    private int m68933p(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = m68931n(childAt, i, m68930m(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + m68932o(i, i2, i3, childAt);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public NavigationBarItemView mo56920f(@NonNull Context context) {
        return new NavigationRailItemView(context);
    }

    @C0144Px
    public int getItemMinimumHeight() {
        return this.f49789V;
    }

    /* access modifiers changed from: package-private */
    public int getMenuGravity() {
        return this.f49790W.gravity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo58447l() {
        return (this.f49790W.gravity & 112) == 48;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().getVisibleItems().size();
        if (size2 <= 1 || !mo58283g(getLabelVisibilityMode(), size2)) {
            i3 = m68932o(i, size, size2, (View) null);
        } else {
            i3 = m68933p(i, size, size2);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState(i3, i2, 0));
    }

    public void setItemMinimumHeight(@C0144Px int i) {
        if (this.f49789V != i) {
            this.f49789V = i;
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f49790W;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }
}
