package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13964i;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14301g;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C14459q;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14697j;
import p252eb.C12186a;
import p263fb.C12253b;
import p264fc.C12260a;
import p288ib.C12507u;
import p362pb.C16157f;
import p370qa.C16254a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d */
/* compiled from: JvmPackageScope.kt */
public final class C14235d implements C14692h {

    /* renamed from: f */
    static final /* synthetic */ C16887m<Object>[] f62963f = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C14235d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14301g f62964b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C14261h f62965c;

    /* renamed from: d */
    private final C14266i f62966d;

    /* renamed from: e */
    private final C17006i f62967e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d$a */
    /* compiled from: JvmPackageScope.kt */
    static final class C14236a extends C13708q implements C16254a<C14692h[]> {
        final /* synthetic */ C14235d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14236a(C14235d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final C14692h[] invoke() {
            Collection<C14459q> values = this.this$0.f62965c.mo72855M0().values();
            C14235d dVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (C14459q b : values) {
                C14692h b2 = dVar.f62964b.mo72914a().mo72764b().mo73160b(dVar.f62965c, b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            Object[] array = C12260a.m83003b(arrayList).toArray(new C14692h[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (C14692h[]) array;
        }
    }

    public C14235d(C14301g gVar, C12507u uVar, C14261h hVar) {
        C13706o.m87929f(gVar, "c");
        C13706o.m87929f(uVar, "jPackage");
        C13706o.m87929f(hVar, "packageFragment");
        this.f62964b = gVar;
        this.f62965c = hVar;
        this.f62966d = new C14266i(gVar, uVar, hVar);
        this.f62967e = gVar.mo72918e().mo80221f(new C14236a(this));
    }

    /* renamed from: k */
    private final C14692h[] m89878k() {
        return (C14692h[]) C17011m.m100276a(this.f62967e, this, f62963f[0]);
    }

    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        C14692h[] k = m89878k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C14692h a : k) {
            boolean unused = C13624y.m87797z(linkedHashSet, a.mo72448a());
        }
        linkedHashSet.addAll(this.f62966d.mo72448a());
        return linkedHashSet;
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        C14692h[] k = m89878k();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C14692h b : k) {
            boolean unused = C13624y.m87797z(linkedHashSet, b.mo72449b());
        }
        linkedHashSet.addAll(this.f62966d.mo72449b());
        return linkedHashSet;
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        mo72802l(fVar, bVar);
        C14266i iVar = this.f62966d;
        C14692h[] k = m89878k();
        Collection c = iVar.mo72450c(fVar, bVar);
        for (C14692h c2 : k) {
            c = C12260a.m83002a(c, c2.mo72450c(fVar, bVar));
        }
        return c == null ? C13627z0.m87806d() : c;
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        mo72802l(fVar, bVar);
        C14266i iVar = this.f62966d;
        C14692h[] k = m89878k();
        Collection d = iVar.mo72451d(fVar, bVar);
        for (C14692h d2 : k) {
            d = C12260a.m83002a(d, d2.mo72451d(fVar, bVar));
        }
        return d == null ? C13627z0.m87806d() : d;
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        mo72802l(fVar, bVar);
        C13948e P = this.f62966d.mo72800e(fVar, bVar);
        if (P != null) {
            return P;
        }
        C13961h hVar = null;
        for (C14692h e : m89878k()) {
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
        Set<C16157f> a = C14697j.m91884a(C13596m.m87620s(m89878k()));
        if (a == null) {
            return null;
        }
        a.addAll(this.f62966d.mo72404f());
        return a;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [qa.l<? super pb.f, java.lang.Boolean>, java.lang.Object, qa.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.C14064m> mo72405g(kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d r6, p370qa.C16265l<? super p362pb.C16157f, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.i r0 = r5.f62966d
            kotlin.reflect.jvm.internal.impl.resolve.scopes.h[] r1 = r5.m89878k()
            java.util.Collection r0 = r0.mo72405g(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 >= r2) goto L_0x0025
            r4 = r1[r3]
            java.util.Collection r4 = r4.mo72405g(r6, r7)
            java.util.Collection r0 = p264fc.C12260a.m83002a(r0, r4)
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0025:
            if (r0 != 0) goto L_0x002b
            java.util.Set r0 = kotlin.collections.C13627z0.m87806d()
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14235d.mo72405g(kotlin.reflect.jvm.internal.impl.resolve.scopes.d, qa.l):java.util.Collection");
    }

    /* renamed from: j */
    public final C14266i mo72801j() {
        return this.f62966d;
    }

    /* renamed from: l */
    public void mo72802l(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        C12186a.m82848b(this.f62964b.mo72914a().mo72774l(), bVar, this.f62965c, fVar);
    }

    public String toString() {
        return "scope for " + this.f62965c;
    }
}
