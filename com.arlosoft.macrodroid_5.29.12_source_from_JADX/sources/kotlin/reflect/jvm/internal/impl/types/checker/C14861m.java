package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14902f;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14846f;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.m */
/* compiled from: NewKotlinTypeChecker.kt */
public final class C14861m implements C14859l {

    /* renamed from: c */
    private final C14849g f63986c;

    /* renamed from: d */
    private final C14846f f63987d;

    /* renamed from: e */
    private final C14658j f63988e;

    public C14861m(C14849g gVar, C14846f fVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C13706o.m87929f(fVar, "kotlinTypePreparator");
        this.f63986c = gVar;
        this.f63987d = fVar;
        C14658j m = C14658j.m91678m(mo74090c());
        C13706o.m87928e(m, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f63988e = m;
    }

    /* renamed from: a */
    public C14658j mo74089a() {
        return this.f63988e;
    }

    /* renamed from: b */
    public boolean mo74059b(C14900e0 e0Var, C14900e0 e0Var2) {
        C13706o.m87929f(e0Var, "a");
        C13706o.m87929f(e0Var2, "b");
        return mo74092e(C14838a.m92433b(false, false, (C14839b) null, mo74093f(), mo74090c(), 6, (Object) null), e0Var.mo74145Q0(), e0Var2.mo74145Q0());
    }

    /* renamed from: c */
    public C14849g mo74090c() {
        return this.f63986c;
    }

    /* renamed from: d */
    public boolean mo74060d(C14900e0 e0Var, C14900e0 e0Var2) {
        C13706o.m87929f(e0Var, "subtype");
        C13706o.m87929f(e0Var2, "supertype");
        return mo74094g(C14838a.m92433b(true, false, (C14839b) null, mo74093f(), mo74090c(), 6, (Object) null), e0Var.mo74145Q0(), e0Var2.mo74145Q0());
    }

    /* renamed from: e */
    public final boolean mo74092e(C14889d1 d1Var, C14967q1 q1Var, C14967q1 q1Var2) {
        C13706o.m87929f(d1Var, "<this>");
        C13706o.m87929f(q1Var, "a");
        C13706o.m87929f(q1Var2, "b");
        return C14902f.f64032a.mo74149k(d1Var, q1Var, q1Var2);
    }

    /* renamed from: f */
    public C14846f mo74093f() {
        return this.f63987d;
    }

    /* renamed from: g */
    public final boolean mo74094g(C14889d1 d1Var, C14967q1 q1Var, C14967q1 q1Var2) {
        C13706o.m87929f(d1Var, "<this>");
        C13706o.m87929f(q1Var, "subType");
        C13706o.m87929f(q1Var2, "superType");
        return C14902f.m92802t(C14902f.f64032a, d1Var, q1Var, q1Var2, false, 8, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14861m(C14849g gVar, C14846f fVar, int i, C13695i iVar) {
        this(gVar, (i & 2) != 0 ? C14846f.C14847a.f63968a : fVar);
    }
}
