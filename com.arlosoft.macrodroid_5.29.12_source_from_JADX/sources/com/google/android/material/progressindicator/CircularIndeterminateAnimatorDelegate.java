package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.color.MaterialColors;

final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f49823l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f49824m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f49825n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> f49826o;

    /* renamed from: p */
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> f49827p;

    /* renamed from: d */
    private ObjectAnimator f49828d;

    /* renamed from: e */
    private ObjectAnimator f49829e;

    /* renamed from: f */
    private final FastOutSlowInInterpolator f49830f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final BaseProgressIndicatorSpec f49831g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f49832h = 0;

    /* renamed from: i */
    private float f49833i;

    /* renamed from: j */
    private float f49834j;

    /* renamed from: k */
    Animatable2Compat.AnimationCallback f49835k = null;

    static {
        Class<Float> cls = Float.class;
        f49826o = new Property<CircularIndeterminateAnimatorDelegate, Float>(cls, "animationFraction") {
            /* renamed from: a */
            public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAnimatorDelegate.m68981o());
            }

            /* renamed from: b */
            public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
                circularIndeterminateAnimatorDelegate.mo58514t(f.floatValue());
            }
        };
        f49827p = new Property<CircularIndeterminateAnimatorDelegate, Float>(cls, "completeEndFraction") {
            /* renamed from: a */
            public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
                return Float.valueOf(circularIndeterminateAnimatorDelegate.m68982p());
            }

            /* renamed from: b */
            public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
                circularIndeterminateAnimatorDelegate.m68985u(f.floatValue());
            }
        };
    }

    public CircularIndeterminateAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f49831g = circularProgressIndicatorSpec;
        this.f49830f = new FastOutSlowInInterpolator();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public float m68981o() {
        return this.f49833i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public float m68982p() {
        return this.f49834j;
    }

    /* renamed from: q */
    private void m68983q() {
        if (this.f49828d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f49826o, new float[]{0.0f, 1.0f});
            this.f49828d = ofFloat;
            ofFloat.setDuration(5400);
            this.f49828d.setInterpolator((TimeInterpolator) null);
            this.f49828d.setRepeatCount(-1);
            this.f49828d.addListener(new AnimatorListenerAdapter() {
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    int unused = circularIndeterminateAnimatorDelegate.f49832h = (circularIndeterminateAnimatorDelegate.f49832h + 4) % CircularIndeterminateAnimatorDelegate.this.f49831g.f49815c.length;
                }
            });
        }
        if (this.f49829e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f49827p, new float[]{0.0f, 1.0f});
            this.f49829e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f49829e.setInterpolator(this.f49830f);
            this.f49829e.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAnimatorDelegate.this.mo58507a();
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAnimatorDelegate.f49835k;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(circularIndeterminateAnimatorDelegate.f49867a);
                    }
                }
            });
        }
    }

    /* renamed from: r */
    private void m68984r(int i) {
        int i2 = 0;
        while (i2 < 4) {
            float b = mo58565b(i, f49825n[i2], 333);
            if (b < 0.0f || b > 1.0f) {
                i2++;
            } else {
                int i3 = i2 + this.f49832h;
                int[] iArr = this.f49831g.f49815c;
                int length = i3 % iArr.length;
                int a = MaterialColors.m68101a(iArr[length], this.f49867a.getAlpha());
                int a2 = MaterialColors.m68101a(this.f49831g.f49815c[(length + 1) % iArr.length], this.f49867a.getAlpha());
                this.f49869c[0] = ArgbEvaluatorCompat.m67224b().evaluate(this.f49830f.getInterpolation(b), Integer.valueOf(a), Integer.valueOf(a2)).intValue();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m68985u(float f) {
        this.f49834j = f;
    }

    /* renamed from: v */
    private void m68986v(int i) {
        float[] fArr = this.f49868b;
        float f = this.f49833i;
        fArr[0] = (f * 1520.0f) - 0.21875f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = mo58565b(i, f49823l[i2], 667);
            float[] fArr2 = this.f49868b;
            fArr2[1] = fArr2[1] + (this.f49830f.getInterpolation(b) * 250.0f);
            float b2 = mo58565b(i, f49824m[i2], 667);
            float[] fArr3 = this.f49868b;
            fArr3[0] = fArr3[0] + (this.f49830f.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f49868b;
        fArr4[0] = fArr4[0] + ((fArr4[1] - fArr4[0]) * this.f49834j);
        fArr4[0] = fArr4[0] / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo58507a() {
        ObjectAnimator objectAnimator = this.f49828d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo58508c() {
        mo58513s();
    }

    /* renamed from: d */
    public void mo58509d(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f49835k = animationCallback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo58510f() {
        ObjectAnimator objectAnimator = this.f49829e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f49867a.isVisible()) {
                this.f49829e.start();
            } else {
                mo58507a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo58511g() {
        m68983q();
        mo58513s();
        this.f49828d.start();
    }

    /* renamed from: h */
    public void mo58512h() {
        this.f49835k = null;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: s */
    public void mo58513s() {
        this.f49832h = 0;
        this.f49869c[0] = MaterialColors.m68101a(this.f49831g.f49815c[0], this.f49867a.getAlpha());
        this.f49834j = 0.0f;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: t */
    public void mo58514t(float f) {
        this.f49833i = f;
        int i = (int) (f * 5400.0f);
        m68986v(i);
        m68984r(i);
        this.f49867a.invalidateSelf();
    }
}
