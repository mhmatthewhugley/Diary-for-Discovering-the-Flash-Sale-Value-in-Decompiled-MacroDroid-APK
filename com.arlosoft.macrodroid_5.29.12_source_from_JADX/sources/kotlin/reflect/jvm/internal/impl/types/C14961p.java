package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14004k0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14852i;
import kotlin.reflect.jvm.internal.impl.types.checker.C14862n;
import kotlin.reflect.jvm.internal.impl.types.checker.C14863o;
import p218bc.C11130e;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.p */
/* compiled from: SpecialTypes.kt */
public final class C14961p extends C14968r implements C14954n, C11130e {

    /* renamed from: f */
    public static final C14962a f64086f = new C14962a((C13695i) null);

    /* renamed from: c */
    private final C14951m0 f64087c;

    /* renamed from: d */
    private final boolean f64088d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.p$a */
    /* compiled from: SpecialTypes.kt */
    public static final class C14962a {
        private C14962a() {
        }

        public /* synthetic */ C14962a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        private final boolean m93036a(C14967q1 q1Var) {
            return (q1Var.mo73702N0() instanceof C14862n) || (q1Var.mo73702N0().mo62183c() instanceof C13950e1) || (q1Var instanceof C14852i) || (q1Var instanceof C14980u0);
        }

        /* renamed from: c */
        public static /* synthetic */ C14961p m93037c(C14962a aVar, C14967q1 q1Var, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo74228b(q1Var, z);
        }

        /* renamed from: d */
        private final boolean m93038d(C14967q1 q1Var, boolean z) {
            boolean z2 = false;
            if (!m93036a(q1Var)) {
                return false;
            }
            if (q1Var instanceof C14980u0) {
                return C14956n1.m92997l(q1Var);
            }
            C13961h c = q1Var.mo73702N0().mo62183c();
            C14004k0 k0Var = c instanceof C14004k0 ? (C14004k0) c : null;
            if (k0Var != null && !k0Var.mo72424T0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            if (!z || !(q1Var.mo73702N0().mo62183c() instanceof C13950e1)) {
                return !C14863o.f63989a.mo74096a(q1Var);
            }
            return C14956n1.m92997l(q1Var);
        }

        /* renamed from: b */
        public final C14961p mo74228b(C14967q1 q1Var, boolean z) {
            C13706o.m87929f(q1Var, "type");
            if (q1Var instanceof C14961p) {
                return (C14961p) q1Var;
            }
            if (!m93038d(q1Var, z)) {
                return null;
            }
            if (q1Var instanceof C14990y) {
                C14990y yVar = (C14990y) q1Var;
                C13706o.m87924a(yVar.mo74251V0().mo73702N0(), yVar.mo74252W0().mo73702N0());
            }
            return new C14961p(C14833b0.m92416c(q1Var).mo73022U0(false), z, (C13695i) null);
        }
    }

    private C14961p(C14951m0 m0Var, boolean z) {
        this.f64087c = m0Var;
        this.f64088d = z;
    }

    public /* synthetic */ C14961p(C14951m0 m0Var, boolean z, C13695i iVar) {
        this(m0Var, z);
    }

    /* renamed from: E0 */
    public boolean mo73020E0() {
        return (mo73024W0().mo73702N0() instanceof C14862n) || (mo73024W0().mo73702N0().mo62183c() instanceof C13950e1);
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return false;
    }

    /* renamed from: U0 */
    public C14951m0 mo72947R0(boolean z) {
        return z ? mo73024W0().mo73022U0(z) : this;
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return new C14961p(mo73024W0().mo73023V0(a1Var), this.f64088d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public C14951m0 mo73024W0() {
        return this.f64087c;
    }

    /* renamed from: Z0 */
    public final C14951m0 mo74226Z0() {
        return this.f64087c;
    }

    /* renamed from: a1 */
    public C14961p mo73025Y0(C14951m0 m0Var) {
        C13706o.m87929f(m0Var, "delegate");
        return new C14961p(m0Var, this.f64088d);
    }

    /* renamed from: k0 */
    public C14900e0 mo73028k0(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "replacement");
        return C14966q0.m93067e(e0Var.mo74145Q0(), this.f64088d);
    }

    public String toString() {
        return mo73024W0() + " & Any";
    }
}
