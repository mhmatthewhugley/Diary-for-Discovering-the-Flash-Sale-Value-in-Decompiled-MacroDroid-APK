package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.flow.C15290h;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;
import p370qa.C16270q;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo71668d2 = {"T", "R", "Landroidx/paging/SimpleProducerScope;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", mo71894f = "FlowExt.kt", mo71895l = {86}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
final class FlowExtKt$simpleTransformLatest$1 extends C13665l implements C16269p<SimpleProducerScope<R>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C15285f<T> $this_simpleTransformLatest;
    final /* synthetic */ C16270q<C15288g<? super R>, T, C13635d<? super C13339u>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@"}, mo71668d2 = {"T", "R", "value", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", mo71894f = "FlowExt.kt", mo71895l = {87}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.FlowExtKt$simpleTransformLatest$1$1 */
    /* compiled from: FlowExt.kt */
    static final class C08891 extends C13665l implements C16269p<T, C13635d<? super C13339u>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C08891 r0 = new C08891(qVar, channelFlowCollector, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(T t, C13635d<? super C13339u> dVar) {
            return ((C08891) create(t, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                Object obj2 = this.L$0;
                C16270q<C15288g<? super R>, T, C13635d<? super C13339u>, Object> qVar = qVar;
                ChannelFlowCollector<R> channelFlowCollector = channelFlowCollector;
                this.label = 1;
                if (qVar.invoke(channelFlowCollector, obj2, this) == c) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowExtKt$simpleTransformLatest$1(C15285f<? extends T> fVar, C16270q<? super C15288g<? super R>, ? super T, ? super C13635d<? super C13339u>, ? extends Object> qVar, C13635d<? super FlowExtKt$simpleTransformLatest$1> dVar) {
        super(2, dVar);
        this.$this_simpleTransformLatest = fVar;
        this.$transform = qVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        FlowExtKt$simpleTransformLatest$1 flowExtKt$simpleTransformLatest$1 = new FlowExtKt$simpleTransformLatest$1(this.$this_simpleTransformLatest, this.$transform, dVar);
        flowExtKt$simpleTransformLatest$1.L$0 = obj;
        return flowExtKt$simpleTransformLatest$1;
    }

    public final Object invoke(SimpleProducerScope<R> simpleProducerScope, C13635d<? super C13339u> dVar) {
        return ((FlowExtKt$simpleTransformLatest$1) create(simpleProducerScope, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            C15285f<T> fVar = this.$this_simpleTransformLatest;
            final ChannelFlowCollector channelFlowCollector = new ChannelFlowCollector((SimpleProducerScope) this.L$0);
            final C16270q<C15288g<? super R>, T, C13635d<? super C13339u>, Object> qVar = this.$transform;
            C08891 r7 = new C08891((C13635d<? super C08891>) null);
            this.label = 1;
            if (C15290h.m94121g(fVar, r7, this) == c) {
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
