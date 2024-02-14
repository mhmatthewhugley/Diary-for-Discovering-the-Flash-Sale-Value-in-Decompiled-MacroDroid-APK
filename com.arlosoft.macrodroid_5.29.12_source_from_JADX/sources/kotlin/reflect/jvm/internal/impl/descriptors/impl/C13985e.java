package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13942c1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.C14597b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14690g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14704n;
import kotlin.reflect.jvm.internal.impl.types.C14830a1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14914g;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p362pb.C16157f;
import p370qa.C16254a;
import p389sb.C16519a;
import p442yb.C17006i;
import p442yb.C17012n;
import p450zb.C17087j;
import p450zb.C17088k;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e */
/* compiled from: AbstractTypeParameterDescriptor */
public abstract class C13985e extends C14003k implements C13950e1 {

    /* renamed from: A */
    private final C17012n f62494A;

    /* renamed from: g */
    private final C14970r1 f62495g;

    /* renamed from: o */
    private final boolean f62496o;

    /* renamed from: p */
    private final int f62497p;

    /* renamed from: s */
    private final C17006i<C14901e1> f62498s;

    /* renamed from: z */
    private final C17006i<C14951m0> f62499z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e$a */
    /* compiled from: AbstractTypeParameterDescriptor */
    class C13986a implements C16254a<C14901e1> {

        /* renamed from: a */
        final /* synthetic */ C17012n f62500a;

        /* renamed from: c */
        final /* synthetic */ C13942c1 f62501c;

        C13986a(C17012n nVar, C13942c1 c1Var) {
            this.f62500a = nVar;
            this.f62501c = c1Var;
        }

        /* renamed from: a */
        public C14901e1 invoke() {
            return new C13989c(C13985e.this, this.f62500a, this.f62501c);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e$b */
    /* compiled from: AbstractTypeParameterDescriptor */
    class C13987b implements C16254a<C14951m0> {

        /* renamed from: a */
        final /* synthetic */ C16157f f62503a;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e$b$a */
        /* compiled from: AbstractTypeParameterDescriptor */
        class C13988a implements C16254a<C14692h> {
            C13988a() {
            }

            /* renamed from: a */
            public C14692h invoke() {
                return C14704n.m91910j("Scope for type parameter " + C13987b.this.f62503a.mo78583d(), C13985e.this.getUpperBounds());
            }
        }

        C13987b(C16157f fVar) {
            this.f62503a = fVar;
        }

        /* renamed from: a */
        public C14951m0 invoke() {
            return C14906f0.m92822j(C14830a1.f63959c.mo74051h(), C13985e.this.mo62171j(), Collections.emptyList(), false, new C14690g(new C13988a()));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e$c */
    /* compiled from: AbstractTypeParameterDescriptor */
    private class C13989c extends C14914g {

        /* renamed from: d */
        private final C13942c1 f62506d;

        /* renamed from: e */
        final /* synthetic */ C13985e f62507e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13989c(C13985e eVar, C17012n nVar, C13942c1 c1Var) {
            super(nVar);
            if (nVar == null) {
                m88807u(0);
            }
            this.f62507e = eVar;
            this.f62506d = c1Var;
        }

        /* renamed from: u */
        private static /* synthetic */ void m88807u(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* renamed from: c */
        public C13961h mo62183c() {
            C13985e eVar = this.f62507e;
            if (eVar == null) {
                m88807u(3);
            }
            return eVar;
        }

        /* renamed from: d */
        public boolean mo62184d() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public boolean mo72381g(C13961h hVar) {
            if (hVar == null) {
                m88807u(9);
            }
            return (hVar instanceof C13950e1) && C14597b.f63599a.mo73694f(this.f62507e, (C13950e1) hVar, true);
        }

        public List<C13950e1> getParameters() {
            List<C13950e1> emptyList = Collections.emptyList();
            if (emptyList == null) {
                m88807u(2);
            }
            return emptyList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public Collection<C14900e0> mo62186j() {
            List<C14900e0> L0 = this.f62507e.mo72377L0();
            if (L0 == null) {
                m88807u(1);
            }
            return L0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public C14900e0 mo72382k() {
            return C17088k.m100540d(C17087j.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        /* renamed from: m */
        public C13853h mo72371m() {
            C13853h f = C16519a.m98613f(this.f62507e);
            if (f == null) {
                m88807u(4);
            }
            return f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public C13942c1 mo62187p() {
            C13942c1 c1Var = this.f62506d;
            if (c1Var == null) {
                m88807u(5);
            }
            return c1Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public List<C14900e0> mo72383r(List<C14900e0> list) {
            if (list == null) {
                m88807u(7);
            }
            List<C14900e0> G0 = this.f62507e.mo72375G0(list);
            if (G0 == null) {
                m88807u(8);
            }
            return G0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo72384t(C14900e0 e0Var) {
            if (e0Var == null) {
                m88807u(6);
            }
            this.f62507e.mo72376K0(e0Var);
        }

        public String toString() {
            return this.f62507e.getName().toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C13985e(C17012n nVar, C14064m mVar, C13921g gVar, C16157f fVar, C14970r1 r1Var, boolean z, int i, C14158z0 z0Var, C13942c1 c1Var) {
        super(mVar, gVar, fVar, z0Var);
        if (nVar == null) {
            m88788h0(0);
        }
        if (mVar == null) {
            m88788h0(1);
        }
        if (gVar == null) {
            m88788h0(2);
        }
        if (fVar == null) {
            m88788h0(3);
        }
        if (r1Var == null) {
            m88788h0(4);
        }
        if (z0Var == null) {
            m88788h0(5);
        }
        if (c1Var == null) {
            m88788h0(6);
        }
        this.f62495g = r1Var;
        this.f62496o = z;
        this.f62497p = i;
        this.f62498s = nVar.mo80221f(new C13986a(nVar, c1Var));
        this.f62499z = nVar.mo80221f(new C13987b(fVar));
        this.f62494A = nVar;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88788h0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public List<C14900e0> mo72375G0(List<C14900e0> list) {
        if (list == null) {
            m88788h0(12);
        }
        if (list == null) {
            m88788h0(13);
        }
        return list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public abstract void mo72376K0(C14900e0 e0Var);

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public abstract List<C14900e0> mo72377L0();

    /* renamed from: M */
    public C17012n mo72268M() {
        C17012n nVar = this.f62494A;
        if (nVar == null) {
            m88788h0(14);
        }
        return nVar;
    }

    /* renamed from: R */
    public boolean mo72269R() {
        return false;
    }

    public List<C14900e0> getUpperBounds() {
        List<C14900e0> q = ((C13989c) mo62171j()).mo72370l();
        if (q == null) {
            m88788h0(8);
        }
        return q;
    }

    /* renamed from: i */
    public int mo72272i() {
        return this.f62497p;
    }

    /* renamed from: j */
    public final C14901e1 mo62171j() {
        C14901e1 e1Var = (C14901e1) this.f62498s.invoke();
        if (e1Var == null) {
            m88788h0(9);
        }
        return e1Var;
    }

    /* renamed from: l */
    public C14970r1 mo72273l() {
        C14970r1 r1Var = this.f62495g;
        if (r1Var == null) {
            m88788h0(7);
        }
        return r1Var;
    }

    /* renamed from: p */
    public C14951m0 mo72274p() {
        C14951m0 m0Var = (C14951m0) this.f62499z.invoke();
        if (m0Var == null) {
            m88788h0(10);
        }
        return m0Var;
    }

    /* renamed from: v */
    public boolean mo72276v() {
        return this.f62496o;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo72435m(this, d);
    }

    /* renamed from: a */
    public C13950e1 m88797a() {
        C13950e1 e1Var = (C13950e1) super.mo72233a();
        if (e1Var == null) {
            m88788h0(11);
        }
        return e1Var;
    }
}
