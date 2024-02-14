package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo71668d2 = {"Lkotlin/coroutines/a;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "key", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "<init>", "(Lkotlin/coroutines/g$c;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.a */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C13628a implements C13640g.C13643b {
    private final C13640g.C13645c<?> key;

    public C13628a(C13640g.C13645c<?> cVar) {
        C13706o.m87929f(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        return C13640g.C13643b.C13644a.m87822a(this, r, pVar);
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        return C13640g.C13643b.C13644a.m87823b(this, cVar);
    }

    public C13640g.C13645c<?> getKey() {
        return this.key;
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        return C13640g.C13643b.C13644a.m87824c(this, cVar);
    }

    public C13640g plus(C13640g gVar) {
        return C13640g.C13643b.C13644a.m87825d(this, gVar);
    }
}
