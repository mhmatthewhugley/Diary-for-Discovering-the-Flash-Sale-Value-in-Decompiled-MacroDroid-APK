package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.builtins.C13847c;
import kotlin.reflect.jvm.internal.impl.builtins.C13848d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14145w;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.k */
/* compiled from: DescriptorsJvmAbiUtil */
public final class C14218k {
    /* renamed from: a */
    private static /* synthetic */ void m89800a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static boolean m89801b(C13936b bVar) {
        C14145w w0;
        if (bVar == null) {
            m89800a(3);
        }
        if (!(bVar instanceof C14140t0) || (w0 = ((C14140t0) bVar).mo72348w0()) == null || !w0.getAnnotations().mo72249n1(C14409z.f63196b)) {
            return bVar.getAnnotations().mo72249n1(C14409z.f63196b);
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m89802c(C14064m mVar) {
        if (mVar == null) {
            m89800a(1);
        }
        return C14650d.m91637x(mVar) && C14650d.m91636w(mVar.mo62163b()) && !m89803d((C13948e) mVar);
    }

    /* renamed from: d */
    public static boolean m89803d(C13948e eVar) {
        if (eVar == null) {
            m89800a(2);
        }
        return C13848d.m88219a(C13847c.f62065a, eVar);
    }

    /* renamed from: e */
    public static boolean m89804e(C14140t0 t0Var) {
        if (t0Var == null) {
            m89800a(0);
        }
        if (t0Var.mo72264h() == C13936b.C13937a.FAKE_OVERRIDE) {
            return false;
        }
        if (m89802c(t0Var.mo62163b())) {
            return true;
        }
        if (!C14650d.m91637x(t0Var.mo62163b()) || !m89801b(t0Var)) {
            return false;
        }
        return true;
    }
}
