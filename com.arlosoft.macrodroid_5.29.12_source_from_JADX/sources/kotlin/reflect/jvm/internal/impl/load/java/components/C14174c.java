package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.load.java.C14163a0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14237e;
import p288ib.C12479a;
import p288ib.C12486d;
import p297ja.C13337s;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.c */
/* compiled from: JavaAnnotationMapper.kt */
public final class C14174c {

    /* renamed from: a */
    public static final C14174c f62850a = new C14174c();

    /* renamed from: b */
    private static final C16157f f62851b;

    /* renamed from: c */
    private static final C16157f f62852c;

    /* renamed from: d */
    private static final C16157f f62853d;

    /* renamed from: e */
    private static final Map<C16152c, C16152c> f62854e = C13615t0.m87762l(C13337s.m85692a(C13902k.C13903a.f62217H, C14163a0.f62787d), C13337s.m85692a(C13902k.C13903a.f62224L, C14163a0.f62789f), C13337s.m85692a(C13902k.C13903a.f62228P, C14163a0.f62792i));

    static {
        C16157f i = C16157f.m97019i("message");
        C13706o.m87928e(i, "identifier(\"message\")");
        f62851b = i;
        C16157f i2 = C16157f.m97019i("allowedTargets");
        C13706o.m87928e(i2, "identifier(\"allowedTargets\")");
        f62852c = i2;
        C16157f i3 = C16157f.m97019i("value");
        C13706o.m87928e(i3, "identifier(\"value\")");
        f62853d = i3;
    }

    private C14174c() {
    }

    /* renamed from: f */
    public static /* synthetic */ C13915c m89675f(C14174c cVar, C12479a aVar, C14301g gVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return cVar.mo72693e(aVar, gVar, z);
    }

    /* renamed from: a */
    public final C13915c mo72689a(C16152c cVar, C12486d dVar, C14301g gVar) {
        C12479a H;
        C13706o.m87929f(cVar, "kotlinName");
        C13706o.m87929f(dVar, "annotationOwner");
        C13706o.m87929f(gVar, "c");
        if (C13706o.m87924a(cVar, C13902k.C13903a.f62287y)) {
            C16152c cVar2 = C14163a0.f62791h;
            C13706o.m87928e(cVar2, "DEPRECATED_ANNOTATION");
            C12479a H2 = dVar.mo68961H(cVar2);
            if (H2 != null || dVar.mo68962I()) {
                return new C14177e(H2, gVar);
            }
        }
        C16152c cVar3 = f62854e.get(cVar);
        if (cVar3 == null || (H = dVar.mo68961H(cVar3)) == null) {
            return null;
        }
        return m89675f(f62850a, H, gVar, false, 4, (Object) null);
    }

    /* renamed from: b */
    public final C16157f mo72690b() {
        return f62851b;
    }

    /* renamed from: c */
    public final C16157f mo72691c() {
        return f62853d;
    }

    /* renamed from: d */
    public final C16157f mo72692d() {
        return f62852c;
    }

    /* renamed from: e */
    public final C13915c mo72693e(C12479a aVar, C14301g gVar, boolean z) {
        C13706o.m87929f(aVar, "annotation");
        C13706o.m87929f(gVar, "c");
        C16151b d = aVar.mo68950d();
        if (C13706o.m87924a(d, C16151b.m96975m(C14163a0.f62787d))) {
            return new C14185i(aVar, gVar);
        }
        if (C13706o.m87924a(d, C16151b.m96975m(C14163a0.f62789f))) {
            return new C14183h(aVar, gVar);
        }
        if (C13706o.m87924a(d, C16151b.m96975m(C14163a0.f62792i))) {
            return new C14172b(gVar, aVar, C13902k.C13903a.f62228P);
        }
        if (C13706o.m87924a(d, C16151b.m96975m(C14163a0.f62791h))) {
            return null;
        }
        return new C14237e(gVar, aVar, z);
    }
}
