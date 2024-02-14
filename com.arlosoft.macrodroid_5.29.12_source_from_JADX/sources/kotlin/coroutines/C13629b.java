package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13640g.C13643b;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0014"}, mo71668d2 = {"Lkotlin/coroutines/b;", "Lkotlin/coroutines/g$b;", "B", "E", "Lkotlin/coroutines/g$c;", "element", "b", "(Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g$b;", "key", "", "a", "(Lkotlin/coroutines/g$c;)Z", "c", "Lkotlin/coroutines/g$c;", "topmostKey", "baseKey", "Lkotlin/Function1;", "safeCast", "<init>", "(Lkotlin/coroutines/g$c;Lqa/l;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.b */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C13629b<B extends C13640g.C13643b, E extends B> implements C13640g.C13645c<E> {

    /* renamed from: a */
    private final C16265l<C13640g.C13643b, E> f61892a;

    /* renamed from: c */
    private final C13640g.C13645c<?> f61893c;

    public C13629b(C13640g.C13645c<B> cVar, C16265l<? super C13640g.C13643b, ? extends E> lVar) {
        C13706o.m87929f(cVar, "baseKey");
        C13706o.m87929f(lVar, "safeCast");
        this.f61892a = lVar;
        this.f61893c = cVar instanceof C13629b ? ((C13629b) cVar).f61893c : cVar;
    }

    /* renamed from: a */
    public final boolean mo71872a(C13640g.C13645c<?> cVar) {
        C13706o.m87929f(cVar, "key");
        return cVar == this || this.f61893c == cVar;
    }

    /* renamed from: b */
    public final E mo71873b(C13640g.C13643b bVar) {
        C13706o.m87929f(bVar, "element");
        return (C13640g.C13643b) this.f61892a.invoke(bVar);
    }
}
