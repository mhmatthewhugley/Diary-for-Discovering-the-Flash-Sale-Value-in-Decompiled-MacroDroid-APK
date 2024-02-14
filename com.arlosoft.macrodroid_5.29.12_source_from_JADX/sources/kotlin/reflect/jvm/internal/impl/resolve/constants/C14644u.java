package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.u */
/* compiled from: constantValues.kt */
public final class C14644u extends C14634o<Short> {
    public C14644u(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 T = g0Var.mo72296m().mo72126T();
        C13706o.m87928e(T, "module.builtIns.shortType");
        return T;
    }

    public String toString() {
        return ((Number) mo73727b()).intValue() + ".toShort()";
    }
}
