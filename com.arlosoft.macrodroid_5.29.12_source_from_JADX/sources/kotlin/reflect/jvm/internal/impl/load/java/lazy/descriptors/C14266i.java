package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.load.java.C14325o;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14232b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14454o;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14458p;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import p263fb.C12253b;
import p272gc.C12347d;
import p288ib.C12487d0;
import p288ib.C12492g;
import p288ib.C12507u;
import p298jb.C13359a;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p362pb.C16159h;
import p370qa.C16254a;
import p370qa.C16265l;
import p442yb.C17005h;
import p442yb.C17007j;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i */
/* compiled from: LazyJavaPackageScope.kt */
public final class C14266i extends C14296l {

    /* renamed from: n */
    private final C12507u f63016n;

    /* renamed from: o */
    private final C14261h f63017o;

    /* renamed from: p */
    private final C17007j<Set<String>> f63018p;

    /* renamed from: q */
    private final C17005h<C14267a, C13948e> f63019q;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$a */
    /* compiled from: LazyJavaPackageScope.kt */
    private static final class C14267a {

        /* renamed from: a */
        private final C16157f f63020a;

        /* renamed from: b */
        private final C12492g f63021b;

        public C14267a(C16157f fVar, C12492g gVar) {
            C13706o.m87929f(fVar, "name");
            this.f63020a = fVar;
            this.f63021b = gVar;
        }

        /* renamed from: a */
        public final C12492g mo72864a() {
            return this.f63021b;
        }

        /* renamed from: b */
        public final C16157f mo72865b() {
            return this.f63020a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C14267a) && C13706o.m87924a(this.f63020a, ((C14267a) obj).f63020a);
        }

        public int hashCode() {
            return this.f63020a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$b */
    /* compiled from: LazyJavaPackageScope.kt */
    private static abstract class C14268b {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$b$a */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C14269a extends C14268b {

            /* renamed from: a */
            private final C13948e f63022a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14269a(C13948e eVar) {
                super((C13695i) null);
                C13706o.m87929f(eVar, "descriptor");
                this.f63022a = eVar;
            }

            /* renamed from: a */
            public final C13948e mo72868a() {
                return this.f63022a;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$b$b */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C14270b extends C14268b {

            /* renamed from: a */
            public static final C14270b f63023a = new C14270b();

            private C14270b() {
                super((C13695i) null);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$b$c */
        /* compiled from: LazyJavaPackageScope.kt */
        public static final class C14271c extends C14268b {

            /* renamed from: a */
            public static final C14271c f63024a = new C14271c();

            private C14271c() {
                super((C13695i) null);
            }
        }

        private C14268b() {
        }

        public /* synthetic */ C14268b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$c */
    /* compiled from: LazyJavaPackageScope.kt */
    static final class C14272c extends C13708q implements C16265l<C14267a, C13948e> {

        /* renamed from: $c */
        final /* synthetic */ C14301g f63025$c;
        final /* synthetic */ C14266i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14272c(C14266i iVar, C14301g gVar) {
            super(1);
            this.this$0 = iVar;
            this.f63025$c = gVar;
        }

        /* renamed from: a */
        public final C13948e invoke(C14267a aVar) {
            C14454o.C14455a aVar2;
            byte[] bArr;
            C13706o.m87929f(aVar, "request");
            C16151b bVar = new C16151b(this.this$0.mo72826C().mo72551e(), aVar.mo72865b());
            if (aVar.mo72864a() != null) {
                aVar2 = this.f63025$c.mo72914a().mo72772j().mo67437b(aVar.mo72864a());
            } else {
                aVar2 = this.f63025$c.mo72914a().mo72772j().mo67438c(bVar);
            }
            C14459q a = aVar2 != null ? aVar2.mo73201a() : null;
            C16151b d = a != null ? a.mo67429d() : null;
            if (d != null && (d.mo78554l() || d.mo78553k())) {
                return null;
            }
            C14268b M = this.this$0.m90037R(a);
            if (M instanceof C14268b.C14269a) {
                return ((C14268b.C14269a) M).mo72868a();
            }
            if (M instanceof C14268b.C14271c) {
                return null;
            }
            if (M instanceof C14268b.C14270b) {
                C12492g a2 = aVar.mo72864a();
                if (a2 == null) {
                    C14325o d2 = this.f63025$c.mo72914a().mo72766d();
                    if (aVar2 != null) {
                        if (!(aVar2 instanceof C14454o.C14455a.C14456a)) {
                            aVar2 = null;
                        }
                        C14454o.C14455a.C14456a aVar3 = (C14454o.C14455a.C14456a) aVar2;
                        if (aVar3 != null) {
                            bArr = aVar3.mo73202b();
                            a2 = d2.mo67423a(new C14325o.C14327b(bVar, bArr, (C12492g) null, 4, (C13695i) null));
                        }
                    }
                    bArr = null;
                    a2 = d2.mo67423a(new C14325o.C14327b(bVar, bArr, (C12492g) null, 4, (C13695i) null));
                }
                C12492g gVar = a2;
                if ((gVar != null ? gVar.mo68967G() : null) != C12487d0.BINARY) {
                    C16152c e = gVar != null ? gVar.mo68968e() : null;
                    if (e == null || e.mo78558d() || !C13706o.m87924a(e.mo78559e(), this.this$0.mo72826C().mo72551e())) {
                        return null;
                    }
                    C14241f fVar = new C14241f(this.f63025$c, this.this$0.mo72826C(), gVar, (C13948e) null, 8, (C13695i) null);
                    this.f63025$c.mo72914a().mo72767e().mo72971a(fVar);
                    return fVar;
                }
                throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + C14458p.m90654a(this.f63025$c.mo72914a().mo72772j(), gVar) + "\nfindKotlinClass(ClassId) = " + C14458p.m90655b(this.f63025$c.mo72914a().mo72772j(), bVar) + 10);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i$d */
    /* compiled from: LazyJavaPackageScope.kt */
    static final class C14273d extends C13708q implements C16254a<Set<? extends String>> {

        /* renamed from: $c */
        final /* synthetic */ C14301g f63026$c;
        final /* synthetic */ C14266i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14273d(C14301g gVar, C14266i iVar) {
            super(0);
            this.f63026$c = gVar;
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final Set<String> invoke() {
            return this.f63026$c.mo72914a().mo72766d().mo67424b(this.this$0.mo72826C().mo72551e());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14266i(C14301g gVar, C12507u uVar, C14261h hVar) {
        super(gVar);
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(uVar, "jPackage");
        C13706o.m87929f(hVar, "ownerDescriptor");
        this.f63016n = uVar;
        this.f63017o = hVar;
        this.f63018p = gVar.mo72918e().mo80219d(new C14273d(gVar, this));
        this.f63019q = gVar.mo72918e().mo80217b(new C14272c(this, gVar));
    }

    /* renamed from: N */
    private final C13948e m90036N(C16157f fVar, C12492g gVar) {
        if (!C16159h.f66302a.mo78590a(fVar)) {
            return null;
        }
        Set set = (Set) this.f63018p.invoke();
        if (gVar != null || set == null || set.contains(fVar.mo78583d())) {
            return this.f63019q.invoke(new C14267a(fVar, gVar));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final C14268b m90037R(C14459q qVar) {
        if (qVar == null) {
            return C14268b.C14270b.f63023a;
        }
        if (qVar.mo67427b().mo70762c() != C13359a.C13360a.CLASS) {
            return C14268b.C14271c.f63024a;
        }
        C13948e k = mo72877w().mo72914a().mo72764b().mo73163k(qVar);
        return k != null ? new C14268b.C14269a(k) : C14268b.C14270b.f63023a;
    }

    /* renamed from: O */
    public final C13948e mo72861O(C12492g gVar) {
        C13706o.m87929f(gVar, "javaClass");
        return m90036N(gVar.getName(), gVar);
    }

    /* renamed from: P */
    public C13948e mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return m90036N(fVar, (C12492g) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public C14261h mo72826C() {
        return this.f63017o;
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return C13614t.m87748j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C14064m> mo72405g(kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d r5, p370qa.C16265l<? super p362pb.C16157f, java.lang.Boolean> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d$a r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d.f63687c
            int r1 = r0.mo73808c()
            int r0 = r0.mo73810e()
            r0 = r0 | r1
            boolean r5 = r5.mo73800a(r0)
            if (r5 != 0) goto L_0x0020
            java.util.List r5 = kotlin.collections.C13614t.m87748j()
            goto L_0x0065
        L_0x0020:
            yb.i r5 = r4.mo72876v()
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0033:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.m r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C14064m) r2
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13948e
            if (r3 == 0) goto L_0x005d
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.descriptors.C13948e) r2
            pb.f r2 = r2.getName()
            java.lang.String r3 = "it.name"
            kotlin.jvm.internal.C13706o.m87928e(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0033
            r0.add(r1)
            goto L_0x0033
        L_0x0064:
            r5 = r0
        L_0x0065:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14266i.mo72405g(kotlin.reflect.jvm.internal.impl.resolve.scopes.d, qa.l):java.util.Collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Set<C16157f> mo72832l(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        if (!dVar.mo73800a(C14683d.f63687c.mo73810e())) {
            return C13627z0.m87806d();
        }
        Set<String> set = (Set) this.f63018p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String i : set) {
                hashSet.add(C16157f.m97019i(i));
            }
            return hashSet;
        }
        C12507u uVar = this.f63016n;
        if (lVar == null) {
            lVar = C12347d.m83096a();
        }
        Collection<C12492g> A = uVar.mo69005A(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C12492g gVar : A) {
            C16157f name = gVar.mo68967G() == C12487d0.SOURCE ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public Set<C16157f> mo72833n(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        return C13627z0.m87806d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C14232b mo72835p() {
        return C14232b.C14233a.f62962a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo72836r(Collection<C14156y0> collection, C16157f fVar) {
        C13706o.m87929f(collection, "result");
        C13706o.m87929f(fVar, "name");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Set<C16157f> mo72838t(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        return C13627z0.m87806d();
    }
}
