package p271gb;

import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13994g0;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.util.C15026p;
import p297ja.C13328m;
import p362pb.C16157f;

/* renamed from: gb.e */
/* compiled from: JavaMethodDescriptor */
public class C12331e extends C13994g0 implements C12327a {

    /* renamed from: X */
    public static final C13908a.C13909a<C13966i1> f59011X = new C12332a();

    /* renamed from: Y */
    public static final C13908a.C13909a<Boolean> f59012Y = new C12333b();

    /* renamed from: V */
    private C12334c f59013V;

    /* renamed from: W */
    private final boolean f59014W;

    /* renamed from: gb.e$a */
    /* compiled from: JavaMethodDescriptor */
    static class C12332a implements C13908a.C13909a<C13966i1> {
        C12332a() {
        }
    }

    /* renamed from: gb.e$b */
    /* compiled from: JavaMethodDescriptor */
    static class C12333b implements C13908a.C13909a<Boolean> {
        C12333b() {
        }
    }

    /* renamed from: gb.e$c */
    /* compiled from: JavaMethodDescriptor */
    private enum C12334c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private C12334c(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        /* renamed from: d */
        public static C12334c m83059d(boolean z, boolean z2) {
            C12334c cVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar == null) {
                m83058b(0);
            }
            return cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C12331e(C14064m mVar, C14156y0 y0Var, C13921g gVar, C16157f fVar, C13936b.C13937a aVar, C14158z0 z0Var, boolean z) {
        super(mVar, y0Var, gVar, fVar, aVar, z0Var);
        if (mVar == null) {
            m83048h0(0);
        }
        if (gVar == null) {
            m83048h0(1);
        }
        if (fVar == null) {
            m83048h0(2);
        }
        if (aVar == null) {
            m83048h0(3);
        }
        if (z0Var == null) {
            m83048h0(4);
        }
        this.f59013V = null;
        this.f59014W = z;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m83048h0(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 18 || i == 21) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 18 || i == 21) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: p1 */
    public static C12331e m83049p1(C14064m mVar, C13921g gVar, C16157f fVar, C14158z0 z0Var, boolean z) {
        if (mVar == null) {
            m83048h0(5);
        }
        if (gVar == null) {
            m83048h0(6);
        }
        if (fVar == null) {
            m83048h0(7);
        }
        if (z0Var == null) {
            m83048h0(8);
        }
        return new C12331e(mVar, (C14156y0) null, gVar, fVar, C13936b.C13937a.DECLARATION, z0Var, z);
    }

    /* renamed from: Q0 */
    public boolean mo68650Q0() {
        return this.f59013V.isStable;
    }

    /* renamed from: g0 */
    public boolean mo68653g0() {
        return this.f59013V.isSynthesized;
    }

    /* renamed from: o1 */
    public C13994g0 mo68658o1(C14146w0 w0Var, C14146w0 w0Var2, List<C14146w0> list, List<? extends C13950e1> list2, List<C13966i1> list3, C14900e0 e0Var, C13945d0 d0Var, C14141u uVar, Map<? extends C13908a.C13909a<?>, ?> map) {
        if (list == null) {
            m83048h0(9);
        }
        if (list2 == null) {
            m83048h0(10);
        }
        if (list3 == null) {
            m83048h0(11);
        }
        if (uVar == null) {
            m83048h0(12);
        }
        C13994g0 o1 = super.mo68658o1(w0Var, w0Var2, list, list2, list3, e0Var, d0Var, uVar, map);
        mo72466f1(C15026p.f64155a.mo74258a(o1).mo74268a());
        if (o1 == null) {
            m83048h0(13);
        }
        return o1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q1 */
    public C12331e mo62205L0(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        if (mVar == null) {
            m83048h0(14);
        }
        if (aVar == null) {
            m83048h0(15);
        }
        if (gVar == null) {
            m83048h0(16);
        }
        if (z0Var == null) {
            m83048h0(17);
        }
        C14156y0 y0Var = (C14156y0) yVar;
        if (fVar == null) {
            fVar = getName();
        }
        C12331e eVar = new C12331e(mVar, y0Var, gVar, fVar, aVar, z0Var, this.f59014W);
        eVar.mo68661s1(mo68650Q0(), mo68653g0());
        return eVar;
    }

    /* renamed from: r1 */
    public C12331e mo68649C(C14900e0 e0Var, List<C14900e0> list, C14900e0 e0Var2, C13328m<C13908a.C13909a<?>, ?> mVar) {
        C14146w0 w0Var;
        if (list == null) {
            m83048h0(19);
        }
        if (e0Var2 == null) {
            m83048h0(20);
        }
        List<C13966i1> a = C12337h.m83069a(list, mo72235g(), this);
        if (e0Var == null) {
            w0Var = null;
        } else {
            w0Var = C14602c.m91476h(this, e0Var, C13921g.f62330v.mo72251b());
        }
        C12331e eVar = (C12331e) mo72401t().mo72495b(a).mo72507m(e0Var2).mo72499e(w0Var).mo72494a().mo72506l().build();
        if (mVar != null) {
            eVar.mo72460U0(mVar.mo70154c(), mVar.mo70155d());
        }
        if (eVar == null) {
            m83048h0(21);
        }
        return eVar;
    }

    /* renamed from: s1 */
    public void mo68661s1(boolean z, boolean z2) {
        this.f59013V = C12334c.m83059d(z, z2);
    }
}
