package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.i */
/* compiled from: constantValues.kt */
public final class C14621i extends C14617g<Double> {
    public C14621i(double d) {
        super(Double.valueOf(d));
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 z = g0Var.mo72296m().mo72151z();
        C13706o.m87928e(z, "module.builtIns.doubleType");
        return z;
    }

    public String toString() {
        return ((Number) mo73727b()).doubleValue() + ".toDouble()";
    }
}
