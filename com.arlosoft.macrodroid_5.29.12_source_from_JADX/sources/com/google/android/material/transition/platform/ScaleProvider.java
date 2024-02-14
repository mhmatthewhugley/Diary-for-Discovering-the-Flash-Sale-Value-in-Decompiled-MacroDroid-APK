package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private float f51071a;

    /* renamed from: b */
    private float f51072b;

    /* renamed from: c */
    private float f51073c;

    /* renamed from: d */
    private float f51074d;

    /* renamed from: e */
    private boolean f51075e;

    /* renamed from: f */
    private boolean f51076f;

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: c */
    private static Animator m70353c(final View view, float f, float f2) {
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
    public Animator mo59482a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f51076f) {
            return null;
        }
        if (this.f51075e) {
            return m70353c(view, this.f51071a, this.f51072b);
        }
        return m70353c(view, this.f51074d, this.f51073c);
    }

    @Nullable
    /* renamed from: b */
    public Animator mo59483b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f51075e) {
            return m70353c(view, this.f51073c, this.f51074d);
        }
        return m70353c(view, this.f51072b, this.f51071a);
    }

    /* renamed from: d */
    public void mo59526d(float f) {
        this.f51073c = f;
    }

    /* renamed from: e */
    public void mo59527e(boolean z) {
        this.f51076f = z;
    }

    public ScaleProvider(boolean z) {
        this.f51071a = 1.0f;
        this.f51072b = 1.1f;
        this.f51073c = 0.8f;
        this.f51074d = 1.0f;
        this.f51076f = true;
        this.f51075e = z;
    }
}
