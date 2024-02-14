package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import p362pb.C16151b;
import p362pb.C16152c;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.d */
/* compiled from: JavaToKotlinClassMapper.kt */
public final class C13873d {

    /* renamed from: a */
    public static final C13873d f62132a = new C13873d();

    private C13873d() {
    }

    /* renamed from: f */
    public static /* synthetic */ C13948e m88370f(C13873d dVar, C16152c cVar, C13853h hVar, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        return dVar.mo72188e(cVar, hVar, num);
    }

    /* renamed from: a */
    public final C13948e mo72184a(C13948e eVar) {
        C13706o.m87929f(eVar, "mutable");
        C16152c o = C13871c.f62112a.mo72175o(C14650d.m91626m(eVar));
        if (o != null) {
            C13948e o2 = C16519a.m98613f(eVar).mo72142o(o);
            C13706o.m87928e(o2, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o2;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "mutable" + " collection");
    }

    /* renamed from: b */
    public final C13948e mo72185b(C13948e eVar) {
        C13706o.m87929f(eVar, "readOnly");
        C16152c p = C13871c.f62112a.mo72176p(C14650d.m91626m(eVar));
        if (p != null) {
            C13948e o = C16519a.m98613f(eVar).mo72142o(p);
            C13706o.m87928e(o, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return o;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "read-only" + " collection");
    }

    /* renamed from: c */
    public final boolean mo72186c(C13948e eVar) {
        C13706o.m87929f(eVar, "mutable");
        return C13871c.f62112a.mo72171k(C14650d.m91626m(eVar));
    }

    /* renamed from: d */
    public final boolean mo72187d(C13948e eVar) {
        C13706o.m87929f(eVar, "readOnly");
        return C13871c.f62112a.mo72172l(C14650d.m91626m(eVar));
    }

    /* renamed from: e */
    public final C13948e mo72188e(C16152c cVar, C13853h hVar, Integer num) {
        C16151b bVar;
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(hVar, "builtIns");
        if (num == null || !C13706o.m87924a(cVar, C13871c.f62112a.mo72169h())) {
            bVar = C13871c.f62112a.mo72173m(cVar);
        } else {
            bVar = C13902k.m88454a(num.intValue());
        }
        if (bVar != null) {
            return hVar.mo72142o(bVar.mo78544b());
        }
        return null;
    }

    /* renamed from: g */
    public final Collection<C13948e> mo72189g(C16152c cVar, C13853h hVar) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(hVar, "builtIns");
        C13948e f = m88370f(this, cVar, hVar, (Integer) null, 4, (Object) null);
        if (f == null) {
            return C13627z0.m87806d();
        }
        C16152c p = C13871c.f62112a.mo72176p(C16519a.m98616i(f));
        if (p == null) {
            return C13625y0.m87800c(f);
        }
        C13948e o = hVar.mo72142o(p);
        C13706o.m87928e(o, "builtIns.getBuiltInClass…otlinMutableAnalogFqName)");
        return C13614t.m87751m(f, o);
    }
}
