package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import kotlin.reflect.jvm.internal.impl.types.checker.C14853j;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c */
/* compiled from: CapturedTypeConstructor.kt */
public final class C14606c implements C14605b {

    /* renamed from: a */
    private final C14926g1 f63611a;

    /* renamed from: b */
    private C14853j f63612b;

    public C14606c(C14926g1 g1Var) {
        C13706o.m87929f(g1Var, "projection");
        this.f63611a = g1Var;
        mo73707U0().mo74185c();
        C14970r1 r1Var = C14970r1.INVARIANT;
    }

    /* renamed from: U0 */
    public C14926g1 mo73707U0() {
        return this.f63611a;
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ C13961h mo62183c() {
        return (C13961h) mo73708e();
    }

    /* renamed from: d */
    public boolean mo62184d() {
        return false;
    }

    /* renamed from: e */
    public Void mo73708e() {
        return null;
    }

    /* renamed from: f */
    public final C14853j mo73709f() {
        return this.f63612b;
    }

    /* renamed from: g */
    public C14606c mo72368a(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14926g1 a = mo73707U0().mo74183a(gVar);
        C13706o.m87928e(a, "projection.refine(kotlinTypeRefiner)");
        return new C14606c(a);
    }

    public List<C13950e1> getParameters() {
        return C13614t.m87748j();
    }

    /* renamed from: h */
    public final void mo73711h(C14853j jVar) {
        this.f63612b = jVar;
    }

    /* renamed from: l */
    public Collection<C14900e0> mo72370l() {
        Object obj;
        if (mo73707U0().mo74185c() == C14970r1.OUT_VARIANCE) {
            obj = mo73707U0().getType();
        } else {
            obj = mo72371m().mo72119I();
        }
        C13706o.m87928e(obj, "if (projection.projectio… builtIns.nullableAnyType");
        return C13612s.m87736e(obj);
    }

    /* renamed from: m */
    public C13853h mo72371m() {
        C13853h m = mo73707U0().getType().mo73702N0().mo72371m();
        C13706o.m87928e(m, "projection.type.constructor.builtIns");
        return m;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo73707U0() + ')';
    }
}
