package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.d */
/* compiled from: constantValues.kt */
public final class C14614d extends C14634o<Byte> {
    public C14614d(byte b) {
        super(Byte.valueOf(b));
    }

    /* renamed from: c */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 t = g0Var.mo72296m().mo72145t();
        C13706o.m87928e(t, "module.builtIns.byteType");
        return t;
    }

    public String toString() {
        return ((Number) mo73727b()).intValue() + ".toByte()";
    }
}
