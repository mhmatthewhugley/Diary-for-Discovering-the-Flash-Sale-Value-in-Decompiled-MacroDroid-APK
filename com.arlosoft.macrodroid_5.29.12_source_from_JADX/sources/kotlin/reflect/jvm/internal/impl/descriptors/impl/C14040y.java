package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14943l;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.y */
/* compiled from: MutableClassDescriptor */
public class C14040y extends C13993g {

    /* renamed from: A */
    private final boolean f62651A;

    /* renamed from: B */
    private C13945d0 f62652B;

    /* renamed from: C */
    private C14141u f62653C;

    /* renamed from: D */
    private C14901e1 f62654D;

    /* renamed from: E */
    private List<C13950e1> f62655E;

    /* renamed from: F */
    private final Collection<C14900e0> f62656F;

    /* renamed from: G */
    private final C17012n f62657G;

    /* renamed from: z */
    private final C13951f f62658z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14040y(C14064m mVar, C13951f fVar, boolean z, boolean z2, C16157f fVar2, C14158z0 z0Var, C17012n nVar) {
        super(nVar, mVar, fVar2, z0Var, z2);
        if (mVar == null) {
            m89241E0(0);
        }
        if (fVar == null) {
            m89241E0(1);
        }
        if (fVar2 == null) {
            m89241E0(2);
        }
        if (z0Var == null) {
            m89241E0(3);
        }
        if (nVar == null) {
            m89241E0(4);
        }
        this.f62656F = new ArrayList();
        this.f62657G = nVar;
        this.f62658z = fVar;
        this.f62651A = z;
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m89241E0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
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
    public void mo72545K0() {
        this.f62654D = new C14943l(this, this.f62655E, this.f62656F, this.f62657G);
        Iterator<C13944d> it = mo62173k().iterator();
        while (it.hasNext()) {
            ((C13991f) it.next()).mo72467g1(mo72274p());
        }
    }

    /* renamed from: L0 */
    public Set<C13944d> mo62173k() {
        Set<C13944d> emptySet = Collections.emptySet();
        if (emptySet == null) {
            m89241E0(13);
        }
        return emptySet;
    }

    /* renamed from: M0 */
    public void mo72547M0(C13945d0 d0Var) {
        if (d0Var == null) {
            m89241E0(6);
        }
        this.f62652B = d0Var;
    }

    /* renamed from: N0 */
    public void mo72548N0(List<C13950e1> list) {
        if (list == null) {
            m89241E0(14);
        }
        if (this.f62655E == null) {
            this.f62655E = new ArrayList(list);
            return;
        }
        throw new IllegalStateException("Type parameters are already set for " + getName());
    }

    /* renamed from: O0 */
    public void mo72549O0(C14141u uVar) {
        if (uVar == null) {
            m89241E0(9);
        }
        this.f62653C = uVar;
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
        C13921g b = C13921g.f62330v.mo72251b();
        if (b == null) {
            m89241E0(5);
        }
        return b;
    }

    public C14141u getVisibility() {
        C14141u uVar = this.f62653C;
        if (uVar == null) {
            m89241E0(10);
        }
        return uVar;
    }

    /* renamed from: h */
    public C13951f mo62168h() {
        C13951f fVar = this.f62658z;
        if (fVar == null) {
            m89241E0(8);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        C14901e1 e1Var = this.f62654D;
        if (e1Var == null) {
            m89241E0(11);
        }
        return e1Var;
    }

    /* renamed from: j0 */
    public boolean mo62172j0() {
        return false;
    }

    /* renamed from: k0 */
    public C14692h mo62174k0(C14849g gVar) {
        if (gVar == null) {
            m89241E0(16);
        }
        C14692h.C14695b bVar = C14692h.C14695b.f63726b;
        if (bVar == null) {
            m89241E0(17);
        }
        return bVar;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return false;
    }

    /* renamed from: m0 */
    public C14692h mo62176m0() {
        C14692h.C14695b bVar = C14692h.C14695b.f63726b;
        if (bVar == null) {
            m89241E0(18);
        }
        return bVar;
    }

    /* renamed from: n0 */
    public C13948e mo62177n0() {
        return null;
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        List<C13950e1> list = this.f62655E;
        if (list == null) {
            m89241E0(15);
        }
        return list;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        C13945d0 d0Var = this.f62652B;
        if (d0Var == null) {
            m89241E0(7);
        }
        return d0Var;
    }

    public String toString() {
        return C13999j.m88908k0(this);
    }

    /* renamed from: w */
    public Collection<C13948e> mo62181w() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m89241E0(19);
        }
        return emptyList;
    }

    /* renamed from: y */
    public boolean mo62182y() {
        return this.f62651A;
    }
}
