package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* renamed from: V */
    private final int f48774V;

    /* renamed from: W */
    private final int f48775W;

    /* renamed from: a0 */
    private final int f48776a0;

    /* renamed from: b0 */
    private final int f48777b0;

    /* renamed from: c0 */
    private boolean f48778c0;

    /* renamed from: d0 */
    private int[] f48779d0 = new int[5];

    public BottomNavigationMenuView(@NonNull Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f48774V = resources.getDimensionPixelSize(C10462R.dimen.design_bottom_navigation_item_max_width);
        this.f48775W = resources.getDimensionPixelSize(C10462R.dimen.design_bottom_navigation_item_min_width);
        this.f48776a0 = resources.getDimensionPixelSize(C10462R.dimen.design_bottom_navigation_active_item_max_width);
        this.f48777b0 = resources.getDimensionPixelSize(C10462R.dimen.design_bottom_navigation_active_item_min_width);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public NavigationBarItemView mo56920f(@NonNull Context context) {
        return new BottomNavigationItemView(context);
    }

    /* renamed from: l */
    public boolean mo56921l() {
        return this.f48778c0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (ViewCompat.getLayoutDirection(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MenuBuilder menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.getVisibleItems().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, BasicMeasure.EXACTLY);
        if (!mo58283g(getLabelVisibilityMode(), size2) || !mo56921l()) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f48776a0);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f48779d0;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f48779d0[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i5 = this.f48777b0;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f48776a0, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f48775W * i6), Math.min(i5, this.f48776a0));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f48774V);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f48779d0[i9] = i9 == getSelectedItemPosition() ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f48779d0;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f48779d0[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f48779d0[i11], BasicMeasure.EXACTLY), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, BasicMeasure.EXACTLY), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f48778c0 = z;
    }
}