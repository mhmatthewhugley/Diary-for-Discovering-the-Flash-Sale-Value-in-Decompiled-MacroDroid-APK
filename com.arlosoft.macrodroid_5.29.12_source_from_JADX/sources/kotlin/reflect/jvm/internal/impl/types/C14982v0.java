package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14988x0;
import p225cc.C11170a;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.v0 */
/* compiled from: TypeAliasExpander.kt */
public final class C14982v0 {

    /* renamed from: c */
    public static final C14983a f64107c = new C14983a((C13695i) null);

    /* renamed from: d */
    private static final C14982v0 f64108d = new C14982v0(C14988x0.C14989a.f64116a, false);

    /* renamed from: a */
    private final C14988x0 f64109a;

    /* renamed from: b */
    private final boolean f64110b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.v0$a */
    /* compiled from: TypeAliasExpander.kt */
    public static final class C14983a {
        private C14983a() {
        }

        public /* synthetic */ C14983a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m93155b(int i, C13947d1 d1Var) {
            if (i > 100) {
                throw new AssertionError("Too deep recursion while expanding type alias " + d1Var.getName());
            }
        }
    }

    public C14982v0(C14988x0 x0Var, boolean z) {
        C13706o.m87929f(x0Var, "reportStrategy");
        this.f64109a = x0Var;
        this.f64110b = z;
    }

    /* renamed from: a */
    private final void m93141a(C13921g gVar, C13921g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((C13915c) it.next()).mo72241e());
        }
        Iterator it2 = gVar2.iterator();
        while (it2.hasNext()) {
            C13915c cVar = (C13915c) it2.next();
            if (hashSet.contains(cVar.mo72241e())) {
                this.f64109a.mo74249c(cVar);
            }
        }
    }

    /* renamed from: b */
    private final void m93142b(C14900e0 e0Var, C14900e0 e0Var2) {
        C14945l1 f = C14945l1.m92938f(e0Var2);
        C13706o.m87928e(f, "create(substitutedType)");
        int i = 0;
        for (T next : e0Var2.mo73700L0()) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            C14926g1 g1Var = (C14926g1) next;
            if (!g1Var.mo74184b()) {
                C14900e0 type = g1Var.getType();
                C13706o.m87928e(type, "substitutedArgument.type");
                if (!C11170a.m74955d(type)) {
                    C14926g1 g1Var2 = e0Var.mo73700L0().get(i);
                    C13950e1 e1Var = e0Var.mo73702N0().getParameters().get(i);
                    if (this.f64110b) {
                        C14988x0 x0Var = this.f64109a;
                        C14900e0 type2 = g1Var2.getType();
                        C13706o.m87928e(type2, "unsubstitutedArgument.type");
                        C14900e0 type3 = g1Var.getType();
                        C13706o.m87928e(type3, "substitutedArgument.type");
                        C13706o.m87928e(e1Var, "typeParameter");
                        x0Var.mo74247a(f, type2, type3, e1Var);
                    }
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    private final C14981v m93143c(C14981v vVar, C14830a1 a1Var) {
        return vVar.mo72949T0(m93148h(vVar, a1Var));
    }

    /* renamed from: d */
    private final C14951m0 m93144d(C14951m0 m0Var, C14830a1 a1Var) {
        return C14925g0.m92873a(m0Var) ? m0Var : C14942k1.m92926f(m0Var, (List) null, m93148h(m0Var, a1Var), 1, (Object) null);
    }

    /* renamed from: e */
    private final C14951m0 m93145e(C14951m0 m0Var, C14900e0 e0Var) {
        C14951m0 r = C14956n1.m93003r(m0Var, e0Var.mo73021O0());
        C13706o.m87928e(r, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return r;
    }

    /* renamed from: f */
    private final C14951m0 m93146f(C14951m0 m0Var, C14900e0 e0Var) {
        return m93144d(m93145e(m0Var, e0Var), e0Var.mo73701M0());
    }

    /* renamed from: g */
    private final C14951m0 m93147g(C14985w0 w0Var, C14830a1 a1Var, boolean z) {
        C14901e1 j = w0Var.mo74243b().mo62171j();
        C13706o.m87928e(j, "descriptor.typeConstructor");
        return C14906f0.m92822j(a1Var, j, w0Var.mo74242a(), z, C14692h.C14695b.f63726b);
    }

    /* renamed from: h */
    private final C14830a1 m93148h(C14900e0 e0Var, C14830a1 a1Var) {
        if (C14925g0.m92873a(e0Var)) {
            return e0Var.mo73701M0();
        }
        return a1Var.mo74044i(e0Var.mo73701M0());
    }

    /* renamed from: j */
    private final C14926g1 m93149j(C14926g1 g1Var, C14985w0 w0Var, int i) {
        C14967q1 Q0 = g1Var.getType().mo74145Q0();
        if (C14984w.m93156a(Q0)) {
            return g1Var;
        }
        C14951m0 a = C14942k1.m92921a(Q0);
        if (C14925g0.m92873a(a) || !C11170a.m74975x(a)) {
            return g1Var;
        }
        C14901e1 N0 = a.mo73702N0();
        C13961h c = N0.mo62183c();
        N0.getParameters().size();
        a.mo73700L0().size();
        if (c instanceof C13950e1) {
            return g1Var;
        }
        if (c instanceof C13947d1) {
            C13947d1 d1Var = (C13947d1) c;
            int i2 = 0;
            if (w0Var.mo74245d(d1Var)) {
                this.f64109a.mo74248b(d1Var);
                C14970r1 r1Var = C14970r1.INVARIANT;
                C17087j jVar = C17087j.RECURSIVE_TYPE_ALIAS;
                String fVar = d1Var.getName().toString();
                C13706o.m87928e(fVar, "typeDescriptor.name.toString()");
                return new C14933i1(r1Var, C17088k.m100540d(jVar, fVar));
            }
            List<C14926g1> L0 = a.mo73700L0();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(L0, 10));
            for (T next : L0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C13614t.m87758t();
                }
                arrayList.add(m93151l((C14926g1) next, w0Var, N0.getParameters().get(i2), i + 1));
                i2 = i3;
            }
            C14951m0 k = m93150k(C14985w0.f64111e.mo74246a(w0Var, d1Var, arrayList), a.mo73701M0(), a.mo73021O0(), i + 1, false);
            C14951m0 m = m93152m(a, w0Var, i);
            if (!C14984w.m93156a(k)) {
                k = C14966q0.m93072j(k, m);
            }
            return new C14933i1(g1Var.mo74185c(), k);
        }
        C14951m0 m2 = m93152m(a, w0Var, i);
        m93142b(a, m2);
        return new C14933i1(g1Var.mo74185c(), m2);
    }

    /* renamed from: k */
    private final C14951m0 m93150k(C14985w0 w0Var, C14830a1 a1Var, boolean z, int i, boolean z2) {
        C14926g1 l = m93151l(new C14933i1(C14970r1.INVARIANT, w0Var.mo74243b().mo72282t0()), w0Var, (C13950e1) null, i);
        C14900e0 type = l.getType();
        C13706o.m87928e(type, "expandedProjection.type");
        C14951m0 a = C14942k1.m92921a(type);
        if (C14925g0.m92873a(a)) {
            return a;
        }
        l.mo74185c();
        m93141a(a.getAnnotations(), C14940k.m92916a(a1Var));
        C14951m0 r = C14956n1.m93003r(m93144d(a, a1Var), z);
        C13706o.m87928e(r, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        return z2 ? C14966q0.m93072j(r, m93147g(w0Var, a1Var, z)) : r;
    }

    /* renamed from: l */
    private final C14926g1 m93151l(C14926g1 g1Var, C14985w0 w0Var, C13950e1 e1Var, int i) {
        C14970r1 r1Var;
        C14900e0 e0Var;
        C14970r1 r1Var2;
        C14970r1 r1Var3;
        f64107c.m93155b(i, w0Var.mo74243b());
        if (g1Var.mo74184b()) {
            C13706o.m87926c(e1Var);
            C14926g1 s = C14956n1.m93004s(e1Var);
            C13706o.m87928e(s, "makeStarProjection(typeParameterDescriptor!!)");
            return s;
        }
        C14900e0 type = g1Var.getType();
        C13706o.m87928e(type, "underlyingProjection.type");
        C14926g1 c = w0Var.mo74244c(type.mo73702N0());
        if (c == null) {
            return m93149j(g1Var, w0Var, i);
        }
        if (c.mo74184b()) {
            C13706o.m87926c(e1Var);
            C14926g1 s2 = C14956n1.m93004s(e1Var);
            C13706o.m87928e(s2, "makeStarProjection(typeParameterDescriptor!!)");
            return s2;
        }
        C14967q1 Q0 = c.getType().mo74145Q0();
        C14970r1 c2 = c.mo74185c();
        C13706o.m87928e(c2, "argument.projectionKind");
        C14970r1 c3 = g1Var.mo74185c();
        C13706o.m87928e(c3, "underlyingProjection.projectionKind");
        if (!(c3 == c2 || c3 == (r1Var3 = C14970r1.INVARIANT))) {
            if (c2 == r1Var3) {
                c2 = c3;
            } else {
                this.f64109a.mo74250d(w0Var.mo74243b(), e1Var, Q0);
            }
        }
        if (e1Var == null || (r1Var = e1Var.mo72273l()) == null) {
            r1Var = C14970r1.INVARIANT;
        }
        C13706o.m87928e(r1Var, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (!(r1Var == c2 || r1Var == (r1Var2 = C14970r1.INVARIANT))) {
            if (c2 == r1Var2) {
                c2 = r1Var2;
            } else {
                this.f64109a.mo74250d(w0Var.mo74243b(), e1Var, Q0);
            }
        }
        m93141a(type.getAnnotations(), Q0.getAnnotations());
        if (Q0 instanceof C14981v) {
            e0Var = m93143c((C14981v) Q0, type.mo73701M0());
        } else {
            e0Var = m93146f(C14942k1.m92921a(Q0), type);
        }
        return new C14933i1(c2, e0Var);
    }

    /* renamed from: m */
    private final C14951m0 m93152m(C14951m0 m0Var, C14985w0 w0Var, int i) {
        C14901e1 N0 = m0Var.mo73702N0();
        List<C14926g1> L0 = m0Var.mo73700L0();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(L0, 10));
        int i2 = 0;
        for (T next : L0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C13614t.m87758t();
            }
            C14926g1 g1Var = (C14926g1) next;
            C14926g1 l = m93151l(g1Var, w0Var, N0.getParameters().get(i2), i + 1);
            if (!l.mo74184b()) {
                l = new C14933i1(l.mo74185c(), C14956n1.m93002q(l.getType(), g1Var.getType().mo73021O0()));
            }
            arrayList.add(l);
            i2 = i3;
        }
        return C14942k1.m92926f(m0Var, arrayList, (C14830a1) null, 2, (Object) null);
    }

    /* renamed from: i */
    public final C14951m0 mo74241i(C14985w0 w0Var, C14830a1 a1Var) {
        C13706o.m87929f(w0Var, "typeAliasExpansion");
        C13706o.m87929f(a1Var, "attributes");
        return m93150k(w0Var, a1Var, false, 0, true);
    }
}
