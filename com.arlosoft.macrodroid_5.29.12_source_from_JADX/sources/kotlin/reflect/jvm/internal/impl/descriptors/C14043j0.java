package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13993g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14004k0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14010m;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14943l;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;
import p424wa.C16788e;
import p442yb.C17004g;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0 */
/* compiled from: NotFoundClasses.kt */
public final class C14043j0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C17012n f62662a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C13958g0 f62663b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C17004g<C16152c, C14050k0> f62664c;

    /* renamed from: d */
    private final C17004g<C14044a, C13948e> f62665d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$a */
    /* compiled from: NotFoundClasses.kt */
    private static final class C14044a {

        /* renamed from: a */
        private final C16151b f62666a;

        /* renamed from: b */
        private final List<Integer> f62667b;

        public C14044a(C16151b bVar, List<Integer> list) {
            C13706o.m87929f(bVar, "classId");
            C13706o.m87929f(list, "typeParametersCount");
            this.f62666a = bVar;
            this.f62667b = list;
        }

        /* renamed from: a */
        public final C16151b mo72553a() {
            return this.f62666a;
        }

        /* renamed from: b */
        public final List<Integer> mo72554b() {
            return this.f62667b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14044a)) {
                return false;
            }
            C14044a aVar = (C14044a) obj;
            return C13706o.m87924a(this.f62666a, aVar.f62666a) && C13706o.m87924a(this.f62667b, aVar.f62667b);
        }

        public int hashCode() {
            return (this.f62666a.hashCode() * 31) + this.f62667b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f62666a + ", typeParametersCount=" + this.f62667b + ')';
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$b */
    /* compiled from: NotFoundClasses.kt */
    public static final class C14045b extends C13993g {

        /* renamed from: A */
        private final List<C13950e1> f62668A;

        /* renamed from: B */
        private final C14943l f62669B;

        /* renamed from: z */
        private final boolean f62670z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14045b(C17012n nVar, C14064m mVar, C16157f fVar, boolean z, int i) {
            super(nVar, mVar, fVar, C14158z0.f62778a, false);
            C13706o.m87929f(nVar, "storageManager");
            C13706o.m87929f(mVar, "container");
            C13706o.m87929f(fVar, "name");
            this.f62670z = z;
            C16788e k = C16792h.m99549k(0, i);
            ArrayList arrayList = new ArrayList(C13616u.m87774u(k, 10));
            Iterator it = k.iterator();
            while (it.hasNext()) {
                int nextInt = ((C13603n0) it).nextInt();
                C13921g b = C13921g.f62330v.mo72251b();
                C14970r1 r1Var = C14970r1.INVARIANT;
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(nextInt);
                arrayList.add(C14004k0.m88945R0(this, b, false, r1Var, C16157f.m97019i(sb.toString()), nextInt, nVar));
            }
            this.f62668A = arrayList;
            this.f62669B = new C14943l(this, C13953f1.m88588d(this), C13625y0.m87800c(C16519a.m98619l(this).mo72296m().mo72136i()), nVar);
        }

        /* renamed from: D */
        public C13944d mo62149D() {
            return null;
        }

        /* renamed from: I0 */
        public boolean mo62150I0() {
            return false;
        }

        /* renamed from: K0 */
        public C14692h.C14695b mo62176m0() {
            return C14692h.C14695b.f63726b;
        }

        /* renamed from: L0 */
        public C14943l mo62171j() {
            return this.f62669B;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M0 */
        public C14692h.C14695b mo62174k0(C14849g gVar) {
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            return C14692h.C14695b.f63726b;
        }

        /* renamed from: U */
        public C13960g1<C14951m0> mo62155U() {
            return null;
        }

        /* renamed from: Y */
        public boolean mo62160Y() {
            return false;
        }

        /* renamed from: a0 */
        public boolean mo62162a0() {
            return false;
        }

        /* renamed from: e0 */
        public boolean mo62164e0() {
            return false;
        }

        public C13921g getAnnotations() {
            return C13921g.f62330v.mo72251b();
        }

        public C14141u getVisibility() {
            C14141u uVar = C14127t.f62754e;
            C13706o.m87928e(uVar, "PUBLIC");
            return uVar;
        }

        /* renamed from: h */
        public C13951f mo62168h() {
            return C13951f.CLASS;
        }

        public boolean isExternal() {
            return false;
        }

        public boolean isInline() {
            return false;
        }

        /* renamed from: j0 */
        public boolean mo62172j0() {
            return false;
        }

        /* renamed from: k */
        public Collection<C13944d> mo62173k() {
            return C13627z0.m87806d();
        }

        /* renamed from: l0 */
        public boolean mo62175l0() {
            return false;
        }

        /* renamed from: n0 */
        public C13948e mo62177n0() {
            return null;
        }

        /* renamed from: q */
        public List<C13950e1> mo62178q() {
            return this.f62668A;
        }

        /* renamed from: r */
        public C13945d0 mo62179r() {
            return C13945d0.FINAL;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        /* renamed from: w */
        public Collection<C13948e> mo62181w() {
            return C13614t.m87748j();
        }

        /* renamed from: y */
        public boolean mo62182y() {
            return this.f62670z;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$c */
    /* compiled from: NotFoundClasses.kt */
    static final class C14046c extends C13708q implements C16265l<C14044a, C13948e> {
        final /* synthetic */ C14043j0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14046c(C14043j0 j0Var) {
            super(1);
            this.this$0 = j0Var;
        }

        /* renamed from: a */
        public final C13948e invoke(C14044a aVar) {
            C14064m mVar;
            C13706o.m87929f(aVar, "<name for destructuring parameter 0>");
            C16151b a = aVar.mo72553a();
            List<Integer> b = aVar.mo72554b();
            if (!a.mo78553k()) {
                C16151b g = a.mo78548g();
                if (g == null || (mVar = this.this$0.mo72552d(g, C13566b0.m87416Q(b, 1))) == null) {
                    C17004g b2 = this.this$0.f62664c;
                    C16152c h = a.mo78549h();
                    C13706o.m87928e(h, "classId.packageFqName");
                    mVar = (C13957g) b2.invoke(h);
                }
                C14064m mVar2 = mVar;
                boolean l = a.mo78554l();
                C17012n c = this.this$0.f62662a;
                C16157f j = a.mo78552j();
                C13706o.m87928e(j, "classId.shortClassName");
                Integer num = (Integer) C13566b0.m87424Y(b);
                return new C14045b(c, mVar2, j, l, num != null ? num.intValue() : 0);
            }
            throw new UnsupportedOperationException("Unresolved local class: " + a);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.j0$d */
    /* compiled from: NotFoundClasses.kt */
    static final class C14047d extends C13708q implements C16265l<C16152c, C14050k0> {
        final /* synthetic */ C14043j0 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14047d(C14043j0 j0Var) {
            super(1);
            this.this$0 = j0Var;
        }

        /* renamed from: a */
        public final C14050k0 invoke(C16152c cVar) {
            C13706o.m87929f(cVar, "fqName");
            return new C14010m(this.this$0.f62663b, cVar);
        }
    }

    public C14043j0(C17012n nVar, C13958g0 g0Var) {
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(g0Var, "module");
        this.f62662a = nVar;
        this.f62663b = g0Var;
        this.f62664c = nVar.mo80223h(new C14047d(this));
        this.f62665d = nVar.mo80223h(new C14046c(this));
    }

    /* renamed from: d */
    public final C13948e mo72552d(C16151b bVar, List<Integer> list) {
        C13706o.m87929f(bVar, "classId");
        C13706o.m87929f(list, "typeParametersCount");
        return this.f62665d.invoke(new C14044a(bVar, list));
    }
}
