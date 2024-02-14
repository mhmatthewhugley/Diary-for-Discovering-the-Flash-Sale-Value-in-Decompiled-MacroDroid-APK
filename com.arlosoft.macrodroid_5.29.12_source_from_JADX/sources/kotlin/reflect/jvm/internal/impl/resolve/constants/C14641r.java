package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.r */
/* compiled from: constantValues.kt */
public final class C14641r extends C14634o<Long> {
    public C14641r(long j) {
        super(Long.valueOf(j));
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 F = g0Var.mo72296m().mo72116F();
        C13706o.m87928e(F, "module.builtIns.longType");
        return F;
    }

    public String toString() {
        return ((Number) mo73727b()).longValue() + ".toLong()";
    }
}
