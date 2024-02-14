package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14048j1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 */
/* compiled from: VariableDescriptorImpl */
public abstract class C14011m0 extends C14003k implements C14048j1 {

    /* renamed from: g */
    protected C14900e0 f62546g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14011m0(C14064m mVar, C13921g gVar, C16157f fVar, C14900e0 e0Var, C14158z0 z0Var) {
        super(mVar, gVar, fVar, z0Var);
        if (mVar == null) {
            m88994h0(0);
        }
        if (gVar == null) {
            m88994h0(1);
        }
        if (fVar == null) {
            m88994h0(2);
        }
        if (z0Var == null) {
            m88994h0(3);
        }
        this.f62546g = e0Var;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88994h0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: G0 */
    public void mo72446G0(C14900e0 e0Var) {
        this.f62546g = e0Var;
    }

    /* renamed from: L */
    public C14146w0 mo72231L() {
        return null;
    }

    /* renamed from: P */
    public C14146w0 mo72232P() {
        return null;
    }

    /* renamed from: g */
    public List<C13966i1> mo72235g() {
        List<C13966i1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88994h0(6);
        }
        return emptyList;
    }

    /* renamed from: g0 */
    public boolean mo68653g0() {
        return false;
    }

    public C14900e0 getReturnType() {
        C14900e0 type = getType();
        if (type == null) {
            m88994h0(10);
        }
        return type;
    }

    public C14900e0 getType() {
        C14900e0 e0Var = this.f62546g;
        if (e0Var == null) {
            m88994h0(4);
        }
        return e0Var;
    }

    public List<C13950e1> getTypeParameters() {
        List<C13950e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88994h0(8);
        }
        return emptyList;
    }
}
