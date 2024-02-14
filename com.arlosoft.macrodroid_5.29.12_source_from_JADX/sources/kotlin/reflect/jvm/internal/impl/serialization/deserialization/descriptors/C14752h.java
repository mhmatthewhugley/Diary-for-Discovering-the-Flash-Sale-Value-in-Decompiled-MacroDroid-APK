package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.protobuf.C14478a;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.protobuf.C14519q;
import kotlin.reflect.jvm.internal.impl.resolve.C14655g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14696i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14798m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14823x;
import p263fb.C12253b;
import p272gc.C12338a;
import p297ja.C13339u;
import p308kb.C13481i;
import p308kb.C13494n;
import p308kb.C13516r;
import p362pb.C16151b;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16887m;
import p442yb.C17004g;
import p442yb.C17005h;
import p442yb.C17006i;
import p442yb.C17007j;
import p442yb.C17011m;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h */
/* compiled from: DeserializedMemberScope.kt */
public abstract class C14752h extends C14696i {

    /* renamed from: f */
    static final /* synthetic */ C16887m<Object>[] f63818f;

    /* renamed from: b */
    private final C14798m f63819b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14753a f63820c;

    /* renamed from: d */
    private final C17006i f63821d;

    /* renamed from: e */
    private final C17007j f63822e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$a */
    /* compiled from: DeserializedMemberScope.kt */
    private interface C14753a {
        /* renamed from: a */
        Set<C16157f> mo73901a();

        /* renamed from: b */
        Set<C16157f> mo73902b();

        /* renamed from: c */
        Collection<C14156y0> mo73903c(C16157f fVar, C12253b bVar);

        /* renamed from: d */
        Collection<C14140t0> mo73904d(C16157f fVar, C12253b bVar);

        /* renamed from: e */
        void mo73905e(Collection<C14064m> collection, C14683d dVar, C16265l<? super C16157f, Boolean> lVar, C12253b bVar);

        /* renamed from: f */
        Set<C16157f> mo73906f();

        /* renamed from: g */
        C13947d1 mo73907g(C16157f fVar);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b */
    /* compiled from: DeserializedMemberScope.kt */
    private final class C14754b implements C14753a {

        /* renamed from: o */
        static final /* synthetic */ C16887m<Object>[] f63823o;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C13481i> f63824a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final List<C13494n> f63825b;

        /* renamed from: c */
        private final List<C13516r> f63826c;

        /* renamed from: d */
        private final C17006i f63827d;

        /* renamed from: e */
        private final C17006i f63828e;

        /* renamed from: f */
        private final C17006i f63829f;

        /* renamed from: g */
        private final C17006i f63830g;

        /* renamed from: h */
        private final C17006i f63831h;

        /* renamed from: i */
        private final C17006i f63832i;

        /* renamed from: j */
        private final C17006i f63833j;

        /* renamed from: k */
        private final C17006i f63834k;

        /* renamed from: l */
        private final C17006i f63835l;

        /* renamed from: m */
        private final C17006i f63836m;

        /* renamed from: n */
        final /* synthetic */ C14752h f63837n;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$a */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14755a extends C13708q implements C16254a<List<? extends C14156y0>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14755a(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final List<C14156y0> invoke() {
                return C13566b0.m87442q0(this.this$0.m92117D(), this.this$0.m92134t());
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$b */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14756b extends C13708q implements C16254a<List<? extends C14140t0>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14756b(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final List<C14140t0> invoke() {
                return C13566b0.m87442q0(this.this$0.m92118E(), this.this$0.m92135u());
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$c */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14757c extends C13708q implements C16254a<List<? extends C13947d1>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14757c(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final List<C13947d1> invoke() {
                return this.this$0.m92140z();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$d */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14758d extends C13708q implements C16254a<List<? extends C14156y0>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14758d(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final List<C14156y0> invoke() {
                return this.this$0.m92136v();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$e */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14759e extends C13708q implements C16254a<List<? extends C14140t0>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14759e(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final List<C14140t0> invoke() {
                return this.this$0.m92139y();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$f */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14760f extends C13708q implements C16254a<Set<? extends C16157f>> {
            final /* synthetic */ C14754b this$0;
            final /* synthetic */ C14752h this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14760f(C14754b bVar, C14752h hVar) {
                super(0);
                this.this$0 = bVar;
                this.this$1 = hVar;
            }

            /* renamed from: a */
            public final Set<C16157f> invoke() {
                C14754b bVar = this.this$0;
                List<C14516o> r = bVar.f63824a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C14752h hVar = bVar.f63837n;
                for (C14516o oVar : r) {
                    linkedHashSet.add(C14823x.m92359b(hVar.mo73898p().mo73992g(), ((C13481i) oVar).mo71267i0()));
                }
                return C13563a1.m87391j(linkedHashSet, this.this$1.mo73876t());
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$g */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14761g extends C13708q implements C16254a<Map<C16157f, ? extends List<? extends C14156y0>>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14761g(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final Map<C16157f, List<C14156y0>> invoke() {
                List m = this.this$0.m92114A();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next : m) {
                    C16157f name = ((C14156y0) next).getName();
                    C13706o.m87928e(name, "it.name");
                    Object obj = linkedHashMap.get(name);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(name, obj);
                    }
                    ((List) obj).add(next);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$h */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14762h extends C13708q implements C16254a<Map<C16157f, ? extends List<? extends C14140t0>>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14762h(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final Map<C16157f, List<C14140t0>> invoke() {
                List n = this.this$0.m92115B();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object next : n) {
                    C16157f name = ((C14140t0) next).getName();
                    C13706o.m87928e(name, "it.name");
                    Object obj = linkedHashMap.get(name);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(name, obj);
                    }
                    ((List) obj).add(next);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$i */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14763i extends C13708q implements C16254a<Map<C16157f, ? extends C13947d1>> {
            final /* synthetic */ C14754b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14763i(C14754b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final Map<C16157f, C13947d1> invoke() {
                List o = this.this$0.m92116C();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(o, 10)), 16));
                for (Object next : o) {
                    C16157f name = ((C13947d1) next).getName();
                    C13706o.m87928e(name, "it.name");
                    linkedHashMap.put(name, next);
                }
                return linkedHashMap;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$b$j */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14764j extends C13708q implements C16254a<Set<? extends C16157f>> {
            final /* synthetic */ C14754b this$0;
            final /* synthetic */ C14752h this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14764j(C14754b bVar, C14752h hVar) {
                super(0);
                this.this$0 = bVar;
                this.this$1 = hVar;
            }

            /* renamed from: a */
            public final Set<C16157f> invoke() {
                C14754b bVar = this.this$0;
                List<C14516o> s = bVar.f63825b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C14752h hVar = bVar.f63837n;
                for (C14516o oVar : s) {
                    linkedHashSet.add(C14823x.m92359b(hVar.mo73898p().mo73992g(), ((C13494n) oVar).mo71359g0()));
                }
                return C13563a1.m87391j(linkedHashSet, this.this$1.mo73877u());
            }
        }

        static {
            Class<C14754b> cls = C14754b.class;
            f63823o = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "allFunctions", "getAllFunctions()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "allProperties", "getAllProperties()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public C14754b(C14752h hVar, List<C13481i> list, List<C13494n> list2, List<C13516r> list3) {
            C13706o.m87929f(list, "functionList");
            C13706o.m87929f(list2, "propertyList");
            C13706o.m87929f(list3, "typeAliasList");
            this.f63837n = hVar;
            this.f63824a = list;
            this.f63825b = list2;
            this.f63826c = !hVar.mo73898p().mo73988c().mo73965g().mo73983c() ? C13614t.m87748j() : list3;
            this.f63827d = hVar.mo73898p().mo73993h().mo80221f(new C14758d(this));
            this.f63828e = hVar.mo73898p().mo73993h().mo80221f(new C14759e(this));
            this.f63829f = hVar.mo73898p().mo73993h().mo80221f(new C14757c(this));
            this.f63830g = hVar.mo73898p().mo73993h().mo80221f(new C14755a(this));
            this.f63831h = hVar.mo73898p().mo73993h().mo80221f(new C14756b(this));
            this.f63832i = hVar.mo73898p().mo73993h().mo80221f(new C14763i(this));
            this.f63833j = hVar.mo73898p().mo73993h().mo80221f(new C14761g(this));
            this.f63834k = hVar.mo73898p().mo73993h().mo80221f(new C14762h(this));
            this.f63835l = hVar.mo73898p().mo73993h().mo80221f(new C14760f(this, hVar));
            this.f63836m = hVar.mo73898p().mo73993h().mo80221f(new C14764j(this, hVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public final List<C14156y0> m92114A() {
            return (List) C17011m.m100276a(this.f63830g, this, f63823o[3]);
        }

        /* access modifiers changed from: private */
        /* renamed from: B */
        public final List<C14140t0> m92115B() {
            return (List) C17011m.m100276a(this.f63831h, this, f63823o[4]);
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public final List<C13947d1> m92116C() {
            return (List) C17011m.m100276a(this.f63829f, this, f63823o[2]);
        }

        /* access modifiers changed from: private */
        /* renamed from: D */
        public final List<C14156y0> m92117D() {
            return (List) C17011m.m100276a(this.f63827d, this, f63823o[0]);
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public final List<C14140t0> m92118E() {
            return (List) C17011m.m100276a(this.f63828e, this, f63823o[1]);
        }

        /* renamed from: F */
        private final Map<C16157f, Collection<C14156y0>> m92119F() {
            return (Map) C17011m.m100276a(this.f63833j, this, f63823o[6]);
        }

        /* renamed from: G */
        private final Map<C16157f, Collection<C14140t0>> m92120G() {
            return (Map) C17011m.m100276a(this.f63834k, this, f63823o[7]);
        }

        /* renamed from: H */
        private final Map<C16157f, C13947d1> m92121H() {
            return (Map) C17011m.m100276a(this.f63832i, this, f63823o[5]);
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public final List<C14156y0> m92134t() {
            Set<C16157f> t = this.f63837n.mo73876t();
            ArrayList arrayList = new ArrayList();
            for (C16157f w : t) {
                boolean unused = C13624y.m87797z(arrayList, m92137w(w));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public final List<C14140t0> m92135u() {
            Set<C16157f> u = this.f63837n.mo73877u();
            ArrayList arrayList = new ArrayList();
            for (C16157f x : u) {
                boolean unused = C13624y.m87797z(arrayList, m92138x(x));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public final List<C14156y0> m92136v() {
            List<C13481i> list = this.f63824a;
            C14752h hVar = this.f63837n;
            ArrayList arrayList = new ArrayList();
            for (C14516o oVar : list) {
                C14156y0 j = hVar.mo73898p().mo73991f().mo74010j((C13481i) oVar);
                if (!hVar.mo73878x(j)) {
                    j = null;
                }
                if (j != null) {
                    arrayList.add(j);
                }
            }
            return arrayList;
        }

        /* renamed from: w */
        private final List<C14156y0> m92137w(C16157f fVar) {
            List<C14156y0> D = m92117D();
            C14752h hVar = this.f63837n;
            ArrayList arrayList = new ArrayList();
            for (T next : D) {
                if (C13706o.m87924a(((C14064m) next).getName(), fVar)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            hVar.mo73872k(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* renamed from: x */
        private final List<C14140t0> m92138x(C16157f fVar) {
            List<C14140t0> E = m92118E();
            C14752h hVar = this.f63837n;
            ArrayList arrayList = new ArrayList();
            for (T next : E) {
                if (C13706o.m87924a(((C14064m) next).getName(), fVar)) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            hVar.mo73873l(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public final List<C14140t0> m92139y() {
            List<C13494n> list = this.f63825b;
            C14752h hVar = this.f63837n;
            ArrayList arrayList = new ArrayList();
            for (C14516o oVar : list) {
                C14140t0 l = hVar.mo73898p().mo73991f().mo74011l((C13494n) oVar);
                if (l != null) {
                    arrayList.add(l);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public final List<C13947d1> m92140z() {
            List<C13516r> list = this.f63826c;
            C14752h hVar = this.f63837n;
            ArrayList arrayList = new ArrayList();
            for (C14516o oVar : list) {
                C13947d1 m = hVar.mo73898p().mo73991f().mo74012m((C13516r) oVar);
                if (m != null) {
                    arrayList.add(m);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public Set<C16157f> mo73901a() {
            return (Set) C17011m.m100276a(this.f63836m, this, f63823o[9]);
        }

        /* renamed from: b */
        public Set<C16157f> mo73902b() {
            return (Set) C17011m.m100276a(this.f63835l, this, f63823o[8]);
        }

        /* renamed from: c */
        public Collection<C14156y0> mo73903c(C16157f fVar, C12253b bVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            if (!mo73902b().contains(fVar)) {
                return C13614t.m87748j();
            }
            Collection<C14156y0> collection = m92119F().get(fVar);
            return collection == null ? C13614t.m87748j() : collection;
        }

        /* renamed from: d */
        public Collection<C14140t0> mo73904d(C16157f fVar, C12253b bVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            if (!mo73901a().contains(fVar)) {
                return C13614t.m87748j();
            }
            Collection<C14140t0> collection = m92120G().get(fVar);
            return collection == null ? C13614t.m87748j() : collection;
        }

        /* renamed from: e */
        public void mo73905e(Collection<C14064m> collection, C14683d dVar, C16265l<? super C16157f, Boolean> lVar, C12253b bVar) {
            C13706o.m87929f(collection, "result");
            C13706o.m87929f(dVar, "kindFilter");
            C13706o.m87929f(lVar, "nameFilter");
            C13706o.m87929f(bVar, "location");
            if (dVar.mo73800a(C14683d.f63687c.mo73814i())) {
                for (T next : m92115B()) {
                    C16157f name = ((C14140t0) next).getName();
                    C13706o.m87928e(name, "it.name");
                    if (lVar.invoke(name).booleanValue()) {
                        collection.add(next);
                    }
                }
            }
            if (dVar.mo73800a(C14683d.f63687c.mo73809d())) {
                for (T next2 : m92114A()) {
                    C16157f name2 = ((C14156y0) next2).getName();
                    C13706o.m87928e(name2, "it.name");
                    if (lVar.invoke(name2).booleanValue()) {
                        collection.add(next2);
                    }
                }
            }
        }

        /* renamed from: f */
        public Set<C16157f> mo73906f() {
            List<C13516r> list = this.f63826c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C14752h hVar = this.f63837n;
            for (C14516o oVar : list) {
                linkedHashSet.add(C14823x.m92359b(hVar.mo73898p().mo73992g(), ((C13516r) oVar).mo71506a0()));
            }
            return linkedHashSet;
        }

        /* renamed from: g */
        public C13947d1 mo73907g(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            return m92121H().get(fVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c */
    /* compiled from: DeserializedMemberScope.kt */
    private final class C14765c implements C14753a {

        /* renamed from: j */
        static final /* synthetic */ C16887m<Object>[] f63838j;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<C16157f, byte[]> f63839a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Map<C16157f, byte[]> f63840b;

        /* renamed from: c */
        private final Map<C16157f, byte[]> f63841c;

        /* renamed from: d */
        private final C17004g<C16157f, Collection<C14156y0>> f63842d;

        /* renamed from: e */
        private final C17004g<C16157f, Collection<C14140t0>> f63843e;

        /* renamed from: f */
        private final C17005h<C16157f, C13947d1> f63844f;

        /* renamed from: g */
        private final C17006i f63845g;

        /* renamed from: h */
        private final C17006i f63846h;

        /* renamed from: i */
        final /* synthetic */ C14752h f63847i;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$a */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14766a extends C13708q implements C16254a {
            final /* synthetic */ ByteArrayInputStream $inputStream;
            final /* synthetic */ C14519q $parser;
            final /* synthetic */ C14752h this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14766a(C14519q qVar, ByteArrayInputStream byteArrayInputStream, C14752h hVar) {
                super(0);
                this.$parser = qVar;
                this.$inputStream = byteArrayInputStream;
                this.this$0 = hVar;
            }

            /* renamed from: a */
            public final C14516o invoke() {
                return (C14516o) this.$parser.mo73287d(this.$inputStream, this.this$0.mo73898p().mo73988c().mo73968j());
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$b */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14767b extends C13708q implements C16254a<Set<? extends C16157f>> {
            final /* synthetic */ C14765c this$0;
            final /* synthetic */ C14752h this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14767b(C14765c cVar, C14752h hVar) {
                super(0);
                this.this$0 = cVar;
                this.this$1 = hVar;
            }

            /* renamed from: a */
            public final Set<C16157f> invoke() {
                return C13563a1.m87391j(this.this$0.f63839a.keySet(), this.this$1.mo73876t());
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$c */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14768c extends C13708q implements C16265l<C16157f, Collection<? extends C14156y0>> {
            final /* synthetic */ C14765c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14768c(C14765c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            /* renamed from: a */
            public final Collection<C14156y0> invoke(C16157f fVar) {
                C13706o.m87929f(fVar, "it");
                return this.this$0.m92163m(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$d */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14769d extends C13708q implements C16265l<C16157f, Collection<? extends C14140t0>> {
            final /* synthetic */ C14765c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14769d(C14765c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            /* renamed from: a */
            public final Collection<C14140t0> invoke(C16157f fVar) {
                C13706o.m87929f(fVar, "it");
                return this.this$0.m92164n(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$e */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14770e extends C13708q implements C16265l<C16157f, C13947d1> {
            final /* synthetic */ C14765c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14770e(C14765c cVar) {
                super(1);
                this.this$0 = cVar;
            }

            /* renamed from: a */
            public final C13947d1 invoke(C16157f fVar) {
                C13706o.m87929f(fVar, "it");
                return this.this$0.m92165o(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$f */
        /* compiled from: DeserializedMemberScope.kt */
        static final class C14771f extends C13708q implements C16254a<Set<? extends C16157f>> {
            final /* synthetic */ C14765c this$0;
            final /* synthetic */ C14752h this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14771f(C14765c cVar, C14752h hVar) {
                super(0);
                this.this$0 = cVar;
                this.this$1 = hVar;
            }

            /* renamed from: a */
            public final Set<C16157f> invoke() {
                return C13563a1.m87391j(this.this$0.f63840b.keySet(), this.this$1.mo73877u());
            }
        }

        static {
            Class<C14765c> cls = C14765c.class;
            f63838j = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "functionNames", "getFunctionNames()Ljava/util/Set;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public C14765c(C14752h hVar, List<C13481i> list, List<C13494n> list2, List<C13516r> list3) {
            Map<C16157f, byte[]> map;
            C13706o.m87929f(list, "functionList");
            C13706o.m87929f(list2, "propertyList");
            C13706o.m87929f(list3, "typeAliasList");
            this.f63847i = hVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T next : list) {
                C16157f b = C14823x.m92359b(hVar.mo73898p().mo73992g(), ((C13481i) ((C14516o) next)).mo71267i0());
                Object obj = linkedHashMap.get(b);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(b, obj);
                }
                ((List) obj).add(next);
            }
            this.f63839a = m92166p(linkedHashMap);
            C14752h hVar2 = this.f63847i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (T next2 : list2) {
                C16157f b2 = C14823x.m92359b(hVar2.mo73898p().mo73992g(), ((C13494n) ((C14516o) next2)).mo71359g0());
                Object obj2 = linkedHashMap2.get(b2);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(b2, obj2);
                }
                ((List) obj2).add(next2);
            }
            this.f63840b = m92166p(linkedHashMap2);
            if (this.f63847i.mo73898p().mo73988c().mo73965g().mo73983c()) {
                C14752h hVar3 = this.f63847i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (T next3 : list3) {
                    C16157f b3 = C14823x.m92359b(hVar3.mo73898p().mo73992g(), ((C13516r) ((C14516o) next3)).mo71506a0());
                    Object obj3 = linkedHashMap3.get(b3);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap3.put(b3, obj3);
                    }
                    ((List) obj3).add(next3);
                }
                map = m92166p(linkedHashMap3);
            } else {
                map = C13615t0.m87759i();
            }
            this.f63841c = map;
            this.f63842d = this.f63847i.mo73898p().mo73993h().mo80223h(new C14768c(this));
            this.f63843e = this.f63847i.mo73898p().mo73993h().mo80223h(new C14769d(this));
            this.f63844f = this.f63847i.mo73898p().mo73993h().mo80217b(new C14770e(this));
            this.f63845g = this.f63847i.mo73898p().mo73993h().mo80221f(new C14767b(this, this.f63847i));
            this.f63846h = this.f63847i.mo73898p().mo73993h().mo80221f(new C14771f(this, this.f63847i));
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
            if (r0 != null) goto L_0x002e;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C14156y0> m92163m(p362pb.C16157f r7) {
            /*
                r6 = this;
                java.util.Map<pb.f, byte[]> r0 = r6.f63839a
                kotlin.reflect.jvm.internal.impl.protobuf.q<kb.i> r1 = p308kb.C13481i.f61638c
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C13706o.m87928e(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h r2 = r6.f63847i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h r3 = r6.f63847i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.h r0 = kotlin.sequences.C15125n.m93474i(r0)
                java.util.List r0 = kotlin.sequences.C15132p.m93480D(r0)
                if (r0 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                java.util.List r0 = kotlin.collections.C13614t.m87748j()
            L_0x002e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x003b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0066
                java.lang.Object r3 = r0.next()
                kb.i r3 = (p308kb.C13481i) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r2.mo73898p()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.w r4 = r4.mo73991f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C13706o.m87928e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.y0 r3 = r4.mo74010j(r3)
                boolean r4 = r2.mo73878x(r3)
                if (r4 == 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r3 = 0
            L_0x0060:
                if (r3 == 0) goto L_0x003b
                r1.add(r3)
                goto L_0x003b
            L_0x0066:
                r2.mo73872k(r7, r1)
                java.util.List r7 = p272gc.C12338a.m83073c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14752h.C14765c.m92163m(pb.f):java.util.Collection");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
            if (r0 != null) goto L_0x002e;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C14140t0> m92164n(p362pb.C16157f r7) {
            /*
                r6 = this;
                java.util.Map<pb.f, byte[]> r0 = r6.f63840b
                kotlin.reflect.jvm.internal.impl.protobuf.q<kb.n> r1 = p308kb.C13494n.f61682c
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.C13706o.m87928e(r1, r2)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h r2 = r6.f63847i
                java.lang.Object r0 = r0.get(r7)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L_0x002a
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h r3 = r6.f63847i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$a r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$c$a
                r0.<init>(r1, r4, r3)
                kotlin.sequences.h r0 = kotlin.sequences.C15125n.m93474i(r0)
                java.util.List r0 = kotlin.sequences.C15132p.m93480D(r0)
                if (r0 == 0) goto L_0x002a
                goto L_0x002e
            L_0x002a:
                java.util.List r0 = kotlin.collections.C13614t.m87748j()
            L_0x002e:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r0.size()
                r1.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L_0x003b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x005e
                java.lang.Object r3 = r0.next()
                kb.n r3 = (p308kb.C13494n) r3
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r2.mo73898p()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.w r4 = r4.mo73991f()
                java.lang.String r5 = "it"
                kotlin.jvm.internal.C13706o.m87928e(r3, r5)
                kotlin.reflect.jvm.internal.impl.descriptors.t0 r3 = r4.mo74011l(r3)
                if (r3 == 0) goto L_0x003b
                r1.add(r3)
                goto L_0x003b
            L_0x005e:
                r2.mo73873l(r7, r1)
                java.util.List r7 = p272gc.C12338a.m83073c(r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14752h.C14765c.m92164n(pb.f):java.util.Collection");
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final C13947d1 m92165o(C16157f fVar) {
            C13516r u0;
            byte[] bArr = this.f63841c.get(fVar);
            if (bArr == null || (u0 = C13516r.m87042u0(new ByteArrayInputStream(bArr), this.f63847i.mo73898p().mo73988c().mo73968j())) == null) {
                return null;
            }
            return this.f63847i.mo73898p().mo73991f().mo74012m(u0);
        }

        /* renamed from: p */
        private final Map<C16157f, byte[]> m92166p(Map<C16157f, ? extends Collection<? extends C14478a>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C13613s0.m87740e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<C14478a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C13616u.m87774u(iterable, 10));
                for (C14478a i : iterable) {
                    i.mo73280i(byteArrayOutputStream);
                    arrayList.add(C13339u.f61331a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }

        /* renamed from: a */
        public Set<C16157f> mo73901a() {
            return (Set) C17011m.m100276a(this.f63846h, this, f63838j[1]);
        }

        /* renamed from: b */
        public Set<C16157f> mo73902b() {
            return (Set) C17011m.m100276a(this.f63845g, this, f63838j[0]);
        }

        /* renamed from: c */
        public Collection<C14156y0> mo73903c(C16157f fVar, C12253b bVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            if (!mo73902b().contains(fVar)) {
                return C13614t.m87748j();
            }
            return this.f63842d.invoke(fVar);
        }

        /* renamed from: d */
        public Collection<C14140t0> mo73904d(C16157f fVar, C12253b bVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            if (!mo73901a().contains(fVar)) {
                return C13614t.m87748j();
            }
            return this.f63843e.invoke(fVar);
        }

        /* renamed from: e */
        public void mo73905e(Collection<C14064m> collection, C14683d dVar, C16265l<? super C16157f, Boolean> lVar, C12253b bVar) {
            C13706o.m87929f(collection, "result");
            C13706o.m87929f(dVar, "kindFilter");
            C13706o.m87929f(lVar, "nameFilter");
            C13706o.m87929f(bVar, "location");
            if (dVar.mo73800a(C14683d.f63687c.mo73814i())) {
                Set<C16157f> a = mo73901a();
                ArrayList arrayList = new ArrayList();
                for (C16157f next : a) {
                    if (lVar.invoke(next).booleanValue()) {
                        arrayList.addAll(mo73904d(next, bVar));
                    }
                }
                C14655g gVar = C14655g.f63652a;
                C13706o.m87928e(gVar, "INSTANCE");
                C13622x.m87781y(arrayList, gVar);
                collection.addAll(arrayList);
            }
            if (dVar.mo73800a(C14683d.f63687c.mo73809d())) {
                Set<C16157f> b = mo73902b();
                ArrayList arrayList2 = new ArrayList();
                for (C16157f next2 : b) {
                    if (lVar.invoke(next2).booleanValue()) {
                        arrayList2.addAll(mo73903c(next2, bVar));
                    }
                }
                C14655g gVar2 = C14655g.f63652a;
                C13706o.m87928e(gVar2, "INSTANCE");
                C13622x.m87781y(arrayList2, gVar2);
                collection.addAll(arrayList2);
            }
        }

        /* renamed from: f */
        public Set<C16157f> mo73906f() {
            return this.f63841c.keySet();
        }

        /* renamed from: g */
        public C13947d1 mo73907g(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            return this.f63844f.invoke(fVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$d */
    /* compiled from: DeserializedMemberScope.kt */
    static final class C14772d extends C13708q implements C16254a<Set<? extends C16157f>> {
        final /* synthetic */ C16254a<Collection<C16157f>> $classNames;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14772d(C16254a<? extends Collection<C16157f>> aVar) {
            super(0);
            this.$classNames = aVar;
        }

        /* renamed from: a */
        public final Set<C16157f> invoke() {
            return C13566b0.m87407K0(this.$classNames.invoke());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h$e */
    /* compiled from: DeserializedMemberScope.kt */
    static final class C14773e extends C13708q implements C16254a<Set<? extends C16157f>> {
        final /* synthetic */ C14752h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14773e(C14752h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* renamed from: a */
        public final Set<C16157f> invoke() {
            Set<C16157f> s = this.this$0.mo73875s();
            if (s == null) {
                return null;
            }
            return C13563a1.m87391j(C13563a1.m87391j(this.this$0.mo73899q(), this.this$0.f63820c.mo73906f()), s);
        }
    }

    static {
        Class<C14752h> cls = C14752h.class;
        f63818f = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    protected C14752h(C14798m mVar, List<C13481i> list, List<C13494n> list2, List<C13516r> list3, C16254a<? extends Collection<C16157f>> aVar) {
        C13706o.m87929f(mVar, "c");
        C13706o.m87929f(list, "functionList");
        C13706o.m87929f(list2, "propertyList");
        C13706o.m87929f(list3, "typeAliasList");
        C13706o.m87929f(aVar, "classNames");
        this.f63819b = mVar;
        this.f63820c = m92085n(list, list2, list3);
        this.f63821d = mVar.mo73993h().mo80221f(new C14772d(aVar));
        this.f63822e = mVar.mo73993h().mo80219d(new C14773e(this));
    }

    /* renamed from: n */
    private final C14753a m92085n(List<C13481i> list, List<C13494n> list2, List<C13516r> list3) {
        if (this.f63819b.mo73988c().mo73965g().mo73981a()) {
            return new C14754b(this, list, list2, list3);
        }
        return new C14765c(this, list, list2, list3);
    }

    /* renamed from: o */
    private final C13948e m92086o(C16157f fVar) {
        return this.f63819b.mo73988c().mo73960b(mo73874m(fVar));
    }

    /* renamed from: r */
    private final Set<C16157f> m92087r() {
        return (Set) C17011m.m100277b(this.f63822e, this, f63818f[1]);
    }

    /* renamed from: v */
    private final C13947d1 m92088v(C16157f fVar) {
        return this.f63820c.mo73907g(fVar);
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        return this.f63820c.mo73901a();
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        return this.f63820c.mo73902b();
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return this.f63820c.mo73903c(fVar, bVar);
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return this.f63820c.mo73904d(fVar, bVar);
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        if (mo73900w(fVar)) {
            return m92086o(fVar);
        }
        if (this.f63820c.mo73906f().contains(fVar)) {
            return m92088v(fVar);
        }
        return null;
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return m92087r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo73871i(Collection<C14064m> collection, C16265l<? super C16157f, Boolean> lVar);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Collection<C14064m> mo73897j(C14683d dVar, C16265l<? super C16157f, Boolean> lVar, C12253b bVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        C13706o.m87929f(bVar, "location");
        ArrayList arrayList = new ArrayList(0);
        C14683d.C14684a aVar = C14683d.f63687c;
        if (dVar.mo73800a(aVar.mo73812g())) {
            mo73871i(arrayList, lVar);
        }
        this.f63820c.mo73905e(arrayList, dVar, lVar, bVar);
        if (dVar.mo73800a(aVar.mo73808c())) {
            for (C16157f next : mo73899q()) {
                if (lVar.invoke(next).booleanValue()) {
                    C12338a.m83071a(arrayList, m92086o(next));
                }
            }
        }
        if (dVar.mo73800a(C14683d.f63687c.mo73813h())) {
            for (C16157f next2 : this.f63820c.mo73906f()) {
                if (lVar.invoke(next2).booleanValue()) {
                    C12338a.m83071a(arrayList, this.f63820c.mo73907g(next2));
                }
            }
        }
        return C12338a.m83073c(arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo73872k(C16157f fVar, List<C14156y0> list) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(list, "functions");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo73873l(C16157f fVar, List<C14140t0> list) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(list, "descriptors");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C16151b mo73874m(C16157f fVar);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C14798m mo73898p() {
        return this.f63819b;
    }

    /* renamed from: q */
    public final Set<C16157f> mo73899q() {
        return (Set) C17011m.m100276a(this.f63821d, this, f63818f[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract Set<C16157f> mo73875s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract Set<C16157f> mo73876t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract Set<C16157f> mo73877u();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo73900w(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return mo73899q().contains(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo73878x(C14156y0 y0Var) {
        C13706o.m87929f(y0Var, "function");
        return true;
    }
}
