package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14072o0;
import kotlin.reflect.jvm.internal.impl.load.java.C14325o;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.C14306k;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C14261h;
import p272gc.C12338a;
import p288ib.C12507u;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p442yb.C16981a;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.f */
/* compiled from: LazyJavaPackageFragmentProvider.kt */
public final class C14299f implements C14072o0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14301g f63059a;

    /* renamed from: b */
    private final C16981a<C16152c, C14261h> f63060b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.f$a */
    /* compiled from: LazyJavaPackageFragmentProvider.kt */
    static final class C14300a extends C13708q implements C16254a<C14261h> {
        final /* synthetic */ C12507u $jPackage;
        final /* synthetic */ C14299f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14300a(C14299f fVar, C12507u uVar) {
            super(0);
            this.this$0 = fVar;
            this.$jPackage = uVar;
        }

        /* renamed from: a */
        public final C14261h invoke() {
            return new C14261h(this.this$0.f63059a, this.$jPackage);
        }
    }

    public C14299f(C14225b bVar) {
        C13706o.m87929f(bVar, "components");
        C14301g gVar = new C14301g(bVar, C14306k.C14307a.f63072a, C13325j.m85670c(null));
        this.f63059a = gVar;
        this.f63060b = gVar.mo72918e().mo80218c();
    }

    /* renamed from: e */
    private final C14261h m90145e(C16152c cVar) {
        C12507u a = C14325o.C14326a.m90245a(this.f63059a.mo72914a().mo72766d(), cVar, false, 2, (Object) null);
        if (a == null) {
            return null;
        }
        return this.f63060b.mo80212a(cVar, new C14300a(this, a));
    }

    /* renamed from: a */
    public boolean mo72408a(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return C14325o.C14326a.m90245a(this.f63059a.mo72914a().mo72766d(), cVar, false, 2, (Object) null) == null;
    }

    /* renamed from: b */
    public List<C14261h> mo72409b(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return C13614t.m87752n(m90145e(cVar));
    }

    /* renamed from: c */
    public void mo72410c(C16152c cVar, Collection<C14050k0> collection) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(collection, "packageFragments");
        C12338a.m83071a(collection, m90145e(cVar));
    }

    /* renamed from: f */
    public List<C16152c> mo72411o(C16152c cVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(lVar, "nameFilter");
        C14261h e = m90145e(cVar);
        List<C16152c> O0 = e != null ? e.mo72857O0() : null;
        return O0 == null ? C13614t.m87748j() : O0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f63059a.mo72914a().mo72775m();
    }
}
