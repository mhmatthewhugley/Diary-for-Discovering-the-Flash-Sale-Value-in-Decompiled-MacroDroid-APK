package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 */
/* compiled from: TypeParameterDescriptorImpl */
public class C14004k0 extends C13985e {

    /* renamed from: B */
    private final C16265l<C14900e0, Void> f62535B;

    /* renamed from: C */
    private final List<C14900e0> f62536C;

    /* renamed from: D */
    private boolean f62537D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C14004k0(C14064m mVar, C13921g gVar, boolean z, C14970r1 r1Var, C16157f fVar, int i, C14158z0 z0Var, C16265l<C14900e0, Void> lVar, C13942c1 c1Var, C17012n nVar) {
        super(nVar, mVar, gVar, fVar, r1Var, z, i, z0Var, c1Var);
        if (mVar == null) {
            m88948h0(19);
        }
        if (gVar == null) {
            m88948h0(20);
        }
        if (r1Var == null) {
            m88948h0(21);
        }
        if (fVar == null) {
            m88948h0(22);
        }
        if (z0Var == null) {
            m88948h0(23);
        }
        if (c1Var == null) {
            m88948h0(24);
        }
        if (nVar == null) {
            m88948h0(25);
        }
        this.f62536C = new ArrayList(1);
        this.f62537D = false;
        this.f62535B = lVar;
    }

    /* renamed from: N0 */
    private void m88941N0() {
        if (!this.f62537D) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + m88947U0());
        }
    }

    /* renamed from: O0 */
    private void m88942O0() {
        if (this.f62537D) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + m88947U0());
        }
    }

    /* renamed from: P0 */
    public static C14004k0 m88943P0(C14064m mVar, C13921g gVar, boolean z, C14970r1 r1Var, C16157f fVar, int i, C14158z0 z0Var, C16265l<C14900e0, Void> lVar, C13942c1 c1Var, C17012n nVar) {
        if (mVar == null) {
            m88948h0(12);
        }
        if (gVar == null) {
            m88948h0(13);
        }
        if (r1Var == null) {
            m88948h0(14);
        }
        if (fVar == null) {
            m88948h0(15);
        }
        if (z0Var == null) {
            m88948h0(16);
        }
        if (c1Var == null) {
            m88948h0(17);
        }
        if (nVar == null) {
            m88948h0(18);
        }
        return new C14004k0(mVar, gVar, z, r1Var, fVar, i, z0Var, lVar, c1Var, nVar);
    }

    /* renamed from: Q0 */
    public static C14004k0 m88944Q0(C14064m mVar, C13921g gVar, boolean z, C14970r1 r1Var, C16157f fVar, int i, C14158z0 z0Var, C17012n nVar) {
        if (mVar == null) {
            m88948h0(6);
        }
        if (gVar == null) {
            m88948h0(7);
        }
        if (r1Var == null) {
            m88948h0(8);
        }
        if (fVar == null) {
            m88948h0(9);
        }
        if (z0Var == null) {
            m88948h0(10);
        }
        if (nVar == null) {
            m88948h0(11);
        }
        return m88943P0(mVar, gVar, z, r1Var, fVar, i, z0Var, (C16265l<C14900e0, Void>) null, C13942c1.C13943a.f62415a, nVar);
    }

    /* renamed from: R0 */
    public static C13950e1 m88945R0(C14064m mVar, C13921g gVar, boolean z, C14970r1 r1Var, C16157f fVar, int i, C17012n nVar) {
        if (mVar == null) {
            m88948h0(0);
        }
        if (gVar == null) {
            m88948h0(1);
        }
        if (r1Var == null) {
            m88948h0(2);
        }
        if (fVar == null) {
            m88948h0(3);
        }
        if (nVar == null) {
            m88948h0(4);
        }
        C14004k0 Q0 = m88944Q0(mVar, gVar, z, r1Var, fVar, i, C14158z0.f62778a, nVar);
        Q0.mo72423M0(C16519a.m98613f(mVar).mo72150y());
        Q0.mo72425V0();
        return Q0;
    }

    /* renamed from: S0 */
    private void m88946S0(C14900e0 e0Var) {
        if (!C14925g0.m92873a(e0Var)) {
            this.f62536C.add(e0Var);
        }
    }

    /* renamed from: U0 */
    private String m88947U0() {
        return getName() + " declared in " + C14650d.m91626m(mo62163b());
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88948h0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 28) ? 2 : 3)];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo72376K0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88948h0(27);
        }
        C16265l<C14900e0, Void> lVar = this.f62535B;
        if (lVar != null) {
            lVar.invoke(e0Var);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public List<C14900e0> mo72377L0() {
        m88941N0();
        List<C14900e0> list = this.f62536C;
        if (list == null) {
            m88948h0(28);
        }
        return list;
    }

    /* renamed from: M0 */
    public void mo72423M0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88948h0(26);
        }
        m88942O0();
        m88946S0(e0Var);
    }

    /* renamed from: T0 */
    public boolean mo72424T0() {
        return this.f62537D;
    }

    /* renamed from: V0 */
    public void mo72425V0() {
        m88942O0();
        this.f62537D = true;
    }
}
