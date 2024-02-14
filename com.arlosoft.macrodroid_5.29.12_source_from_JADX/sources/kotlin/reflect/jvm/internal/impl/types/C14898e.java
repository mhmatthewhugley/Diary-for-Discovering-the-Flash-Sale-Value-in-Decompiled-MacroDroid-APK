package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import kotlin.reflect.jvm.internal.impl.types.checker.C14862n;
import p450zb.C17084g;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.e */
/* compiled from: StubTypes.kt */
public abstract class C14898e extends C14951m0 {

    /* renamed from: g */
    public static final C14899a f64027g = new C14899a((C13695i) null);

    /* renamed from: c */
    private final C14862n f64028c;

    /* renamed from: d */
    private final boolean f64029d;

    /* renamed from: f */
    private final C14692h f64030f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.e$a */
    /* compiled from: StubTypes.kt */
    public static final class C14899a {
        private C14899a() {
        }

        public /* synthetic */ C14899a(C13695i iVar) {
            this();
        }
    }

    public C14898e(C14862n nVar, boolean z) {
        C13706o.m87929f(nVar, "originalTypeVariable");
        this.f64028c = nVar;
        this.f64029d = z;
        this.f64030f = C17088k.m100539b(C17084g.STUB_TYPE_SCOPE, nVar.toString());
    }

    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return C13614t.m87748j();
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return C14830a1.f63959c.mo74051h();
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return this.f64029d;
    }

    /* renamed from: U0 */
    public C14951m0 mo72947R0(boolean z) {
        return z == mo73021O0() ? this : mo74143X0(z);
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return this;
    }

    /* renamed from: W0 */
    public final C14862n mo74142W0() {
        return this.f64028c;
    }

    /* renamed from: X0 */
    public abstract C14898e mo74143X0(boolean z);

    /* renamed from: Y0 */
    public C14898e mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        return this.f64030f;
    }
}
