package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14317f;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14808s;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p308kb.C13508q;
import p336nb.C15766a;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.i */
/* compiled from: JavaFlexibleTypeDeserializer.kt */
public final class C14443i implements C14808s {

    /* renamed from: a */
    public static final C14443i f63281a = new C14443i();

    private C14443i() {
    }

    /* renamed from: a */
    public C14900e0 mo73169a(C13508q qVar, String str, C14951m0 m0Var, C14951m0 m0Var2) {
        C13706o.m87929f(qVar, "proto");
        C13706o.m87929f(str, "flexibleId");
        C13706o.m87929f(m0Var, "lowerBound");
        C13706o.m87929f(m0Var2, "upperBound");
        if (!C13706o.m87924a(str, "kotlin.jvm.PlatformType")) {
            return C17088k.m100540d(C17087j.ERROR_FLEXIBLE_TYPE, str, m0Var.toString(), m0Var2.toString());
        } else if (qVar.mo73396z(C15766a.f65117g)) {
            return new C14317f(m0Var, m0Var2);
        } else {
            return C14906f0.m92816d(m0Var, m0Var2);
        }
    }
}
