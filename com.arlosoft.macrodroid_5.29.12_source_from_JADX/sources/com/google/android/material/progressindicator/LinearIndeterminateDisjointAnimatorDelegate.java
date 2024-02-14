package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.C10462R;
import com.google.android.material.color.MaterialColors;
import java.util.Arrays;

final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f49883l = {533, 567, 850, 750};

    /* renamed from: m */
    private static final int[] f49884m = {1267, 1000, 333, 0};

    /* renamed from: n */
    private static final Property<LinearIndeterminateDisjointAnimatorDelegate, Float> f49885n = new Property<LinearIndeterminateDisjointAnimatorDelegate, Float>(Float.class, "animationFraction") {
        /* renamed from: a */
        public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.m69092n());
        }

        /* renamed from: b */
        public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f) {
            linearIndeterminateDisjointAnimatorDelegate.mo58582r(f.floatValue());
        }
    };

    /* renamed from: d */
    private ObjectAnimator f49886d;

    /* renamed from: e */
    private ObjectAnimator f49887e;

    /* renamed from: f */
    private final Interpolator[] f49888f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BaseProgressIndicatorSpec f49889g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f49890h = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f49891i;

    /* renamed from: j */
    private float f49892j;

    /* renamed from: k */
    Animatable2Compat.AnimationCallback f49893k = null;

    public LinearIndeterminateDisjointAnimatorDelegate(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f49889g = linearProgressIndicatorSpec;
        this.f49888f = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, C10462R.animator.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, C10462R.animator.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, C10462R.animator.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, C10462R.animator.linear_indeterminate_line2_tail_interpolator)};
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public float m69092n() {
        return this.f49892j;
    }

    /* renamed from: o */
    private void m69093o() {
        if (this.f49886d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f49885n, new float[]{0.0f, 1.0f});
            this.f49886d = ofFloat;
            ofFloat.setDuration(1800);
            this.f49886d.setInterpolator((TimeInterpolator) null);
            this.f49886d.setRepeatCount(-1);
            this.f49886d.addListener(new AnimatorListenerAdapter() {
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    int unused = linearIndeterminateDisjointAnimatorDelegate.f49890h = (linearIndeterminateDisjointAnimatorDelegate.f49890h + 1) % LinearIndeterminateDisjointAnimatorDelegate.this.f49889g.f49815c.length;
                    boolean unused2 = LinearIndeterminateDisjointAnimatorDelegate.this.f49891i = true;
                }
            });
        }
        if (this.f49887e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f49885n, new float[]{1.0f});
            this.f49887e = ofFloat2;
            ofFloat2.setDuration(1800);
            this.f49887e.setInterpolator((TimeInterpolator) null);
            this.f49887e.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate.this.mo58507a();
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = linearIndeterminateDisjointAnimatorDelegate.f49893k;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(linearIndeterminateDisjointAnimatorDelegate.f49867a);
                    }
                }
            });
        }
    }

    /* renamed from: p */
    private void m69094p() {
        if (this.f49891i) {
            Arrays.fill(this.f49869c, MaterialColors.m68101a(this.f49889g.f49815c[this.f49890h], this.f49867a.getAlpha()));
            this.f49891i = false;
        }
    }

    /* renamed from: s */
    private void m69095s(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f49868b[i2] = Math.max(0.0f, Math.min(1.0f, this.f49888f[i2].getInterpolation(mo58565b(i, f49884m[i2], f49883l[i2]))));
        }
    }

    /* renamed from: a */
    public void mo58507a() {
        ObjectAnimator objectAnimator = this.f49886d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo58508c() {
        mo58581q();
    }

    /* renamed from: d */
    public void mo58509d(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f49893k = animationCallback;
    }

    /* renamed from: f */
    public void mo58510f() {
        ObjectAnimator objectAnimator = this.f49887e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            mo58507a();
            if (this.f49867a.isVisible()) {
                this.f49887e.setFloatValues(new float[]{this.f49892j, 1.0f});
                this.f49887e.setDuration((long) ((1.0f - this.f49892j) * 1800.0f));
                this.f49887e.start();
            }
        }
    }

    /* renamed from: g */
    public void mo58511g() {
        m69093o();
        mo58581q();
        this.f49886d.start();
    }

    /* renamed from: h */
    public void mo58512h() {
        this.f49893k = null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: q */
    public void mo58581q() {
        this.f49890h = 0;
        int a = MaterialColors.m68101a(this.f49889g.f49815c[0], this.f49867a.getAlpha());
        int[] iArr = this.f49869c;
        iArr[0] = a;
        iArr[1] = a;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: r */
    public void mo58582r(float f) {
        this.f49892j = f;
        m69095s((int) (f * 1800.0f));
        m69094p();
        this.f49867a.invalidateSelf();
    }
}
