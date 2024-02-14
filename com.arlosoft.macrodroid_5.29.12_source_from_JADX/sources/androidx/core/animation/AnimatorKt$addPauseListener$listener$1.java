package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo71668d2 = {"androidx/core/animation/AnimatorKt$addPauseListener$listener$1", "Landroid/animation/Animator$AnimatorPauseListener;", "Landroid/animation/Animator;", "animator", "Lja/u;", "onAnimationPause", "onAnimationResume", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Animator.kt */
public final class AnimatorKt$addPauseListener$listener$1 implements Animator.AnimatorPauseListener {
    final /* synthetic */ C16265l<Animator, C13339u> $onPause;
    final /* synthetic */ C16265l<Animator, C13339u> $onResume;

    AnimatorKt$addPauseListener$listener$1(C16265l<? super Animator, C13339u> lVar, C16265l<? super Animator, C13339u> lVar2) {
        this.$onPause = lVar;
        this.$onResume = lVar2;
    }

    public void onAnimationPause(Animator animator) {
        C13706o.m87929f(animator, "animator");
        this.$onPause.invoke(animator);
    }

    public void onAnimationResume(Animator animator) {
        C13706o.m87929f(animator, "animator");
        this.$onResume.invoke(animator);
    }
}
