package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import org.apache.commons.p353io.IOUtils;
import p362pb.C16157f;
import p362pb.C16159h;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.f */
/* compiled from: ClassConstructorDescriptorImpl */
public class C13991f extends C14020p implements C13944d {

    /* renamed from: V */
    protected final boolean f62510V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C13991f(C13948e eVar, C14052l lVar, C13921g gVar, boolean z, C13936b.C13937a aVar, C14158z0 z0Var) {
        super(eVar, lVar, gVar, C16159h.f66310i, aVar, z0Var);
        if (eVar == null) {
            m88830h0(0);
        }
        if (gVar == null) {
            m88830h0(1);
        }
        if (aVar == null) {
            m88830h0(2);
        }
        if (z0Var == null) {
            m88830h0(3);
        }
        this.f62510V = z;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88830h0(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 21 || i == 27)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: k1 */
    private List<C14146w0> m88831k1() {
        C13948e p1 = m88844b();
        if (!p1.mo72286Z().isEmpty()) {
            List<C14146w0> Z = p1.mo72286Z();
            if (Z == null) {
                m88830h0(15);
            }
            return Z;
        }
        List<C14146w0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88830h0(16);
        }
        return emptyList;
    }

    /* renamed from: n1 */
    public static C13991f m88832n1(C13948e eVar, C13921g gVar, boolean z, C14158z0 z0Var) {
        if (eVar == null) {
            m88830h0(4);
        }
        if (gVar == null) {
            m88830h0(5);
        }
        if (z0Var == null) {
            m88830h0(6);
        }
        return new C13991f(eVar, (C14052l) null, gVar, z, C13936b.C13937a.DECLARATION, z0Var);
    }

    /* renamed from: D0 */
    public void mo72262D0(Collection<? extends C13936b> collection) {
        if (collection == null) {
            m88830h0(22);
        }
    }

    /* renamed from: c0 */
    public boolean mo72389c0() {
        return this.f62510V;
    }

    /* renamed from: d */
    public Collection<? extends C14154y> mo72234d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            m88830h0(21);
        }
        return emptySet;
    }

    /* renamed from: d0 */
    public C13948e mo72390d0() {
        C13948e p1 = m88844b();
        if (p1 == null) {
            m88830h0(18);
        }
        return p1;
    }

    /* renamed from: l1 */
    public C14146w0 mo72391l1() {
        C13948e p1 = m88844b();
        if (!p1.mo62182y()) {
            return null;
        }
        C14064m b = p1.mo62163b();
        if (b instanceof C13948e) {
            return ((C13948e) b).mo72283J0();
        }
        return null;
    }

    /* renamed from: m1 */
    public C13944d mo72263O(C14064m mVar, C13945d0 d0Var, C14141u uVar, C13936b.C13937a aVar, boolean z) {
        C13944d dVar = (C13944d) super.mo72263O(mVar, d0Var, uVar, aVar, z);
        if (dVar == null) {
            m88830h0(27);
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public C13991f mo62205L0(C14064m mVar, C14154y yVar, C13936b.C13937a aVar, C16157f fVar, C13921g gVar, C14158z0 z0Var) {
        if (mVar == null) {
            m88830h0(23);
        }
        if (aVar == null) {
            m88830h0(24);
        }
        if (gVar == null) {
            m88830h0(25);
        }
        if (z0Var == null) {
            m88830h0(26);
        }
        C13936b.C13937a aVar2 = C13936b.C13937a.DECLARATION;
        if (aVar == aVar2 || aVar == C13936b.C13937a.SYNTHESIZED) {
            return new C13991f((C13948e) mVar, this, gVar, this.f62510V, aVar2, z0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + IOUtils.LINE_SEPARATOR_UNIX + "newOwner: " + mVar + IOUtils.LINE_SEPARATOR_UNIX + "kind: " + aVar);
    }

    /* renamed from: p1 */
    public C13948e m88844b() {
        C13948e eVar = (C13948e) super.mo62163b();
        if (eVar == null) {
            m88830h0(17);
        }
        return eVar;
    }

    /* renamed from: q1 */
    public C13991f mo72394q1(List<C13966i1> list, C14141u uVar) {
        if (list == null) {
            m88830h0(13);
        }
        if (uVar == null) {
            m88830h0(14);
        }
        mo72395r1(list, uVar, m88844b().mo62178q());
        return this;
    }

    /* renamed from: r1 */
    public C13991f mo72395r1(List<C13966i1> list, C14141u uVar, List<C13950e1> list2) {
        if (list == null) {
            m88830h0(10);
        }
        if (uVar == null) {
            m88830h0(11);
        }
        if (list2 == null) {
            m88830h0(12);
        }
        super.mo72397R0((C14146w0) null, mo72391l1(), m88831k1(), list2, list, (C14900e0) null, C13945d0.FINAL, uVar);
        return this;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo72103j(this, d);
    }

    /* renamed from: c */
    public C13944d m88848c(C14945l1 l1Var) {
        if (l1Var == null) {
            m88830h0(20);
        }
        return (C13944d) super.mo72267c(l1Var);
    }

    /* renamed from: a */
    public C13944d m88840a() {
        C13944d dVar = (C13944d) super.m89079a();
        if (dVar == null) {
            m88830h0(19);
        }
        return dVar;
    }
}
