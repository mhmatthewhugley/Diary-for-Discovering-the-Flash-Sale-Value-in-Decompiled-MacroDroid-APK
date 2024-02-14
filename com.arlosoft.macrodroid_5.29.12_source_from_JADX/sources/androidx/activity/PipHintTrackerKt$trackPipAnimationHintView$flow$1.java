package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.channels.C15235p;
import kotlinx.coroutines.channels.C15239r;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/channels/r;", "Landroid/graphics/Rect;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", mo71894f = "PipHintTracker.kt", mo71895l = {88}, mo71896m = "invokeSuspend")
/* compiled from: PipHintTracker.kt */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends C13665l implements C16269p<C15239r<? super Rect>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, C13635d<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> dVar) {
        super(2, dVar);
        this.$view = view;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, dVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    public final Object invoke(C15239r<? super Rect> rVar, C13635d<? super C13339u> dVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(rVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15239r rVar = (C15239r) this.L$0;
            final C0125xcb0293e3 pipHintTrackerKt$trackPipAnimationHintView$flow$1$layoutChangeListener$1 = new C0125xcb0293e3(rVar);
            final C0126xcdffd986 pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1 = new C0126xcdffd986(rVar, this.$view);
            final C0124x7c5261f5 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 = new C0124x7c5261f5(rVar, this.$view, pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1, pipHintTrackerKt$trackPipAnimationHintView$flow$1$layoutChangeListener$1);
            if (Api19Impl.INSTANCE.isAttachedToWindow(this.$view)) {
                rVar.offer(PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view));
                this.$view.getViewTreeObserver().addOnScrollChangedListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1);
                this.$view.addOnLayoutChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$layoutChangeListener$1);
            }
            this.$view.addOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
            final View view = this.$view;
            C01231 r5 = new C16254a<C13339u>() {
                public final void invoke() {
                    view.getViewTreeObserver().removeOnScrollChangedListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$scrollChangeListener$1);
                    view.removeOnLayoutChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$layoutChangeListener$1);
                    view.removeOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
                }
            };
            this.label = 1;
            if (C15235p.m93897a(rVar, r5, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
