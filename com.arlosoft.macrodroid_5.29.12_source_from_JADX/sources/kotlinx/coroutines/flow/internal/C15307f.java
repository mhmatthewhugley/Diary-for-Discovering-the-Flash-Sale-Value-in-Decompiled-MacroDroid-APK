package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.channels.C15239r;
import kotlinx.coroutines.flow.C15285f;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\fJ\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/f;", "S", "T", "Lkotlinx/coroutines/flow/internal/d;", "Lkotlinx/coroutines/flow/g;", "collector", "Lkotlin/coroutines/g;", "newContext", "Lja/u;", "o", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "p", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/r;", "scope", "f", "(Lkotlinx/coroutines/channels/r;Lkotlin/coroutines/d;)Ljava/lang/Object;", "collect", "", "toString", "Lkotlinx/coroutines/flow/f;", "Lkotlinx/coroutines/flow/f;", "flow", "context", "", "capacity", "Lkotlinx/coroutines/channels/e;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/g;ILkotlinx/coroutines/channels/e;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.f */
/* compiled from: ChannelFlow.kt */
public abstract class C15307f<S, T> extends C15303d<T> {

    /* renamed from: f */
    protected final C15285f<S> f64536f;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, mo71668d2 = {"S", "T", "Lkotlinx/coroutines/flow/g;", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", mo71894f = "ChannelFlow.kt", mo71895l = {152}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.f$a */
    /* compiled from: ChannelFlow.kt */
    static final class C15308a extends C13665l implements C16269p<C15288g<? super T>, C13635d<? super C13339u>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15307f<S, T> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15308a(C15307f<S, T> fVar, C13635d<? super C15308a> dVar) {
            super(2, dVar);
            this.this$0 = fVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C15308a aVar = new C15308a(this.this$0, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
            return ((C15308a) create(gVar, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15307f<S, T> fVar = this.this$0;
                this.label = 1;
                if (fVar.mo74685p((C15288g) this.L$0, this) == c) {
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

    public C15307f(C15285f<? extends S> fVar, C13640g gVar, int i, C15220e eVar) {
        super(gVar, i, eVar);
        this.f64536f = fVar;
    }

    /* renamed from: m */
    static /* synthetic */ Object m94172m(C15307f fVar, C15288g gVar, C13635d dVar) {
        if (fVar.f64534c == -3) {
            C13640g context = dVar.getContext();
            C13640g plus = context.plus(fVar.f64533a);
            if (C13706o.m87924a(plus, context)) {
                Object p = fVar.mo74685p(gVar, dVar);
                return p == C13652d.m87832c() ? p : C13339u.f61331a;
            }
            C13636e.C13638b bVar = C13636e.f61896u;
            if (C13706o.m87924a(plus.get(bVar), context.get(bVar))) {
                Object o = fVar.m94174o(gVar, plus, dVar);
                return o == C13652d.m87832c() ? o : C13339u.f61331a;
            }
        }
        Object collect = super.collect(gVar, dVar);
        return collect == C13652d.m87832c() ? collect : C13339u.f61331a;
    }

    /* renamed from: n */
    static /* synthetic */ Object m94173n(C15307f fVar, C15239r rVar, C13635d dVar) {
        Object p = fVar.mo74685p(new C15335u(rVar), dVar);
        return p == C13652d.m87832c() ? p : C13339u.f61331a;
    }

    /* renamed from: o */
    private final Object m94174o(C15288g<? super T> gVar, C13640g gVar2, C13635d<? super C13339u> dVar) {
        Object c = C15306e.m94170c(gVar2, C15306e.m94171d(gVar, dVar.getContext()), (Object) null, new C15308a(this, (C13635d<? super C15308a>) null), dVar, 4, (Object) null);
        return c == C13652d.m87832c() ? c : C13339u.f61331a;
    }

    public Object collect(C15288g<? super T> gVar, C13635d<? super C13339u> dVar) {
        return m94172m(this, gVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Object mo74656f(C15239r<? super T> rVar, C13635d<? super C13339u> dVar) {
        return m94173n(this, rVar, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract Object mo74685p(C15288g<? super T> gVar, C13635d<? super C13339u> dVar);

    public String toString() {
        return this.f64536f + " -> " + super.toString();
    }
}
