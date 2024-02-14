package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, mo71668d2 = {"androidx/core/transition/TransitionKt$addListener$listener$1", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "Lja/u;", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Transition.kt */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ C16265l<Transition, C13339u> $onCancel;
    final /* synthetic */ C16265l<Transition, C13339u> $onEnd;
    final /* synthetic */ C16265l<Transition, C13339u> $onPause;
    final /* synthetic */ C16265l<Transition, C13339u> $onResume;
    final /* synthetic */ C16265l<Transition, C13339u> $onStart;

    public TransitionKt$addListener$listener$1(C16265l<? super Transition, C13339u> lVar, C16265l<? super Transition, C13339u> lVar2, C16265l<? super Transition, C13339u> lVar3, C16265l<? super Transition, C13339u> lVar4, C16265l<? super Transition, C13339u> lVar5) {
        this.$onEnd = lVar;
        this.$onResume = lVar2;
        this.$onPause = lVar3;
        this.$onCancel = lVar4;
        this.$onStart = lVar5;
    }

    public void onTransitionCancel(Transition transition) {
        C13706o.m87929f(transition, "transition");
        this.$onCancel.invoke(transition);
    }

    public void onTransitionEnd(Transition transition) {
        C13706o.m87929f(transition, "transition");
        this.$onEnd.invoke(transition);
    }

    public void onTransitionPause(Transition transition) {
        C13706o.m87929f(transition, "transition");
        this.$onPause.invoke(transition);
    }

    public void onTransitionResume(Transition transition) {
        C13706o.m87929f(transition, "transition");
        this.$onResume.invoke(transition);
    }

    public void onTransitionStart(Transition transition) {
        C13706o.m87929f(transition, "transition");
        this.$onStart.invoke(transition);
    }
}
