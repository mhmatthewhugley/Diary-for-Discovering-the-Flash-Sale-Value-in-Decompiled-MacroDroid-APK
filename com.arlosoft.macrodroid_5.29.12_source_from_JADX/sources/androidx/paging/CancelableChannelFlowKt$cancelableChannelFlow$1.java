package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15245x;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"T", "Landroidx/paging/SimpleProducerScope;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", mo71894f = "CancelableChannelFlow.kt", mo71895l = {30}, mo71896m = "invokeSuspend")
/* compiled from: CancelableChannelFlow.kt */
final class CancelableChannelFlowKt$cancelableChannelFlow$1 extends C13665l implements C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> $block;
    final /* synthetic */ C15561w1 $controller;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CancelableChannelFlowKt$cancelableChannelFlow$1(C15561w1 w1Var, C16269p<? super SimpleProducerScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super CancelableChannelFlowKt$cancelableChannelFlow$1> dVar) {
        super(2, dVar);
        this.$controller = w1Var;
        this.$block = pVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.$controller, this.$block, dVar);
        cancelableChannelFlowKt$cancelableChannelFlow$1.L$0 = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    public final Object invoke(SimpleProducerScope<T> simpleProducerScope, C13635d<? super C13339u> dVar) {
        return ((CancelableChannelFlowKt$cancelableChannelFlow$1) create(simpleProducerScope, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
            this.$controller.mo74617p(new C16265l<Throwable, C13339u>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C13339u.f61331a;
                }

                public final void invoke(Throwable th) {
                    C15245x.C15246a.m93924a(simpleProducerScope, (Throwable) null, 1, (Object) null);
                }
            });
            C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> pVar = this.$block;
            this.label = 1;
            if (pVar.invoke(simpleProducerScope, this) == c) {
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
