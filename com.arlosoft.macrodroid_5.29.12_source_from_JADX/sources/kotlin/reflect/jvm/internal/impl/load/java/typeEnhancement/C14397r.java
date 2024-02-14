package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13873d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13929k;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14865q;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r */
/* compiled from: typeEnhancement.kt */
public final class C14397r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C14344c f63171a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C14344c f63172b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r$a */
    /* compiled from: typeEnhancement.kt */
    public /* synthetic */ class C14398a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63173a;

        static {
            int[] iArr = new int[C14352h.values().length];
            iArr[C14352h.NULLABLE.ordinal()] = 1;
            iArr[C14352h.NOT_NULL.ordinal()] = 2;
            f63173a = iArr;
        }
    }

    static {
        C16152c cVar = C14163a0.f62804u;
        C13706o.m87928e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        f63171a = new C14344c(cVar);
        C16152c cVar2 = C14163a0.f62805v;
        C13706o.m87928e(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        f63172b = new C14344c(cVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C13921g m90436f(List<? extends C13921g> list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        } else if (size != 1) {
            return new C13929k((List<? extends C13921g>) C13566b0.m87402F0(list));
        } else {
            return (C13921g) C13566b0.m87446u0(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C13961h m90437g(C13961h hVar, C14348e eVar, C14394o oVar) {
        C13873d dVar = C13873d.f62132a;
        if (!C14395p.m90429a(oVar) || !(hVar instanceof C13948e)) {
            return null;
        }
        if (eVar.mo73016c() == C14350f.READ_ONLY && oVar == C14394o.FLEXIBLE_LOWER) {
            C13948e eVar2 = (C13948e) hVar;
            if (dVar.mo72186c(eVar2)) {
                return dVar.mo72184a(eVar2);
            }
        }
        if (eVar.mo73016c() != C14350f.MUTABLE || oVar != C14394o.FLEXIBLE_UPPER) {
            return null;
        }
        C13948e eVar3 = (C13948e) hVar;
        if (dVar.mo72187d(eVar3)) {
            return dVar.mo72185b(eVar3);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final Boolean m90438h(C14348e eVar, C14394o oVar) {
        if (!C14395p.m90429a(oVar)) {
            return null;
        }
        C14352h d = eVar.mo73017d();
        int i = d == null ? -1 : C14398a.f63173a[d.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public static final boolean m90439i(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return C14399s.m90442c(C14865q.f63991a, e0Var);
    }
}
