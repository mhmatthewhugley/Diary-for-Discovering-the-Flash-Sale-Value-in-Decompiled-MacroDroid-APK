package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.y */
/* compiled from: descriptorBasedTypeSignatureMapping.kt */
public interface C14475y<T> {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.y$a */
    /* compiled from: descriptorBasedTypeSignatureMapping.kt */
    public static final class C14476a {
        /* renamed from: a */
        public static <T> String m90714a(C14475y<? extends T> yVar, C13948e eVar) {
            C13706o.m87929f(eVar, "classDescriptor");
            return null;
        }

        /* renamed from: b */
        public static <T> C14900e0 m90715b(C14475y<? extends T> yVar, C14900e0 e0Var) {
            C13706o.m87929f(e0Var, "kotlinType");
            return null;
        }
    }

    /* renamed from: a */
    T mo73227a(C13948e eVar);

    /* renamed from: b */
    String mo73228b(C13948e eVar);

    /* renamed from: c */
    String mo73229c(C13948e eVar);

    /* renamed from: d */
    C14900e0 mo73230d(C14900e0 e0Var);

    /* renamed from: e */
    void mo73231e(C14900e0 e0Var, C13948e eVar);

    /* renamed from: f */
    C14900e0 mo73232f(Collection<C14900e0> collection);
}
