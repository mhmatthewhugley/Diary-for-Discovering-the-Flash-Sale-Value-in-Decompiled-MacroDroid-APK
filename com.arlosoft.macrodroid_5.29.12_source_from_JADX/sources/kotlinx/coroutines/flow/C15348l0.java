package kotlinx.coroutines.flow;

import androidx.concurrent.futures.C0320a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15497o;
import kotlinx.coroutines.flow.internal.C15301b;
import kotlinx.coroutines.flow.internal.C15302c;
import p297ja.C13329n;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo71668d2 = {"Lkotlinx/coroutines/flow/l0;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/j0;", "flow", "", "c", "(Lkotlinx/coroutines/flow/j0;)Z", "", "Lkotlin/coroutines/d;", "Lja/u;", "e", "(Lkotlinx/coroutines/flow/j0;)[Lkotlin/coroutines/d;", "f", "()V", "g", "()Z", "d", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.l0 */
/* compiled from: StateFlow.kt */
final class C15348l0 extends C15302c<C15342j0<?>> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f64565a = AtomicReferenceFieldUpdater.newUpdater(C15348l0.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    /* renamed from: c */
    public boolean mo74661a(C15342j0<?> j0Var) {
        if (this._state != null) {
            return false;
        }
        this._state = C15346k0.f64563a;
        return true;
    }

    /* renamed from: d */
    public final Object mo74702d(C13635d<? super C13339u> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        if (!C0320a.m383a(f64565a, this, C15346k0.f64563a, oVar)) {
            C13329n.C13330a aVar = C13329n.f61327a;
            oVar.resumeWith(C13329n.m85676a(C13339u.f61331a));
        }
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w == C13652d.m87832c() ? w : C13339u.f61331a;
    }

    /* renamed from: e */
    public C13635d<C13339u>[] mo74662b(C15342j0<?> j0Var) {
        this._state = null;
        return C15301b.f64532a;
    }

    /* renamed from: f */
    public final void mo74704f() {
        while (true) {
            Object obj = this._state;
            if (obj != null && obj != C15346k0.f64564b) {
                if (obj == C15346k0.f64563a) {
                    if (C0320a.m383a(f64565a, this, obj, C15346k0.f64564b)) {
                        return;
                    }
                } else if (C0320a.m383a(f64565a, this, obj, C15346k0.f64563a)) {
                    C13329n.C13330a aVar = C13329n.f61327a;
                    ((C15497o) obj).resumeWith(C13329n.m85676a(C13339u.f61331a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo74705g() {
        Object andSet = f64565a.getAndSet(this, C15346k0.f64563a);
        C13706o.m87926c(andSet);
        return andSet == C15346k0.f64564b;
    }
}
