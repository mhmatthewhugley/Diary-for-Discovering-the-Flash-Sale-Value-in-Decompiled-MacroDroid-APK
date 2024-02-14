package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: b */
    public AnimatorSet f50750b;

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: d */
    public boolean mo59436d(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f50750b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet f = mo59438f(view, view2, z, z3);
        this.f50750b = f;
        f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                AnimatorSet unused = ExpandableTransformationBehavior.this.f50750b = null;
            }
        });
        this.f50750b.start();
        if (!z2) {
            this.f50750b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public abstract AnimatorSet mo59438f(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
