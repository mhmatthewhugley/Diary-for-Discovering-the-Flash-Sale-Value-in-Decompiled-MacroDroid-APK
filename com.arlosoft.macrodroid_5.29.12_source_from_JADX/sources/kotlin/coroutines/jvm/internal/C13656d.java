package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo71668d2 = {"Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/a;", "Lkotlin/coroutines/d;", "", "intercepted", "Lja/u;", "releaseIntercepted", "Lkotlin/coroutines/g;", "_context", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/g;", "context", "completion", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/g;)V", "(Lkotlin/coroutines/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.jvm.internal.d */
/* compiled from: ContinuationImpl.kt */
public abstract class C13656d extends C13653a {
    private final C13640g _context;
    private transient C13635d<Object> intercepted;

    public C13656d(C13635d<Object> dVar, C13640g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public C13640g getContext() {
        C13640g gVar = this._context;
        C13706o.m87926c(gVar);
        return gVar;
    }

    public final C13635d<Object> intercepted() {
        C13635d<Object> dVar = this.intercepted;
        if (dVar == null) {
            C13636e eVar = (C13636e) getContext().get(C13636e.f61896u);
            if (eVar == null || (dVar = eVar.interceptContinuation(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C13635d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            C13640g.C13643b bVar = getContext().get(C13636e.f61896u);
            C13706o.m87926c(bVar);
            ((C13636e) bVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = C13655c.f61904a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C13656d(C13635d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
