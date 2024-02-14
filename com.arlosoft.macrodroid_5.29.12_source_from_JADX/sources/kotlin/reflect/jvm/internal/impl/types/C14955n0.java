package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p370qa.C16265l;
import p450zb.C17083f;
import p450zb.C17089l;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.n0 */
/* compiled from: KotlinTypeFactory.kt */
final class C14955n0 extends C14951m0 {

    /* renamed from: c */
    private final C14901e1 f64074c;

    /* renamed from: d */
    private final List<C14926g1> f64075d;

    /* renamed from: f */
    private final boolean f64076f;

    /* renamed from: g */
    private final C14692h f64077g;

    /* renamed from: o */
    private final C16265l<C14849g, C14951m0> f64078o;

    public C14955n0(C14901e1 e1Var, List<? extends C14926g1> list, boolean z, C14692h hVar, C16265l<? super C14849g, ? extends C14951m0> lVar) {
        C13706o.m87929f(e1Var, "constructor");
        C13706o.m87929f(list, "arguments");
        C13706o.m87929f(hVar, "memberScope");
        C13706o.m87929f(lVar, "refinedTypeFactory");
        this.f64074c = e1Var;
        this.f64075d = list;
        this.f64076f = z;
        this.f64077g = hVar;
        this.f64078o = lVar;
        if ((mo72955n() instanceof C17083f) && !(mo72955n() instanceof C17089l)) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + mo72955n() + 10 + mo73702N0());
        }
    }

    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return this.f64075d;
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return C14830a1.f63959c.mo74051h();
    }

    /* renamed from: N0 */
    public C14901e1 mo73702N0() {
        return this.f64074c;
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return this.f64076f;
    }

    /* renamed from: U0 */
    public C14951m0 mo72947R0(boolean z) {
        if (z == mo73021O0()) {
            return this;
        }
        if (z) {
            return new C14941k0(this);
        }
        return new C14932i0(this);
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        if (a1Var.isEmpty()) {
            return this;
        }
        return new C14959o0(this, a1Var);
    }

    /* renamed from: W0 */
    public C14951m0 mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14951m0 invoke = this.f64078o.invoke(gVar);
        return invoke == null ? this : invoke;
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        return this.f64077g;
    }
}
