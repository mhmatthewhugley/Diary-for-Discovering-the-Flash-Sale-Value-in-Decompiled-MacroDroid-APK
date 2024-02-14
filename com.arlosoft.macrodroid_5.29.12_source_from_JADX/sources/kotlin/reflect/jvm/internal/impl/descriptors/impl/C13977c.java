package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14076q0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p362pb.C16159h;
import p416vb.C16759i;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.c */
/* compiled from: AbstractReceiverParameterDescriptor */
public abstract class C13977c extends C13999j implements C14146w0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13977c(C13921g gVar) {
        super(gVar, C16159h.f66309h);
        if (gVar == null) {
            m88671h0(0);
        }
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88671h0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: E0 */
    public C14076q0 m88676a() {
        return this;
    }

    /* renamed from: L */
    public C14146w0 mo72231L() {
        return null;
    }

    /* renamed from: P */
    public C14146w0 mo72232P() {
        return null;
    }

    /* renamed from: d */
    public Collection<? extends C13908a> mo72234d() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            m88671h0(6);
        }
        return emptySet;
    }

    /* renamed from: g */
    public List<C13966i1> mo72235g() {
        List<C13966i1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88671h0(5);
        }
        return emptyList;
    }

    /* renamed from: g0 */
    public boolean mo68653g0() {
        return false;
    }

    public C14900e0 getReturnType() {
        return getType();
    }

    public C14158z0 getSource() {
        C14158z0 z0Var = C14158z0.f62778a;
        if (z0Var == null) {
            m88671h0(9);
        }
        return z0Var;
    }

    public C14900e0 getType() {
        C14900e0 type = getValue().getType();
        if (type == null) {
            m88671h0(4);
        }
        return type;
    }

    public List<C13950e1> getTypeParameters() {
        List<C13950e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88671h0(3);
        }
        return emptyList;
    }

    public C14141u getVisibility() {
        C14141u uVar = C14127t.f62755f;
        if (uVar == null) {
            m88671h0(7);
        }
        return uVar;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo72434l(this, d);
    }

    /* renamed from: c */
    public C14146w0 m88678c(C14945l1 l1Var) {
        C14900e0 e0Var;
        if (l1Var == null) {
            m88671h0(1);
        }
        if (l1Var.mo74212k()) {
            return this;
        }
        if (mo62163b() instanceof C13948e) {
            e0Var = l1Var.mo74215p(getType(), C14970r1.OUT_VARIANCE);
        } else {
            e0Var = l1Var.mo74215p(getType(), C14970r1.INVARIANT);
        }
        if (e0Var == null) {
            return null;
        }
        if (e0Var == getType()) {
            return this;
        }
        return new C13992f0(mo62163b(), new C16759i(e0Var), getAnnotations());
    }
}
