package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", mo71894f = "Lifecycle.kt", mo71895l = {97}, mo71896m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
final class LifecycleCoroutineScope$launchWhenStarted$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16269p<C15478k0, C13635d<? super C13339u>, Object> $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LifecycleCoroutineScope$launchWhenStarted$1(LifecycleCoroutineScope lifecycleCoroutineScope, C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super LifecycleCoroutineScope$launchWhenStarted$1> dVar) {
        super(2, dVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = pVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new LifecycleCoroutineScope$launchWhenStarted$1(this.this$0, this.$block, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((LifecycleCoroutineScope$launchWhenStarted$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            Lifecycle lifecycle$lifecycle_runtime_ktx_release = this.this$0.getLifecycle$lifecycle_runtime_ktx_release();
            C16269p<C15478k0, C13635d<? super C13339u>, Object> pVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_runtime_ktx_release, pVar, this) == c) {
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
