package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import p362pb.C16157f;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.g */
/* compiled from: ClassDescriptorBase */
public abstract class C13993g extends C13967a {

    /* renamed from: o */
    private final C14064m f62513o;

    /* renamed from: p */
    private final C14158z0 f62514p;

    /* renamed from: s */
    private final boolean f62515s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C13993g(C17012n nVar, C14064m mVar, C16157f fVar, C14158z0 z0Var, boolean z) {
        super(nVar, fVar);
        if (nVar == null) {
            m88861E0(0);
        }
        if (mVar == null) {
            m88861E0(1);
        }
        if (fVar == null) {
            m88861E0(2);
        }
        if (z0Var == null) {
            m88861E0(3);
        }
        this.f62513o = mVar;
        this.f62514p = z0Var;
        this.f62515s = z;
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m88861E0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        C14064m mVar = this.f62513o;
        if (mVar == null) {
            m88861E0(4);
        }
        return mVar;
    }

    public C14158z0 getSource() {
        C14158z0 z0Var = this.f62514p;
        if (z0Var == null) {
            m88861E0(5);
        }
        return z0Var;
    }

    public boolean isExternal() {
        return this.f62515s;
    }
}
