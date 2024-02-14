package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.l */
/* compiled from: constantValues.kt */
public final class C14626l extends C14617g<Float> {
    public C14626l(float f) {
        super(Float.valueOf(f));
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 B = g0Var.mo72296m().mo72111B();
        C13706o.m87928e(B, "module.builtIns.floatType");
        return B;
    }

    public String toString() {
        return ((Number) mo73727b()).floatValue() + ".toFloat()";
    }
}
