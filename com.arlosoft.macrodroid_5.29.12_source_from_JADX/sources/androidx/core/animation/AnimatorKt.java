package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a&\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a \u0010\n\u001a\u00020\t*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001a \u0010\u000b\u001a\u00020\t*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u001ah\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a8\u0010\u0013\u001a\u00020\t*\u00020\u00002\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, mo71668d2 = {"Landroid/animation/Animator;", "Lkotlin/Function1;", "Lja/u;", "action", "Landroid/animation/Animator$AnimatorListener;", "doOnEnd", "doOnStart", "doOnCancel", "doOnRepeat", "Landroid/animation/Animator$AnimatorPauseListener;", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", "onRepeat", "addListener", "onResume", "onPause", "addPauseListener", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Animator.kt */
public final class AnimatorKt {
    public static final Animator.AnimatorListener addListener(Animator animator, C16265l<? super Animator, C13339u> lVar, C16265l<? super Animator, C13339u> lVar2, C16265l<? super Animator, C13339u> lVar3, C16265l<? super Animator, C13339u> lVar4) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "onEnd");
        C13706o.m87929f(lVar2, "onStart");
        C13706o.m87929f(lVar3, "onCancel");
        C13706o.m87929f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, C16265l lVar, C16265l lVar2, C16265l lVar3, C16265l lVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            lVar3 = AnimatorKt$addListener$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            lVar4 = AnimatorKt$addListener$4.INSTANCE;
        }
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "onEnd");
        C13706o.m87929f(lVar2, "onStart");
        C13706o.m87929f(lVar3, "onCancel");
        C13706o.m87929f(lVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(lVar4, lVar, lVar3, lVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, C16265l<? super Animator, C13339u> lVar, C16265l<? super Animator, C13339u> lVar2) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "onResume");
        C13706o.m87929f(lVar2, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(lVar2, lVar);
        Api19Impl.addPauseListener(animator, animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, C16265l lVar, C16265l lVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = AnimatorKt$addPauseListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = AnimatorKt$addPauseListener$2.INSTANCE;
        }
        return addPauseListener(animator, lVar, lVar2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, C16265l<? super Animator, C13339u> lVar) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "action");
        AnimatorKt$doOnCancel$$inlined$addListener$default$1 animatorKt$doOnCancel$$inlined$addListener$default$1 = new AnimatorKt$doOnCancel$$inlined$addListener$default$1(lVar);
        animator.addListener(animatorKt$doOnCancel$$inlined$addListener$default$1);
        return animatorKt$doOnCancel$$inlined$addListener$default$1;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, C16265l<? super Animator, C13339u> lVar) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "action");
        AnimatorKt$doOnEnd$$inlined$addListener$default$1 animatorKt$doOnEnd$$inlined$addListener$default$1 = new AnimatorKt$doOnEnd$$inlined$addListener$default$1(lVar);
        animator.addListener(animatorKt$doOnEnd$$inlined$addListener$default$1);
        return animatorKt$doOnEnd$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, C16265l<? super Animator, C13339u> lVar) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "action");
        return addPauseListener$default(animator, (C16265l) null, lVar, 1, (Object) null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, C16265l<? super Animator, C13339u> lVar) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "action");
        AnimatorKt$doOnRepeat$$inlined$addListener$default$1 animatorKt$doOnRepeat$$inlined$addListener$default$1 = new AnimatorKt$doOnRepeat$$inlined$addListener$default$1(lVar);
        animator.addListener(animatorKt$doOnRepeat$$inlined$addListener$default$1);
        return animatorKt$doOnRepeat$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, C16265l<? super Animator, C13339u> lVar) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "action");
        return addPauseListener$default(animator, lVar, (C16265l) null, 2, (Object) null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, C16265l<? super Animator, C13339u> lVar) {
        C13706o.m87929f(animator, "<this>");
        C13706o.m87929f(lVar, "action");
        AnimatorKt$doOnStart$$inlined$addListener$default$1 animatorKt$doOnStart$$inlined$addListener$default$1 = new AnimatorKt$doOnStart$$inlined$addListener$default$1(lVar);
        animator.addListener(animatorKt$doOnStart$$inlined$addListener$default$1);
        return animatorKt$doOnStart$$inlined$addListener$default$1;
    }
}
