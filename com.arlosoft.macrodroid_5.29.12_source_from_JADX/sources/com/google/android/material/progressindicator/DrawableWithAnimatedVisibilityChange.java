package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;

abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {

    /* renamed from: F */
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> f49848F = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") {
        /* renamed from: a */
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.mo58555g());
        }

        /* renamed from: b */
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
            drawableWithAnimatedVisibilityChange.mo58556l(f.floatValue());
        }
    };

    /* renamed from: A */
    private Animatable2Compat.AnimationCallback f49849A;

    /* renamed from: B */
    private boolean f49850B;

    /* renamed from: C */
    private float f49851C;

    /* renamed from: D */
    final Paint f49852D = new Paint();

    /* renamed from: E */
    private int f49853E;

    /* renamed from: a */
    final Context f49854a;

    /* renamed from: c */
    final BaseProgressIndicatorSpec f49855c;

    /* renamed from: d */
    AnimatorDurationScaleProvider f49856d;

    /* renamed from: f */
    private ValueAnimator f49857f;

    /* renamed from: g */
    private ValueAnimator f49858g;

    /* renamed from: o */
    private boolean f49859o;

    /* renamed from: p */
    private boolean f49860p;

    /* renamed from: s */
    private float f49861s;

    /* renamed from: z */
    private List<Animatable2Compat.AnimationCallback> f49862z;

    DrawableWithAnimatedVisibilityChange(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f49854a = context;
        this.f49855c = baseProgressIndicatorSpec;
        this.f49856d = new AnimatorDurationScaleProvider();
        setAlpha(255);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m69022d() {
        Animatable2Compat.AnimationCallback animationCallback = this.f49849A;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f49862z;
        if (list != null && !this.f49850B) {
            for (Animatable2Compat.AnimationCallback onAnimationEnd : list) {
                onAnimationEnd.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m69023e() {
        Animatable2Compat.AnimationCallback animationCallback = this.f49849A;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f49862z;
        if (list != null && !this.f49850B) {
            for (Animatable2Compat.AnimationCallback onAnimationStart : list) {
                onAnimationStart.onAnimationStart(this);
            }
        }
    }

    /* renamed from: f */
    private void m69024f(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z = this.f49850B;
        this.f49850B = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.f49850B = z;
    }

    /* renamed from: k */
    private void m69025k() {
        if (this.f49857f == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f49848F, new float[]{0.0f, 1.0f});
            this.f49857f = ofFloat;
            ofFloat.setDuration(500);
            this.f49857f.setInterpolator(AnimationUtils.f48522b);
            m69027n(this.f49857f);
        }
        if (this.f49858g == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f49848F, new float[]{1.0f, 0.0f});
            this.f49858g = ofFloat2;
            ofFloat2.setDuration(500);
            this.f49858g.setInterpolator(AnimationUtils.f48522b);
            m69026m(this.f49858g);
        }
    }

    /* renamed from: m */
    private void m69026m(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f49858g;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f49858g = valueAnimator;
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    boolean unused = DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                    DrawableWithAnimatedVisibilityChange.this.m69022d();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: n */
    private void m69027n(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f49857f;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f49857f = valueAnimator;
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    DrawableWithAnimatedVisibilityChange.this.m69023e();
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    public void clearAnimationCallbacks() {
        this.f49862z.clear();
        this.f49862z = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo58555g() {
        if (!this.f49855c.mo58500b() && !this.f49855c.mo58499a()) {
            return 1.0f;
        }
        if (this.f49860p || this.f49859o) {
            return this.f49861s;
        }
        return this.f49851C;
    }

    public int getAlpha() {
        return this.f49853E;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean mo58537h() {
        return mo58542o(false, false, false);
    }

    /* renamed from: i */
    public boolean mo58538i() {
        ValueAnimator valueAnimator = this.f49858g;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f49860p;
    }

    public boolean isRunning() {
        return mo58540j() || mo58538i();
    }

    /* renamed from: j */
    public boolean mo58540j() {
        ValueAnimator valueAnimator = this.f49857f;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f49859o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo58556l(@FloatRange(from = 0.0d, mo592to = 1.0d) float f) {
        if (this.f49851C != f) {
            this.f49851C = f;
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public boolean mo58542o(boolean z, boolean z2, boolean z3) {
        return mo58544p(z, z2, z3 && this.f49856d.mo58463a(this.f49854a.getContentResolver()) > 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo58544p(boolean z, boolean z2, boolean z3) {
        m69025k();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f49857f : this.f49858g;
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m69024f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            boolean z4 = !z || super.setVisible(z, false);
            if (!(z ? this.f49855c.mo58500b() : this.f49855c.mo58499a())) {
                m69024f(valueAnimator);
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f49862z == null) {
            this.f49862z = new ArrayList();
        }
        if (!this.f49862z.contains(animationCallback)) {
            this.f49862z.add(animationCallback);
        }
    }

    public void setAlpha(int i) {
        this.f49853E = i;
        invalidateSelf();
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f49852D.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return mo58542o(z, z2, true);
    }

    public void start() {
        mo58544p(true, true, false);
    }

    public void stop() {
        mo58544p(false, true, false);
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f49862z;
        if (list == null || !list.contains(animationCallback)) {
            return false;
        }
        this.f49862z.remove(animationCallback);
        if (!this.f49862z.isEmpty()) {
            return true;
        }
        this.f49862z = null;
        return true;
    }
}
