package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¨\u0006\n"}, mo71668d2 = {"Lkotlin/coroutines/e;", "Lkotlin/coroutines/g$b;", "T", "Lkotlin/coroutines/d;", "continuation", "interceptContinuation", "Lja/u;", "releaseInterceptedContinuation", "u", "b", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.coroutines.e */
/* compiled from: ContinuationInterceptor.kt */
public interface C13636e extends C13640g.C13643b {

    /* renamed from: u */
    public static final C13638b f61896u = C13638b.f61897a;

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: kotlin.coroutines.e$a */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C13637a {
        /* renamed from: a */
        public static <E extends C13640g.C13643b> E m87817a(C13636e eVar, C13640g.C13645c<E> cVar) {
            C13706o.m87929f(cVar, "key");
            if (cVar instanceof C13629b) {
                C13629b bVar = (C13629b) cVar;
                if (!bVar.mo71872a(eVar.getKey())) {
                    return null;
                }
                E b = bVar.mo71873b(eVar);
                if (b instanceof C13640g.C13643b) {
                    return b;
                }
                return null;
            } else if (C13636e.f61896u != cVar) {
                return null;
            } else {
                C13706o.m87927d(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        /* renamed from: b */
        public static C13640g m87818b(C13636e eVar, C13640g.C13645c<?> cVar) {
            C13706o.m87929f(cVar, "key");
            if (!(cVar instanceof C13629b)) {
                return C13636e.f61896u == cVar ? C13646h.f61899a : eVar;
            }
            C13629b bVar = (C13629b) cVar;
            return (!bVar.mo71872a(eVar.getKey()) || bVar.mo71873b(eVar) == null) ? eVar : C13646h.f61899a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo71668d2 = {"Lkotlin/coroutines/e$b;", "Lkotlin/coroutines/g$c;", "Lkotlin/coroutines/e;", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.coroutines.e$b */
    /* compiled from: ContinuationInterceptor.kt */
    public static final class C13638b implements C13640g.C13645c<C13636e> {

        /* renamed from: a */
        static final /* synthetic */ C13638b f61897a = new C13638b();

        private C13638b() {
        }
    }

    <T> C13635d<T> interceptContinuation(C13635d<? super T> dVar);

    void releaseInterceptedContinuation(C13635d<?> dVar);
}
