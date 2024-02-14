package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0001J\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo71668d2 = {"Lkotlinx/coroutines/flow/internal/j;", "Lkotlin/coroutines/g;", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "operation", "fold", "(Ljava/lang/Object;Lqa/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "minusKey", "context", "plus", "", "a", "Ljava/lang/Throwable;", "e", "originalContext", "<init>", "(Ljava/lang/Throwable;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.internal.j */
/* compiled from: SafeCollector.kt */
public final class C15320j implements C13640g {

    /* renamed from: a */
    public final Throwable f64545a;

    /* renamed from: c */
    private final /* synthetic */ C13640g f64546c;

    public C15320j(Throwable th, C13640g gVar) {
        this.f64545a = th;
        this.f64546c = gVar;
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        return this.f64546c.fold(r, pVar);
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        return this.f64546c.get(cVar);
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        return this.f64546c.minusKey(cVar);
    }

    public C13640g plus(C13640g gVar) {
        return this.f64546c.plus(gVar);
    }
}
