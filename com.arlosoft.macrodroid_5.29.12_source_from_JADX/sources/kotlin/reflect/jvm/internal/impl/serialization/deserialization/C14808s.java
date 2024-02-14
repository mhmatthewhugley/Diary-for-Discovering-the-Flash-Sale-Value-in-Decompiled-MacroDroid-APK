package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p308kb.C13508q;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.s */
/* compiled from: FlexibleTypeDeserializer.kt */
public interface C14808s {

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.s$a */
    /* compiled from: FlexibleTypeDeserializer.kt */
    public static final class C14809a implements C14808s {

        /* renamed from: a */
        public static final C14809a f63933a = new C14809a();

        private C14809a() {
        }

        /* renamed from: a */
        public C14900e0 mo73169a(C13508q qVar, String str, C14951m0 m0Var, C14951m0 m0Var2) {
            C13706o.m87929f(qVar, "proto");
            C13706o.m87929f(str, "flexibleId");
            C13706o.m87929f(m0Var, "lowerBound");
            C13706o.m87929f(m0Var2, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    /* renamed from: a */
    C14900e0 mo73169a(C13508q qVar, String str, C14951m0 m0Var, C14951m0 m0Var2);
}
