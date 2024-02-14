package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.flow.C15288g;
import kotlinx.coroutines.internal.C15437e0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/x;", "T", "Lkotlinx/coroutines/flow/g;", "value", "Lja/u;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "a", "Lkotlin/coroutines/g;", "emitContext", "", "c", "Ljava/lang/Object;", "countOrElement", "downstream", "<init>", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.x */
/* compiled from: ChannelFlow.kt */
final class C15338x<T> implements C15288g<T> {

    /* renamed from: a */
    private final C13640g f64559a;

    /* renamed from: c */
    private final Object f64560c;

    /* renamed from: d */
    private final C16269p<T, C13635d<? super C13339u>, Object> f64561d;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, mo71668d2 = {"T", "it", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    @C13658f(mo71893c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", mo71894f = "ChannelFlow.kt", mo71895l = {212}, mo71896m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.internal.x$a */
    /* compiled from: ChannelFlow.kt */
    static final class C15339a extends C13665l implements C16269p<T, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C15288g<T> $downstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15339a(C15288g<? super T> gVar, C13635d<? super C15339a> dVar) {
            super(2, dVar);
            this.$downstream = gVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C15339a aVar = new C15339a(this.$downstream, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(T t, C13635d<? super C13339u> dVar) {
            return ((C15339a) create(t, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                Object obj2 = this.L$0;
                C15288g<T> gVar = this.$downstream;
                this.label = 1;
                if (gVar.emit(obj2, this) == c) {
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

    public C15338x(C15288g<? super T> gVar, C13640g gVar2) {
        this.f64559a = gVar2;
        this.f64560c = C15437e0.m94361b(gVar2);
        this.f64561d = new C15339a(gVar, (C13635d<? super C15339a>) null);
    }

    public Object emit(T t, C13635d<? super C13339u> dVar) {
        Object b = C15306e.m94169b(this.f64559a, t, this.f64560c, this.f64561d, dVar);
        return b == C13652d.m87832c() ? b : C13339u.f61331a;
    }
}
