package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.types.C14833b0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14966q0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p362pb.C16157f;
import p362pb.C16159h;
import p370qa.C16254a;
import p433xa.C16887m;
import p442yb.C17007j;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.j0 */
/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class C14000j0 extends C14020p implements C13998i0 {

    /* renamed from: Z */
    public static final C14001a f62527Z = new C14001a((C13695i) null);

    /* renamed from: a0 */
    static final /* synthetic */ C16887m<Object>[] f62528a0 = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14000j0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: V */
    private final C17012n f62529V;

    /* renamed from: W */
    private final C13947d1 f62530W;

    /* renamed from: X */
    private final C17007j f62531X;

    /* renamed from: Y */
    private C13944d f62532Y;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.j0$a */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class C14001a {
        private C14001a() {
        }

        public /* synthetic */ C14001a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C14945l1 m88934c(C13947d1 d1Var) {
            if (d1Var.mo72281s() == null) {
                return null;
            }
            return C14945l1.m92938f(d1Var.mo72280G());
        }

        /* renamed from: b */
        public final C13998i0 mo72421b(C17012n nVar, C13947d1 d1Var, C13944d dVar) {
            C13944d c;
            List list;
            C13947d1 d1Var2 = d1Var;
            C13944d dVar2 = dVar;
            C13706o.m87929f(nVar, "storageManager");
            C13706o.m87929f(d1Var2, "typeAliasDescriptor");
            C13706o.m87929f(dVar2, "constructor");
            C14945l1 c2 = m88934c(d1Var2);
            C14146w0 w0Var = null;
            if (c2 == null || (c = dVar2.mo72267c(c2)) == null) {
                return null;
            }
            C13921g annotations = dVar.getAnnotations();
            C13936b.C13937a h = dVar.mo72264h();
            C13706o.m87928e(h, "constructor.kind");
            C14158z0 source = d1Var.getSource();
            C13706o.m87928e(source, "typeAliasDescriptor.source");
            C14000j0 j0Var = new C14000j0(nVar, d1Var, c, (C13998i0) null, annotations, h, source, (C13695i) null);
            List<C13966i1> O0 = C14020p.m89049O0(j0Var, dVar.mo72235g(), c2);
            if (O0 == null) {
                return null;
            }
            C14951m0 c3 = C14833b0.m92416c(c.getReturnType().mo74145Q0());
            C14951m0 p = d1Var.mo72274p();
            C13706o.m87928e(p, "typeAliasDescriptor.defaultType");
            C14951m0 j = C14966q0.m93072j(c3, p);
            C14146w0 L = dVar.mo72231L();
            if (L != null) {
                w0Var = C14602c.m91476h(j0Var, c2.mo74214n(L.getType(), C14970r1.INVARIANT), C13921g.f62330v.mo72251b());
            }
            C14146w0 w0Var2 = w0Var;
            C13948e s = d1Var.mo72281s();
            if (s != null) {
                List<C14146w0> x0 = dVar.mo72238x0();
                C13706o.m87928e(x0, "constructor.contextReceiverParameters");
                list = new ArrayList(C13616u.m87774u(x0, 10));
                for (C14146w0 type : x0) {
                    list.add(C14602c.m91471c(s, c2.mo74214n(type.getType(), C14970r1.INVARIANT), C13921g.f62330v.mo72251b()));
                }
            } else {
                list = C13614t.m87748j();
            }
            j0Var.mo72397R0(w0Var2, (C14146w0) null, list, d1Var.mo62178q(), O0, j, C13945d0.FINAL, d1Var.getVisibility());
            return j0Var;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.j0$b */
    /* compiled from: TypeAliasConstructorDescriptor.kt */
    static final class C14002b extends C13708q implements C16254a<C14000j0> {
        final /* synthetic */ C13944d $underlyingConstructorDescriptor;
        final /* synthetic */ C14000j0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14002b(C14000j0 j0Var, C13944d dVar) {
            super(0);
            this.this$0 = j0Var;
            this.$underlyingConstructorDescriptor = dVar;
        }

        /* renamed from: a */
        public final C14000j0 invoke() {
            C17012n M = this.this$0.mo72414M();
            C13947d1 o1 = this.this$0.mo72419o1();
            C13944d dVar = this.$underlyingConstructorDescriptor;
            C14000j0 j0Var = this.this$0;
            C13921g annotations = dVar.getAnnotations();
            C13936b.C13937a h = this.$underlyingConstructorDescriptor.mo72264h();
            C13706o.m87928e(h, "underlyingConstructorDescriptor.kind");
            C14158z0 source = this.this$0.mo72419o1().getSource();
            C13706o.m87928e(source, "typeAliasDescriptor.source");
            C14000j0 j0Var2 = new C14000j0(M, o1, dVar, j0Var, annotations, h, source, (C13695i) null);
            C14000j0 j0Var3 = this.this$0;
            C13944d dVar2 = this.$underlyingConstructorDescriptor;
            C14945l1 a = C14000j0.f62527Z.m88934c(j0Var3.mo72419o1());
            C14146w0 w0Var = null;
            if (a == null) {
                return null;
            }
            C14146w0 L = dVar2.mo72231L();
            if (L != null) {
                w0Var = L.mo72267c(a);
            }
            List<C14146w0> x0 = dVar2.mo72238x0();
            C13706o.m87928e(x0, "underlyingConstructorDes…contextReceiverParameters");
            ArrayList arrayList = new ArrayList(C13616u.m87774u(x0, 10));
            for (C14146w0 c : x0) {
                arrayList.add(c.mo72267c(a));
            }
            j0Var2.mo72397R0((C14146w0) null, w0Var, arrayList, j0Var3.mo72419o1().mo62178q(), j0Var3.mo72235g(), j0Var3.getReturnType(), C13945d0.FINAL, j0Var3.mo72419o1().getVisibility());
            return j0Var2;
        }
    }

    private C14000j0(C17012n nVar, C13947d1 d1Var, C13944d dVar, C13998i0 i0Var, C13921g gVar, C13936b.C13937a aVar, C14158z0 z0Var) {
        super(d1Var, i0Var, gVar, C16159h.f66310i, aVar, z0Var);
        this.f62529V = nVar;
        this.f62530W = d1Var;
        mo72461V0(mo72419o1().mo62160Y());
        this.f62531X = nVar.mo80219d(new C14002b(this, dVar));
        this.f62532Y = dVar;
    }

    public /* synthetic */ C14000j0(C17012n nVar, C13947d1 d1Var, C13944d dVar, C13998i0 i0Var, C13921g gVar, C13936b.C13937a aVar, C14158z0 z0Var, C13695i iVar) {
        this(nVar, d1Var, dVar, i0Var, gVar, aVar, z0Var);
    }

    /* renamed from: M */
    public final C17012n mo72414M() {
        return this.f62529V;
    }

    /* renamed from: S */
    public C13944d mo72413S() {
        return this.f62532Y;
    }

    /* renamed from: c0 */
    public boolean mo72389c0() {
        return mo72413S().mo72389c0();
    }

    /* renamed from: d0 */
    public C13948e mo72390d0() {
        C13948e d0 = mo72413S().mo72390d0();
        C13706o.m87928e(d0, "underlyingConstructorDescriptor.constructedClass");
        return d0;
    }

    public C14900e0 getReturnType() {
        C14900e0 returnType = super.getReturnType();
        C13706o.m87926c(returnType);
        return returnType;
    }

    /* renamed from: k1 */
    public C13998i0 mo72263O(C14064m mVar, C13945d0 d0Var, C14141u uVar, C13936b.C13937a aVar, boolean z) {
        C13706o.m87929f(mVar, "newOwner");
        C13706o.m87929f(d0Var, "modality");
        C13706o.m87929f(uVar, "visibility");
        C13706o.m87929f(aVar, "kind");
        Object build = mo72401t().mo72511q(mVar).mo72505k(d0Var).mo72502h(uVar).mo72512r(aVar).mo72509o(z).build();
        C13706o.m87927d(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (C13998i0) build;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l1 */
    public C14000j0 mo62205L0(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        C13706o.m87929f(mVar, "newOwner");
        C13706o.m87929f(aVar, "kind");
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(z0Var, "source");
        C13936b.C13937a aVar2 = C13936b.C13937a.DECLARATION;
        if (aVar != aVar2) {
            C13936b.C13937a aVar3 = C13936b.C13937a.SYNTHESIZED;
        }
        return new C14000j0(this.f62529V, mo72419o1(), mo72413S(), this, gVar, aVar2, z0Var);
    }

    /* renamed from: m1 */
    public C13947d1 m88921b() {
        return mo72419o1();
    }

    /* renamed from: n1 */
    public C13998i0 m88919a() {
        C14154y a = super.m89079a();
        C13706o.m87927d(a, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (C13998i0) a;
    }

    /* renamed from: o1 */
    public C13947d1 mo72419o1() {
        return this.f62530W;
    }

    /* renamed from: p1 */
    public C13998i0 m88924c(C14945l1 l1Var) {
        C13706o.m87929f(l1Var, "substitutor");
        C14154y c = super.mo72267c(l1Var);
        C13706o.m87927d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C14000j0 j0Var = (C14000j0) c;
        C14945l1 f = C14945l1.m92938f(j0Var.getReturnType());
        C13706o.m87928e(f, "create(substitutedTypeAliasConstructor.returnType)");
        C13944d c2 = mo72413S().mo72233a().mo72267c(f);
        if (c2 == null) {
            return null;
        }
        j0Var.f62532Y = c2;
        return j0Var;
    }
}
