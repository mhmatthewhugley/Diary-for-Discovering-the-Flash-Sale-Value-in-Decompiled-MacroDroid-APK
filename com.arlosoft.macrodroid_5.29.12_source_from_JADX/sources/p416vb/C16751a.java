package p416vb;

import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: vb.a */
/* compiled from: AbstractReceiverValue */
public abstract class C16751a implements C16756f {

    /* renamed from: a */
    protected final C14900e0 f67690a;

    /* renamed from: b */
    private final C16756f f67691b;

    public C16751a(C14900e0 e0Var, C16756f fVar) {
        if (e0Var == null) {
            m99429b(0);
        }
        this.f67690a = e0Var;
        this.f67691b = fVar == null ? this : fVar;
    }

    /* renamed from: b */
    private static /* synthetic */ void m99429b(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C14900e0 getType() {
        C14900e0 e0Var = this.f67690a;
        if (e0Var == null) {
            m99429b(1);
        }
        return e0Var;
    }
}
