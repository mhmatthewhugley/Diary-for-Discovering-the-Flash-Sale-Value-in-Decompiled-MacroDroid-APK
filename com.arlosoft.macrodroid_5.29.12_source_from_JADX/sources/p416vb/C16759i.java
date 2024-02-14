package p416vb;

import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: vb.i */
/* compiled from: TransientReceiver */
public class C16759i extends C16751a {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16759i(C14900e0 e0Var) {
        this(e0Var, (C16756f) null);
        if (e0Var == null) {
            m99436b(0);
        }
    }

    /* renamed from: b */
    private static /* synthetic */ void m99436b(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C16759i(C14900e0 e0Var, C16756f fVar) {
        super(e0Var, fVar);
        if (e0Var == null) {
            m99436b(1);
        }
    }
}
