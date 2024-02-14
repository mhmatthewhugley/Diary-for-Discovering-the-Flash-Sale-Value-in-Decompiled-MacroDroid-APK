package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.e */
/* compiled from: ExternalOverridabilityCondition */
public interface C14651e {

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.e$a */
    /* compiled from: ExternalOverridabilityCondition */
    public enum C14652a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.e$b */
    /* compiled from: ExternalOverridabilityCondition */
    public enum C14653b {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    C14652a mo72758a();

    /* renamed from: b */
    C14653b mo72759b(C13908a aVar, C13908a aVar2, C13948e eVar);
}
