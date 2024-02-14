package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/flow/g;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", mo71894f = "FlowExt.kt", mo71895l = {222}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
final class FlowExtKt$simpleRunningReduce$1 extends C13665l implements C16269p<C15288g<? super T>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16270q<T, T, C13635d<? super T>, Object> $operation;
    final /* synthetic */ C15285f<T> $this_simpleRunningReduce;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleRunningReduce$1(C15285f<? extends T> fVar, C16270q<? super T, ? super T, ? super C13635d<? super T>, ? extends Object> qVar, C13635d<? super FlowExtKt$simpleRunningReduce$1> dVar) {
        super(2, dVar);
        this.$this_simpleRunningReduce = fVar;
        this.$operation = qVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        FlowExtKt$simpleRunningReduce$1 flowExtKt$simpleRunningReduce$1 = new FlowExtKt$simpleRunningReduce$1(this.$this_simpleRunningReduce, this.$operation, dVar);
        flowExtKt$simpleRunningReduce$1.L$0 = obj;
        return flowExtKt$simpleRunningReduce$1;
    }

    public final Object invoke(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        return ((FlowExtKt$simpleRunningReduce$1) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C13684d0 d0Var = new C13684d0();
            d0Var.element = FlowExtKt.NULL;
            C15285f<T> fVar = this.$this_simpleRunningReduce;
            FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1(d0Var, this.$operation, (C15288g) this.L$0);
            this.label = 1;
            if (fVar.collect(flowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1, this) == c) {
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
