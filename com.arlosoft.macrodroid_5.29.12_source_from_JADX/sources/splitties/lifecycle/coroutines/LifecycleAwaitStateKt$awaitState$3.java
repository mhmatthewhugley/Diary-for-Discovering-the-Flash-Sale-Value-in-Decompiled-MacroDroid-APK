package splitties.lifecycle.coroutines;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15497o;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
@C13658f(mo71893c = "splitties.lifecycle.coroutines.LifecycleAwaitStateKt$awaitState$3", mo71894f = "LifecycleAwaitState.kt", mo71895l = {63}, mo71896m = "invokeSuspend")
/* compiled from: LifecycleAwaitState.kt */
final class LifecycleAwaitStateKt$awaitState$3 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_awaitState;
    Object L$0;
    Object L$1;
    int label;

    /* renamed from: p$ */
    private C15478k0 f69208p$;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"", "it", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "splitties/lifecycle/coroutines/LifecycleAwaitStateKt$awaitState$3$1$1", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: splitties.lifecycle.coroutines.LifecycleAwaitStateKt$awaitState$3$a */
    /* compiled from: LifecycleAwaitState.kt */
    static final class C17437a extends C13708q implements C16265l<Throwable, C13339u> {
        final /* synthetic */ C17436x317b75c9 $observer;
        final /* synthetic */ LifecycleAwaitStateKt$awaitState$3 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17437a(C17436x317b75c9 lifecycleAwaitStateKt$awaitState$3$invokeSuspend$$inlined$suspendCancellableCoroutine$lambda$1, LifecycleAwaitStateKt$awaitState$3 lifecycleAwaitStateKt$awaitState$3) {
            super(1);
            this.$observer = lifecycleAwaitStateKt$awaitState$3$invokeSuspend$$inlined$suspendCancellableCoroutine$lambda$1;
            this.this$0 = lifecycleAwaitStateKt$awaitState$3;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            this.this$0.$this_awaitState.removeObserver(this.$observer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleAwaitStateKt$awaitState$3(Lifecycle lifecycle, Lifecycle.State state, C13635d dVar) {
        super(2, dVar);
        this.$this_awaitState = lifecycle;
        this.$state = state;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        C13706o.m87929f(dVar, "completion");
        LifecycleAwaitStateKt$awaitState$3 lifecycleAwaitStateKt$awaitState$3 = new LifecycleAwaitStateKt$awaitState$3(this.$this_awaitState, this.$state, dVar);
        lifecycleAwaitStateKt$awaitState$3.f69208p$ = (C15478k0) obj;
        return lifecycleAwaitStateKt$awaitState$3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleAwaitStateKt$awaitState$3) create(obj, (C13635d) obj2)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15478k0 k0Var = this.f69208p$;
            if (this.$this_awaitState.getCurrentState() == Lifecycle.State.DESTROYED) {
                C15482l0.m94504c(k0Var, (CancellationException) null, 1, (Object) null);
            } else {
                this.L$0 = k0Var;
                this.L$1 = this;
                this.label = 1;
                C15497o oVar = new C15497o(C13649c.m87831b(this), 1);
                oVar.mo74864z();
                C17436x317b75c9 lifecycleAwaitStateKt$awaitState$3$invokeSuspend$$inlined$suspendCancellableCoroutine$lambda$1 = new C17436x317b75c9(oVar, this);
                this.$this_awaitState.addObserver(lifecycleAwaitStateKt$awaitState$3$invokeSuspend$$inlined$suspendCancellableCoroutine$lambda$1);
                oVar.mo74843d(new C17437a(lifecycleAwaitStateKt$awaitState$3$invokeSuspend$$inlined$suspendCancellableCoroutine$lambda$1, this));
                Object w = oVar.mo74862w();
                if (w == C13652d.m87832c()) {
                    C13660h.m87847c(this);
                }
                if (w == c) {
                    return c;
                }
            }
        } else if (i == 1) {
            LifecycleAwaitStateKt$awaitState$3 lifecycleAwaitStateKt$awaitState$3 = (LifecycleAwaitStateKt$awaitState$3) this.L$1;
            C15478k0 k0Var2 = (C15478k0) this.L$0;
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }
}
