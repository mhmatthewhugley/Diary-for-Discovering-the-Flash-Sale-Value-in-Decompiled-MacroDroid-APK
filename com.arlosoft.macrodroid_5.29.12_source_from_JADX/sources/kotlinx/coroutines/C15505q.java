package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlinx.coroutines.internal.C15441f;
import kotlinx.coroutines.internal.C15455o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, mo71668d2 = {"T", "Lkotlin/coroutines/d;", "delegate", "Lkotlinx/coroutines/o;", "b", "Lkotlinx/coroutines/n;", "Lkotlinx/coroutines/internal/o;", "node", "Lja/u;", "c", "Lkotlinx/coroutines/c1;", "handle", "a", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.q */
/* compiled from: CancellableContinuation.kt */
public final class C15505q {
    /* renamed from: a */
    public static final void m94587a(C15492n<?> nVar, C15202c1 c1Var) {
        nVar.mo74843d(new C15251d1(c1Var));
    }

    /* renamed from: b */
    public static final <T> C15497o<T> m94588b(C13635d<? super T> dVar) {
        if (!(dVar instanceof C15441f)) {
            return new C15497o<>(dVar, 1);
        }
        C15497o<T> m = ((C15441f) dVar).mo74768m();
        if (m == null || !m.mo74855J()) {
            m = null;
        }
        return m == null ? new C15497o<>(dVar, 2) : m;
    }

    /* renamed from: c */
    public static final void m94589c(C15492n<?> nVar, C15455o oVar) {
        nVar.mo74843d(new C15491m2(oVar));
    }
}
