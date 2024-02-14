package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.load.java.C14208h0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14446l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v;
import kotlin.reflect.jvm.internal.impl.resolve.C14651e;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p225cc.C11170a;
import p271gb.C12329c;
import p271gb.C12331e;
import p297ja.C13328m;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.s */
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class C14335s implements C14651e {

    /* renamed from: a */
    public static final C14336a f63114a = new C14336a((C13695i) null);

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.s$a */
    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class C14336a {
        private C14336a() {
        }

        public /* synthetic */ C14336a(C13695i iVar) {
            this();
        }

        /* JADX WARNING: type inference failed for: r6v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean m90270b(kotlin.reflect.jvm.internal.impl.descriptors.C14154y r6) {
            /*
                r5 = this;
                java.util.List r0 = r6.mo72235g()
                int r0 = r0.size()
                r1 = 1
                r2 = 0
                if (r0 == r1) goto L_0x000d
                return r2
            L_0x000d:
                kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r6.mo62163b()
                boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
                r4 = 0
                if (r3 == 0) goto L_0x0019
                kotlin.reflect.jvm.internal.impl.descriptors.e r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r0
                goto L_0x001a
            L_0x0019:
                r0 = r4
            L_0x001a:
                if (r0 != 0) goto L_0x001d
                return r2
            L_0x001d:
                java.util.List r6 = r6.mo72235g()
                java.lang.String r3 = "f.valueParameters"
                kotlin.jvm.internal.C13706o.m87928e(r6, r3)
                java.lang.Object r6 = kotlin.collections.C13566b0.m87446u0(r6)
                kotlin.reflect.jvm.internal.impl.descriptors.i1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r6
                kotlin.reflect.jvm.internal.impl.types.e0 r6 = r6.getType()
                kotlin.reflect.jvm.internal.impl.types.e1 r6 = r6.mo73702N0()
                kotlin.reflect.jvm.internal.impl.descriptors.h r6 = r6.mo62183c()
                boolean r3 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
                if (r3 == 0) goto L_0x003f
                r4 = r6
                kotlin.reflect.jvm.internal.impl.descriptors.e r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r4
            L_0x003f:
                if (r4 != 0) goto L_0x0042
                return r2
            L_0x0042:
                boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.C13853h.m88273q0(r0)
                if (r6 == 0) goto L_0x0057
                pb.c r6 = p389sb.C16519a.m98615h(r0)
                pb.c r0 = p389sb.C16519a.m98615h(r4)
                boolean r6 = kotlin.jvm.internal.C13706o.m87924a(r6, r0)
                if (r6 == 0) goto L_0x0057
                goto L_0x0058
            L_0x0057:
                r1 = 0
            L_0x0058:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C14335s.C14336a.m90270b(kotlin.reflect.jvm.internal.impl.descriptors.y):boolean");
        }

        /* renamed from: c */
        private final C14446l m90271c(C14154y yVar, C13966i1 i1Var) {
            if (C14470v.m90691e(yVar) || m90270b(yVar)) {
                C14900e0 type = i1Var.getType();
                C13706o.m87928e(type, "valueParameterDescriptor.type");
                return C14470v.m90693g(C11170a.m74971t(type));
            }
            C14900e0 type2 = i1Var.getType();
            C13706o.m87928e(type2, "valueParameterDescriptor.type");
            return C14470v.m90693g(type2);
        }

        /* renamed from: a */
        public final boolean mo72979a(C13908a aVar, C13908a aVar2) {
            C13706o.m87929f(aVar, "superDescriptor");
            C13706o.m87929f(aVar2, "subDescriptor");
            if ((aVar2 instanceof C12331e) && (aVar instanceof C14154y)) {
                C12331e eVar = (C12331e) aVar2;
                eVar.mo72235g().size();
                C14154y yVar = (C14154y) aVar;
                yVar.mo72235g().size();
                List<C13966i1> g = eVar.m88873a().mo72235g();
                C13706o.m87928e(g, "subDescriptor.original.valueParameters");
                List<C13966i1> g2 = yVar.mo72233a().mo72235g();
                C13706o.m87928e(g2, "superDescriptor.original.valueParameters");
                for (C13328m mVar : C13566b0.m87413N0(g, g2)) {
                    C13966i1 i1Var = (C13966i1) mVar.mo70152a();
                    C13966i1 i1Var2 = (C13966i1) mVar.mo70153b();
                    C13706o.m87928e(i1Var, "subParameter");
                    boolean z = m90271c((C14154y) aVar2, i1Var) instanceof C14446l.C14450d;
                    C13706o.m87928e(i1Var2, "superParameter");
                    if (z != (m90271c(yVar, i1Var2) instanceof C14446l.C14450d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m90267c(C13908a aVar, C13908a aVar2, C13948e eVar) {
        if ((aVar instanceof C13936b) && (aVar2 instanceof C14154y) && !C13853h.m88260f0(aVar2)) {
            C14197f fVar = C14197f.f62882n;
            C14154y yVar = (C14154y) aVar2;
            C16157f name = yVar.getName();
            C13706o.m87928e(name, "subDescriptor.name");
            if (!fVar.mo72725l(name)) {
                C14208h0.C14209a aVar3 = C14208h0.f62898a;
                C16157f name2 = yVar.getName();
                C13706o.m87928e(name2, "subDescriptor.name");
                if (!aVar3.mo72747k(name2)) {
                    return false;
                }
            }
            C13936b e = C14203g0.m89756e((C13936b) aVar);
            boolean z = aVar instanceof C14154y;
            C14154y yVar2 = z ? (C14154y) aVar : null;
            if ((!(yVar2 != null && yVar.mo72317C0() == yVar2.mo72317C0())) && (e == null || !yVar.mo72317C0())) {
                return true;
            }
            if ((eVar instanceof C12329c) && yVar.mo72331s0() == null && e != null && !C14203g0.m89757f(eVar, e)) {
                if ((e instanceof C14154y) && z && C14197f.m89740k((C14154y) e) != null) {
                    String c = C14470v.m90689c(yVar, false, false, 2, (Object) null);
                    C14154y a = ((C14154y) aVar).mo72233a();
                    C13706o.m87928e(a, "superDescriptor.original");
                    if (C13706o.m87924a(c, C14470v.m90689c(a, false, false, 2, (Object) null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C14651e.C14652a mo72758a() {
        return C14651e.C14652a.CONFLICTS_ONLY;
    }

    /* renamed from: b */
    public C14651e.C14653b mo72759b(C13908a aVar, C13908a aVar2, C13948e eVar) {
        C13706o.m87929f(aVar, "superDescriptor");
        C13706o.m87929f(aVar2, "subDescriptor");
        if (m90267c(aVar, aVar2, eVar)) {
            return C14651e.C14653b.INCOMPATIBLE;
        }
        if (f63114a.mo72979a(aVar, aVar2)) {
            return C14651e.C14653b.INCOMPATIBLE;
        }
        return C14651e.C14653b.UNKNOWN;
    }
}
