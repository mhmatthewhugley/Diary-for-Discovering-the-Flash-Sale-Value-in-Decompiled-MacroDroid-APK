package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.v */
/* compiled from: constantValues.kt */
public final class C14645v extends C14617g<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14645v(String str) {
        super(str);
        C13706o.m87929f(str, "value");
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 W = g0Var.mo72296m().mo72129W();
        C13706o.m87928e(W, "module.builtIns.stringType");
        return W;
    }

    public String toString() {
        return '\"' + ((String) mo73727b()) + '\"';
    }
}
