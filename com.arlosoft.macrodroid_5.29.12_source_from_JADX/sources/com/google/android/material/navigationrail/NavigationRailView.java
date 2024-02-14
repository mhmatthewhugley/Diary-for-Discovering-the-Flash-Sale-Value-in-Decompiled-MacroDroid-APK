package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0144Px;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.C10462R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationRailView extends NavigationBarView {

    /* renamed from: s */
    private final int f49791s;
    @Nullable

    /* renamed from: z */
    private View f49792z;

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C10462R.attr.navigationRailStyle);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    /* renamed from: h */
    private void m68936h() {
        ViewUtils.m68836c(this, new ViewUtils.OnApplyWindowInsetsListener() {
            @NonNull
            /* renamed from: a */
            public WindowInsetsCompat mo56883a(View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull ViewUtils.RelativePadding relativePadding) {
                relativePadding.f49682b += windowInsetsCompat.getSystemWindowInsetTop();
                relativePadding.f49684d += windowInsetsCompat.getSystemWindowInsetBottom();
                boolean z = true;
                if (ViewCompat.getLayoutDirection(view) != 1) {
                    z = false;
                }
                int systemWindowInsetLeft = windowInsetsCompat.getSystemWindowInsetLeft();
                int systemWindowInsetRight = windowInsetsCompat.getSystemWindowInsetRight();
                int i = relativePadding.f49681a;
                if (z) {
                    systemWindowInsetLeft = systemWindowInsetRight;
                }
                relativePadding.f49681a = i + systemWindowInsetLeft;
                relativePadding.mo58241a(view);
                return windowInsetsCompat;
            }
        });
    }

    /* renamed from: j */
    private boolean m68937j() {
        View view = this.f49792z;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: k */
    private int m68938k(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), BasicMeasure.EXACTLY);
    }

    /* renamed from: f */
    public void mo58452f(@LayoutRes int i) {
        mo58453g(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    /* renamed from: g */
    public void mo58453g(@NonNull View view) {
        mo58458l();
        this.f49792z = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f49791s;
        addView(view, 0, layoutParams);
    }

    @Nullable
    public View getHeaderView() {
        return this.f49792z;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* access modifiers changed from: protected */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: i */
    public NavigationRailMenuView mo56925d(@NonNull Context context) {
        return new NavigationRailMenuView(context);
    }

    /* renamed from: l */
    public void mo58458l() {
        View view = this.f49792z;
        if (view != null) {
            removeView(view);
            this.f49792z = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (m68937j()) {
            int bottom = this.f49792z.getBottom() + this.f49791s;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.mo58447l()) {
            i5 = this.f49791s;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int k = m68938k(i);
        super.onMeasure(k, i2);
        if (m68937j()) {
            measureChild(getNavigationRailMenuView(), k, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f49792z.getMeasuredHeight()) - this.f49791s, Integer.MIN_VALUE));
        }
    }

    public void setItemMinimumHeight(@C0144Px int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C10462R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f49791s = getResources().getDimensionPixelSize(C10462R.dimen.mtrl_navigation_rail_margin);
        TintTypedArray i3 = ThemeEnforcement.m68823i(getContext(), attributeSet, C10462R.styleable.NavigationRailView, i, i2, new int[0]);
        int resourceId = i3.getResourceId(C10462R.styleable.NavigationRailView_headerLayout, 0);
        if (resourceId != 0) {
            mo58452f(resourceId);
        }
        setMenuGravity(i3.getInt(C10462R.styleable.NavigationRailView_menuGravity, 49));
        int i4 = C10462R.styleable.NavigationRailView_itemMinHeight;
        if (i3.hasValue(i4)) {
            setItemMinimumHeight(i3.getDimensionPixelSize(i4, -1));
        }
        i3.recycle();
        m68936h();
    }
}
