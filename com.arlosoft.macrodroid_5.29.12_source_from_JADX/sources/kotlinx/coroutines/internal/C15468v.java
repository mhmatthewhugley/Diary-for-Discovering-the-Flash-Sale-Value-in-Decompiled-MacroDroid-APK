package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.C15498o0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo71668d2 = {"Lkotlinx/coroutines/internal/v;", "", "affected", "c", "", "toString", "that", "", "b", "Lkotlinx/coroutines/internal/c;", "a", "()Lkotlinx/coroutines/internal/c;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.v */
/* compiled from: Atomic.kt */
public abstract class C15468v {
    /* renamed from: a */
    public abstract C15432c<?> mo74755a();

    /* renamed from: b */
    public final boolean mo74826b(C15468v vVar) {
        C15432c<?> a;
        C15432c<?> a2 = mo74755a();
        if (a2 == null || (a = vVar.mo74755a()) == null || a2.mo74759f() >= a.mo74759f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo74756c(Object obj);

    public String toString() {
        return C15498o0.m94571a(this) + '@' + C15498o0.m94572b(this);
    }
}
