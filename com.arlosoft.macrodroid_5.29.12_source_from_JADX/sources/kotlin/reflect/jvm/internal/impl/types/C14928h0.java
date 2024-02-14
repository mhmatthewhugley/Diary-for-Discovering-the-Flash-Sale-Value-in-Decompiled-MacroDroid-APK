package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p218bc.C11134i;
import p370qa.C16254a;
import p442yb.C17006i;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.h0 */
/* compiled from: SpecialTypes.kt */
public final class C14928h0 extends C14974s1 {

    /* renamed from: c */
    private final C17012n f64052c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16254a<C14900e0> f64053d;

    /* renamed from: f */
    private final C17006i<C14900e0> f64054f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.h0$a */
    /* compiled from: SpecialTypes.kt */
    static final class C14929a extends C13708q implements C16254a<C14900e0> {
        final /* synthetic */ C14849g $kotlinTypeRefiner;
        final /* synthetic */ C14928h0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14929a(C14849g gVar, C14928h0 h0Var) {
            super(0);
            this.$kotlinTypeRefiner = gVar;
            this.this$0 = h0Var;
        }

        /* renamed from: a */
        public final C14900e0 invoke() {
            return this.$kotlinTypeRefiner.mo74070h((C11134i) this.this$0.f64053d.invoke());
        }
    }

    public C14928h0(C17012n nVar, C16254a<? extends C14900e0> aVar) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(aVar, "computation");
        this.f64052c = nVar;
        this.f64053d = aVar;
        this.f64054f = nVar.mo80221f(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public C14900e0 mo74187R0() {
        return (C14900e0) this.f64054f.invoke();
    }

    /* renamed from: S0 */
    public boolean mo74188S0() {
        return this.f64054f.mo80242i();
    }

    /* renamed from: U0 */
    public C14928h0 mo72946P0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return new C14928h0(this.f64052c, new C14929a(gVar, this));
    }
}
