package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import p263fb.C12253b;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.a */
/* compiled from: AbstractScopeAdapter.kt */
public abstract class C14677a implements C14692h {
    /* renamed from: a */
    public Set<C16157f> mo72448a() {
        return mo73794i().mo72448a();
    }

    /* renamed from: b */
    public Set<C16157f> mo72449b() {
        return mo73794i().mo72449b();
    }

    /* renamed from: c */
    public Collection<C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return mo73794i().mo72450c(fVar, bVar);
    }

    /* renamed from: d */
    public Collection<C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return mo73794i().mo72451d(fVar, bVar);
    }

    /* renamed from: e */
    public C13961h mo72800e(C16157f fVar, C12253b bVar) {
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(bVar, "location");
        return mo73794i().mo72800e(fVar, bVar);
    }

    /* renamed from: f */
    public Set<C16157f> mo72404f() {
        return mo73794i().mo72404f();
    }

    /* renamed from: g */
    public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(dVar, "kindFilter");
        C13706o.m87929f(lVar, "nameFilter");
        return mo73794i().mo72405g(dVar, lVar);
    }

    /* renamed from: h */
    public final C14692h mo73793h() {
        if (!(mo73794i() instanceof C14677a)) {
            return mo73794i();
        }
        C14692h i = mo73794i();
        C13706o.m87927d(i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C14677a) i).mo73793h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C14692h mo73794i();
}
