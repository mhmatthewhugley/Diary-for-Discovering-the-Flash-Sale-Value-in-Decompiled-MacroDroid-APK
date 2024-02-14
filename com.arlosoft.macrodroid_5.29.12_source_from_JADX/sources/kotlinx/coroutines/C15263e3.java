package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlinx.coroutines.internal.C15441f;
import kotlinx.coroutines.internal.C15443g;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, mo71668d2 = {"Lja/u;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, mo71669k = 2, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.e3 */
/* compiled from: Yield.kt */
public final class C15263e3 {
    /* renamed from: a */
    public static final Object m94032a(C13635d<? super C13339u> dVar) {
        Object obj;
        C13640g context = dVar.getContext();
        C15575z1.m94759g(context);
        C13635d b = C13649c.m87831b(dVar);
        C15441f fVar = b instanceof C15441f ? (C15441f) b : null;
        if (fVar == null) {
            obj = C13339u.f61331a;
        } else {
            if (fVar.f64650f.isDispatchNeeded(context)) {
                fVar.mo74769n(context, C13339u.f61331a);
            } else {
                C15257d3 d3Var = new C15257d3();
                C13640g plus = context.plus(d3Var);
                C13339u uVar = C13339u.f61331a;
                fVar.mo74769n(plus, uVar);
                if (d3Var.f64472a) {
                    obj = C15443g.m94382d(fVar) ? C13652d.m87832c() : uVar;
                }
            }
            obj = C13652d.m87832c();
        }
        if (obj == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return obj == C13652d.m87832c() ? obj : C13339u.f61331a;
    }
}
