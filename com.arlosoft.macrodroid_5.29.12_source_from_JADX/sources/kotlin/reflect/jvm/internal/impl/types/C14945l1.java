package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13929k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13932l;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14607d;
import kotlin.reflect.jvm.internal.impl.types.checker.C14853j;
import p225cc.C11170a;
import p243dc.C12007b;
import p272gc.C12346c;
import p362pb.C16152c;
import p370qa.C16265l;
import p450zb.C17085h;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.l1 */
/* compiled from: TypeSubstitutor */
public class C14945l1 {

    /* renamed from: b */
    public static final C14945l1 f64066b = m92939g(C14936j1.f64059b);

    /* renamed from: a */
    private final C14936j1 f64067a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.l1$a */
    /* compiled from: TypeSubstitutor */
    static class C14946a implements C16265l<C16152c, Boolean> {
        C14946a() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m92954a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
        }

        /* renamed from: b */
        public Boolean invoke(C16152c cVar) {
            if (cVar == null) {
                m92954a(0);
            }
            return Boolean.valueOf(!cVar.equals(C13902k.C13903a.f62229Q));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.l1$b */
    /* compiled from: TypeSubstitutor */
    static /* synthetic */ class C14947b {

        /* renamed from: a */
        static final /* synthetic */ int[] f64068a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.types.l1$d[] r0 = kotlin.reflect.jvm.internal.impl.types.C14945l1.C14949d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f64068a = r0
                kotlin.reflect.jvm.internal.impl.types.l1$d r1 = kotlin.reflect.jvm.internal.impl.types.C14945l1.C14949d.OUT_IN_IN_POSITION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f64068a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.types.l1$d r1 = kotlin.reflect.jvm.internal.impl.types.C14945l1.C14949d.IN_IN_OUT_POSITION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f64068a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.types.l1$d r1 = kotlin.reflect.jvm.internal.impl.types.C14945l1.C14949d.NO_CONFLICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14945l1.C14947b.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.l1$c */
    /* compiled from: TypeSubstitutor */
    private static final class C14948c extends Exception {
        public C14948c(String str) {
            super(str);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.l1$d */
    /* compiled from: TypeSubstitutor */
    private enum C14949d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected C14945l1(C14936j1 j1Var) {
        if (j1Var == null) {
            m92933a(7);
        }
        this.f64067a = j1Var;
    }

    /* renamed from: a */
    private static /* synthetic */ void m92933a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
            default:
                objArr[0] = "substitution";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i != 34) {
            if (i != 37) {
                switch (i) {
                    case 11:
                    case 12:
                    case 13:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                }
                        }
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 2 || i == 8 || i == 34 || i == 37)) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    private static void m92934b(int i, C14926g1 g1Var, C14936j1 j1Var) {
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m92943o(g1Var) + "; substitution: " + m92943o(j1Var));
        }
    }

    /* renamed from: c */
    public static C14970r1 m92935c(C14970r1 r1Var, C14926g1 g1Var) {
        if (r1Var == null) {
            m92933a(35);
        }
        if (g1Var == null) {
            m92933a(36);
        }
        if (!g1Var.mo74184b()) {
            return m92936d(r1Var, g1Var.mo74185c());
        }
        C14970r1 r1Var2 = C14970r1.OUT_VARIANCE;
        if (r1Var2 == null) {
            m92933a(37);
        }
        return r1Var2;
    }

    /* renamed from: d */
    public static C14970r1 m92936d(C14970r1 r1Var, C14970r1 r1Var2) {
        if (r1Var == null) {
            m92933a(38);
        }
        if (r1Var2 == null) {
            m92933a(39);
        }
        C14970r1 r1Var3 = C14970r1.INVARIANT;
        if (r1Var == r1Var3) {
            if (r1Var2 == null) {
                m92933a(40);
            }
            return r1Var2;
        } else if (r1Var2 == r1Var3) {
            if (r1Var == null) {
                m92933a(41);
            }
            return r1Var;
        } else if (r1Var == r1Var2) {
            if (r1Var2 == null) {
                m92933a(42);
            }
            return r1Var2;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + r1Var + "' and " + "projection kind '" + r1Var2 + "' cannot be combined");
        }
    }

    /* renamed from: e */
    private static C14949d m92937e(C14970r1 r1Var, C14970r1 r1Var2) {
        C14970r1 r1Var3 = C14970r1.IN_VARIANCE;
        if (r1Var == r1Var3 && r1Var2 == C14970r1.OUT_VARIANCE) {
            return C14949d.OUT_IN_IN_POSITION;
        }
        if (r1Var == C14970r1.OUT_VARIANCE && r1Var2 == r1Var3) {
            return C14949d.IN_IN_OUT_POSITION;
        }
        return C14949d.NO_CONFLICT;
    }

    /* renamed from: f */
    public static C14945l1 m92938f(C14900e0 e0Var) {
        if (e0Var == null) {
            m92933a(6);
        }
        return m92939g(C14911f1.m92829i(e0Var.mo73702N0(), e0Var.mo73700L0()));
    }

    /* renamed from: g */
    public static C14945l1 m92939g(C14936j1 j1Var) {
        if (j1Var == null) {
            m92933a(0);
        }
        return new C14945l1(j1Var);
    }

    /* renamed from: h */
    public static C14945l1 m92940h(C14936j1 j1Var, C14936j1 j1Var2) {
        if (j1Var == null) {
            m92933a(3);
        }
        if (j1Var2 == null) {
            m92933a(4);
        }
        return m92939g(C14978u.m93119i(j1Var, j1Var2));
    }

    /* renamed from: i */
    private static C13921g m92941i(C13921g gVar) {
        if (gVar == null) {
            m92933a(33);
        }
        if (!gVar.mo72249n1(C13902k.C13903a.f62229Q)) {
            return gVar;
        }
        return new C13932l(gVar, new C14946a());
    }

    /* renamed from: l */
    private static C14926g1 m92942l(C14900e0 e0Var, C14926g1 g1Var, C13950e1 e1Var, C14926g1 g1Var2) {
        if (e0Var == null) {
            m92933a(26);
        }
        if (g1Var == null) {
            m92933a(27);
        }
        if (g1Var2 == null) {
            m92933a(28);
        }
        if (!e0Var.getAnnotations().mo72249n1(C13902k.C13903a.f62229Q)) {
            if (g1Var == null) {
                m92933a(29);
            }
            return g1Var;
        }
        C14901e1 N0 = g1Var.getType().mo73702N0();
        if (!(N0 instanceof C14853j)) {
            return g1Var;
        }
        C14926g1 U0 = ((C14853j) N0).mo73707U0();
        C14970r1 c = U0.mo74185c();
        C14949d e = m92937e(g1Var2.mo74185c(), c);
        C14949d dVar = C14949d.OUT_IN_IN_POSITION;
        if (e == dVar) {
            return new C14933i1(U0.getType());
        }
        return (e1Var != null && m92937e(e1Var.mo72273l(), c) == dVar) ? new C14933i1(U0.getType()) : g1Var;
    }

    /* renamed from: o */
    private static String m92943o(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (!C12346c.m83094a(th)) {
                return "[Exception while computing toString(): " + th + "]";
            }
            throw th;
        }
    }

    /* renamed from: r */
    private C14926g1 m92944r(C14926g1 g1Var, int i) throws C14948c {
        C14900e0 type = g1Var.getType();
        C14970r1 c = g1Var.mo74185c();
        if (type.mo73702N0().mo62183c() instanceof C13950e1) {
            return g1Var;
        }
        C14900e0 e0Var = null;
        C14951m0 b = C14966q0.m93064b(type);
        if (b != null) {
            e0Var = mo74213m().mo74215p(b, C14970r1.INVARIANT);
        }
        C14900e0 b2 = C14942k1.m92922b(type, m92945s(type.mo73702N0().getParameters(), type.mo73700L0(), i), this.f64067a.mo74204d(type.getAnnotations()));
        if ((b2 instanceof C14951m0) && (e0Var instanceof C14951m0)) {
            b2 = C14966q0.m93072j((C14951m0) b2, (C14951m0) e0Var);
        }
        return new C14933i1(c, b2);
    }

    /* renamed from: s */
    private List<C14926g1> m92945s(List<C13950e1> list, List<C14926g1> list2, int i) throws C14948c {
        C14970r1 r1Var;
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C13950e1 e1Var = list.get(i2);
            C14926g1 g1Var = list2.get(i2);
            C14926g1 u = m92946u(g1Var, e1Var, i + 1);
            int i3 = C14947b.f64068a[m92937e(e1Var.mo72273l(), u.mo74185c()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                u = C14956n1.m93004s(e1Var);
            } else if (i3 == 3 && e1Var.mo72273l() != (r1Var = C14970r1.INVARIANT) && !u.mo74184b()) {
                u = new C14933i1(r1Var, u.getType());
            }
            if (u != g1Var) {
                z = true;
            }
            arrayList.add(u);
        }
        return !z ? list2 : arrayList;
    }

    /* renamed from: u */
    private C14926g1 m92946u(C14926g1 g1Var, C13950e1 e1Var, int i) throws C14948c {
        C14900e0 e0Var;
        if (g1Var == null) {
            m92933a(18);
        }
        m92934b(i, g1Var, this.f64067a);
        if (g1Var.mo74184b()) {
            return g1Var;
        }
        C14900e0 type = g1Var.getType();
        if (type instanceof C14960o1) {
            C14960o1 o1Var = (C14960o1) type;
            C14967q1 G0 = o1Var.mo74038G0();
            C14900e0 h0 = o1Var.mo74041h0();
            C14926g1 u = m92946u(new C14933i1(g1Var.mo74185c(), G0), e1Var, i + 1);
            if (u.mo74184b()) {
                return u;
            }
            return new C14933i1(u.mo74185c(), C14964p1.m93057d(u.getType().mo74145Q0(), mo74215p(h0, g1Var.mo74185c())));
        }
        if (!C14984w.m93156a(type) && !(type.mo74145Q0() instanceof C14944l0)) {
            C14926g1 e = this.f64067a.mo72941e(type);
            C14926g1 l = e != null ? m92942l(type, e, e1Var, g1Var) : null;
            C14970r1 c = g1Var.mo74185c();
            if (l == null && C14833b0.m92415b(type) && !C14837c1.m92431b(type)) {
                C14990y a = C14833b0.m92414a(type);
                int i2 = i + 1;
                C14926g1 u2 = m92946u(new C14933i1(c, a.mo74251V0()), e1Var, i2);
                C14926g1 u3 = m92946u(new C14933i1(c, a.mo74252W0()), e1Var, i2);
                C14970r1 c2 = u2.mo74185c();
                if (u2.getType() == a.mo74251V0() && u3.getType() == a.mo74252W0()) {
                    return g1Var;
                }
                return new C14933i1(c2, C14906f0.m92816d(C14942k1.m92921a(u2.getType()), C14942k1.m92921a(u3.getType())));
            } else if (!C13853h.m88267m0(type) && !C14925g0.m92873a(type)) {
                if (l != null) {
                    C14949d e2 = m92937e(c, l.mo74185c());
                    if (!C14607d.m91514d(type)) {
                        int i3 = C14947b.f64068a[e2.ordinal()];
                        if (i3 == 1) {
                            throw new C14948c("Out-projection in in-position");
                        } else if (i3 == 2) {
                            return new C14933i1(C14970r1.OUT_VARIANCE, type.mo73702N0().mo72371m().mo72119I());
                        }
                    }
                    C14954n a2 = C14837c1.m92430a(type);
                    if (l.mo74184b()) {
                        return l;
                    }
                    if (a2 != null) {
                        e0Var = a2.mo73028k0(l.getType());
                    } else {
                        e0Var = C14956n1.m93002q(l.getType(), type.mo73021O0());
                    }
                    if (!type.getAnnotations().isEmpty()) {
                        e0Var = C11170a.m74972u(e0Var, new C13929k(e0Var.getAnnotations(), m92941i(this.f64067a.mo74204d(type.getAnnotations()))));
                    }
                    if (e2 == C14949d.NO_CONFLICT) {
                        c = m92936d(c, l.mo74185c());
                    }
                    return new C14933i1(c, e0Var);
                }
                g1Var = m92944r(g1Var, i);
                if (g1Var == null) {
                    m92933a(25);
                }
            }
        }
        return g1Var;
    }

    /* renamed from: j */
    public C14936j1 mo74211j() {
        C14936j1 j1Var = this.f64067a;
        if (j1Var == null) {
            m92933a(8);
        }
        return j1Var;
    }

    /* renamed from: k */
    public boolean mo74212k() {
        return this.f64067a.mo72942f();
    }

    /* renamed from: m */
    public C14945l1 mo74213m() {
        C14936j1 j1Var = this.f64067a;
        return (!(j1Var instanceof C14836c0) || !j1Var.mo73714b()) ? this : new C14945l1(new C14836c0(((C14836c0) this.f64067a).mo74057j(), ((C14836c0) this.f64067a).mo74056i(), false));
    }

    /* renamed from: n */
    public C14900e0 mo74214n(C14900e0 e0Var, C14970r1 r1Var) {
        if (e0Var == null) {
            m92933a(9);
        }
        if (r1Var == null) {
            m92933a(10);
        }
        if (mo74212k()) {
            if (e0Var == null) {
                m92933a(11);
            }
            return e0Var;
        }
        try {
            C14900e0 type = m92946u(new C14933i1(r1Var, e0Var), (C13950e1) null, 0).getType();
            if (type == null) {
                m92933a(12);
            }
            return type;
        } catch (C14948c e) {
            C17085h d = C17088k.m100540d(C17087j.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (d == null) {
                m92933a(13);
            }
            return d;
        }
    }

    /* renamed from: p */
    public C14900e0 mo74215p(C14900e0 e0Var, C14970r1 r1Var) {
        if (e0Var == null) {
            m92933a(14);
        }
        if (r1Var == null) {
            m92933a(15);
        }
        C14926g1 q = mo74216q(new C14933i1(r1Var, mo74211j().mo74205g(e0Var, r1Var)));
        if (q == null) {
            return null;
        }
        return q.getType();
    }

    /* renamed from: q */
    public C14926g1 mo74216q(C14926g1 g1Var) {
        if (g1Var == null) {
            m92933a(16);
        }
        C14926g1 t = mo74217t(g1Var);
        if (this.f64067a.mo74164a() || this.f64067a.mo73714b()) {
            return C12007b.m82438c(t, this.f64067a.mo73714b());
        }
        return t;
    }

    /* renamed from: t */
    public C14926g1 mo74217t(C14926g1 g1Var) {
        if (g1Var == null) {
            m92933a(17);
        }
        if (mo74212k()) {
            return g1Var;
        }
        try {
            return m92946u(g1Var, (C13950e1) null, 0);
        } catch (C14948c unused) {
            return null;
        }
    }
}
