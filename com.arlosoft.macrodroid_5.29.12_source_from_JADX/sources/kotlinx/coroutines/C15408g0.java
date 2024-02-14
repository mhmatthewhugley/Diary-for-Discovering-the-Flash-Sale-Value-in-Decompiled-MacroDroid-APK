package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import kotlin.coroutines.jvm.internal.C13657e;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13708q;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u0011H\u0010\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/g;", "context", "e", "addedContext", "d", "", "c", "originalContext", "appendContext", "isNewCoroutine", "a", "Lkotlin/coroutines/d;", "", "oldValue", "Lkotlinx/coroutines/b3;", "g", "Lkotlin/coroutines/jvm/internal/e;", "f", "", "b", "(Lkotlin/coroutines/g;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.g0 */
/* compiled from: CoroutineContext.kt */
public final class C15408g0 {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.g0$a */
    /* compiled from: CoroutineContext.kt */
    static final class C15409a extends C13708q implements C16269p<C13640g, C13640g.C13643b, C13640g> {

        /* renamed from: a */
        public static final C15409a f64615a = new C15409a();

        C15409a() {
            super(2);
        }

        /* renamed from: a */
        public final C13640g invoke(C13640g gVar, C13640g.C13643b bVar) {
            if (bVar instanceof C15265f0) {
                return gVar.plus(((C15265f0) bVar).mo74643m());
            }
            return gVar.plus(bVar);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"Lkotlin/coroutines/g;", "result", "Lkotlin/coroutines/g$b;", "element", "a", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.g0$b */
    /* compiled from: CoroutineContext.kt */
    static final class C15410b extends C13708q implements C16269p<C13640g, C13640g.C13643b, C13640g> {
        final /* synthetic */ boolean $isNewCoroutine;
        final /* synthetic */ C13684d0<C13640g> $leftoverContext;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15410b(C13684d0<C13640g> d0Var, boolean z) {
            super(2);
            this.$leftoverContext = d0Var;
            this.$isNewCoroutine = z;
        }

        /* renamed from: a */
        public final C13640g invoke(C13640g gVar, C13640g.C13643b bVar) {
            if (!(bVar instanceof C15265f0)) {
                return gVar.plus(bVar);
            }
            C13640g.C13643b bVar2 = ((C13640g) this.$leftoverContext.element).get(bVar.getKey());
            if (bVar2 == null) {
                C15265f0 f0Var = (C15265f0) bVar;
                if (this.$isNewCoroutine) {
                    f0Var = f0Var.mo74643m();
                }
                return gVar.plus(f0Var);
            }
            C13684d0<C13640g> d0Var = this.$leftoverContext;
            d0Var.element = ((C13640g) d0Var.element).minusKey(bVar.getKey());
            return gVar.plus(((C15265f0) bVar).mo74642e(bVar2));
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "result", "Lkotlin/coroutines/g$b;", "it", "a", "(ZLkotlin/coroutines/g$b;)Ljava/lang/Boolean;"}, mo71669k = 3, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.g0$c */
    /* compiled from: CoroutineContext.kt */
    static final class C15411c extends C13708q implements C16269p<Boolean, C13640g.C13643b, Boolean> {

        /* renamed from: a */
        public static final C15411c f64616a = new C15411c();

        C15411c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo74718a(boolean z, C13640g.C13643b bVar) {
            return Boolean.valueOf(z || (bVar instanceof C15265f0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo74718a(((Boolean) obj).booleanValue(), (C13640g.C13643b) obj2);
        }
    }

    /* renamed from: a */
    private static final C13640g m94269a(C13640g gVar, C13640g gVar2, boolean z) {
        boolean c = m94271c(gVar);
        boolean c2 = m94271c(gVar2);
        if (!c && !c2) {
            return gVar.plus(gVar2);
        }
        C13684d0 d0Var = new C13684d0();
        d0Var.element = gVar2;
        C13646h hVar = C13646h.f61899a;
        C13640g gVar3 = (C13640g) gVar.fold(hVar, new C15410b(d0Var, z));
        if (c2) {
            d0Var.element = ((C13640g) d0Var.element).fold(hVar, C15409a.f64615a);
        }
        return gVar3.plus((C13640g) d0Var.element);
    }

    /* renamed from: b */
    public static final String m94270b(C13640g gVar) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m94271c(C13640g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, C15411c.f64616a)).booleanValue();
    }

    /* renamed from: d */
    public static final C13640g m94272d(C13640g gVar, C13640g gVar2) {
        if (!m94271c(gVar2)) {
            return gVar.plus(gVar2);
        }
        return m94269a(gVar, gVar2, false);
    }

    /* renamed from: e */
    public static final C13640g m94273e(C15478k0 k0Var, C13640g gVar) {
        C13640g a = m94269a(k0Var.getCoroutineContext(), gVar, true);
        return (a == C15186a1.m93729a() || a.get(C13636e.f61896u) != null) ? a : a.plus(C15186a1.m93729a());
    }

    /* renamed from: f */
    public static final C15199b3<?> m94274f(C13657e eVar) {
        while (!(eVar instanceof C15560w0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof C15199b3) {
                return (C15199b3) eVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C15199b3<?> m94275g(C13635d<?> dVar, C13640g gVar, Object obj) {
        if (!(dVar instanceof C13657e)) {
            return null;
        }
        if (!(gVar.get(C15204c3.f64410a) != null)) {
            return null;
        }
        C15199b3<?> f = m94274f((C13657e) dVar);
        if (f != null) {
            f.mo74515M0(gVar, obj);
        }
        return f;
    }
}
