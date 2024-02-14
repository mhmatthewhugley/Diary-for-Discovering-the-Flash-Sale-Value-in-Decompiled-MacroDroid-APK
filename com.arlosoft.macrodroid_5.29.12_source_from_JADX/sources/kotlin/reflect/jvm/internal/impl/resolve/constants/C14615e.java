package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.e */
/* compiled from: constantValues.kt */
public final class C14615e extends C14634o<Character> {
    public C14615e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: c */
    private final String m91526c(char c) {
        return c == 8 ? "\\b" : c == 9 ? "\\t" : c == 10 ? "\\n" : c == 12 ? "\\f" : c == 13 ? "\\r" : m91527e(c) ? String.valueOf(c) : "?";
    }

    /* renamed from: e */
    private final boolean m91527e(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    /* renamed from: d */
    public C14951m0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C14951m0 u = g0Var.mo72296m().mo72146u();
        C13706o.m87928e(u, "module.builtIns.charType");
        return u;
    }

    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(((Character) mo73727b()).charValue()), m91526c(((Character) mo73727b()).charValue())}, 2));
        C13706o.m87928e(format, "format(this, *args)");
        return format;
    }
}
