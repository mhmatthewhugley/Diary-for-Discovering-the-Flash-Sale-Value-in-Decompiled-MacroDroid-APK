package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13705n;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H@"}, mo71668d2 = {"T1", "T2", "R", "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1", mo71894f = "FlowExt.kt", mo71895l = {139, 139}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 extends C13665l implements C16271r<T1, T2, CombineSource, C13635d<? super C13339u>, Object> {
    final /* synthetic */ SimpleProducerScope<R> $$this$simpleChannelFlow;
    final /* synthetic */ C16271r<T1, T2, CombineSource, C13635d<? super R>, Object> $transform;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(SimpleProducerScope<R> simpleProducerScope, C16271r<? super T1, ? super T2, ? super CombineSource, ? super C13635d<? super R>, ? extends Object> rVar, C13635d<? super FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1> dVar) {
        super(4, dVar);
        this.$$this$simpleChannelFlow = simpleProducerScope;
        this.$transform = rVar;
    }

    public final Object invoke(T1 t1, T2 t2, CombineSource combineSource, C13635d<? super C13339u> dVar) {
        FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1 = new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(this.$$this$simpleChannelFlow, this.$transform, dVar);
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$0 = t1;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$1 = t2;
        flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.L$2 = combineSource;
        return flowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1.invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        SimpleProducerScope<R> simpleProducerScope;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            SimpleProducerScope<R> simpleProducerScope2 = this.$$this$simpleChannelFlow;
            C16271r<T1, T2, CombineSource, C13635d<? super R>, Object> rVar = this.$transform;
            this.L$0 = simpleProducerScope2;
            this.L$1 = null;
            this.label = 1;
            obj = rVar.invoke(this.L$0, this.L$1, (CombineSource) this.L$2, this);
            if (obj == c) {
                return c;
            }
            simpleProducerScope = simpleProducerScope2;
        } else if (i == 1) {
            simpleProducerScope = (SimpleProducerScope) this.L$0;
            C13332o.m85685b(obj);
        } else if (i == 2) {
            C13332o.m85685b(obj);
            return C13339u.f61331a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.L$0 = null;
        this.label = 2;
        if (simpleProducerScope.send(obj, this) == c) {
            return c;
        }
        return C13339u.f61331a;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        SimpleProducerScope<R> simpleProducerScope = this.$$this$simpleChannelFlow;
        Object invoke = this.$transform.invoke(this.L$0, this.L$1, (CombineSource) this.L$2, this);
        C13705n.m87923c(0);
        simpleProducerScope.send(invoke, this);
        C13705n.m87923c(1);
        return C13339u.f61331a;
    }
}
