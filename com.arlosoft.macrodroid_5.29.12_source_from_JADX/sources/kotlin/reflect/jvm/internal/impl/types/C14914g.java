package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import kotlin.reflect.jvm.internal.impl.types.checker.C14851h;
import p297ja.C13321g;
import p297ja.C13326k;
import p297ja.C13339u;
import p370qa.C16254a;
import p370qa.C16265l;
import p442yb.C17006i;
import p442yb.C17012n;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.g */
/* compiled from: AbstractTypeConstructor.kt */
public abstract class C14914g extends C14950m {

    /* renamed from: b */
    private final C17006i<C14917b> f64044b;

    /* renamed from: c */
    private final boolean f64045c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$a */
    /* compiled from: AbstractTypeConstructor.kt */
    private final class C14915a implements C14901e1 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C14849g f64046a;

        /* renamed from: b */
        private final C13321g f64047b;

        /* renamed from: c */
        final /* synthetic */ C14914g f64048c;

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$a$a */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C14916a extends C13708q implements C16254a<List<? extends C14900e0>> {
            final /* synthetic */ C14915a this$0;
            final /* synthetic */ C14914g this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14916a(C14915a aVar, C14914g gVar) {
                super(0);
                this.this$0 = aVar;
                this.this$1 = gVar;
            }

            /* renamed from: a */
            public final List<C14900e0> invoke() {
                return C14851h.m92555b(this.this$0.f64046a, this.this$1.mo72370l());
            }
        }

        public C14915a(C14914g gVar, C14849g gVar2) {
            C13706o.m87929f(gVar2, "kotlinTypeRefiner");
            this.f64048c = gVar;
            this.f64046a = gVar2;
            this.f64047b = C13323i.m85668a(C13326k.PUBLICATION, new C14916a(this, gVar));
        }

        /* renamed from: f */
        private final List<C14900e0> m92855f() {
            return (List) this.f64047b.getValue();
        }

        /* renamed from: a */
        public C14901e1 mo72368a(C14849g gVar) {
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            return this.f64048c.mo72368a(gVar);
        }

        /* renamed from: c */
        public C13961h mo62183c() {
            return this.f64048c.mo62183c();
        }

        /* renamed from: d */
        public boolean mo62184d() {
            return this.f64048c.mo62184d();
        }

        public boolean equals(Object obj) {
            return this.f64048c.equals(obj);
        }

        /* renamed from: g */
        public List<C14900e0> mo72370l() {
            return m92855f();
        }

        public List<C13950e1> getParameters() {
            List<C13950e1> parameters = this.f64048c.getParameters();
            C13706o.m87928e(parameters, "this@AbstractTypeConstructor.parameters");
            return parameters;
        }

        public int hashCode() {
            return this.f64048c.hashCode();
        }

        /* renamed from: m */
        public C13853h mo72371m() {
            C13853h m = this.f64048c.mo72371m();
            C13706o.m87928e(m, "this@AbstractTypeConstructor.builtIns");
            return m;
        }

        public String toString() {
            return this.f64048c.toString();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$b */
    /* compiled from: AbstractTypeConstructor.kt */
    private static final class C14917b {

        /* renamed from: a */
        private final Collection<C14900e0> f64049a;

        /* renamed from: b */
        private List<? extends C14900e0> f64050b = C13612s.m87736e(C17088k.f68644a.mo80369l());

        public C14917b(Collection<? extends C14900e0> collection) {
            C13706o.m87929f(collection, "allSupertypes");
            this.f64049a = collection;
        }

        /* renamed from: a */
        public final Collection<C14900e0> mo74173a() {
            return this.f64049a;
        }

        /* renamed from: b */
        public final List<C14900e0> mo74174b() {
            return this.f64050b;
        }

        /* renamed from: c */
        public final void mo74175c(List<? extends C14900e0> list) {
            C13706o.m87929f(list, "<set-?>");
            this.f64050b = list;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$c */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C14918c extends C13708q implements C16254a<C14917b> {
        final /* synthetic */ C14914g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14918c(C14914g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final C14917b invoke() {
            return new C14917b(this.this$0.mo62186j());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$d */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C14919d extends C13708q implements C16265l<Boolean, C14917b> {

        /* renamed from: a */
        public static final C14919d f64051a = new C14919d();

        C14919d() {
            super(1);
        }

        /* renamed from: a */
        public final C14917b mo74177a(boolean z) {
            return new C14917b(C13612s.m87736e(C17088k.f68644a.mo80369l()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo74177a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$e */
    /* compiled from: AbstractTypeConstructor.kt */
    static final class C14920e extends C13708q implements C16265l<C14917b, C13339u> {
        final /* synthetic */ C14914g this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$e$a */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C14921a extends C13708q implements C16265l<C14901e1, Iterable<? extends C14900e0>> {
            final /* synthetic */ C14914g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14921a(C14914g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* renamed from: a */
            public final Iterable<C14900e0> invoke(C14901e1 e1Var) {
                C13706o.m87929f(e1Var, "it");
                return this.this$0.m92842i(e1Var, true);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$e$b */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C14922b extends C13708q implements C16265l<C14900e0, C13339u> {
            final /* synthetic */ C14914g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14922b(C14914g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* renamed from: a */
            public final void mo74180a(C14900e0 e0Var) {
                C13706o.m87929f(e0Var, "it");
                this.this$0.mo74167s(e0Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74180a((C14900e0) obj);
                return C13339u.f61331a;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$e$c */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C14923c extends C13708q implements C16265l<C14901e1, Iterable<? extends C14900e0>> {
            final /* synthetic */ C14914g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14923c(C14914g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* renamed from: a */
            public final Iterable<C14900e0> invoke(C14901e1 e1Var) {
                C13706o.m87929f(e1Var, "it");
                return this.this$0.m92842i(e1Var, false);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.g$e$d */
        /* compiled from: AbstractTypeConstructor.kt */
        static final class C14924d extends C13708q implements C16265l<C14900e0, C13339u> {
            final /* synthetic */ C14914g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14924d(C14914g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* renamed from: a */
            public final void mo74182a(C14900e0 e0Var) {
                C13706o.m87929f(e0Var, "it");
                this.this$0.mo72384t(e0Var);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74182a((C14900e0) obj);
                return C13339u.f61331a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14920e(C14914g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final void mo74178a(C14917b bVar) {
            C13706o.m87929f(bVar, "supertypes");
            Collection<C14900e0> a = this.this$0.mo62187p().mo72278a(this.this$0, bVar.mo74173a(), new C14923c(this.this$0), new C14924d(this.this$0));
            List list = null;
            if (a.isEmpty()) {
                C14900e0 k = this.this$0.mo72382k();
                a = k != null ? C13612s.m87736e(k) : null;
                if (a == null) {
                    a = C13614t.m87748j();
                }
            }
            if (this.this$0.mo74165o()) {
                C13942c1 p = this.this$0.mo62187p();
                C14914g gVar = this.this$0;
                p.mo72278a(gVar, a, new C14921a(gVar), new C14922b(this.this$0));
            }
            C14914g gVar2 = this.this$0;
            if (a instanceof List) {
                list = (List) a;
            }
            if (list == null) {
                list = C13566b0.m87402F0(a);
            }
            bVar.mo74175c(gVar2.mo72383r(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74178a((C14917b) obj);
            return C13339u.f61331a;
        }
    }

    public C14914g(C17012n nVar) {
        C13706o.m87929f(nVar, "storageManager");
        this.f64044b = nVar.mo80220e(new C14918c(this), C14919d.f64051a, new C14920e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Collection<C14900e0> m92842i(C14901e1 e1Var, boolean z) {
        List q0;
        C14914g gVar = e1Var instanceof C14914g ? (C14914g) e1Var : null;
        if (gVar != null && (q0 = C13566b0.m87442q0(((C14917b) gVar.f64044b.invoke()).mo74173a(), gVar.mo74052n(z))) != null) {
            return q0;
        }
        Collection<C14900e0> l = e1Var.mo72370l();
        C13706o.m87928e(l, "supertypes");
        return l;
    }

    /* renamed from: a */
    public C14901e1 mo72368a(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return new C14915a(this, gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract Collection<C14900e0> mo62186j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C14900e0 mo72382k() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Collection<C14900e0> mo74052n(boolean z) {
        return C13614t.m87748j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo74165o() {
        return this.f64045c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract C13942c1 mo62187p();

    /* renamed from: q */
    public List<C14900e0> mo72370l() {
        return ((C14917b) this.f64044b.invoke()).mo74174b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public List<C14900e0> mo72383r(List<C14900e0> list) {
        C13706o.m87929f(list, "supertypes");
        return list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo74167s(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "type");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo72384t(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "type");
    }
}
