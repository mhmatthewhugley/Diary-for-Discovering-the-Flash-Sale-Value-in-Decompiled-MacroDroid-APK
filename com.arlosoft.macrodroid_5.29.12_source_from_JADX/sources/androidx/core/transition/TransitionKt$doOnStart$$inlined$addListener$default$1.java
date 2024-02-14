package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n¸\u0006\u0000"}, mo71668d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lja/u;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Transition.kt */
public final class TransitionKt$doOnStart$$inlined$addListener$default$1 implements Transition.TransitionListener {
    final /* synthetic */ C16265l $onStart;

    public TransitionKt$doOnStart$$inlined$addListener$default$1(C16265l lVar) {
        this.$onStart = lVar;
    }

    public void onTransitionCancel(Transition transition) {
        C13706o.m87929f(transition, "transition");
    }

    public void onTransitionEnd(Transition transition) {
        C13706o.m87929f(transition, "transition");
    }

    public void onTransitionPause(Transition transition) {
        C13706o.m87929f(transition, "transition");
    }

    public void onTransitionResume(Transition transition) {
        C13706o.m87929f(transition, "transition");
    }

    public void onTransitionStart(Transition transition) {
        C13706o.m87929f(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
