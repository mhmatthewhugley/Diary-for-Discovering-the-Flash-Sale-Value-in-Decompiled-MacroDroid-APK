package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.channels.C15221f;
import kotlinx.coroutines.channels.C15245x;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", mo71894f = "SimpleChannelFlow.kt", mo71895l = {52}, mo71896m = "invokeSuspend")
/* compiled from: SimpleChannelFlow.kt */
final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    final /* synthetic */ C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> $block;
    final /* synthetic */ C15221f<T> $channel;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", mo71894f = "SimpleChannelFlow.kt", mo71895l = {57}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1 */
    /* compiled from: SimpleChannelFlow.kt */
    static final class C09551 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C09551 r0 = new C09551(fVar, pVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C09551) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                SimpleProducerScopeImpl simpleProducerScopeImpl = new SimpleProducerScopeImpl((C15478k0) this.L$0, fVar);
                C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> pVar = pVar;
                this.label = 1;
                if (pVar.invoke(simpleProducerScopeImpl, this) == c) {
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
    SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(C15221f<T> fVar, C16269p<? super SimpleProducerScope<T>, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1> dVar) {
        super(2, dVar);
        this.$channel = fVar;
        this.$block = pVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.$channel, this.$block, dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            final C15221f<T> fVar = this.$channel;
            final C16269p<SimpleProducerScope<T>, C13635d<? super C13339u>, Object> pVar = this.$block;
            C09551 r6 = new C09551((C13635d<? super C09551>) null);
            this.label = 1;
            if (C15482l0.m94505d(r6, this) == c) {
                return c;
            }
        } else if (i == 1) {
            try {
                C13332o.m85685b(obj);
            } catch (Throwable th) {
                this.$channel.close(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15245x.C15246a.m93924a(this.$channel, (Throwable) null, 1, (Object) null);
        return C13339u.f61331a;
    }
}
