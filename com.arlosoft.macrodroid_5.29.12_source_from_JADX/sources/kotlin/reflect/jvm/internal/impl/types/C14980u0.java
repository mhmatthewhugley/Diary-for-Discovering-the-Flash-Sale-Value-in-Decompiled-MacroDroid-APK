package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14862n;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.u0 */
/* compiled from: StubTypes.kt */
public final class C14980u0 extends C14898e {

    /* renamed from: o */
    private final C14901e1 f64104o;

    /* renamed from: p */
    private final C14692h f64105p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14980u0(C14862n nVar, boolean z, C14901e1 e1Var) {
        super(nVar, z);
        C13706o.m87929f(nVar, "originalTypeVariable");
        C13706o.m87929f(e1Var, "constructor");
        this.f64104o = e1Var;
        this.f64105p = nVar.mo72371m().mo72136i().mo72955n();
    }

    /* renamed from: N0 */
    public C14901e1 mo73702N0() {
        return this.f64104o;
    }

    /* renamed from: X0 */
    public C14898e mo74143X0(boolean z) {
        return new C14980u0(mo74142W0(), z, mo73702N0());
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        return this.f64105p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stub (BI): ");
        sb.append(mo74142W0());
        sb.append(mo73021O0() ? "?" : "");
        return sb.toString();
    }
}
