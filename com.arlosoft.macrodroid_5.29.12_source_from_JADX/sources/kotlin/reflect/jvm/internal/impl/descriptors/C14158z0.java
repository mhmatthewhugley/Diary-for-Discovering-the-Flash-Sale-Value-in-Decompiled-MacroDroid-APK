package kotlin.reflect.jvm.internal.impl.descriptors;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0 */
/* compiled from: SourceElement */
public interface C14158z0 {

    /* renamed from: a */
    public static final C14158z0 f62778a = new C14159a();

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$a */
    /* compiled from: SourceElement */
    static class C14159a implements C14158z0 {
        C14159a() {
        }

        /* renamed from: d */
        private static /* synthetic */ void m89611d(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"}));
        }

        /* renamed from: b */
        public C13911a1 mo67419b() {
            C13911a1 a1Var = C13911a1.f62310a;
            if (a1Var == null) {
                m89611d(0);
            }
            return a1Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    /* renamed from: b */
    C13911a1 mo67419b();
}
