package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13910a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13952f0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14053l0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13972a0;
import p297ja.C13321g;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p371qb.C16277a;
import p442yb.C17004g;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.x */
/* compiled from: ModuleDescriptorImpl.kt */
public final class C14037x extends C13999j implements C13958g0 {

    /* renamed from: A */
    private boolean f62641A;

    /* renamed from: B */
    private final C17004g<C16152c, C14074p0> f62642B;

    /* renamed from: C */
    private final C13321g f62643C;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C17012n f62644d;

    /* renamed from: f */
    private final C13853h f62645f;

    /* renamed from: g */
    private final C16157f f62646g;

    /* renamed from: o */
    private final Map<C13952f0<?>, Object> f62647o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C13972a0 f62648p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C14035v f62649s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C14053l0 f62650z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.x$a */
    /* compiled from: ModuleDescriptorImpl.kt */
    static final class C14038a extends C13708q implements C16254a<C13997i> {
        final /* synthetic */ C14037x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14038a(C14037x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* renamed from: a */
        public final C13997i invoke() {
            C14035v E0 = this.this$0.f62649s;
            C14037x xVar = this.this$0;
            if (E0 != null) {
                List<C14037x> a = E0.mo72532a();
                this.this$0.mo72535O0();
                a.contains(this.this$0);
                for (C14037x N0 : a) {
                    boolean unused = N0.m89222T0();
                }
                ArrayList arrayList = new ArrayList(C13616u.m87774u(a, 10));
                for (C14037x K0 : a) {
                    C14053l0 K02 = K0.f62650z;
                    C13706o.m87926c(K02);
                    arrayList.add(K02);
                }
                return new C13997i(arrayList, "CompositeProvider@ModuleDescriptor for " + this.this$0.getName());
            }
            throw new AssertionError("Dependencies of module " + xVar.m89220P0() + " were not set before querying module content");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.x$b */
    /* compiled from: ModuleDescriptorImpl.kt */
    static final class C14039b extends C13708q implements C16265l<C16152c, C14074p0> {
        final /* synthetic */ C14037x this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14039b(C14037x xVar) {
            super(1);
            this.this$0 = xVar;
        }

        /* renamed from: a */
        public final C14074p0 invoke(C16152c cVar) {
            C13706o.m87929f(cVar, "fqName");
            C13972a0 L0 = this.this$0.f62648p;
            C14037x xVar = this.this$0;
            return L0.mo72314a(xVar, cVar, xVar.f62644d);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14037x(C16157f fVar, C17012n nVar, C13853h hVar, C16277a aVar) {
        this(fVar, nVar, hVar, aVar, (Map) null, (C16157f) null, 48, (C13695i) null);
        C13706o.m87929f(fVar, "moduleName");
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(hVar, "builtIns");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14037x(C16157f fVar, C17012n nVar, C13853h hVar, C16277a aVar, Map map, C16157f fVar2, int i, C13695i iVar) {
        this(fVar, nVar, hVar, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? C13615t0.m87759i() : map, (i & 32) != 0 ? null : fVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: P0 */
    public final String m89220P0() {
        String fVar = getName().toString();
        C13706o.m87928e(fVar, "name.toString()");
        return fVar;
    }

    /* renamed from: R0 */
    private final C13997i m89221R0() {
        return (C13997i) this.f62643C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public final boolean m89222T0() {
        return this.f62650z != null;
    }

    /* renamed from: H0 */
    public <T> T mo72293H0(C13952f0<T> f0Var) {
        C13706o.m87929f(f0Var, "capability");
        T t = this.f62647o.get(f0Var);
        if (t == null) {
            return null;
        }
        return t;
    }

    /* renamed from: K */
    public boolean mo72294K(C13958g0 g0Var) {
        C13706o.m87929f(g0Var, "targetModule");
        if (C13706o.m87924a(this, g0Var)) {
            return true;
        }
        C14035v vVar = this.f62649s;
        C13706o.m87926c(vVar);
        if (!C13566b0.m87414O(vVar.mo72534c(), g0Var) && !mo72298z0().contains(g0Var) && !g0Var.mo72298z0().contains(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: O0 */
    public void mo72535O0() {
        if (!mo72538U0()) {
            C13910a0.m88484a(this);
        }
    }

    /* renamed from: Q0 */
    public final C14053l0 mo72536Q0() {
        mo72535O0();
        return m89221R0();
    }

    /* renamed from: S0 */
    public final void mo72537S0(C14053l0 l0Var) {
        C13706o.m87929f(l0Var, "providerForModuleContent");
        m89222T0();
        this.f62650z = l0Var;
    }

    /* renamed from: U0 */
    public boolean mo72538U0() {
        return this.f62641A;
    }

    /* renamed from: V */
    public C14074p0 mo72295V(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        mo72535O0();
        return this.f62642B.invoke(cVar);
    }

    /* renamed from: V0 */
    public final void mo72539V0(List<C14037x> list) {
        C13706o.m87929f(list, "descriptors");
        mo72540W0(list, C13627z0.m87806d());
    }

    /* renamed from: W0 */
    public final void mo72540W0(List<C14037x> list, Set<C14037x> set) {
        C13706o.m87929f(list, "descriptors");
        C13706o.m87929f(set, "friends");
        mo72541X0(new C14036w(list, set, C13614t.m87748j(), C13627z0.m87806d()));
    }

    /* renamed from: X0 */
    public final void mo72541X0(C14035v vVar) {
        C13706o.m87929f(vVar, "dependencies");
        this.f62649s = vVar;
    }

    /* renamed from: Y0 */
    public final void mo72542Y0(C14037x... xVarArr) {
        C13706o.m87929f(xVarArr, "descriptors");
        mo72539V0(C13596m.m87610i0(xVarArr));
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        return C13958g0.C13959a.m88599b(this);
    }

    /* renamed from: m */
    public C13853h mo72296m() {
        return this.f62645f;
    }

    /* renamed from: o */
    public Collection<C16152c> mo72297o(C16152c cVar, C16265l<? super C16157f, Boolean> lVar) {
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(lVar, "nameFilter");
        mo72535O0();
        return mo72536Q0().mo72411o(cVar, lVar);
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return C13958g0.C13959a.m88598a(this, oVar, d);
    }

    /* renamed from: z0 */
    public List<C13958g0> mo72298z0() {
        C14035v vVar = this.f62649s;
        if (vVar != null) {
            return vVar.mo72533b();
        }
        throw new AssertionError("Dependencies of module " + m89220P0() + " were not set");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14037x(C16157f fVar, C17012n nVar, C13853h hVar, C16277a aVar, Map<C13952f0<?>, ? extends Object> map, C16157f fVar2) {
        super(C13921g.f62330v.mo72251b(), fVar);
        C13706o.m87929f(fVar, "moduleName");
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(hVar, "builtIns");
        C13706o.m87929f(map, "capabilities");
        this.f62644d = nVar;
        this.f62645f = hVar;
        this.f62646g = fVar2;
        if (fVar.mo78588j()) {
            this.f62647o = map;
            C13972a0 a0Var = (C13972a0) mo72293H0(C13972a0.f62443a.mo72315a());
            this.f62648p = a0Var == null ? C13972a0.C13974b.f62446b : a0Var;
            this.f62641A = true;
            this.f62642B = nVar.mo80223h(new C14039b(this));
            this.f62643C = C13323i.m85669b(new C14038a(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + fVar);
    }
}
