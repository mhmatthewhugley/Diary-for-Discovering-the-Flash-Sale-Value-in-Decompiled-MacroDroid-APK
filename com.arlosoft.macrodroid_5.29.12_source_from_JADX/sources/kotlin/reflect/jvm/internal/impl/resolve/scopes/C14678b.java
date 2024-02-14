package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13964i;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p263fb.C12253b;
import p264fc.C12260a;
import p272gc.C12354e;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.b */
/* compiled from: ChainedMemberScope.kt */
public final class C14678b implements C14692h {

    /* renamed from: d */
    public static final C14679a f63681d = new C14679a((C13695i) null);

    /* renamed from: b */
    private final String f63682b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14692h[] f63683c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.b$a */
    /* compiled from: ChainedMemberScope.kt */
    public static final class C14679a {
        private C14679a() {
        }

        public /* synthetic */ C14679a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14692h mo73796a(String str, Iterable<? extends C14692h> iterable) {
            C13706o.m87929f(str, "debugName");
            C13706o.m87929f(iterable, "scopes");
            C12354e eVar = new C12354e();
            for (C14692h hVar : iterable) {
                if (hVar != C14692h.C14695b.f63726b) {
                    if (hVar instanceof C14678b) {
                        boolean unused = C13624y.m87792A(eVar, ((C14678b) hVar).f63683c);
                    } else {
                        eVar.add(hVar);
                    }
                }
            }
            return mo73797b(str, eVar);
        }

        /* renamed from: b */
        public final C14692h mo73797b(String str, List<? extends C14692h> list) {
            C13706o.m87929f(str, "debugName");
            C13706o.m87929f(list, "scopes");
            int size = list.size();
            if (size == 0) {
                return C14692h.C14695b.f63726b;
            }
            if (size == 1) {
                return (C14692h) list.get(0);
            }
            Object[] array = list.toArray(new C14692h[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new C14678b(str, (C14692h[]) array, (C13695i) null);
        }
    }

    private C14678b(String str, C14692h[] hVarArr) {
        this.f63682b = str;
        this.f63683c = hVarArr;
    }

    public /* synthetic */ C14678b(String str, C14692h[] hVarArr, C13695i iVar) {
        this(str, hVarArr);
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        C14692h[] hVarArr = this.f63683c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C14692h a : hVarArr) {
            boolean unused = C13624y.m87797z(linkedHashSet, a.mo72448a());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        C14692h[] hVarArr = this.f63683c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C14692h b : hVarArr) {
            boolean unused = C13624y.m87797z(linkedHashSet, b.mo72449b());
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C14692h[] hVarArr = this.f63683c;
        int length = hVarArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length == 1) {
            return hVarArr[0].mo72450c(fVar, bVar);
        }
        Collection<C14156y0> collection = null;
        for (C14692h c : hVarArr) {
            collection = C12260a.m83002a(collection, c.mo72450c(fVar, bVar));
        }
        if (collection == null) {
            return C13627z0.m87806d();
        }
        return collection;
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C14692h[] hVarArr = this.f63683c;
        int length = hVarArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length == 1) {
            return hVarArr[0].mo72451d(fVar, bVar);
        }
        Collection<C14140t0> collection = null;
        for (C14692h d : hVarArr) {
            collection = C12260a.m83002a(collection, d.mo72451d(fVar, bVar));
        }
        if (collection == null) {
            return C13627z0.m87806d();
        }
        return collection;
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C13961h hVar = null;
        for (C14692h e : this.f63683c) {
            C13961h e2 = e.mo72800e(fVar, bVar);
            if (e2 != null) {
                if (!(e2 instanceof C13964i) || !((C13964i) e2).mo62175l0()) {
                    return e2;
                }
                if (hVar == null) {
                    hVar = e2;
                }
            }
        }
        return hVar;
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return C14697j.m91884a(C13596m.m87620s(this.f63683c));
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        C14692h[] hVarArr = this.f63683c;
        int length = hVarArr.length;
        if (length == 0) {
            return C13614t.m87748j();
        }
        if (length == 1) {
            return hVarArr[0].mo72405g(dVar, lVar);
        }
        Collection<C14064m> collection = null;
        for (C14692h g : hVarArr) {
            collection = C12260a.m83002a(collection, g.mo72405g(dVar, lVar));
        }
        if (collection == null) {
            return C13627z0.m87806d();
        }
        return collection;
    }

    public String toString() {
        return this.f63682b;
    }
}
