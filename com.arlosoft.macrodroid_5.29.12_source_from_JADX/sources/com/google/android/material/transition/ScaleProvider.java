package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private float f50907a;

    /* renamed from: b */
    private float f50908b;

    /* renamed from: c */
    private float f50909c;

    /* renamed from: d */
    private float f50910d;

    /* renamed from: e */
    private boolean f50911e;

    /* renamed from: f */
    private boolean f50912f;

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: c */
    private static Animator m70215c(final View view, float f, float f2) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Nullable
    /* renamed from: a */
    public Animator mo59450a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f50912f) {
            return null;
        }
        if (this.f50911e) {
            return m70215c(view, this.f50907a, this.f50908b);
        }
        return m70215c(view, this.f50910d, this.f50909c);
    }

    @Nullable
    /* renamed from: b */
    public Animator mo59451b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f50911e) {
            return m70215c(view, this.f50909c, this.f50910d);
        }
        return m70215c(view, this.f50908b, this.f50907a);
    }

    /* renamed from: d */
    public void mo59475d(float f) {
        this.f50909c = f;
    }

    /* renamed from: e */
    public void mo59476e(boolean z) {
        this.f50912f = z;
    }

    public ScaleProvider(boolean z) {
        this.f50907a = 1.0f;
        this.f50908b = 1.1f;
        this.f50909c = 0.8f;
        this.f50910d = 1.0f;
        this.f50912f = true;
        this.f50911e = z;
    }
}
