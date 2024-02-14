package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p263fb.C12253b;
import p362pb.C16152c;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.s */
/* compiled from: descriptorUtil.kt */
public final class C14125s {
    /* renamed from: a */
    public static final C13961h m89514a(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        C14064m b = mVar.mo62163b();
        if (b == null || (mVar instanceof C14050k0)) {
            return null;
        }
        if (!m89515b(b)) {
            return m89514a(b);
        }
        if (b instanceof C13961h) {
            return (C13961h) b;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m89515b(C14064m mVar) {
        C13706o.m87929f(mVar, "<this>");
        return mVar.mo62163b() instanceof C14050k0;
    }

    /* renamed from: c */
    public static final C13948e m89516c(C13958g0 g0Var, C16152c cVar, C12253b bVar) {
        C14064m mVar;
        C14692h T;
        C13706o.m87929f(g0Var, "<this>");
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(bVar, "lookupLocation");
        if (cVar.mo78558d()) {
            return null;
        }
        C16152c e = cVar.mo78559e();
        C13706o.m87928e(e, "fqName.parent()");
        C14692h n = g0Var.mo72295V(e).mo72524n();
        C16157f g = cVar.mo78562g();
        C13706o.m87928e(g, "fqName.shortName()");
        C13961h e2 = n.mo72800e(g, bVar);
        C13948e eVar = e2 instanceof C13948e ? (C13948e) e2 : null;
        if (eVar != null) {
            return eVar;
        }
        C16152c e3 = cVar.mo78559e();
        C13706o.m87928e(e3, "fqName.parent()");
        C13948e c = m89516c(g0Var, e3, bVar);
        if (c == null || (T = c.mo72284T()) == null) {
            mVar = null;
        } else {
            C16157f g2 = cVar.mo78562g();
            C13706o.m87928e(g2, "fqName.shortName()");
            mVar = T.mo72800e(g2, bVar);
        }
        if (mVar instanceof C13948e) {
            return (C13948e) mVar;
        }
        return null;
    }
}
