package p243dc;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14605b;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14607d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14911f1;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14942k1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p370qa.C16265l;
import p389sb.C16519a;

/* renamed from: dc.b */
/* compiled from: CapturedTypeApproximation.kt */
public final class C12007b {

    /* renamed from: dc.b$a */
    /* compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class C12008a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f58210a;

        static {
            int[] iArr = new int[C14970r1.values().length];
            iArr[C14970r1.INVARIANT.ordinal()] = 1;
            iArr[C14970r1.IN_VARIANCE.ordinal()] = 2;
            iArr[C14970r1.OUT_VARIANCE.ordinal()] = 3;
            f58210a = iArr;
        }
    }

    /* renamed from: dc.b$b */
    /* compiled from: CapturedTypeApproximation.kt */
    static final class C12009b extends C13708q implements C16265l<C14967q1, Boolean> {

        /* renamed from: a */
        public static final C12009b f58211a = new C12009b();

        C12009b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C14967q1 q1Var) {
            C13706o.m87928e(q1Var, "it");
            return Boolean.valueOf(C14607d.m91514d(q1Var));
        }
    }

    /* renamed from: dc.b$c */
    /* compiled from: CapturedTypeApproximation.kt */
    public static final class C12010c extends C14911f1 {
        C12010c() {
        }

        /* renamed from: k */
        public C14926g1 mo67460k(C14901e1 e1Var) {
            C13706o.m87929f(e1Var, "key");
            C14605b bVar = e1Var instanceof C14605b ? (C14605b) e1Var : null;
            if (bVar == null) {
                return null;
            }
            if (bVar.mo73707U0().mo74184b()) {
                return new C14933i1(C14970r1.OUT_VARIANCE, bVar.mo73707U0().getType());
            }
            return bVar.mo73707U0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0181  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p243dc.C12006a<kotlin.reflect.jvm.internal.impl.types.C14900e0> m82436a(kotlin.reflect.jvm.internal.impl.types.C14900e0 r7) {
        /*
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92415b(r7)
            if (r0 == 0) goto L_0x0059
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92416c(r7)
            dc.a r0 = m82436a(r0)
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92417d(r7)
            dc.a r1 = m82436a(r1)
            dc.a r2 = new dc.a
            java.lang.Object r3 = r0.mo67454c()
            kotlin.reflect.jvm.internal.impl.types.e0 r3 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r3
            kotlin.reflect.jvm.internal.impl.types.m0 r3 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92416c(r3)
            java.lang.Object r4 = r1.mo67454c()
            kotlin.reflect.jvm.internal.impl.types.e0 r4 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r4
            kotlin.reflect.jvm.internal.impl.types.m0 r4 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92417d(r4)
            kotlin.reflect.jvm.internal.impl.types.q1 r3 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92816d(r3, r4)
            kotlin.reflect.jvm.internal.impl.types.q1 r3 = kotlin.reflect.jvm.internal.impl.types.C14964p1.m93055b(r3, r7)
            java.lang.Object r0 = r0.mo67455d()
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r0
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92416c(r0)
            java.lang.Object r1 = r1.mo67455d()
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r1
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = kotlin.reflect.jvm.internal.impl.types.C14833b0.m92417d(r1)
            kotlin.reflect.jvm.internal.impl.types.q1 r0 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92816d(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.q1 r7 = kotlin.reflect.jvm.internal.impl.types.C14964p1.m93055b(r0, r7)
            r2.<init>(r3, r7)
            return r2
        L_0x0059:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r7.mo73702N0()
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14607d.m91514d(r7)
            java.lang.String r2 = "type.builtIns.nothingType"
            if (r1 == 0) goto L_0x00ce
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b r0 = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14605b) r0
            kotlin.reflect.jvm.internal.impl.types.g1 r0 = r0.mo73707U0()
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r0.getType()
            java.lang.String r3 = "typeProjection.type"
            kotlin.jvm.internal.C13706o.m87928e(r1, r3)
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = m82437b(r1, r7)
            kotlin.reflect.jvm.internal.impl.types.r1 r3 = r0.mo74185c()
            int[] r4 = p243dc.C12007b.C12008a.f58210a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 2
            if (r3 == r4) goto L_0x00bb
            r4 = 3
            if (r3 != r4) goto L_0x00a4
            dc.a r0 = new dc.a
            kotlin.reflect.jvm.internal.impl.builtins.h r3 = p225cc.C11170a.m74959h(r7)
            kotlin.reflect.jvm.internal.impl.types.m0 r3 = r3.mo72118H()
            kotlin.jvm.internal.C13706o.m87928e(r3, r2)
            kotlin.reflect.jvm.internal.impl.types.e0 r7 = m82437b(r3, r7)
            r0.<init>(r7, r1)
            goto L_0x00cd
        L_0x00a4:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Only nontrivial projections should have been captured, not: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L_0x00bb:
            dc.a r0 = new dc.a
            kotlin.reflect.jvm.internal.impl.builtins.h r7 = p225cc.C11170a.m74959h(r7)
            kotlin.reflect.jvm.internal.impl.types.m0 r7 = r7.mo72119I()
            java.lang.String r2 = "type.builtIns.nullableAnyType"
            kotlin.jvm.internal.C13706o.m87928e(r7, r2)
            r0.<init>(r1, r7)
        L_0x00cd:
            return r0
        L_0x00ce:
            java.util.List r1 = r7.mo73700L0()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x018d
            java.util.List r1 = r7.mo73700L0()
            int r1 = r1.size()
            java.util.List r3 = r0.getParameters()
            int r3 = r3.size()
            if (r1 == r3) goto L_0x00ec
            goto L_0x018d
        L_0x00ec:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r4 = r7.mo73700L0()
            java.util.List r0 = r0.getParameters()
            java.lang.String r5 = "typeConstructor.parameters"
            kotlin.jvm.internal.C13706o.m87928e(r0, r5)
            java.util.List r0 = kotlin.collections.C13566b0.m87413N0(r4, r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x010b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0150
            java.lang.Object r4 = r0.next()
            ja.m r4 = (p297ja.C13328m) r4
            java.lang.Object r5 = r4.mo70152a()
            kotlin.reflect.jvm.internal.impl.types.g1 r5 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r5
            java.lang.Object r4 = r4.mo70153b()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r4
            java.lang.String r6 = "typeParameter"
            kotlin.jvm.internal.C13706o.m87928e(r4, r6)
            dc.c r4 = m82442g(r5, r4)
            boolean r5 = r5.mo74184b()
            if (r5 == 0) goto L_0x0139
            r1.add(r4)
            r3.add(r4)
            goto L_0x010b
        L_0x0139:
            dc.a r4 = m82439d(r4)
            java.lang.Object r5 = r4.mo67452a()
            dc.c r5 = (p243dc.C12011c) r5
            java.lang.Object r4 = r4.mo67453b()
            dc.c r4 = (p243dc.C12011c) r4
            r1.add(r5)
            r3.add(r4)
            goto L_0x010b
        L_0x0150:
            boolean r0 = r1.isEmpty()
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x015a
        L_0x0158:
            r4 = 0
            goto L_0x0171
        L_0x015a:
            java.util.Iterator r0 = r1.iterator()
        L_0x015e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0158
            java.lang.Object r6 = r0.next()
            dc.c r6 = (p243dc.C12011c) r6
            boolean r6 = r6.mo67464d()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x015e
        L_0x0171:
            dc.a r0 = new dc.a
            if (r4 == 0) goto L_0x0181
            kotlin.reflect.jvm.internal.impl.builtins.h r1 = p225cc.C11170a.m74959h(r7)
            kotlin.reflect.jvm.internal.impl.types.m0 r1 = r1.mo72118H()
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            goto L_0x0185
        L_0x0181:
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = m82440e(r7, r1)
        L_0x0185:
            kotlin.reflect.jvm.internal.impl.types.e0 r7 = m82440e(r7, r3)
            r0.<init>(r1, r7)
            return r0
        L_0x018d:
            dc.a r0 = new dc.a
            r0.<init>(r7, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p243dc.C12007b.m82436a(kotlin.reflect.jvm.internal.impl.types.e0):dc.a");
    }

    /* renamed from: b */
    private static final C14900e0 m82437b(C14900e0 e0Var, C14900e0 e0Var2) {
        C14900e0 q = C14956n1.m93002q(e0Var, e0Var2.mo73021O0());
        C13706o.m87928e(q, "makeNullableIfNeeded(this, type.isMarkedNullable)");
        return q;
    }

    /* renamed from: c */
    public static final C14926g1 m82438c(C14926g1 g1Var, boolean z) {
        if (g1Var == null) {
            return null;
        }
        if (g1Var.mo74184b()) {
            return g1Var;
        }
        C14900e0 type = g1Var.getType();
        C13706o.m87928e(type, "typeProjection.type");
        if (!C14956n1.m92988c(type, C12009b.f58211a)) {
            return g1Var;
        }
        C14970r1 c = g1Var.mo74185c();
        C13706o.m87928e(c, "typeProjection.projectionKind");
        if (c == C14970r1.OUT_VARIANCE) {
            return new C14933i1(c, m82436a(type).mo67455d());
        }
        if (z) {
            return new C14933i1(c, m82436a(type).mo67454c());
        }
        return m82441f(g1Var);
    }

    /* renamed from: d */
    private static final C12006a<C12011c> m82439d(C12011c cVar) {
        C12006a<C14900e0> a = m82436a(cVar.mo67461a());
        C12006a<C14900e0> a2 = m82436a(cVar.mo67462b());
        return new C12006a<>(new C12011c(cVar.mo67463c(), a.mo67453b(), a2.mo67452a()), new C12011c(cVar.mo67463c(), a.mo67452a(), a2.mo67453b()));
    }

    /* renamed from: e */
    private static final C14900e0 m82440e(C14900e0 e0Var, List<C12011c> list) {
        e0Var.mo73700L0().size();
        list.size();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C12011c h : list) {
            arrayList.add(m82443h(h));
        }
        return C14942k1.m92925e(e0Var, arrayList, (C13921g) null, (List) null, 6, (Object) null);
    }

    /* renamed from: f */
    private static final C14926g1 m82441f(C14926g1 g1Var) {
        C14945l1 g = C14945l1.m92939g(new C12010c());
        C13706o.m87928e(g, "create(object : TypeCons…ojection\n        }\n    })");
        return g.mo74217t(g1Var);
    }

    /* renamed from: g */
    private static final C12011c m82442g(C14926g1 g1Var, C13950e1 e1Var) {
        int i = C12008a.f58210a[C14945l1.m92935c(e1Var.mo72273l(), g1Var).ordinal()];
        if (i == 1) {
            C14900e0 type = g1Var.getType();
            C13706o.m87928e(type, "type");
            C14900e0 type2 = g1Var.getType();
            C13706o.m87928e(type2, "type");
            return new C12011c(e1Var, type, type2);
        } else if (i == 2) {
            C14900e0 type3 = g1Var.getType();
            C13706o.m87928e(type3, "type");
            C14951m0 I = C16519a.m98613f(e1Var).mo72119I();
            C13706o.m87928e(I, "typeParameter.builtIns.nullableAnyType");
            return new C12011c(e1Var, type3, I);
        } else if (i == 3) {
            C14951m0 H = C16519a.m98613f(e1Var).mo72118H();
            C13706o.m87928e(H, "typeParameter.builtIns.nothingType");
            C14900e0 type4 = g1Var.getType();
            C13706o.m87928e(type4, "type");
            return new C12011c(e1Var, H, type4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    private static final C14926g1 m82443h(C12011c cVar) {
        C14970r1 r1Var;
        cVar.mo67464d();
        if (C13706o.m87924a(cVar.mo67461a(), cVar.mo67462b()) || cVar.mo67463c().mo72273l() == (r1Var = C14970r1.IN_VARIANCE)) {
            return new C14933i1(cVar.mo67461a());
        }
        if (C13853h.m88267m0(cVar.mo67461a()) && cVar.mo67463c().mo72273l() != r1Var) {
            return new C14933i1(m82444i(cVar, C14970r1.OUT_VARIANCE), cVar.mo67462b());
        }
        if (C13853h.m88269o0(cVar.mo67462b())) {
            return new C14933i1(m82444i(cVar, r1Var), cVar.mo67461a());
        }
        return new C14933i1(m82444i(cVar, C14970r1.OUT_VARIANCE), cVar.mo67462b());
    }

    /* renamed from: i */
    private static final C14970r1 m82444i(C12011c cVar, C14970r1 r1Var) {
        return r1Var == cVar.mo67463c().mo72273l() ? C14970r1.INVARIANT : r1Var;
    }
}
