package p327mb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p308kb.C13455c;
import p308kb.C13481i;
import p308kb.C13494n;
import p308kb.C13508q;
import p308kb.C13516r;
import p308kb.C13519s;
import p308kb.C13527u;

/* renamed from: mb.f */
/* compiled from: protoTypeTableUtil.kt */
public final class C15723f {
    /* renamed from: a */
    public static final C13508q m95028a(C13508q qVar, C15724g gVar) {
        C13706o.m87929f(qVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (qVar.mo71452q0()) {
            return qVar.mo71435V();
        }
        if (qVar.mo71453r0()) {
            return gVar.mo75166a(qVar.mo71436W());
        }
        return null;
    }

    /* renamed from: b */
    public static final C13508q m95029b(C13516r rVar, C15724g gVar) {
        C13706o.m87929f(rVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (rVar.mo71513i0()) {
            C13508q X = rVar.mo71503X();
            C13706o.m87928e(X, "expandedType");
            return X;
        } else if (rVar.mo71514k0()) {
            return gVar.mo75166a(rVar.mo71504Y());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: c */
    public static final C13508q m95030c(C13508q qVar, C15724g gVar) {
        C13706o.m87929f(qVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (qVar.mo71457v0()) {
            return qVar.mo71444f0();
        }
        if (qVar.mo71458w0()) {
            return gVar.mo75166a(qVar.mo71445g0());
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m95031d(C13481i iVar) {
        C13706o.m87929f(iVar, "<this>");
        return iVar.mo71253C0() || iVar.mo71254D0();
    }

    /* renamed from: e */
    public static final boolean m95032e(C13494n nVar) {
        C13706o.m87929f(nVar, "<this>");
        return nVar.mo71375z0() || nVar.mo71345A0();
    }

    /* renamed from: f */
    public static final C13508q m95033f(C13455c cVar, C15724g gVar) {
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (cVar.mo71142v1()) {
            return cVar.mo71110Q0();
        }
        if (cVar.mo71143w1()) {
            return gVar.mo75166a(cVar.mo71111R0());
        }
        return null;
    }

    /* renamed from: g */
    public static final C13508q m95034g(C13508q qVar, C15724g gVar) {
        C13706o.m87929f(qVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (qVar.mo71460y0()) {
            return qVar.mo71447k0();
        }
        if (qVar.mo71461z0()) {
            return gVar.mo75166a(qVar.mo71448l0());
        }
        return null;
    }

    /* renamed from: h */
    public static final C13508q m95035h(C13481i iVar, C15724g gVar) {
        C13706o.m87929f(iVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (iVar.mo71253C0()) {
            return iVar.mo71269l0();
        }
        if (iVar.mo71254D0()) {
            return gVar.mo75166a(iVar.mo71270m0());
        }
        return null;
    }

    /* renamed from: i */
    public static final C13508q m95036i(C13494n nVar, C15724g gVar) {
        C13706o.m87929f(nVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (nVar.mo71375z0()) {
            return nVar.mo71361k0();
        }
        if (nVar.mo71345A0()) {
            return gVar.mo75166a(nVar.mo71362l0());
        }
        return null;
    }

    /* renamed from: j */
    public static final C13508q m95037j(C13481i iVar, C15724g gVar) {
        C13706o.m87929f(iVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (iVar.mo71255E0()) {
            C13508q n0 = iVar.mo71271n0();
            C13706o.m87928e(n0, "returnType");
            return n0;
        } else if (iVar.mo71256F0()) {
            return gVar.mo75166a(iVar.mo71272o0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: k */
    public static final C13508q m95038k(C13494n nVar, C15724g gVar) {
        C13706o.m87929f(nVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (nVar.mo71346B0()) {
            C13508q m0 = nVar.mo71363m0();
            C13706o.m87928e(m0, "returnType");
            return m0;
        } else if (nVar.mo71347C0()) {
            return gVar.mo75166a(nVar.mo71364n0());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: l */
    public static final List<C13508q> m95039l(C13455c cVar, C15724g gVar) {
        C13706o.m87929f(cVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        List<C13508q> h1 = cVar.mo71128h1();
        if (!(!h1.isEmpty())) {
            h1 = null;
        }
        if (h1 == null) {
            List<Integer> g1 = cVar.mo71127g1();
            C13706o.m87928e(g1, "supertypeIdList");
            h1 = new ArrayList<>(C13616u.m87774u(g1, 10));
            for (Integer num : g1) {
                C13706o.m87928e(num, "it");
                h1.add(gVar.mo75166a(num.intValue()));
            }
        }
        return h1;
    }

    /* renamed from: m */
    public static final C13508q m95040m(C13508q.C13510b bVar, C15724g gVar) {
        C13706o.m87929f(bVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (bVar.mo71466D()) {
            return bVar.mo71463A();
        }
        if (bVar.mo71467E()) {
            return gVar.mo75166a(bVar.mo71464B());
        }
        return null;
    }

    /* renamed from: n */
    public static final C13508q m95041n(C13527u uVar, C15724g gVar) {
        C13706o.m87929f(uVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (uVar.mo71582W()) {
            C13508q P = uVar.mo71576P();
            C13706o.m87928e(P, "type");
            return P;
        } else if (uVar.mo71583X()) {
            return gVar.mo75166a(uVar.mo71577Q());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: o */
    public static final C13508q m95042o(C13516r rVar, C15724g gVar) {
        C13706o.m87929f(rVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (rVar.mo71517n0()) {
            C13508q e0 = rVar.mo71510e0();
            C13706o.m87928e(e0, "underlyingType");
            return e0;
        } else if (rVar.mo71518o0()) {
            return gVar.mo75166a(rVar.mo71511f0());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    /* renamed from: p */
    public static final List<C13508q> m95043p(C13519s sVar, C15724g gVar) {
        C13706o.m87929f(sVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        List<C13508q> W = sVar.mo71540W();
        if (!(!W.isEmpty())) {
            W = null;
        }
        if (W == null) {
            List<Integer> V = sVar.mo71539V();
            C13706o.m87928e(V, "upperBoundIdList");
            W = new ArrayList<>(C13616u.m87774u(V, 10));
            for (Integer num : V) {
                C13706o.m87928e(num, "it");
                W.add(gVar.mo75166a(num.intValue()));
            }
        }
        return W;
    }

    /* renamed from: q */
    public static final C13508q m95044q(C13527u uVar, C15724g gVar) {
        C13706o.m87929f(uVar, "<this>");
        C13706o.m87929f(gVar, "typeTable");
        if (uVar.mo71584Y()) {
            return uVar.mo71578R();
        }
        if (uVar.mo71585Z()) {
            return gVar.mo75166a(uVar.mo71579T());
        }
        return null;
    }
}
