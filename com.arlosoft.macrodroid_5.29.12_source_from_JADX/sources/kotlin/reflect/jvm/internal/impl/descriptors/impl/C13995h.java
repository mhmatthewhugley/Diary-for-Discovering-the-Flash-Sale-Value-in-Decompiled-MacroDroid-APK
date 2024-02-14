package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
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

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.h */
/* compiled from: ClassDescriptorImpl */
public class C13995h extends C13993g {

    /* renamed from: A */
    private final C13951f f62516A;

    /* renamed from: B */
    private final C14901e1 f62517B;

    /* renamed from: C */
    private C14692h f62518C;

    /* renamed from: D */
    private Set<C13944d> f62519D;

    /* renamed from: E */
    private C13944d f62520E;

    /* renamed from: z */
    private final C13945d0 f62521z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13995h(C14064m mVar, C16157f fVar, C13945d0 d0Var, C13951f fVar2, Collection<C14900e0> collection, C14158z0 z0Var, boolean z, C17012n nVar) {
        super(nVar, mVar, fVar, z0Var, z);
        if (mVar == null) {
            m88879E0(0);
        }
        if (fVar == null) {
            m88879E0(1);
        }
        if (d0Var == null) {
            m88879E0(2);
        }
        if (fVar2 == null) {
            m88879E0(3);
        }
        if (collection == null) {
            m88879E0(4);
        }
        if (z0Var == null) {
            m88879E0(5);
        }
        if (nVar == null) {
            m88879E0(6);
        }
        this.f62521z = d0Var;
        this.f62516A = fVar2;
        this.f62517B = new C14943l(this, Collections.emptyList(), collection, nVar);
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m88879E0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
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
        return this.f62520E;
    }

    /* renamed from: I0 */
    public boolean mo62150I0() {
        return false;
    }

    /* renamed from: K0 */
    public final void mo72402K0(C14692h hVar, Set<C13944d> set, C13944d dVar) {
        if (hVar == null) {
            m88879E0(7);
        }
        if (set == null) {
            m88879E0(8);
        }
        this.f62518C = hVar;
        this.f62519D = set;
        this.f62520E = dVar;
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
            m88879E0(9);
        }
        return b;
    }

    public C14141u getVisibility() {
        C14141u uVar = C14127t.f62754e;
        if (uVar == null) {
            m88879E0(17);
        }
        return uVar;
    }

    /* renamed from: h */
    public C13951f mo62168h() {
        C13951f fVar = this.f62516A;
        if (fVar == null) {
            m88879E0(15);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        C14901e1 e1Var = this.f62517B;
        if (e1Var == null) {
            m88879E0(10);
        }
        return e1Var;
    }

    /* renamed from: j0 */
    public boolean mo62172j0() {
        return false;
    }

    /* renamed from: k */
    public Collection<C13944d> mo62173k() {
        Set<C13944d> set = this.f62519D;
        if (set == null) {
            m88879E0(11);
        }
        return set;
    }

    /* renamed from: k0 */
    public C14692h mo62174k0(C14849g gVar) {
        if (gVar == null) {
            m88879E0(12);
        }
        C14692h hVar = this.f62518C;
        if (hVar == null) {
            m88879E0(13);
        }
        return hVar;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return false;
    }

    /* renamed from: m0 */
    public C14692h mo62176m0() {
        C14692h.C14695b bVar = C14692h.C14695b.f63726b;
        if (bVar == null) {
            m88879E0(14);
        }
        return bVar;
    }

    /* renamed from: n0 */
    public C13948e mo62177n0() {
        return null;
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        List<C13950e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88879E0(18);
        }
        return emptyList;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        C13945d0 d0Var = this.f62521z;
        if (d0Var == null) {
            m88879E0(16);
        }
        return d0Var;
    }

    public String toString() {
        return "class " + getName();
    }

    /* renamed from: w */
    public Collection<C13948e> mo62181w() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88879E0(19);
        }
        return emptyList;
    }

    /* renamed from: y */
    public boolean mo62182y() {
        return false;
    }
}
