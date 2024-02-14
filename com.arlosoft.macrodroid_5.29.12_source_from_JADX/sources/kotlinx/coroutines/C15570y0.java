package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlinx.coroutines.internal.C15437e0;
import kotlinx.coroutines.internal.C15441f;
import p297ja.C13329n;
import p297ja.C13332o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\"\u0018\u0010\u000e\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\b*\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, mo71668d2 = {"T", "Lkotlinx/coroutines/x0;", "", "mode", "Lja/u;", "a", "Lkotlin/coroutines/d;", "delegate", "", "undispatched", "d", "e", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y0 */
/* compiled from: DispatchedTask.kt */
public final class C15570y0 {
    /* renamed from: a */
    public static final <T> void m94744a(C15566x0<? super T> x0Var, int i) {
        C13635d<? super T> c = x0Var.mo74765c();
        boolean z = i == 4;
        if (z || !(c instanceof C15441f) || m94745b(i) != m94745b(x0Var.f64813d)) {
            m94747d(x0Var, c, z);
            return;
        }
        C15415h0 h0Var = ((C15441f) c).f64650f;
        C13640g context = c.getContext();
        if (h0Var.isDispatchNeeded(context)) {
            h0Var.dispatch(context, x0Var);
        } else {
            m94748e(x0Var);
        }
    }

    /* renamed from: b */
    public static final boolean m94745b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m94746c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m94747d(C15566x0<? super T> x0Var, C13635d<? super T> dVar, boolean z) {
        Object obj;
        Object h = x0Var.mo74766h();
        Throwable e = x0Var.mo74856e(h);
        if (e != null) {
            C13329n.C13330a aVar = C13329n.f61327a;
            obj = C13332o.m85684a(e);
        } else {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            obj = x0Var.mo74857f(h);
        }
        Object a = C13329n.m85676a(obj);
        if (z) {
            C15441f fVar = (C15441f) dVar;
            C13635d<T> dVar2 = fVar.f64651g;
            Object obj2 = fVar.f64653p;
            C13640g context = dVar2.getContext();
            Object c = C15437e0.m94362c(context, obj2);
            C15199b3<?> g = c != C15437e0.f64642a ? C15408g0.m94275g(dVar2, context, c) : null;
            try {
                fVar.f64651g.resumeWith(a);
                C13339u uVar = C13339u.f61331a;
            } finally {
                if (g == null || g.mo74514L0()) {
                    C15437e0.m94360a(context, c);
                }
            }
        } else {
            dVar.resumeWith(a);
        }
    }

    /* renamed from: e */
    private static final void m94748e(C15566x0<?> x0Var) {
        C15412g1 b = C15558v2.f64805a.mo74921b();
        if (b.mo74722H()) {
            b.mo74719C(x0Var);
            return;
        }
        b.mo74721E(true);
        try {
            m94747d(x0Var, x0Var.mo74765c(), true);
            do {
            } while (b.mo74725L());
        } catch (Throwable th) {
            b.mo74727o(true);
            throw th;
        }
        b.mo74727o(true);
    }
}
