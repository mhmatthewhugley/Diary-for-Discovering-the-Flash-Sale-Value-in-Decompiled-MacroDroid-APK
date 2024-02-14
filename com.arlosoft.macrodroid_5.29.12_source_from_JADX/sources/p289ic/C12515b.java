package p289ic;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13698j0;
import kotlinx.coroutines.C15196b0;
import kotlinx.coroutines.C15262e2;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.C15437e0;
import kotlinx.coroutines.internal.C15471y;
import p297ja.C13329n;
import p297ja.C13332o;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aT\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aV\u0010\f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aV\u0010\u000e\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, mo71668d2 = {"R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "receiver", "completion", "Lja/u;", "a", "(Lqa/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "Lkotlinx/coroutines/internal/y;", "block", "b", "(Lkotlinx/coroutines/internal/y;Ljava/lang/Object;Lqa/p;)Ljava/lang/Object;", "c", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: ic.b */
/* compiled from: Undispatched.kt */
public final class C12515b {
    /* renamed from: a */
    public static final <R, T> void m83622a(C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar, R r, C13635d<? super T> dVar) {
        C13640g context;
        Object c;
        C13635d<? super T> a = C13660h.m87845a(dVar);
        try {
            context = dVar.getContext();
            c = C15437e0.m94362c(context, (Object) null);
            Object invoke = ((C16269p) C13698j0.m87907g(pVar, 2)).invoke(r, a);
            C15437e0.m94360a(context, c);
            if (invoke != C13652d.m87832c()) {
                C13329n.C13330a aVar = C13329n.f61327a;
                a.resumeWith(C13329n.m85676a(invoke));
            }
        } catch (Throwable th) {
            C13329n.C13330a aVar2 = C13329n.f61327a;
            a.resumeWith(C13329n.m85676a(C13332o.m85684a(th)));
        }
    }

    /* renamed from: b */
    public static final <T, R> Object m83623b(C15471y<? super T> yVar, R r, C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar) {
        Object obj;
        try {
            obj = ((C16269p) C13698j0.m87907g(pVar, 2)).invoke(r, yVar);
        } catch (Throwable th) {
            obj = new C15196b0(th, false, 2, (C13695i) null);
        }
        if (obj == C13652d.m87832c()) {
            return C13652d.m87832c();
        }
        Object j0 = yVar.mo74616j0(obj);
        if (j0 == C15262e2.f64475b) {
            return C13652d.m87832c();
        }
        if (!(j0 instanceof C15196b0)) {
            return C15262e2.m94031h(j0);
        }
        throw ((C15196b0) j0).f64404a;
    }

    /* renamed from: c */
    public static final <T, R> Object m83624c(C15471y<? super T> yVar, R r, C16269p<? super R, ? super C13635d<? super T>, ? extends Object> pVar) {
        Object obj;
        boolean z = false;
        try {
            obj = ((C16269p) C13698j0.m87907g(pVar, 2)).invoke(r, yVar);
        } catch (Throwable th) {
            obj = new C15196b0(th, false, 2, (C13695i) null);
        }
        if (obj == C13652d.m87832c()) {
            return C13652d.m87832c();
        }
        Object j0 = yVar.mo74616j0(obj);
        if (j0 == C15262e2.f64475b) {
            return C13652d.m87832c();
        }
        if (j0 instanceof C15196b0) {
            Throwable th2 = ((C15196b0) j0).f64404a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).coroutine != yVar) {
                z = true;
            }
            if (z) {
                throw th2;
            } else if (obj instanceof C15196b0) {
                throw ((C15196b0) obj).f64404a;
            }
        } else {
            obj = C15262e2.m94031h(j0);
        }
        return obj;
    }
}
