package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0 */
/* compiled from: InvalidModuleException.kt */
public final class C13910a0 {

    /* renamed from: a */
    private static final C13952f0<C13938b0> f62309a = new C13952f0<>("InvalidModuleNotifier");

    /* renamed from: a */
    public static final void m88484a(C13958g0 g0Var) {
        C13339u uVar;
        C13706o.m87929f(g0Var, "<this>");
        C13938b0 b0Var = (C13938b0) g0Var.mo72293H0(f62309a);
        if (b0Var != null) {
            b0Var.mo72266a(g0Var);
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            throw new InvalidModuleException("Accessing invalid module descriptor " + g0Var);
        }
    }
}
