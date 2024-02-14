package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14073p;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14000j0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14967q1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p362pb.C16157f;
import p370qa.C16265l;
import p389sb.C16519a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d */
/* compiled from: AbstractTypeAliasDescriptor.kt */
public abstract class C13980d extends C14003k implements C13947d1 {

    /* renamed from: g */
    private final C14141u f62488g;

    /* renamed from: o */
    private List<? extends C13950e1> f62489o;

    /* renamed from: p */
    private final C13983c f62490p = new C13983c(this);

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d$a */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class C13981a extends C13708q implements C16265l<C14849g, C14951m0> {
        final /* synthetic */ C13980d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13981a(C13980d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* renamed from: a */
        public final C14951m0 invoke(C14849g gVar) {
            C13961h f = gVar.mo74068f(this.this$0);
            if (f != null) {
                return f.mo72274p();
            }
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d$b */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    static final class C13982b extends C13708q implements C16265l<C14967q1, Boolean> {
        final /* synthetic */ C13980d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13982b(C13980d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
            if (((r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) && !kotlin.jvm.internal.C13706o.m87924a(((kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r5).mo62163b(), r0)) != false) goto L_0x002e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.C14967q1 r5) {
            /*
                r4 = this;
                java.lang.String r0 = "type"
                kotlin.jvm.internal.C13706o.m87928e(r5, r0)
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.C14925g0.m92873a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x002d
                kotlin.reflect.jvm.internal.impl.descriptors.impl.d r0 = r4.this$0
                kotlin.reflect.jvm.internal.impl.types.e1 r5 = r5.mo73702N0()
                kotlin.reflect.jvm.internal.impl.descriptors.h r5 = r5.mo62183c()
                boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C13950e1
                if (r3 == 0) goto L_0x0029
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.C13950e1) r5
                kotlin.reflect.jvm.internal.impl.descriptors.m r5 = r5.mo62163b()
                boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r5, r0)
                if (r5 != 0) goto L_0x0029
                r5 = 1
                goto L_0x002a
            L_0x0029:
                r5 = 0
            L_0x002a:
                if (r5 == 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r1 = 0
            L_0x002e:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.C13980d.C13982b.invoke(kotlin.reflect.jvm.internal.impl.types.q1):java.lang.Boolean");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.d$c */
    /* compiled from: AbstractTypeAliasDescriptor.kt */
    public static final class C13983c implements C14901e1 {

        /* renamed from: a */
        final /* synthetic */ C13980d f62491a;

        C13983c(C13980d dVar) {
            this.f62491a = dVar;
        }

        /* renamed from: a */
        public C14901e1 mo72368a(C14849g gVar) {
            C13706o.m87929f(gVar, "kotlinTypeRefiner");
            return this;
        }

        /* renamed from: d */
        public boolean mo62184d() {
            return true;
        }

        /* renamed from: e */
        public C13947d1 mo62183c() {
            return this.f62491a;
        }

        public List<C13950e1> getParameters() {
            return this.f62491a.mo72364M0();
        }

        /* renamed from: l */
        public Collection<C14900e0> mo72370l() {
            Collection<C14900e0> l = mo62183c().mo72282t0().mo73702N0().mo72370l();
            C13706o.m87928e(l, "declarationDescriptor.un…pe.constructor.supertypes");
            return l;
        }

        /* renamed from: m */
        public C13853h mo72371m() {
            return C16519a.m98613f(mo62183c());
        }

        public String toString() {
            return "[typealias " + mo62183c().getName().mo78583d() + ']';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13980d(C14064m mVar, C13921g gVar, C16157f fVar, C14158z0 z0Var, C14141u uVar) {
        super(mVar, gVar, fVar, z0Var);
        C13706o.m87929f(mVar, "containingDeclaration");
        C13706o.m87929f(gVar, "annotations");
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(z0Var, "sourceElement");
        C13706o.m87929f(uVar, "visibilityImpl");
        this.f62488g = uVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final C14951m0 mo72360G0() {
        C14692h hVar;
        C13948e s = mo72281s();
        if (s == null || (hVar = s.mo72285X()) == null) {
            hVar = C14692h.C14695b.f63726b;
        }
        C14951m0 t = C14956n1.m93005t(this, hVar, new C13981a(this));
        C13706o.m87928e(t, "@OptIn(TypeRefinement::c…s)?.defaultType\n        }");
        return t;
    }

    /* renamed from: K0 */
    public C13947d1 m88762a() {
        C14073p E0 = super.mo72233a();
        C13706o.m87927d(E0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (C13947d1) E0;
    }

    /* renamed from: L0 */
    public final Collection<C13998i0> mo72362L0() {
        C13948e s = mo72281s();
        if (s == null) {
            return C13614t.m87748j();
        }
        Collection<C13944d> k = s.mo62173k();
        C13706o.m87928e(k, "classDescriptor.constructors");
        ArrayList arrayList = new ArrayList();
        for (C13944d dVar : k) {
            C14000j0.C14001a aVar = C14000j0.f62527Z;
            C17012n M = mo72363M();
            C13706o.m87928e(dVar, "it");
            C13998i0 b = aVar.mo72421b(M, this, dVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public abstract C17012n mo72363M();

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public abstract List<C13950e1> mo72364M0();

    /* renamed from: N0 */
    public final void mo72365N0(List<? extends C13950e1> list) {
        C13706o.m87929f(list, "declaredTypeParameters");
        this.f62489o = list;
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return false;
    }

    public C14141u getVisibility() {
        return this.f62488g;
    }

    public boolean isExternal() {
        return false;
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        return this.f62490p;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return false;
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        List<? extends C13950e1> list = this.f62489o;
        if (list != null) {
            return list;
        }
        C13706o.m87945v("declaredTypeParametersImpl");
        return null;
    }

    public String toString() {
        return "typealias " + getName().mo78583d();
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        C13706o.m87929f(oVar, "visitor");
        return oVar.mo72428d(this, d);
    }

    /* renamed from: y */
    public boolean mo62182y() {
        return C14956n1.m92988c(mo72282t0(), new C13982b(this));
    }
}
