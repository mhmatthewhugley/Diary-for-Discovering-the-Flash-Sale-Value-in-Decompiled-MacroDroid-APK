package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.renderer.C14552c;
import kotlin.reflect.jvm.internal.impl.renderer.C14580f;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p218bc.C11131f;
import p225cc.C11170a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.v */
/* compiled from: dynamicTypes.kt */
public final class C14981v extends C14990y implements C11131f {

    /* renamed from: f */
    private final C14830a1 f64106f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14981v(kotlin.reflect.jvm.internal.impl.builtins.C13853h r3, kotlin.reflect.jvm.internal.impl.types.C14830a1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.m0 r0 = r3.mo72118H()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.m0 r3 = r3.mo72119I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.jvm.internal.C13706o.m87928e(r3, r1)
            r2.<init>(r0, r3)
            r2.f64106f = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.C14981v.<init>(kotlin.reflect.jvm.internal.impl.builtins.h, kotlin.reflect.jvm.internal.impl.types.a1):void");
    }

    /* renamed from: M0 */
    public C14830a1 mo73701M0() {
        return this.f64106f;
    }

    /* renamed from: O0 */
    public boolean mo73021O0() {
        return false;
    }

    /* renamed from: U0 */
    public C14951m0 mo72950U0() {
        return mo74252W0();
    }

    /* renamed from: X0 */
    public String mo72951X0(C14552c cVar, C14580f fVar) {
        C13706o.m87929f(cVar, "renderer");
        C13706o.m87929f(fVar, "options");
        return "dynamic";
    }

    /* renamed from: Y0 */
    public C14981v mo72947R0(boolean z) {
        return this;
    }

    /* renamed from: Z0 */
    public C14981v mo72948S0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: a1 */
    public C14981v mo72949T0(C14830a1 a1Var) {
        C13706o.m87929f(a1Var, "newAttributes");
        return new C14981v(C11170a.m74959h(mo72950U0()), a1Var);
    }
}
