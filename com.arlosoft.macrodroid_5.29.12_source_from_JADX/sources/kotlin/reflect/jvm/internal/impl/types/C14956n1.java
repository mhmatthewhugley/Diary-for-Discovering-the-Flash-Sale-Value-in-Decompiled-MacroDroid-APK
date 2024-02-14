package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import kotlin.reflect.jvm.internal.impl.types.checker.C14862n;
import p272gc.C12359f;
import p370qa.C16265l;
import p450zb.C17085h;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.n1 */
/* compiled from: TypeUtils */
public class C14956n1 {

    /* renamed from: a */
    public static final C14951m0 f64079a = C17088k.m100540d(C17087j.DONT_CARE, new String[0]);

    /* renamed from: b */
    public static final C14951m0 f64080b = C17088k.m100540d(C17087j.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* renamed from: c */
    public static final C14951m0 f64081c = new C14957a("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final C14951m0 f64082d = new C14957a("UNIT_EXPECTED_TYPE");

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.n1$a */
    /* compiled from: TypeUtils */
    public static class C14957a extends C14968r {

        /* renamed from: c */
        private final String f64083c;

        public C14957a(String str) {
            this.f64083c = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
        /* renamed from: Z0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void m93008Z0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L_0x0009
                if (r9 == r0) goto L_0x0009
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto L_0x000b
            L_0x0009:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            L_0x000b:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L_0x0013
                if (r9 == r0) goto L_0x0013
                r5 = 3
                goto L_0x0014
            L_0x0013:
                r5 = 2
            L_0x0014:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L_0x0030
                if (r9 == r4) goto L_0x002b
                if (r9 == r3) goto L_0x0026
                if (r9 == r0) goto L_0x0030
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L_0x0032
            L_0x0026:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L_0x0032
            L_0x002b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L_0x0032
            L_0x0030:
                r5[r7] = r6
            L_0x0032:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L_0x003e
                if (r9 == r0) goto L_0x003b
                r5[r1] = r6
                goto L_0x0042
            L_0x003b:
                r5[r1] = r7
                goto L_0x0042
            L_0x003e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L_0x0042:
                if (r9 == r1) goto L_0x0056
                if (r9 == r4) goto L_0x0052
                if (r9 == r3) goto L_0x004f
                if (r9 == r0) goto L_0x0056
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L_0x0056
            L_0x004f:
                r5[r4] = r7
                goto L_0x0056
            L_0x0052:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L_0x0056:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L_0x0064
                if (r9 == r0) goto L_0x0064
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L_0x0069
            L_0x0064:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L_0x0069:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14956n1.C14957a.m93008Z0(int):void");
        }

        /* renamed from: U0 */
        public C14951m0 mo72947R0(boolean z) {
            throw new IllegalStateException(this.f64083c);
        }

        /* renamed from: V0 */
        public C14951m0 mo72949T0(C14830a1 a1Var) {
            if (a1Var == null) {
                m93008Z0(0);
            }
            throw new IllegalStateException(this.f64083c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: W0 */
        public C14951m0 mo73024W0() {
            throw new IllegalStateException(this.f64083c);
        }

        /* renamed from: Y0 */
        public C14968r mo73025Y0(C14951m0 m0Var) {
            if (m0Var == null) {
                m93008Z0(2);
            }
            throw new IllegalStateException(this.f64083c);
        }

        /* renamed from: a1 */
        public C14957a mo74033X0(C14849g gVar) {
            if (gVar == null) {
                m93008Z0(3);
            }
            return this;
        }

        public String toString() {
            String str = this.f64083c;
            if (str == null) {
                m93008Z0(1);
            }
            return str;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m92986a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
                objArr[0] = "parameterDescriptor";
                break;
            case 46:
            case 50:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 48:
            case 49:
                objArr[0] = "supertypes";
                break;
            case 51:
            case 54:
                objArr[0] = "expectedType";
                break;
            case 53:
                objArr[0] = "literalTypeConstructor";
                break;
            default:
                objArr[0] = "type";
                break;
        }
        if (i3 != 4) {
            if (i3 != 9) {
                if (i3 == 11 || i3 == 15) {
                    objArr[1] = "makeUnsubstitutedType";
                } else if (i3 == 17) {
                    objArr[1] = "getDefaultTypeProjections";
                } else if (i3 == 19) {
                    objArr[1] = "getImmediateSupertypes";
                } else if (i3 == 26) {
                    objArr[1] = "getAllSupertypes";
                } else if (i3 == 35) {
                    objArr[1] = "substituteProjectionsForParameters";
                } else if (i3 != 47) {
                    if (i3 != 52) {
                        if (!(i3 == 6 || i3 == 7)) {
                            switch (i3) {
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                    break;
                                default:
                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                    break;
                            }
                        }
                    }
                    objArr[1] = "getPrimitiveNumberType";
                } else {
                    objArr[1] = "getDefaultPrimitiveNumberType";
                }
            }
            objArr[1] = "makeNullableIfNeeded";
        } else {
            objArr[1] = "makeNullableAsSpecified";
        }
        switch (i3) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
                objArr[2] = "makeStarProjection";
                break;
            case 46:
            case 48:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 49:
                objArr[2] = "findByFqName";
                break;
            case 50:
            case 51:
            case 53:
            case 54:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 59:
                objArr[2] = "isTypeParameter";
                break;
            case 60:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 61:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 4 || i3 == 9 || i3 == 11 || i3 == 15 || i3 == 17 || i3 == 19 || i3 == 26 || i3 == 35 || i3 == 47 || i3 == 52 || i3 == 6 || i3 == 7)) {
            switch (i3) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static boolean m92987b(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(28);
        }
        if (e0Var.mo73021O0()) {
            return true;
        }
        if (!C14833b0.m92415b(e0Var) || !m92987b(C14833b0.m92414a(e0Var).mo74252W0())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m92988c(C14900e0 e0Var, C16265l<C14967q1, Boolean> lVar) {
        if (lVar == null) {
            m92986a(43);
        }
        return m92989d(e0Var, lVar, (C12359f<C14900e0>) null);
    }

    /* renamed from: d */
    private static boolean m92989d(C14900e0 e0Var, C16265l<C14967q1, Boolean> lVar, C12359f<C14900e0> fVar) {
        if (lVar == null) {
            m92986a(44);
        }
        if (e0Var == null) {
            return false;
        }
        C14967q1 Q0 = e0Var.mo74145Q0();
        if (m93007v(e0Var)) {
            return lVar.invoke(Q0).booleanValue();
        }
        if (fVar != null && fVar.contains(e0Var)) {
            return false;
        }
        if (lVar.invoke(Q0).booleanValue()) {
            return true;
        }
        if (fVar == null) {
            fVar = C12359f.m83113c();
        }
        fVar.add(e0Var);
        C14990y yVar = Q0 instanceof C14990y ? (C14990y) Q0 : null;
        if (yVar != null && (m92989d(yVar.mo74251V0(), lVar, fVar) || m92989d(yVar.mo74252W0(), lVar, fVar))) {
            return true;
        }
        if ((Q0 instanceof C14961p) && m92989d(((C14961p) Q0).mo74226Z0(), lVar, fVar)) {
            return true;
        }
        C14901e1 N0 = e0Var.mo73702N0();
        if (N0 instanceof C14884d0) {
            for (C14900e0 d : ((C14884d0) N0).mo72370l()) {
                if (m92989d(d, lVar, fVar)) {
                    return true;
                }
            }
            return false;
        }
        for (C14926g1 next : e0Var.mo73700L0()) {
            if (!next.mo74184b()) {
                if (m92989d(next.getType(), lVar, fVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static C14900e0 m92990e(C14900e0 e0Var, C14900e0 e0Var2, C14945l1 l1Var) {
        if (e0Var == null) {
            m92986a(20);
        }
        if (e0Var2 == null) {
            m92986a(21);
        }
        if (l1Var == null) {
            m92986a(22);
        }
        C14900e0 p = l1Var.mo74215p(e0Var2, C14970r1.INVARIANT);
        if (p != null) {
            return m93002q(p, e0Var.mo73021O0());
        }
        return null;
    }

    /* renamed from: f */
    public static C13948e m92991f(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(30);
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c instanceof C13948e) {
            return (C13948e) c;
        }
        return null;
    }

    /* renamed from: g */
    public static List<C14926g1> m92992g(List<C13950e1> list) {
        if (list == null) {
            m92986a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C13950e1 p : list) {
            arrayList.add(new C14933i1(p.mo72274p()));
        }
        List<C14926g1> F0 = C13566b0.m87402F0(arrayList);
        if (F0 == null) {
            m92986a(17);
        }
        return F0;
    }

    /* renamed from: h */
    public static List<C14900e0> m92993h(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(18);
        }
        C14945l1 f = C14945l1.m92938f(e0Var);
        Collection<C14900e0> l = e0Var.mo73702N0().mo72370l();
        ArrayList arrayList = new ArrayList(l.size());
        for (C14900e0 e : l) {
            C14900e0 e2 = m92990e(e0Var, e, f);
            if (e2 != null) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static C13950e1 m92994i(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(62);
        }
        if (e0Var.mo73702N0().mo62183c() instanceof C13950e1) {
            return (C13950e1) e0Var.mo73702N0().mo62183c();
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m92995j(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(29);
        }
        if (e0Var.mo73702N0().mo62183c() instanceof C13948e) {
            return false;
        }
        for (C14900e0 l : m92993h(e0Var)) {
            if (m92997l(l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m92996k(C14900e0 e0Var) {
        return e0Var != null && e0Var.mo73702N0() == f64079a.mo73702N0();
    }

    /* renamed from: l */
    public static boolean m92997l(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(27);
        }
        if (e0Var.mo73021O0()) {
            return true;
        }
        if (C14833b0.m92415b(e0Var) && m92997l(C14833b0.m92414a(e0Var).mo74252W0())) {
            return true;
        }
        if (C14966q0.m93065c(e0Var)) {
            return false;
        }
        if (m92998m(e0Var)) {
            return m92995j(e0Var);
        }
        if (e0Var instanceof C14898e) {
            C13950e1 b = ((C14898e) e0Var).mo74142W0().mo74095b();
            if (b == null || m92995j(b.mo72274p())) {
                return true;
            }
            return false;
        }
        C14901e1 N0 = e0Var.mo73702N0();
        if (N0 instanceof C14884d0) {
            for (C14900e0 l : N0.mo72370l()) {
                if (m92997l(l)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m92998m(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(59);
        }
        return m92994i(e0Var) != null || (e0Var.mo73702N0() instanceof C14862n);
    }

    /* renamed from: n */
    public static C14900e0 m92999n(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(2);
        }
        return m93001p(e0Var, false);
    }

    /* renamed from: o */
    public static C14900e0 m93000o(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(1);
        }
        return m93001p(e0Var, true);
    }

    /* renamed from: p */
    public static C14900e0 m93001p(C14900e0 e0Var, boolean z) {
        if (e0Var == null) {
            m92986a(3);
        }
        C14967q1 R0 = e0Var.mo74145Q0().mo72947R0(z);
        if (R0 == null) {
            m92986a(4);
        }
        return R0;
    }

    /* renamed from: q */
    public static C14900e0 m93002q(C14900e0 e0Var, boolean z) {
        if (e0Var == null) {
            m92986a(8);
        }
        if (z) {
            return m93000o(e0Var);
        }
        if (e0Var == null) {
            m92986a(9);
        }
        return e0Var;
    }

    /* renamed from: r */
    public static C14951m0 m93003r(C14951m0 m0Var, boolean z) {
        if (m0Var == null) {
            m92986a(5);
        }
        if (z) {
            C14951m0 U0 = m0Var.mo73022U0(true);
            if (U0 == null) {
                m92986a(6);
            }
            return U0;
        }
        if (m0Var == null) {
            m92986a(7);
        }
        return m0Var;
    }

    /* renamed from: s */
    public static C14926g1 m93004s(C13950e1 e1Var) {
        if (e1Var == null) {
            m92986a(45);
        }
        return new C14972s0(e1Var);
    }

    /* renamed from: t */
    public static C14951m0 m93005t(C13961h hVar, C14692h hVar2, C16265l<C14849g, C14951m0> lVar) {
        if (!C17088k.m100541m(hVar)) {
            return m93006u(hVar.mo62171j(), hVar2, lVar);
        }
        C17085h d = C17088k.m100540d(C17087j.UNABLE_TO_SUBSTITUTE_TYPE, hVar.toString());
        if (d == null) {
            m92986a(11);
        }
        return d;
    }

    /* renamed from: u */
    public static C14951m0 m93006u(C14901e1 e1Var, C14692h hVar, C16265l<C14849g, C14951m0> lVar) {
        if (e1Var == null) {
            m92986a(12);
        }
        if (hVar == null) {
            m92986a(13);
        }
        if (lVar == null) {
            m92986a(14);
        }
        C14951m0 k = C14906f0.m92823k(C14830a1.f63959c.mo74051h(), e1Var, m92992g(e1Var.getParameters()), false, hVar, lVar);
        if (k == null) {
            m92986a(15);
        }
        return k;
    }

    /* renamed from: v */
    public static boolean m93007v(C14900e0 e0Var) {
        if (e0Var == null) {
            m92986a(0);
        }
        return e0Var == f64081c || e0Var == f64082d;
    }
}
