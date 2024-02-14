package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p416vb.C16756f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 */
/* compiled from: ReceiverParameterDescriptorImpl */
public class C13992f0 extends C13977c {

    /* renamed from: d */
    private final C14064m f62511d;

    /* renamed from: f */
    private C16756f f62512f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13992f0(C14064m mVar, C16756f fVar, C13921g gVar) {
        super(gVar);
        if (mVar == null) {
            m88859h0(0);
        }
        if (fVar == null) {
            m88859h0(1);
        }
        if (gVar == null) {
            m88859h0(2);
        }
        this.f62511d = mVar;
        this.f62512f = fVar;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88859h0(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            case 6:
                objArr[0] = "outType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = "copy";
            } else if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "setOutType";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        C14064m mVar = this.f62511d;
        if (mVar == null) {
            m88859h0(4);
        }
        return mVar;
    }

    public C16756f getValue() {
        C16756f fVar = this.f62512f;
        if (fVar == null) {
            m88859h0(3);
        }
        return fVar;
    }
}
