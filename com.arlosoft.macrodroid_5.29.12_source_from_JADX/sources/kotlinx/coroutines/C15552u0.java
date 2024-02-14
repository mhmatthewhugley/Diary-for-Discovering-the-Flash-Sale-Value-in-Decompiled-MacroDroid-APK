package kotlinx.coroutines;

import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13636e;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13660h;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, mo71668d2 = {"", "timeMillis", "Lja/u;", "a", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "Lkotlinx/coroutines/t0;", "b", "(Lkotlin/coroutines/g;)Lkotlinx/coroutines/t0;", "delay", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.u0 */
/* compiled from: Delay.kt */
public final class C15552u0 {
    /* renamed from: a */
    public static final Object m94699a(long j, C13635d<? super C13339u> dVar) {
        if (j <= 0) {
            return C13339u.f61331a;
        }
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        if (j < LocationRequestCompat.PASSIVE_INTERVAL) {
            m94700b(oVar.getContext()).mo74504f(j, oVar);
        }
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w == C13652d.m87832c() ? w : C13339u.f61331a;
    }

    /* renamed from: b */
    public static final C15546t0 m94700b(C13640g gVar) {
        C13640g.C13643b bVar = gVar.get(C13636e.f61896u);
        C15546t0 t0Var = bVar instanceof C15546t0 ? (C15546t0) bVar : null;
        return t0Var == null ? C15506q0.m94590a() : t0Var;
    }
}
