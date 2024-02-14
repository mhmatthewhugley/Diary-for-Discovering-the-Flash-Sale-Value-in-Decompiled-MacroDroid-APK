package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14680c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14696i;
import p272gc.C12338a;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.h0 */
/* compiled from: SubpackagesScope.kt */
public class C13996h0 extends C14696i {

    /* renamed from: b */
    private final C13958g0 f62522b;

    /* renamed from: c */
    private final C16152c f62523c;

    public C13996h0(C13958g0 g0Var, C16152c cVar) {
        C13706o.m87929f(g0Var, "moduleDescriptor");
        C13706o.m87929f(cVar, "fqName");
        this.f62522b = g0Var;
        this.f62523c = cVar;
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return C13627z0.m87806d();
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        if (!dVar.mo73800a(C14683d.f63687c.mo73811f())) {
            return C13614t.m87748j();
        }
        if (this.f62523c.mo78558d() && dVar.mo73803l().contains(C14680c.C14682b.f63686a)) {
            return C13614t.m87748j();
        }
        Collection<C16152c> o = this.f62522b.mo72297o(this.f62523c, lVar);
        ArrayList arrayList = new ArrayList(o.size());
        for (C16152c g : o) {
            C16157f g2 = g.mo78562g();
            C13706o.m87928e(g2, "subFqName.shortName()");
            if (lVar.invoke(g2).booleanValue()) {
                C12338a.m83071a(arrayList, mo72406h(g2));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C14074p0 mo72406h(C16157f fVar) {
        C13706o.m87929f(fVar, "name");
        if (fVar.mo78588j()) {
            return null;
        }
        C13958g0 g0Var = this.f62522b;
        C16152c c = this.f62523c.mo78557c(fVar);
        C13706o.m87928e(c, "fqName.child(name)");
        C14074p0 V = g0Var.mo72295V(c);
        if (V.isEmpty()) {
            return null;
        }
        return V;
    }

    public String toString() {
        return "subpackages of " + this.f62523c + " from " + this.f62522b;
    }
}
