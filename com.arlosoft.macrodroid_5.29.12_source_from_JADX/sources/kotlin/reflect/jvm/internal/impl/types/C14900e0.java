package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13913a;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import kotlin.reflect.jvm.internal.impl.types.checker.C14866r;
import p218bc.C11134i;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.e0 */
/* compiled from: KotlinType.kt */
public abstract class C14900e0 implements C13913a, C11134i {

    /* renamed from: a */
    private int f64031a;

    private C14900e0() {
    }

    public /* synthetic */ C14900e0(C13695i iVar) {
        this();
    }

    /* renamed from: K0 */
    private final int m92776K0() {
        if (C14925g0.m92873a(this)) {
            return super.hashCode();
        }
        return (((mo73702N0().hashCode() * 31) + mo73700L0().hashCode()) * 31) + (mo73021O0() ? 1 : 0);
    }

    /* renamed from: L0 */
    public abstract List<C14926g1> mo73700L0();

    /* renamed from: M0 */
    public abstract C14830a1 mo73701M0();

    /* renamed from: N0 */
    public abstract C14901e1 mo73702N0();

    /* renamed from: O0 */
    public abstract boolean mo73021O0();

    /* renamed from: P0 */
    public abstract C14900e0 mo72946P0(C14849g gVar);

    /* renamed from: Q0 */
    public abstract C14967q1 mo74145Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14900e0)) {
            return false;
        }
        C14900e0 e0Var = (C14900e0) obj;
        if (mo73021O0() != e0Var.mo73021O0() || !C14866r.f63992a.mo74099a(mo74145Q0(), e0Var.mo74145Q0())) {
            return false;
        }
        return true;
    }

    public C13921g getAnnotations() {
        return C14940k.m92916a(mo73701M0());
    }

    public final int hashCode() {
        int i = this.f64031a;
        if (i != 0) {
            return i;
        }
        int K0 = m92776K0();
        this.f64031a = K0;
        return K0;
    }

    /* renamed from: n */
    public abstract C14692h mo72955n();
}
