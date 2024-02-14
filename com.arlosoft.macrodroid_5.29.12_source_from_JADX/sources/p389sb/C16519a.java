package p389sb;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13964i;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14157z;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import kotlin.reflect.jvm.internal.impl.types.checker.C14851h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14864p;
import kotlin.reflect.jvm.internal.impl.types.checker.C14880x;
import kotlin.sequences.C15118h;
import p263fb.C12253b;
import p272gc.C12339b;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;
import p370qa.C16265l;
import p433xa.C16878g;

/* renamed from: sb.a */
/* compiled from: DescriptorUtils.kt */
public final class C16519a {

    /* renamed from: a */
    private static final C16157f f67239a;

    /* renamed from: sb.a$a */
    /* compiled from: DescriptorUtils.kt */
    static final class C16520a<N> implements C12339b.C12342c {

        /* renamed from: a */
        public static final C16520a<N> f67240a = new C16520a<>();

        C16520a() {
        }

        /* renamed from: b */
        public final Iterable<C13966i1> mo68671a(C13966i1 i1Var) {
            Collection<C13966i1> d = i1Var.mo72234d();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(d, 10));
            for (C13966i1 a : d) {
                arrayList.add(a.mo72233a());
            }
            return arrayList;
        }
    }

    /* renamed from: sb.a$b */
    /* compiled from: DescriptorUtils.kt */
    /* synthetic */ class C16521b extends C13703l implements C16265l<C13966i1, Boolean> {

        /* renamed from: a */
        public static final C16521b f67241a = new C16521b();

        C16521b() {
            super(1);
        }

        public final String getName() {
            return "declaresDefaultValue";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C13966i1.class);
        }

        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }

        /* renamed from: l */
        public final Boolean invoke(C13966i1 i1Var) {
            C13706o.m87929f(i1Var, "p0");
            return Boolean.valueOf(i1Var.mo72302A0());
        }
    }

    /* renamed from: sb.a$c */
    /* compiled from: DescriptorUtils.kt */
    static final class C16522c<N> implements C12339b.C12342c {

        /* renamed from: a */
        final /* synthetic */ boolean f67242a;

        C16522c(boolean z) {
            this.f67242a = z;
        }

        /* renamed from: b */
        public final Iterable<C13936b> mo68671a(C13936b bVar) {
            Collection<? extends C13936b> collection = null;
            if (this.f67242a) {
                bVar = bVar != null ? bVar.mo72233a() : null;
            }
            if (bVar != null) {
                collection = bVar.mo72234d();
            }
            return collection == null ? C13614t.m87748j() : collection;
        }
    }

    /* renamed from: sb.a$d */
    /* compiled from: DescriptorUtils.kt */
    public static final class C16523d extends C12339b.C12341b<C13936b, C13936b> {

        /* renamed from: a */
        final /* synthetic */ C13684d0<C13936b> f67243a;

        /* renamed from: b */
        final /* synthetic */ C16265l<C13936b, Boolean> f67244b;

        C16523d(C13684d0<C13936b> d0Var, C16265l<? super C13936b, Boolean> lVar) {
            this.f67243a = d0Var;
            this.f67244b = lVar;
        }

        /* renamed from: d */
        public void mo68670b(C13936b bVar) {
            C13706o.m87929f(bVar, "current");
            if (this.f67243a.element == null && this.f67244b.invoke(bVar).booleanValue()) {
                this.f67243a.element = bVar;
            }
        }

        /* renamed from: e */
        public boolean mo68668c(C13936b bVar) {
            C13706o.m87929f(bVar, "current");
            return this.f67243a.element == null;
        }

        /* renamed from: f */
        public C13936b mo68667a() {
            return (C13936b) this.f67243a.element;
        }
    }

    /* renamed from: sb.a$e */
    /* compiled from: DescriptorUtils.kt */
    static final class C16524e extends C13708q implements C16265l<C14064m, C14064m> {

        /* renamed from: a */
        public static final C16524e f67245a = new C16524e();

        C16524e() {
            super(1);
        }

        /* renamed from: a */
        public final C14064m invoke(C14064m mVar) {
            C13706o.m87929f(mVar, "it");
            return mVar.mo62163b();
        }
    }

    static {
        C16157f i = C16157f.m97019i("value");
        C13706o.m87928e(i, "identifier(\"value\")");
        f67239a = i;
    }

    /* renamed from: a */
    public static final boolean m98608a(C13966i1 i1Var) {
        C13706o.m87929f(i1Var, "<this>");
        Boolean e = C12339b.m83082e(C13612s.m87736e(i1Var), C16520a.f67240a, C16521b.f67241a);
        C13706o.m87928e(e, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return e.booleanValue();
    }

    /* renamed from: b */
    public static final C13936b m98609b(C13936b bVar, boolean z, C16265l<? super C13936b, Boolean> lVar) {
        C13706o.m87929f(bVar, "<this>");
        C13706o.m87929f(lVar, "predicate");
        return (C13936b) C12339b.m83079b(C13612s.m87736e(bVar), new C16522c(z), new C16523d(new C13684d0(), lVar));
    }

    /* renamed from: c */
    public static /* synthetic */ C13936b m98610c(C13936b bVar, boolean z, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m98609b(bVar, z, lVar);
    }

    /* renamed from: d */
    public static final C16152c m98611d(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        C16153d i = m98616i(mVar);
        if (!i.mo78572f()) {
            i = null;
        }
        if (i != null) {
            return i.mo78579l();
        }
        return null;
    }

    /* renamed from: e */
    public static final C13948e m98612e(C13915c cVar) {
        C13706o.m87929f(cVar, "<this>");
        C13961h c = cVar.getType().mo73702N0().mo62183c();
        if (c instanceof C13948e) {
            return (C13948e) c;
        }
        return null;
    }

    /* renamed from: f */
    public static final C13853h m98613f(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        return m98619l(mVar).mo72296m();
    }

    /* renamed from: g */
    public static final C16151b m98614g(C13961h hVar) {
        C14064m b;
        C16151b g;
        if (hVar == null || (b = hVar.mo62163b()) == null) {
            return null;
        }
        if (b instanceof C14050k0) {
            return new C16151b(((C14050k0) b).mo72551e(), hVar.getName());
        }
        if (!(b instanceof C13964i) || (g = m98614g((C13961h) b)) == null) {
            return null;
        }
        return g.mo78546d(hVar.getName());
    }

    /* renamed from: h */
    public static final C16152c m98615h(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        C16152c n = C14650d.m91627n(mVar);
        C13706o.m87928e(n, "getFqNameSafe(this)");
        return n;
    }

    /* renamed from: i */
    public static final C16153d m98616i(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        C16153d m = C14650d.m91626m(mVar);
        C13706o.m87928e(m, "getFqName(this)");
        return m;
    }

    /* renamed from: j */
    public static final C14157z<C14951m0> m98617j(C13948e eVar) {
        Object U = eVar != null ? eVar.mo62155U() : null;
        if (U instanceof C14157z) {
            return (C14157z) U;
        }
        return null;
    }

    /* renamed from: k */
    public static final C14849g m98618k(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "<this>");
        C14864p pVar = (C14864p) g0Var.mo72293H0(C14851h.m92554a());
        C14880x xVar = pVar != null ? (C14880x) pVar.mo74097a() : null;
        if (xVar instanceof C14880x.C14881a) {
            return ((C14880x.C14881a) xVar).mo74111b();
        }
        return C14849g.C14850a.f63969a;
    }

    /* renamed from: l */
    public static final C13958g0 m98619l(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        C13958g0 g = C14650d.m91620g(mVar);
        C13706o.m87928e(g, "getContainingModule(this)");
        return g;
    }

    /* renamed from: m */
    public static final C15118h<C14064m> m98620m(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        return C15132p.m93484m(m98621n(mVar), 1);
    }

    /* renamed from: n */
    public static final C15118h<C14064m> m98621n(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        return C15125n.m93473h(mVar, C16524e.f67245a);
    }

    /* renamed from: o */
    public static final C13936b m98622o(C13936b bVar) {
        C13706o.m87929f(bVar, "<this>");
        if (!(bVar instanceof C14126s0)) {
            return bVar;
        }
        C14140t0 W = ((C14126s0) bVar).mo72327W();
        C13706o.m87928e(W, "correspondingProperty");
        return W;
    }

    /* renamed from: p */
    public static final C13948e m98623p(C13948e eVar) {
        C13706o.m87929f(eVar, "<this>");
        for (C14900e0 next : eVar.mo72274p().mo73702N0().mo72370l()) {
            if (!C13853h.m88253b0(next)) {
                C13961h c = next.mo73702N0().mo62183c();
                if (C14650d.m91636w(c)) {
                    C13706o.m87927d(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (C13948e) c;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r2 = (kotlin.reflect.jvm.internal.impl.types.checker.C14880x) r2.mo74097a();
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m98624q(kotlin.reflect.jvm.internal.impl.descriptors.C13958g0 r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.types.checker.C14851h.m92554a()
            java.lang.Object r2 = r2.mo72293H0(r0)
            kotlin.reflect.jvm.internal.impl.types.checker.p r2 = (kotlin.reflect.jvm.internal.impl.types.checker.C14864p) r2
            r0 = 1
            r1 = 0
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r2.mo74097a()
            kotlin.reflect.jvm.internal.impl.types.checker.x r2 = (kotlin.reflect.jvm.internal.impl.types.checker.C14880x) r2
            if (r2 == 0) goto L_0x0022
            boolean r2 = r2.mo74110a()
            if (r2 != r0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p389sb.C16519a.m98624q(kotlin.reflect.jvm.internal.impl.descriptors.g0):boolean");
    }

    /* renamed from: r */
    public static final C13948e m98625r(C13958g0 g0Var, C16152c cVar, C12253b bVar) {
        C13706o.m87929f(g0Var, "<this>");
        C13706o.m87929f(cVar, "topLevelClassFqName");
        C13706o.m87929f(bVar, "location");
        cVar.mo78558d();
        C16152c e = cVar.mo78559e();
        C13706o.m87928e(e, "topLevelClassFqName.parent()");
        C14692h n = g0Var.mo72295V(e).mo72524n();
        C16157f g = cVar.mo78562g();
        C13706o.m87928e(g, "topLevelClassFqName.shortName()");
        C13961h e2 = n.mo72800e(g, bVar);
        if (e2 instanceof C13948e) {
            return (C13948e) e2;
        }
        return null;
    }
}
