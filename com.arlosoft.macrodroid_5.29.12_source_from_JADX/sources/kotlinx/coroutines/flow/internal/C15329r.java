package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.coroutines.jvm.internal.C13657e;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlinx.coroutines.C15575z1;
import kotlinx.coroutines.flow.C15288g;
import p297ja.C13329n;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b-\u0010.J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\f8\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0000X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/r;", "T", "Lkotlinx/coroutines/flow/g;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/coroutines/d;", "Lja/u;", "uCont", "value", "", "p", "(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "currentContext", "previousContext", "h", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/j;", "exception", "r", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lja/n;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "collector", "Lkotlinx/coroutines/flow/g;", "collectContext", "Lkotlin/coroutines/g;", "", "collectContextSize", "I", "lastEmissionContext", "completion", "Lkotlin/coroutines/d;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "getContext", "()Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlinx/coroutines/flow/g;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.r */
/* compiled from: SafeCollector.kt */
public final class C15329r<T> extends C13656d implements C15288g<T> {
    public final C13640g collectContext;
    public final int collectContextSize;
    public final C15288g<T> collector;
    private C13635d<? super C13339u> completion;
    private C13640g lastEmissionContext;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo71668d2 = {"T", "", "count", "Lkotlin/coroutines/g$b;", "<anonymous parameter 1>", "a", "(ILkotlin/coroutines/g$b;)Ljava/lang/Integer;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.flow.internal.r$a */
    /* compiled from: SafeCollector.kt */
    static final class C15330a extends C13708q implements C16269p<Integer, C13640g.C13643b, Integer> {

        /* renamed from: a */
        public static final C15330a f64553a = new C15330a();

        C15330a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer mo74691a(int i, C13640g.C13643b bVar) {
            return Integer.valueOf(i + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo74691a(((Number) obj).intValue(), (C13640g.C13643b) obj2);
        }
    }

    public C15329r(C15288g<? super T> gVar, C13640g gVar2) {
        super(C15326o.f64547a, C13646h.f61899a);
        this.collector = gVar;
        this.collectContext = gVar2;
        this.collectContextSize = ((Number) gVar2.fold(0, C15330a.f64553a)).intValue();
    }

    /* renamed from: h */
    private final void m94189h(C13640g gVar, C13640g gVar2, T t) {
        if (gVar2 instanceof C15320j) {
            m94191r((C15320j) gVar2, t);
        }
        C15333t.m94195a(this, gVar);
    }

    /* renamed from: p */
    private final Object m94190p(C13635d<? super C13339u> dVar, T t) {
        C13640g context = dVar.getContext();
        C15575z1.m94759g(context);
        C13640g gVar = this.lastEmissionContext;
        if (gVar != context) {
            m94189h(context, gVar, t);
            this.lastEmissionContext = context;
        }
        this.completion = dVar;
        Object invoke = C15331s.f64554a.invoke(this.collector, t, this);
        if (!C13706o.m87924a(invoke, C13652d.m87832c())) {
            this.completion = null;
        }
        return invoke;
    }

    /* renamed from: r */
    private final void m94191r(C15320j jVar, Object obj) {
        throw new IllegalStateException(C15167o.m93614f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + jVar.f64545a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t, C13635d<? super C13339u> dVar) {
        try {
            Object p = m94190p(dVar, t);
            if (p == C13652d.m87832c()) {
                C13660h.m87847c(dVar);
            }
            return p == C13652d.m87832c() ? p : C13339u.f61331a;
        } catch (Throwable th) {
            this.lastEmissionContext = new C15320j(th, dVar.getContext());
            throw th;
        }
    }

    public C13657e getCallerFrame() {
        C13635d<? super C13339u> dVar = this.completion;
        if (dVar instanceof C13657e) {
            return (C13657e) dVar;
        }
        return null;
    }

    public C13640g getContext() {
        C13640g gVar = this.lastEmissionContext;
        return gVar == null ? C13646h.f61899a : gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable c = C13329n.m85678c(obj);
        if (c != null) {
            this.lastEmissionContext = new C15320j(c, getContext());
        }
        C13635d<? super C13339u> dVar = this.completion;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return C13652d.m87832c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
