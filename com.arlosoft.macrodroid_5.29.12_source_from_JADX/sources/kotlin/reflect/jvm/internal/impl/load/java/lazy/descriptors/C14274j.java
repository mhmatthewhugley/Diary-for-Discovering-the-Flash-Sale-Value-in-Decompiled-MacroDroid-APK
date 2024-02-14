package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14145w;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13978c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13984d0;
import kotlin.reflect.jvm.internal.impl.load.java.C14216i0;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14222a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14298e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14312d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.C14671l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14680c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14696i;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import p263fb.C12253b;
import p263fb.C12256d;
import p271gb.C12331e;
import p271gb.C12335f;
import p272gc.C12338a;
import p288ib.C12499n;
import p288ib.C12503r;
import p288ib.C12512y;
import p297ja.C13337s;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16887m;
import p442yb.C17004g;
import p442yb.C17005h;
import p442yb.C17006i;
import p442yb.C17007j;
import p442yb.C17011m;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j */
/* compiled from: LazyJavaScope.kt */
public abstract class C14274j extends C14696i {

    /* renamed from: m */
    static final /* synthetic */ C16887m<Object>[] f63027m;

    /* renamed from: b */
    private final C14301g f63028b;

    /* renamed from: c */
    private final C14274j f63029c;

    /* renamed from: d */
    private final C17006i<Collection<C14064m>> f63030d;

    /* renamed from: e */
    private final C17006i<C14232b> f63031e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C17004g<C16157f, Collection<C14156y0>> f63032f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C17005h<C16157f, C14140t0> f63033g;

    /* renamed from: h */
    private final C17004g<C16157f, Collection<C14156y0>> f63034h;

    /* renamed from: i */
    private final C17006i f63035i;

    /* renamed from: j */
    private final C17006i f63036j;

    /* renamed from: k */
    private final C17006i f63037k;

    /* renamed from: l */
    private final C17004g<C16157f, List<C14140t0>> f63038l;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$a */
    /* compiled from: LazyJavaScope.kt */
    protected static final class C14275a {

        /* renamed from: a */
        private final C14900e0 f63039a;

        /* renamed from: b */
        private final C14900e0 f63040b;

        /* renamed from: c */
        private final List<C13966i1> f63041c;

        /* renamed from: d */
        private final List<C13950e1> f63042d;

        /* renamed from: e */
        private final boolean f63043e;

        /* renamed from: f */
        private final List<String> f63044f;

        public C14275a(C14900e0 e0Var, C14900e0 e0Var2, List<? extends C13966i1> list, List<? extends C13950e1> list2, boolean z, List<String> list3) {
            C13706o.m87929f(e0Var, "returnType");
            C13706o.m87929f(list, "valueParameters");
            C13706o.m87929f(list2, "typeParameters");
            C13706o.m87929f(list3, "errors");
            this.f63039a = e0Var;
            this.f63040b = e0Var2;
            this.f63041c = list;
            this.f63042d = list2;
            this.f63043e = z;
            this.f63044f = list3;
        }

        /* renamed from: a */
        public final List<String> mo72879a() {
            return this.f63044f;
        }

        /* renamed from: b */
        public final boolean mo72880b() {
            return this.f63043e;
        }

        /* renamed from: c */
        public final C14900e0 mo72881c() {
            return this.f63040b;
        }

        /* renamed from: d */
        public final C14900e0 mo72882d() {
            return this.f63039a;
        }

        /* renamed from: e */
        public final List<C13950e1> mo72883e() {
            return this.f63042d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14275a)) {
                return false;
            }
            C14275a aVar = (C14275a) obj;
            return C13706o.m87924a(this.f63039a, aVar.f63039a) && C13706o.m87924a(this.f63040b, aVar.f63040b) && C13706o.m87924a(this.f63041c, aVar.f63041c) && C13706o.m87924a(this.f63042d, aVar.f63042d) && this.f63043e == aVar.f63043e && C13706o.m87924a(this.f63044f, aVar.f63044f);
        }

        /* renamed from: f */
        public final List<C13966i1> mo72885f() {
            return this.f63041c;
        }

        public int hashCode() {
            int hashCode = this.f63039a.hashCode() * 31;
            C14900e0 e0Var = this.f63040b;
            int hashCode2 = (((((hashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31) + this.f63041c.hashCode()) * 31) + this.f63042d.hashCode()) * 31;
            boolean z = this.f63043e;
            if (z) {
                z = true;
            }
            return ((hashCode2 + (z ? 1 : 0)) * 31) + this.f63044f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f63039a + ", receiverType=" + this.f63040b + ", valueParameters=" + this.f63041c + ", typeParameters=" + this.f63042d + ", hasStableParameterNames=" + this.f63043e + ", errors=" + this.f63044f + ')';
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$b */
    /* compiled from: LazyJavaScope.kt */
    protected static final class C14276b {

        /* renamed from: a */
        private final List<C13966i1> f63045a;

        /* renamed from: b */
        private final boolean f63046b;

        public C14276b(List<? extends C13966i1> list, boolean z) {
            C13706o.m87929f(list, "descriptors");
            this.f63045a = list;
            this.f63046b = z;
        }

        /* renamed from: a */
        public final List<C13966i1> mo72888a() {
            return this.f63045a;
        }

        /* renamed from: b */
        public final boolean mo72889b() {
            return this.f63046b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$c */
    /* compiled from: LazyJavaScope.kt */
    static final class C14277c extends C13708q implements C16254a<Collection<? extends C14064m>> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14277c(C14274j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final Collection<C14064m> invoke() {
            return this.this$0.mo72874m(C14683d.f63699o, C14692h.f63722a.mo73822a());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$d */
    /* compiled from: LazyJavaScope.kt */
    static final class C14278d extends C13708q implements C16254a<Set<? extends C16157f>> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14278d(C14274j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final Set<C16157f> invoke() {
            return this.this$0.mo72832l(C14683d.f63704t, (C16265l<? super C16157f, Boolean>) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$e */
    /* compiled from: LazyJavaScope.kt */
    static final class C14279e extends C13708q implements C16265l<C16157f, C14140t0> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14279e(C14274j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final C14140t0 invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            if (this.this$0.mo72871B() != null) {
                return (C14140t0) this.this$0.mo72871B().f63033g.invoke(fVar);
            }
            C12499n c = ((C14232b) this.this$0.mo72878y().invoke()).mo72794c(fVar);
            if (c == null || c.mo68991E()) {
                return null;
            }
            return this.this$0.m90059J(c);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$f */
    /* compiled from: LazyJavaScope.kt */
    static final class C14280f extends C13708q implements C16265l<C16157f, Collection<? extends C14156y0>> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14280f(C14274j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final Collection<C14156y0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            if (this.this$0.mo72871B() != null) {
                return (Collection) this.this$0.mo72871B().f63032f.invoke(fVar);
            }
            ArrayList arrayList = new ArrayList();
            for (C12503r next : ((C14232b) this.this$0.mo72878y().invoke()).mo72793b(fVar)) {
                C12331e I = this.this$0.mo72872I(next);
                if (this.this$0.mo72828G(I)) {
                    this.this$0.mo72877w().mo72914a().mo72770h().mo72701b(next, I);
                    arrayList.add(I);
                }
            }
            this.this$0.mo72834o(arrayList, fVar);
            return arrayList;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$g */
    /* compiled from: LazyJavaScope.kt */
    static final class C14281g extends C13708q implements C16254a<C14232b> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14281g(C14274j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final C14232b invoke() {
            return this.this$0.mo72835p();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$h */
    /* compiled from: LazyJavaScope.kt */
    static final class C14282h extends C13708q implements C16254a<Set<? extends C16157f>> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14282h(C14274j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final Set<C16157f> invoke() {
            return this.this$0.mo72833n(C14683d.f63706v, (C16265l<? super C16157f, Boolean>) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$i */
    /* compiled from: LazyJavaScope.kt */
    static final class C14283i extends C13708q implements C16265l<C16157f, Collection<? extends C14156y0>> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14283i(C14274j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final Collection<C14156y0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) this.this$0.f63032f.invoke(fVar));
            this.this$0.m90060L(linkedHashSet);
            this.this$0.mo72836r(linkedHashSet, fVar);
            return C13566b0.m87402F0(this.this$0.mo72877w().mo72914a().mo72780r().mo73065g(this.this$0.mo72877w(), linkedHashSet));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$j */
    /* compiled from: LazyJavaScope.kt */
    static final class C14284j extends C13708q implements C16265l<C16157f, List<? extends C14140t0>> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14284j(C14274j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final List<C14140t0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            ArrayList arrayList = new ArrayList();
            C12338a.m83071a(arrayList, this.this$0.f63033g.invoke(fVar));
            this.this$0.mo72837s(fVar, arrayList);
            if (C14650d.m91633t(this.this$0.mo72826C())) {
                return C13566b0.m87402F0(arrayList);
            }
            return C13566b0.m87402F0(this.this$0.mo72877w().mo72914a().mo72780r().mo73065g(this.this$0.mo72877w(), arrayList));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$k */
    /* compiled from: LazyJavaScope.kt */
    static final class C14285k extends C13708q implements C16254a<Set<? extends C16157f>> {
        final /* synthetic */ C14274j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14285k(C14274j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final Set<C16157f> invoke() {
            return this.this$0.mo72838t(C14683d.f63707w, (C16265l<? super C16157f, Boolean>) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$l */
    /* compiled from: LazyJavaScope.kt */
    static final class C14286l extends C13708q implements C16254a<C17007j<? extends C14617g<?>>> {
        final /* synthetic */ C12499n $field;
        final /* synthetic */ C13978c0 $propertyDescriptor;
        final /* synthetic */ C14274j this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$l$a */
        /* compiled from: LazyJavaScope.kt */
        static final class C14287a extends C13708q implements C16254a<C14617g<?>> {
            final /* synthetic */ C12499n $field;
            final /* synthetic */ C13978c0 $propertyDescriptor;
            final /* synthetic */ C14274j this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14287a(C14274j jVar, C12499n nVar, C13978c0 c0Var) {
                super(0);
                this.this$0 = jVar;
                this.$field = nVar;
                this.$propertyDescriptor = c0Var;
            }

            /* renamed from: a */
            public final C14617g<?> invoke() {
                return this.this$0.mo72877w().mo72914a().mo72769g().mo72699a(this.$field, this.$propertyDescriptor);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14286l(C14274j jVar, C12499n nVar, C13978c0 c0Var) {
            super(0);
            this.this$0 = jVar;
            this.$field = nVar;
            this.$propertyDescriptor = c0Var;
        }

        /* renamed from: a */
        public final C17007j<C14617g<?>> invoke() {
            return this.this$0.mo72877w().mo72918e().mo80219d(new C14287a(this.this$0, this.$field, this.$propertyDescriptor));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$m */
    /* compiled from: LazyJavaScope.kt */
    static final class C14288m extends C13708q implements C16265l<C14156y0, C13908a> {

        /* renamed from: a */
        public static final C14288m f63047a = new C14288m();

        C14288m() {
            super(1);
        }

        /* renamed from: a */
        public final C13908a invoke(C14156y0 y0Var) {
            C13706o.m87929f(y0Var, "$this$selectMostSpecificInEachOverridableGroup");
            return y0Var;
        }
    }

    static {
        Class<C14274j> cls = C14274j.class;
        f63027m = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14274j(C14301g gVar, C14274j jVar, int i, C13695i iVar) {
        this(gVar, (i & 2) != 0 ? null : jVar);
    }

    /* renamed from: A */
    private final Set<C16157f> m90055A() {
        return (Set) C17011m.m100276a(this.f63035i, this, f63027m[0]);
    }

    /* renamed from: D */
    private final Set<C16157f> m90056D() {
        return (Set) C17011m.m100276a(this.f63036j, this, f63027m[1]);
    }

    /* renamed from: E */
    private final C14900e0 m90057E(C12499n nVar) {
        boolean z = false;
        C14900e0 o = this.f63028b.mo72920g().mo72939o(nVar.getType(), C14312d.m90202d(C14190k.COMMON, false, (C13950e1) null, 3, (Object) null));
        if ((C13853h.m88274r0(o) || C13853h.m88277u0(o)) && m90058F(nVar) && nVar.mo68992L()) {
            z = true;
        }
        if (!z) {
            return o;
        }
        C14900e0 n = C14956n1.m92999n(o);
        C13706o.m87928e(n, "makeNotNullable(propertyType)");
        return n;
    }

    /* renamed from: F */
    private final boolean m90058F(C12499n nVar) {
        return nVar.isFinal() && nVar.mo69001h();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final C14140t0 m90059J(C12499n nVar) {
        C13978c0 u = m90065u(nVar);
        u.mo72340V0((C13984d0) null, (C14144v0) null, (C14145w) null, (C14145w) null);
        u.mo72344b1(m90057E(nVar), C13614t.m87748j(), mo72842z(), (C14146w0) null, C13614t.m87748j());
        if (C14650d.m91611K(u, u.getType())) {
            u.mo72458L0(new C14286l(this, nVar, u));
        }
        this.f63028b.mo72914a().mo72770h().mo72703d(nVar, u);
        return u;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m90060L(Set<C14156y0> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T next : set) {
            String c = C14470v.m90689c((C14156y0) next, false, false, 2, (Object) null);
            Object obj = linkedHashMap.get(c);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c, obj);
            }
            ((List) obj).add(next);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection a = C14671l.m91795a(list, C14288m.f63047a);
                set.removeAll(list);
                set.addAll(a);
            }
        }
    }

    /* renamed from: u */
    private final C13978c0 m90065u(C12499n nVar) {
        C12335f f1 = C12335f.m83060f1(mo72826C(), C14298e.m90143a(this.f63028b, nVar), C13945d0.FINAL, C14216i0.m89798c(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f63028b.mo72914a().mo72782t().mo67445a(nVar), m90058F(nVar));
        C13706o.m87928e(f1, "create(\n            owne…d.isFinalStatic\n        )");
        return f1;
    }

    /* renamed from: x */
    private final Set<C16157f> m90066x() {
        return (Set) C17011m.m100276a(this.f63037k, this, f63027m[2]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final C14274j mo72871B() {
        return this.f63029c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract C14064m mo72826C();

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo72828G(C12331e eVar) {
        C13706o.m87929f(eVar, "<this>");
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract C14275a mo72829H(C12503r rVar, List<? extends C13950e1> list, C14900e0 e0Var, List<? extends C13966i1> list2);

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final C12331e mo72872I(C12503r rVar) {
        Map map;
        C12503r rVar2 = rVar;
        C13706o.m87929f(rVar2, "method");
        C12331e p1 = C12331e.m83049p1(mo72826C(), C14298e.m90143a(this.f63028b, rVar2), rVar.getName(), this.f63028b.mo72914a().mo72782t().mo67445a(rVar2), ((C14232b) this.f63031e.invoke()).mo72795d(rVar.getName()) != null && rVar.mo68997g().isEmpty());
        C13706o.m87928e(p1, "createJavaMethod(\n      …eters.isEmpty()\n        )");
        C14301g f = C14222a.m89813f(this.f63028b, p1, rVar, 0, 4, (Object) null);
        List<C12512y> typeParameters = rVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(typeParameters, 10));
        for (C12512y a : typeParameters) {
            C13950e1 a2 = f.mo72919f().mo72921a(a);
            C13706o.m87926c(a2);
            arrayList.add(a2);
        }
        C14276b K = mo72873K(f, p1, rVar.mo68997g());
        C14275a H = mo72829H(rVar2, arrayList, mo72875q(rVar2, f), K.mo72888a());
        C14900e0 c = H.mo72881c();
        C14146w0 h = c != null ? C14602c.m91476h(p1, c, C13921g.f62330v.mo72251b()) : null;
        C14146w0 z = mo72842z();
        List j = C13614t.m87748j();
        List<C13950e1> e = H.mo72883e();
        List<C13966i1> f2 = H.mo72885f();
        C14900e0 d = H.mo72882d();
        C13945d0 a3 = C13945d0.f62416a.mo72279a(false, rVar.isAbstract(), !rVar.isFinal());
        C14141u c2 = C14216i0.m89798c(rVar.getVisibility());
        if (H.mo72881c() != null) {
            map = C13613s0.m87741f(C13337s.m85692a(C12331e.f59011X, C13566b0.m87422W(K.mo72888a())));
        } else {
            map = C13615t0.m87759i();
        }
        Map map2 = map;
        C12331e eVar = p1;
        p1.mo68658o1(h, z, j, e, f2, d, a3, c2, map2);
        eVar.mo68661s1(H.mo72880b(), K.mo72889b());
        if (!H.mo72879a().isEmpty()) {
            f.mo72914a().mo72781s().mo72708b(eVar, H.mo72879a());
        }
        return eVar;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [ib.x] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14274j.C14276b mo72873K(kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g r22, kotlin.reflect.jvm.internal.impl.descriptors.C14154y r23, java.util.List<? extends p288ib.C12483b0> r24) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "c"
            kotlin.jvm.internal.C13706o.m87929f(r0, r1)
            java.lang.String r1 = "function"
            r14 = r23
            kotlin.jvm.internal.C13706o.m87929f(r14, r1)
            java.lang.String r1 = "jValueParameters"
            r15 = r24
            kotlin.jvm.internal.C13706o.m87929f(r15, r1)
            java.lang.Iterable r1 = kotlin.collections.C13566b0.m87411M0(r24)
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.C13616u.m87774u(r1, r2)
            r13.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
            r12 = 0
            r2 = 0
        L_0x002a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x013a
            java.lang.Object r3 = r1.next()
            kotlin.collections.k0 r3 = (kotlin.collections.C13592k0) r3
            int r5 = r3.mo71842a()
            java.lang.Object r3 = r3.mo71843b()
            ib.b0 r3 = (p288ib.C12483b0) r3
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6 = kotlin.reflect.jvm.internal.impl.load.java.lazy.C14298e.m90143a(r0, r3)
            kotlin.reflect.jvm.internal.impl.load.java.components.k r4 = kotlin.reflect.jvm.internal.impl.load.java.components.C14190k.COMMON
            r7 = 3
            r8 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14312d.m90202d(r4, r12, r8, r7, r8)
            boolean r7 = r3.mo68955a()
            r9 = 1
            if (r7 == 0) goto L_0x0090
            ib.x r7 = r3.getType()
            boolean r10 = r7 instanceof p288ib.C12491f
            if (r10 == 0) goto L_0x005e
            r8 = r7
            ib.f r8 = (p288ib.C12491f) r8
        L_0x005e:
            if (r8 == 0) goto L_0x0079
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c r7 = r22.mo72920g()
            kotlin.reflect.jvm.internal.impl.types.e0 r4 = r7.mo72938k(r8, r4, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r7 = r22.mo72917d()
            kotlin.reflect.jvm.internal.impl.builtins.h r7 = r7.mo72296m()
            kotlin.reflect.jvm.internal.impl.types.e0 r7 = r7.mo72138k(r4)
            ja.m r4 = p297ja.C13337s.m85692a(r4, r7)
            goto L_0x00a0
        L_0x0079:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Vararg parameter should be an array: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0090:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.c r7 = r22.mo72920g()
            ib.x r10 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.e0 r4 = r7.mo72939o(r10, r4)
            ja.m r4 = p297ja.C13337s.m85692a(r4, r8)
        L_0x00a0:
            java.lang.Object r7 = r4.mo70152a()
            r8 = r7
            kotlin.reflect.jvm.internal.impl.types.e0 r8 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r8
            java.lang.Object r4 = r4.mo70153b()
            r16 = r4
            kotlin.reflect.jvm.internal.impl.types.e0 r16 = (kotlin.reflect.jvm.internal.impl.types.C14900e0) r16
            pb.f r4 = r23.getName()
            java.lang.String r4 = r4.mo78583d()
            java.lang.String r7 = "equals"
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r7)
            if (r4 == 0) goto L_0x00de
            int r4 = r24.size()
            if (r4 != r9) goto L_0x00de
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r4 = r22.mo72917d()
            kotlin.reflect.jvm.internal.impl.builtins.h r4 = r4.mo72296m()
            kotlin.reflect.jvm.internal.impl.types.m0 r4 = r4.mo72119I()
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r8)
            if (r4 == 0) goto L_0x00de
            java.lang.String r4 = "other"
            pb.f r4 = p362pb.C16157f.m97019i(r4)
            goto L_0x0101
        L_0x00de:
            pb.f r4 = r3.getName()
            if (r4 != 0) goto L_0x00e5
            r2 = 1
        L_0x00e5:
            if (r4 != 0) goto L_0x0101
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r7 = 112(0x70, float:1.57E-43)
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            pb.f r4 = p362pb.C16157f.m97019i(r4)
            java.lang.String r7 = "identifier(\"p$index\")"
            kotlin.jvm.internal.C13706o.m87928e(r4, r7)
        L_0x0101:
            r17 = r2
            r7 = r4
            java.lang.String r2 = "if (function.name.asStri…(\"p$index\")\n            }"
            kotlin.jvm.internal.C13706o.m87928e(r7, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r11 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0
            r4 = 0
            r9 = 0
            r10 = 0
            r18 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.b r2 = r22.mo72914a()
            hb.b r2 = r2.mo72782t()
            hb.a r19 = r2.mo67445a(r3)
            r2 = r11
            r3 = r23
            r20 = r11
            r11 = r18
            r18 = 0
            r12 = r16
            r0 = r13
            r13 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r20
            r0.add(r2)
            r13 = r0
            r2 = r17
            r12 = 0
            r0 = r22
            goto L_0x002a
        L_0x013a:
            r0 = r13
            java.util.List r0 = kotlin.collections.C13566b0.m87402F0(r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$b r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$b
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14274j.mo72873K(kotlin.reflect.jvm.internal.impl.load.java.lazy.g, kotlin.reflect.jvm.internal.impl.descriptors.y, java.util.List):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j$b");
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        return m90056D();
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        return m90055A();
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        if (!mo72449b().contains(fVar)) {
            return C13614t.m87748j();
        }
        return this.f63034h.invoke(fVar);
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        if (!mo72448a().contains(fVar)) {
            return C13614t.m87748j();
        }
        return this.f63038l.invoke(fVar);
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return m90066x();
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        return (Collection) this.f63030d.invoke();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract Set<C16157f> mo72832l(C14683d dVar, C16265l<? super C16157f, Boolean> lVar);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final List<C14064m> mo72874m(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        C12256d dVar2 = C12256d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.mo73800a(C14683d.f63687c.mo73808c())) {
            for (C16157f next : mo72832l(dVar, lVar)) {
                if (lVar.invoke(next).booleanValue()) {
                    C12338a.m83071a(linkedHashSet, mo72800e(next, dVar2));
                }
            }
        }
        if (dVar.mo73800a(C14683d.f63687c.mo73809d()) && !dVar.mo73803l().contains(C14680c.C14681a.f63684a)) {
            for (C16157f next2 : mo72833n(dVar, lVar)) {
                if (lVar.invoke(next2).booleanValue()) {
                    linkedHashSet.addAll(mo72450c(next2, dVar2));
                }
            }
        }
        if (dVar.mo73800a(C14683d.f63687c.mo73814i()) && !dVar.mo73803l().contains(C14680c.C14681a.f63684a)) {
            for (C16157f next3 : mo72838t(dVar, lVar)) {
                if (lVar.invoke(next3).booleanValue()) {
                    linkedHashSet.addAll(mo72451d(next3, dVar2));
                }
            }
        }
        return C13566b0.m87402F0(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Set<C16157f> mo72833n(C14683d dVar, C16265l<? super C16157f, Boolean> lVar);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo72834o(Collection<C14156y0> collection, C16157f fVar) {
        C13706o.m87929f(collection, "result");
        C13706o.m87929f(fVar, "name");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract C14232b mo72835p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C14900e0 mo72875q(C12503r rVar, C14301g gVar) {
        C13706o.m87929f(rVar, "method");
        C13706o.m87929f(gVar, "c");
        return gVar.mo72920g().mo72939o(rVar.getReturnType(), C14312d.m90202d(C14190k.COMMON, rVar.mo68995M().mo68975o(), (C13950e1) null, 2, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo72836r(Collection<C14156y0> collection, C16157f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo72837s(C16157f fVar, Collection<C14140t0> collection);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract Set<C16157f> mo72838t(C14683d dVar, C16265l<? super C16157f, Boolean> lVar);

    public String toString() {
        return "Lazy scope for " + mo72826C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C17006i<Collection<C14064m>> mo72876v() {
        return this.f63030d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final C14301g mo72877w() {
        return this.f63028b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C17006i<C14232b> mo72878y() {
        return this.f63031e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract C14146w0 mo72842z();

    public C14274j(C14301g gVar, C14274j jVar) {
        C13706o.m87929f(gVar, "c");
        this.f63028b = gVar;
        this.f63029c = jVar;
        this.f63030d = gVar.mo72918e().mo80216a(new C14277c(this), C13614t.m87748j());
        this.f63031e = gVar.mo72918e().mo80221f(new C14281g(this));
        this.f63032f = gVar.mo72918e().mo80223h(new C14280f(this));
        this.f63033g = gVar.mo72918e().mo80217b(new C14279e(this));
        this.f63034h = gVar.mo72918e().mo80223h(new C14283i(this));
        this.f63035i = gVar.mo72918e().mo80221f(new C14282h(this));
        this.f63036j = gVar.mo72918e().mo80221f(new C14285k(this));
        this.f63037k = gVar.mo72918e().mo80221f(new C14278d(this));
        this.f63038l = gVar.mo72918e().mo80223h(new C14284j(this));
    }
}
