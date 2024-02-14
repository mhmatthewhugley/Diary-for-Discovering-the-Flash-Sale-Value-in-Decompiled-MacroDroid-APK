package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13914b;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.j */
/* compiled from: DeclarationDescriptorImpl */
public abstract class C13999j extends C13914b implements C14064m {

    /* renamed from: c */
    private final C16157f f62526c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13999j(C13921g gVar, C16157f fVar) {
        super(gVar);
        if (gVar == null) {
            m88907h0(0);
        }
        if (fVar == null) {
            m88907h0(1);
        }
        this.f62526c = fVar;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88907h0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: k0 */
    public static String m88908k0(C14064m mVar) {
        if (mVar == null) {
            m88907h0(4);
        }
        try {
            String str = C14552c.f63486j.mo73527q(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                m88907h0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 == null) {
                m88907h0(6);
            }
            return str2;
        }
    }

    /* renamed from: a */
    public C14064m mo72233a() {
        return this;
    }

    public C16157f getName() {
        C16157f fVar = this.f62526c;
        if (fVar == null) {
            m88907h0(2);
        }
        return fVar;
    }

    public String toString() {
        return m88908k0(this);
    }
}
