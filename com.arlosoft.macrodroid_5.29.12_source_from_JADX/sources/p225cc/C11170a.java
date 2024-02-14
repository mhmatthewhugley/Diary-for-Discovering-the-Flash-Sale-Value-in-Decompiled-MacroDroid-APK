package p225cc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13964i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14834b1;
import kotlin.reflect.jvm.internal.impl.types.C14898e;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14942k1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14961p;
import kotlin.reflect.jvm.internal.impl.types.C14964p1;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.C14972s0;
import kotlin.reflect.jvm.internal.impl.types.C14980u0;
import kotlin.reflect.jvm.internal.impl.types.C14990y;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import p370qa.C16265l;
import p450zb.C17085h;

/* renamed from: cc.a */
/* compiled from: TypeUtils.kt */
public final class C11170a {

    /* renamed from: cc.a$a */
    /* compiled from: TypeUtils.kt */
    static final class C11171a extends C13708q implements C16265l<C14967q1, Boolean> {

        /* renamed from: a */
        public static final C11171a f54077a = new C11171a();

        C11171a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C14967q1 q1Var) {
            C13706o.m87929f(q1Var, "it");
            C13961h c = q1Var.mo73702N0().mo62183c();
            return Boolean.valueOf(c != null ? C11170a.m74967p(c) : false);
        }
    }

    /* renamed from: cc.a$b */
    /* compiled from: TypeUtils.kt */
    static final class C11172b extends C13708q implements C16265l<C14967q1, Boolean> {

        /* renamed from: a */
        public static final C11172b f54078a = new C11172b();

        C11172b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C14967q1 q1Var) {
            C13706o.m87929f(q1Var, "it");
            C13961h c = q1Var.mo73702N0().mo62183c();
            boolean z = false;
            if (c != null && ((c instanceof C13947d1) || (c instanceof C13950e1))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static final C14926g1 m74952a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return new C14933i1(e0Var);
    }

    /* renamed from: b */
    public static final boolean m74953b(C14900e0 e0Var, C16265l<? super C14967q1, Boolean> lVar) {
        C13706o.m87929f(e0Var, "<this>");
        C13706o.m87929f(lVar, "predicate");
        return C14956n1.m92988c(e0Var, lVar);
    }

    /* renamed from: c */
    private static final boolean m74954c(C14900e0 e0Var, C14901e1 e1Var, Set<? extends C13950e1> set) {
        boolean z;
        if (C13706o.m87924a(e0Var.mo73702N0(), e1Var)) {
            return true;
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        C13964i iVar = c instanceof C13964i ? (C13964i) c : null;
        List<C13950e1> q = iVar != null ? iVar.mo62178q() : null;
        Iterable<C13592k0> M0 = C13566b0.m87411M0(e0Var.mo73700L0());
        if (!(M0 instanceof Collection) || !((Collection) M0).isEmpty()) {
            for (C13592k0 k0Var : M0) {
                int a = k0Var.mo71842a();
                C14926g1 g1Var = (C14926g1) k0Var.mo71843b();
                C13950e1 e1Var2 = q != null ? (C13950e1) C13566b0.m87425Z(q, a) : null;
                if (((e1Var2 == null || set == null || !set.contains(e1Var2)) ? false : true) || g1Var.mo74184b()) {
                    z = false;
                    continue;
                } else {
                    C14900e0 type = g1Var.getType();
                    C13706o.m87928e(type, "argument.type");
                    z = m74954c(type, e1Var, set);
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m74955d(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return m74953b(e0Var, C11171a.f54077a);
    }

    /* renamed from: e */
    public static final C14926g1 m74956e(C14900e0 e0Var, C14970r1 r1Var, C13950e1 e1Var) {
        C13706o.m87929f(e0Var, "type");
        C13706o.m87929f(r1Var, "projectionKind");
        if ((e1Var != null ? e1Var.mo72273l() : null) == r1Var) {
            r1Var = C14970r1.INVARIANT;
        }
        return new C14933i1(r1Var, e0Var);
    }

    /* renamed from: f */
    public static final Set<C13950e1> m74957f(C14900e0 e0Var, Set<? extends C13950e1> set) {
        C13706o.m87929f(e0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m74958g(e0Var, e0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    /* renamed from: g */
    private static final void m74958g(C14900e0 e0Var, C14900e0 e0Var2, Set<C13950e1> set, Set<? extends C13950e1> set2) {
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (!(c instanceof C13950e1)) {
            C13961h c2 = e0Var.mo73702N0().mo62183c();
            C13964i iVar = c2 instanceof C13964i ? (C13964i) c2 : null;
            List<C13950e1> q = iVar != null ? iVar.mo62178q() : null;
            int i = 0;
            for (C14926g1 next : e0Var.mo73700L0()) {
                int i2 = i + 1;
                C13950e1 e1Var = q != null ? (C13950e1) C13566b0.m87425Z(q, i) : null;
                if (!((e1Var == null || set2 == null || !set2.contains(e1Var)) ? false : true) && !next.mo74184b() && !C13566b0.m87414O(set, next.getType().mo73702N0().mo62183c()) && !C13706o.m87924a(next.getType().mo73702N0(), e0Var2.mo73702N0())) {
                    C14900e0 type = next.getType();
                    C13706o.m87928e(type, "argument.type");
                    m74958g(type, e0Var2, set, set2);
                }
                i = i2;
            }
        } else if (!C13706o.m87924a(e0Var.mo73702N0(), e0Var2.mo73702N0())) {
            set.add(c);
        } else {
            for (C14900e0 next2 : ((C13950e1) c).getUpperBounds()) {
                C13706o.m87928e(next2, "upperBound");
                m74958g(next2, e0Var2, set, set2);
            }
        }
    }

    /* renamed from: h */
    public static final C13853h m74959h(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13853h m = e0Var.mo73702N0().mo72371m();
        C13706o.m87928e(m, "constructor.builtIns");
        return m;
    }

    /* renamed from: i */
    public static final C14900e0 m74960i(C13950e1 e1Var) {
        T t;
        C13706o.m87929f(e1Var, "<this>");
        List<C14900e0> upperBounds = e1Var.getUpperBounds();
        C13706o.m87928e(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List<C14900e0> upperBounds2 = e1Var.getUpperBounds();
        C13706o.m87928e(upperBounds2, "upperBounds");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T c = ((C14900e0) next).mo73702N0().mo62183c();
            if (c instanceof C13948e) {
                t = (C13948e) c;
            }
            boolean z = false;
            if (!(t == null || t.mo62168h() == C13951f.INTERFACE || t.mo62168h() == C13951f.ANNOTATION_CLASS)) {
                z = true;
                continue;
            }
            if (z) {
                t = next;
                break;
            }
        }
        C14900e0 e0Var = (C14900e0) t;
        if (e0Var != null) {
            return e0Var;
        }
        List<C14900e0> upperBounds3 = e1Var.getUpperBounds();
        C13706o.m87928e(upperBounds3, "upperBounds");
        Object W = C13566b0.m87422W(upperBounds3);
        C13706o.m87928e(W, "upperBounds.first()");
        return (C14900e0) W;
    }

    /* renamed from: j */
    public static final boolean m74961j(C13950e1 e1Var) {
        C13706o.m87929f(e1Var, "typeParameter");
        return m74963l(e1Var, (C14901e1) null, (Set) null, 6, (Object) null);
    }

    /* renamed from: k */
    public static final boolean m74962k(C13950e1 e1Var, C14901e1 e1Var2, Set<? extends C13950e1> set) {
        boolean z;
        C13706o.m87929f(e1Var, "typeParameter");
        List<C14900e0> upperBounds = e1Var.getUpperBounds();
        C13706o.m87928e(upperBounds, "typeParameter.upperBounds");
        if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
            for (C14900e0 e0Var : upperBounds) {
                C13706o.m87928e(e0Var, "upperBound");
                if (!m74954c(e0Var, e1Var.mo72274p().mo73702N0(), set) || (e1Var2 != null && !C13706o.m87924a(e0Var.mo73702N0(), e1Var2))) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m74963l(C13950e1 e1Var, C14901e1 e1Var2, Set set, int i, Object obj) {
        if ((i & 2) != 0) {
            e1Var2 = null;
        }
        if ((i & 4) != 0) {
            set = null;
        }
        return m74962k(e1Var, e1Var2, set);
    }

    /* renamed from: m */
    public static final boolean m74964m(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        if (!(e0Var instanceof C14898e)) {
            if ((e0Var instanceof C14961p) && (((C14961p) e0Var).mo74226Z0() instanceof C14898e)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public static final boolean m74965n(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        if (!(e0Var instanceof C14980u0)) {
            if ((e0Var instanceof C14961p) && (((C14961p) e0Var).mo74226Z0() instanceof C14980u0)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static final boolean m74966o(C14900e0 e0Var, C14900e0 e0Var2) {
        C13706o.m87929f(e0Var, "<this>");
        C13706o.m87929f(e0Var2, "superType");
        return C14844e.f63967a.mo74060d(e0Var, e0Var2);
    }

    /* renamed from: p */
    public static final boolean m74967p(C13961h hVar) {
        C13706o.m87929f(hVar, "<this>");
        return (hVar instanceof C13950e1) && (((C13950e1) hVar).mo62163b() instanceof C13947d1);
    }

    /* renamed from: q */
    public static final boolean m74968q(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return C14956n1.m92998m(e0Var);
    }

    /* renamed from: r */
    public static final boolean m74969r(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "type");
        return (e0Var instanceof C17085h) && ((C17085h) e0Var).mo80354X0().mo80360e();
    }

    /* renamed from: s */
    public static final C14900e0 m74970s(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14900e0 n = C14956n1.m92999n(e0Var);
        C13706o.m87928e(n, "makeNotNullable(this)");
        return n;
    }

    /* renamed from: t */
    public static final C14900e0 m74971t(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C14900e0 o = C14956n1.m93000o(e0Var);
        C13706o.m87928e(o, "makeNullable(this)");
        return o;
    }

    /* renamed from: u */
    public static final C14900e0 m74972u(C14900e0 e0Var, C13921g gVar) {
        C13706o.m87929f(e0Var, "<this>");
        C13706o.m87929f(gVar, "newAnnotations");
        if (!e0Var.getAnnotations().isEmpty() || !gVar.isEmpty()) {
            return e0Var.mo74145Q0().mo72949T0(C14834b1.m92418a(e0Var.mo73701M0(), gVar));
        }
        return e0Var;
    }

    /* renamed from: v */
    public static final C14900e0 m74973v(C14900e0 e0Var, C14945l1 l1Var, Map<C14901e1, ? extends C14926g1> map, C14970r1 r1Var, Set<? extends C13950e1> set) {
        C14967q1 q1Var;
        C14945l1 l1Var2 = l1Var;
        Map<C14901e1, ? extends C14926g1> map2 = map;
        C14970r1 r1Var2 = r1Var;
        Set<? extends C13950e1> set2 = set;
        C13706o.m87929f(e0Var, "<this>");
        C13706o.m87929f(l1Var2, "substitutor");
        C13706o.m87929f(map2, "substitutionMap");
        C13706o.m87929f(r1Var2, "variance");
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (Q0 instanceof C14990y) {
            C14990y yVar = (C14990y) Q0;
            C14951m0 V0 = yVar.mo74251V0();
            if (!V0.mo73702N0().getParameters().isEmpty() && V0.mo73702N0().mo62183c() != null) {
                List<C13950e1> parameters = V0.mo73702N0().getParameters();
                C13706o.m87928e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
                for (C13950e1 e1Var : parameters) {
                    C14926g1 g1Var = (C14926g1) C13566b0.m87425Z(e0Var.mo73700L0(), e1Var.mo72272i());
                    if ((set2 != null && set2.contains(e1Var)) || g1Var == null || !map2.containsKey(g1Var.getType().mo73702N0())) {
                        g1Var = new C14972s0(e1Var);
                    }
                    arrayList.add(g1Var);
                }
                V0 = C14942k1.m92926f(V0, arrayList, (C14830a1) null, 2, (Object) null);
            }
            C14951m0 W0 = yVar.mo74252W0();
            if (!W0.mo73702N0().getParameters().isEmpty() && W0.mo73702N0().mo62183c() != null) {
                List<C13950e1> parameters2 = W0.mo73702N0().getParameters();
                C13706o.m87928e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(parameters2, 10));
                for (C13950e1 e1Var2 : parameters2) {
                    C14926g1 g1Var2 = (C14926g1) C13566b0.m87425Z(e0Var.mo73700L0(), e1Var2.mo72272i());
                    if ((set2 != null && set2.contains(e1Var2)) || g1Var2 == null || !map2.containsKey(g1Var2.getType().mo73702N0())) {
                        g1Var2 = new C14972s0(e1Var2);
                    }
                    arrayList2.add(g1Var2);
                }
                W0 = C14942k1.m92926f(W0, arrayList2, (C14830a1) null, 2, (Object) null);
            }
            q1Var = C14906f0.m92816d(V0, W0);
        } else if (Q0 instanceof C14951m0) {
            C14951m0 m0Var = (C14951m0) Q0;
            if (m0Var.mo73702N0().getParameters().isEmpty() || m0Var.mo73702N0().mo62183c() == null) {
                q1Var = m0Var;
            } else {
                List<C13950e1> parameters3 = m0Var.mo73702N0().getParameters();
                C13706o.m87928e(parameters3, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(C13616u.m87774u(parameters3, 10));
                for (C13950e1 e1Var3 : parameters3) {
                    C14926g1 g1Var3 = (C14926g1) C13566b0.m87425Z(e0Var.mo73700L0(), e1Var3.mo72272i());
                    if ((set2 != null && set2.contains(e1Var3)) || g1Var3 == null || !map2.containsKey(g1Var3.getType().mo73702N0())) {
                        g1Var3 = new C14972s0(e1Var3);
                    }
                    arrayList3.add(g1Var3);
                }
                q1Var = C14942k1.m92926f(m0Var, arrayList3, (C14830a1) null, 2, (Object) null);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C14900e0 n = l1Var2.mo74214n(C14964p1.m93055b(q1Var, Q0), r1Var2);
        C13706o.m87928e(n, "replaceArgumentsByParame…ubstitute(it, variance) }");
        return n;
    }

    /* renamed from: w */
    public static final C14900e0 m74974w(C14900e0 e0Var) {
        C14951m0 m0Var;
        C13706o.m87929f(e0Var, "<this>");
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (Q0 instanceof C14990y) {
            C14990y yVar = (C14990y) Q0;
            C14951m0 V0 = yVar.mo74251V0();
            if (!V0.mo73702N0().getParameters().isEmpty() && V0.mo73702N0().mo62183c() != null) {
                List<C13950e1> parameters = V0.mo73702N0().getParameters();
                C13706o.m87928e(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
                for (C13950e1 s0Var : parameters) {
                    arrayList.add(new C14972s0(s0Var));
                }
                V0 = C14942k1.m92926f(V0, arrayList, (C14830a1) null, 2, (Object) null);
            }
            C14951m0 W0 = yVar.mo74252W0();
            if (!W0.mo73702N0().getParameters().isEmpty() && W0.mo73702N0().mo62183c() != null) {
                List<C13950e1> parameters2 = W0.mo73702N0().getParameters();
                C13706o.m87928e(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(C13616u.m87774u(parameters2, 10));
                for (C13950e1 s0Var2 : parameters2) {
                    arrayList2.add(new C14972s0(s0Var2));
                }
                W0 = C14942k1.m92926f(W0, arrayList2, (C14830a1) null, 2, (Object) null);
            }
            m0Var = C14906f0.m92816d(V0, W0);
        } else if (Q0 instanceof C14951m0) {
            C14951m0 m0Var2 = (C14951m0) Q0;
            boolean isEmpty = m0Var2.mo73702N0().getParameters().isEmpty();
            m0Var = m0Var2;
            if (!isEmpty) {
                C13961h c = m0Var2.mo73702N0().mo62183c();
                m0Var = m0Var2;
                if (c != null) {
                    List<C13950e1> parameters3 = m0Var2.mo73702N0().getParameters();
                    C13706o.m87928e(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(C13616u.m87774u(parameters3, 10));
                    for (C13950e1 s0Var3 : parameters3) {
                        arrayList3.add(new C14972s0(s0Var3));
                    }
                    m0Var = C14942k1.m92926f(m0Var2, arrayList3, (C14830a1) null, 2, (Object) null);
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C14964p1.m93055b(m0Var, Q0);
    }

    /* renamed from: x */
    public static final boolean m74975x(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return m74953b(e0Var, C11172b.f54078a);
    }
}
