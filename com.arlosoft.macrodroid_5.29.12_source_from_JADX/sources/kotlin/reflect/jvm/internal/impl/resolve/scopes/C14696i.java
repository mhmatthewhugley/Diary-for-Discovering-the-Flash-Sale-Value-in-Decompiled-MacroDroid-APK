package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import p263fb.C12253b;
import p272gc.C12347d;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.i */
/* compiled from: MemberScopeImpl.kt */
public abstract class C14696i implements C14692h {
    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        Collection<C14064m> g = mo72405g(C14683d.f63707w, C12347d.m83096a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : g) {
            if (next instanceof C14156y0) {
                C16157f name = ((C14156y0) next).getName();
                C13706o.m87928e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        Collection<C14064m> g = mo72405g(C14683d.f63706v, C12347d.m83096a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : g) {
            if (next instanceof C14156y0) {
                C16157f name = ((C14156y0) next).getName();
                C13706o.m87928e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public Collection<? extends C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return C13614t.m87748j();
    }

    /* renamed from: d */
    public Collection<? extends C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return C13614t.m87748j();
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return null;
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return null;
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        return C13614t.m87748j();
    }
}
