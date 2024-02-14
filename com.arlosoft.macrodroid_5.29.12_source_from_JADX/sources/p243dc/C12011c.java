package p243dc;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;

/* renamed from: dc.c */
/* compiled from: CapturedTypeApproximation.kt */
final class C12011c {

    /* renamed from: a */
    private final C13950e1 f58212a;

    /* renamed from: b */
    private final C14900e0 f58213b;

    /* renamed from: c */
    private final C14900e0 f58214c;

    public C12011c(C13950e1 e1Var, C14900e0 e0Var, C14900e0 e0Var2) {
        C13706o.m87929f(e1Var, "typeParameter");
        C13706o.m87929f(e0Var, "inProjection");
        C13706o.m87929f(e0Var2, "outProjection");
        this.f58212a = e1Var;
        this.f58213b = e0Var;
        this.f58214c = e0Var2;
    }

    /* renamed from: a */
    public final C14900e0 mo67461a() {
        return this.f58213b;
    }

    /* renamed from: b */
    public final C14900e0 mo67462b() {
        return this.f58214c;
    }

    /* renamed from: c */
    public final C13950e1 mo67463c() {
        return this.f58212a;
    }

    /* renamed from: d */
    public final boolean mo67464d() {
        return C14844e.f63967a.mo74060d(this.f58213b, this.f58214c);
    }
}
