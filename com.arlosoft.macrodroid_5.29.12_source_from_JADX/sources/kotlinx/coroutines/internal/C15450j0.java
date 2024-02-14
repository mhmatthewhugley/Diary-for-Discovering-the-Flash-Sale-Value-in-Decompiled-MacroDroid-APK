package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13640g;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15549t2;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, mo71668d2 = {"Lkotlinx/coroutines/internal/j0;", "", "Lkotlinx/coroutines/t2;", "element", "value", "Lja/u;", "a", "Lkotlin/coroutines/g;", "context", "b", "Lkotlin/coroutines/g;", "", "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/t2;", "elements", "", "d", "I", "i", "n", "<init>", "(Lkotlin/coroutines/g;I)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.j0 */
/* compiled from: ThreadContext.kt */
final class C15450j0 {

    /* renamed from: a */
    public final C13640g f64663a;

    /* renamed from: b */
    private final Object[] f64664b;

    /* renamed from: c */
    private final C15549t2<Object>[] f64665c;

    /* renamed from: d */
    private int f64666d;

    public C15450j0(C13640g gVar, int i) {
        this.f64663a = gVar;
        this.f64664b = new Object[i];
        this.f64665c = new C15549t2[i];
    }

    /* renamed from: a */
    public final void mo74791a(C15549t2<?> t2Var, Object obj) {
        Object[] objArr = this.f64664b;
        int i = this.f64666d;
        objArr[i] = obj;
        C15549t2<Object>[] t2VarArr = this.f64665c;
        this.f64666d = i + 1;
        t2VarArr[i] = t2Var;
    }

    /* renamed from: b */
    public final void mo74792b(C13640g gVar) {
        int length = this.f64665c.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                C15549t2<Object> t2Var = this.f64665c[length];
                C13706o.m87926c(t2Var);
                t2Var.mo74775r(gVar, this.f64664b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        }
    }
}
