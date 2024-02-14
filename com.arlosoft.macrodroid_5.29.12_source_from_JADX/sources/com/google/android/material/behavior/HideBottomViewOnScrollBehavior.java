package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private int f48698a = 0;

    /* renamed from: b */
    private int f48699b = 2;

    /* renamed from: c */
    private int f48700c = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public ViewPropertyAnimator f48701d;

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: b */
    private void m67492b(@NonNull V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f48701d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f48701d = null;
            }
        });
    }

    /* renamed from: c */
    public boolean mo56841c() {
        return this.f48699b == 1;
    }

    /* renamed from: d */
    public boolean mo56842d() {
        return this.f48699b == 2;
    }

    /* renamed from: e */
    public void mo56843e(@NonNull V v, @Dimension int i) {
        this.f48700c = i;
        if (this.f48699b == 1) {
            v.setTranslationY((float) (this.f48698a + i));
        }
    }

    /* renamed from: f */
    public void mo56844f(@NonNull V v) {
        mo56845g(v, true);
    }

    /* renamed from: g */
    public void mo56845g(@NonNull V v, boolean z) {
        if (!mo56841c()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f48701d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f48699b = 1;
            int i = this.f48698a + this.f48700c;
            if (z) {
                m67492b(v, i, 175, AnimationUtils.f48523c);
                return;
            }
            v.setTranslationY((float) i);
        }
    }

    /* renamed from: h */
    public void mo56846h(@NonNull V v) {
        mo56847i(v, true);
    }

    /* renamed from: i */
    public void mo56847i(@NonNull V v, boolean z) {
        if (!mo56842d()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f48701d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f48699b = 2;
            if (z) {
                m67492b(v, 0, 225, AnimationUtils.f48524d);
                return;
            }
            v.setTranslationY((float) 0);
        }
    }

    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.f48698a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i2 > 0) {
            mo56844f(v);
        } else if (i2 < 0) {
            mo56846h(v);
        }
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
