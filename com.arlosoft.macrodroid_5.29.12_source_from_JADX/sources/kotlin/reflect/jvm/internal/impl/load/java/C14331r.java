package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14068m1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14075q;
import kotlin.reflect.jvm.internal.impl.descriptors.C14077r;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import p224cb.C11167a;
import p224cb.C11168b;
import p224cb.C11169c;
import p416vb.C16756f;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.r */
/* compiled from: JavaDescriptorVisibilities */
public class C14331r {

    /* renamed from: a */
    public static final C14141u f63110a;

    /* renamed from: b */
    public static final C14141u f63111b;

    /* renamed from: c */
    public static final C14141u f63112c;

    /* renamed from: d */
    private static final Map<C14068m1, C14141u> f63113d = new HashMap();

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.r$a */
    /* compiled from: JavaDescriptorVisibilities */
    static class C14332a extends C14077r {
        C14332a(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m90261g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m90261g(0);
            }
            if (mVar == null) {
                m90261g(1);
            }
            return C14331r.m90257d(qVar, mVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.r$b */
    /* compiled from: JavaDescriptorVisibilities */
    static class C14333b extends C14077r {
        C14333b(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m90263g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m90263g(0);
            }
            if (mVar == null) {
                m90263g(1);
            }
            return C14331r.m90258e(fVar, qVar, mVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.r$c */
    /* compiled from: JavaDescriptorVisibilities */
    static class C14334c extends C14077r {
        C14334c(C14068m1 m1Var) {
            super(m1Var);
        }

        /* renamed from: g */
        private static /* synthetic */ void m90265g(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = TypedValues.Transition.S_FROM;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: e */
        public boolean mo72658e(C16756f fVar, C14075q qVar, C14064m mVar, boolean z) {
            if (qVar == null) {
                m90265g(0);
            }
            if (mVar == null) {
                m90265g(1);
            }
            return C14331r.m90258e(fVar, qVar, mVar);
        }
    }

    static {
        C14332a aVar = new C14332a(C11167a.f54074c);
        f63110a = aVar;
        C14333b bVar = new C14333b(C11169c.f54076c);
        f63111b = bVar;
        C14334c cVar = new C14334c(C11168b.f54075c);
        f63112c = cVar;
        m90259f(aVar);
        m90259f(bVar);
        m90259f(cVar);
    }

    /* renamed from: a */
    private static /* synthetic */ void m90254a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = TypedValues.Transition.S_FROM;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (!(i == 5 || i == 6)) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m90257d(C14064m mVar, C14064m mVar2) {
        Class<C14050k0> cls = C14050k0.class;
        if (mVar == null) {
            m90254a(2);
        }
        if (mVar2 == null) {
            m90254a(3);
        }
        C14050k0 k0Var = (C14050k0) C14650d.m91631r(mVar, cls, false);
        C14050k0 k0Var2 = (C14050k0) C14650d.m91631r(mVar2, cls, false);
        if (k0Var2 == null || k0Var == null || !k0Var.mo72551e().equals(k0Var2.mo72551e())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m90258e(C16756f fVar, C14075q qVar, C14064m mVar) {
        if (qVar == null) {
            m90254a(0);
        }
        if (mVar == null) {
            m90254a(1);
        }
        if (m90257d(C14650d.m91613M(qVar), mVar)) {
            return true;
        }
        return C14127t.f62752c.mo72658e(fVar, qVar, mVar, false);
    }

    /* renamed from: f */
    private static void m90259f(C14141u uVar) {
        f63113d.put(uVar.mo72570b(), uVar);
    }

    /* renamed from: g */
    public static C14141u m90260g(C14068m1 m1Var) {
        if (m1Var == null) {
            m90254a(4);
        }
        C14141u uVar = f63113d.get(m1Var);
        if (uVar != null) {
            return uVar;
        }
        C14141u j = C14127t.m89528j(m1Var);
        if (j == null) {
            m90254a(5);
        }
        return j;
    }
}
