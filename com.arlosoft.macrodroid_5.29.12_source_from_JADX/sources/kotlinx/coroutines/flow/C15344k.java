package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.channels.C15220e;
import kotlinx.coroutines.flow.internal.C15327p;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u001aG\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u0011\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo71668d2 = {"Lkotlinx/coroutines/flow/f;", "Lja/u;", "a", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Lkotlinx/coroutines/k0;", "scope", "Lkotlinx/coroutines/w1;", "d", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "action", "b", "(Lkotlinx/coroutines/flow/f;Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/g;", "flow", "c", "(Lkotlinx/coroutines/flow/g;Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.k */
/* compiled from: Collect.kt */
final /* synthetic */ class C15344k {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo71668d2 = {"T", "Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", mo71894f = "Collect.kt", mo71895l = {50}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.k$a */
    /* compiled from: Collect.kt */
    static final class C15345a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C15285f<T> $this_launchIn;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15345a(C15285f<? extends T> fVar, C13635d<? super C15345a> dVar) {
            super(2, dVar);
            this.$this_launchIn = fVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C15345a(this.$this_launchIn, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C15345a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                C15285f<T> fVar = this.$this_launchIn;
                this.label = 1;
                if (C15290h.m94120f(fVar, this) == c) {
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

    /* renamed from: a */
    public static final Object m94211a(C15285f<?> fVar, C13635d<? super C13339u> dVar) {
        Object collect = fVar.collect(C15327p.f64549a, dVar);
        return collect == C13652d.m87832c() ? collect : C13339u.f61331a;
    }

    /* renamed from: b */
    public static final <T> Object m94212b(C15285f<? extends T> fVar, C16269p<? super T, ? super C13635d<? super C13339u>, ? extends Object> pVar, C13635d<? super C13339u> dVar) {
        Object f = C15290h.m94120f(C15347l.m94220b(C15290h.m94136v(fVar, pVar), 0, (C15220e) null, 2, (Object) null), dVar);
        return f == C13652d.m87832c() ? f : C13339u.f61331a;
    }

    /* renamed from: c */
    public static final <T> Object m94213c(C15288g<? super T> gVar, C15285f<? extends T> fVar, C13635d<? super C13339u> dVar) {
        C15290h.m94129o(gVar);
        Object collect = fVar.collect(gVar, dVar);
        return collect == C13652d.m87832c() ? collect : C13339u.f61331a;
    }

    /* renamed from: d */
    public static final <T> C15561w1 m94214d(C15285f<? extends T> fVar, C15478k0 k0Var) {
        return C15473j.m94492d(k0Var, (C13640g) null, (C15486m0) null, new C15345a(fVar, (C13635d<? super C15345a>) null), 3, (Object) null);
    }
}
