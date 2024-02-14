package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.z0 */
/* compiled from: TypeAttributeTranslator.kt */
public interface C14994z0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.z0$a */
    /* compiled from: TypeAttributeTranslator.kt */
    public static final class C14995a {
        /* renamed from: a */
        public static /* synthetic */ C14830a1 m93195a(C14994z0 z0Var, C13921g gVar, C14901e1 e1Var, C14064m mVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    e1Var = null;
                }
                if ((i & 4) != 0) {
                    mVar = null;
                }
                return z0Var.mo74224a(gVar, e1Var, mVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
        }
    }

    /* renamed from: a */
    C14830a1 mo74224a(C13921g gVar, C14901e1 e1Var, C14064m mVar);
}
