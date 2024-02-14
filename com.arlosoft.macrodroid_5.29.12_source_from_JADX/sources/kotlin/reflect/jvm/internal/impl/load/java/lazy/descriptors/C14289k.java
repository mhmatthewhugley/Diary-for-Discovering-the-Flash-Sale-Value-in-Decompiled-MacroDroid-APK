package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14169a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p263fb.C12253b;
import p263fb.C12256d;
import p271gb.C12337h;
import p272gc.C12339b;
import p288ib.C12492g;
import p288ib.C12502q;
import p297ja.C13339u;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k */
/* compiled from: LazyJavaStaticClassScope.kt */
public final class C14289k extends C14296l {

    /* renamed from: n */
    private final C12492g f63048n;

    /* renamed from: o */
    private final C14241f f63049o;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$a */
    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class C14290a extends C13708q implements C16265l<C12502q, Boolean> {

        /* renamed from: a */
        public static final C14290a f63050a = new C14290a();

        C14290a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C12502q qVar) {
            C13706o.m87929f(qVar, "it");
            return Boolean.valueOf(qVar.mo69001h());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$b */
    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class C14291b extends C13708q implements C16265l<C14692h, Collection<? extends C14140t0>> {
        final /* synthetic */ C16157f $name;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14291b(C16157f fVar) {
            super(1);
            this.$name = fVar;
        }

        /* renamed from: a */
        public final Collection<? extends C14140t0> invoke(C14692h hVar) {
            C13706o.m87929f(hVar, "it");
            return hVar.mo72451d(this.$name, C12256d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$c */
    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class C14292c extends C13708q implements C16265l<C14692h, Collection<? extends C16157f>> {

        /* renamed from: a */
        public static final C14292c f63051a = new C14292c();

        C14292c() {
            super(1);
        }

        /* renamed from: a */
        public final Collection<C16157f> invoke(C14692h hVar) {
            C13706o.m87929f(hVar, "it");
            return hVar.mo72448a();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$d */
    /* compiled from: LazyJavaStaticClassScope.kt */
    static final class C14293d<N> implements C12339b.C12342c {

        /* renamed from: a */
        public static final C14293d<N> f63052a = new C14293d<>();

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$d$a */
        /* compiled from: LazyJavaStaticClassScope.kt */
        static final class C14294a extends C13708q implements C16265l<C14900e0, C13948e> {

            /* renamed from: a */
            public static final C14294a f63053a = new C14294a();

            C14294a() {
                super(1);
            }

            /* renamed from: a */
            public final C13948e invoke(C14900e0 e0Var) {
                C13961h c = e0Var.mo73702N0().mo62183c();
                if (c instanceof C13948e) {
                    return (C13948e) c;
                }
                return null;
            }
        }

        C14293d() {
        }

        /* renamed from: b */
        public final Iterable<C13948e> mo68671a(C13948e eVar) {
            Collection<C14900e0> l = eVar.mo62171j().mo72370l();
            C13706o.m87928e(l, "it.typeConstructor.supertypes");
            return C15132p.m93482k(C15132p.m93495x(C13566b0.m87412N(l), C14294a.f63053a));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.k$e */
    /* compiled from: LazyJavaStaticClassScope.kt */
    public static final class C14295e extends C12339b.C12341b<C13948e, C13339u> {

        /* renamed from: a */
        final /* synthetic */ C13948e f63054a;

        /* renamed from: b */
        final /* synthetic */ Set<R> f63055b;

        /* renamed from: c */
        final /* synthetic */ C16265l<C14692h, Collection<R>> f63056c;

        C14295e(C13948e eVar, Set<R> set, C16265l<? super C14692h, ? extends Collection<? extends R>> lVar) {
            this.f63054a = eVar;
            this.f63055b = set;
            this.f63056c = lVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo68667a() {
            mo72910e();
            return C13339u.f61331a;
        }

        /* renamed from: d */
        public boolean mo68668c(C13948e eVar) {
            C13706o.m87929f(eVar, "current");
            if (eVar == this.f63054a) {
                return true;
            }
            C14692h m0 = eVar.mo62176m0();
            C13706o.m87928e(m0, "current.staticScope");
            if (!(m0 instanceof C14296l)) {
                return true;
            }
            this.f63055b.addAll(this.f63056c.invoke(m0));
            return false;
        }

        /* renamed from: e */
        public void mo72910e() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14289k(C14301g gVar, C12492g gVar2, C14241f fVar) {
        super(gVar);
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(gVar2, "jClass");
        C13706o.m87929f(fVar, "ownerDescriptor");
        this.f63048n = gVar2;
        this.f63049o = fVar;
    }

    /* renamed from: N */
    private final <R> Set<R> m90112N(C13948e eVar, Set<R> set, C16265l<? super C14692h, ? extends Collection<? extends R>> lVar) {
        C12339b.m83079b(C13612s.m87736e(eVar), C14293d.f63052a, new C14295e(eVar, set, lVar));
        return set;
    }

    /* renamed from: P */
    private final C14140t0 m90113P(C14140t0 t0Var) {
        if (t0Var.mo72264h().mo72265b()) {
            return t0Var;
        }
        Collection<? extends C14140t0> d = t0Var.mo72234d();
        C13706o.m87928e(d, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(d, 10));
        for (C14140t0 t0Var2 : d) {
            C13706o.m87928e(t0Var2, "it");
            arrayList.add(m90113P(t0Var2));
        }
        return (C14140t0) C13566b0.m87446u0(C13566b0.m87415P(arrayList));
    }

    /* renamed from: Q */
    private final Set<C14156y0> m90114Q(C16157f fVar, C13948e eVar) {
        C14289k b = C12337h.m83070b(eVar);
        if (b == null) {
            return C13627z0.m87806d();
        }
        return C13566b0.m87407K0(b.mo72450c(fVar, C12256d.WHEN_GET_SUPER_MEMBERS));
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C14230a mo72835p() {
        return new C14230a(this.f63048n, C14290a.f63050a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public C14241f mo72826C() {
        return this.f63049o;
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Set<C16157f> mo72832l(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        return C13627z0.m87806d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Set<C16157f> mo72833n(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        Set<C16157f> J0 = C13566b0.m87406J0(((C14232b) mo72878y().invoke()).mo72792a());
        C14289k b = C12337h.m83070b(mo72826C());
        Set<C16157f> b2 = b != null ? b.mo72449b() : null;
        if (b2 == null) {
            b2 = C13627z0.m87806d();
        }
        J0.addAll(b2);
        if (this.f63048n.mo68978u()) {
            J0.addAll(C13614t.m87751m(C13902k.f62183e, C13902k.f62182d));
        }
        J0.addAll(mo72877w().mo72914a().mo72785w().mo79449a(mo72826C()));
        return J0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo72834o(Collection<C14156y0> collection, C16157f fVar) {
        C13706o.m87929f(collection, "result");
        C13706o.m87929f(fVar, "name");
        mo72877w().mo72914a().mo72785w().mo79452d(mo72826C(), fVar, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo72836r(Collection<C14156y0> collection, C16157f fVar) {
        C13706o.m87929f(collection, "result");
        C13706o.m87929f(fVar, "name");
        Collection<D> e = C14169a.m89662e(fVar, m90114Q(fVar, mo72826C()), collection, mo72826C(), mo72877w().mo72914a().mo72765c(), mo72877w().mo72914a().mo72773k().mo74089a());
        C13706o.m87928e(e, "resolveOverridesForStati….overridingUtil\n        )");
        collection.addAll(e);
        if (!this.f63048n.mo68978u()) {
            return;
        }
        if (C13706o.m87924a(fVar, C13902k.f62183e)) {
            C14156y0 f = C14602c.m91474f(mo72826C());
            C13706o.m87928e(f, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(f);
        } else if (C13706o.m87924a(fVar, C13902k.f62182d)) {
            C14156y0 g = C14602c.m91475g(mo72826C());
            C13706o.m87928e(g, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo72837s(C16157f fVar, Collection<C14140t0> collection) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(collection, "result");
        Set N = m90112N(mo72826C(), new LinkedHashSet(), new C14291b(fVar));
        if (!collection.isEmpty()) {
            Collection<D> e = C14169a.m89662e(fVar, N, collection, mo72826C(), mo72877w().mo72914a().mo72765c(), mo72877w().mo72914a().mo72773k().mo74089a());
            C13706o.m87928e(e, "resolveOverridesForStati…ingUtil\n                )");
            collection.addAll(e);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : N) {
            C14140t0 P = m90113P((C14140t0) next);
            Object obj = linkedHashMap.get(P);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(P, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            Collection<D> e2 = C14169a.m89662e(fVar, (Collection) value.getValue(), collection, mo72826C(), mo72877w().mo72914a().mo72765c(), mo72877w().mo72914a().mo72773k().mo74089a());
            C13706o.m87928e(e2, "resolveOverridesForStati…ingUtil\n                )");
            boolean unused = C13624y.m87797z(arrayList, e2);
        }
        collection.addAll(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Set<C16157f> mo72838t(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        Set<C16157f> J0 = C13566b0.m87406J0(((C14232b) mo72878y().invoke()).mo72797f());
        m90112N(mo72826C(), J0, C14292c.f63051a);
        return J0;
    }
}
