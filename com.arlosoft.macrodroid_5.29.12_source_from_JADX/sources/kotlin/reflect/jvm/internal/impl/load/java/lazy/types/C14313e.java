package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14833b0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p297ja.C13328m;
import p297ja.C13337s;
import p362pb.C16151b;
import p370qa.C16265l;
import p389sb.C16519a;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e */
/* compiled from: RawType.kt */
public final class C14313e extends C14936j1 {

    /* renamed from: d */
    public static final C14314a f63087d = new C14314a((C13695i) null);

    /* renamed from: e */
    private static final C14308a f63088e;

    /* renamed from: f */
    private static final C14308a f63089f;

    /* renamed from: c */
    private final C14319g f63090c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e$a */
    /* compiled from: RawType.kt */
    public static final class C14314a {
        private C14314a() {
        }

        public /* synthetic */ C14314a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e$b */
    /* compiled from: RawType.kt */
    public /* synthetic */ class C14315b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63091a;

        static {
            int[] iArr = new int[C14309b.values().length];
            iArr[C14309b.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            iArr[C14309b.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            iArr[C14309b.INFLEXIBLE.ordinal()] = 3;
            f63091a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.e$c */
    /* compiled from: RawType.kt */
    static final class C14316c extends C13708q implements C16265l<C14849g, C14951m0> {
        final /* synthetic */ C14308a $attr;
        final /* synthetic */ C13948e $declaration;
        final /* synthetic */ C14951m0 $type;
        final /* synthetic */ C14313e this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14316c(C13948e eVar, C14313e eVar2, C14951m0 m0Var, C14308a aVar) {
            super(1);
            this.$declaration = eVar;
            this.this$0 = eVar2;
            this.$type = m0Var;
            this.$attr = aVar;
        }

        /* renamed from: a */
        public final C14951m0 invoke(C14849g gVar) {
            C16151b g;
            C13948e b;
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            C13948e eVar = this.$declaration;
            if (!(eVar instanceof C13948e)) {
                eVar = null;
            }
            if (eVar == null || (g = C16519a.m98614g(eVar)) == null || (b = gVar.mo74064b(g)) == null || C13706o.m87924a(b, this.$declaration)) {
                return null;
            }
            return (C14951m0) this.this$0.m90205l(this.$type, b, this.$attr).mo70154c();
        }
    }

    static {
        C14190k kVar = C14190k.COMMON;
        f63088e = C14312d.m90202d(kVar, false, (C13950e1) null, 3, (Object) null).mo72935i(C14309b.FLEXIBLE_LOWER_BOUND);
        f63089f = C14312d.m90202d(kVar, false, (C13950e1) null, 3, (Object) null).mo72935i(C14309b.FLEXIBLE_UPPER_BOUND);
    }

    public C14313e(C14319g gVar) {
        this.f63090c = gVar == null ? new C14319g(this) : gVar;
    }

    /* renamed from: k */
    public static /* synthetic */ C14926g1 m90204k(C14313e eVar, C13950e1 e1Var, C14308a aVar, C14900e0 e0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            e0Var = eVar.f63090c.mo72957c(e1Var, true, aVar);
            C13706o.m87928e(e0Var, "typeParameterUpperBoundE…eter, isRaw = true, attr)");
        }
        return eVar.mo72943j(e1Var, aVar, e0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final C13328m<C14951m0, Boolean> m90205l(C14951m0 m0Var, C13948e eVar, C14308a aVar) {
        if (m0Var.mo73702N0().getParameters().isEmpty()) {
            return C13337s.m85692a(m0Var, Boolean.FALSE);
        }
        if (C13853h.m88255c0(m0Var)) {
            C14926g1 g1Var = m0Var.mo73700L0().get(0);
            C14970r1 c = g1Var.mo74185c();
            C14900e0 type = g1Var.getType();
            C13706o.m87928e(type, "componentTypeProjection.type");
            return C13337s.m85692a(C14906f0.m92821i(m0Var.mo73701M0(), m0Var.mo73702N0(), C13612s.m87736e(new C14933i1(c, m90206m(type, aVar))), m0Var.mo73021O0(), (C14849g) null, 16, (Object) null), Boolean.FALSE);
        } else if (C14925g0.m92873a(m0Var)) {
            return C13337s.m85692a(C17088k.m100540d(C17087j.ERROR_RAW_TYPE, m0Var.mo73702N0().toString()), Boolean.FALSE);
        } else {
            C14692h q0 = eVar.mo72287q0(this);
            C13706o.m87928e(q0, "declaration.getMemberScope(this)");
            C14830a1 M0 = m0Var.mo73701M0();
            C14901e1 j = eVar.mo62171j();
            C13706o.m87928e(j, "declaration.typeConstructor");
            List<C13950e1> parameters = eVar.mo62171j().getParameters();
            C13706o.m87928e(parameters, "declaration.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(parameters, 10));
            for (C13950e1 e1Var : parameters) {
                C13706o.m87928e(e1Var, "parameter");
                arrayList.add(m90204k(this, e1Var, aVar, (C14900e0) null, 4, (Object) null));
            }
            return C13337s.m85692a(C14906f0.m92823k(M0, j, arrayList, m0Var.mo73021O0(), q0, new C14316c(eVar, this, m0Var, aVar)), Boolean.TRUE);
        }
    }

    /* renamed from: m */
    private final C14900e0 m90206m(C14900e0 e0Var, C14308a aVar) {
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c instanceof C13950e1) {
            C14900e0 c2 = this.f63090c.mo72957c((C13950e1) c, true, aVar);
            C13706o.m87928e(c2, "typeParameterUpperBoundE…tion, isRaw = true, attr)");
            return m90206m(c2, aVar);
        } else if (c instanceof C13948e) {
            C13961h c3 = C14833b0.m92417d(e0Var).mo73702N0().mo62183c();
            if (c3 instanceof C13948e) {
                C13328m<C14951m0, Boolean> l = m90205l(C14833b0.m92416c(e0Var), (C13948e) c, f63088e);
                C14951m0 a = l.mo70152a();
                boolean booleanValue = l.mo70153b().booleanValue();
                C13328m<C14951m0, Boolean> l2 = m90205l(C14833b0.m92417d(e0Var), (C13948e) c3, f63089f);
                C14951m0 a2 = l2.mo70152a();
                boolean booleanValue2 = l2.mo70153b().booleanValue();
                if (booleanValue || booleanValue2) {
                    return new C14317f(a, a2);
                }
                return C14906f0.m92816d(a, a2);
            }
            throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + c3 + "\" while for lower it's \"" + c + '\"').toString());
        } else {
            throw new IllegalStateException(("Unexpected declaration kind: " + c).toString());
        }
    }

    /* renamed from: n */
    static /* synthetic */ C14900e0 m90207n(C14313e eVar, C14900e0 e0Var, C14308a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = new C14308a(C14190k.COMMON, (C14309b) null, false, (Set) null, (C14951m0) null, 30, (C13695i) null);
        }
        return eVar.m90206m(e0Var, aVar);
    }

    /* renamed from: f */
    public boolean mo72942f() {
        return false;
    }

    /* renamed from: j */
    public final C14926g1 mo72943j(C13950e1 e1Var, C14308a aVar, C14900e0 e0Var) {
        C13706o.m87929f(e1Var, "parameter");
        C13706o.m87929f(aVar, "attr");
        C13706o.m87929f(e0Var, "erasedUpperBound");
        int i = C14315b.f63091a[aVar.mo72928d().ordinal()];
        if (i == 1) {
            return new C14933i1(C14970r1.INVARIANT, e0Var);
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (!e1Var.mo72273l().mo74232d()) {
            return new C14933i1(C14970r1.INVARIANT, C16519a.m98613f(e1Var).mo72118H());
        } else {
            List<C13950e1> parameters = e0Var.mo73702N0().getParameters();
            C13706o.m87928e(parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                return new C14933i1(C14970r1.OUT_VARIANCE, e0Var);
            }
            return C14312d.m90200b(e1Var, aVar);
        }
    }

    /* renamed from: o */
    public C14933i1 mo72941e(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "key");
        return new C14933i1(m90207n(this, e0Var, (C14308a) null, 2, (Object) null));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14313e(C14319g gVar, int i, C13695i iVar) {
        this((i & 1) != 0 ? null : gVar);
    }
}
