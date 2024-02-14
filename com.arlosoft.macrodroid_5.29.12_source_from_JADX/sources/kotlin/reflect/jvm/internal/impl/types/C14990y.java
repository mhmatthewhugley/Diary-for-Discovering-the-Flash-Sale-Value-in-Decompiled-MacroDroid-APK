package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.renderer.C14580f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p218bc.C11132g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.y */
/* compiled from: KotlinType.kt */
public abstract class C14990y extends C14967q1 implements C11132g {

    /* renamed from: c */
    private final C14951m0 f64117c;

    /* renamed from: d */
    private final C14951m0 f64118d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14990y(C14951m0 m0Var, C14951m0 m0Var2) {
        super((C13695i) null);
        C13706o.m87929f(m0Var, "lowerBound");
        C13706o.m87929f(m0Var2, "upperBound");
        this.f64117c = m0Var;
        this.f64118d = m0Var2;
    }

    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return mo72950U0().mo73700L0();
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return mo72950U0().mo73701M0();
    }

    /* renamed from: N0 */
    public C14901e1 mo73702N0() {
        return mo72950U0().mo73702N0();
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return mo72950U0().mo73021O0();
    }

    /* renamed from: U0 */
    public abstract C14951m0 mo72950U0();

    /* renamed from: V0 */
    public final C14951m0 mo74251V0() {
        return this.f64117c;
    }

    /* renamed from: W0 */
    public final C14951m0 mo74252W0() {
        return this.f64118d;
    }

    /* renamed from: X0 */
    public abstract String mo72951X0(C14552c cVar, C14580f fVar);

    /* renamed from: n */
    public C14692h mo72955n() {
        return mo72950U0().mo72955n();
    }

    public String toString() {
        return C14552c.f63486j.mo73532w(this);
    }
}
