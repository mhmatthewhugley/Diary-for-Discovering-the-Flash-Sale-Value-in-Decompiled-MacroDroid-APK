package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14034u;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14628n;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14988x0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p370qa.C16265l;
import p389sb.C16519a;
import p450zb.C17084g;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.f0 */
/* compiled from: KotlinTypeFactory.kt */
public final class C14906f0 {

    /* renamed from: a */
    public static final C14906f0 f64036a = new C14906f0();

    /* renamed from: b */
    private static final C16265l<C14849g, C14951m0> f64037b = C14907a.f64038a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f0$a */
    /* compiled from: KotlinTypeFactory.kt */
    static final class C14907a extends C13708q implements C16265l {

        /* renamed from: a */
        public static final C14907a f64038a = new C14907a();

        C14907a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C14849g gVar) {
            C13706o.m87929f(gVar, "<anonymous parameter 0>");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f0$b */
    /* compiled from: KotlinTypeFactory.kt */
    private static final class C14908b {

        /* renamed from: a */
        private final C14951m0 f64039a;

        /* renamed from: b */
        private final C14901e1 f64040b;

        public C14908b(C14951m0 m0Var, C14901e1 e1Var) {
            this.f64039a = m0Var;
            this.f64040b = e1Var;
        }

        /* renamed from: a */
        public final C14951m0 mo74156a() {
            return this.f64039a;
        }

        /* renamed from: b */
        public final C14901e1 mo74157b() {
            return this.f64040b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f0$c */
    /* compiled from: KotlinTypeFactory.kt */
    static final class C14909c extends C13708q implements C16265l<C14849g, C14951m0> {
        final /* synthetic */ List<C14926g1> $arguments;
        final /* synthetic */ C14830a1 $attributes;
        final /* synthetic */ C14901e1 $constructor;
        final /* synthetic */ boolean $nullable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14909c(C14901e1 e1Var, List<? extends C14926g1> list, C14830a1 a1Var, boolean z) {
            super(1);
            this.$constructor = e1Var;
            this.$arguments = list;
            this.$attributes = a1Var;
            this.$nullable = z;
        }

        /* renamed from: a */
        public final C14951m0 invoke(C14849g gVar) {
            C13706o.m87929f(gVar, "refiner");
            C14908b a = C14906f0.f64036a.m92818f(this.$constructor, gVar, this.$arguments);
            if (a == null) {
                return null;
            }
            C14951m0 a2 = a.mo74156a();
            if (a2 != null) {
                return a2;
            }
            C14830a1 a1Var = this.$attributes;
            C14901e1 b = a.mo74157b();
            C13706o.m87926c(b);
            return C14906f0.m92820h(a1Var, b, this.$arguments, this.$nullable, gVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.f0$d */
    /* compiled from: KotlinTypeFactory.kt */
    static final class C14910d extends C13708q implements C16265l<C14849g, C14951m0> {
        final /* synthetic */ List<C14926g1> $arguments;
        final /* synthetic */ C14830a1 $attributes;
        final /* synthetic */ C14901e1 $constructor;
        final /* synthetic */ C14692h $memberScope;
        final /* synthetic */ boolean $nullable;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14910d(C14901e1 e1Var, List<? extends C14926g1> list, C14830a1 a1Var, boolean z, C14692h hVar) {
            super(1);
            this.$constructor = e1Var;
            this.$arguments = list;
            this.$attributes = a1Var;
            this.$nullable = z;
            this.$memberScope = hVar;
        }

        /* renamed from: a */
        public final C14951m0 invoke(C14849g gVar) {
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            C14908b a = C14906f0.f64036a.m92818f(this.$constructor, gVar, this.$arguments);
            if (a == null) {
                return null;
            }
            C14951m0 a2 = a.mo74156a();
            if (a2 != null) {
                return a2;
            }
            C14830a1 a1Var = this.$attributes;
            C14901e1 b = a.mo74157b();
            C13706o.m87926c(b);
            return C14906f0.m92822j(a1Var, b, this.$arguments, this.$nullable, this.$memberScope);
        }
    }

    private C14906f0() {
    }

    /* renamed from: b */
    public static final C14951m0 m92814b(C13947d1 d1Var, List<? extends C14926g1> list) {
        C13706o.m87929f(d1Var, "<this>");
        C13706o.m87929f(list, "arguments");
        return new C14982v0(C14988x0.C14989a.f64116a, false).mo74241i(C14985w0.f64111e.mo74246a((C14985w0) null, d1Var, list), C14830a1.f63959c.mo74051h());
    }

    /* renamed from: c */
    private final C14692h m92815c(C14901e1 e1Var, List<? extends C14926g1> list, C14849g gVar) {
        C13961h c = e1Var.mo62183c();
        if (c instanceof C13950e1) {
            return ((C13950e1) c).mo72274p().mo72955n();
        }
        if (c instanceof C13948e) {
            if (gVar == null) {
                gVar = C16519a.m98618k(C16519a.m98619l(c));
            }
            if (list.isEmpty()) {
                return C14034u.m89207b((C13948e) c, gVar);
            }
            return C14034u.m89206a((C13948e) c, C14911f1.f64041c.mo74161b(e1Var, list), gVar);
        } else if (c instanceof C13947d1) {
            C17084g gVar2 = C17084g.SCOPE_FOR_ABBREVIATION_TYPE;
            String fVar = ((C13947d1) c).getName().toString();
            C13706o.m87928e(fVar, "descriptor.name.toString()");
            return C17088k.m100538a(gVar2, true, fVar);
        } else if (e1Var instanceof C14884d0) {
            return ((C14884d0) e1Var).mo74113e();
        } else {
            throw new IllegalStateException("Unsupported classifier: " + c + " for constructor: " + e1Var);
        }
    }

    /* renamed from: d */
    public static final C14967q1 m92816d(C14951m0 m0Var, C14951m0 m0Var2) {
        C13706o.m87929f(m0Var, "lowerBound");
        C13706o.m87929f(m0Var2, "upperBound");
        if (C13706o.m87924a(m0Var, m0Var2)) {
            return m0Var;
        }
        return new C14992z(m0Var, m0Var2);
    }

    /* renamed from: e */
    public static final C14951m0 m92817e(C14830a1 a1Var, C14628n nVar, boolean z) {
        C13706o.m87929f(a1Var, "attributes");
        C13706o.m87929f(nVar, "constructor");
        return m92822j(a1Var, nVar, C13614t.m87748j(), z, C17088k.m100538a(C17084g.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C14908b m92818f(C14901e1 e1Var, C14849g gVar, List<? extends C14926g1> list) {
        C13961h f;
        C13961h c = e1Var.mo62183c();
        if (c == null || (f = gVar.mo74068f(c)) == null) {
            return null;
        }
        if (f instanceof C13947d1) {
            return new C14908b(m92814b((C13947d1) f, list), (C14901e1) null);
        }
        C14901e1 a = f.mo62171j().mo72368a(gVar);
        C13706o.m87928e(a, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new C14908b((C14951m0) null, a);
    }

    /* renamed from: g */
    public static final C14951m0 m92819g(C14830a1 a1Var, C13948e eVar, List<? extends C14926g1> list) {
        C13706o.m87929f(a1Var, "attributes");
        C13706o.m87929f(eVar, "descriptor");
        C13706o.m87929f(list, "arguments");
        C14901e1 j = eVar.mo62171j();
        C13706o.m87928e(j, "descriptor.typeConstructor");
        return m92821i(a1Var, j, list, false, (C14849g) null, 16, (Object) null);
    }

    /* renamed from: h */
    public static final C14951m0 m92820h(C14830a1 a1Var, C14901e1 e1Var, List<? extends C14926g1> list, boolean z, C14849g gVar) {
        C13706o.m87929f(a1Var, "attributes");
        C13706o.m87929f(e1Var, "constructor");
        C13706o.m87929f(list, "arguments");
        if (!a1Var.isEmpty() || !list.isEmpty() || z || e1Var.mo62183c() == null) {
            return m92823k(a1Var, e1Var, list, z, f64036a.m92815c(e1Var, list, gVar), new C14909c(e1Var, list, a1Var, z));
        }
        C13961h c = e1Var.mo62183c();
        C13706o.m87926c(c);
        C14951m0 p = c.mo72274p();
        C13706o.m87928e(p, "constructor.declarationDescriptor!!.defaultType");
        return p;
    }

    /* renamed from: i */
    public static /* synthetic */ C14951m0 m92821i(C14830a1 a1Var, C14901e1 e1Var, List list, boolean z, C14849g gVar, int i, Object obj) {
        if ((i & 16) != 0) {
            gVar = null;
        }
        return m92820h(a1Var, e1Var, list, z, gVar);
    }

    /* renamed from: j */
    public static final C14951m0 m92822j(C14830a1 a1Var, C14901e1 e1Var, List<? extends C14926g1> list, boolean z, C14692h hVar) {
        C13706o.m87929f(a1Var, "attributes");
        C13706o.m87929f(e1Var, "constructor");
        C13706o.m87929f(list, "arguments");
        C13706o.m87929f(hVar, "memberScope");
        C14901e1 e1Var2 = e1Var;
        List<? extends C14926g1> list2 = list;
        C14955n0 n0Var = new C14955n0(e1Var2, list2, z, hVar, new C14910d(e1Var2, list2, a1Var, z, hVar));
        return a1Var.isEmpty() ? n0Var : new C14959o0(n0Var, a1Var);
    }

    /* renamed from: k */
    public static final C14951m0 m92823k(C14830a1 a1Var, C14901e1 e1Var, List<? extends C14926g1> list, boolean z, C14692h hVar, C16265l<? super C14849g, ? extends C14951m0> lVar) {
        C13706o.m87929f(a1Var, "attributes");
        C13706o.m87929f(e1Var, "constructor");
        C13706o.m87929f(list, "arguments");
        C13706o.m87929f(hVar, "memberScope");
        C13706o.m87929f(lVar, "refinedTypeFactory");
        C14955n0 n0Var = new C14955n0(e1Var, list, z, hVar, lVar);
        return a1Var.isEmpty() ? n0Var : new C14959o0(n0Var, a1Var);
    }
}
