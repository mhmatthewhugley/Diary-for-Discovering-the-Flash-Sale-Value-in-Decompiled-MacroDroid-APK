package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.j */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0507j implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewPropertyAnimatorUpdateListener f513a;

    /* renamed from: b */
    public final /* synthetic */ View f514b;

    public /* synthetic */ C0507j(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
        this.f513a = viewPropertyAnimatorUpdateListener;
        this.f514b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f513a.onAnimationUpdate(this.f514b);
    }
}
