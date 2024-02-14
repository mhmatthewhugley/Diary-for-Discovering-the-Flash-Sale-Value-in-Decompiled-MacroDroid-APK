package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.m */
/* compiled from: constantValues.kt */
public final class C14627m extends C14634o<Integer> {
    public C14627m(int i) {
        super(Integer.valueOf(i));
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 D = g0Var.mo72296m().mo72113D();
        C13706o.m87928e(D, "module.builtIns.intType");
        return D;
    }
}
