package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.C13640g;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u001a\n\u0010\r\u001a\u00020\u000b*\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0007¨\u0006\u000f"}, mo71668d2 = {"Lkotlinx/coroutines/w1;", "parent", "Lkotlinx/coroutines/z;", "a", "Lkotlinx/coroutines/c1;", "handle", "e", "Lkotlin/coroutines/g;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lja/u;", "c", "g", "f", "kotlinx-coroutines-core"}, mo71669k = 5, mo71670mv = {1, 6, 0}, mo71673xs = "kotlinx/coroutines/JobKt")
/* renamed from: kotlinx.coroutines.b2 */
/* compiled from: Job.kt */
final /* synthetic */ class C15198b2 {
    /* renamed from: a */
    public static final C15573z m93745a(C15561w1 w1Var) {
        return new C15571y1(w1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C15573z m93746b(C15561w1 w1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            w1Var = null;
        }
        return C15575z1.m94753a(w1Var);
    }

    /* renamed from: c */
    public static final void m93747c(C13640g gVar, CancellationException cancellationException) {
        C15561w1 w1Var = (C15561w1) gVar.get(C15561w1.f64808x);
        if (w1Var != null) {
            w1Var.mo74534c(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m93748d(C13640g gVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C15575z1.m94755c(gVar, cancellationException);
    }

    /* renamed from: e */
    public static final C15202c1 m93749e(C15561w1 w1Var, C15202c1 c1Var) {
        return w1Var.mo74617p(new C15261e1(c1Var));
    }

    /* renamed from: f */
    public static final void m93750f(C13640g gVar) {
        C15561w1 w1Var = (C15561w1) gVar.get(C15561w1.f64808x);
        if (w1Var != null) {
            C15575z1.m94760h(w1Var);
        }
    }

    /* renamed from: g */
    public static final void m93751g(C15561w1 w1Var) {
        if (!w1Var.mo74487b()) {
            throw w1Var.mo74612g();
        }
    }
}
