package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.channels.C15239r;
import kotlinx.coroutines.channels.C15245x;
import kotlinx.coroutines.flow.C15285f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/channels/r;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
@C13658f(mo71893c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", mo71894f = "FlowExt.kt", mo71895l = {91}, mo71896m = "invokeSuspend")
/* compiled from: FlowExt.kt */
final class FlowExtKt$flowWithLifecycle$1 extends C13665l implements C16269p<C15239r<? super T>, C13635d<? super C13339u>, Object> {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ C15285f<T> $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 5, 1})
    @C13658f(mo71893c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", mo71894f = "FlowExt.kt", mo71895l = {99}, mo71896m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    /* compiled from: FlowExt.kt */
    static final class C07141 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C07141(fVar, rVar2, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C07141) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15285f<T> fVar = fVar;
                FlowExtKt$flowWithLifecycle$1$1$invokeSuspend$$inlined$collect$1 flowExtKt$flowWithLifecycle$1$1$invokeSuspend$$inlined$collect$1 = new FlowExtKt$flowWithLifecycle$1$1$invokeSuspend$$inlined$collect$1(rVar2);
                this.label = 1;
                if (fVar.collect(flowExtKt$flowWithLifecycle$1$1$invokeSuspend$$inlined$collect$1, this) == c) {
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
    FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, C15285f<? extends T> fVar, C13635d<? super FlowExtKt$flowWithLifecycle$1> dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = fVar;
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    public final Object invoke(C15239r<? super T> rVar, C13635d<? super C13339u> dVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(rVar, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        C15239r rVar;
        Object c = C13652d.m87832c();
        int i = this.label;
        if (i == 0) {
            C13332o.m85685b(obj);
            final C15239r rVar2 = (C15239r) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            final C15285f<T> fVar = this.$this_flowWithLifecycle;
            C07141 r5 = new C07141((C13635d<? super C07141>) null);
            this.L$0 = rVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (C16269p<? super C15478k0, ? super C13635d<? super C13339u>, ? extends Object>) r5, (C13635d<? super C13339u>) this) == c) {
                return c;
            }
            rVar = rVar2;
        } else if (i == 1) {
            rVar = (C15239r) this.L$0;
            C13332o.m85685b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C15245x.C15246a.m93924a(rVar, (Throwable) null, 1, (Object) null);
        return C13339u.f61331a;
    }
}
