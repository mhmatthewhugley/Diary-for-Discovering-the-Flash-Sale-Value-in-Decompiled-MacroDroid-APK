package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13907o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13911a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14048j1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14073p;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14075q;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16159h;
import p389sb.C16519a;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.d */
/* compiled from: DescriptorUtils */
public class C14650d {

    /* renamed from: a */
    public static final C16152c f63640a = new C16152c("kotlin.jvm.JvmName");

    /* renamed from: A */
    public static boolean m91601A(C14064m mVar) {
        return m91604D(mVar, C13951f.ENUM_CLASS);
    }

    /* renamed from: B */
    public static boolean m91602B(C14064m mVar) {
        if (mVar == null) {
            m91614a(36);
        }
        return m91604D(mVar, C13951f.ENUM_ENTRY);
    }

    /* renamed from: C */
    public static boolean m91603C(C14064m mVar) {
        return m91604D(mVar, C13951f.INTERFACE);
    }

    /* renamed from: D */
    private static boolean m91604D(C14064m mVar, C13951f fVar) {
        if (fVar == null) {
            m91614a(37);
        }
        return (mVar instanceof C13948e) && ((C13948e) mVar).mo62168h() == fVar;
    }

    /* renamed from: E */
    public static boolean m91605E(C14064m mVar) {
        if (mVar == null) {
            m91614a(1);
        }
        while (mVar != null) {
            if (m91634u(mVar) || m91638y(mVar)) {
                return true;
            }
            mVar = mVar.mo62163b();
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m91606F(C14900e0 e0Var, C14064m mVar) {
        if (e0Var == null) {
            m91614a(30);
        }
        if (mVar == null) {
            m91614a(31);
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c == null) {
            return false;
        }
        C14064m a = c.mo72233a();
        return (a instanceof C13961h) && (mVar instanceof C13961h) && ((C13961h) mVar).mo62171j().equals(((C13961h) a).mo62171j());
    }

    /* renamed from: G */
    public static boolean m91607G(C14064m mVar) {
        return (m91604D(mVar, C13951f.CLASS) || m91604D(mVar, C13951f.INTERFACE)) && ((C13948e) mVar).mo62179r() == C13945d0.SEALED;
    }

    /* renamed from: H */
    public static boolean m91608H(C13948e eVar, C13948e eVar2) {
        if (eVar == null) {
            m91614a(28);
        }
        if (eVar2 == null) {
            m91614a(29);
        }
        return m91609I(eVar.mo72274p(), eVar2.mo72233a());
    }

    /* renamed from: I */
    public static boolean m91609I(C14900e0 e0Var, C14064m mVar) {
        if (e0Var == null) {
            m91614a(32);
        }
        if (mVar == null) {
            m91614a(33);
        }
        if (m91606F(e0Var, mVar)) {
            return true;
        }
        for (C14900e0 I : e0Var.mo73702N0().mo72370l()) {
            if (m91609I(I, mVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m91610J(C14064m mVar) {
        return mVar != null && (mVar.mo62163b() instanceof C14050k0);
    }

    /* renamed from: K */
    public static boolean m91611K(C14048j1 j1Var, C14900e0 e0Var) {
        if (j1Var == null) {
            m91614a(63);
        }
        if (e0Var == null) {
            m91614a(64);
        }
        if (j1Var.mo72440N() || C14925g0.m92873a(e0Var)) {
            return false;
        }
        if (C14956n1.m92987b(e0Var)) {
            return true;
        }
        C13853h f = C16519a.m98613f(j1Var);
        if (!C13853h.m88274r0(e0Var)) {
            C14844e eVar = C14844e.f63967a;
            if (!eVar.mo74059b(f.mo72129W(), e0Var) && !eVar.mo74059b(f.mo72121K().mo72274p(), e0Var) && !eVar.mo74059b(f.mo72136i(), e0Var)) {
                C13907o oVar = C13907o.f62302a;
                if (C13907o.m88472d(e0Var)) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public static <D extends C13936b> D m91612L(D d) {
        if (d == null) {
            m91614a(59);
        }
        while (d.mo72264h() == C13936b.C13937a.FAKE_OVERRIDE) {
            Collection d2 = d.mo72234d();
            if (!d2.isEmpty()) {
                d = (C13936b) d2.iterator().next();
            } else {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
            }
        }
        return d;
    }

    /* renamed from: M */
    public static <D extends C14075q> D m91613M(D d) {
        if (d == null) {
            m91614a(61);
        }
        if (d instanceof C13936b) {
            return m91612L((C13936b) d);
        }
        if (d == null) {
            m91614a(62);
        }
        return d;
    }

    /* renamed from: a */
    private static /* synthetic */ void m91614a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case 88:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: b */
    public static boolean m91615b(C14064m mVar, C14064m mVar2) {
        if (mVar == null) {
            m91614a(16);
        }
        if (mVar2 == null) {
            m91614a(17);
        }
        return m91620g(mVar).equals(m91620g(mVar2));
    }

    /* renamed from: c */
    private static <D extends C13908a> void m91616c(D d, Set<D> set) {
        if (d == null) {
            m91614a(70);
        }
        if (set == null) {
            m91614a(71);
        }
        if (!set.contains(d)) {
            for (C13908a a : d.mo72233a().mo72234d()) {
                C13908a a2 = a.mo72233a();
                m91616c(a2, set);
                set.add(a2);
            }
        }
    }

    /* renamed from: d */
    public static <D extends C13908a> Set<D> m91617d(D d) {
        if (d == null) {
            m91614a(68);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m91616c(d.mo72233a(), linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static C13948e m91618e(C14900e0 e0Var) {
        if (e0Var == null) {
            m91614a(45);
        }
        return m91619f(e0Var.mo73702N0());
    }

    /* renamed from: f */
    public static C13948e m91619f(C14901e1 e1Var) {
        if (e1Var == null) {
            m91614a(46);
        }
        C13948e eVar = (C13948e) e1Var.mo62183c();
        if (eVar == null) {
            m91614a(47);
        }
        return eVar;
    }

    /* renamed from: g */
    public static C13958g0 m91620g(C14064m mVar) {
        if (mVar == null) {
            m91614a(21);
        }
        C13958g0 h = m91621h(mVar);
        if (h == null) {
            m91614a(22);
        }
        return h;
    }

    /* renamed from: h */
    public static C13958g0 m91621h(C14064m mVar) {
        if (mVar == null) {
            m91614a(23);
        }
        while (mVar != null) {
            if (mVar instanceof C13958g0) {
                return (C13958g0) mVar;
            }
            if (mVar instanceof C14074p0) {
                return ((C14074p0) mVar).mo72515B0();
            }
            mVar = mVar.mo62163b();
        }
        return null;
    }

    /* renamed from: i */
    public static C13958g0 m91622i(C14900e0 e0Var) {
        if (e0Var == null) {
            m91614a(20);
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c == null) {
            return null;
        }
        return m91621h(c);
    }

    /* renamed from: j */
    public static C13911a1 m91623j(C14064m mVar) {
        if (mVar == null) {
            m91614a(79);
        }
        if (mVar instanceof C14144v0) {
            mVar = ((C14144v0) mVar).mo72327W();
        }
        if (mVar instanceof C14073p) {
            C13911a1 b = ((C14073p) mVar).getSource().mo67419b();
            if (b == null) {
                m91614a(80);
            }
            return b;
        }
        C13911a1 a1Var = C13911a1.f62310a;
        if (a1Var == null) {
            m91614a(81);
        }
        return a1Var;
    }

    /* renamed from: k */
    public static C14141u m91624k(C13948e eVar, boolean z) {
        if (eVar == null) {
            m91614a(48);
        }
        C13951f h = eVar.mo62168h();
        if (h == C13951f.ENUM_CLASS || h.mo72288d()) {
            C14141u uVar = C14127t.f62750a;
            if (uVar == null) {
                m91614a(49);
            }
            return uVar;
        } else if (m91607G(eVar)) {
            if (z) {
                C14141u uVar2 = C14127t.f62752c;
                if (uVar2 == null) {
                    m91614a(50);
                }
                return uVar2;
            }
            C14141u uVar3 = C14127t.f62750a;
            if (uVar3 == null) {
                m91614a(51);
            }
            return uVar3;
        } else if (m91634u(eVar)) {
            C14141u uVar4 = C14127t.f62761l;
            if (uVar4 == null) {
                m91614a(52);
            }
            return uVar4;
        } else {
            C14141u uVar5 = C14127t.f62754e;
            if (uVar5 == null) {
                m91614a(53);
            }
            return uVar5;
        }
    }

    /* renamed from: l */
    public static C14146w0 m91625l(C14064m mVar) {
        if (mVar == null) {
            m91614a(0);
        }
        if (mVar instanceof C13948e) {
            return ((C13948e) mVar).mo72283J0();
        }
        return null;
    }

    /* renamed from: m */
    public static C16153d m91626m(C14064m mVar) {
        if (mVar == null) {
            m91614a(2);
        }
        C16152c o = m91628o(mVar);
        return o != null ? o.mo78566j() : m91629p(mVar);
    }

    /* renamed from: n */
    public static C16152c m91627n(C14064m mVar) {
        if (mVar == null) {
            m91614a(3);
        }
        C16152c o = m91628o(mVar);
        if (o == null) {
            o = m91629p(mVar).mo78579l();
        }
        if (o == null) {
            m91614a(4);
        }
        return o;
    }

    /* renamed from: o */
    private static C16152c m91628o(C14064m mVar) {
        if (mVar == null) {
            m91614a(5);
        }
        if ((mVar instanceof C13958g0) || C17088k.m100541m(mVar)) {
            return C16152c.f66287c;
        }
        if (mVar instanceof C14074p0) {
            return ((C14074p0) mVar).mo72519e();
        }
        if (mVar instanceof C14050k0) {
            return ((C14050k0) mVar).mo72551e();
        }
        return null;
    }

    /* renamed from: p */
    private static C16153d m91629p(C14064m mVar) {
        if (mVar == null) {
            m91614a(6);
        }
        C16153d c = m91626m(mVar.mo62163b()).mo78569c(mVar.getName());
        if (c == null) {
            m91614a(7);
        }
        return c;
    }

    /* renamed from: q */
    public static <D extends C14064m> D m91630q(C14064m mVar, Class<D> cls) {
        if (cls == null) {
            m91614a(18);
        }
        return m91631r(mVar, cls, true);
    }

    /* renamed from: r */
    public static <D extends C14064m> D m91631r(D d, Class<D> cls, boolean z) {
        if (cls == null) {
            m91614a(19);
        }
        if (d == null) {
            return null;
        }
        if (z) {
            d = d.mo62163b();
        }
        while (d != null) {
            if (cls.isInstance(d)) {
                return d;
            }
            d = d.mo62163b();
        }
        return null;
    }

    /* renamed from: s */
    public static C13948e m91632s(C13948e eVar) {
        if (eVar == null) {
            m91614a(44);
        }
        for (C14900e0 e : eVar.mo62171j().mo72370l()) {
            C13948e e2 = m91618e(e);
            if (e2.mo62168h() != C13951f.INTERFACE) {
                return e2;
            }
        }
        return null;
    }

    /* renamed from: t */
    public static boolean m91633t(C14064m mVar) {
        return m91604D(mVar, C13951f.ANNOTATION_CLASS);
    }

    /* renamed from: u */
    public static boolean m91634u(C14064m mVar) {
        if (mVar == null) {
            m91614a(34);
        }
        return m91635v(mVar) && mVar.getName().equals(C16159h.f66303b);
    }

    /* renamed from: v */
    public static boolean m91635v(C14064m mVar) {
        return m91604D(mVar, C13951f.CLASS);
    }

    /* renamed from: w */
    public static boolean m91636w(C14064m mVar) {
        return m91635v(mVar) || m91601A(mVar);
    }

    /* renamed from: x */
    public static boolean m91637x(C14064m mVar) {
        return m91604D(mVar, C13951f.OBJECT) && ((C13948e) mVar).mo62162a0();
    }

    /* renamed from: y */
    public static boolean m91638y(C14064m mVar) {
        return (mVar instanceof C14075q) && ((C14075q) mVar).getVisibility() == C14127t.f62755f;
    }

    /* renamed from: z */
    public static boolean m91639z(C13948e eVar, C13948e eVar2) {
        if (eVar == null) {
            m91614a(26);
        }
        if (eVar2 == null) {
            m91614a(27);
        }
        for (C14900e0 F : eVar.mo62171j().mo72370l()) {
            if (m91606F(F, eVar2.mo72233a())) {
                return true;
            }
        }
        return false;
    }
}
