package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import java.util.Arrays;

final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: j */
    private static final Property<LinearIndeterminateContiguousAnimatorDelegate, Float> f49875j = new Property<LinearIndeterminateContiguousAnimatorDelegate, Float>(Float.class, "animationFraction") {
        /* renamed from: a */
        public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.m69073n());
        }

        /* renamed from: b */
        public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f) {
            linearIndeterminateContiguousAnimatorDelegate.mo58575r(f.floatValue());
        }
    };

    /* renamed from: d */
    private ObjectAnimator f49876d;

    /* renamed from: e */
    private FastOutSlowInInterpolator f49877e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final BaseProgressIndicatorSpec f49878f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f49879g = 1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f49880h;

    /* renamed from: i */
    private float f49881i;

    public LinearIndeterminateContiguousAnimatorDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f49878f = linearProgressIndicatorSpec;
        this.f49877e = new FastOutSlowInInterpolator();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public float m69073n() {
        return this.f49881i;
    }

    /* renamed from: o */
    private void m69074o() {
        if (this.f49876d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f49875j, new float[]{0.0f, 1.0f});
            this.f49876d = ofFloat;
            ofFloat.setDuration(333);
            this.f49876d.setInterpolator((TimeInterpolator) null);
            this.f49876d.setRepeatCount(-1);
            this.f49876d.addListener(new AnimatorListenerAdapter() {
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    int unused = linearIndeterminateContiguousAnimatorDelegate.f49879g = (linearIndeterminateContiguousAnimatorDelegate.f49879g + 1) % LinearIndeterminateContiguousAnimatorDelegate.this.f49878f.f49815c.length;
                    boolean unused2 = LinearIndeterminateContiguousAnimatorDelegate.this.f49880h = true;
                }
            });
        }
    }

    /* renamed from: p */
    private void m69075p() {
        if (this.f49880h && this.f49868b[3] < 1.0f) {
            int[] iArr = this.f49869c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = MaterialColors.m68101a(this.f49878f.f49815c[this.f49879g], this.f49867a.getAlpha());
            this.f49880h = false;
        }
    }

    /* renamed from: s */
    private void m69076s(int i) {
        this.f49868b[0] = 0.0f;
        float b = mo58565b(i, 0, 667);
        float[] fArr = this.f49868b;
        float interpolation = this.f49877e.getInterpolation(b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f49868b;
        float interpolation2 = this.f49877e.getInterpolation(b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f49868b[5] = 1.0f;
    }

    /* renamed from: a */
    public void mo58507a() {
        ObjectAnimator objectAnimator = this.f49876d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo58508c() {
        mo58574q();
    }

    /* renamed from: d */
    public void mo58509d(@Nullable Animatable2Compat.AnimationCallback animationCallback) {
    }

    /* renamed from: f */
    public void mo58510f() {
    }

    /* renamed from: g */
    public void mo58511g() {
        m69074o();
        mo58574q();
        this.f49876d.start();
    }

    /* renamed from: h */
    public void mo58512h() {
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: q */
    public void mo58574q() {
        this.f49880h = true;
        this.f49879g = 1;
        Arrays.fill(this.f49869c, MaterialColors.m68101a(this.f49878f.f49815c[0], this.f49867a.getAlpha()));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: r */
    public void mo58575r(float f) {
        this.f49881i = f;
        m69076s((int) (f * 333.0f));
        m69075p();
        this.f49867a.invalidateSelf();
    }
}
