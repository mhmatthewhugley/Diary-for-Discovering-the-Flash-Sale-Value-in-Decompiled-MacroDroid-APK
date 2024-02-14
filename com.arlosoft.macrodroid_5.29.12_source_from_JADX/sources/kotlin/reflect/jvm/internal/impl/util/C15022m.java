package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.util.C15004f;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.m */
/* compiled from: modifierChecks.kt */
final class C15022m implements C15004f {

    /* renamed from: a */
    public static final C15022m f64149a = new C15022m();

    /* renamed from: b */
    private static final String f64150b = "should not have varargs or parameters with default values";

    private C15022m() {
    }

    /* renamed from: a */
    public String mo74265a(C14154y yVar) {
        return C15004f.C15005a.m93212a(this, yVar);
    }

    /* renamed from: b */
    public boolean mo74266b(C14154y yVar) {
        boolean z;
        C13706o.m87929f(yVar, "functionDescriptor");
        List<C13966i1> g = yVar.mo72235g();
        C13706o.m87928e(g, "functionDescriptor.valueParameters");
        if (!(g instanceof Collection) || !g.isEmpty()) {
            for (C13966i1 i1Var : g) {
                C13706o.m87928e(i1Var, "it");
                if (C16519a.m98608a(i1Var) || i1Var.mo72306v0() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getDescription() {
        return f64150b;
    }
}
