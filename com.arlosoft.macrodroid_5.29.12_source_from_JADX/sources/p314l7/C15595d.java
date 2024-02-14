package p314l7;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: l7.d */
/* compiled from: ViewPropertyAnimatorICS */
class C15595d extends C15589b {

    /* renamed from: b */
    private final WeakReference<ViewPropertyAnimator> f64847b;

    C15595d(View view) {
        this.f64847b = new WeakReference<>(view.animate());
    }

    /* renamed from: b */
    public C15589b mo74936b(long j) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.f64847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j);
        }
        return this;
    }

    /* renamed from: c */
    public C15589b mo74937c(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.f64847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: d */
    public C15589b mo74938d(float f) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) this.f64847b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f);
        }
        return this;
    }
}
