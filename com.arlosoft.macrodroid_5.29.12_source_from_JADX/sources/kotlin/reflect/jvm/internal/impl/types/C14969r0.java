package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.r0 */
/* compiled from: StarProjectionImpl.kt */
public final class C14969r0 extends C14930h1 {

    /* renamed from: a */
    private final C14900e0 f64092a;

    public C14969r0(C13853h hVar) {
        C13706o.m87929f(hVar, "kotlinBuiltIns");
        C14951m0 I = hVar.mo72119I();
        C13706o.m87928e(I, "kotlinBuiltIns.nullableAnyType");
        this.f64092a = I;
    }

    /* renamed from: a */
    public C14926g1 mo74183a(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: b */
    public boolean mo74184b() {
        return true;
    }

    /* renamed from: c */
    public C14970r1 mo74185c() {
        return C14970r1.OUT_VARIANCE;
    }

    public C14900e0 getType() {
        return this.f64092a;
    }
}
