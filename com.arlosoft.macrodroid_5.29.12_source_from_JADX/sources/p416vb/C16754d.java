package p416vb;

import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: vb.d */
/* compiled from: ExtensionReceiver */
public class C16754d extends C16751a {

    /* renamed from: c */
    private final C13908a f67694c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16754d(C13908a aVar, C14900e0 e0Var, C16756f fVar) {
        super(e0Var, fVar);
        if (aVar == null) {
            m99431b(0);
        }
        if (e0Var == null) {
            m99431b(1);
        }
        this.f67694c = aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ void m99431b(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return getType() + ": Ext {" + this.f67694c + "}";
    }
}
