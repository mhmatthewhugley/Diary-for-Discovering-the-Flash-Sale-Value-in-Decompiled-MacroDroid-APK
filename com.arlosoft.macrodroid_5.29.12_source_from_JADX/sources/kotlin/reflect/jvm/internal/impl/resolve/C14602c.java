package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collections;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13984d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13990e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13991f;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13992f0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13994g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14006l0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p362pb.C16157f;
import p389sb.C16519a;
import p416vb.C16752b;
import p416vb.C16753c;
import p416vb.C16754d;
import p416vb.C16756f;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.c */
/* compiled from: DescriptorFactory */
public class C14602c {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.c$a */
    /* compiled from: DescriptorFactory */
    private static class C14603a extends C13991f {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14603a(C13948e eVar, C14158z0 z0Var, boolean z) {
            super(eVar, (C14052l) null, C13921g.f62330v.mo72251b(), true, C13936b.C13937a.DECLARATION, z0Var);
            if (eVar == null) {
                m91485h0(0);
            }
            if (z0Var == null) {
                m91485h0(1);
            }
            mo72394q1(Collections.emptyList(), C14650d.m91624k(eVar, z));
        }

        /* renamed from: h0 */
        private static /* synthetic */ void m91485h0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m91469a(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 23 || i == 25) ? 2 : 3)];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
            case 32:
            case 34:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
            case 31:
            case 33:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 31:
            case 32:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 33:
            case 34:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 23 || i == 25) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static C14146w0 m91470b(C13908a aVar, C14900e0 e0Var, C13921g gVar) {
        if (aVar == null) {
            m91469a(31);
        }
        if (gVar == null) {
            m91469a(32);
        }
        if (e0Var == null) {
            return null;
        }
        return new C13992f0(aVar, new C16753c(aVar, e0Var, (C16756f) null), gVar);
    }

    /* renamed from: c */
    public static C14146w0 m91471c(C13948e eVar, C14900e0 e0Var, C13921g gVar) {
        if (eVar == null) {
            m91469a(33);
        }
        if (gVar == null) {
            m91469a(34);
        }
        if (e0Var == null) {
            return null;
        }
        return new C13992f0(eVar, new C16752b(eVar, e0Var, (C16756f) null), gVar);
    }

    /* renamed from: d */
    public static C13984d0 m91472d(C14140t0 t0Var, C13921g gVar) {
        if (t0Var == null) {
            m91469a(13);
        }
        if (gVar == null) {
            m91469a(14);
        }
        return m91477i(t0Var, gVar, true, false, false);
    }

    /* renamed from: e */
    public static C13990e0 m91473e(C14140t0 t0Var, C13921g gVar, C13921g gVar2) {
        if (t0Var == null) {
            m91469a(0);
        }
        if (gVar == null) {
            m91469a(1);
        }
        if (gVar2 == null) {
            m91469a(2);
        }
        return m91481m(t0Var, gVar, gVar2, true, false, false, t0Var.getSource());
    }

    /* renamed from: f */
    public static C14156y0 m91474f(C13948e eVar) {
        C13948e eVar2 = eVar;
        if (eVar2 == null) {
            m91469a(24);
        }
        C13921g.C13922a aVar = C13921g.f62330v;
        C13994g0 l1 = C13994g0.m88864l1(eVar2, aVar.mo72251b(), C13902k.f62183e, C13936b.C13937a.SYNTHESIZED, eVar.getSource());
        C13994g0 g0Var = l1;
        C13994g0 n1 = g0Var.mo72397R0((C14146w0) null, (C14146w0) null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C14006l0(l1, (C13966i1) null, 0, aVar.mo72251b(), C16157f.m97019i("value"), C16519a.m98613f(eVar).mo72129W(), false, false, false, (C14900e0) null, eVar.getSource())), eVar.mo72274p(), C13945d0.FINAL, C14127t.f62754e);
        if (n1 == null) {
            m91469a(25);
        }
        return n1;
    }

    /* renamed from: g */
    public static C14156y0 m91475g(C13948e eVar) {
        if (eVar == null) {
            m91469a(22);
        }
        C13994g0 n1 = C13994g0.m88864l1(eVar, C13921g.f62330v.mo72251b(), C13902k.f62182d, C13936b.C13937a.SYNTHESIZED, eVar.getSource()).mo72397R0((C14146w0) null, (C14146w0) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), C16519a.m98613f(eVar).mo72139l(C14970r1.INVARIANT, eVar.mo72274p()), C13945d0.FINAL, C14127t.f62754e);
        if (n1 == null) {
            m91469a(23);
        }
        return n1;
    }

    /* renamed from: h */
    public static C14146w0 m91476h(C13908a aVar, C14900e0 e0Var, C13921g gVar) {
        if (aVar == null) {
            m91469a(29);
        }
        if (gVar == null) {
            m91469a(30);
        }
        if (e0Var == null) {
            return null;
        }
        return new C13992f0(aVar, new C16754d(aVar, e0Var, (C16756f) null), gVar);
    }

    /* renamed from: i */
    public static C13984d0 m91477i(C14140t0 t0Var, C13921g gVar, boolean z, boolean z2, boolean z3) {
        if (t0Var == null) {
            m91469a(15);
        }
        if (gVar == null) {
            m91469a(16);
        }
        return m91478j(t0Var, gVar, z, z2, z3, t0Var.getSource());
    }

    /* renamed from: j */
    public static C13984d0 m91478j(C14140t0 t0Var, C13921g gVar, boolean z, boolean z2, boolean z3, C14158z0 z0Var) {
        if (t0Var == null) {
            m91469a(17);
        }
        if (gVar == null) {
            m91469a(18);
        }
        if (z0Var == null) {
            m91469a(19);
        }
        return new C13984d0(t0Var, gVar, t0Var.mo62179r(), t0Var.getVisibility(), z, z2, z3, C13936b.C13937a.DECLARATION, (C14142u0) null, z0Var);
    }

    /* renamed from: k */
    public static C13991f m91479k(C13948e eVar, C14158z0 z0Var) {
        if (eVar == null) {
            m91469a(20);
        }
        if (z0Var == null) {
            m91469a(21);
        }
        return new C14603a(eVar, z0Var, false);
    }

    /* renamed from: l */
    public static C13990e0 m91480l(C14140t0 t0Var, C13921g gVar, C13921g gVar2, boolean z, boolean z2, boolean z3, C14141u uVar, C14158z0 z0Var) {
        C13921g gVar3 = gVar2;
        if (t0Var == null) {
            m91469a(7);
        }
        if (gVar == null) {
            m91469a(8);
        }
        if (gVar3 == null) {
            m91469a(9);
        }
        if (uVar == null) {
            m91469a(10);
        }
        if (z0Var == null) {
            m91469a(11);
        }
        C13990e0 e0Var = new C13990e0(t0Var, gVar, t0Var.mo62179r(), uVar, z, z2, z3, C13936b.C13937a.DECLARATION, (C14144v0) null, z0Var);
        e0Var.mo72387R0(C13990e0.m88817P0(e0Var, t0Var.getType(), gVar2));
        return e0Var;
    }

    /* renamed from: m */
    public static C13990e0 m91481m(C14140t0 t0Var, C13921g gVar, C13921g gVar2, boolean z, boolean z2, boolean z3, C14158z0 z0Var) {
        if (t0Var == null) {
            m91469a(3);
        }
        if (gVar == null) {
            m91469a(4);
        }
        if (gVar2 == null) {
            m91469a(5);
        }
        if (z0Var == null) {
            m91469a(6);
        }
        return m91480l(t0Var, gVar, gVar2, z, z2, z3, t0Var.getVisibility(), z0Var);
    }

    /* renamed from: n */
    private static boolean m91482n(C14154y yVar) {
        if (yVar == null) {
            m91469a(28);
        }
        return yVar.mo72264h() == C13936b.C13937a.SYNTHESIZED && C14650d.m91601A(yVar.mo62163b());
    }

    /* renamed from: o */
    public static boolean m91483o(C14154y yVar) {
        if (yVar == null) {
            m91469a(27);
        }
        return yVar.getName().equals(C13902k.f62183e) && m91482n(yVar);
    }

    /* renamed from: p */
    public static boolean m91484p(C14154y yVar) {
        if (yVar == null) {
            m91469a(26);
        }
        return yVar.getName().equals(C13902k.f62182d) && m91482n(yVar);
    }
}
