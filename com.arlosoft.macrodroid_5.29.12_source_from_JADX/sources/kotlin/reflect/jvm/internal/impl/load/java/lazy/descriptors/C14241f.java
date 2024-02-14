package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C13901j;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13953f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14068m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14150x0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13993g;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.load.java.C14216i0;
import kotlin.reflect.jvm.internal.impl.load.java.C14331r;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14181g;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14222a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14298e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14308a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14312d;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14645v;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14689f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.types.C14832b;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p271gb.C12329c;
import p272gc.C12338a;
import p288ib.C12479a;
import p288ib.C12492g;
import p288ib.C12495j;
import p288ib.C12510x;
import p288ib.C12512y;
import p297ja.C13321g;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16155e;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p442yb.C17006i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f */
/* compiled from: LazyJavaClassDescriptor.kt */
public final class C14241f extends C13993g implements C12329c {

    /* renamed from: P */
    public static final C14242a f62977P = new C14242a((C13695i) null);

    /* renamed from: Q */
    private static final Set<String> f62978Q = C13627z0.m87809g("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: A */
    private final C12492g f62979A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C13948e f62980B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C14301g f62981C;

    /* renamed from: D */
    private final C13321g f62982D;

    /* renamed from: E */
    private final C13951f f62983E;

    /* renamed from: F */
    private final C13945d0 f62984F;

    /* renamed from: G */
    private final C14068m1 f62985G;

    /* renamed from: H */
    private final boolean f62986H;

    /* renamed from: I */
    private final C14243b f62987I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final C14249g f62988J;

    /* renamed from: K */
    private final C14150x0<C14249g> f62989K;

    /* renamed from: L */
    private final C14689f f62990L;

    /* renamed from: M */
    private final C14289k f62991M;

    /* renamed from: N */
    private final C13921g f62992N;

    /* renamed from: O */
    private final C17006i<List<C13950e1>> f62993O;

    /* renamed from: z */
    private final C14301g f62994z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$a */
    /* compiled from: LazyJavaClassDescriptor.kt */
    public static final class C14242a {
        private C14242a() {
        }

        public /* synthetic */ C14242a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$b */
    /* compiled from: LazyJavaClassDescriptor.kt */
    private final class C14243b extends C14832b {

        /* renamed from: d */
        private final C17006i<List<C13950e1>> f62995d;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$b$a */
        /* compiled from: LazyJavaClassDescriptor.kt */
        static final class C14244a extends C13708q implements C16254a<List<? extends C13950e1>> {
            final /* synthetic */ C14241f this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14244a(C14241f fVar) {
                super(0);
                this.this$0 = fVar;
            }

            /* renamed from: a */
            public final List<C13950e1> invoke() {
                return C13953f1.m88588d(this.this$0);
            }
        }

        public C14243b() {
            super(C14241f.this.f62981C.mo72918e());
            this.f62995d = C14241f.this.f62981C.mo72918e().mo80221f(new C14244a(C14241f.this));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            if ((!r0.mo78558d() && r0.mo78565i(kotlin.reflect.jvm.internal.impl.builtins.C13902k.f62195q)) != false) goto L_0x001d;
         */
        /* renamed from: w */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.types.C14900e0 m89938w() {
            /*
                r8 = this;
                pb.c r0 = r8.m89939x()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x001c
                boolean r3 = r0.mo78558d()
                if (r3 != 0) goto L_0x0018
                pb.f r3 = kotlin.reflect.jvm.internal.impl.builtins.C13902k.f62195q
                boolean r3 = r0.mo78565i(r3)
                if (r3 == 0) goto L_0x0018
                r3 = 1
                goto L_0x0019
            L_0x0018:
                r3 = 0
            L_0x0019:
                if (r3 == 0) goto L_0x001c
                goto L_0x001d
            L_0x001c:
                r0 = r2
            L_0x001d:
                if (r0 != 0) goto L_0x002e
                kotlin.reflect.jvm.internal.impl.load.java.m r3 = kotlin.reflect.jvm.internal.impl.load.java.C14323m.f63100a
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14241f.this
                pb.c r4 = p389sb.C16519a.m98615h(r4)
                pb.c r3 = r3.mo72966b(r4)
                if (r3 != 0) goto L_0x002f
                return r2
            L_0x002e:
                r3 = r0
            L_0x002f:
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14241f.this
                kotlin.reflect.jvm.internal.impl.load.java.lazy.g r4 = r4.f62981C
                kotlin.reflect.jvm.internal.impl.descriptors.g0 r4 = r4.mo72917d()
                fb.d r5 = p263fb.C12256d.FROM_JAVA_LOADER
                kotlin.reflect.jvm.internal.impl.descriptors.e r3 = p389sb.C16519a.m98625r(r4, r3, r5)
                if (r3 != 0) goto L_0x0042
                return r2
            L_0x0042:
                kotlin.reflect.jvm.internal.impl.types.e1 r4 = r3.mo62171j()
                java.util.List r4 = r4.getParameters()
                int r4 = r4.size()
                kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f r5 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14241f.this
                kotlin.reflect.jvm.internal.impl.types.e1 r5 = r5.mo62171j()
                java.util.List r5 = r5.getParameters()
                java.lang.String r6 = "getTypeConstructor().parameters"
                kotlin.jvm.internal.C13706o.m87928e(r5, r6)
                int r6 = r5.size()
                r7 = 10
                if (r6 != r4) goto L_0x008d
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.C13616u.m87774u(r5, r7)
                r0.<init>(r1)
                java.util.Iterator r1 = r5.iterator()
            L_0x0072:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00c7
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r2
                kotlin.reflect.jvm.internal.impl.types.i1 r4 = new kotlin.reflect.jvm.internal.impl.types.i1
                kotlin.reflect.jvm.internal.impl.types.r1 r5 = kotlin.reflect.jvm.internal.impl.types.C14970r1.INVARIANT
                kotlin.reflect.jvm.internal.impl.types.m0 r2 = r2.mo72274p()
                r4.<init>(r5, r2)
                r0.add(r4)
                goto L_0x0072
            L_0x008d:
                if (r6 != r1) goto L_0x00d2
                if (r4 <= r1) goto L_0x00d2
                if (r0 != 0) goto L_0x00d2
                kotlin.reflect.jvm.internal.impl.types.i1 r0 = new kotlin.reflect.jvm.internal.impl.types.i1
                kotlin.reflect.jvm.internal.impl.types.r1 r2 = kotlin.reflect.jvm.internal.impl.types.C14970r1.INVARIANT
                java.lang.Object r5 = kotlin.collections.C13566b0.m87446u0(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r5
                kotlin.reflect.jvm.internal.impl.types.m0 r5 = r5.mo72274p()
                r0.<init>(r2, r5)
                wa.e r2 = new wa.e
                r2.<init>(r1, r4)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r4 = kotlin.collections.C13616u.m87774u(r2, r7)
                r1.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L_0x00b6:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x00c6
                r4 = r2
                kotlin.collections.n0 r4 = (kotlin.collections.C13603n0) r4
                r4.nextInt()
                r1.add(r0)
                goto L_0x00b6
            L_0x00c6:
                r0 = r1
            L_0x00c7:
                kotlin.reflect.jvm.internal.impl.types.a1$a r1 = kotlin.reflect.jvm.internal.impl.types.C14830a1.f63959c
                kotlin.reflect.jvm.internal.impl.types.a1 r1 = r1.mo74051h()
                kotlin.reflect.jvm.internal.impl.types.m0 r0 = kotlin.reflect.jvm.internal.impl.types.C14906f0.m92819g(r1, r3, r0)
                return r0
            L_0x00d2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14241f.C14243b.m89938w():kotlin.reflect.jvm.internal.impl.types.e0");
        }

        /* renamed from: x */
        private final C16152c m89939x() {
            String str;
            C13921g annotations = C14241f.this.getAnnotations();
            C16152c cVar = C14163a0.f62800q;
            C13706o.m87928e(cVar, "PURELY_IMPLEMENTS_ANNOTATION");
            C13915c H = annotations.mo72247H(cVar);
            if (H == null) {
                return null;
            }
            Object v0 = C13566b0.m87447v0(H.mo72240a().values());
            C14645v vVar = v0 instanceof C14645v ? (C14645v) v0 : null;
            if (vVar == null || (str = (String) vVar.mo73727b()) == null || !C16155e.m97014e(str)) {
                return null;
            }
            return new C16152c(str);
        }

        /* renamed from: d */
        public boolean mo62184d() {
            return true;
        }

        public List<C13950e1> getParameters() {
            return (List) this.f62995d.invoke();
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public Collection<C14900e0> mo62186j() {
            Object obj;
            Collection<C12495j> l = C14241f.this.mo72814P0().mo68972l();
            ArrayList arrayList = new ArrayList(l.size());
            ArrayList<C12510x> arrayList2 = new ArrayList<>(0);
            C14900e0 w = m89938w();
            Iterator<C12495j> it = l.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                C12495j next = it.next();
                C14900e0 h = C14241f.this.f62981C.mo72914a().mo72780r().mo73066h(C14241f.this.f62981C.mo72920g().mo72939o(next, C14312d.m90202d(C14190k.SUPERTYPE, false, (C13950e1) null, 3, (Object) null)), C14241f.this.f62981C);
                if (h.mo73702N0().mo62183c() instanceof C14043j0.C14045b) {
                    arrayList2.add(next);
                }
                C14901e1 N0 = h.mo73702N0();
                if (w != null) {
                    obj = w.mo73702N0();
                }
                if (!C13706o.m87924a(N0, obj) && !C13853h.m88253b0(h)) {
                    arrayList.add(h);
                }
            }
            C13948e K0 = C14241f.this.f62980B;
            if (K0 != null) {
                obj = C13901j.m88453a(K0, C14241f.this).mo74203c().mo74215p(K0.mo72274p(), C14970r1.INVARIANT);
            }
            C12338a.m83071a(arrayList, obj);
            C12338a.m83071a(arrayList, w);
            if (!arrayList2.isEmpty()) {
                C14806r c = C14241f.this.f62981C.mo72914a().mo72765c();
                C13948e v = mo62183c();
                ArrayList arrayList3 = new ArrayList(C13616u.m87774u(arrayList2, 10));
                for (C12510x xVar : arrayList2) {
                    C13706o.m87927d(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((C12495j) xVar).mo68983B());
                }
                c.mo67440b(v, arrayList3);
            }
            return arrayList.isEmpty() ^ true ? C13566b0.m87402F0(arrayList) : C13612s.m87736e(C14241f.this.f62981C.mo72917d().mo72296m().mo72136i());
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public C13942c1 mo62187p() {
            return C14241f.this.f62981C.mo72914a().mo72784v();
        }

        public String toString() {
            String d = C14241f.this.getName().mo78583d();
            C13706o.m87928e(d, "name.asString()");
            return d;
        }

        /* renamed from: v */
        public C13948e mo62183c() {
            return C14241f.this;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$c */
    /* compiled from: LazyJavaClassDescriptor.kt */
    static final class C14245c extends C13708q implements C16254a<List<? extends C13950e1>> {
        final /* synthetic */ C14241f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14245c(C14241f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final List<C13950e1> invoke() {
            List<C12512y> typeParameters = this.this$0.mo72814P0().getTypeParameters();
            C14241f fVar = this.this$0;
            ArrayList arrayList = new ArrayList(C13616u.m87774u(typeParameters, 10));
            for (C12512y yVar : typeParameters) {
                C13950e1 a = fVar.f62981C.mo72919f().mo72921a(yVar);
                if (a != null) {
                    arrayList.add(a);
                } else {
                    throw new AssertionError("Parameter " + yVar + " surely belongs to class " + fVar.mo72814P0() + ", so it must be resolved");
                }
            }
            return arrayList;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$d */
    /* compiled from: Comparisons.kt */
    public static final class C14246d<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C15612b.m94865a(C16519a.m98615h((C13948e) t).mo78556b(), C16519a.m98615h((C13948e) t2).mo78556b());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$e */
    /* compiled from: LazyJavaClassDescriptor.kt */
    static final class C14247e extends C13708q implements C16254a<List<? extends C12479a>> {
        final /* synthetic */ C14241f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14247e(C14241f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final List<C12479a> invoke() {
            C16151b g = C16519a.m98614g(this.this$0);
            if (g != null) {
                return this.this$0.mo72816R0().mo72914a().mo72768f().mo72980a(g);
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f$f */
    /* compiled from: LazyJavaClassDescriptor.kt */
    static final class C14248f extends C13708q implements C16265l<C14849g, C14249g> {
        final /* synthetic */ C14241f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14248f(C14241f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* renamed from: a */
        public final C14249g invoke(C14849g gVar) {
            C13706o.m87929f(gVar, "it");
            C14301g L0 = this.this$0.f62981C;
            C14241f fVar = this.this$0;
            return new C14249g(L0, fVar, fVar.mo72814P0(), this.this$0.f62980B != null, this.this$0.f62988J);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14241f(C14301g gVar, C14064m mVar, C12492g gVar2, C13948e eVar, int i, C13695i iVar) {
        this(gVar, mVar, gVar2, (i & 8) != 0 ? null : eVar);
    }

    /* renamed from: D */
    public C13944d mo62149D() {
        return null;
    }

    /* renamed from: I0 */
    public boolean mo62150I0() {
        return false;
    }

    /* renamed from: N0 */
    public final C14241f mo72812N0(C14181g gVar, C13948e eVar) {
        C13706o.m87929f(gVar, "javaResolverCache");
        C14301g gVar2 = this.f62981C;
        C14301g i = C14222a.m89816i(gVar2, gVar2.mo72914a().mo72786x(gVar));
        C14064m b = mo62163b();
        C13706o.m87928e(b, "containingDeclaration");
        return new C14241f(i, b, this.f62979A, eVar);
    }

    /* renamed from: O0 */
    public List<C13944d> mo62173k() {
        return (List) this.f62988J.mo72840w0().invoke();
    }

    /* renamed from: P0 */
    public final C12492g mo72814P0() {
        return this.f62979A;
    }

    /* renamed from: Q0 */
    public final List<C12479a> mo72815Q0() {
        return (List) this.f62982D.getValue();
    }

    /* renamed from: R0 */
    public final C14301g mo72816R0() {
        return this.f62994z;
    }

    /* renamed from: S0 */
    public C14249g mo72285X() {
        C14692h X = super.mo72285X();
        C13706o.m87927d(X, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C14249g) X;
    }

    /* renamed from: T */
    public C14692h mo72284T() {
        return this.f62990L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public C14249g mo62174k0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this.f62989K.mo72664c(gVar);
    }

    /* renamed from: U */
    public C13960g1<C14951m0> mo62155U() {
        return null;
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo62162a0() {
        return false;
    }

    /* renamed from: e0 */
    public boolean mo62164e0() {
        return false;
    }

    public C13921g getAnnotations() {
        return this.f62992N;
    }

    public C14141u getVisibility() {
        if (!C13706o.m87924a(this.f62985G, C14127t.f62750a) || this.f62979A.mo68973m() != null) {
            return C14216i0.m89798c(this.f62985G);
        }
        C14141u uVar = C14331r.f63110a;
        C13706o.m87928e(uVar, "{\n            JavaDescri…KAGE_VISIBILITY\n        }");
        return uVar;
    }

    /* renamed from: h */
    public C13951f mo62168h() {
        return this.f62983E;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        return this.f62987I;
    }

    /* renamed from: j0 */
    public boolean mo62172j0() {
        return false;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return false;
    }

    /* renamed from: m0 */
    public C14692h mo62176m0() {
        return this.f62991M;
    }

    /* renamed from: n0 */
    public C13948e mo62177n0() {
        return null;
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        return (List) this.f62993O.invoke();
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        return this.f62984F;
    }

    public String toString() {
        return "Lazy Java class " + C16519a.m98616i(this);
    }

    /* renamed from: w */
    public Collection<C13948e> mo62181w() {
        if (this.f62984F != C13945d0.SEALED) {
            return C13614t.m87748j();
        }
        C14308a d = C14312d.m90202d(C14190k.COMMON, false, (C13950e1) null, 3, (Object) null);
        Collection<C12495j> z = this.f62979A.mo68981z();
        ArrayList arrayList = new ArrayList();
        for (C12495j o : z) {
            C13961h c = this.f62981C.mo72920g().mo72939o(o, d).mo73702N0().mo62183c();
            C13948e eVar = c instanceof C13948e ? (C13948e) c : null;
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return C13566b0.m87450y0(arrayList, new C14246d());
    }

    /* renamed from: y */
    public boolean mo62182y() {
        return this.f62986H;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14241f(C14301g gVar, C14064m mVar, C12492g gVar2, C13948e eVar) {
        super(gVar.mo72918e(), mVar, gVar2.getName(), gVar.mo72914a().mo72782t().mo67445a(gVar2), false);
        C13951f fVar;
        C13945d0 d0Var;
        C13948e eVar2 = eVar;
        C13706o.m87929f(gVar, "outerContext");
        C13706o.m87929f(mVar, "containingDeclaration");
        C13706o.m87929f(gVar2, "jClass");
        this.f62994z = gVar;
        this.f62979A = gVar2;
        this.f62980B = eVar2;
        C14301g d = C14222a.m89811d(gVar, this, gVar2, 0, 4, (Object) null);
        this.f62981C = d;
        d.mo72914a().mo72770h().mo72700a(gVar2, this);
        gVar2.mo68967G();
        this.f62982D = C13323i.m85669b(new C14247e(this));
        if (gVar2.mo68975o()) {
            fVar = C13951f.ANNOTATION_CLASS;
        } else if (gVar2.mo68966F()) {
            fVar = C13951f.INTERFACE;
        } else if (gVar2.mo68978u()) {
            fVar = C13951f.ENUM_CLASS;
        } else {
            fVar = C13951f.CLASS;
        }
        this.f62983E = fVar;
        if (gVar2.mo68975o() || gVar2.mo68978u()) {
            d0Var = C13945d0.FINAL;
        } else {
            d0Var = C13945d0.f62416a.mo72279a(gVar2.mo68979w(), gVar2.mo68979w() || gVar2.isAbstract() || gVar2.mo68966F(), !gVar2.isFinal());
        }
        this.f62984F = d0Var;
        this.f62985G = gVar2.getVisibility();
        this.f62986H = gVar2.mo68973m() != null && !gVar2.mo69001h();
        this.f62987I = new C14243b();
        C14249g gVar3 = new C14249g(d, this, gVar2, eVar2 != null, (C14249g) null, 16, (C13695i) null);
        this.f62988J = gVar3;
        this.f62989K = C14150x0.f62770e.mo72665a(this, d.mo72918e(), d.mo72914a().mo72773k().mo74090c(), new C14248f(this));
        this.f62990L = new C14689f(gVar3);
        this.f62991M = new C14289k(d, gVar2, this);
        this.f62992N = C14298e.m90143a(d, gVar2);
        this.f62993O = d.mo72918e().mo80221f(new C14245c(this));
    }
}
