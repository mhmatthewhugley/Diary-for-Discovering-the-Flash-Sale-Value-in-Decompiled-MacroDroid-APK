package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p297ja.C13321g;
import p297ja.C13326k;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.s0 */
/* compiled from: StarProjectionImpl.kt */
public final class C14972s0 extends C14930h1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13950e1 f64098a;

    /* renamed from: b */
    private final C13321g f64099b = C13323i.m85668a(C13326k.PUBLICATION, new C14973a(this));

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.s0$a */
    /* compiled from: StarProjectionImpl.kt */
    static final class C14973a extends C13708q implements C16254a<C14900e0> {
        final /* synthetic */ C14972s0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14973a(C14972s0 s0Var) {
            super(0);
            this.this$0 = s0Var;
        }

        /* renamed from: a */
        public final C14900e0 invoke() {
            return C14976t0.m93117b(this.this$0.f64098a);
        }
    }

    public C14972s0(C13950e1 e1Var) {
        C13706o.m87929f(e1Var, "typeParameter");
        this.f64098a = e1Var;
    }

    /* renamed from: e */
    private final C14900e0 m93100e() {
        return (C14900e0) this.f64099b.getValue();
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
        return m93100e();
    }
}
