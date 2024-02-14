package p271gb;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14042j;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13978c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13984d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13990e0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C14397r;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p297ja.C13328m;
import p362pb.C16157f;
import p370qa.C16254a;
import p442yb.C17007j;

/* renamed from: gb.f */
/* compiled from: JavaPropertyDescriptor */
public class C12335f extends C13978c0 implements C12327a {

    /* renamed from: T */
    private final boolean f59020T;

    /* renamed from: U */
    private final C13328m<C13908a.C13909a<?>, ?> f59021U;

    /* renamed from: V */
    private C14900e0 f59022V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C12335f(C14064m mVar, C13921g gVar, C13945d0 d0Var, C14141u uVar, boolean z, C16157f fVar, C14158z0 z0Var, C14140t0 t0Var, C13936b.C13937a aVar, boolean z2, C13328m<C13908a.C13909a<?>, ?> mVar2) {
        super(mVar, t0Var, gVar, d0Var, uVar, z, fVar, aVar, z0Var, false, false, false, false, false, false);
        if (mVar == null) {
            m83061h0(0);
        }
        if (gVar == null) {
            m83061h0(1);
        }
        if (d0Var == null) {
            m83061h0(2);
        }
        if (uVar == null) {
            m83061h0(3);
        }
        if (fVar == null) {
            m83061h0(4);
        }
        if (z0Var == null) {
            m83061h0(5);
        }
        if (aVar == null) {
            m83061h0(6);
        }
        this.f59022V = null;
        this.f59020T = z2;
        this.f59021U = mVar2;
    }

    /* renamed from: f1 */
    public static C12335f m83060f1(C14064m mVar, C13921g gVar, C13945d0 d0Var, C14141u uVar, boolean z, C16157f fVar, C14158z0 z0Var, boolean z2) {
        if (mVar == null) {
            m83061h0(7);
        }
        if (gVar == null) {
            m83061h0(8);
        }
        if (d0Var == null) {
            m83061h0(9);
        }
        if (uVar == null) {
            m83061h0(10);
        }
        if (fVar == null) {
            m83061h0(11);
        }
        if (z0Var == null) {
            m83061h0(12);
        }
        return new C12335f(mVar, gVar, d0Var, uVar, z, fVar, z0Var, (C14140t0) null, C13936b.C13937a.DECLARATION, z2, (C13328m<C13908a.C13909a<?>, ?>) null);
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m83061h0(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 21 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 21 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: C */
    public C12327a mo68649C(C14900e0 e0Var, List<C14900e0> list, C14900e0 e0Var2, C13328m<C13908a.C13909a<?>, ?> mVar) {
        C13984d0 d0Var;
        C13990e0 e0Var3;
        C14146w0 w0Var;
        C14900e0 e0Var4 = e0Var;
        C14900e0 e0Var5 = e0Var2;
        if (list == null) {
            m83061h0(19);
        }
        if (e0Var5 == null) {
            m83061h0(20);
        }
        C14140t0 a = m88711a() == this ? null : m88711a();
        C12335f fVar = r5;
        C12335f fVar2 = new C12335f(mo62163b(), getAnnotations(), mo62179r(), getVisibility(), mo72440N(), getName(), getSource(), a, mo72264h(), this.f59020T, mVar);
        C13984d0 R0 = mo72346f();
        if (R0 != null) {
            d0Var = r5;
            C13984d0 d0Var2 = new C13984d0(fVar, R0.getAnnotations(), R0.mo62179r(), R0.getVisibility(), R0.mo72319F(), R0.isExternal(), R0.isInline(), mo72264h(), a == null ? null : a.mo72346f(), R0.getSource());
            d0Var.mo72325N0(R0.mo72331s0());
            d0Var.mo72374Q0(e0Var5);
        } else {
            d0Var = null;
        }
        C14144v0 H = mo72334H();
        if (H != null) {
            C13990e0 e0Var6 = r5;
            C13990e0 e0Var7 = new C13990e0(fVar, H.getAnnotations(), H.mo62179r(), H.getVisibility(), H.mo72319F(), H.isExternal(), H.isInline(), mo72264h(), a == null ? null : a.mo72334H(), H.getSource());
            C13990e0 e0Var8 = e0Var6;
            e0Var8.mo72325N0(e0Var6.mo72331s0());
            e0Var8.mo72387R0(H.mo72235g().get(0));
            e0Var3 = e0Var8;
        } else {
            e0Var3 = null;
        }
        C12335f fVar3 = fVar;
        fVar3.mo72340V0(d0Var, e0Var3, mo72348w0(), mo72336Q());
        fVar3.mo72343a1(mo72341W0());
        C16254a<C17007j<C14617g<?>>> aVar = this.f62565s;
        if (aVar != null) {
            fVar3.mo72457K0(this.f62564p, aVar);
        }
        fVar3.mo72262D0(mo72234d());
        if (e0Var4 == null) {
            w0Var = null;
        } else {
            w0Var = C14602c.m91476h(this, e0Var4, C13921g.f62330v.mo72251b());
        }
        fVar3.mo72344b1(e0Var2, getTypeParameters(), mo72231L(), w0Var, C13614t.m87748j());
        return fVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public C13978c0 mo68662P0(C14064m mVar, C13945d0 d0Var, C14141u uVar, C14140t0 t0Var, C13936b.C13937a aVar, C16157f fVar, C14158z0 z0Var) {
        if (mVar == null) {
            m83061h0(13);
        }
        if (d0Var == null) {
            m83061h0(14);
        }
        if (uVar == null) {
            m83061h0(15);
        }
        if (aVar == null) {
            m83061h0(16);
        }
        if (fVar == null) {
            m83061h0(17);
        }
        if (z0Var == null) {
            m83061h0(18);
        }
        return new C12335f(mVar, getAnnotations(), d0Var, uVar, mo72440N(), fVar, z0Var, t0Var, aVar, this.f59020T, this.f59021U);
    }

    /* renamed from: Z0 */
    public void mo68663Z0(C14900e0 e0Var) {
        if (e0Var == null) {
            m83061h0(22);
        }
        this.f59022V = e0Var;
    }

    /* renamed from: b0 */
    public boolean mo68664b0() {
        C14900e0 type = getType();
        return this.f59020T && C14042j.m89269a(type) && (!C14397r.m90439i(type) || C13853h.m88277u0(type));
    }

    /* renamed from: g0 */
    public boolean mo68653g0() {
        return false;
    }

    /* renamed from: u0 */
    public <V> V mo68665u0(C13908a.C13909a<V> aVar) {
        C13328m<C13908a.C13909a<?>, ?> mVar = this.f59021U;
        if (mVar == null || !mVar.mo70154c().equals(aVar)) {
            return null;
        }
        return this.f59021U.mo70155d();
    }
}
