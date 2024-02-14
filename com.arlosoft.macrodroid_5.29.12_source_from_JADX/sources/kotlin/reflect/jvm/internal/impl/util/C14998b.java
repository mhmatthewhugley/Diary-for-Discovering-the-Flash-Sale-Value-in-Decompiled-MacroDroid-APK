package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.util.C15006g;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.b */
/* compiled from: modifierChecks.kt */
public abstract class C14998b {
    /* renamed from: a */
    public final C15006g mo74258a(C14154y yVar) {
        C13706o.m87929f(yVar, "functionDescriptor");
        for (C15010h next : mo74259b()) {
            if (next.mo74270b(yVar)) {
                return next.mo74269a(yVar);
            }
        }
        return C15006g.C15007a.f64131b;
    }

    /* renamed from: b */
    public abstract List<C15010h> mo74259b();
}
