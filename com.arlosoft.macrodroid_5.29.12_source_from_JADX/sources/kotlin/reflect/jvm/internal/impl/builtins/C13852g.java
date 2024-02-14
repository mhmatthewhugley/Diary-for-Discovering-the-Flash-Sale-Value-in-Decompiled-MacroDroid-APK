package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13927j;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14627m;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14645v;
import kotlin.reflect.jvm.internal.impl.types.C14834b1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p210ab.C11084c;
import p225cc.C11170a;
import p272gc.C12338a;
import p297ja.C13337s;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.g */
/* compiled from: functionTypes.kt */
public final class C13852g {
    /* renamed from: a */
    public static final int m88222a(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13915c H = e0Var.getAnnotations().mo72247H(C13902k.C13903a.f62209D);
        if (H == null) {
            return 0;
        }
        C14617g gVar = (C14617g) C13615t0.m87760j(H.mo72240a(), C13902k.f62187i);
        C13706o.m87927d(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C14627m) gVar).mo73727b()).intValue();
    }

    /* renamed from: b */
    public static final C14951m0 m88223b(C13853h hVar, C13921g gVar, C14900e0 e0Var, List<? extends C14900e0> list, List<? extends C14900e0> list2, List<C16157f> list3, C14900e0 e0Var2, boolean z) {
        C13706o.m87929f(hVar, "builtIns");
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(list, "contextReceiverTypes");
        C13706o.m87929f(list2, "parameterTypes");
        C13706o.m87929f(e0Var2, "returnType");
        List<C14926g1> g = m88228g(e0Var, list, list2, list3, e0Var2, hVar);
        C13948e f = m88227f(hVar, list2.size() + list.size() + (e0Var == null ? 0 : 1), z);
        if (e0Var != null) {
            gVar = m88241t(gVar, hVar);
        }
        if (!list.isEmpty()) {
            gVar = m88240s(gVar, hVar, list.size());
        }
        return C14906f0.m92819g(C14834b1.m92419b(gVar), f, g);
    }

    /* renamed from: c */
    public static /* synthetic */ C14951m0 m88224c(C13853h hVar, C13921g gVar, C14900e0 e0Var, List list, List list2, List list3, C14900e0 e0Var2, boolean z, int i, Object obj) {
        return m88223b(hVar, gVar, e0Var, list, list2, list3, e0Var2, (i & 128) != 0 ? false : z);
    }

    /* renamed from: d */
    public static final C16157f m88225d(C14900e0 e0Var) {
        String str;
        C13706o.m87929f(e0Var, "<this>");
        C13915c H = e0Var.getAnnotations().mo72247H(C13902k.C13903a.f62211E);
        if (H == null) {
            return null;
        }
        Object v0 = C13566b0.m87447v0(H.mo72240a().values());
        C14645v vVar = v0 instanceof C14645v ? (C14645v) v0 : null;
        if (!(vVar == null || (str = (String) vVar.mo73727b()) == null)) {
            if (!C16157f.m97020k(str)) {
                str = null;
            }
            if (str != null) {
                return C16157f.m97019i(str);
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final List<C14900e0> m88226e(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        m88236o(e0Var);
        int a = m88222a(e0Var);
        if (a == 0) {
            return C13614t.m87748j();
        }
        List<C14926g1> subList = e0Var.mo73700L0().subList(0, a);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(subList, 10));
        for (C14926g1 type : subList) {
            C14900e0 type2 = type.getType();
            C13706o.m87928e(type2, "it.type");
            arrayList.add(type2);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final C13948e m88227f(C13853h hVar, int i, boolean z) {
        C13706o.m87929f(hVar, "builtIns");
        C13948e X = z ? hVar.mo72130X(i) : hVar.mo72112C(i);
        C13706o.m87928e(X, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return X;
    }

    /* renamed from: g */
    public static final List<C14926g1> m88228g(C14900e0 e0Var, List<? extends C14900e0> list, List<? extends C14900e0> list2, List<C16157f> list3, C14900e0 e0Var2, C13853h hVar) {
        C16157f fVar;
        C13706o.m87929f(list, "contextReceiverTypes");
        C13706o.m87929f(list2, "parameterTypes");
        C13706o.m87929f(e0Var2, "returnType");
        C13706o.m87929f(hVar, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (e0Var != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
        for (C14900e0 a : list) {
            arrayList2.add(C11170a.m74952a(a));
        }
        arrayList.addAll(arrayList2);
        C12338a.m83071a(arrayList, e0Var != null ? C11170a.m74952a(e0Var) : null);
        for (T next : list2) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            C14900e0 e0Var3 = (C14900e0) next;
            if (list3 == null || (fVar = list3.get(i)) == null || fVar.mo78588j()) {
                fVar = null;
            }
            if (fVar != null) {
                C16152c cVar = C13902k.C13903a.f62211E;
                C16157f i3 = C16157f.m97019i("name");
                String d = fVar.mo78583d();
                C13706o.m87928e(d, "name.asString()");
                e0Var3 = C11170a.m74972u(e0Var3, C13921g.f62330v.mo72250a(C13566b0.m87441p0(e0Var3.getAnnotations(), new C13927j(hVar, cVar, C13613s0.m87741f(C13337s.m85692a(i3, new C14645v(d)))))));
            }
            arrayList.add(C11170a.m74952a(e0Var3));
            i = i2;
        }
        arrayList.add(C11170a.m74952a(e0Var2));
        return arrayList;
    }

    /* renamed from: h */
    public static final C11084c m88229h(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        if ((mVar instanceof C13948e) && C13853h.m88243A0(mVar)) {
            return m88230i(C16519a.m98616i(mVar));
        }
        return null;
    }

    /* renamed from: i */
    private static final C11084c m88230i(C16153d dVar) {
        if (!dVar.mo78572f() || dVar.mo78570e()) {
            return null;
        }
        C11084c.C11085a aVar = C11084c.f54000a;
        String d = dVar.mo78576i().mo78583d();
        C13706o.m87928e(d, "shortName().asString()");
        C16152c e = dVar.mo78579l().mo78559e();
        C13706o.m87928e(e, "toSafe().parent()");
        return aVar.mo62195b(d, e);
    }

    /* renamed from: j */
    public static final C14900e0 m88231j(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        m88236o(e0Var);
        if (!m88239r(e0Var)) {
            return null;
        }
        return e0Var.mo73700L0().get(m88222a(e0Var)).getType();
    }

    /* renamed from: k */
    public static final C14900e0 m88232k(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        m88236o(e0Var);
        C14900e0 type = ((C14926g1) C13566b0.m87434i0(e0Var.mo73700L0())).getType();
        C13706o.m87928e(type, "arguments.last().type");
        return type;
    }

    /* renamed from: l */
    public static final List<C14926g1> m88233l(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        m88236o(e0Var);
        List<C14926g1> L0 = e0Var.mo73700L0();
        return L0.subList(m88222a(e0Var) + (m88234m(e0Var) ? 1 : 0), L0.size() - 1);
    }

    /* renamed from: m */
    public static final boolean m88234m(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        return m88236o(e0Var) && m88239r(e0Var);
    }

    /* renamed from: n */
    public static final boolean m88235n(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        C11084c h = m88229h(mVar);
        return h == C11084c.Function || h == C11084c.SuspendFunction;
    }

    /* renamed from: o */
    public static final boolean m88236o(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13961h c = e0Var.mo73702N0().mo62183c();
        return c != null && m88235n(c);
    }

    /* renamed from: p */
    public static final boolean m88237p(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13961h c = e0Var.mo73702N0().mo62183c();
        return (c != null ? m88229h(c) : null) == C11084c.Function;
    }

    /* renamed from: q */
    public static final boolean m88238q(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "<this>");
        C13961h c = e0Var.mo73702N0().mo62183c();
        return (c != null ? m88229h(c) : null) == C11084c.SuspendFunction;
    }

    /* renamed from: r */
    private static final boolean m88239r(C14900e0 e0Var) {
        return e0Var.getAnnotations().mo72247H(C13902k.C13903a.f62207C) != null;
    }

    /* renamed from: s */
    public static final C13921g m88240s(C13921g gVar, C13853h hVar, int i) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(hVar, "builtIns");
        C16152c cVar = C13902k.C13903a.f62209D;
        return gVar.mo72249n1(cVar) ? gVar : C13921g.f62330v.mo72250a(C13566b0.m87441p0(gVar, new C13927j(hVar, cVar, C13613s0.m87741f(C13337s.m85692a(C13902k.f62187i, new C14627m(i))))));
    }

    /* renamed from: t */
    public static final C13921g m88241t(C13921g gVar, C13853h hVar) {
        C13706o.m87929f(gVar, "<this>");
        C13706o.m87929f(hVar, "builtIns");
        C16152c cVar = C13902k.C13903a.f62207C;
        return gVar.mo72249n1(cVar) ? gVar : C13921g.f62330v.mo72250a(C13566b0.m87441p0(gVar, new C13927j(hVar, cVar, C13615t0.m87759i())));
    }
}
