package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13907o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14421b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14467t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14713b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14716c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14825z;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p308kb.C13494n;
import p327mb.C15714b;
import p349ob.C15841i;
import p362pb.C16151b;
import p362pb.C16157f;
import p370qa.C16265l;
import p370qa.C16269p;
import p442yb.C17004g;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a */
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public abstract class C14410a<A, C> extends C14421b<A, C14411a<? extends A, ? extends C>> implements C14716c<A, C> {

    /* renamed from: b */
    private final C17004g<C14459q, C14411a<A, C>> f63200b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$a */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class C14411a<A, C> extends C14421b.C14422a<A> {

        /* renamed from: a */
        private final Map<C14467t, List<A>> f63201a;

        /* renamed from: b */
        private final Map<C14467t, C> f63202b;

        /* renamed from: c */
        private final Map<C14467t, C> f63203c;

        public C14411a(Map<C14467t, ? extends List<? extends A>> map, Map<C14467t, ? extends C> map2, Map<C14467t, ? extends C> map3) {
            C13706o.m87929f(map, "memberAnnotations");
            C13706o.m87929f(map2, "propertyConstants");
            C13706o.m87929f(map3, "annotationParametersDefaultValues");
            this.f63201a = map;
            this.f63202b = map2;
            this.f63203c = map3;
        }

        /* renamed from: a */
        public Map<C14467t, List<A>> mo73116a() {
            return this.f63201a;
        }

        /* renamed from: b */
        public final Map<C14467t, C> mo73117b() {
            return this.f63203c;
        }

        /* renamed from: c */
        public final Map<C14467t, C> mo73118c() {
            return this.f63202b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$b */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class C14412b extends C13708q implements C16269p<C14411a<? extends A, ? extends C>, C14467t, C> {

        /* renamed from: a */
        public static final C14412b f63204a = new C14412b();

        C14412b() {
            super(2);
        }

        /* renamed from: a */
        public final C invoke(C14411a<? extends A, ? extends C> aVar, C14467t tVar) {
            C13706o.m87929f(aVar, "$this$loadConstantFromProperty");
            C13706o.m87929f(tVar, "it");
            return aVar.mo73117b().get(tVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$c */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class C14413c implements C14459q.C14463d {

        /* renamed from: a */
        final /* synthetic */ C14410a<A, C> f63205a;

        /* renamed from: b */
        final /* synthetic */ HashMap<C14467t, List<A>> f63206b;

        /* renamed from: c */
        final /* synthetic */ C14459q f63207c;

        /* renamed from: d */
        final /* synthetic */ HashMap<C14467t, C> f63208d;

        /* renamed from: e */
        final /* synthetic */ HashMap<C14467t, C> f63209e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$c$a */
        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public final class C14414a extends C14415b implements C14459q.C14464e {

            /* renamed from: d */
            final /* synthetic */ C14413c f63210d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14414a(C14413c cVar, C14467t tVar) {
                super(cVar, tVar);
                C13706o.m87929f(tVar, "signature");
                this.f63210d = cVar;
            }

            /* renamed from: b */
            public C14459q.C14460a mo73122b(int i, C16151b bVar, C14158z0 z0Var) {
                C13706o.m87929f(bVar, "classId");
                C13706o.m87929f(z0Var, "source");
                C14467t e = C14467t.f63311b.mo73215e(mo73123d(), i);
                List list = this.f63210d.f63206b.get(e);
                if (list == null) {
                    list = new ArrayList();
                    this.f63210d.f63206b.put(e, list);
                }
                return this.f63210d.f63205a.mo73150y(bVar, z0Var, list);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$c$b */
        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public class C14415b implements C14459q.C14462c {

            /* renamed from: a */
            private final C14467t f63211a;

            /* renamed from: b */
            private final ArrayList<A> f63212b = new ArrayList<>();

            /* renamed from: c */
            final /* synthetic */ C14413c f63213c;

            public C14415b(C14413c cVar, C14467t tVar) {
                C13706o.m87929f(tVar, "signature");
                this.f63213c = cVar;
                this.f63211a = tVar;
            }

            /* renamed from: a */
            public void mo70772a() {
                if (!this.f63212b.isEmpty()) {
                    this.f63213c.f63206b.put(this.f63211a, this.f63212b);
                }
            }

            /* renamed from: c */
            public C14459q.C14460a mo70773c(C16151b bVar, C14158z0 z0Var) {
                C13706o.m87929f(bVar, "classId");
                C13706o.m87929f(z0Var, "source");
                return this.f63213c.f63205a.mo73150y(bVar, z0Var, this.f63212b);
            }

            /* access modifiers changed from: protected */
            /* renamed from: d */
            public final C14467t mo73123d() {
                return this.f63211a;
            }
        }

        C14413c(C14410a<A, C> aVar, HashMap<C14467t, List<A>> hashMap, C14459q qVar, HashMap<C14467t, C> hashMap2, HashMap<C14467t, C> hashMap3) {
            this.f63205a = aVar;
            this.f63206b = hashMap;
            this.f63207c = qVar;
            this.f63208d = hashMap2;
            this.f63209e = hashMap3;
        }

        /* renamed from: a */
        public C14459q.C14462c mo73120a(C16157f fVar, String str, Object obj) {
            C G;
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(str, "desc");
            C14467t.C14468a aVar = C14467t.f63311b;
            String d = fVar.mo78583d();
            C13706o.m87928e(d, "name.asString()");
            C14467t a = aVar.mo73211a(d, str);
            if (!(obj == null || (G = this.f63205a.mo73111G(str, obj)) == null)) {
                this.f63209e.put(a, G);
            }
            return new C14415b(this, a);
        }

        /* renamed from: b */
        public C14459q.C14464e mo73121b(C16157f fVar, String str) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(str, "desc");
            C14467t.C14468a aVar = C14467t.f63311b;
            String d = fVar.mo78583d();
            C13706o.m87928e(d, "name.asString()");
            return new C14414a(this, aVar.mo73214d(d, str));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$d */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class C14416d extends C13708q implements C16269p<C14411a<? extends A, ? extends C>, C14467t, C> {

        /* renamed from: a */
        public static final C14416d f63214a = new C14416d();

        C14416d() {
            super(2);
        }

        /* renamed from: a */
        public final C invoke(C14411a<? extends A, ? extends C> aVar, C14467t tVar) {
            C13706o.m87929f(aVar, "$this$loadConstantFromProperty");
            C13706o.m87929f(tVar, "it");
            return aVar.mo73118c().get(tVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$e */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    static final class C14417e extends C13708q implements C16265l<C14459q, C14411a<? extends A, ? extends C>> {
        final /* synthetic */ C14410a<A, C> this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14417e(C14410a<A, C> aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final C14411a<A, C> invoke(C14459q qVar) {
            C13706o.m87929f(qVar, "kotlinClass");
            return this.this$0.m90477F(qVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14410a(C17012n nVar, C14454o oVar) {
        super(oVar);
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(oVar, "kotlinClassFinder");
        this.f63200b = nVar.mo80223h(new C14417e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final C14411a<A, C> m90477F(C14459q qVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        qVar.mo67426a(new C14413c(this, hashMap, qVar, hashMap3, hashMap2), mo73144q(qVar));
        return new C14411a<>(hashMap, hashMap2, hashMap3);
    }

    /* renamed from: H */
    private final C m90478H(C14825z zVar, C13494n nVar, C14713b bVar, C14900e0 e0Var, C16269p<? super C14411a<? extends A, ? extends C>, ? super C14467t, ? extends C> pVar) {
        C14467t r;
        C invoke;
        C14459q o = mo73143o(zVar, mo73147v(zVar, true, true, C15714b.f65025A.mo75157d(nVar.mo71357e0()), C15841i.m95458f(nVar)));
        if (o == null || (r = mo73145r(nVar, zVar.mo74023b(), zVar.mo74025d(), bVar, o.mo67427b().mo70763d().mo75150d(C14439g.f63271b.mo73166a()))) == null || (invoke = pVar.invoke(this.f63200b.invoke(o), r)) == null) {
            return null;
        }
        return C13907o.m88472d(e0Var) ? mo73112I(invoke) : invoke;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public C14411a<A, C> mo73115p(C14459q qVar) {
        C13706o.m87929f(qVar, "binaryClass");
        return this.f63200b.invoke(qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$b} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo73110E(p362pb.C16151b r3, java.util.Map<p362pb.C16157f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g<?>> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "annotationClassId"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "arguments"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            za.a r0 = p449za.C17075a.f68516a
            pb.b r0 = r0.mo80342a()
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r3, r0)
            r0 = 0
            if (r3 != 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.String r3 = "value"
            pb.f r3 = p362pb.C16157f.m97019i(r3)
            java.lang.Object r3 = r4.get(r3)
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q
            r1 = 0
            if (r4 == 0) goto L_0x002a
            kotlin.reflect.jvm.internal.impl.resolve.constants.q r3 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q) r3
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            if (r3 != 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.Object r3 = r3.mo73727b()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q.C14638b.C14640b
            if (r4 == 0) goto L_0x0039
            r1 = r3
            kotlin.reflect.jvm.internal.impl.resolve.constants.q$b$b r1 = (kotlin.reflect.jvm.internal.impl.resolve.constants.C14636q.C14638b.C14640b) r1
        L_0x0039:
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            pb.b r3 = r1.mo73755b()
            boolean r3 = r2.mo73148w(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.C14410a.mo73110E(pb.b, java.util.Map):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract C mo73111G(String str, Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract C mo73112I(C c);

    /* renamed from: b */
    public C mo73113b(C14825z zVar, C13494n nVar, C14900e0 e0Var) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        C13706o.m87929f(e0Var, "expectedType");
        return m90478H(zVar, nVar, C14713b.PROPERTY_GETTER, e0Var, C14412b.f63204a);
    }

    /* renamed from: e */
    public C mo73114e(C14825z zVar, C13494n nVar, C14900e0 e0Var) {
        C13706o.m87929f(zVar, "container");
        C13706o.m87929f(nVar, "proto");
        C13706o.m87929f(e0Var, "expectedType");
        return m90478H(zVar, nVar, C14713b.PROPERTY, e0Var, C14416d.f63214a);
    }
}
