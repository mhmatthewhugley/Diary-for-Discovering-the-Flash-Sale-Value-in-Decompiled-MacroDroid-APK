package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.internal.C15436e;
import kotlinx.coroutines.internal.C15471y;
import p289ic.C12515b;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H@ø\u0001\u0000\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, mo71668d2 = {"R", "Lkotlin/Function2;", "Lkotlinx/coroutines/k0;", "Lkotlin/coroutines/d;", "", "block", "d", "(Lqa/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "context", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lja/u;", "b", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.l0 */
/* compiled from: CoroutineScope.kt */
public final class C15482l0 {
    /* renamed from: a */
    public static final C15478k0 m94502a(C13640g gVar) {
        if (gVar.get(C15561w1.f64808x) == null) {
            gVar = gVar.plus(C15198b2.m93746b((C15561w1) null, 1, (Object) null));
        }
        return new C15436e(gVar);
    }

    /* renamed from: b */
    public static final void m94503b(C15478k0 k0Var, CancellationException cancellationException) {
        C15561w1 w1Var = (C15561w1) k0Var.getCoroutineContext().get(C15561w1.f64808x);
        if (w1Var != null) {
            w1Var.mo74534c(cancellationException);
            return;
        }
        throw new IllegalStateException(C13706o.m87936m("Scope cannot be cancelled because it does not have a job: ", k0Var).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ void m94504c(C15478k0 k0Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m94503b(k0Var, cancellationException);
    }

    /* renamed from: d */
    public static final <R> Object m94505d(C16269p<? super C15478k0, ? super C13635d<? super R>, ? extends Object> pVar, C13635d<? super R> dVar) {
        C15471y yVar = new C15471y(dVar.getContext(), dVar);
        Object b = C12515b.m83623b(yVar, yVar, pVar);
        if (b == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return b;
    }
}
