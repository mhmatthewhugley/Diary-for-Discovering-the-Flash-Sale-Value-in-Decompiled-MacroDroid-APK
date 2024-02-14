package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 */
/* compiled from: SimpleFunctionDescriptorImpl */
public class C13994g0 extends C14020p implements C14156y0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C13994g0(C14064m mVar, C14156y0 y0Var, C13921g gVar, C16157f fVar, C13936b.C13937a aVar, C14158z0 z0Var) {
        super(mVar, y0Var, gVar, fVar, aVar, z0Var);
        if (mVar == null) {
            m88863h0(0);
        }
        if (gVar == null) {
            m88863h0(1);
        }
        if (fVar == null) {
            m88863h0(2);
        }
        if (aVar == null) {
            m88863h0(3);
        }
        if (z0Var == null) {
            m88863h0(4);
        }
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88863h0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: l1 */
    public static C13994g0 m88864l1(C14064m mVar, C13921g gVar, C16157f fVar, C13936b.C13937a aVar, C14158z0 z0Var) {
        if (mVar == null) {
            m88863h0(5);
        }
        if (gVar == null) {
            m88863h0(6);
        }
        if (fVar == null) {
            m88863h0(7);
        }
        if (aVar == null) {
            m88863h0(8);
        }
        if (z0Var == null) {
            m88863h0(9);
        }
        return new C13994g0(mVar, (C14156y0) null, gVar, fVar, aVar, z0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public C14020p mo62205L0(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        if (mVar == null) {
            m88863h0(25);
        }
        if (aVar == null) {
            m88863h0(26);
        }
        if (gVar == null) {
            m88863h0(27);
        }
        if (z0Var == null) {
            m88863h0(28);
        }
        C14156y0 y0Var = (C14156y0) yVar;
        if (fVar == null) {
            fVar = getName();
        }
        return new C13994g0(mVar, y0Var, gVar, fVar, aVar, z0Var);
    }

    /* renamed from: k1 */
    public C14156y0 mo72263O(C14064m mVar, C13945d0 d0Var, C14141u uVar, C13936b.C13937a aVar, boolean z) {
        C14156y0 y0Var = (C14156y0) super.mo72263O(mVar, d0Var, uVar, aVar, z);
        if (y0Var == null) {
            m88863h0(29);
        }
        return y0Var;
    }

    /* renamed from: m1 */
    public C14156y0 m88873a() {
        C14156y0 y0Var = (C14156y0) super.m89079a();
        if (y0Var == null) {
            m88863h0(24);
        }
        return y0Var;
    }

    /* renamed from: n1 */
    public C13994g0 mo72397R0(C14146w0 w0Var, C14146w0 w0Var2, List<C14146w0> list, List<? extends C13950e1> list2, List<C13966i1> list3, C14900e0 e0Var, C13945d0 d0Var, C14141u uVar) {
        if (list == null) {
            m88863h0(14);
        }
        if (list2 == null) {
            m88863h0(15);
        }
        if (list3 == null) {
            m88863h0(16);
        }
        if (uVar == null) {
            m88863h0(17);
        }
        C13994g0 o1 = mo68658o1(w0Var, w0Var2, list, list2, list3, e0Var, d0Var, uVar, (Map<? extends C13908a.C13909a<?>, ?>) null);
        if (o1 == null) {
            m88863h0(18);
        }
        return o1;
    }

    /* renamed from: o1 */
    public C13994g0 mo68658o1(C14146w0 w0Var, C14146w0 w0Var2, List<C14146w0> list, List<? extends C13950e1> list2, List<C13966i1> list3, C14900e0 e0Var, C13945d0 d0Var, C14141u uVar, Map<? extends C13908a.C13909a<?>, ?> map) {
        if (list == null) {
            m88863h0(19);
        }
        if (list2 == null) {
            m88863h0(20);
        }
        if (list3 == null) {
            m88863h0(21);
        }
        if (uVar == null) {
            m88863h0(22);
        }
        super.mo72397R0(w0Var, w0Var2, list, list2, list3, e0Var, d0Var, uVar);
        if (map != null && !map.isEmpty()) {
            this.f62587U = new LinkedHashMap(map);
        }
        return this;
    }

    /* renamed from: t */
    public C14154y.C14155a<? extends C14156y0> mo72401t() {
        C14154y.C14155a<? extends C14154y> t = super.mo72401t();
        if (t == null) {
            m88863h0(30);
        }
        return t;
    }
}
