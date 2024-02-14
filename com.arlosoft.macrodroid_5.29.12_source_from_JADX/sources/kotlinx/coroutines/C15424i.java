package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.C13646h;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo71668d2 = {"T", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/d;", "", "block", "a", "(Lkotlin/coroutines/g;Lqa/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.i */
/* compiled from: Builders.kt */
final /* synthetic */ class C15424i {
    /* renamed from: a */
    public static final <T> T m94327a(C13640g gVar, C16269p<? super C15478k0, ? super C13635d<? super T>, ? extends Object> pVar) throws InterruptedException {
        C13640g gVar2;
        C15412g1 g1Var;
        Thread currentThread = Thread.currentThread();
        C13636e eVar = (C13636e) gVar.get(C13636e.f61896u);
        if (eVar == null) {
            g1Var = C15558v2.f64805a.mo74921b();
            gVar2 = C15408g0.m94273e(C15503p1.f64723a, gVar.plus(g1Var));
        } else {
            C15412g1 g1Var2 = null;
            C15412g1 g1Var3 = eVar instanceof C15412g1 ? (C15412g1) eVar : null;
            if (g1Var3 != null && g1Var3.mo74726M()) {
                g1Var2 = g1Var3;
            }
            g1Var = g1Var2 == null ? C15558v2.f64805a.mo74920a() : g1Var2;
            gVar2 = C15408g0.m94273e(C15503p1.f64723a, gVar);
        }
        C15264f fVar = new C15264f(gVar2, currentThread, g1Var);
        fVar.mo74485J0(C15486m0.DEFAULT, fVar, pVar);
        return fVar.mo74641K0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m94328b(C13640g gVar, C16269p pVar, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            gVar = C13646h.f61899a;
        }
        return C15414h.m94296e(gVar, pVar);
    }
}
