package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14072o0;
import p272gc.C12338a;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;
import p442yb.C17005h;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a */
/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
public abstract class C14709a implements C14072o0 {

    /* renamed from: a */
    private final C17012n f63740a;

    /* renamed from: b */
    private final C14811u f63741b;

    /* renamed from: c */
    private final C13958g0 f63742c;

    /* renamed from: d */
    protected C14794k f63743d;

    /* renamed from: e */
    private final C17005h<C16152c, C14050k0> f63744e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.a$a */
    /* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
    static final class C14710a extends C13708q implements C16265l<C16152c, C14050k0> {
        final /* synthetic */ C14709a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14710a(C14709a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: a */
        public final C14050k0 invoke(C16152c cVar) {
            C13706o.m87929f(cVar, "fqName");
            C14802p d = this.this$0.mo72215d(cVar);
            if (d == null) {
                return null;
            }
            d.mo74001L0(this.this$0.mo73833e());
            return d;
        }
    }

    public C14709a(C17012n nVar, C14811u uVar, C13958g0 g0Var) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(uVar, "finder");
        C13706o.m87929f(g0Var, "moduleDescriptor");
        this.f63740a = nVar;
        this.f63741b = uVar;
        this.f63742c = g0Var;
        this.f63744e = nVar.mo80217b(new C14710a(this));
    }

    /* renamed from: a */
    public boolean mo72408a(C16152c cVar) {
        Object obj;
        C13706o.m87929f(cVar, "fqName");
        if (this.f63744e.mo80238m(cVar)) {
            obj = this.f63744e.invoke(cVar);
        } else {
            obj = mo72215d(cVar);
        }
        return obj == null;
    }

    /* renamed from: b */
    public List<C14050k0> mo72409b(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return C13614t.m87752n(this.f63744e.invoke(cVar));
    }

    /* renamed from: c */
    public void mo72410c(C16152c cVar, Collection<C14050k0> collection) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(collection, "packageFragments");
        C12338a.m83071a(collection, this.f63744e.invoke(cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C14802p mo72215d(C16152c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C14794k mo73833e() {
        C14794k kVar = this.f63743d;
        if (kVar != null) {
            return kVar;
        }
        C13706o.m87945v("components");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C14811u mo73834f() {
        return this.f63741b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C13958g0 mo73835g() {
        return this.f63742c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C17012n mo73836h() {
        return this.f63740a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo73837i(C14794k kVar) {
        C13706o.m87929f(kVar, "<set-?>");
        this.f63743d = kVar;
    }

    /* renamed from: o */
    public Collection<C16152c> mo72411o(C16152c cVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(lVar, "nameFilter");
        return C13627z0.m87806d();
    }
}
