package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.load.java.C14406x;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.C14310c;
import p297ja.C13321g;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.g */
/* compiled from: context.kt */
public final class C14301g {

    /* renamed from: a */
    private final C14225b f63061a;

    /* renamed from: b */
    private final C14306k f63062b;

    /* renamed from: c */
    private final C13321g<C14406x> f63063c;

    /* renamed from: d */
    private final C13321g f63064d;

    /* renamed from: e */
    private final C14310c f63065e;

    public C14301g(C14225b bVar, C14306k kVar, C13321g<C14406x> gVar) {
        C13706o.m87929f(bVar, "components");
        C13706o.m87929f(kVar, "typeParameterResolver");
        C13706o.m87929f(gVar, "delegateForDefaultTypeQualifiers");
        this.f63061a = bVar;
        this.f63062b = kVar;
        this.f63063c = gVar;
        this.f63064d = gVar;
        this.f63065e = new C14310c(this, kVar);
    }

    /* renamed from: a */
    public final C14225b mo72914a() {
        return this.f63061a;
    }

    /* renamed from: b */
    public final C14406x mo72915b() {
        return (C14406x) this.f63064d.getValue();
    }

    /* renamed from: c */
    public final C13321g<C14406x> mo72916c() {
        return this.f63063c;
    }

    /* renamed from: d */
    public final C13958g0 mo72917d() {
        return this.f63061a.mo72775m();
    }

    /* renamed from: e */
    public final C17012n mo72918e() {
        return this.f63061a.mo72783u();
    }

    /* renamed from: f */
    public final C14306k mo72919f() {
        return this.f63062b;
    }

    /* renamed from: g */
    public final C14310c mo72920g() {
        return this.f63065e;
    }
}
