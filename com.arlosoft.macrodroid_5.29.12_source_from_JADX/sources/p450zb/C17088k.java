package p450zb;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14926g1;
import p362pb.C16157f;

/* renamed from: zb.k */
/* compiled from: ErrorUtils.kt */
public final class C17088k {

    /* renamed from: a */
    public static final C17088k f68644a = new C17088k();

    /* renamed from: b */
    private static final C13958g0 f68645b = C17081d.f68529a;

    /* renamed from: c */
    private static final C17077a f68646c;

    /* renamed from: d */
    private static final C14900e0 f68647d = m100540d(C17087j.CYCLIC_SUPERTYPES, new String[0]);

    /* renamed from: e */
    private static final C14900e0 f68648e = m100540d(C17087j.ERROR_PROPERTY_TYPE, new String[0]);

    /* renamed from: f */
    private static final C14140t0 f68649f;

    /* renamed from: g */
    private static final Set<C14140t0> f68650g;

    static {
        String format = String.format(C17078b.ERROR_CLASS.mo80345d(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        C13706o.m87928e(format, "format(this, *args)");
        C16157f l = C16157f.m97021l(format);
        C13706o.m87928e(l, "special(ErrorEntity.ERRO….format(\"unknown class\"))");
        f68646c = new C17077a(l);
        C17082e eVar = new C17082e();
        f68649f = eVar;
        f68650g = C13625y0.m87800c(eVar);
    }

    private C17088k() {
    }

    /* renamed from: a */
    public static final C17083f m100538a(C17084g gVar, boolean z, String... strArr) {
        C13706o.m87929f(gVar, "kind");
        C13706o.m87929f(strArr, "formatParams");
        return z ? new C17089l(gVar, (String[]) Arrays.copyOf(strArr, strArr.length)) : new C17083f(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: b */
    public static final C17083f m100539b(C17084g gVar, String... strArr) {
        C13706o.m87929f(gVar, "kind");
        C13706o.m87929f(strArr, "formatParams");
        return m100538a(gVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public static final C17085h m100540d(C17087j jVar, String... strArr) {
        C13706o.m87929f(jVar, "kind");
        C13706o.m87929f(strArr, "formatParams");
        return f68644a.mo80364g(jVar, C13614t.m87748j(), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: m */
    public static final boolean m100541m(C14064m mVar) {
        if (mVar != null) {
            C17088k kVar = f68644a;
            if (kVar.m100542n(mVar) || kVar.m100542n(mVar.mo62163b()) || mVar == f68645b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m100542n(C14064m mVar) {
        return mVar instanceof C17077a;
    }

    /* renamed from: o */
    public static final boolean m100543o(C14900e0 e0Var) {
        if (e0Var == null) {
            return false;
        }
        C14901e1 N0 = e0Var.mo73702N0();
        if (!(N0 instanceof C17086i) || ((C17086i) N0).mo80356e() != C17087j.UNINFERRED_TYPE_VARIABLE) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final C17085h mo80361c(C17087j jVar, C14901e1 e1Var, String... strArr) {
        C13706o.m87929f(jVar, "kind");
        C13706o.m87929f(e1Var, "typeConstructor");
        C13706o.m87929f(strArr, "formatParams");
        return mo80363f(jVar, C13614t.m87748j(), e1Var, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public final C17086i mo80362e(C17087j jVar, String... strArr) {
        C13706o.m87929f(jVar, "kind");
        C13706o.m87929f(strArr, "formatParams");
        return new C17086i(jVar, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: f */
    public final C17085h mo80363f(C17087j jVar, List<? extends C14926g1> list, C14901e1 e1Var, String... strArr) {
        C13706o.m87929f(jVar, "kind");
        C13706o.m87929f(list, "arguments");
        C13706o.m87929f(e1Var, "typeConstructor");
        C13706o.m87929f(strArr, "formatParams");
        return new C17085h(e1Var, m100539b(C17084g.ERROR_TYPE_SCOPE, e1Var.toString()), jVar, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: g */
    public final C17085h mo80364g(C17087j jVar, List<? extends C14926g1> list, String... strArr) {
        C13706o.m87929f(jVar, "kind");
        C13706o.m87929f(list, "arguments");
        C13706o.m87929f(strArr, "formatParams");
        return mo80363f(jVar, list, mo80362e(jVar, (String[]) Arrays.copyOf(strArr, strArr.length)), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: h */
    public final C17077a mo80365h() {
        return f68646c;
    }

    /* renamed from: i */
    public final C13958g0 mo80366i() {
        return f68645b;
    }

    /* renamed from: j */
    public final Set<C14140t0> mo80367j() {
        return f68650g;
    }

    /* renamed from: k */
    public final C14900e0 mo80368k() {
        return f68648e;
    }

    /* renamed from: l */
    public final C14900e0 mo80369l() {
        return f68647d;
    }
}
