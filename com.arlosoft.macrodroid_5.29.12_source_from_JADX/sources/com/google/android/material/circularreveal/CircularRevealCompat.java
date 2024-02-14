package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.NonNull;
import com.google.android.material.circularreveal.CircularRevealWidget;

public final class CircularRevealCompat {
    private CircularRevealCompat() {
    }

    @NonNull
    /* renamed from: a */
    public static Animator m68039a(@NonNull CircularRevealWidget circularRevealWidget, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(circularRevealWidget, CircularRevealWidget.CircularRevealProperty.f49085a, CircularRevealWidget.CircularRevealEvaluator.f49083b, new CircularRevealWidget.RevealInfo[]{new CircularRevealWidget.RevealInfo(f, f2, f3)});
        CircularRevealWidget.RevealInfo revealInfo = circularRevealWidget.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f, (int) f2, revealInfo.f49089c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @NonNull
    /* renamed from: b */
    public static Animator.AnimatorListener m68040b(@NonNull final CircularRevealWidget circularRevealWidget) {
        return new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                circularRevealWidget.mo57487b();
            }

            public void onAnimationStart(Animator animator) {
                circularRevealWidget.mo57486a();
            }
        };
    }
}
