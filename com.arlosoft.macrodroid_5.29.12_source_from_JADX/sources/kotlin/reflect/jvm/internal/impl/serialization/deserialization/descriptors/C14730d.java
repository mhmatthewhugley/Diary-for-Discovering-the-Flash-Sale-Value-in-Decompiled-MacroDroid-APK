package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13953f1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13962h0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14043j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14143v;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14150x0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14157z;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13967a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13991f;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13992f0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14012n;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14020p;
import kotlin.reflect.jvm.internal.impl.resolve.C14595a;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.resolve.C14656h;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14696i;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14698k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14700l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14711a0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14714b0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14720d0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14798m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14814w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14823x;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14825z;
import kotlin.reflect.jvm.internal.impl.types.C14832b;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p252eb.C12186a;
import p263fb.C12253b;
import p263fb.C12256d;
import p297ja.C13328m;
import p297ja.C13337s;
import p297ja.C13339u;
import p308kb.C13455c;
import p308kb.C13460d;
import p308kb.C13473g;
import p308kb.C13481i;
import p308kb.C13494n;
import p308kb.C13508q;
import p308kb.C13519s;
import p308kb.C13524t;
import p308kb.C13537w;
import p327mb.C15712a;
import p327mb.C15714b;
import p327mb.C15719c;
import p327mb.C15723f;
import p327mb.C15724g;
import p327mb.C15725h;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p416vb.C16752b;
import p416vb.C16756f;
import p433xa.C16878g;
import p442yb.C17005h;
import p442yb.C17006i;
import p442yb.C17007j;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d */
/* compiled from: DeserializedClassDescriptor.kt */
public final class C14730d extends C13967a implements C14064m {

    /* renamed from: A */
    private final C13945d0 f63783A;

    /* renamed from: B */
    private final C14141u f63784B;

    /* renamed from: C */
    private final C13951f f63785C;

    /* renamed from: D */
    private final C14798m f63786D;

    /* renamed from: E */
    private final C14696i f63787E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C14736b f63788F;

    /* renamed from: G */
    private final C14150x0<C14731a> f63789G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C14738c f63790H;

    /* renamed from: I */
    private final C14064m f63791I;

    /* renamed from: J */
    private final C17007j<C13944d> f63792J;

    /* renamed from: K */
    private final C17006i<Collection<C13944d>> f63793K;

    /* renamed from: L */
    private final C17007j<C13948e> f63794L;

    /* renamed from: M */
    private final C17006i<Collection<C13948e>> f63795M;

    /* renamed from: N */
    private final C17007j<C13960g1<C14951m0>> f63796N;

    /* renamed from: O */
    private final C14825z.C14826a f63797O;

    /* renamed from: P */
    private final C13921g f63798P;

    /* renamed from: o */
    private final C13455c f63799o;

    /* renamed from: p */
    private final C15712a f63800p;

    /* renamed from: s */
    private final C14158z0 f63801s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C16151b f63802z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a */
    /* compiled from: DeserializedClassDescriptor.kt */
    private final class C14731a extends C14752h {
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C14849g f63803g;

        /* renamed from: h */
        private final C17006i<Collection<C14064m>> f63804h;

        /* renamed from: i */
        private final C17006i<Collection<C14900e0>> f63805i;

        /* renamed from: j */
        final /* synthetic */ C14730d f63806j;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$a */
        /* compiled from: DeserializedClassDescriptor.kt */
        static final class C14732a extends C13708q implements C16254a<List<? extends C16157f>> {
            final /* synthetic */ List<C16157f> $it;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14732a(List<C16157f> list) {
                super(0);
                this.$it = list;
            }

            /* renamed from: a */
            public final List<C16157f> invoke() {
                return this.$it;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$b */
        /* compiled from: DeserializedClassDescriptor.kt */
        static final class C14733b extends C13708q implements C16254a<Collection<? extends C14064m>> {
            final /* synthetic */ C14731a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14733b(C14731a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final Collection<C14064m> invoke() {
                return this.this$0.mo73897j(C14683d.f63699o, C14692h.f63722a.mo73822a(), C12256d.WHEN_GET_ALL_DESCRIPTORS);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$c */
        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class C14734c extends C14656h {

            /* renamed from: a */
            final /* synthetic */ List<D> f63807a;

            C14734c(List<D> list) {
                this.f63807a = list;
            }

            /* renamed from: a */
            public void mo72455a(C13936b bVar) {
                C13706o.m87929f(bVar, "fakeOverride");
                C14658j.m91664K(bVar, (C16265l<C13936b, C13339u>) null);
                this.f63807a.add(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public void mo72456e(C13936b bVar, C13936b bVar2) {
                C13706o.m87929f(bVar, "fromSuper");
                C13706o.m87929f(bVar2, "fromCurrent");
                if (bVar2 instanceof C14020p) {
                    ((C14020p) bVar2).mo72460U0(C14143v.f62767a, bVar);
                }
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$d */
        /* compiled from: DeserializedClassDescriptor.kt */
        static final class C14735d extends C13708q implements C16254a<Collection<? extends C14900e0>> {
            final /* synthetic */ C14731a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14735d(C14731a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* renamed from: a */
            public final Collection<C14900e0> invoke() {
                return this.this$0.f63803g.mo74069g(this.this$0.m92034B());
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C14731a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d r8, kotlin.reflect.jvm.internal.impl.types.checker.C14849g r9) {
            /*
                r7 = this;
                java.lang.String r0 = "kotlinTypeRefiner"
                kotlin.jvm.internal.C13706o.m87929f(r9, r0)
                r7.f63806j = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r8.mo73863a1()
                kb.c r0 = r8.mo73864b1()
                java.util.List r3 = r0.mo71108O0()
                java.lang.String r0 = "classProto.functionList"
                kotlin.jvm.internal.C13706o.m87928e(r3, r0)
                kb.c r0 = r8.mo73864b1()
                java.util.List r4 = r0.mo71122c1()
                java.lang.String r0 = "classProto.propertyList"
                kotlin.jvm.internal.C13706o.m87928e(r4, r0)
                kb.c r0 = r8.mo73864b1()
                java.util.List r5 = r0.mo71131k1()
                java.lang.String r0 = "classProto.typeAliasList"
                kotlin.jvm.internal.C13706o.m87928e(r5, r0)
                kb.c r0 = r8.mo73864b1()
                java.util.List r0 = r0.mo71119Z0()
                java.lang.String r1 = "classProto.nestedClassNameList"
                kotlin.jvm.internal.C13706o.m87928e(r0, r1)
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r8.mo73863a1()
                mb.c r8 = r8.mo73992g()
                java.util.ArrayList r1 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.C13616u.m87774u(r0, r6)
                r1.<init>(r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x0056:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x006e
                java.lang.Object r6 = r0.next()
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                pb.f r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14823x.m92359b(r8, r6)
                r1.add(r6)
                goto L_0x0056
            L_0x006e:
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$a r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$a
                r6.<init>(r1)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f63803g = r9
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r7.mo73898p()
                yb.n r8 = r8.mo73993h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$b r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$b
                r9.<init>(r7)
                yb.i r8 = r8.mo80221f(r9)
                r7.f63804h = r8
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r8 = r7.mo73898p()
                yb.n r8 = r8.mo73993h()
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$d r9 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a$d
                r9.<init>(r7)
                yb.i r8 = r8.mo80221f(r9)
                r7.f63805i = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d.C14731a.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d, kotlin.reflect.jvm.internal.impl.types.checker.g):void");
        }

        /* renamed from: A */
        private final <D extends C13936b> void m92033A(C16157f fVar, Collection<? extends D> collection, List<D> list) {
            C16157f fVar2 = fVar;
            Collection<? extends D> collection2 = collection;
            mo73898p().mo73988c().mo73971m().mo74089a().mo73771v(fVar2, collection2, new ArrayList(list), m92034B(), new C14734c(list));
        }

        /* access modifiers changed from: private */
        /* renamed from: B */
        public final C14730d m92034B() {
            return this.f63806j;
        }

        /* renamed from: C */
        public void mo73870C(C16157f fVar, C12253b bVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            C12186a.m82847a(mo73898p().mo73988c().mo73973o(), bVar, m92034B(), fVar);
        }

        /* renamed from: c */
        public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            mo73870C(fVar, bVar);
            return super.mo72450c(fVar, bVar);
        }

        /* renamed from: d */
        public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            mo73870C(fVar, bVar);
            return super.mo72451d(fVar, bVar);
        }

        /* renamed from: e */
        public C13961h mo72800e(C16157f fVar, C12253b bVar) {
            C13948e f;
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(bVar, "location");
            mo73870C(fVar, bVar);
            C14738c Q0 = m92034B().f63790H;
            if (Q0 == null || (f = Q0.mo73886f(fVar)) == null) {
                return super.mo72800e(fVar, bVar);
            }
            return f;
        }

        /* renamed from: g */
        public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
            C13706o.m87929f(dVar, "kindFilter");
            C13706o.m87929f(lVar, "nameFilter");
            return (Collection) this.f63804h.invoke();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo73871i(Collection<C14064m> collection, C16265l<? super C16157f, Boolean> lVar) {
            C13706o.m87929f(collection, "result");
            C13706o.m87929f(lVar, "nameFilter");
            C14738c Q0 = m92034B().f63790H;
            Collection d = Q0 != null ? Q0.mo73885d() : null;
            if (d == null) {
                d = C13614t.m87748j();
            }
            collection.addAll(d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo73872k(C16157f fVar, List<C14156y0> list) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(list, "functions");
            ArrayList arrayList = new ArrayList();
            for (C14900e0 n : (Collection) this.f63805i.invoke()) {
                arrayList.addAll(n.mo72955n().mo72450c(fVar, C12256d.FOR_ALREADY_TRACKED));
            }
            list.addAll(mo73898p().mo73988c().mo73961c().mo62249b(fVar, this.f63806j));
            m92033A(fVar, arrayList, list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public void mo73873l(C16157f fVar, List<C14140t0> list) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            for (C14900e0 n : (Collection) this.f63805i.invoke()) {
                arrayList.addAll(n.mo72955n().mo72451d(fVar, C12256d.FOR_ALREADY_TRACKED));
            }
            m92033A(fVar, arrayList, list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public C16151b mo73874m(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            C16151b d = this.f63806j.f63802z.mo78546d(fVar);
            C13706o.m87928e(d, "classId.createNestedClassId(name)");
            return d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public Set<C16157f> mo73875s() {
            List<C14900e0> q = m92034B().f63788F.mo72370l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C14900e0 n : q) {
                Set<C16157f> f = n.mo72955n().mo72404f();
                if (f == null) {
                    return null;
                }
                boolean unused = C13624y.m87797z(linkedHashSet, f);
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public Set<C16157f> mo73876t() {
            List<C14900e0> q = m92034B().f63788F.mo72370l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C14900e0 n : q) {
                boolean unused = C13624y.m87797z(linkedHashSet, n.mo72955n().mo72449b());
            }
            linkedHashSet.addAll(mo73898p().mo73988c().mo73961c().mo62252e(this.f63806j));
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public Set<C16157f> mo73877u() {
            List<C14900e0> q = m92034B().f63788F.mo72370l();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C14900e0 n : q) {
                boolean unused = C13624y.m87797z(linkedHashSet, n.mo72955n().mo72448a());
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public boolean mo73878x(C14156y0 y0Var) {
            C13706o.m87929f(y0Var, "function");
            return mo73898p().mo73988c().mo73977s().mo62253a(this.f63806j, y0Var);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$b */
    /* compiled from: DeserializedClassDescriptor.kt */
    private final class C14736b extends C14832b {

        /* renamed from: d */
        private final C17006i<List<C13950e1>> f63808d;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$b$a */
        /* compiled from: DeserializedClassDescriptor.kt */
        static final class C14737a extends C13708q implements C16254a<List<? extends C13950e1>> {
            final /* synthetic */ C14730d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14737a(C14730d dVar) {
                super(0);
                this.this$0 = dVar;
            }

            /* renamed from: a */
            public final List<C13950e1> invoke() {
                return C13953f1.m88588d(this.this$0);
            }
        }

        public C14736b() {
            super(C14730d.this.mo73863a1().mo73993h());
            this.f63808d = C14730d.this.mo73863a1().mo73993h().mo80221f(new C14737a(C14730d.this));
        }

        /* renamed from: d */
        public boolean mo62184d() {
            return true;
        }

        public List<C13950e1> getParameters() {
            return (List) this.f63808d.invoke();
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public Collection<C14900e0> mo62186j() {
            String str;
            C16152c b;
            List<C13508q> l = C15723f.m95039l(C14730d.this.mo73864b1(), C14730d.this.mo73863a1().mo73995j());
            C14730d dVar = C14730d.this;
            ArrayList arrayList = new ArrayList(C13616u.m87774u(l, 10));
            for (C13508q q : l) {
                arrayList.add(dVar.mo73863a1().mo73994i().mo73847q(q));
            }
            List<C14900e0> q0 = C13566b0.m87442q0(arrayList, C14730d.this.mo73863a1().mo73988c().mo73961c().mo62251d(C14730d.this));
            ArrayList<C14043j0.C14045b> arrayList2 = new ArrayList<>();
            for (C14900e0 N0 : q0) {
                C13961h c = N0.mo73702N0().mo62183c();
                C14043j0.C14045b bVar = c instanceof C14043j0.C14045b ? (C14043j0.C14045b) c : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                C14806r i = C14730d.this.mo73863a1().mo73988c().mo73967i();
                C14730d dVar2 = C14730d.this;
                ArrayList arrayList3 = new ArrayList(C13616u.m87774u(arrayList2, 10));
                for (C14043j0.C14045b bVar2 : arrayList2) {
                    C16151b g = C16519a.m98614g(bVar2);
                    if (g == null || (b = g.mo78544b()) == null || (str = b.mo78556b()) == null) {
                        str = bVar2.getName().mo78583d();
                    }
                    arrayList3.add(str);
                }
                i.mo67440b(dVar2, arrayList3);
            }
            return C13566b0.m87402F0(q0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public C13942c1 mo62187p() {
            return C13942c1.C13943a.f62415a;
        }

        public String toString() {
            String fVar = C14730d.this.getName().toString();
            C13706o.m87928e(fVar, "name.toString()");
            return fVar;
        }

        /* renamed from: w */
        public C14730d mo62189v() {
            return C14730d.this;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$c */
    /* compiled from: DeserializedClassDescriptor.kt */
    private final class C14738c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<C16157f, C13473g> f63810a;

        /* renamed from: b */
        private final C17005h<C16157f, C13948e> f63811b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C17006i<Set<C16157f>> f63812c;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$c$a */
        /* compiled from: DeserializedClassDescriptor.kt */
        static final class C14739a extends C13708q implements C16265l<C16157f, C13948e> {
            final /* synthetic */ C14738c this$0;
            final /* synthetic */ C14730d this$1;

            /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$c$a$a */
            /* compiled from: DeserializedClassDescriptor.kt */
            static final class C14740a extends C13708q implements C16254a<List<? extends C13915c>> {
                final /* synthetic */ C13473g $proto;
                final /* synthetic */ C14730d this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C14740a(C14730d dVar, C13473g gVar) {
                    super(0);
                    this.this$0 = dVar;
                    this.$proto = gVar;
                }

                /* renamed from: a */
                public final List<C13915c> invoke() {
                    return C13566b0.m87402F0(this.this$0.mo73863a1().mo73988c().mo73962d().mo73137f(this.this$0.mo73867f1(), this.$proto));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14739a(C14738c cVar, C14730d dVar) {
                super(1);
                this.this$0 = cVar;
                this.this$1 = dVar;
            }

            /* renamed from: a */
            public final C13948e invoke(C16157f fVar) {
                C13706o.m87929f(fVar, "name");
                C13473g gVar = (C13473g) this.this$0.f63810a.get(fVar);
                if (gVar == null) {
                    return null;
                }
                C14730d dVar = this.this$1;
                C14738c cVar = this.this$0;
                return C14012n.m89002L0(dVar.mo73863a1().mo73993h(), dVar, fVar, cVar.f63812c, new C14727a(dVar.mo73863a1().mo73993h(), new C14740a(dVar, gVar)), C14158z0.f62778a);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$c$b */
        /* compiled from: DeserializedClassDescriptor.kt */
        static final class C14741b extends C13708q implements C16254a<Set<? extends C16157f>> {
            final /* synthetic */ C14738c this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14741b(C14738c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* renamed from: a */
            public final Set<C16157f> invoke() {
                return this.this$0.m92065e();
            }
        }

        public C14738c() {
            List<C13473g> J0 = C14730d.this.mo73864b1().mo71103J0();
            C13706o.m87928e(J0, "classProto.enumEntryList");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(J0, 10)), 16));
            for (T next : J0) {
                linkedHashMap.put(C14823x.m92359b(C14730d.this.mo73863a1().mo73992g(), ((C13473g) next).mo71212H()), next);
            }
            this.f63810a = linkedHashMap;
            this.f63811b = C14730d.this.mo73863a1().mo73993h().mo80217b(new C14739a(this, C14730d.this));
            this.f63812c = C14730d.this.mo73863a1().mo73993h().mo80221f(new C14741b(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final Set<C16157f> m92065e() {
            HashSet hashSet = new HashSet();
            for (C14900e0 n : C14730d.this.mo62171j().mo72370l()) {
                for (C14064m mVar : C14698k.C14699a.m91887a(n.mo72955n(), (C14683d) null, (C16265l) null, 3, (Object) null)) {
                    if ((mVar instanceof C14156y0) || (mVar instanceof C14140t0)) {
                        hashSet.add(mVar.getName());
                    }
                }
            }
            List<C13481i> O0 = C14730d.this.mo73864b1().mo71108O0();
            C13706o.m87928e(O0, "classProto.functionList");
            C14730d dVar = C14730d.this;
            for (C13481i i0 : O0) {
                hashSet.add(C14823x.m92359b(dVar.mo73863a1().mo73992g(), i0.mo71267i0()));
            }
            List<C13494n> c1 = C14730d.this.mo73864b1().mo71122c1();
            C13706o.m87928e(c1, "classProto.propertyList");
            C14730d dVar2 = C14730d.this;
            for (C13494n g0 : c1) {
                hashSet.add(C14823x.m92359b(dVar2.mo73863a1().mo73992g(), g0.mo71359g0()));
            }
            return C13563a1.m87391j(hashSet, hashSet);
        }

        /* renamed from: d */
        public final Collection<C13948e> mo73885d() {
            Set<C16157f> keySet = this.f63810a.keySet();
            ArrayList arrayList = new ArrayList();
            for (C16157f f : keySet) {
                C13948e f2 = mo73886f(f);
                if (f2 != null) {
                    arrayList.add(f2);
                }
            }
            return arrayList;
        }

        /* renamed from: f */
        public final C13948e mo73886f(C16157f fVar) {
            C13706o.m87929f(fVar, "name");
            return this.f63811b.invoke(fVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$d */
    /* compiled from: DeserializedClassDescriptor.kt */
    static final class C14742d extends C13708q implements C16254a<List<? extends C13915c>> {
        final /* synthetic */ C14730d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14742d(C14730d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final List<C13915c> invoke() {
            return C13566b0.m87402F0(this.this$0.mo73863a1().mo73988c().mo73962d().mo73135c(this.this$0.mo73867f1()));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$e */
    /* compiled from: DeserializedClassDescriptor.kt */
    static final class C14743e extends C13708q implements C16254a<C13948e> {
        final /* synthetic */ C14730d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14743e(C14730d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final C13948e invoke() {
            return this.this$0.m91998S0();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$f */
    /* compiled from: DeserializedClassDescriptor.kt */
    static final class C14744f extends C13708q implements C16254a<Collection<? extends C13944d>> {
        final /* synthetic */ C14730d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14744f(C14730d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final Collection<C13944d> invoke() {
            return this.this$0.m91999T0();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$g */
    /* compiled from: DeserializedClassDescriptor.kt */
    /* synthetic */ class C14745g extends C13703l implements C16265l<C14849g, C14731a> {
        C14745g(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "<init>";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14731a.class);
        }

        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }

        /* renamed from: l */
        public final C14731a invoke(C14849g gVar) {
            C13706o.m87929f(gVar, "p0");
            return new C14731a((C14730d) this.receiver, gVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$h */
    /* compiled from: DeserializedClassDescriptor.kt */
    static final class C14746h extends C13708q implements C16254a<C13944d> {
        final /* synthetic */ C14730d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14746h(C14730d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final C13944d invoke() {
            return this.this$0.m92002W0();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$i */
    /* compiled from: DeserializedClassDescriptor.kt */
    static final class C14747i extends C13708q implements C16254a<Collection<? extends C13948e>> {
        final /* synthetic */ C14730d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14747i(C14730d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final Collection<C13948e> invoke() {
            return this.this$0.m92004Y0();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$j */
    /* compiled from: DeserializedClassDescriptor.kt */
    static final class C14748j extends C13708q implements C16254a<C13960g1<C14951m0>> {
        final /* synthetic */ C14730d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14748j(C14730d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final C13960g1<C14951m0> invoke() {
            return this.this$0.m92005Z0();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14730d(C14798m mVar, C13455c cVar, C15719c cVar2, C15712a aVar, C14158z0 z0Var) {
        super(mVar.mo73993h(), C14823x.m92358a(cVar2, cVar.mo71105L0()).mo78552j());
        C13921g gVar;
        C13706o.m87929f(mVar, "outerContext");
        C13706o.m87929f(cVar, "classProto");
        C13706o.m87929f(cVar2, "nameResolver");
        C13706o.m87929f(aVar, "metadataVersion");
        C13706o.m87929f(z0Var, "sourceElement");
        this.f63799o = cVar;
        this.f63800p = aVar;
        this.f63801s = z0Var;
        this.f63802z = C14823x.m92358a(cVar2, cVar.mo71105L0());
        C14711a0 a0Var = C14711a0.f63745a;
        this.f63783A = a0Var.mo73840b(C15714b.f65044e.mo75157d(cVar.mo71104K0()));
        this.f63784B = C14714b0.m91934a(a0Var, C15714b.f65043d.mo75157d(cVar.mo71104K0()));
        C13951f a = a0Var.mo73839a(C15714b.f65045f.mo75157d(cVar.mo71104K0()));
        this.f63785C = a;
        List<C13519s> n1 = cVar.mo71134n1();
        C13706o.m87928e(n1, "classProto.typeParameterList");
        C13524t o1 = cVar.mo71135o1();
        C13706o.m87928e(o1, "classProto.typeTable");
        C15724g gVar2 = new C15724g(o1);
        C15725h.C15726a aVar2 = C15725h.f65073b;
        C13537w q1 = cVar.mo71137q1();
        C13706o.m87928e(q1, "classProto.versionRequirementTable");
        C14798m a2 = mVar.mo73987a(this, n1, cVar2, gVar2, aVar2.mo75167a(q1), aVar);
        this.f63786D = a2;
        C13951f fVar = C13951f.ENUM_CLASS;
        this.f63787E = a == fVar ? new C14700l(a2.mo73993h(), this) : C14692h.C14695b.f63726b;
        this.f63788F = new C14736b();
        this.f63789G = C14150x0.f62770e.mo72665a(this, a2.mo73993h(), a2.mo73988c().mo73971m().mo74090c(), new C14745g(this));
        C14825z.C14826a aVar3 = null;
        this.f63790H = a == fVar ? new C14738c() : null;
        C14064m e = mVar.mo73990e();
        this.f63791I = e;
        this.f63792J = a2.mo73993h().mo80219d(new C14746h(this));
        this.f63793K = a2.mo73993h().mo80221f(new C14744f(this));
        this.f63794L = a2.mo73993h().mo80219d(new C14743e(this));
        this.f63795M = a2.mo73993h().mo80221f(new C14747i(this));
        this.f63796N = a2.mo73993h().mo80219d(new C14748j(this));
        C15719c g = a2.mo73992g();
        C15724g j = a2.mo73995j();
        C14730d dVar = e instanceof C14730d ? (C14730d) e : null;
        this.f63797O = new C14825z.C14826a(cVar, g, j, z0Var, dVar != null ? dVar.f63797O : aVar3);
        if (!C15714b.f65042c.mo75157d(cVar.mo71104K0()).booleanValue()) {
            gVar = C13921g.f62330v.mo72251b();
        } else {
            gVar = new C14780n(a2.mo73993h(), new C14742d(this));
        }
        this.f63798P = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: S0 */
    public final C13948e m91998S0() {
        if (!this.f63799o.mo71138r1()) {
            return null;
        }
        C13961h e = m92006c1().mo72800e(C14823x.m92359b(this.f63786D.mo73992g(), this.f63799o.mo71144x0()), C12256d.FROM_DESERIALIZATION);
        if (e instanceof C13948e) {
            return (C13948e) e;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public final Collection<C13944d> m91999T0() {
        return C13566b0.m87442q0(C13566b0.m87442q0(m92003X0(), C13614t.m87752n(mo62149D())), this.f63786D.mo73988c().mo73961c().mo62250c(this));
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.e0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: U0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.descriptors.C14157z<kotlin.reflect.jvm.internal.impl.types.C14951m0> m92000U0() {
        /*
            r9 = this;
            boolean r0 = r9.isInline()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            boolean r0 = r9.mo62172j0()
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = r9.mo62172j0()
            if (r0 == 0) goto L_0x0035
            kb.c r0 = r9.f63799o
            boolean r0 = r0.mo71141u1()
            if (r0 != 0) goto L_0x0035
            kb.c r0 = r9.f63799o
            boolean r0 = r0.mo71142v1()
            if (r0 != 0) goto L_0x0035
            kb.c r0 = r9.f63799o
            boolean r0 = r0.mo71143w1()
            if (r0 != 0) goto L_0x0035
            kb.c r0 = r9.f63799o
            int r0 = r0.mo71112S0()
            if (r0 <= 0) goto L_0x0035
            return r1
        L_0x0035:
            kb.c r0 = r9.f63799o
            boolean r0 = r0.mo71141u1()
            r2 = 1
            if (r0 == 0) goto L_0x004f
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r9.f63786D
            mb.c r0 = r0.mo73992g()
            kb.c r3 = r9.f63799o
            int r3 = r3.mo71109P0()
            pb.f r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14823x.m92359b(r0, r3)
            goto L_0x0076
        L_0x004f:
            mb.a r0 = r9.f63800p
            r3 = 5
            boolean r0 = r0.mo75149c(r2, r3, r2)
            if (r0 != 0) goto L_0x0110
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r9.mo62149D()
            if (r0 == 0) goto L_0x00f5
            java.util.List r0 = r0.mo72235g()
            java.lang.String r3 = "constructor.valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            java.lang.Object r0 = kotlin.collections.C13566b0.m87422W(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r0
            pb.f r0 = r0.getName()
            java.lang.String r3 = "{\n                // Bef…irst().name\n            }"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
        L_0x0076:
            kb.c r3 = r9.f63799o
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r9.f63786D
            mb.g r4 = r4.mo73995j()
            kb.q r3 = p327mb.C15723f.m95033f(r3, r4)
            r4 = 0
            if (r3 == 0) goto L_0x0092
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r5 = r9.f63786D
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0 r5 = r5.mo73994i()
            r6 = 2
            kotlin.reflect.jvm.internal.impl.types.m0 r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14720d0.m91962n(r5, r3, r4, r6, r1)
            if (r3 != 0) goto L_0x00d4
        L_0x0092:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d$a r3 = r9.m92006c1()
            fb.d r5 = p263fb.C12256d.FROM_DESERIALIZATION
            java.util.Collection r3 = r3.mo72451d(r0, r5)
            java.util.Iterator r3 = r3.iterator()
            r6 = r1
            r5 = 0
        L_0x00a2:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00c0
            java.lang.Object r7 = r3.next()
            r8 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.C14140t0) r8
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r8 = r8.mo72232P()
            if (r8 != 0) goto L_0x00b7
            r8 = 1
            goto L_0x00b8
        L_0x00b7:
            r8 = 0
        L_0x00b8:
            if (r8 == 0) goto L_0x00a2
            if (r5 == 0) goto L_0x00bd
            goto L_0x00c4
        L_0x00bd:
            r6 = r7
            r5 = 1
            goto L_0x00a2
        L_0x00c0:
            if (r5 != 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r1 = r6
        L_0x00c4:
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.C14140t0) r1
            if (r1 == 0) goto L_0x00da
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r1.getType()
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.C13706o.m87927d(r1, r2)
            r3 = r1
            kotlin.reflect.jvm.internal.impl.types.m0 r3 = (kotlin.reflect.jvm.internal.impl.types.C14951m0) r3
        L_0x00d4:
            kotlin.reflect.jvm.internal.impl.descriptors.z r1 = new kotlin.reflect.jvm.internal.impl.descriptors.z
            r1.<init>(r0, r3)
            return r1
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Value class has no underlying property: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inline class has no primary constructor: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0110:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inline class has no underlying property name in metadata: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d.m92000U0():kotlin.reflect.jvm.internal.impl.descriptors.z");
    }

    /* renamed from: V0 */
    private final C13962h0<C14951m0> m92001V0() {
        List<C13508q> list;
        List<Integer> T0 = this.f63799o.mo71113T0();
        C13706o.m87928e(T0, "classProto.multiFieldValueClassUnderlyingNameList");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(T0, 10));
        for (Integer next : T0) {
            C15719c g = this.f63786D.mo73992g();
            C13706o.m87928e(next, "it");
            arrayList.add(C14823x.m92359b(g, next.intValue()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        if (mo62172j0()) {
            C13328m a = C13337s.m85692a(Integer.valueOf(this.f63799o.mo71116W0()), Integer.valueOf(this.f63799o.mo71115V0()));
            if (C13706o.m87924a(a, C13337s.m85692a(Integer.valueOf(arrayList.size()), 0))) {
                List<Integer> X0 = this.f63799o.mo71117X0();
                C13706o.m87928e(X0, "classProto.multiFieldVal…ClassUnderlyingTypeIdList");
                list = new ArrayList<>(C13616u.m87774u(X0, 10));
                for (Integer next2 : X0) {
                    C15724g j = this.f63786D.mo73995j();
                    C13706o.m87928e(next2, "it");
                    list.add(j.mo75166a(next2.intValue()));
                }
            } else if (C13706o.m87924a(a, C13337s.m85692a(0, Integer.valueOf(arrayList.size())))) {
                list = this.f63799o.mo71118Y0();
            } else {
                throw new IllegalStateException(("Illegal multi-field value class representation: " + this).toString());
            }
            C13706o.m87928e(list, "when (typeIdCount to typ…tation: $this\")\n        }");
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list, 10));
            for (C13508q qVar : list) {
                C14720d0 i = this.f63786D.mo73994i();
                C13706o.m87928e(qVar, "it");
                arrayList2.add(C14720d0.m91962n(i, qVar, false, 2, (Object) null));
            }
            return new C13962h0<>(C13566b0.m87413N0(arrayList, arrayList2));
        }
        throw new IllegalArgumentException(("Not a value class: " + this).toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public final C13944d m92002W0() {
        T t;
        if (this.f63785C.mo72288d()) {
            C13991f k = C14602c.m91479k(this, C14158z0.f62778a);
            k.mo72467g1(mo72274p());
            return k;
        }
        List<C13460d> A0 = this.f63799o.mo71093A0();
        C13706o.m87928e(A0, "classProto.constructorList");
        Iterator<T> it = A0.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (!C15714b.f65052m.mo75157d(((C13460d) t).mo71165M()).booleanValue()) {
                break;
            }
        }
        C13460d dVar = (C13460d) t;
        if (dVar != null) {
            return this.f63786D.mo73991f().mo74009i(dVar, true);
        }
        return null;
    }

    /* renamed from: X0 */
    private final List<C13944d> m92003X0() {
        List<C13460d> A0 = this.f63799o.mo71093A0();
        C13706o.m87928e(A0, "classProto.constructorList");
        ArrayList<C13460d> arrayList = new ArrayList<>();
        for (T next : A0) {
            Boolean g = C15714b.f65052m.mo75157d(((C13460d) next).mo71165M());
            C13706o.m87928e(g, "IS_SECONDARY.get(it.flags)");
            if (g.booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (C13460d dVar : arrayList) {
            C14814w f = this.f63786D.mo73991f();
            C13706o.m87928e(dVar, "it");
            arrayList2.add(f.mo74009i(dVar, false));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public final Collection<C13948e> m92004Y0() {
        if (this.f63783A != C13945d0.SEALED) {
            return C13614t.m87748j();
        }
        List<Integer> d1 = this.f63799o.mo71123d1();
        C13706o.m87928e(d1, "fqNames");
        if (!(!d1.isEmpty())) {
            return C14595a.f63598a.mo73690a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : d1) {
            C14794k c = this.f63786D.mo73988c();
            C15719c g = this.f63786D.mo73992g();
            C13706o.m87928e(num, "index");
            C13948e b = c.mo73960b(C14823x.m92358a(g, num.intValue()));
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public final C13960g1<C14951m0> m92005Z0() {
        C14157z<C14951m0> U0 = m92000U0();
        C13962h0<C14951m0> V0 = m92001V0();
        if (U0 != null && V0 != null) {
            throw new IllegalArgumentException("Class cannot have both inline class representation and multi field class representation: " + this);
        } else if ((!mo62172j0() && !isInline()) || U0 != null || V0 != null) {
            return U0 != null ? U0 : V0;
        } else {
            throw new IllegalArgumentException("Value class has no value class representation: " + this);
        }
    }

    /* renamed from: c1 */
    private final C14731a m92006c1() {
        return this.f63789G.mo72664c(this.f63786D.mo73988c().mo73971m().mo74090c());
    }

    /* renamed from: D */
    public C13944d mo62149D() {
        return (C13944d) this.f63792J.invoke();
    }

    /* renamed from: I0 */
    public boolean mo62150I0() {
        Boolean g = C15714b.f65047h.mo75157d(this.f63799o.mo71104K0());
        C13706o.m87928e(g, "IS_DATA.get(classProto.flags)");
        return g.booleanValue();
    }

    /* renamed from: U */
    public C13960g1<C14951m0> mo62155U() {
        return (C13960g1) this.f63796N.invoke();
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return false;
    }

    /* renamed from: Z */
    public List<C14146w0> mo72286Z() {
        List<C13508q> E0 = this.f63799o.mo71098E0();
        C13706o.m87928e(E0, "classProto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(E0, 10));
        for (C13508q qVar : E0) {
            C14720d0 i = this.f63786D.mo73994i();
            C13706o.m87928e(qVar, "it");
            arrayList.add(new C13992f0(mo72283J0(), new C16752b(this, i.mo73847q(qVar), (C16756f) null), C13921g.f62330v.mo72251b()));
        }
        return arrayList;
    }

    /* renamed from: a0 */
    public boolean mo62162a0() {
        return C15714b.f65045f.mo75157d(this.f63799o.mo71104K0()) == C13455c.C13458c.COMPANION_OBJECT;
    }

    /* renamed from: a1 */
    public final C14798m mo73863a1() {
        return this.f63786D;
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        return this.f63791I;
    }

    /* renamed from: b1 */
    public final C13455c mo73864b1() {
        return this.f63799o;
    }

    /* renamed from: d1 */
    public final C15712a mo73865d1() {
        return this.f63800p;
    }

    /* renamed from: e0 */
    public boolean mo62164e0() {
        Boolean g = C15714b.f65051l.mo75157d(this.f63799o.mo71104K0());
        C13706o.m87928e(g, "IS_FUN_INTERFACE.get(classProto.flags)");
        return g.booleanValue();
    }

    /* renamed from: e1 */
    public C14696i mo62176m0() {
        return this.f63787E;
    }

    /* renamed from: f1 */
    public final C14825z.C14826a mo73867f1() {
        return this.f63797O;
    }

    /* renamed from: g1 */
    public final boolean mo73868g1(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        return m92006c1().mo73899q().contains(fVar);
    }

    public C13921g getAnnotations() {
        return this.f63798P;
    }

    public C14158z0 getSource() {
        return this.f63801s;
    }

    public C14141u getVisibility() {
        return this.f63784B;
    }

    /* renamed from: h */
    public C13951f mo62168h() {
        return this.f63785C;
    }

    public boolean isExternal() {
        Boolean g = C15714b.f65048i.mo75157d(this.f63799o.mo71104K0());
        C13706o.m87928e(g, "IS_EXTERNAL_CLASS.get(classProto.flags)");
        return g.booleanValue();
    }

    public boolean isInline() {
        Boolean g = C15714b.f65050k.mo75157d(this.f63799o.mo71104K0());
        C13706o.m87928e(g, "IS_VALUE_CLASS.get(classProto.flags)");
        return g.booleanValue() && this.f63800p.mo75151e(1, 4, 1);
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        return this.f63788F;
    }

    /* renamed from: j0 */
    public boolean mo62172j0() {
        Boolean g = C15714b.f65050k.mo75157d(this.f63799o.mo71104K0());
        C13706o.m87928e(g, "IS_VALUE_CLASS.get(classProto.flags)");
        return g.booleanValue() && this.f63800p.mo75149c(1, 4, 2);
    }

    /* renamed from: k */
    public Collection<C13944d> mo62173k() {
        return (Collection) this.f63793K.invoke();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public C14692h mo62174k0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this.f63789G.mo72664c(gVar);
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        Boolean g = C15714b.f65049j.mo75157d(this.f63799o.mo71104K0());
        C13706o.m87928e(g, "IS_EXPECT_CLASS.get(classProto.flags)");
        return g.booleanValue();
    }

    /* renamed from: n0 */
    public C13948e mo62177n0() {
        return (C13948e) this.f63794L.invoke();
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        return this.f63786D.mo73994i().mo73845j();
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        return this.f63783A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized ");
        sb.append(mo62175l0() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    /* renamed from: w */
    public Collection<C13948e> mo62181w() {
        return (Collection) this.f63795M.invoke();
    }

    /* renamed from: y */
    public boolean mo62182y() {
        Boolean g = C15714b.f65046g.mo75157d(this.f63799o.mo71104K0());
        C13706o.m87928e(g, "IS_INNER.get(classProto.flags)");
        return g.booleanValue();
    }
}
