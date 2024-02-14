package p271gb;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13991f;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import org.apache.commons.p353io.IOUtils;
import p297ja.C13328m;
import p362pb.C16157f;

/* renamed from: gb.b */
/* compiled from: JavaClassConstructorDescriptor */
public class C12328b extends C13991f implements C12327a {

    /* renamed from: W */
    private Boolean f59006W;

    /* renamed from: X */
    private Boolean f59007X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C12328b(C13948e eVar, C12328b bVar, C13921g gVar, boolean z, C13936b.C13937a aVar, C14158z0 z0Var) {
        super(eVar, bVar, gVar, z, aVar, z0Var);
        if (eVar == null) {
            m83036h0(0);
        }
        if (gVar == null) {
            m83036h0(1);
        }
        if (aVar == null) {
            m83036h0(2);
        }
        if (z0Var == null) {
            m83036h0(3);
        }
        this.f59006W = null;
        this.f59007X = null;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m83036h0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: t1 */
    public static C12328b m83037t1(C13948e eVar, C13921g gVar, boolean z, C14158z0 z0Var) {
        if (eVar == null) {
            m83036h0(4);
        }
        if (gVar == null) {
            m83036h0(5);
        }
        if (z0Var == null) {
            m83036h0(6);
        }
        return new C12328b(eVar, (C12328b) null, gVar, z, C13936b.C13937a.DECLARATION, z0Var);
    }

    /* renamed from: Q0 */
    public boolean mo68650Q0() {
        return this.f59006W.booleanValue();
    }

    /* renamed from: Y0 */
    public void mo68651Y0(boolean z) {
        this.f59006W = Boolean.valueOf(z);
    }

    /* renamed from: Z0 */
    public void mo68652Z0(boolean z) {
        this.f59007X = Boolean.valueOf(z);
    }

    /* renamed from: g0 */
    public boolean mo68653g0() {
        return this.f59007X.booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public C12328b mo68655s1(C13948e eVar, C12328b bVar, C13936b.C13937a aVar, C14158z0 z0Var, C13921g gVar) {
        if (eVar == null) {
            m83036h0(12);
        }
        if (aVar == null) {
            m83036h0(13);
        }
        if (z0Var == null) {
            m83036h0(14);
        }
        if (gVar == null) {
            m83036h0(15);
        }
        return new C12328b(eVar, bVar, gVar, this.f62510V, aVar, z0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public C12328b mo68654o1(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        if (mVar == null) {
            m83036h0(7);
        }
        if (aVar == null) {
            m83036h0(8);
        }
        if (gVar == null) {
            m83036h0(9);
        }
        if (z0Var == null) {
            m83036h0(10);
        }
        if (aVar == C13936b.C13937a.DECLARATION || aVar == C13936b.C13937a.SYNTHESIZED) {
            C12328b s1 = mo68655s1((C13948e) mVar, (C12328b) yVar, aVar, z0Var, gVar);
            s1.mo68651Y0(mo68650Q0());
            s1.mo68652Z0(mo68653g0());
            return s1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + IOUtils.LINE_SEPARATOR_UNIX + "newOwner: " + mVar + IOUtils.LINE_SEPARATOR_UNIX + "kind: " + aVar);
    }

    /* renamed from: v1 */
    public C12328b mo68649C(C14900e0 e0Var, List<C14900e0> list, C14900e0 e0Var2, C13328m<C13908a.C13909a<?>, ?> mVar) {
        C14146w0 w0Var;
        C14900e0 e0Var3 = e0Var;
        if (list == null) {
            m83036h0(16);
        }
        if (e0Var2 == null) {
            m83036h0(17);
        }
        C12328b u1 = mo68654o1(m88844b(), (C14154y) null, mo72264h(), (C16157f) null, getAnnotations(), getSource());
        if (e0Var3 == null) {
            w0Var = null;
        } else {
            w0Var = C14602c.m91476h(u1, e0Var, C13921g.f62330v.mo72251b());
        }
        u1.mo72397R0(w0Var, mo72231L(), C13614t.m87748j(), getTypeParameters(), C12337h.m83069a(list, mo72235g(), u1), e0Var2, mo62179r(), getVisibility());
        if (mVar != null) {
            u1.mo72460U0(mVar.mo70154c(), mVar.mo70155d());
        }
        return u1;
    }
}
