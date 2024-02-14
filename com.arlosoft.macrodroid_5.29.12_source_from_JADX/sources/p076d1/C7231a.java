package p076d1;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import kotlin.jvm.internal.C13706o;

/* renamed from: d1.a */
/* compiled from: AnimationUtils.kt */
public final class C7231a {

    /* renamed from: a */
    public static final C7231a f17609a = new C7231a();

    private C7231a() {
    }

    /* renamed from: a */
    public final Animation mo37063a(int i, int i2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset((long) i);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration((long) i2);
        return alphaAnimation;
    }

    /* renamed from: b */
    public final Animation mo37064b(int i, int i2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setStartOffset((long) i);
        scaleAnimation.setDuration((long) i2);
        return scaleAnimation;
    }

    /* renamed from: c */
    public final View mo37065c(View view, Animation animation) {
        C13706o.m87929f(view, "view");
        C13706o.m87929f(animation, "animation");
        view.startAnimation(animation);
        return view;
    }
}
