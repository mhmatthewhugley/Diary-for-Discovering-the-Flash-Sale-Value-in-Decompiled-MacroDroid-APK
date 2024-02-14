package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import p218bc.C11127b;
import p218bc.C11129d;
import p370qa.C16254a;
import p450zb.C17084g;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.i */
/* compiled from: NewCapturedType.kt */
public final class C14852i extends C14951m0 implements C11129d {

    /* renamed from: c */
    private final C11127b f63971c;

    /* renamed from: d */
    private final C14853j f63972d;

    /* renamed from: f */
    private final C14967q1 f63973f;

    /* renamed from: g */
    private final C14830a1 f63974g;

    /* renamed from: o */
    private final boolean f63975o;

    /* renamed from: p */
    private final boolean f63976p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14852i(C11127b bVar, C14853j jVar, C14967q1 q1Var, C14830a1 a1Var, boolean z, boolean z2, int i, C13695i iVar) {
        this(bVar, jVar, q1Var, (i & 8) != 0 ? C14830a1.f63959c.mo74051h() : a1Var, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    /* renamed from: L0 */
    public List<C14926g1> mo73700L0() {
        return C13614t.m87748j();
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return this.f63974g;
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return this.f63975o;
    }

    /* renamed from: V0 */
    public C14951m0 mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return new C14852i(this.f63971c, mo73702N0(), this.f63973f, a1Var, mo73021O0(), this.f63976p);
    }

    /* renamed from: W0 */
    public final C11127b mo74073W0() {
        return this.f63971c;
    }

    /* renamed from: X0 */
    public C14853j mo73702N0() {
        return this.f63972d;
    }

    /* renamed from: Y0 */
    public final C14967q1 mo74075Y0() {
        return this.f63973f;
    }

    /* renamed from: Z0 */
    public final boolean mo74076Z0() {
        return this.f63976p;
    }

    /* renamed from: a1 */
    public C14852i mo73022U0(boolean z) {
        return new C14852i(this.f63971c, mo73702N0(), this.f63973f, mo73701M0(), z, false, 32, (C13695i) null);
    }

    /* renamed from: b1 */
    public C14852i mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C11127b bVar = this.f63971c;
        C14853j i = mo73702N0().mo72368a(gVar);
        C14967q1 q1Var = this.f63973f;
        return new C14852i(bVar, i, q1Var != null ? gVar.mo74070h(q1Var).mo74145Q0() : null, mo73701M0(), mo73021O0(), false, 32, (C13695i) null);
    }

    /* renamed from: n */
    public C14692h mo72955n() {
        return C17088k.m100538a(C17084g.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    public C14852i(C11127b bVar, C14853j jVar, C14967q1 q1Var, C14830a1 a1Var, boolean z, boolean z2) {
        C13706o.m87929f(bVar, "captureStatus");
        C13706o.m87929f(jVar, "constructor");
        C13706o.m87929f(a1Var, "attributes");
        this.f63971c = bVar;
        this.f63972d = jVar;
        this.f63973f = q1Var;
        this.f63974g = a1Var;
        this.f63975o = z;
        this.f63976p = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14852i(C11127b bVar, C14967q1 q1Var, C14926g1 g1Var, C13950e1 e1Var) {
        this(bVar, new C14853j(g1Var, (C16254a) null, (C14853j) null, e1Var, 6, (C13695i) null), q1Var, (C14830a1) null, false, false, 56, (C13695i) null);
        C13706o.m87929f(bVar, "captureStatus");
        C13706o.m87929f(g1Var, "projection");
        C13706o.m87929f(e1Var, "typeParameter");
    }
}
