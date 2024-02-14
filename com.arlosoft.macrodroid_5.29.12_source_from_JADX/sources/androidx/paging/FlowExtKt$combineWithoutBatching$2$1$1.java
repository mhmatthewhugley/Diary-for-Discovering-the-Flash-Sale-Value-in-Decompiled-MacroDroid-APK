package androidx.paging;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.channels.C15245x;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H@"}, mo71668d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$1$1", mo71894f = "FlowExt.kt", mo71895l = {222}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$combineWithoutBatching$2$1$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ SimpleProducerScope<R> $$this$simpleChannelFlow;
    final /* synthetic */ C15285f<Object> $flow;
    final /* synthetic */ AtomicInteger $incompleteFlows;
    final /* synthetic */ int $index;
    final /* synthetic */ UnbatchedFlowCombiner<T1, T2> $unbatchedFlowCombiner;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$1$1(C15285f<? extends Object> fVar, AtomicInteger atomicInteger, SimpleProducerScope<R> simpleProducerScope, UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner, int i, C13635d<? super FlowExtKt$combineWithoutBatching$2$1$1> dVar) {
        super(2, dVar);
        this.$flow = fVar;
        this.$incompleteFlows = atomicInteger;
        this.$$this$simpleChannelFlow = simpleProducerScope;
        this.$unbatchedFlowCombiner = unbatchedFlowCombiner;
        this.$index = i;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new FlowExtKt$combineWithoutBatching$2$1$1(this.$flow, this.$incompleteFlows, this.$$this$simpleChannelFlow, this.$unbatchedFlowCombiner, this.$index, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((FlowExtKt$combineWithoutBatching$2$1$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15285f<Object> fVar = this.$flow;
            C0884x191937bd flowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1 = new C0884x191937bd(this.$unbatchedFlowCombiner, this.$index);
            this.label = 1;
            if (fVar.collect(flowExtKt$combineWithoutBatching$2$1$1$invokeSuspend$$inlined$collect$1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            try {
                C13332o.m85685b(obj);
            } catch (Throwable th) {
                if (this.$incompleteFlows.decrementAndGet() == 0) {
                    C15245x.C15246a.m93924a(this.$$this$simpleChannelFlow, (Throwable) null, 1, (Object) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (this.$incompleteFlows.decrementAndGet() == 0) {
            C15245x.C15246a.m93924a(this.$$this$simpleChannelFlow, (Throwable) null, 1, (Object) null);
        }
        return C13339u.f61331a;
    }
}
