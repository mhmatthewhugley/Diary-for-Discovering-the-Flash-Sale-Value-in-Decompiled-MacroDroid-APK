package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 */
/* compiled from: PropertyAccessorDescriptorImpl */
public abstract class C13976b0 extends C14003k implements C14126s0 {

    /* renamed from: A */
    private final C13936b.C13937a f62447A;

    /* renamed from: B */
    private C14141u f62448B;

    /* renamed from: C */
    private C14154y f62449C;

    /* renamed from: g */
    private boolean f62450g;

    /* renamed from: o */
    private final boolean f62451o;

    /* renamed from: p */
    private final C13945d0 f62452p;

    /* renamed from: s */
    private final C14140t0 f62453s;

    /* renamed from: z */
    private final boolean f62454z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13976b0(C13945d0 d0Var, C14141u uVar, C14140t0 t0Var, C13921g gVar, C16157f fVar, boolean z, boolean z2, boolean z3, C13936b.C13937a aVar, C14158z0 z0Var) {
        super(t0Var.mo62163b(), gVar, fVar, z0Var);
        if (d0Var == null) {
            m88640h0(0);
        }
        if (uVar == null) {
            m88640h0(1);
        }
        if (t0Var == null) {
            m88640h0(2);
        }
        if (gVar == null) {
            m88640h0(3);
        }
        if (fVar == null) {
            m88640h0(4);
        }
        if (z0Var == null) {
            m88640h0(5);
        }
        this.f62449C = null;
        this.f62452p = d0Var;
        this.f62448B = uVar;
        this.f62453s = t0Var;
        this.f62450g = z;
        this.f62451o = z2;
        this.f62454z = z3;
        this.f62447A = aVar;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88640h0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
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
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
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

    /* renamed from: B */
    public boolean mo62204B() {
        return false;
    }

    /* renamed from: C0 */
    public boolean mo72317C0() {
        return false;
    }

    /* renamed from: D0 */
    public void mo72262D0(Collection<? extends C13936b> collection) {
        if (collection == null) {
            m88640h0(15);
        }
    }

    /* renamed from: F */
    public boolean mo72319F() {
        return this.f62450g;
    }

    /* renamed from: F0 */
    public boolean mo72320F0() {
        return false;
    }

    /* renamed from: G0 */
    public C14126s0 mo72263O(C14064m mVar, C13945d0 d0Var, C14141u uVar, C13936b.C13937a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    /* renamed from: K0 */
    public abstract C14126s0 m88661a();

    /* renamed from: L */
    public C14146w0 mo72231L() {
        return mo72327W().mo72231L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public Collection<C14126s0> mo72323L0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (C14140t0 t0Var : mo72327W().mo72234d()) {
            Object f = z ? t0Var.mo72346f() : t0Var.mo72334H();
            if (f != null) {
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* renamed from: M0 */
    public void mo72324M0(boolean z) {
        this.f62450g = z;
    }

    /* renamed from: N0 */
    public void mo72325N0(C14154y yVar) {
        this.f62449C = yVar;
    }

    /* renamed from: O0 */
    public void mo72326O0(C14141u uVar) {
        this.f62448B = uVar;
    }

    /* renamed from: P */
    public C14146w0 mo72232P() {
        return mo72327W().mo72232P();
    }

    /* renamed from: W */
    public C14140t0 mo72327W() {
        C14140t0 t0Var = this.f62453s;
        if (t0Var == null) {
            m88640h0(12);
        }
        return t0Var;
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return false;
    }

    /* renamed from: g0 */
    public boolean mo68653g0() {
        return false;
    }

    public List<C13950e1> getTypeParameters() {
        List<C13950e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88640h0(8);
        }
        return emptyList;
    }

    public C14141u getVisibility() {
        C14141u uVar = this.f62448B;
        if (uVar == null) {
            m88640h0(10);
        }
        return uVar;
    }

    /* renamed from: h */
    public C13936b.C13937a mo72264h() {
        C13936b.C13937a aVar = this.f62447A;
        if (aVar == null) {
            m88640h0(6);
        }
        return aVar;
    }

    public boolean isExternal() {
        return this.f62451o;
    }

    public boolean isInfix() {
        return false;
    }

    public boolean isInline() {
        return this.f62454z;
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return false;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        C13945d0 d0Var = this.f62452p;
        if (d0Var == null) {
            m88640h0(9);
        }
        return d0Var;
    }

    /* renamed from: s0 */
    public C14154y mo72331s0() {
        return this.f62449C;
    }

    /* renamed from: u0 */
    public <V> V mo68665u0(C13908a.C13909a<V> aVar) {
        return null;
    }

    /* renamed from: x0 */
    public List<C14146w0> mo72238x0() {
        List<C14146w0> x0 = mo72327W().mo72238x0();
        if (x0 == null) {
            m88640h0(13);
        }
        return x0;
    }

    /* renamed from: c */
    public C14154y m88663c(C14945l1 l1Var) {
        if (l1Var == null) {
            m88640h0(7);
        }
        throw new UnsupportedOperationException();
    }
}
