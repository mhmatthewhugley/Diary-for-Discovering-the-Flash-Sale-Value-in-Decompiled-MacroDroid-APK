package p398tb;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.load.java.components.C14181g;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14299f;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14261h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p263fb.C12256d;
import p288ib.C12487d0;
import p288ib.C12492g;
import p362pb.C16152c;

/* renamed from: tb.c */
/* compiled from: JavaDescriptorResolver.kt */
public final class C16608c {

    /* renamed from: a */
    private final C14299f f67432a;

    /* renamed from: b */
    private final C14181g f67433b;

    public C16608c(C14299f fVar, C14181g gVar) {
        C13706o.m87929f(fVar, "packageFragmentProvider");
        C13706o.m87929f(gVar, "javaResolverCache");
        this.f67432a = fVar;
        this.f67433b = gVar;
    }

    /* renamed from: a */
    public final C14299f mo79454a() {
        return this.f67432a;
    }

    /* renamed from: b */
    public final C13948e mo79455b(C12492g gVar) {
        C13706o.m87929f(gVar, "javaClass");
        C16152c e = gVar.mo68968e();
        if (e != null && gVar.mo68967G() == C12487d0.SOURCE) {
            return this.f67433b.mo72702c(e);
        }
        C12492g m = gVar.mo68973m();
        if (m != null) {
            C13948e b = mo79455b(m);
            C14692h T = b != null ? b.mo72284T() : null;
            C14064m e2 = T != null ? T.mo72800e(gVar.getName(), C12256d.FROM_JAVA_LOADER) : null;
            if (e2 instanceof C13948e) {
                return (C13948e) e2;
            }
            return null;
        } else if (e == null) {
            return null;
        } else {
            C14299f fVar = this.f67432a;
            C16152c e3 = e.mo78559e();
            C13706o.m87928e(e3, "fqName.parent()");
            C14261h hVar = (C14261h) C13566b0.m87424Y(fVar.mo72409b(e3));
            if (hVar != null) {
                return hVar.mo72854L0(gVar);
            }
            return null;
        }
    }
}
