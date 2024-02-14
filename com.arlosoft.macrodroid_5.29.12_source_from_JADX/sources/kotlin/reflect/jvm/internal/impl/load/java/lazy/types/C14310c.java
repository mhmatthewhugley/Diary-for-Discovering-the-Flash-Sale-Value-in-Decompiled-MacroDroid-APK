package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13873d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14228d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14306k;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14834b1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14928h0;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p225cc.C11170a;
import p288ib.C12481a0;
import p288ib.C12485c0;
import p288ib.C12491f;
import p288ib.C12492g;
import p288ib.C12494i;
import p288ib.C12495j;
import p288ib.C12508v;
import p288ib.C12510x;
import p288ib.C12512y;
import p362pb.C16151b;
import p362pb.C16152c;
import p370qa.C16254a;
import p450zb.C17085h;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c */
/* compiled from: JavaTypeResolver.kt */
public final class C14310c {

    /* renamed from: a */
    private final C14301g f63082a;

    /* renamed from: b */
    private final C14306k f63083b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14319g f63084c;

    /* renamed from: d */
    private final C14313e f63085d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c$a */
    /* compiled from: JavaTypeResolver.kt */
    static final class C14311a extends C13708q implements C16254a<C14900e0> {
        final /* synthetic */ C14308a $attr;
        final /* synthetic */ C14901e1 $constructor;
        final /* synthetic */ C12495j $javaType;
        final /* synthetic */ C13950e1 $parameter;
        final /* synthetic */ C14310c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14311a(C14310c cVar, C13950e1 e1Var, C12495j jVar, C14308a aVar, C14901e1 e1Var2) {
            super(0);
            this.this$0 = cVar;
            this.$parameter = e1Var;
            this.$javaType = jVar;
            this.$attr = aVar;
            this.$constructor = e1Var2;
        }

        /* renamed from: a */
        public final C14900e0 invoke() {
            C14319g a = this.this$0.f63084c;
            C13950e1 e1Var = this.$parameter;
            boolean r = this.$javaType.mo68986r();
            C14308a aVar = this.$attr;
            C13961h c = this.$constructor.mo62183c();
            C14900e0 c2 = a.mo72957c(e1Var, r, aVar.mo72933h(c != null ? c.mo72274p() : null));
            C13706o.m87928e(c2, "typeParameterUpperBoundE…efaultType)\n            )");
            return c2;
        }
    }

    public C14310c(C14301g gVar, C14306k kVar) {
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(kVar, "typeParameterResolver");
        this.f63082a = gVar;
        this.f63083b = kVar;
        C14319g gVar2 = new C14319g((C14313e) null, 1, (C13695i) null);
        this.f63084c = gVar2;
        this.f63085d = new C14313e(gVar2);
    }

    /* renamed from: b */
    private final boolean m90183b(C12495j jVar, C13948e eVar) {
        C14970r1 l;
        if (!C12481a0.m83569a((C12510x) C13566b0.m87436k0(jVar.mo68987x()))) {
            return false;
        }
        List<C13950e1> parameters = C13873d.f62132a.mo72185b(eVar).mo62171j().getParameters();
        C13706o.m87928e(parameters, "JavaToKotlinClassMapper.…ypeConstructor.parameters");
        C13950e1 e1Var = (C13950e1) C13566b0.m87436k0(parameters);
        if (e1Var == null || (l = e1Var.mo72273l()) == null || l == C14970r1.OUT_VARIANCE) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if ((!r0.isEmpty()) != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.C14926g1> m90184c(p288ib.C12495j r7, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14308a r8, kotlin.reflect.jvm.internal.impl.types.C14901e1 r9) {
        /*
            r6 = this;
            boolean r0 = r7.mo68986r()
            java.lang.String r1 = "constructor.parameters"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0025
            java.util.List r0 = r7.mo68987x()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = r9.getParameters()
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = 0
            goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            java.util.List r4 = r9.getParameters()
            kotlin.jvm.internal.C13706o.m87928e(r4, r1)
            if (r0 == 0) goto L_0x0034
            java.util.List r7 = r6.m90185d(r7, r4, r9, r8)
            return r7
        L_0x0034:
            int r8 = r4.size()
            java.util.List r9 = r7.mo68987x()
            int r9 = r9.size()
            r0 = 10
            if (r8 == r9) goto L_0x0082
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.C13616u.m87774u(r4, r0)
            r7.<init>(r8)
            java.util.Iterator r8 = r4.iterator()
        L_0x0051:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x007d
            java.lang.Object r9 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r9
            kotlin.reflect.jvm.internal.impl.types.i1 r0 = new kotlin.reflect.jvm.internal.impl.types.i1
            zb.j r1 = p450zb.C17087j.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            java.lang.String[] r4 = new java.lang.String[r3]
            pb.f r9 = r9.getName()
            java.lang.String r9 = r9.mo78583d()
            java.lang.String r5 = "p.name.asString()"
            kotlin.jvm.internal.C13706o.m87928e(r9, r5)
            r4[r2] = r9
            zb.h r9 = p450zb.C17088k.m100540d(r1, r4)
            r0.<init>(r9)
            r7.add(r0)
            goto L_0x0051
        L_0x007d:
            java.util.List r7 = kotlin.collections.C13566b0.m87402F0(r7)
            return r7
        L_0x0082:
            java.util.List r7 = r7.mo68987x()
            java.lang.Iterable r7 = kotlin.collections.C13566b0.m87411M0(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.C13616u.m87774u(r7, r0)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x0097:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r7.next()
            kotlin.collections.k0 r9 = (kotlin.collections.C13592k0) r9
            int r0 = r9.mo71842a()
            java.lang.Object r9 = r9.mo71843b()
            ib.x r9 = (p288ib.C12510x) r9
            r4.size()
            java.lang.Object r0 = r4.get(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r0
            kotlin.reflect.jvm.internal.impl.load.java.components.k r1 = kotlin.reflect.jvm.internal.impl.load.java.components.C14190k.COMMON
            r3 = 3
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14312d.m90202d(r1, r2, r5, r3, r5)
            java.lang.String r3 = "parameter"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            kotlin.reflect.jvm.internal.impl.types.g1 r9 = r6.m90195p(r9, r1, r0)
            r8.add(r9)
            goto L_0x0097
        L_0x00cb:
            java.util.List r7 = kotlin.collections.C13566b0.m87402F0(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14310c.m90184c(ib.j, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a, kotlin.reflect.jvm.internal.impl.types.e1):java.util.List");
    }

    /* renamed from: d */
    private final List<C14926g1> m90185d(C12495j jVar, List<? extends C13950e1> list, C14901e1 e1Var, C14308a aVar) {
        C14926g1 g1Var;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C13950e1 e1Var2 : list) {
            if (C11170a.m74962k(e1Var2, (C14901e1) null, aVar.mo72931f())) {
                g1Var = C14312d.m90200b(e1Var2, aVar);
            } else {
                g1Var = this.f63085d.mo72943j(e1Var2, jVar.mo68986r() ? aVar : aVar.mo72935i(C14309b.INFLEXIBLE), new C14928h0(this.f63082a.mo72918e(), new C14311a(this, e1Var2, jVar, aVar, e1Var)));
            }
            arrayList.add(g1Var);
        }
        return arrayList;
    }

    /* renamed from: e */
    private final C14951m0 m90186e(C12495j jVar, C14308a aVar, C14951m0 m0Var) {
        C14830a1 a1Var;
        if (m0Var == null || (a1Var = m0Var.mo73701M0()) == null) {
            a1Var = C14834b1.m92419b(new C14228d(this.f63082a, jVar, false, 4, (C13695i) null));
        }
        C14830a1 a1Var2 = a1Var;
        C14901e1 f = m90187f(jVar, aVar);
        C14901e1 e1Var = null;
        if (f == null) {
            return null;
        }
        boolean i = m90190i(aVar);
        if (m0Var != null) {
            e1Var = m0Var.mo73702N0();
        }
        if (!C13706o.m87924a(e1Var, f) || jVar.mo68986r() || !i) {
            return C14906f0.m92821i(a1Var2, f, m90184c(jVar, aVar, f), i, (C14849g) null, 16, (Object) null);
        }
        return m0Var.mo73022U0(true);
    }

    /* renamed from: f */
    private final C14901e1 m90187f(C12495j jVar, C14308a aVar) {
        C14901e1 j;
        C12494i c = jVar.mo68985c();
        if (c == null) {
            return m90188g(jVar);
        }
        if (c instanceof C12492g) {
            C12492g gVar = (C12492g) c;
            C16152c e = gVar.mo68968e();
            if (e != null) {
                C13948e j2 = m90191j(jVar, aVar, e);
                if (j2 == null) {
                    j2 = this.f63082a.mo72914a().mo72776n().mo72923a(gVar);
                }
                if (j2 == null || (j = j2.mo62171j()) == null) {
                    return m90188g(jVar);
                }
                return j;
            }
            throw new AssertionError("Class type should have a FQ name: " + c);
        } else if (c instanceof C12512y) {
            C13950e1 a = this.f63083b.mo72921a((C12512y) c);
            if (a != null) {
                return a.mo62171j();
            }
            return null;
        } else {
            throw new IllegalStateException("Unknown classifier kind: " + c);
        }
    }

    /* renamed from: g */
    private final C14901e1 m90188g(C12495j jVar) {
        C16151b m = C16151b.m96975m(new C16152c(jVar.mo68984D()));
        C13706o.m87928e(m, "topLevel(FqName(javaType.classifierQualifiedName))");
        C14901e1 j = this.f63082a.mo72914a().mo72764b().mo73161d().mo73975q().mo72552d(m, C13612s.m87736e(0)).mo62171j();
        C13706o.m87928e(j, "c.components.deserialize…istOf(0)).typeConstructor");
        return j;
    }

    /* renamed from: h */
    private final boolean m90189h(C14970r1 r1Var, C13950e1 e1Var) {
        if (e1Var.mo72273l() == C14970r1.INVARIANT || r1Var == e1Var.mo72273l()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private final boolean m90190i(C14308a aVar) {
        if (aVar.mo72928d() == C14309b.FLEXIBLE_LOWER_BOUND || aVar.mo72932g() || aVar.mo72929e() == C14190k.SUPERTYPE) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private final C13948e m90191j(C12495j jVar, C14308a aVar, C16152c cVar) {
        if (aVar.mo72932g() && C13706o.m87924a(cVar, C14312d.f63086a)) {
            return this.f63082a.mo72914a().mo72778p().mo72162c();
        }
        C13873d dVar = C13873d.f62132a;
        C13948e f = C13873d.m88370f(dVar, cVar, this.f63082a.mo72917d().mo72296m(), (Integer) null, 4, (Object) null);
        if (f == null) {
            return null;
        }
        return (!dVar.mo72187d(f) || !(aVar.mo72928d() == C14309b.FLEXIBLE_LOWER_BOUND || aVar.mo72929e() == C14190k.SUPERTYPE || m90183b(jVar, f))) ? f : dVar.mo72185b(f);
    }

    /* renamed from: l */
    public static /* synthetic */ C14900e0 m90192l(C14310c cVar, C12491f fVar, C14308a aVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return cVar.mo72938k(fVar, aVar, z);
    }

    /* renamed from: m */
    private final C14900e0 m90193m(C12495j jVar, C14308a aVar) {
        boolean z = !aVar.mo72932g() && aVar.mo72929e() != C14190k.SUPERTYPE;
        boolean r = jVar.mo68986r();
        if (r || z) {
            C14951m0 e = m90186e(jVar, aVar.mo72935i(C14309b.FLEXIBLE_LOWER_BOUND), (C14951m0) null);
            if (e == null) {
                return m90194n(jVar);
            }
            C14951m0 e2 = m90186e(jVar, aVar.mo72935i(C14309b.FLEXIBLE_UPPER_BOUND), e);
            if (e2 == null) {
                return m90194n(jVar);
            }
            if (r) {
                return new C14317f(e, e2);
            }
            return C14906f0.m92816d(e, e2);
        }
        C14951m0 e3 = m90186e(jVar, aVar, (C14951m0) null);
        return e3 != null ? e3 : m90194n(jVar);
    }

    /* renamed from: n */
    private static final C17085h m90194n(C12495j jVar) {
        return C17088k.m100540d(C17087j.UNRESOLVED_JAVA_CLASS, jVar.mo68983B());
    }

    /* renamed from: p */
    private final C14926g1 m90195p(C12510x xVar, C14308a aVar, C13950e1 e1Var) {
        if (!(xVar instanceof C12485c0)) {
            return new C14933i1(C14970r1.INVARIANT, mo72939o(xVar, aVar));
        }
        C12485c0 c0Var = (C12485c0) xVar;
        C12510x v = c0Var.mo68960v();
        C14970r1 r1Var = c0Var.mo68959J() ? C14970r1.OUT_VARIANCE : C14970r1.IN_VARIANCE;
        if (v == null || m90189h(r1Var, e1Var)) {
            return C14312d.m90200b(e1Var, aVar);
        }
        return C11170a.m74956e(mo72939o(v, C14312d.m90202d(C14190k.COMMON, false, (C13950e1) null, 3, (Object) null)), r1Var, e1Var);
    }

    /* renamed from: k */
    public final C14900e0 mo72938k(C12491f fVar, C14308a aVar, boolean z) {
        C13706o.m87929f(fVar, "arrayType");
        C13706o.m87929f(aVar, "attr");
        C12510x i = fVar.mo68965i();
        C12508v vVar = i instanceof C12508v ? (C12508v) i : null;
        C13859i type = vVar != null ? vVar.getType() : null;
        C14228d dVar = new C14228d(this.f63082a, fVar, true);
        if (type != null) {
            C14951m0 O = this.f63082a.mo72917d().mo72296m().mo72124O(type);
            C13706o.m87928e(O, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            C11170a.m74972u(O, C13921g.f62330v.mo72250a(C13566b0.m87440o0(dVar, O.getAnnotations())));
            return aVar.mo72932g() ? O : C14906f0.m92816d(O, O.mo73022U0(true));
        }
        C14900e0 o = mo72939o(i, C14312d.m90202d(C14190k.COMMON, aVar.mo72932g(), (C13950e1) null, 2, (Object) null));
        if (aVar.mo72932g()) {
            C14951m0 m = this.f63082a.mo72917d().mo72296m().mo72140m(z ? C14970r1.OUT_VARIANCE : C14970r1.INVARIANT, o, dVar);
            C13706o.m87928e(m, "c.module.builtIns.getArr…mponentType, annotations)");
            return m;
        }
        C14951m0 m2 = this.f63082a.mo72917d().mo72296m().mo72140m(C14970r1.INVARIANT, o, dVar);
        C13706o.m87928e(m2, "c.module.builtIns.getArr…mponentType, annotations)");
        return C14906f0.m92816d(m2, this.f63082a.mo72917d().mo72296m().mo72140m(C14970r1.OUT_VARIANCE, o, dVar).mo73022U0(true));
    }

    /* renamed from: o */
    public final C14900e0 mo72939o(C12510x xVar, C14308a aVar) {
        C14900e0 o;
        C14951m0 m0Var;
        C13706o.m87929f(aVar, "attr");
        if (xVar instanceof C12508v) {
            C13859i type = ((C12508v) xVar).getType();
            if (type != null) {
                m0Var = this.f63082a.mo72917d().mo72296m().mo72125R(type);
            } else {
                m0Var = this.f63082a.mo72917d().mo72296m().mo72132Z();
            }
            C13706o.m87928e(m0Var, "{\n                val pr…ns.unitType\n            }");
            return m0Var;
        } else if (xVar instanceof C12495j) {
            return m90193m((C12495j) xVar, aVar);
        } else {
            if (xVar instanceof C12491f) {
                return m90192l(this, (C12491f) xVar, aVar, false, 4, (Object) null);
            } else if (xVar instanceof C12485c0) {
                C12510x v = ((C12485c0) xVar).mo68960v();
                if (v != null && (o = mo72939o(v, aVar)) != null) {
                    return o;
                }
                C14951m0 y = this.f63082a.mo72917d().mo72296m().mo72150y();
                C13706o.m87928e(y, "c.module.builtIns.defaultBound");
                return y;
            } else if (xVar == null) {
                C14951m0 y2 = this.f63082a.mo72917d().mo72296m().mo72150y();
                C13706o.m87928e(y2, "c.module.builtIns.defaultBound");
                return y2;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + xVar);
            }
        }
    }
}
