package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14070n0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14678b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14690g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import p362pb.C16152c;
import p370qa.C16254a;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.r */
/* compiled from: LazyPackageViewDescriptorImpl.kt */
public class C14025r extends C13999j implements C14074p0 {

    /* renamed from: s */
    static final /* synthetic */ C16887m<Object>[] f62622s;

    /* renamed from: d */
    private final C14037x f62623d;

    /* renamed from: f */
    private final C16152c f62624f;

    /* renamed from: g */
    private final C17006i f62625g;

    /* renamed from: o */
    private final C17006i f62626o;

    /* renamed from: p */
    private final C14692h f62627p;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.r$a */
    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class C14026a extends C13708q implements C16254a<Boolean> {
        final /* synthetic */ C14025r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14026a(C14025r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(C14070n0.m89332b(this.this$0.mo72515B0().mo72536Q0(), this.this$0.mo72519e()));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.r$b */
    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class C14027b extends C13708q implements C16254a<List<? extends C14050k0>> {
        final /* synthetic */ C14025r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14027b(C14025r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* renamed from: a */
        public final List<C14050k0> invoke() {
            return C14070n0.m89333c(this.this$0.mo72515B0().mo72536Q0(), this.this$0.mo72519e());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.r$c */
    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    static final class C14028c extends C13708q implements C16254a<C14692h> {
        final /* synthetic */ C14025r this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14028c(C14025r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* renamed from: a */
        public final C14692h invoke() {
            if (this.this$0.isEmpty()) {
                return C14692h.C14695b.f63726b;
            }
            List<C14050k0> i0 = this.this$0.mo72522i0();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(i0, 10));
            for (C14050k0 n : i0) {
                arrayList.add(n.mo72205n());
            }
            List r0 = C13566b0.m87443r0(arrayList, new C13996h0(this.this$0.mo72515B0(), this.this$0.mo72519e()));
            C14678b.C14679a aVar = C14678b.f63681d;
            return aVar.mo73796a("package view scope for " + this.this$0.mo72519e() + " in " + this.this$0.mo72515B0().getName(), r0);
        }
    }

    static {
        Class<C14025r> cls = C14025r.class;
        f62622s = new C16887m[]{C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "fragments", "getFragments()Ljava/util/List;")), C13687e0.m87873g(new C13716y(C13687e0.m87868b(cls), "empty", "getEmpty()Z"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14025r(C14037x xVar, C16152c cVar, C17012n nVar) {
        super(C13921g.f62330v.mo72251b(), cVar.mo78563h());
        C13706o.m87929f(xVar, "module");
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(nVar, "storageManager");
        this.f62623d = xVar;
        this.f62624f = cVar;
        this.f62625g = nVar.mo80221f(new C14027b(this));
        this.f62626o = nVar.mo80221f(new C14026a(this));
        this.f62627p = new C14690g(nVar, new C14028c(this));
    }

    /* renamed from: E0 */
    public C14074p0 mo62163b() {
        if (mo72519e().mo78558d()) {
            return null;
        }
        C14037x K0 = mo72515B0();
        C16152c e = mo72519e().mo78559e();
        C13706o.m87928e(e, "fqName.parent()");
        return K0.mo72295V(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final boolean mo72517G0() {
        return ((Boolean) C17011m.m100276a(this.f62626o, this, f62622s[1])).booleanValue();
    }

    /* renamed from: K0 */
    public C14037x mo72515B0() {
        return this.f62623d;
    }

    /* renamed from: e */
    public C16152c mo72519e() {
        return this.f62624f;
    }

    public boolean equals(Object obj) {
        C14074p0 p0Var = obj instanceof C14074p0 ? (C14074p0) obj : null;
        if (p0Var != null && C13706o.m87924a(mo72519e(), p0Var.mo72519e()) && C13706o.m87924a(mo72515B0(), p0Var.mo72515B0())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (mo72515B0().hashCode() * 31) + mo72519e().hashCode();
    }

    /* renamed from: i0 */
    public List<C14050k0> mo72522i0() {
        return (List) C17011m.m100276a(this.f62625g, this, f62622s[0]);
    }

    public boolean isEmpty() {
        return mo72517G0();
    }

    /* renamed from: n */
    public C14692h mo72524n() {
        return this.f62627p;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        C13706o.m87929f(oVar, "visitor");
        return oVar.mo72427b(this, d);
    }
}
