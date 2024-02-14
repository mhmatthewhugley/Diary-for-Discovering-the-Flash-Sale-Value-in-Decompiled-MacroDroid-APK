package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.s1 */
/* compiled from: KotlinType.kt */
public abstract class C14974s1 extends C14900e0 {
    public C14974s1() {
        super((C13695i) null);
    }

    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return mo74187R0().mo73700L0();
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return mo74187R0().mo73701M0();
    }

    /* renamed from: N0 */
    public C14901e1 mo73702N0() {
        return mo74187R0().mo73702N0();
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return mo74187R0().mo73021O0();
    }

    /* renamed from: Q0 */
    public final C14967q1 mo74145Q0() {
        C14900e0 R0 = mo74187R0();
        while (R0 instanceof C14974s1) {
            R0 = ((C14974s1) R0).mo74187R0();
        }
        C13706o.m87927d(R0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (C14967q1) R0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public abstract C14900e0 mo74187R0();

    /* renamed from: S0 */
    public boolean mo74188S0() {
        return true;
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        return mo74187R0().mo72955n();
    }

    public String toString() {
        return mo74188S0() ? mo74187R0().toString() : "<Not computed yet>";
    }
}
