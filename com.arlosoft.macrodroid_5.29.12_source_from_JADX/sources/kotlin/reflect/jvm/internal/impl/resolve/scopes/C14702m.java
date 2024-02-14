package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13939b1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.C14607d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14698k;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import p263fb.C12253b;
import p272gc.C12338a;
import p297ja.C13321g;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.m */
/* compiled from: SubstitutingScope.kt */
public final class C14702m implements C14692h {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14692h f63730b;

    /* renamed from: c */
    private final C14945l1 f63731c;

    /* renamed from: d */
    private Map<C14064m, C14064m> f63732d;

    /* renamed from: e */
    private final C13321g f63733e = C13323i.m85669b(new C14703a(this));

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.m$a */
    /* compiled from: SubstitutingScope.kt */
    static final class C14703a extends C13708q implements C16254a<Collection<? extends C14064m>> {
        final /* synthetic */ C14702m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14703a(C14702m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* renamed from: a */
        public final Collection<C14064m> invoke() {
            C14702m mVar = this.this$0;
            return mVar.m91900k(C14698k.C14699a.m91887a(mVar.f63730b, (C14683d) null, (C16265l) null, 3, (Object) null));
        }
    }

    public C14702m(C14692h hVar, C14945l1 l1Var) {
        C13706o.m87929f(hVar, "workerScope");
        C13706o.m87929f(l1Var, "givenSubstitutor");
        this.f63730b = hVar;
        C14936j1 j = l1Var.mo74211j();
        C13706o.m87928e(j, "givenSubstitutor.substitution");
        this.f63731c = C14607d.m91516f(j, false, 1, (Object) null).mo74203c();
    }

    /* renamed from: j */
    private final Collection<C14064m> m91899j() {
        return (Collection) this.f63733e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final <D extends C14064m> Collection<D> m91900k(Collection<? extends D> collection) {
        if (this.f63731c.mo74212k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g = C12338a.m83077g(collection.size());
        Iterator<? extends D> it = collection.iterator();
        while (it.hasNext()) {
            g.add(m91901l((C14064m) it.next()));
        }
        return g;
    }

    /* renamed from: l */
    private final <D extends C14064m> D m91901l(D d) {
        if (this.f63731c.mo74212k()) {
            return d;
        }
        if (this.f63732d == null) {
            this.f63732d = new HashMap();
        }
        Map<C14064m, C14064m> map = this.f63732d;
        C13706o.m87926c(map);
        D d2 = map.get(d);
        if (d2 == null) {
            if (d instanceof C13939b1) {
                d2 = ((C13939b1) d).mo72267c(this.f63731c);
                if (d2 != null) {
                    map.put(d, d2);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d).toString());
            }
        }
        D d3 = (C14064m) d2;
        C13706o.m87927d(d3, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d3;
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        return this.f63730b.mo72448a();
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        return this.f63730b.mo72449b();
    }

    /* renamed from: c */
    public Collection<? extends C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return m91900k(this.f63730b.mo72450c(fVar, bVar));
    }

    /* renamed from: d */
    public Collection<? extends C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return m91900k(this.f63730b.mo72451d(fVar, bVar));
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C13961h e = this.f63730b.mo72800e(fVar, bVar);
        if (e != null) {
            return (C13961h) m91901l(e);
        }
        return null;
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return this.f63730b.mo72404f();
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        return m91899j();
    }
}
