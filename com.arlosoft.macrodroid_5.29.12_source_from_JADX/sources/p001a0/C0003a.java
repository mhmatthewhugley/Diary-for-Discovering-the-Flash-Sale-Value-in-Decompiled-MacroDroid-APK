package p001a0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: a0.a */
/* compiled from: BaseLottieAnimator */
public abstract class C0003a extends ValueAnimator {

    /* renamed from: a */
    private final Set<ValueAnimator.AnimatorUpdateListener> f14a = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final Set<Animator.AnimatorListener> f15c = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13a() {
        for (Animator.AnimatorListener onAnimationCancel : this.f15c) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f15c.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14a.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16b(boolean z) {
        for (Animator.AnimatorListener next : this.f15c) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17c() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f15c) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo18d(boolean z) {
        for (Animator.AnimatorListener next : this.f15c) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo19e() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f14a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f15c.clear();
    }

    public void removeAllUpdateListeners() {
        this.f14a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f15c.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
