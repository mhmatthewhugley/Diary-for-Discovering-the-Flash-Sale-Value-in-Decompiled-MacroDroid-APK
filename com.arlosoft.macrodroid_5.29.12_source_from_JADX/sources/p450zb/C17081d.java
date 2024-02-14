package p450zb;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13849e;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13952f0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: zb.d */
/* compiled from: ErrorModuleDescriptor.kt */
public final class C17081d implements C13958g0 {

    /* renamed from: a */
    public static final C17081d f68529a = new C17081d();

    /* renamed from: c */
    private static final C16157f f68530c;

    /* renamed from: d */
    private static final List<C13958g0> f68531d = C13614t.m87748j();

    /* renamed from: f */
    private static final List<C13958g0> f68532f = C13614t.m87748j();

    /* renamed from: g */
    private static final Set<C13958g0> f68533g = C13627z0.m87806d();

    /* renamed from: o */
    private static final C13853h f68534o = C13849e.f62067h.mo72110a();

    static {
        C16157f l = C16157f.m97021l(C17078b.ERROR_MODULE.mo80345d());
        C13706o.m87928e(l, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f68530c = l;
    }

    private C17081d() {
    }

    /* renamed from: H0 */
    public <T> T mo72293H0(C13952f0<T> f0Var) {
        C13706o.m87929f(f0Var, "capability");
        return null;
    }

    /* renamed from: K */
    public boolean mo72294K(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "targetModule");
        return false;
    }

    /* renamed from: V */
    public C14074p0 mo72295V(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    /* renamed from: a */
    public C14064m mo72233a() {
        return this;
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        return null;
    }

    public C13921g getAnnotations() {
        return C13921g.f62330v.mo72251b();
    }

    public C16157f getName() {
        return mo80347h0();
    }

    /* renamed from: h0 */
    public C16157f mo80347h0() {
        return f68530c;
    }

    /* renamed from: m */
    public C13853h mo72296m() {
        return f68534o;
    }

    /* renamed from: o */
    public Collection<C16152c> mo72297o(C16152c cVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(lVar, "nameFilter");
        return C13614t.m87748j();
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        C13706o.m87929f(oVar, "visitor");
        return null;
    }

    /* renamed from: z0 */
    public List<C13958g0> mo72298z0() {
        return f68532f;
    }
}
