package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0144Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C10462R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RequiresApi(21)
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private int f51080a;
    @C0144Px

    /* renamed from: b */
    private int f51081b;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    /* renamed from: c */
    private static Animator m70358c(View view, View view2, int i, @C0144Px int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m70360e(view2, ((float) i2) + translationX, translationX, translationX);
        }
        if (i == 5) {
            return m70360e(view2, translationX - ((float) i2), translationX, translationX);
        }
        if (i == 48) {
            return m70361f(view2, translationY - ((float) i2), translationY, translationY);
        }
        if (i == 80) {
            return m70361f(view2, ((float) i2) + translationY, translationY, translationY);
        }
        if (i == 8388611) {
            return m70360e(view2, m70363h(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX, translationX);
        } else if (i == 8388613) {
            return m70360e(view2, m70363h(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: d */
    private static Animator m70359d(View view, View view2, int i, @C0144Px int i2) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i == 3) {
            return m70360e(view2, translationX, translationX - ((float) i2), translationX);
        }
        if (i == 5) {
            return m70360e(view2, translationX, ((float) i2) + translationX, translationX);
        }
        if (i == 48) {
            return m70361f(view2, translationY, ((float) i2) + translationY, translationY);
        }
        if (i == 80) {
            return m70361f(view2, translationY, translationY - ((float) i2), translationY);
        }
        if (i == 8388611) {
            return m70360e(view2, translationX, m70363h(view) ? translationX - ((float) i2) : ((float) i2) + translationX, translationX);
        } else if (i == 8388613) {
            return m70360e(view2, translationX, m70363h(view) ? ((float) i2) + translationX : translationX - ((float) i2), translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i);
        }
    }

    /* renamed from: e */
    private static Animator m70360e(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    /* renamed from: f */
    private static Animator m70361f(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    private int m70362g(Context context) {
        int i = this.f51081b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(C10462R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    /* renamed from: h */
    private static boolean m70363h(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    @Nullable
    /* renamed from: a */
    public Animator mo59482a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m70359d(viewGroup, view, this.f51080a, m70362g(view.getContext()));
    }

    @Nullable
    /* renamed from: b */
    public Animator mo59483b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m70358c(viewGroup, view, this.f51080a, m70362g(view.getContext()));
    }
}
