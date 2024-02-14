package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;

class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    ElasticTabIndicatorInterpolator() {
    }

    /* renamed from: e */
    private static float m69627e(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m69628f(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo58979c(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float f2;
        float f3;
        RectF a = TabIndicatorInterpolator.m69630a(tabLayout, view);
        RectF a2 = TabIndicatorInterpolator.m69630a(tabLayout, view2);
        if (a.left < a2.left) {
            f3 = m69627e(f);
            f2 = m69628f(f);
        } else {
            f3 = m69628f(f);
            f2 = m69627e(f);
        }
        drawable.setBounds(AnimationUtils.m67222c((int) a.left, (int) a2.left, f3), drawable.getBounds().top, AnimationUtils.m67222c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
