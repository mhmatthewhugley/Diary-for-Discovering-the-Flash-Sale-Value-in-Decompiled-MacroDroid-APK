package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.z */
/* compiled from: constantValues.kt */
public final class C14649z extends C14611a0<Short> {
    public C14649z(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: a */
    public C14900e0 mo73715a(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "module");
        C13948e a = C14147x.m89564a(g0Var, C13902k.C13903a.f62290z0);
        C14951m0 p = a != null ? a.mo72274p() : null;
        return p == null ? C17088k.m100540d(C17087j.NOT_FOUND_UNSIGNED_TYPE, "UShort") : p;
    }

    public String toString() {
        return ((Number) mo73727b()).intValue() + ".toUShort()";
    }
}