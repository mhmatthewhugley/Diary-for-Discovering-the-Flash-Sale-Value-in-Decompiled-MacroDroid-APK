package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16157f;
import p370qa.C16254a;
import p442yb.C17007j;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 */
/* compiled from: VariableDescriptorWithInitializerImpl */
public abstract class C14018n0 extends C14011m0 {

    /* renamed from: o */
    private final boolean f62563o;

    /* renamed from: p */
    protected C17007j<C14617g<?>> f62564p;

    /* renamed from: s */
    protected C16254a<C17007j<C14617g<?>>> f62565s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14018n0(C14064m mVar, C13921g gVar, C16157f fVar, C14900e0 e0Var, boolean z, C14158z0 z0Var) {
        super(mVar, gVar, fVar, e0Var, z0Var);
        if (mVar == null) {
            m89042h0(0);
        }
        if (gVar == null) {
            m89042h0(1);
        }
        if (fVar == null) {
            m89042h0(2);
        }
        if (z0Var == null) {
            m89042h0(3);
        }
        this.f62563o = z;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m89042h0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: K0 */
    public void mo72457K0(C17007j<C14617g<?>> jVar, C16254a<C17007j<C14617g<?>>> aVar) {
        if (aVar == null) {
            m89042h0(5);
        }
        this.f62565s = aVar;
        if (jVar == null) {
            jVar = aVar.invoke();
        }
        this.f62564p = jVar;
    }

    /* renamed from: L0 */
    public void mo72458L0(C16254a<C17007j<C14617g<?>>> aVar) {
        if (aVar == null) {
            m89042h0(4);
        }
        mo72457K0((C17007j<C14617g<?>>) null, aVar);
    }

    /* renamed from: N */
    public boolean mo72440N() {
        return this.f62563o;
    }

    /* renamed from: o0 */
    public C14617g<?> mo72441o0() {
        C17007j<C14617g<?>> jVar = this.f62564p;
        if (jVar != null) {
            return (C14617g) jVar.invoke();
        }
        return null;
    }
}
