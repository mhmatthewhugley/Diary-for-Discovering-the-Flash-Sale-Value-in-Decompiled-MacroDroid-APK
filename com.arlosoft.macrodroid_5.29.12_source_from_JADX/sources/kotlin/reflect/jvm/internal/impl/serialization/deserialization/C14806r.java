package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.r */
/* compiled from: ErrorReporter */
public interface C14806r {

    /* renamed from: a */
    public static final C14806r f63932a = new C14807a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.r$a */
    /* compiled from: ErrorReporter */
    static class C14807a implements C14806r {
        C14807a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m92327c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo67439a(C13936b bVar) {
            if (bVar == null) {
                m92327c(2);
            }
        }

        /* renamed from: b */
        public void mo67440b(C13948e eVar, List<String> list) {
            if (eVar == null) {
                m92327c(0);
            }
            if (list == null) {
                m92327c(1);
            }
        }
    }

    /* renamed from: a */
    void mo67439a(C13936b bVar);

    /* renamed from: b */
    void mo67440b(C13948e eVar, List<String> list);
}
