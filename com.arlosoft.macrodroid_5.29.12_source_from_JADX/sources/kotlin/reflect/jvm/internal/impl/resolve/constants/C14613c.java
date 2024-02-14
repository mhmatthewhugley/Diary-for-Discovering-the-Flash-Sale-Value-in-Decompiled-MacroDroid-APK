package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.c */
/* compiled from: constantValues.kt */
public final class C14613c extends C14617g<Boolean> {
    public C14613c(boolean z) {
        super(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 n = g0Var.mo72296m().mo72141n();
        C13706o.m87928e(n, "module.builtIns.booleanType");
        return n;
    }
}
