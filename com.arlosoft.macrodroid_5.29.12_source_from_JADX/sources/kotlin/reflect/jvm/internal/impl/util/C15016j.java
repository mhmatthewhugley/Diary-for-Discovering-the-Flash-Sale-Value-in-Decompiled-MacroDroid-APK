package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13863j;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.util.C15004f;
import p225cc.C11170a;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.j */
/* compiled from: modifierChecks.kt */
final class C15016j implements C15004f {

    /* renamed from: a */
    public static final C15016j f64143a = new C15016j();

    /* renamed from: b */
    private static final String f64144b = "second parameter must be of type KProperty<*> or its supertype";

    private C15016j() {
    }

    /* renamed from: a */
    public String mo74265a(C14154y yVar) {
        return C15004f.C15005a.m93212a(this, yVar);
    }

    /* renamed from: b */
    public boolean mo74266b(C14154y yVar) {
        C13706o.m87929f(yVar, "functionDescriptor");
        C13966i1 i1Var = yVar.mo72235g().get(1);
        C13863j.C13865b bVar = C13863j.f62095k;
        C13706o.m87928e(i1Var, "secondParameter");
        C14900e0 a = bVar.mo72164a(C16519a.m98619l(i1Var));
        if (a == null) {
            return false;
        }
        C14900e0 type = i1Var.getType();
        C13706o.m87928e(type, "secondParameter.type");
        return C11170a.m74966o(a, C11170a.m74970s(type));
    }

    public String getDescription() {
        return f64144b;
    }
}
