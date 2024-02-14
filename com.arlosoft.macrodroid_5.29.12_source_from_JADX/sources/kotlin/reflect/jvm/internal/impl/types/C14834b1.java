package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14994z0;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.b1 */
/* compiled from: TypeAttributes.kt */
public final class C14834b1 {
    /* renamed from: a */
    public static final C14830a1 m92418a(C14830a1 a1Var, C13921g gVar) {
        C14830a1 m;
        C13706o.m87929f(a1Var, "<this>");
        C13706o.m87929f(gVar, "newAnnotations");
        if (C14940k.m92916a(a1Var) == gVar) {
            return a1Var;
        }
        C14934j b = C14940k.m92917b(a1Var);
        if (!(b == null || (m = a1Var.mo74048m(b)) == null)) {
            a1Var = m;
        }
        if (gVar.iterator().hasNext() || !gVar.isEmpty()) {
            return a1Var.mo74047l(new C14934j(gVar));
        }
        return a1Var;
    }

    /* renamed from: b */
    public static final C14830a1 m92419b(C13921g gVar) {
        C13706o.m87929f(gVar, "<this>");
        return C14994z0.C14995a.m93195a(C14958o.f64084a, gVar, (C14901e1) null, (C14064m) null, 6, (Object) null);
    }
}
