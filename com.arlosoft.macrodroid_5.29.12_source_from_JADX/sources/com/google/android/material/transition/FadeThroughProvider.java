package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class FadeThroughProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private float f50792a = 0.35f;

    /* renamed from: c */
    private static Animator m70142c(final View view, float f, float f2, @FloatRange(from = 0.0d, mo592to = 1.0d) float f3, @FloatRange(from = 0.0d, mo592to = 1.0d) float f4, final float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        final View view2 = view;
        final float f6 = f;
        final float f7 = f2;
        final float f8 = f3;
        final float f9 = f4;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view2.setAlpha(TransitionUtils.m70238k(f6, f7, f8, f9, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setAlpha(f5);
            }
        });
        return ofFloat;
    }

    @Nullable
    /* renamed from: a */
    public Animator mo59450a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m70142c(view, alpha, 0.0f, 0.0f, this.f50792a, alpha);
    }

    @Nullable
    /* renamed from: b */
    public Animator mo59451b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return m70142c(view, 0.0f, alpha, this.f50792a, 1.0f, alpha);
    }
}
