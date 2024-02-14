package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", mo71894f = "PausingDispatcher.kt", mo71895l = {162}, mo71896m = "invokeSuspend")
/* compiled from: PausingDispatcher.kt */
final class PausingDispatcherKt$whenStateAtLeast$2 extends C13665l implements C16269p<C15478k0, C13635d<? super T>, Object> {
    final /* synthetic */ C16269p<C15478k0, C13635d<? super T>, Object> $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar, C13635d<? super PausingDispatcherKt$whenStateAtLeast$2> dVar) {
        super(2, dVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = pVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super T> dVar) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15561w1 w1Var = (C15561w1) ((C15478k0) this.L$0).getCoroutineContext().get(C15561w1.f64808x);
            if (w1Var != null) {
                PausingDispatcher pausingDispatcher = new PausingDispatcher();
                LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, w1Var);
                try {
                    C16269p<C15478k0, C13635d<? super T>, Object> pVar = this.$block;
                    this.L$0 = lifecycleController2;
                    this.label = 1;
                    obj = C15414h.m94298g(pausingDispatcher, pVar, this);
                    if (obj == c) {
                        return c;
                    }
                    lifecycleController = lifecycleController2;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController = lifecycleController2;
                    lifecycleController.finish();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            lifecycleController = (LifecycleController) this.L$0;
            try {
                C13332o.m85685b(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        lifecycleController.finish();
        return obj;
    }
}
