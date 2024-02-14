package p210ab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13967a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14004k0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14832b;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p297ja.C13339u;
import p362pb.C16151b;
import p362pb.C16157f;
import p424wa.C16788e;
import p442yb.C17012n;

/* renamed from: ab.b */
/* compiled from: FunctionClassDescriptor.kt */
public final class C11080b extends C13967a {

    /* renamed from: D */
    public static final C11081a f53988D = new C11081a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static final C16151b f53989E = new C16151b(C13902k.f62196r, C16157f.m97019i("Function"));
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final C16151b f53990F = new C16151b(C13902k.f62193o, C16157f.m97019i("KFunction"));

    /* renamed from: A */
    private final C11082b f53991A = new C11082b();

    /* renamed from: B */
    private final C11087d f53992B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final List<C13950e1> f53993C;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C17012n f53994o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C14050k0 f53995p;

    /* renamed from: s */
    private final C11084c f53996s;

    /* renamed from: z */
    private final int f53997z;

    /* renamed from: ab.b$a */
    /* compiled from: FunctionClassDescriptor.kt */
    public static final class C11081a {
        private C11081a() {
        }

        public /* synthetic */ C11081a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: ab.b$b */
    /* compiled from: FunctionClassDescriptor.kt */
    private final class C11082b extends C14832b {

        /* renamed from: ab.b$b$a */
        /* compiled from: FunctionClassDescriptor.kt */
        public /* synthetic */ class C11083a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f53999a;

            static {
                int[] iArr = new int[C11084c.values().length];
                iArr[C11084c.Function.ordinal()] = 1;
                iArr[C11084c.KFunction.ordinal()] = 2;
                iArr[C11084c.SuspendFunction.ordinal()] = 3;
                iArr[C11084c.KSuspendFunction.ordinal()] = 4;
                f53999a = iArr;
            }
        }

        public C11082b() {
            super(C11080b.this.f53994o);
        }

        /* renamed from: d */
        public boolean mo62184d() {
            return true;
        }

        public List<C13950e1> getParameters() {
            return C11080b.this.f53993C;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public Collection<C14900e0> mo62186j() {
            List<C16151b> list;
            int i = C11083a.f53999a[C11080b.this.mo62156U0().ordinal()];
            if (i == 1) {
                list = C13612s.m87736e(C11080b.f53989E);
            } else if (i == 2) {
                list = C13614t.m87751m(C11080b.f53990F, new C16151b(C13902k.f62196r, C11084c.Function.mo62193f(C11080b.this.mo62151Q0())));
            } else if (i == 3) {
                list = C13612s.m87736e(C11080b.f53989E);
            } else if (i == 4) {
                list = C13614t.m87751m(C11080b.f53990F, new C16151b(C13902k.f62188j, C11084c.SuspendFunction.mo62193f(C11080b.this.mo62151Q0())));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C13958g0 b = C11080b.this.f53995p.mo62163b();
            ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
            for (C16151b bVar : list) {
                C13948e a = C14147x.m89564a(b, bVar);
                if (a != null) {
                    List<C13950e1> A0 = C13566b0.m87397A0(getParameters(), a.mo62171j().getParameters().size());
                    ArrayList arrayList2 = new ArrayList(C13616u.m87774u(A0, 10));
                    for (C13950e1 p : A0) {
                        arrayList2.add(new C14933i1(p.mo72274p()));
                    }
                    arrayList.add(C14906f0.m92819g(C14830a1.f63959c.mo74051h(), a, arrayList2));
                } else {
                    throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
                }
            }
            return C13566b0.m87402F0(arrayList);
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public C13942c1 mo62187p() {
            return C13942c1.C13943a.f62415a;
        }

        public String toString() {
            return mo62189v().toString();
        }

        /* renamed from: w */
        public C11080b mo62189v() {
            return C11080b.this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11080b(C17012n nVar, C14050k0 k0Var, C11084c cVar, int i) {
        super(nVar, cVar.mo62193f(i));
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(k0Var, "containingDeclaration");
        C13706o.m87929f(cVar, "functionKind");
        this.f53994o = nVar;
        this.f53995p = k0Var;
        this.f53996s = cVar;
        this.f53997z = i;
        this.f53992B = new C11087d(nVar, this);
        ArrayList arrayList = new ArrayList();
        C16788e eVar = new C16788e(1, i);
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            int nextInt = ((C13603n0) it).nextInt();
            C14970r1 r1Var = C14970r1.IN_VARIANCE;
            StringBuilder sb = new StringBuilder();
            sb.append('P');
            sb.append(nextInt);
            m74643K0(arrayList, this, r1Var, sb.toString());
            arrayList2.add(C13339u.f61331a);
        }
        m74643K0(arrayList, this, C14970r1.OUT_VARIANCE, "R");
        this.f53993C = C13566b0.m87402F0(arrayList);
    }

    /* renamed from: K0 */
    private static final void m74643K0(ArrayList<C13950e1> arrayList, C11080b bVar, C14970r1 r1Var, String str) {
        arrayList.add(C14004k0.m88945R0(bVar, C13921g.f62330v.mo72251b(), false, r1Var, C16157f.m97019i(str), arrayList.size(), bVar.f53994o));
    }

    /* renamed from: D */
    public /* bridge */ /* synthetic */ C13944d mo62149D() {
        return (C13944d) mo62161Y0();
    }

    /* renamed from: I0 */
    public boolean mo62150I0() {
        return false;
    }

    /* renamed from: Q0 */
    public final int mo62151Q0() {
        return this.f53997z;
    }

    /* renamed from: R0 */
    public Void mo62152R0() {
        return null;
    }

    /* renamed from: S0 */
    public List<C13944d> mo62173k() {
        return C13614t.m87748j();
    }

    /* renamed from: T0 */
    public C14050k0 mo62163b() {
        return this.f53995p;
    }

    /* renamed from: U */
    public C13960g1<C14951m0> mo62155U() {
        return null;
    }

    /* renamed from: U0 */
    public final C11084c mo62156U0() {
        return this.f53996s;
    }

    /* renamed from: V0 */
    public List<C13948e> mo62181w() {
        return C13614t.m87748j();
    }

    /* renamed from: W0 */
    public C14692h.C14695b mo62176m0() {
        return C14692h.C14695b.f63726b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public C11087d mo62174k0(C14849g gVar) {
        C13706o.m87929f(gVar, "kotlinTypeRefiner");
        return this.f53992B;
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return false;
    }

    /* renamed from: Y0 */
    public Void mo62161Y0() {
        return null;
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

    public C14158z0 getSource() {
        C14158z0 z0Var = C14158z0.f62778a;
        C13706o.m87928e(z0Var, "NO_SOURCE");
        return z0Var;
    }

    public C14141u getVisibility() {
        C14141u uVar = C14127t.f62754e;
        C13706o.m87928e(uVar, "PUBLIC");
        return uVar;
    }

    /* renamed from: h */
    public C13951f mo62168h() {
        return C13951f.INTERFACE;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        return this.f53991A;
    }

    /* renamed from: j0 */
    public boolean mo62172j0() {
        return false;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return false;
    }

    /* renamed from: n0 */
    public /* bridge */ /* synthetic */ C13948e mo62177n0() {
        return (C13948e) mo62152R0();
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        return this.f53993C;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        return C13945d0.ABSTRACT;
    }

    public String toString() {
        String d = getName().mo78583d();
        C13706o.m87928e(d, "name.asString()");
        return d;
    }

    /* renamed from: y */
    public boolean mo62182y() {
        return false;
    }
}
