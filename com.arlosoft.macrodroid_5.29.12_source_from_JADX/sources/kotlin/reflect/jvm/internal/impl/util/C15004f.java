package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.f */
/* compiled from: modifierChecks.kt */
public interface C15004f {

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.f$a */
    /* compiled from: modifierChecks.kt */
    public static final class C15005a {
        /* renamed from: a */
        public static String m93212a(C15004f fVar, C14154y yVar) {
            C13706o.m87929f(yVar, "functionDescriptor");
            if (!fVar.mo74266b(yVar)) {
                return fVar.getDescription();
            }
            return null;
        }
    }

    /* renamed from: a */
    String mo74265a(C14154y yVar);

    /* renamed from: b */
    boolean mo74266b(C14154y yVar);

    String getDescription();
}
