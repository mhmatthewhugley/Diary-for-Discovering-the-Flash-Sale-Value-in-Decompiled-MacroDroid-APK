package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b */
/* compiled from: AbstractLazyTypeParameterDescriptor */
public abstract class C13975b extends C13985e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13975b(C17012n nVar, C14064m mVar, C13921g gVar, C16157f fVar, C14970r1 r1Var, boolean z, int i, C14158z0 z0Var, C13942c1 c1Var) {
        super(nVar, mVar, gVar, fVar, r1Var, z, i, z0Var, c1Var);
        if (nVar == null) {
            m88639h0(0);
        }
        if (mVar == null) {
            m88639h0(1);
        }
        if (gVar == null) {
            m88639h0(2);
        }
        if (fVar == null) {
            m88639h0(3);
        }
        if (r1Var == null) {
            m88639h0(4);
        }
        if (z0Var == null) {
            m88639h0(5);
        }
        if (c1Var == null) {
            m88639h0(6);
        }
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88639h0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = mo72276v() ? "reified " : str;
        if (mo72273l() != C14970r1.INVARIANT) {
            str = mo72273l() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
