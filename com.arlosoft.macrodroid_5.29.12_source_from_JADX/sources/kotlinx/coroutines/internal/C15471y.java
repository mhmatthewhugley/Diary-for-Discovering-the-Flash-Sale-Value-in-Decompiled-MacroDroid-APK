package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13657e;
import kotlinx.coroutines.C15184a;
import kotlinx.coroutines.C15260e0;
import kotlinx.coroutines.C15545t;
import kotlinx.coroutines.C15561w1;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118DX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158@X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, mo71668d2 = {"Lkotlinx/coroutines/internal/y;", "T", "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "state", "Lja/u;", "F", "G0", "Lkotlin/coroutines/d;", "d", "Lkotlin/coroutines/d;", "uCont", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "", "e0", "()Z", "isScopedCoroutine", "Lkotlinx/coroutines/w1;", "K0", "()Lkotlinx/coroutines/w1;", "parent", "Lkotlin/coroutines/g;", "context", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.y */
/* compiled from: Scopes.kt */
public class C15471y<T> extends C15184a<T> implements C13657e {

    /* renamed from: d */
    public final C13635d<T> f64696d;

    public C15471y(C13640g gVar, C13635d<? super T> dVar) {
        super(gVar, true, true);
        this.f64696d = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo74600F(Object obj) {
        C15443g.m94381c(C13649c.m87831b(this.f64696d), C15260e0.m94019a(obj, this.f64696d), (C16265l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public void mo74482G0(Object obj) {
        C13635d<T> dVar = this.f64696d;
        dVar.resumeWith(C15260e0.m94019a(obj, dVar));
    }

    /* renamed from: K0 */
    public final C15561w1 mo74832K0() {
        C15545t Z = mo74607Z();
        if (Z == null) {
            return null;
        }
        return Z.getParent();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public final boolean mo74611e0() {
        return true;
    }

    public final C13657e getCallerFrame() {
        C13635d<T> dVar = this.f64696d;
        if (dVar instanceof C13657e) {
            return (C13657e) dVar;
        }
        return null;
    }
}
