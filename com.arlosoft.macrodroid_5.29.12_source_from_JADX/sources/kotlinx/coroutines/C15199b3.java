package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.internal.C15437e0;
import kotlinx.coroutines.internal.C15471y;
import p297ja.C13328m;
import p297ja.C13337s;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, mo71668d2 = {"Lkotlinx/coroutines/b3;", "T", "Lkotlinx/coroutines/internal/y;", "Lkotlin/coroutines/g;", "context", "", "oldValue", "Lja/u;", "M0", "", "L0", "state", "G0", "Ljava/lang/ThreadLocal;", "Lja/m;", "f", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/d;", "uCont", "<init>", "(Lkotlin/coroutines/g;Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.b3 */
/* compiled from: CoroutineContext.kt */
public final class C15199b3<T> extends C15471y<T> {

    /* renamed from: f */
    private ThreadLocal<C13328m<C13640g, Object>> f64406f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15199b3(kotlin.coroutines.C13640g r3, kotlin.coroutines.C13635d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.c3 r0 = kotlinx.coroutines.C15204c3.f64410a
            kotlin.coroutines.g$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            kotlin.coroutines.g r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f64406f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15199b3.<init>(kotlin.coroutines.g, kotlin.coroutines.d):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public void mo74482G0(Object obj) {
        C13328m mVar = this.f64406f.get();
        C15199b3<?> b3Var = null;
        if (mVar != null) {
            C15437e0.m94360a((C13640g) mVar.mo70152a(), mVar.mo70153b());
            this.f64406f.set(b3Var);
        }
        Object a = C15260e0.m94019a(obj, this.f64696d);
        C13635d<T> dVar = this.f64696d;
        C13640g context = dVar.getContext();
        Object c = C15437e0.m94362c(context, b3Var);
        if (c != C15437e0.f64642a) {
            b3Var = C15408g0.m94275g(dVar, context, c);
        }
        try {
            this.f64696d.resumeWith(a);
            C13339u uVar = C13339u.f61331a;
        } finally {
            if (b3Var == null || b3Var.mo74514L0()) {
                C15437e0.m94360a(context, c);
            }
        }
    }

    /* renamed from: L0 */
    public final boolean mo74514L0() {
        if (this.f64406f.get() == null) {
            return false;
        }
        this.f64406f.set((Object) null);
        return true;
    }

    /* renamed from: M0 */
    public final void mo74515M0(C13640g gVar, Object obj) {
        this.f64406f.set(C13337s.m85692a(gVar, obj));
    }
}
