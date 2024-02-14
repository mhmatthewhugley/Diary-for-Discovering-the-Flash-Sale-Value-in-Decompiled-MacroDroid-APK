package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14069n;
import kotlin.reflect.jvm.internal.impl.descriptors.C14073p;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.k */
/* compiled from: DeclarationDescriptorNonRootImpl */
public abstract class C14003k extends C13999j implements C14069n {

    /* renamed from: d */
    private final C14064m f62533d;

    /* renamed from: f */
    private final C14158z0 f62534f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C14003k(C14064m mVar, C13921g gVar, C16157f fVar, C14158z0 z0Var) {
        super(gVar, fVar);
        if (mVar == null) {
            m88937h0(0);
        }
        if (gVar == null) {
            m88937h0(1);
        }
        if (fVar == null) {
            m88937h0(2);
        }
        if (z0Var == null) {
            m88937h0(3);
        }
        this.f62533d = mVar;
        this.f62534f = z0Var;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88937h0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: E0 */
    public C14073p mo72233a() {
        C14073p pVar = (C14073p) super.mo72233a();
        if (pVar == null) {
            m88937h0(4);
        }
        return pVar;
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        C14064m mVar = this.f62533d;
        if (mVar == null) {
            m88937h0(5);
        }
        return mVar;
    }

    public C14158z0 getSource() {
        C14158z0 z0Var = this.f62534f;
        if (z0Var == null) {
            m88937h0(6);
        }
        return z0Var;
    }
}
