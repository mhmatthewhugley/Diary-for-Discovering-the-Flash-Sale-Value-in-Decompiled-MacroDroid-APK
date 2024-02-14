package androidx.core.transition;

import android.transition.Transition;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a&\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a&\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a~\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0010"}, mo71668d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "Lja/u;", "action", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", "onResume", "onPause", "addListener", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Transition.kt */
public final class TransitionKt {
    @RequiresApi(19)
    public static final Transition.TransitionListener addListener(Transition transition, C16265l<? super Transition, C13339u> lVar, C16265l<? super Transition, C13339u> lVar2, C16265l<? super Transition, C13339u> lVar3, C16265l<? super Transition, C13339u> lVar4, C16265l<? super Transition, C13339u> lVar5) {
        C13706o.m87929f(transition, "<this>");
        C13706o.m87929f(lVar, "onEnd");
        C13706o.m87929f(lVar2, "onStart");
        C13706o.m87929f(lVar3, "onCancel");
        C13706o.m87929f(lVar4, "onResume");
        C13706o.m87929f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, C16265l lVar, C16265l lVar2, C16265l lVar3, C16265l lVar4, C16265l lVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = TransitionKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            lVar2 = TransitionKt$addListener$2.INSTANCE;
        }
        C16265l lVar6 = lVar2;
        if ((i & 4) != 0) {
            lVar3 = TransitionKt$addListener$3.INSTANCE;
        }
        C16265l lVar7 = lVar3;
        if ((i & 8) != 0) {
            lVar4 = TransitionKt$addListener$4.INSTANCE;
        }
        if ((i & 16) != 0) {
            lVar5 = TransitionKt$addListener$5.INSTANCE;
        }
        C13706o.m87929f(transition, "<this>");
        C13706o.m87929f(lVar, "onEnd");
        C13706o.m87929f(lVar6, "onStart");
        C13706o.m87929f(lVar7, "onCancel");
        C13706o.m87929f(lVar4, "onResume");
        C13706o.m87929f(lVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(lVar, lVar4, lVar5, lVar7, lVar6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnCancel(Transition transition, C16265l<? super Transition, C13339u> lVar) {
        C13706o.m87929f(transition, "<this>");
        C13706o.m87929f(lVar, "action");
        TransitionKt$doOnCancel$$inlined$addListener$default$1 transitionKt$doOnCancel$$inlined$addListener$default$1 = new TransitionKt$doOnCancel$$inlined$addListener$default$1(lVar);
        transition.addListener(transitionKt$doOnCancel$$inlined$addListener$default$1);
        return transitionKt$doOnCancel$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnEnd(Transition transition, C16265l<? super Transition, C13339u> lVar) {
        C13706o.m87929f(transition, "<this>");
        C13706o.m87929f(lVar, "action");
        TransitionKt$doOnEnd$$inlined$addListener$default$1 transitionKt$doOnEnd$$inlined$addListener$default$1 = new TransitionKt$doOnEnd$$inlined$addListener$default$1(lVar);
        transition.addListener(transitionKt$doOnEnd$$inlined$addListener$default$1);
        return transitionKt$doOnEnd$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnPause(Transition transition, C16265l<? super Transition, C13339u> lVar) {
        C13706o.m87929f(transition, "<this>");
        C13706o.m87929f(lVar, "action");
        TransitionKt$doOnPause$$inlined$addListener$default$1 transitionKt$doOnPause$$inlined$addListener$default$1 = new TransitionKt$doOnPause$$inlined$addListener$default$1(lVar);
        transition.addListener(transitionKt$doOnPause$$inlined$addListener$default$1);
        return transitionKt$doOnPause$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnResume(Transition transition, C16265l<? super Transition, C13339u> lVar) {
        C13706o.m87929f(transition, "<this>");
        C13706o.m87929f(lVar, "action");
        TransitionKt$doOnResume$$inlined$addListener$default$1 transitionKt$doOnResume$$inlined$addListener$default$1 = new TransitionKt$doOnResume$$inlined$addListener$default$1(lVar);
        transition.addListener(transitionKt$doOnResume$$inlined$addListener$default$1);
        return transitionKt$doOnResume$$inlined$addListener$default$1;
    }

    @RequiresApi(19)
    public static final Transition.TransitionListener doOnStart(Transition transition, C16265l<? super Transition, C13339u> lVar) {
        C13706o.m87929f(transition, "<this>");
        C13706o.m87929f(lVar, "action");
        TransitionKt$doOnStart$$inlined$addListener$default$1 transitionKt$doOnStart$$inlined$addListener$default$1 = new TransitionKt$doOnStart$$inlined$addListener$default$1(lVar);
        transition.addListener(transitionKt$doOnStart$$inlined$addListener$default$1);
        return transitionKt$doOnStart$$inlined$addListener$default$1;
    }
}
