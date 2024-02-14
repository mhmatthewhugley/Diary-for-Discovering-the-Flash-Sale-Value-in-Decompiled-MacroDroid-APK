package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.i1 */
/* compiled from: TypeProjectionImpl */
public class C14933i1 extends C14930h1 {

    /* renamed from: a */
    private final C14970r1 f64055a;

    /* renamed from: b */
    private final C14900e0 f64056b;

    public C14933i1(C14970r1 r1Var, C14900e0 e0Var) {
        if (r1Var == null) {
            m92889d(0);
        }
        if (e0Var == null) {
            m92889d(1);
        }
        this.f64055a = r1Var;
        this.f64056b = e0Var;
    }

    /* renamed from: d */
    private static /* synthetic */ void m92889d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C14926g1 mo74183a(C14849g gVar) {
        if (gVar == null) {
            m92889d(6);
        }
        return new C14933i1(this.f64055a, gVar.mo74070h(this.f64056b));
    }

    /* renamed from: b */
    public boolean mo74184b() {
        return false;
    }

    /* renamed from: c */
    public C14970r1 mo74185c() {
        C14970r1 r1Var = this.f64055a;
        if (r1Var == null) {
            m92889d(4);
        }
        return r1Var;
    }

    public C14900e0 getType() {
        C14900e0 e0Var = this.f64056b;
        if (e0Var == null) {
            m92889d(5);
        }
        return e0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14933i1(C14900e0 e0Var) {
        this(C14970r1.INVARIANT, e0Var);
        if (e0Var == null) {
            m92889d(2);
        }
    }
}
