package androidx.core.animation;

import android.animation.Animator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@RequiresApi(19)
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, mo71668d2 = {"Landroidx/core/animation/Api19Impl;", "", "Landroid/animation/Animator;", "animator", "Landroid/animation/Animator$AnimatorPauseListener;", "listener", "Lja/u;", "addPauseListener", "<init>", "()V", "core-ktx_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: Animator.kt */
final class Api19Impl {
    public static final Api19Impl INSTANCE = new Api19Impl();

    private Api19Impl() {
    }

    @DoNotInline
    public static final void addPauseListener(Animator animator, Animator.AnimatorPauseListener animatorPauseListener) {
        C13706o.m87929f(animator, "animator");
        C13706o.m87929f(animatorPauseListener, "listener");
        animator.addPauseListener(animatorPauseListener);
    }
}
