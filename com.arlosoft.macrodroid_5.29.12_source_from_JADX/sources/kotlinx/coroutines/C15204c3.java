package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo71668d2 = {"Lkotlinx/coroutines/c3;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.c3 */
/* compiled from: CoroutineContext.kt */
final class C15204c3 implements C13640g.C13643b, C13640g.C13645c<C15204c3> {

    /* renamed from: a */
    public static final C15204c3 f64410a = new C15204c3();

    private C15204c3() {
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        return C13640g.C13643b.C13644a.m87822a(this, r, pVar);
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        return C13640g.C13643b.C13644a.m87823b(this, cVar);
    }

    public C13640g.C13645c<?> getKey() {
        return this;
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        return C13640g.C13643b.C13644a.m87824c(this, cVar);
    }

    public C13640g plus(C13640g gVar) {
        return C13640g.C13643b.C13644a.m87825d(this, gVar);
    }
}
