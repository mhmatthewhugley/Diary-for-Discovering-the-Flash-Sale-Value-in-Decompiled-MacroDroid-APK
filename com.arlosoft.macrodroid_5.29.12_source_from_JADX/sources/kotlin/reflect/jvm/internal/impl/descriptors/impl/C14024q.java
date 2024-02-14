package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import p416vb.C16755e;
import p416vb.C16756f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.q */
/* compiled from: LazyClassReceiverParameterDescriptor */
public class C14024q extends C13977c {

    /* renamed from: d */
    private final C13948e f62620d;

    /* renamed from: f */
    private final C16755e f62621f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14024q(C13948e eVar) {
        super(C13921g.f62330v.mo72251b());
        if (eVar == null) {
            m89151h0(0);
        }
        this.f62620d = eVar;
        this.f62621f = new C16755e(eVar, (C16755e) null);
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m89151h0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public C14064m mo62163b() {
        C13948e eVar = this.f62620d;
        if (eVar == null) {
            m89151h0(2);
        }
        return eVar;
    }

    public C16756f getValue() {
        C16755e eVar = this.f62621f;
        if (eVar == null) {
            m89151h0(1);
        }
        return eVar;
    }

    public String toString() {
        return "class " + this.f62620d.getName() + "::this";
    }
}
