package androidx.paging;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13705n;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16269p;
import p370qa.C16271r;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H@"}, mo71668d2 = {"T1", "T2", "R", "Landroidx/paging/SimpleProducerScope;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.FlowExtKt$combineWithoutBatching$2", mo71894f = "FlowExt.kt", mo71895l = {159}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
public final class FlowExtKt$combineWithoutBatching$2 extends C13665l implements C16269p<SimpleProducerScope<R>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C15285f<T2> $otherFlow;
    final /* synthetic */ C15285f<T1> $this_combineWithoutBatching;
    final /* synthetic */ C16271r<T1, T2, CombineSource, C13635d<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtKt$combineWithoutBatching$2(C15285f<? extends T1> fVar, C15285f<? extends T2> fVar2, C16271r<? super T1, ? super T2, ? super CombineSource, ? super C13635d<? super R>, ? extends Object> rVar, C13635d<? super FlowExtKt$combineWithoutBatching$2> dVar) {
        super(2, dVar);
        this.$this_combineWithoutBatching = fVar;
        this.$otherFlow = fVar2;
        this.$transform = rVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        FlowExtKt$combineWithoutBatching$2 flowExtKt$combineWithoutBatching$2 = new FlowExtKt$combineWithoutBatching$2(this.$this_combineWithoutBatching, this.$otherFlow, this.$transform, dVar);
        flowExtKt$combineWithoutBatching$2.L$0 = obj;
        return flowExtKt$combineWithoutBatching$2;
    }

    public final Object invoke(SimpleProducerScope<R> simpleProducerScope, C13635d<? super C13339u> dVar) {
        return ((FlowExtKt$combineWithoutBatching$2) create(simpleProducerScope, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            AtomicInteger atomicInteger = new AtomicInteger(2);
            UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, (C13635d<? super FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1>) null));
            final C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
            C15285f[] fVarArr = {this.$this_combineWithoutBatching, this.$otherFlow};
            int i2 = 0;
            int i3 = 0;
            while (i3 < 2) {
                C15561w1 unused = C15473j.m94492d(simpleProducerScope, b, (C15486m0) null, new FlowExtKt$combineWithoutBatching$2$1$1(fVarArr[i3], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, i2, (C13635d<? super FlowExtKt$combineWithoutBatching$2$1$1>) null), 2, (Object) null);
                i3++;
                i2++;
            }
            C08882 r4 = new C16254a<C13339u>() {
                public final void invoke() {
                    C15561w1.C15562a.m94723a(r13, (CancellationException) null, 1, (Object) null);
                }
            };
            this.label = 1;
            if (simpleProducerScope.awaitClose(r4, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13339u.f61331a;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
        AtomicInteger atomicInteger = new AtomicInteger(2);
        UnbatchedFlowCombiner unbatchedFlowCombiner = new UnbatchedFlowCombiner(new FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1(simpleProducerScope, this.$transform, (C13635d<? super FlowExtKt$combineWithoutBatching$2$unbatchedFlowCombiner$1>) null));
        final C15573z b = C15198b2.m93746b((C15561w1) null, 1, (Object) null);
        C15285f[] fVarArr = {this.$this_combineWithoutBatching, this.$otherFlow};
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            C15561w1 unused = C15473j.m94492d(simpleProducerScope, b, (C15486m0) null, new FlowExtKt$combineWithoutBatching$2$1$1(fVarArr[i2], atomicInteger, simpleProducerScope, unbatchedFlowCombiner, i, (C13635d<? super FlowExtKt$combineWithoutBatching$2$1$1>) null), 2, (Object) null);
            i2++;
            i++;
        }
        C08882 r2 = new C16254a<C13339u>() {
            public final void invoke() {
                C15561w1.C15562a.m94723a(b, (CancellationException) null, 1, (Object) null);
            }
        };
        C13705n.m87923c(0);
        simpleProducerScope.awaitClose(r2, this);
        C13705n.m87923c(1);
        return C13339u.f61331a;
    }
}
