package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;

class TabIndicatorInterpolator {
    TabIndicatorInterpolator() {
    }

    /* renamed from: a */
    static RectF m69630a(TabLayout tabLayout, @Nullable View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.mo59046y() || !(view instanceof TabLayout.TabView)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        return m69631b((TabLayout.TabView) view, 24);
    }

    /* renamed from: b */
    static RectF m69631b(@NonNull TabLayout.TabView tabView, @Dimension(unit = 0) int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int d = (int) ViewUtils.m68837d(tabView.getContext(), i);
        if (contentWidth < d) {
            contentWidth = d;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo58979c(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f, @NonNull Drawable drawable) {
        RectF a = m69630a(tabLayout, view);
        RectF a2 = m69630a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.m67222c((int) a.left, (int) a2.left, f), drawable.getBounds().top, AnimationUtils.m67222c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo58980d(TabLayout tabLayout, View view, @NonNull Drawable drawable) {
        RectF a = m69630a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }
}
