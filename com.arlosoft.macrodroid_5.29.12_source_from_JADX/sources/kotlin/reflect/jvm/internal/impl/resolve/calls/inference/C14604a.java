package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p218bc.C11129d;
import p450zb.C17084g;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a */
/* compiled from: CapturedTypeConstructor.kt */
public final class C14604a extends C14951m0 implements C11129d {

    /* renamed from: c */
    private final C14926g1 f63607c;

    /* renamed from: d */
    private final C14605b f63608d;

    /* renamed from: f */
    private final boolean f63609f;

    /* renamed from: g */
    private final C14830a1 f63610g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14604a(C14926g1 g1Var, C14605b bVar, boolean z, C14830a1 a1Var, int i, C13695i iVar) {
        this(g1Var, (i & 2) != 0 ? new C14606c(g1Var) : bVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? C14830a1.f63959c.mo74051h() : a1Var);
    }

    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return C13614t.m87748j();
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return this.f63610g;
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return this.f63609f;
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return new C14604a(this.f63607c, mo73702N0(), mo73021O0(), a1Var);
    }

    /* renamed from: W0 */
    public C14605b mo73702N0() {
        return this.f63608d;
    }

    /* renamed from: X0 */
    public C14604a mo73022U0(boolean z) {
        if (z == mo73021O0()) {
            return this;
        }
        return new C14604a(this.f63607c, mo73702N0(), z, mo73701M0());
    }

    /* renamed from: Y0 */
    public C14604a mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14926g1 a = this.f63607c.mo74183a(gVar);
        C13706o.m87928e(a, "typeProjection.refine(kotlinTypeRefiner)");
        return new C14604a(a, mo73702N0(), mo73021O0(), mo73701M0());
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        return C17088k.m100538a(C17084g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Captured(");
        sb.append(this.f63607c);
        sb.append(')');
        sb.append(mo73021O0() ? "?" : "");
        return sb.toString();
    }

    public C14604a(C14926g1 g1Var, C14605b bVar, boolean z, C14830a1 a1Var) {
        C13706o.m87929f(g1Var, "typeProjection");
        C13706o.m87929f(bVar, "constructor");
        C13706o.m87929f(a1Var, "attributes");
        this.f63607c = g1Var;
        this.f63608d = bVar;
        this.f63609f = z;
        this.f63610g = a1Var;
    }
}
