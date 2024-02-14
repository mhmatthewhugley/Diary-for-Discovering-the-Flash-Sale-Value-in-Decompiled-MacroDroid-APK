package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14605b;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import p225cc.C11170a;
import p297ja.C13321g;
import p297ja.C13326k;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.j */
/* compiled from: NewCapturedType.kt */
public final class C14853j implements C14605b {

    /* renamed from: a */
    private final C14926g1 f63977a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C16254a<? extends List<? extends C14967q1>> f63978b;

    /* renamed from: c */
    private final C14853j f63979c;

    /* renamed from: d */
    private final C13950e1 f63980d;

    /* renamed from: e */
    private final C13321g f63981e;

    /* renamed from: f */
    private C14967q1 f63982f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.j$a */
    /* compiled from: NewCapturedType.kt */
    static final class C14854a extends C13708q implements C16254a<List<? extends C14967q1>> {
        final /* synthetic */ List<C14967q1> $supertypes;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14854a(List<? extends C14967q1> list) {
            super(0);
            this.$supertypes = list;
        }

        /* renamed from: a */
        public final List<C14967q1> invoke() {
            return this.$supertypes;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.j$b */
    /* compiled from: NewCapturedType.kt */
    static final class C14855b extends C13708q implements C16254a<List<? extends C14967q1>> {
        final /* synthetic */ C14853j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14855b(C14853j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final List<C14967q1> invoke() {
            C16254a e = this.this$0.f63978b;
            if (e != null) {
                return (List) e.invoke();
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.j$c */
    /* compiled from: NewCapturedType.kt */
    static final class C14856c extends C13708q implements C16254a<List<? extends C14967q1>> {
        final /* synthetic */ List<C14967q1> $boundSupertypes;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14856c(List<? extends C14967q1> list) {
            super(0);
            this.$boundSupertypes = list;
        }

        /* renamed from: a */
        public final List<C14967q1> invoke() {
            return this.$boundSupertypes;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.j$d */
    /* compiled from: NewCapturedType.kt */
    static final class C14857d extends C13708q implements C16254a<List<? extends C14967q1>> {
        final /* synthetic */ C14849g $kotlinTypeRefiner;
        final /* synthetic */ C14853j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14857d(C14853j jVar, C14849g gVar) {
            super(0);
            this.this$0 = jVar;
            this.$kotlinTypeRefiner = gVar;
        }

        /* renamed from: a */
        public final List<C14967q1> invoke() {
            List<C14967q1> g = this.this$0.mo72370l();
            C14849g gVar = this.$kotlinTypeRefiner;
            ArrayList arrayList = new ArrayList(C13616u.m87774u(g, 10));
            for (C14967q1 S0 : g) {
                arrayList.add(S0.mo72948S0(gVar));
            }
            return arrayList;
        }
    }

    public C14853j(C14926g1 g1Var, C16254a<? extends List<? extends C14967q1>> aVar, C14853j jVar, C13950e1 e1Var) {
        C13706o.m87929f(g1Var, "projection");
        this.f63977a = g1Var;
        this.f63978b = aVar;
        this.f63979c = jVar;
        this.f63980d = e1Var;
        this.f63981e = C13323i.m85668a(C13326k.PUBLICATION, new C14855b(this));
    }

    /* renamed from: f */
    private final List<C14967q1> m92574f() {
        return (List) this.f63981e.getValue();
    }

    /* renamed from: U0 */
    public C14926g1 mo73707U0() {
        return this.f63977a;
    }

    /* renamed from: c */
    public C13961h mo62183c() {
        return null;
    }

    /* renamed from: d */
    public boolean mo62184d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13706o.m87924a(C14853j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13706o.m87927d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        C14853j jVar = (C14853j) obj;
        C14853j jVar2 = this.f63979c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        C14853j jVar3 = jVar.f63979c;
        if (jVar3 != null) {
            jVar = jVar3;
        }
        if (jVar2 == jVar) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public List<C14967q1> mo72370l() {
        List c = C13612s.m87734c();
        C14967q1 q1Var = this.f63982f;
        if (q1Var != null) {
            c.add(q1Var);
        }
        List<C14967q1> f = m92574f();
        if (f != null) {
            c.addAll(f);
        }
        return C13612s.m87732a(c);
    }

    public List<C13950e1> getParameters() {
        return C13614t.m87748j();
    }

    /* renamed from: h */
    public final void mo74081h(C14967q1 q1Var, List<? extends C14967q1> list) {
        C13706o.m87929f(list, "boundSupertypes");
        this.f63982f = q1Var;
        this.f63978b = new C14856c(list);
    }

    public int hashCode() {
        C14853j jVar = this.f63979c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    /* renamed from: i */
    public C14853j mo72368a(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        C14926g1 a = mo73707U0().mo74183a(gVar);
        C13706o.m87928e(a, "projection.refine(kotlinTypeRefiner)");
        C14857d dVar = this.f63978b != null ? new C14857d(this, gVar) : null;
        C14853j jVar = this.f63979c;
        if (jVar == null) {
            jVar = this;
        }
        return new C14853j(a, dVar, jVar, this.f63980d);
    }

    /* renamed from: m */
    public C13853h mo72371m() {
        C14900e0 type = mo73707U0().getType();
        C13706o.m87928e(type, "projection.type");
        return C11170a.m74959h(type);
    }

    public String toString() {
        return "CapturedType(" + mo73707U0() + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14853j(C14926g1 g1Var, C16254a aVar, C14853j jVar, C13950e1 e1Var, int i, C13695i iVar) {
        this(g1Var, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : jVar, (i & 8) != 0 ? null : e1Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14853j(C14926g1 g1Var, List list, C14853j jVar, int i, C13695i iVar) {
        this(g1Var, list, (i & 4) != 0 ? null : jVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14853j(C14926g1 g1Var, List<? extends C14967q1> list, C14853j jVar) {
        this(g1Var, new C14854a(list), jVar, (C13950e1) null, 8, (C13695i) null);
        C13706o.m87929f(g1Var, "projection");
        C13706o.m87929f(list, "supertypes");
    }
}
