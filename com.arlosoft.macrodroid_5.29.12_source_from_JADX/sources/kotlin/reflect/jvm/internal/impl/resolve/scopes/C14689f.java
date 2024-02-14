package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13964i;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import p263fb.C12253b;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.f */
/* compiled from: InnerClassesScopeWrapper.kt */
public final class C14689f extends C14696i {

    /* renamed from: b */
    private final C14692h f63720b;

    public C14689f(C14692h hVar) {
        C13706o.m87929f(hVar, "workerScope");
        this.f63720b = hVar;
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        return this.f63720b.mo72448a();
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        return this.f63720b.mo72449b();
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C13961h e = this.f63720b.mo72800e(fVar, bVar);
        if (e == null) {
            return null;
        }
        C13948e eVar = e instanceof C13948e ? (C13948e) e : null;
        if (eVar != null) {
            return eVar;
        }
        if (e instanceof C13947d1) {
            return (C13947d1) e;
        }
        return null;
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return this.f63720b.mo72404f();
    }

    /* renamed from: h */
    public List<C13961h> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        C14683d n = dVar.mo73805n(C14683d.f63687c.mo73808c());
        if (n == null) {
            return C13614t.m87748j();
        }
        Collection<C14064m> g = this.f63720b.mo72405g(n, lVar);
        ArrayList arrayList = new ArrayList();
        for (T next : g) {
            if (next instanceof C13964i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f63720b;
    }
}
