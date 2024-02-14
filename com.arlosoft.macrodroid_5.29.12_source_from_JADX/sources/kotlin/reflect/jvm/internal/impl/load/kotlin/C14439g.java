package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14785g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14810t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14749e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14774i;
import p297ja.C13328m;
import p298jb.C13359a;
import p308kb.C13455c;
import p308kb.C13488l;
import p349ob.C15834e;
import p349ob.C15836f;
import p349ob.C15841i;
import p362pb.C16157f;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.g */
/* compiled from: DeserializedDescriptorResolver.kt */
public final class C14439g {

    /* renamed from: b */
    public static final C14440a f63271b = new C14440a((C13695i) null);

    /* renamed from: c */
    private static final Set<C13359a.C13360a> f63272c = C13625y0.m87800c(C13359a.C13360a.CLASS);

    /* renamed from: d */
    private static final Set<C13359a.C13360a> f63273d = C13627z0.m87809g(C13359a.C13360a.FILE_FACADE, C13359a.C13360a.MULTIFILE_CLASS_PART);

    /* renamed from: e */
    private static final C15834e f63274e = new C15834e(1, 1, 2);

    /* renamed from: f */
    private static final C15834e f63275f = new C15834e(1, 1, 11);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C15834e f63276g = new C15834e(1, 1, 13);

    /* renamed from: a */
    public C14794k f63277a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.g$a */
    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class C14440a {
        private C14440a() {
        }

        public /* synthetic */ C14440a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C15834e mo73166a() {
            return C14439g.f63276g;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.g$b */
    /* compiled from: DeserializedDescriptorResolver.kt */
    static final class C14441b extends C13708q implements C16254a<Collection<? extends C16157f>> {

        /* renamed from: a */
        public static final C14441b f63278a = new C14441b();

        C14441b() {
            super(0);
        }

        /* renamed from: a */
        public final Collection<C16157f> invoke() {
            return C13614t.m87748j();
        }
    }

    /* renamed from: c */
    private final C14749e m90589c(C14459q qVar) {
        if (mo73161d().mo73965g().mo73984d()) {
            return C14749e.STABLE;
        }
        if (qVar.mo67427b().mo70768j()) {
            return C14749e.FIR_UNSTABLE;
        }
        if (qVar.mo67427b().mo70769k()) {
            return C14749e.IR_UNSTABLE;
        }
        return C14749e.STABLE;
    }

    /* renamed from: e */
    private final C14810t<C15834e> m90590e(C14459q qVar) {
        if (m90591f() || qVar.mo67427b().mo70763d().mo75618h()) {
            return null;
        }
        return new C14810t<>(qVar.mo67427b().mo70763d(), C15834e.f65279i, qVar.getLocation(), qVar.mo67429d());
    }

    /* renamed from: f */
    private final boolean m90591f() {
        return mo73161d().mo73965g().mo73985e();
    }

    /* renamed from: g */
    private final boolean m90592g(C14459q qVar) {
        return !mo73161d().mo73965g().mo73982b() && qVar.mo67427b().mo70767i() && C13706o.m87924a(qVar.mo67427b().mo70763d(), f63275f);
    }

    /* renamed from: h */
    private final boolean m90593h(C14459q qVar) {
        return (mo73161d().mo73965g().mo73986f() && (qVar.mo67427b().mo70767i() || C13706o.m87924a(qVar.mo67427b().mo70763d(), f63274e))) || m90592g(qVar);
    }

    /* renamed from: j */
    private final String[] m90594j(C14459q qVar, Set<? extends C13359a.C13360a> set) {
        C13359a b = qVar.mo67427b();
        String[] a = b.mo70760a();
        if (a == null) {
            a = b.mo70761b();
        }
        if (a == null || !set.contains(b.mo70762c())) {
            return null;
        }
        return a;
    }

    /* renamed from: b */
    public final C14692h mo73160b(C14050k0 k0Var, C14459q qVar) {
        String[] g;
        C13328m<C15836f, C13488l> mVar;
        C13706o.m87929f(k0Var, "descriptor");
        C13706o.m87929f(qVar, "kotlinClass");
        String[] j = m90594j(qVar, f63273d);
        if (j == null || (g = qVar.mo67427b().mo70766g()) == null) {
            return null;
        }
        try {
            mVar = C15841i.m95465m(j, g);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + qVar.getLocation(), e);
        } catch (Throwable th) {
            if (m90591f() || qVar.mo67427b().mo70763d().mo75618h()) {
                throw th;
            }
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        C13488l b = mVar.mo70153b();
        C15836f a = mVar.mo70152a();
        C14445k kVar = new C14445k(qVar, b, a, m90590e(qVar), m90593h(qVar), m90589c(qVar));
        return new C14774i(k0Var, b, a, qVar.mo67427b().mo70763d(), kVar, mo73161d(), "scope for " + kVar + " in " + k0Var, C14441b.f63278a);
    }

    /* renamed from: d */
    public final C14794k mo73161d() {
        C14794k kVar = this.f63277a;
        if (kVar != null) {
            return kVar;
        }
        C13706o.m87945v("components");
        return null;
    }

    /* renamed from: i */
    public final C14785g mo73162i(C14459q qVar) {
        String[] g;
        C13328m<C15836f, C13455c> mVar;
        C13706o.m87929f(qVar, "kotlinClass");
        String[] j = m90594j(qVar, f63272c);
        if (j == null || (g = qVar.mo67427b().mo70766g()) == null) {
            return null;
        }
        try {
            mVar = C15841i.m95461i(j, g);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + qVar.getLocation(), e);
        } catch (Throwable th) {
            if (m90591f() || qVar.mo67427b().mo70763d().mo75618h()) {
                throw th;
            }
            mVar = null;
        }
        if (mVar == null) {
            return null;
        }
        return new C14785g(mVar.mo70152a(), mVar.mo70153b(), qVar.mo67427b().mo70763d(), new C14466s(qVar, m90590e(qVar), m90593h(qVar), m90589c(qVar)));
    }

    /* renamed from: k */
    public final C13948e mo73163k(C14459q qVar) {
        C13706o.m87929f(qVar, "kotlinClass");
        C14785g i = mo73162i(qVar);
        if (i == null) {
            return null;
        }
        return mo73161d().mo73964f().mo73950d(qVar.mo67429d(), i);
    }

    /* renamed from: l */
    public final void mo73164l(C14434e eVar) {
        C13706o.m87929f(eVar, "components");
        mo73165m(eVar.mo73156a());
    }

    /* renamed from: m */
    public final void mo73165m(C14794k kVar) {
        C13706o.m87929f(kVar, "<set-?>");
        this.f63277a = kVar;
    }
}
