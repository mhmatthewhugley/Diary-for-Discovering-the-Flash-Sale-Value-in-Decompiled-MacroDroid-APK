package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14234c;
import kotlin.reflect.jvm.internal.impl.resolve.C14651e;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.n */
/* compiled from: FieldOverridabilityCondition.kt */
public final class C14324n implements C14651e {
    /* renamed from: a */
    public C14651e.C14652a mo72758a() {
        return C14651e.C14652a.BOTH;
    }

    /* renamed from: b */
    public C14651e.C14653b mo72759b(C13908a aVar, C13908a aVar2, C13948e eVar) {
        C13706o.m87929f(aVar, "superDescriptor");
        C13706o.m87929f(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C14140t0) || !(aVar instanceof C14140t0)) {
            return C14651e.C14653b.UNKNOWN;
        }
        C14140t0 t0Var = (C14140t0) aVar2;
        C14140t0 t0Var2 = (C14140t0) aVar;
        if (!C13706o.m87924a(t0Var.getName(), t0Var2.getName())) {
            return C14651e.C14653b.UNKNOWN;
        }
        if (C14234c.m89875a(t0Var) && C14234c.m89875a(t0Var2)) {
            return C14651e.C14653b.OVERRIDABLE;
        }
        if (C14234c.m89875a(t0Var) || C14234c.m89875a(t0Var2)) {
            return C14651e.C14653b.INCOMPATIBLE;
        }
        return C14651e.C14653b.UNKNOWN;
    }
}
