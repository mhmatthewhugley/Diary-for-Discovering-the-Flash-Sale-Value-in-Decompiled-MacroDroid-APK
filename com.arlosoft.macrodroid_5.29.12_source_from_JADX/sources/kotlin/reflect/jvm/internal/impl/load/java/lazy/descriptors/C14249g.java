package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13984d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13990e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13991f;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13993g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14006l0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14012n;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.load.java.C14194e;
import kotlin.reflect.jvm.internal.impl.load.java.C14197f;
import kotlin.reflect.jvm.internal.impl.load.java.C14203g0;
import kotlin.reflect.jvm.internal.impl.load.java.C14208h0;
import kotlin.reflect.jvm.internal.impl.load.java.C14214i;
import kotlin.reflect.jvm.internal.impl.load.java.C14216i0;
import kotlin.reflect.jvm.internal.impl.load.java.C14325o;
import kotlin.reflect.jvm.internal.impl.load.java.C14331r;
import kotlin.reflect.jvm.internal.impl.load.java.C14335s;
import kotlin.reflect.jvm.internal.impl.load.java.C14409z;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14169a;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14187j;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14190k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14222a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14298e;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14274j;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14308a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14312d;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14384l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14470v;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import p252eb.C12186a;
import p263fb.C12253b;
import p263fb.C12256d;
import p271gb.C12328b;
import p271gb.C12330d;
import p271gb.C12331e;
import p271gb.C12335f;
import p271gb.C12337h;
import p272gc.C12338a;
import p272gc.C12359f;
import p288ib.C12491f;
import p288ib.C12492g;
import p288ib.C12496k;
import p288ib.C12499n;
import p288ib.C12502q;
import p288ib.C12503r;
import p288ib.C12509w;
import p288ib.C12510x;
import p288ib.C12512y;
import p297ja.C13328m;
import p362pb.C16151b;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p433xa.C16878g;
import p442yb.C17005h;
import p442yb.C17006i;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g */
/* compiled from: LazyJavaClassMemberScope.kt */
public final class C14249g extends C14274j {

    /* renamed from: n */
    private final C13948e f62997n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C12492g f62998o;

    /* renamed from: p */
    private final boolean f62999p;

    /* renamed from: q */
    private final C17006i<List<C13944d>> f63000q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C17006i<Set<C16157f>> f63001r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C17006i<Map<C16157f, C12499n>> f63002s;

    /* renamed from: t */
    private final C17005h<C16157f, C13993g> f63003t;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$a */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14250a extends C13708q implements C16265l<C12502q, Boolean> {

        /* renamed from: a */
        public static final C14250a f63004a = new C14250a();

        C14250a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C12502q qVar) {
            C13706o.m87929f(qVar, "it");
            return Boolean.valueOf(!qVar.mo69001h());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$b */
    /* compiled from: LazyJavaClassMemberScope.kt */
    /* synthetic */ class C14251b extends C13703l implements C16265l<C16157f, Collection<? extends C14156y0>> {
        C14251b(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14249g.class);
        }

        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        /* renamed from: l */
        public final Collection<C14156y0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "p0");
            return ((C14249g) this.receiver).m89956I0(fVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$c */
    /* compiled from: LazyJavaClassMemberScope.kt */
    /* synthetic */ class C14252c extends C13703l implements C16265l<C16157f, Collection<? extends C14156y0>> {
        C14252c(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14249g.class);
        }

        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        /* renamed from: l */
        public final Collection<C14156y0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "p0");
            return ((C14249g) this.receiver).m89957J0(fVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$d */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14253d extends C13708q implements C16265l<C16157f, Collection<? extends C14156y0>> {
        final /* synthetic */ C14249g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14253d(C14249g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final Collection<C14156y0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "it");
            return this.this$0.m89956I0(fVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$e */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14254e extends C13708q implements C16265l<C16157f, Collection<? extends C14156y0>> {
        final /* synthetic */ C14249g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14254e(C14249g gVar) {
            super(1);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final Collection<C14156y0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "it");
            return this.this$0.m89957J0(fVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$f */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14255f extends C13708q implements C16254a<List<? extends C13944d>> {

        /* renamed from: $c */
        final /* synthetic */ C14301g f63005$c;
        final /* synthetic */ C14249g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14255f(C14249g gVar, C14301g gVar2) {
            super(0);
            this.this$0 = gVar;
            this.f63005$c = gVar2;
        }

        /* renamed from: a */
        public final List<C13944d> invoke() {
            Collection<C12496k> k = this.this$0.f62998o.mo68971k();
            ArrayList arrayList = new ArrayList(k.size());
            for (C12496k R : k) {
                arrayList.add(this.this$0.m89954G0(R));
            }
            if (this.this$0.f62998o.mo68976p()) {
                C13944d N = this.this$0.m89975e0();
                boolean z = false;
                String c = C14470v.m90689c(N, false, false, 2, (Object) null);
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C13706o.m87924a(C14470v.m90689c((C13944d) it.next(), false, false, 2, (Object) null), c)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    arrayList.add(N);
                    this.f63005$c.mo72914a().mo72770h().mo72704e(this.this$0.f62998o, N);
                }
            }
            this.f63005$c.mo72914a().mo72785w().mo79451c(this.this$0.mo72826C(), arrayList);
            C14384l r = this.f63005$c.mo72914a().mo72780r();
            C14301g gVar = this.f63005$c;
            C14249g gVar2 = this.this$0;
            boolean isEmpty = arrayList.isEmpty();
            List list = arrayList;
            if (isEmpty) {
                list = C13614t.m87752n(gVar2.m89974d0());
            }
            return C13566b0.m87402F0(r.mo73065g(gVar, list));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$g */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14256g extends C13708q implements C16254a<Map<C16157f, ? extends C12499n>> {
        final /* synthetic */ C14249g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14256g(C14249g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final Map<C16157f, C12499n> invoke() {
            Collection<C12499n> fields = this.this$0.f62998o.getFields();
            ArrayList arrayList = new ArrayList();
            for (T next : fields) {
                if (((C12499n) next).mo68991E()) {
                    arrayList.add(next);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(arrayList, 10)), 16));
            for (Object next2 : arrayList) {
                linkedHashMap.put(((C12499n) next2).getName(), next2);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$h */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14257h extends C13708q implements C16265l<C16157f, Collection<? extends C14156y0>> {
        final /* synthetic */ C14156y0 $function;
        final /* synthetic */ C14249g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14257h(C14156y0 y0Var, C14249g gVar) {
            super(1);
            this.$function = y0Var;
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final Collection<C14156y0> invoke(C16157f fVar) {
            C13706o.m87929f(fVar, "accessorName");
            if (C13706o.m87924a(this.$function.getName(), fVar)) {
                return C13612s.m87736e(this.$function);
            }
            return C13566b0.m87442q0(this.this$0.m89956I0(fVar), this.this$0.m89957J0(fVar));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$i */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14258i extends C13708q implements C16254a<Set<? extends C16157f>> {
        final /* synthetic */ C14249g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14258i(C14249g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* renamed from: a */
        public final Set<C16157f> invoke() {
            return C13566b0.m87407K0(this.this$0.f62998o.mo68980y());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$j */
    /* compiled from: LazyJavaClassMemberScope.kt */
    static final class C14259j extends C13708q implements C16265l<C16157f, C13993g> {

        /* renamed from: $c */
        final /* synthetic */ C14301g f63006$c;
        final /* synthetic */ C14249g this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$j$a */
        /* compiled from: LazyJavaClassMemberScope.kt */
        static final class C14260a extends C13708q implements C16254a<Set<? extends C16157f>> {
            final /* synthetic */ C14249g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14260a(C14249g gVar) {
                super(0);
                this.this$0 = gVar;
            }

            /* renamed from: a */
            public final Set<C16157f> invoke() {
                return C13563a1.m87391j(this.this$0.mo72449b(), this.this$0.mo72448a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14259j(C14249g gVar, C14301g gVar2) {
            super(1);
            this.this$0 = gVar;
            this.f63006$c = gVar2;
        }

        /* renamed from: a */
        public final C13993g invoke(C16157f fVar) {
            C16157f fVar2 = fVar;
            C13706o.m87929f(fVar2, "name");
            if (!((Set) this.this$0.f63001r.invoke()).contains(fVar2)) {
                C12499n nVar = (C12499n) ((Map) this.this$0.f63002s.invoke()).get(fVar2);
                if (nVar == null) {
                    return null;
                }
                C17006i f = this.f63006$c.mo72918e().mo80221f(new C14260a(this.this$0));
                return C14012n.m89002L0(this.f63006$c.mo72918e(), this.this$0.mo72826C(), fVar, f, C14298e.m90143a(this.f63006$c, nVar), this.f63006$c.mo72914a().mo72782t().mo67445a(nVar));
            }
            C14325o d = this.f63006$c.mo72914a().mo72766d();
            C16151b g = C16519a.m98614g(this.this$0.mo72826C());
            C13706o.m87926c(g);
            C16151b d2 = g.mo78546d(fVar2);
            C13706o.m87928e(d2, "ownerDescriptor.classId!…createNestedClassId(name)");
            C12492g a = d.mo67423a(new C14325o.C14327b(d2, (byte[]) null, this.this$0.f62998o, 2, (C13695i) null));
            if (a == null) {
                return null;
            }
            C14301g gVar = this.f63006$c;
            C14241f fVar3 = new C14241f(gVar, this.this$0.mo72826C(), a, (C13948e) null, 8, (C13695i) null);
            gVar.mo72914a().mo72767e().mo72971a(fVar3);
            return fVar3;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14249g(C14301g gVar, C13948e eVar, C12492g gVar2, boolean z, C14249g gVar3, int i, C13695i iVar) {
        this(gVar, eVar, gVar2, z, (i & 16) != 0 ? null : gVar3);
    }

    /* renamed from: A0 */
    private final boolean m89949A0(C14156y0 y0Var, C14154y yVar) {
        String c = C14470v.m90689c(y0Var, false, false, 2, (Object) null);
        C14154y a = yVar.mo72233a();
        C13706o.m87928e(a, "builtinWithErasedParameters.original");
        if (!C13706o.m87924a(c, C14470v.m90689c(a, false, false, 2, (Object) null)) || m89985o0(y0Var, yVar)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (kotlin.reflect.jvm.internal.impl.load.java.C14409z.m90472d(r4) == false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0074 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: B0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m89950B0(kotlin.reflect.jvm.internal.impl.descriptors.C14156y0 r7) {
        /*
            r6 = this;
            pb.f r0 = r7.getName()
            java.lang.String r1 = "function.name"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.util.List r0 = kotlin.reflect.jvm.internal.impl.load.java.C14196e0.m89732a(r0)
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x0078
        L_0x001b:
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            pb.f r1 = (p362pb.C16157f) r1
            java.util.Set r1 = r6.m89994z0(r1)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x003b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x003b
        L_0x0039:
            r1 = 0
            goto L_0x0075
        L_0x003b:
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C14140t0) r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$h r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g$h
            r5.<init>(r7, r6)
            boolean r5 = r6.m89984n0(r4, r5)
            if (r5 == 0) goto L_0x0071
            boolean r4 = r4.mo72440N()
            if (r4 != 0) goto L_0x006f
            pb.f r4 = r7.getName()
            java.lang.String r4 = r4.mo78583d()
            java.lang.String r5 = "function.name.asString()"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)
            boolean r4 = kotlin.reflect.jvm.internal.impl.load.java.C14409z.m90472d(r4)
            if (r4 != 0) goto L_0x0071
        L_0x006f:
            r4 = 1
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            if (r4 == 0) goto L_0x003f
            r1 = 1
        L_0x0075:
            if (r1 == 0) goto L_0x001f
            r0 = 1
        L_0x0078:
            if (r0 == 0) goto L_0x007b
            return r3
        L_0x007b:
            boolean r0 = r6.m89986p0(r7)
            if (r0 != 0) goto L_0x008e
            boolean r0 = r6.m89958K0(r7)
            if (r0 != 0) goto L_0x008e
            boolean r7 = r6.m89988r0(r7)
            if (r7 != 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14249g.m89950B0(kotlin.reflect.jvm.internal.impl.descriptors.y0):boolean");
    }

    /* renamed from: C0 */
    private final C14156y0 m89951C0(C14156y0 y0Var, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar, Collection<? extends C14156y0> collection) {
        C14156y0 g0;
        C14154y k = C14197f.m89740k(y0Var);
        if (k == null || (g0 = m89977g0(k, lVar)) == null) {
            return null;
        }
        if (!m89950B0(g0)) {
            g0 = null;
        }
        if (g0 != null) {
            return m89976f0(g0, k, collection);
        }
        return null;
    }

    /* renamed from: D0 */
    private final C14156y0 m89952D0(C14156y0 y0Var, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar, C16157f fVar, Collection<? extends C14156y0> collection) {
        C14156y0 y0Var2 = (C14156y0) C14203g0.m89755d(y0Var);
        if (y0Var2 == null) {
            return null;
        }
        String b = C14203g0.m89753b(y0Var2);
        C13706o.m87926c(b);
        C16157f i = C16157f.m97019i(b);
        C13706o.m87928e(i, "identifier(nameInJava)");
        for (C14156y0 l0 : (Collection) lVar.invoke(i)) {
            C14156y0 l02 = m89982l0(l0, fVar);
            if (m89987q0(y0Var2, l02)) {
                return m89976f0(l02, y0Var2, collection);
            }
        }
        return null;
    }

    /* renamed from: E0 */
    private final C14156y0 m89953E0(C14156y0 y0Var, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        if (!y0Var.isSuspend()) {
            return null;
        }
        C16157f name = y0Var.getName();
        C13706o.m87928e(name, "descriptor.name");
        for (C14156y0 m0 : (Iterable) lVar.invoke(name)) {
            C14156y0 m02 = m89983m0(m0);
            if (m02 == null || !m89985o0(m02, y0Var)) {
                m02 = null;
                continue;
            }
            if (m02 != null) {
                return m02;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public final C12328b m89954G0(C12496k kVar) {
        C13948e y0 = mo72826C();
        C12328b t1 = C12328b.m83037t1(y0, C14298e.m90143a(mo72877w(), kVar), false, mo72877w().mo72914a().mo72782t().mo67445a(kVar));
        C13706o.m87928e(t1, "createJavaConstructor(\n …ce(constructor)\n        )");
        C14301g e = C14222a.m89812e(mo72877w(), t1, kVar, y0.mo62178q().size());
        C14274j.C14276b K = mo72873K(e, t1, kVar.mo68988g());
        List<C13950e1> q = y0.mo62178q();
        C13706o.m87928e(q, "classDescriptor.declaredTypeParameters");
        List<C12512y> typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(typeParameters, 10));
        for (C12512y a : typeParameters) {
            C13950e1 a2 = e.mo72919f().mo72921a(a);
            C13706o.m87926c(a2);
            arrayList.add(a2);
        }
        t1.mo72395r1(K.mo72888a(), C14216i0.m89798c(kVar.getVisibility()), C13566b0.m87442q0(q, arrayList));
        t1.mo68651Y0(false);
        t1.mo68652Z0(K.mo72889b());
        t1.mo72467g1(y0.mo72274p());
        e.mo72914a().mo72770h().mo72704e(kVar, t1);
        return t1;
    }

    /* renamed from: H0 */
    private final C12331e m89955H0(C12509w wVar) {
        C12509w wVar2 = wVar;
        C12331e p1 = C12331e.m83049p1(mo72826C(), C14298e.m90143a(mo72877w(), wVar2), wVar.getName(), mo72877w().mo72914a().mo72782t().mo67445a(wVar2), true);
        C13706o.m87928e(p1, "createJavaMethod(\n      …omponent), true\n        )");
        C12331e eVar = p1;
        eVar.mo68658o1((C14146w0) null, mo72842z(), C13614t.m87748j(), C13614t.m87748j(), C13614t.m87748j(), mo72877w().mo72920g().mo72939o(wVar.getType(), C14312d.m90202d(C14190k.COMMON, false, (C13950e1) null, 2, (Object) null)), C13945d0.f62416a.mo72279a(false, false, true), C14127t.f62754e, (Map<? extends C13908a.C13909a<?>, ?>) null);
        p1.mo68661s1(false, false);
        mo72877w().mo72914a().mo72770h().mo72701b(wVar2, p1);
        return p1;
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public final Collection<C14156y0> m89956I0(C16157f fVar) {
        Collection<C12503r> b = ((C14232b) mo72878y().invoke()).mo72793b(fVar);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(b, 10));
        for (C12503r I : b) {
            arrayList.add(mo72872I(I));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public final Collection<C14156y0> m89957J0(C16157f fVar) {
        Set<C14156y0> x0 = m89993x0(fVar);
        ArrayList arrayList = new ArrayList();
        for (T next : x0) {
            C14156y0 y0Var = (C14156y0) next;
            if (!(C14203g0.m89752a(y0Var) || C14197f.m89740k(y0Var) != null)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: K0 */
    private final boolean m89958K0(C14156y0 y0Var) {
        C14197f fVar = C14197f.f62882n;
        C16157f name = y0Var.getName();
        C13706o.m87928e(name, "name");
        if (!fVar.mo72725l(name)) {
            return false;
        }
        C16157f name2 = y0Var.getName();
        C13706o.m87928e(name2, "name");
        Set<C14156y0> x0 = m89993x0(name2);
        ArrayList<C14154y> arrayList = new ArrayList<>();
        for (C14156y0 k : x0) {
            C14154y k2 = C14197f.m89740k(k);
            if (k2 != null) {
                arrayList.add(k2);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (C14154y A0 : arrayList) {
            if (m89949A0(y0Var, A0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: U */
    private final void m89967U(List<C13966i1> list, C14052l lVar, int i, C12503r rVar, C14900e0 e0Var, C14900e0 e0Var2) {
        C13921g b = C13921g.f62330v.mo72251b();
        C16157f name = rVar.getName();
        C14900e0 n = C14956n1.m92999n(e0Var);
        C13706o.m87928e(n, "makeNotNullable(returnType)");
        List<C13966i1> list2 = list;
        list.add(new C14006l0(lVar, (C13966i1) null, i, b, name, n, rVar.mo68996K(), false, false, e0Var2 != null ? C14956n1.m92999n(e0Var2) : null, mo72877w().mo72914a().mo72782t().mo67445a(rVar)));
    }

    /* renamed from: V */
    private final void m89968V(Collection<C14156y0> collection, C16157f fVar, Collection<? extends C14156y0> collection2, boolean z) {
        Collection<D> d = C14169a.m89661d(fVar, collection2, collection, mo72826C(), mo72877w().mo72914a().mo72765c(), mo72877w().mo72914a().mo72773k().mo74089a());
        C13706o.m87928e(d, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z) {
            collection.addAll(d);
            return;
        }
        List q0 = C13566b0.m87442q0(collection, d);
        ArrayList arrayList = new ArrayList(C13616u.m87774u(d, 10));
        for (D d2 : d) {
            C14156y0 y0Var = (C14156y0) C14203g0.m89756e(d2);
            if (y0Var == null) {
                C13706o.m87928e(d2, "resolvedOverride");
            } else {
                C13706o.m87928e(d2, "resolvedOverride");
                d2 = m89976f0(d2, y0Var, q0);
            }
            arrayList.add(d2);
        }
        collection.addAll(arrayList);
    }

    /* renamed from: W */
    private final void m89969W(C16157f fVar, Collection<? extends C14156y0> collection, Collection<? extends C14156y0> collection2, Collection<C14156y0> collection3, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        for (C14156y0 y0Var : collection2) {
            C12338a.m83071a(collection3, m89952D0(y0Var, lVar, fVar, collection));
            C12338a.m83071a(collection3, m89951C0(y0Var, lVar, collection));
            C12338a.m83071a(collection3, m89953E0(y0Var, lVar));
        }
    }

    /* renamed from: X */
    private final void m89970X(Set<? extends C14140t0> set, Collection<C14140t0> collection, Set<C14140t0> set2, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        for (C14140t0 t0Var : set) {
            C12335f h0 = m89978h0(t0Var, lVar);
            if (h0 != null) {
                collection.add(h0);
                if (set2 != null) {
                    set2.add(t0Var);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: Y */
    private final void m89971Y(C16157f fVar, Collection<C14140t0> collection) {
        C12503r rVar = (C12503r) C13566b0.m87447v0(((C14232b) mo72878y().invoke()).mo72793b(fVar));
        if (rVar != null) {
            collection.add(m89980j0(this, rVar, (C14900e0) null, C13945d0.FINAL, 2, (Object) null));
        }
    }

    /* renamed from: b0 */
    private final Collection<C14900e0> m89972b0() {
        if (!this.f62999p) {
            return mo72877w().mo72914a().mo72773k().mo74090c().mo74069g(mo72826C());
        }
        Collection<C14900e0> l = mo72826C().mo62171j().mo72370l();
        C13706o.m87928e(l, "ownerDescriptor.typeConstructor.supertypes");
        return l;
    }

    /* renamed from: c0 */
    private final List<C13966i1> m89973c0(C13991f fVar) {
        C13328m mVar;
        Collection<C12503r> methods = this.f62998o.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        int i = 1;
        C14308a d = C14312d.m90202d(C14190k.COMMON, true, (C13950e1) null, 2, (Object) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (T next : methods) {
            if (C13706o.m87924a(((C12503r) next).getName(), C14163a0.f62786c)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        C13328m mVar2 = new C13328m(arrayList2, arrayList3);
        List list = (List) mVar2.mo70152a();
        List<C12503r> list2 = (List) mVar2.mo70153b();
        list.size();
        C12503r rVar = (C12503r) C13566b0.m87424Y(list);
        if (rVar != null) {
            C12510x returnType = rVar.getReturnType();
            if (returnType instanceof C12491f) {
                C12491f fVar2 = (C12491f) returnType;
                mVar = new C13328m(mo72877w().mo72920g().mo72938k(fVar2, d, true), mo72877w().mo72920g().mo72939o(fVar2.mo68965i(), d));
            } else {
                mVar = new C13328m(mo72877w().mo72920g().mo72939o(returnType, d), null);
            }
            m89967U(arrayList, fVar, 0, rVar, (C14900e0) mVar.mo70152a(), (C14900e0) mVar.mo70153b());
        }
        int i2 = 0;
        if (rVar == null) {
            i = 0;
        }
        for (C12503r rVar2 : list2) {
            int i3 = i2 + i;
            m89967U(arrayList, fVar, i3, rVar2, mo72877w().mo72920g().mo72939o(rVar2.getReturnType(), d), (C14900e0) null);
            i2++;
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public final C13944d m89974d0() {
        List<C13966i1> list;
        boolean o = this.f62998o.mo68975o();
        if ((this.f62998o.mo68966F() || !this.f62998o.mo68977q()) && !o) {
            return null;
        }
        C13948e y0 = mo72826C();
        C12328b t1 = C12328b.m83037t1(y0, C13921g.f62330v.mo72251b(), true, mo72877w().mo72914a().mo72782t().mo67445a(this.f62998o));
        C13706o.m87928e(t1, "createJavaConstructor(\n ….source(jClass)\n        )");
        if (o) {
            list = m89973c0(t1);
        } else {
            list = Collections.emptyList();
        }
        t1.mo68652Z0(false);
        t1.mo72394q1(list, m89992v0(y0));
        t1.mo68651Y0(true);
        t1.mo72467g1(y0.mo72274p());
        mo72877w().mo72914a().mo72770h().mo72704e(this.f62998o, t1);
        return t1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public final C13944d m89975e0() {
        C13948e y0 = mo72826C();
        C12328b t1 = C12328b.m83037t1(y0, C13921g.f62330v.mo72251b(), true, mo72877w().mo72914a().mo72782t().mo67445a(this.f62998o));
        C13706o.m87928e(t1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<C13966i1> k0 = m89981k0(t1);
        t1.mo68652Z0(false);
        t1.mo72394q1(k0, m89992v0(y0));
        t1.mo68651Y0(false);
        t1.mo72467g1(y0.mo72274p());
        return t1;
    }

    /* renamed from: f0 */
    private final C14156y0 m89976f0(C14156y0 y0Var, C13908a aVar, Collection<? extends C14156y0> collection) {
        boolean z;
        boolean z2 = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C14156y0 y0Var2 = (C14156y0) it.next();
                if (C13706o.m87924a(y0Var, y0Var2) || y0Var2.mo72331s0() != null || !m89985o0(y0Var2, aVar)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return y0Var;
        }
        Object build = y0Var.mo72401t().mo72503i().build();
        C13706o.m87926c(build);
        return (C14156y0) build;
    }

    /* renamed from: g0 */
    private final C14156y0 m89977g0(C14154y yVar, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        Object obj;
        C16157f name = yVar.getName();
        C13706o.m87928e(name, "overridden.name");
        Iterator it = ((Iterable) lVar.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (m89949A0((C14156y0) obj, yVar)) {
                break;
            }
        }
        C14156y0 y0Var = (C14156y0) obj;
        if (y0Var == null) {
            return null;
        }
        C14154y.C14155a<? extends C14156y0> t = y0Var.mo72401t();
        List<C13966i1> g = yVar.mo72235g();
        C13706o.m87928e(g, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(g, 10));
        for (C13966i1 type : g) {
            arrayList.add(type.getType());
        }
        List<C13966i1> g2 = y0Var.mo72235g();
        C13706o.m87928e(g2, "override.valueParameters");
        t.mo72495b(C12337h.m83069a(arrayList, g2, yVar));
        t.mo72514t();
        t.mo72506l();
        t.mo72501g(C12331e.f59012Y, Boolean.TRUE);
        return (C14156y0) t.build();
    }

    /* renamed from: h0 */
    private final C12335f m89978h0(C14140t0 t0Var, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        C14156y0 y0Var;
        C13990e0 e0Var = null;
        if (!m89984n0(t0Var, lVar)) {
            return null;
        }
        C14156y0 t0 = m89990t0(t0Var, lVar);
        C13706o.m87926c(t0);
        if (t0Var.mo72440N()) {
            y0Var = m89991u0(t0Var, lVar);
            C13706o.m87926c(y0Var);
        } else {
            y0Var = null;
        }
        if (y0Var != null) {
            y0Var.mo62179r();
            t0.mo62179r();
        }
        C12330d dVar = new C12330d(mo72826C(), t0, y0Var, t0Var);
        C14900e0 returnType = t0.getReturnType();
        C13706o.m87926c(returnType);
        C12330d dVar2 = dVar;
        dVar2.mo72344b1(returnType, C13614t.m87748j(), mo72842z(), (C14146w0) null, C13614t.m87748j());
        C13984d0 j = C14602c.m91478j(dVar2, t0.getAnnotations(), false, false, false, t0.getSource());
        j.mo72325N0(t0);
        j.mo72374Q0(dVar.getType());
        C13706o.m87928e(j, "createGetter(\n          …escriptor.type)\n        }");
        if (y0Var != null) {
            List<C13966i1> g = y0Var.mo72235g();
            C13706o.m87928e(g, "setterMethod.valueParameters");
            C13966i1 i1Var = (C13966i1) C13566b0.m87424Y(g);
            if (i1Var != null) {
                e0Var = C14602c.m91480l(dVar, y0Var.getAnnotations(), i1Var.getAnnotations(), false, false, false, y0Var.getVisibility(), y0Var.getSource());
                e0Var.mo72325N0(y0Var);
            } else {
                throw new AssertionError("No parameter found for " + y0Var);
            }
        }
        dVar.mo72339U0(j, e0Var);
        return dVar;
    }

    /* renamed from: i0 */
    private final C12335f m89979i0(C12503r rVar, C14900e0 e0Var, C13945d0 d0Var) {
        C14900e0 e0Var2;
        C12503r rVar2 = rVar;
        C12335f f1 = C12335f.m83060f1(mo72826C(), C14298e.m90143a(mo72877w(), rVar2), d0Var, C14216i0.m89798c(rVar.getVisibility()), false, rVar.getName(), mo72877w().mo72914a().mo72782t().mo67445a(rVar2), false);
        C13706o.m87928e(f1, "create(\n            owne…inal = */ false\n        )");
        C13984d0 d = C14602c.m91472d(f1, C13921g.f62330v.mo72251b());
        C13706o.m87928e(d, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        f1.mo72339U0(d, (C14144v0) null);
        if (e0Var == null) {
            e0Var2 = mo72875q(rVar2, C14222a.m89813f(mo72877w(), f1, rVar, 0, 4, (Object) null));
        } else {
            e0Var2 = e0Var;
        }
        f1.mo72344b1(e0Var2, C13614t.m87748j(), mo72842z(), (C14146w0) null, C13614t.m87748j());
        d.mo72374Q0(e0Var2);
        return f1;
    }

    /* renamed from: j0 */
    static /* synthetic */ C12335f m89980j0(C14249g gVar, C12503r rVar, C14900e0 e0Var, C13945d0 d0Var, int i, Object obj) {
        if ((i & 2) != 0) {
            e0Var = null;
        }
        return gVar.m89979i0(rVar, e0Var, d0Var);
    }

    /* renamed from: k0 */
    private final List<C13966i1> m89981k0(C13991f fVar) {
        Collection<C12509w> n = this.f62998o.mo68974n();
        ArrayList arrayList = new ArrayList(n.size());
        C14900e0 e0Var = null;
        C14308a d = C14312d.m90202d(C14190k.COMMON, false, (C13950e1) null, 2, (Object) null);
        int i = 0;
        for (C12509w next : n) {
            int i2 = i + 1;
            C14900e0 o = mo72877w().mo72920g().mo72939o(next.getType(), d);
            C14900e0 k = next.mo69009a() ? mo72877w().mo72914a().mo72775m().mo72296m().mo72138k(o) : e0Var;
            C14006l0 l0Var = r6;
            C14006l0 l0Var2 = new C14006l0(fVar, (C13966i1) null, i, C13921g.f62330v.mo72251b(), next.getName(), o, false, false, false, k, mo72877w().mo72914a().mo72782t().mo67445a(next));
            arrayList.add(l0Var);
            i = i2;
            e0Var = null;
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private final C14156y0 m89982l0(C14156y0 y0Var, C16157f fVar) {
        C14154y.C14155a<? extends C14156y0> t = y0Var.mo72401t();
        t.mo72504j(fVar);
        t.mo72514t();
        t.mo72506l();
        Object build = t.build();
        C13706o.m87926c(build);
        return (C14156y0) build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.descriptors.C14156y0 m89983m0(kotlin.reflect.jvm.internal.impl.descriptors.C14156y0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo72235g()
            java.lang.String r1 = "valueParameters"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            java.lang.Object r0 = kotlin.collections.C13566b0.m87436k0(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13966i1) r0
            r2 = 0
            if (r0 == 0) goto L_0x007e
            kotlin.reflect.jvm.internal.impl.types.e0 r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.mo73702N0()
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = r3.mo62183c()
            if (r3 == 0) goto L_0x0035
            pb.d r3 = p389sb.C16519a.m98616i(r3)
            if (r3 == 0) goto L_0x0035
            boolean r4 = r3.mo78572f()
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0035
            pb.c r3 = r3.mo78579l()
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            pb.c r4 = kotlin.reflect.jvm.internal.impl.builtins.C13902k.f62191m
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r3, r4)
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0043
            goto L_0x007e
        L_0x0043:
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r6.mo72401t()
            java.util.List r6 = r6.mo72235g()
            kotlin.jvm.internal.C13706o.m87928e(r6, r1)
            r1 = 1
            java.util.List r6 = kotlin.collections.C13566b0.m87417R(r6, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r2.mo72495b(r6)
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r0.getType()
            java.util.List r0 = r0.mo73700L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.g1 r0 = (kotlin.reflect.jvm.internal.impl.types.C14926g1) r0
            kotlin.reflect.jvm.internal.impl.types.e0 r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r6 = r6.mo72507m(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = r6.build()
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C14156y0) r6
            r0 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.C13994g0) r0
            if (r0 != 0) goto L_0x007a
            goto L_0x007d
        L_0x007a:
            r0.mo72468h1(r1)
        L_0x007d:
            return r6
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14249g.m89983m0(kotlin.reflect.jvm.internal.impl.descriptors.y0):kotlin.reflect.jvm.internal.impl.descriptors.y0");
    }

    /* renamed from: n0 */
    private final boolean m89984n0(C14140t0 t0Var, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        if (C14234c.m89875a(t0Var)) {
            return false;
        }
        C14156y0 t0 = m89990t0(t0Var, lVar);
        C14156y0 u0 = m89991u0(t0Var, lVar);
        if (t0 == null) {
            return false;
        }
        if (!t0Var.mo72440N()) {
            return true;
        }
        if (u0 == null || u0.mo62179r() != t0.mo62179r()) {
            return false;
        }
        return true;
    }

    /* renamed from: o0 */
    private final boolean m89985o0(C13908a aVar, C13908a aVar2) {
        C14658j.C14667i.C14668a c = C14658j.f63654f.mo73770F(aVar2, aVar, true).mo73778c();
        C13706o.m87928e(c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        if (c != C14658j.C14667i.C14668a.OVERRIDABLE || C14335s.f63114a.mo72979a(aVar2, aVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    private final boolean m89986p0(C14156y0 y0Var) {
        C14208h0.C14209a aVar = C14208h0.f62898a;
        C16157f name = y0Var.getName();
        C13706o.m87928e(name, "name");
        C16157f b = aVar.mo72738b(name);
        if (b == null) {
            return false;
        }
        Set<C14156y0> x0 = m89993x0(b);
        ArrayList<C14156y0> arrayList = new ArrayList<>();
        for (T next : x0) {
            if (C14203g0.m89752a((C14156y0) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        C14156y0 l0 = m89982l0(y0Var, b);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (C14156y0 q0 : arrayList) {
            if (m89987q0(q0, l0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    private final boolean m89987q0(C14156y0 y0Var, C14154y yVar) {
        if (C14194e.f62881n.mo72723k(y0Var)) {
            yVar = yVar.mo72233a();
        }
        C13706o.m87928e(yVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return m89985o0(yVar, y0Var);
    }

    /* renamed from: r0 */
    private final boolean m89988r0(C14156y0 y0Var) {
        boolean z;
        C14156y0 m0 = m89983m0(y0Var);
        if (m0 == null) {
            return false;
        }
        C16157f name = y0Var.getName();
        C13706o.m87928e(name, "name");
        Set<C14156y0> x0 = m89993x0(name);
        if ((x0 instanceof Collection) && x0.isEmpty()) {
            return false;
        }
        for (C14156y0 y0Var2 : x0) {
            if (!y0Var2.isSuspend() || !m89985o0(m0, y0Var2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s0 */
    private final C14156y0 m89989s0(C14140t0 t0Var, String str, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        C14156y0 y0Var;
        C16157f i = C16157f.m97019i(str);
        C13706o.m87928e(i, "identifier(getterName)");
        Iterator it = ((Iterable) lVar.invoke(i)).iterator();
        do {
            y0Var = null;
            if (!it.hasNext()) {
                break;
            }
            C14156y0 y0Var2 = (C14156y0) it.next();
            if (y0Var2.mo72235g().size() == 0) {
                C14844e eVar = C14844e.f63967a;
                C14900e0 returnType = y0Var2.getReturnType();
                if (returnType == null ? false : eVar.mo74060d(returnType, t0Var.getType())) {
                    y0Var = y0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (y0Var == null);
        return y0Var;
    }

    /* renamed from: t0 */
    private final C14156y0 m89990t0(C14140t0 t0Var, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        C14142u0 f = t0Var.mo72346f();
        String str = null;
        C14142u0 u0Var = f != null ? (C14142u0) C14203g0.m89755d(f) : null;
        if (u0Var != null) {
            str = C14214i.f62922a.mo72754a(u0Var);
        }
        if (str != null && !C14203g0.m89757f(mo72826C(), u0Var)) {
            return m89989s0(t0Var, str, lVar);
        }
        String d = t0Var.getName().mo78583d();
        C13706o.m87928e(d, "name.asString()");
        return m89989s0(t0Var, C14409z.m90470b(d), lVar);
    }

    /* renamed from: u0 */
    private final C14156y0 m89991u0(C14140t0 t0Var, C16265l<? super C16157f, ? extends Collection<? extends C14156y0>> lVar) {
        C14156y0 y0Var;
        C14900e0 returnType;
        String d = t0Var.getName().mo78583d();
        C13706o.m87928e(d, "name.asString()");
        C16157f i = C16157f.m97019i(C14409z.m90473e(d));
        C13706o.m87928e(i, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator it = ((Iterable) lVar.invoke(i)).iterator();
        do {
            y0Var = null;
            if (!it.hasNext()) {
                break;
            }
            C14156y0 y0Var2 = (C14156y0) it.next();
            if (y0Var2.mo72235g().size() == 1 && (returnType = y0Var2.getReturnType()) != null && C13853h.m88244B0(returnType)) {
                C14844e eVar = C14844e.f63967a;
                List<C13966i1> g = y0Var2.mo72235g();
                C13706o.m87928e(g, "descriptor.valueParameters");
                if (eVar.mo74059b(((C13966i1) C13566b0.m87446u0(g)).getType(), t0Var.getType())) {
                    y0Var = y0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (y0Var == null);
        return y0Var;
    }

    /* renamed from: v0 */
    private final C14141u m89992v0(C13948e eVar) {
        C14141u visibility = eVar.getVisibility();
        C13706o.m87928e(visibility, "classDescriptor.visibility");
        if (!C13706o.m87924a(visibility, C14331r.f63111b)) {
            return visibility;
        }
        C14141u uVar = C14331r.f63112c;
        C13706o.m87928e(uVar, "PROTECTED_AND_PACKAGE");
        return uVar;
    }

    /* renamed from: x0 */
    private final Set<C14156y0> m89993x0(C16157f fVar) {
        Collection<C14900e0> b0 = m89972b0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C14900e0 n : b0) {
            boolean unused = C13624y.m87797z(linkedHashSet, n.mo72955n().mo72450c(fVar, C12256d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    /* renamed from: z0 */
    private final Set<C14140t0> m89994z0(C16157f fVar) {
        Collection<C14900e0> b0 = m89972b0();
        ArrayList arrayList = new ArrayList();
        for (C14900e0 n : b0) {
            Collection<? extends C14140t0> d = n.mo72955n().mo72451d(fVar, C12256d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C13616u.m87774u(d, 10));
            for (C14140t0 add : d) {
                arrayList2.add(add);
            }
            boolean unused = C13624y.m87797z(arrayList, arrayList2);
        }
        return C13566b0.m87407K0(arrayList);
    }

    /* renamed from: F0 */
    public void mo72827F0(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C12186a.m82847a(mo72877w().mo72914a().mo72774l(), bVar, mo72826C(), fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo72828G(C12331e eVar) {
        C13706o.m87929f(eVar, "<this>");
        if (this.f62998o.mo68975o()) {
            return false;
        }
        return m89950B0(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public C14274j.C14275a mo72829H(C12503r rVar, List<? extends C13950e1> list, C14900e0 e0Var, List<? extends C13966i1> list2) {
        C13706o.m87929f(rVar, "method");
        C13706o.m87929f(list, "methodTypeParameters");
        C13706o.m87929f(e0Var, "returnType");
        C13706o.m87929f(list2, "valueParameters");
        C14187j.C14189b a = mo72877w().mo72914a().mo72781s().mo72707a(rVar, mo72826C(), e0Var, (C14900e0) null, list2, list);
        C13706o.m87928e(a, "c.components.signaturePr…dTypeParameters\n        )");
        C14900e0 d = a.mo72711d();
        C13706o.m87928e(d, "propagated.returnType");
        C14900e0 c = a.mo72710c();
        List<C13966i1> f = a.mo72713f();
        C13706o.m87928e(f, "propagated.valueParameters");
        List<C13950e1> e = a.mo72712e();
        C13706o.m87928e(e, "propagated.typeParameters");
        boolean g = a.mo72714g();
        List<String> b = a.mo72709b();
        C13706o.m87928e(b, "propagated.errors");
        return new C14274j.C14275a(d, c, f, e, g, b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public LinkedHashSet<C16157f> mo72833n(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        Collection<C14900e0> l = mo72826C().mo62171j().mo72370l();
        C13706o.m87928e(l, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<C16157f> linkedHashSet = new LinkedHashSet<>();
        for (C14900e0 n : l) {
            boolean unused = C13624y.m87797z(linkedHashSet, n.mo72955n().mo72449b());
        }
        linkedHashSet.addAll(((C14232b) mo72878y().invoke()).mo72792a());
        linkedHashSet.addAll(((C14232b) mo72878y().invoke()).mo72796e());
        linkedHashSet.addAll(mo72832l(dVar, lVar));
        linkedHashSet.addAll(mo72877w().mo72914a().mo72785w().mo79453e(mo72826C()));
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public C14230a mo72835p() {
        return new C14230a(this.f62998o, C14250a.f63004a);
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        mo72827F0(fVar, bVar);
        return super.mo72450c(fVar, bVar);
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        mo72827F0(fVar, bVar);
        return super.mo72451d(fVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r3 = (r3 = r3.f63003t).invoke(r2);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.descriptors.C13961h mo72800e(p362pb.C16157f r2, p263fb.C12253b r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            r1.mo72827F0(r2, r3)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r3 = r1.mo72871B()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.g r3 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14249g) r3
            if (r3 == 0) goto L_0x0022
            yb.h<pb.f, kotlin.reflect.jvm.internal.impl.descriptors.impl.g> r3 = r3.f63003t
            if (r3 == 0) goto L_0x0022
            java.lang.Object r3 = r3.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.g r3 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.C13993g) r3
            if (r3 == 0) goto L_0x0022
            goto L_0x002b
        L_0x0022:
            yb.h<pb.f, kotlin.reflect.jvm.internal.impl.descriptors.impl.g> r3 = r1.f63003t
            java.lang.Object r2 = r3.invoke(r2)
            r3 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.h r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C13961h) r3
        L_0x002b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14249g.mo72800e(pb.f, fb.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Set<C16157f> mo72832l(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        return C13563a1.m87391j((Set) this.f63001r.invoke(), ((Map) this.f63002s.invoke()).keySet());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo72834o(Collection<C14156y0> collection, C16157f fVar) {
        C13706o.m87929f(collection, "result");
        C13706o.m87929f(fVar, "name");
        if (this.f62998o.mo68976p() && ((C14232b) mo72878y().invoke()).mo72795d(fVar) != null) {
            boolean z = true;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C14156y0) it.next()).mo72235g().isEmpty()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                C12509w d = ((C14232b) mo72878y().invoke()).mo72795d(fVar);
                C13706o.m87926c(d);
                collection.add(m89955H0(d));
            }
        }
        mo72877w().mo72914a().mo72785w().mo79450b(mo72826C(), fVar, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo72836r(Collection<C14156y0> collection, C16157f fVar) {
        boolean z;
        C13706o.m87929f(collection, "result");
        C13706o.m87929f(fVar, "name");
        Set<C14156y0> x0 = m89993x0(fVar);
        if (!C14208h0.f62898a.mo72747k(fVar) && !C14197f.f62882n.mo72725l(fVar)) {
            if (!(x0 instanceof Collection) || !x0.isEmpty()) {
                Iterator<T> it = x0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C14154y) it.next()).isSuspend()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (T next : x0) {
                    if (m89950B0((C14156y0) next)) {
                        arrayList.add(next);
                    }
                }
                m89968V(collection, fVar, arrayList, false);
                return;
            }
        }
        C12359f a = C12359f.f59044d.mo68706a();
        Collection<D> d = C14169a.m89661d(fVar, x0, C13614t.m87748j(), mo72826C(), C14806r.f63932a, mo72877w().mo72914a().mo72773k().mo74089a());
        C13706o.m87928e(d, "resolveOverridesForNonSt….overridingUtil\n        )");
        C16157f fVar2 = fVar;
        Collection<C14156y0> collection2 = collection;
        Collection<D> collection3 = d;
        m89969W(fVar2, collection2, collection3, collection, new C14251b(this));
        m89969W(fVar2, collection2, collection3, a, new C14252c(this));
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : x0) {
            if (m89950B0((C14156y0) next2)) {
                arrayList2.add(next2);
            }
        }
        m89968V(collection, fVar, C13566b0.m87442q0(arrayList2, a), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo72837s(C16157f fVar, Collection<C14140t0> collection) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(collection, "result");
        if (this.f62998o.mo68975o()) {
            m89971Y(fVar, collection);
        }
        Set<C14140t0> z0 = m89994z0(fVar);
        if (!z0.isEmpty()) {
            C12359f.C12361b bVar = C12359f.f59044d;
            C12359f a = bVar.mo68706a();
            C12359f a2 = bVar.mo68706a();
            m89970X(z0, collection, a, new C14253d(this));
            m89970X(C13563a1.m87389h(z0, a), a2, (Set<C14140t0>) null, new C14254e(this));
            Collection<D> d = C14169a.m89661d(fVar, C13563a1.m87391j(z0, a2), collection, mo72826C(), mo72877w().mo72914a().mo72765c(), mo72877w().mo72914a().mo72773k().mo74089a());
            C13706o.m87928e(d, "resolveOverridesForNonSt…rridingUtil\n            )");
            collection.addAll(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Set<C16157f> mo72838t(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        if (this.f62998o.mo68975o()) {
            return mo72449b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((C14232b) mo72878y().invoke()).mo72797f());
        Collection<C14900e0> l = mo72826C().mo62171j().mo72370l();
        C13706o.m87928e(l, "ownerDescriptor.typeConstructor.supertypes");
        for (C14900e0 n : l) {
            boolean unused = C13624y.m87797z(linkedHashSet, n.mo72955n().mo72448a());
        }
        return linkedHashSet;
    }

    public String toString() {
        return "Lazy Java member scope for " + this.f62998o.mo68968e();
    }

    /* renamed from: w0 */
    public final C17006i<List<C13944d>> mo72840w0() {
        return this.f63000q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C13948e mo72826C() {
        return this.f62997n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C14146w0 mo72842z() {
        return C14650d.m91625l(mo72826C());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14249g(C14301g gVar, C13948e eVar, C12492g gVar2, boolean z, C14249g gVar3) {
        super(gVar, gVar3);
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(eVar, "ownerDescriptor");
        C13706o.m87929f(gVar2, "jClass");
        this.f62997n = eVar;
        this.f62998o = gVar2;
        this.f62999p = z;
        this.f63000q = gVar.mo72918e().mo80221f(new C14255f(this, gVar));
        this.f63001r = gVar.mo72918e().mo80221f(new C14258i(this));
        this.f63002s = gVar.mo72918e().mo80221f(new C14256g(this));
        this.f63003t = gVar.mo72918e().mo80217b(new C14259j(this, gVar));
    }
}
