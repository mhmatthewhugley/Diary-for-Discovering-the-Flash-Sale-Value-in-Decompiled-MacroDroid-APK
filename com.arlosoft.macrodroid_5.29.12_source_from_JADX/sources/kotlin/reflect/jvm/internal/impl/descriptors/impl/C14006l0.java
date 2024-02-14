package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14048j1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import p297ja.C13321g;
import p362pb.C16157f;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 */
/* compiled from: ValueParameterDescriptorImpl.kt */
public class C14006l0 extends C14011m0 implements C13966i1 {

    /* renamed from: C */
    public static final C14007a f62538C = new C14007a((C13695i) null);

    /* renamed from: A */
    private final C14900e0 f62539A;

    /* renamed from: B */
    private final C13966i1 f62540B;

    /* renamed from: o */
    private final int f62541o;

    /* renamed from: p */
    private final boolean f62542p;

    /* renamed from: s */
    private final boolean f62543s;

    /* renamed from: z */
    private final boolean f62544z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.l0$a */
    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class C14007a {
        private C14007a() {
        }

        public /* synthetic */ C14007a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C14006l0 mo72442a(C13908a aVar, C13966i1 i1Var, int i, C13921g gVar, C16157f fVar, C14900e0 e0Var, boolean z, boolean z2, boolean z3, C14900e0 e0Var2, C14158z0 z0Var, C16254a<? extends List<? extends C14048j1>> aVar2) {
            C13908a aVar3 = aVar;
            C13706o.m87929f(aVar, "containingDeclaration");
            C13706o.m87929f(gVar, "annotations");
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(e0Var, "outType");
            C13706o.m87929f(z0Var, "source");
            if (aVar2 == null) {
                return new C14006l0(aVar, i1Var, i, gVar, fVar, e0Var, z, z2, z3, e0Var2, z0Var);
            }
            return new C14008b(aVar, i1Var, i, gVar, fVar, e0Var, z, z2, z3, e0Var2, z0Var, aVar2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.l0$b */
    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class C14008b extends C14006l0 {

        /* renamed from: D */
        private final C13321g f62545D;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.l0$b$a */
        /* compiled from: ValueParameterDescriptorImpl.kt */
        static final class C14009a extends C13708q implements C16254a<List<? extends C14048j1>> {
            final /* synthetic */ C14008b this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14009a(C14008b bVar) {
                super(0);
                this.this$0 = bVar;
            }

            /* renamed from: a */
            public final List<C14048j1> invoke() {
                return this.this$0.mo72443N0();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14008b(C13908a aVar, C13966i1 i1Var, int i, C13921g gVar, C16157f fVar, C14900e0 e0Var, boolean z, boolean z2, boolean z3, C14900e0 e0Var2, C14158z0 z0Var, C16254a<? extends List<? extends C14048j1>> aVar2) {
            super(aVar, i1Var, i, gVar, fVar, e0Var, z, z2, z3, e0Var2, z0Var);
            C13706o.m87929f(aVar, "containingDeclaration");
            C13706o.m87929f(gVar, "annotations");
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(e0Var, "outType");
            C13706o.m87929f(z0Var, "source");
            C13706o.m87929f(aVar2, "destructuringVariables");
            this.f62545D = C13323i.m85669b(aVar2);
        }

        /* renamed from: N0 */
        public final List<C14048j1> mo72443N0() {
            return (List) this.f62545D.getValue();
        }

        /* renamed from: z */
        public C13966i1 mo72307z(C13908a aVar, C16157f fVar, int i) {
            C13908a aVar2 = aVar;
            C13706o.m87929f(aVar2, "newOwner");
            C16157f fVar2 = fVar;
            C13706o.m87929f(fVar2, "newName");
            C13921g annotations = getAnnotations();
            C13706o.m87928e(annotations, "annotations");
            C14900e0 type = getType();
            C13706o.m87928e(type, "type");
            boolean A0 = mo72302A0();
            boolean r0 = mo72305r0();
            boolean p0 = mo72304p0();
            C14900e0 v0 = mo72306v0();
            C14158z0 z0Var = C14158z0.f62778a;
            C13706o.m87928e(z0Var, "NO_SOURCE");
            return new C14008b(aVar2, (C13966i1) null, i, annotations, fVar2, type, A0, r0, p0, v0, z0Var, new C14009a(this));
        }
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.i1] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14006l0(kotlin.reflect.jvm.internal.impl.descriptors.C13908a r8, kotlin.reflect.jvm.internal.impl.descriptors.C13966i1 r9, int r10, kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g r11, p362pb.C16157f r12, kotlin.reflect.jvm.internal.impl.types.C14900e0 r13, boolean r14, boolean r15, boolean r16, kotlin.reflect.jvm.internal.impl.types.C14900e0 r17, kotlin.reflect.jvm.internal.impl.descriptors.C14158z0 r18) {
        /*
            r7 = this;
            r6 = r7
            java.lang.String r0 = "containingDeclaration"
            r1 = r8
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.String r0 = "annotations"
            r2 = r11
            kotlin.jvm.internal.C13706o.m87929f(r11, r0)
            java.lang.String r0 = "name"
            r3 = r12
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            java.lang.String r0 = "outType"
            r4 = r13
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            java.lang.String r0 = "source"
            r5 = r18
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r10
            r6.f62541o = r0
            r0 = r14
            r6.f62542p = r0
            r0 = r15
            r6.f62543s = r0
            r0 = r16
            r6.f62544z = r0
            r0 = r17
            r6.f62539A = r0
            if (r9 != 0) goto L_0x0039
            r0 = r6
            goto L_0x003a
        L_0x0039:
            r0 = r9
        L_0x003a:
            r6.f62540B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C14006l0.<init>(kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.i1, int, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g, pb.f, kotlin.reflect.jvm.internal.impl.types.e0, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.types.e0, kotlin.reflect.jvm.internal.impl.descriptors.z0):void");
    }

    /* renamed from: K0 */
    public static final C14006l0 m88968K0(C13908a aVar, C13966i1 i1Var, int i, C13921g gVar, C16157f fVar, C14900e0 e0Var, boolean z, boolean z2, boolean z3, C14900e0 e0Var2, C14158z0 z0Var, C16254a<? extends List<? extends C14048j1>> aVar2) {
        return f62538C.mo72442a(aVar, i1Var, i, gVar, fVar, e0Var, z, z2, z3, e0Var2, z0Var, aVar2);
    }

    /* renamed from: A0 */
    public boolean mo72302A0() {
        if (this.f62542p) {
            C13908a b = m88978b();
            C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((C13936b) b).mo72264h().mo72265b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    public Void mo72438L0() {
        return null;
    }

    /* renamed from: M0 */
    public C13966i1 mo72267c(C14945l1 l1Var) {
        C13706o.m87929f(l1Var, "substitutor");
        if (l1Var.mo74212k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: N */
    public boolean mo72440N() {
        return false;
    }

    /* renamed from: d */
    public Collection<C13966i1> mo72234d() {
        Collection<? extends C13908a> d = m88978b().mo72234d();
        C13706o.m87928e(d, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(d, 10));
        for (C13908a g : d) {
            arrayList.add(g.mo72235g().get(mo72303i()));
        }
        return arrayList;
    }

    public C14141u getVisibility() {
        C14141u uVar = C14127t.f62755f;
        C13706o.m87928e(uVar, "LOCAL");
        return uVar;
    }

    /* renamed from: i */
    public int mo72303i() {
        return this.f62541o;
    }

    /* renamed from: o0 */
    public /* bridge */ /* synthetic */ C14617g mo72441o0() {
        return (C14617g) mo72438L0();
    }

    /* renamed from: p0 */
    public boolean mo72304p0() {
        return this.f62544z;
    }

    /* renamed from: r0 */
    public boolean mo72305r0() {
        return this.f62543s;
    }

    /* renamed from: v0 */
    public C14900e0 mo72306v0() {
        return this.f62539A;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        C13706o.m87929f(oVar, "visitor");
        return oVar.mo72430f(this, d);
    }

    /* renamed from: z */
    public C13966i1 mo72307z(C13908a aVar, C16157f fVar, int i) {
        C13706o.m87929f(aVar, "newOwner");
        C13706o.m87929f(fVar, "newName");
        C13921g annotations = getAnnotations();
        C13706o.m87928e(annotations, "annotations");
        C14900e0 type = getType();
        C13706o.m87928e(type, "type");
        boolean A0 = mo72302A0();
        boolean r0 = mo72305r0();
        boolean p0 = mo72304p0();
        C14900e0 v0 = mo72306v0();
        C14158z0 z0Var = C14158z0.f62778a;
        C13706o.m87928e(z0Var, "NO_SOURCE");
        return new C14006l0(aVar, (C13966i1) null, i, annotations, fVar, type, A0, r0, p0, v0, z0Var);
    }

    /* renamed from: b */
    public C13908a m88978b() {
        C14064m b = super.mo62163b();
        C13706o.m87927d(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (C13908a) b;
    }

    /* renamed from: a */
    public C13966i1 m88975a() {
        C13966i1 i1Var = this.f62540B;
        return i1Var == this ? this : i1Var.mo72233a();
    }
}
