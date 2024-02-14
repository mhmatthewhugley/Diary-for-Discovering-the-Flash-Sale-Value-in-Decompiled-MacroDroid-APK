package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.b */
/* compiled from: AnnotatedImpl */
public class C13914b implements C13913a {

    /* renamed from: a */
    private final C13921g f62311a;

    public C13914b(C13921g gVar) {
        if (gVar == null) {
            m88485h0(0);
        }
        this.f62311a = gVar;
    }

    /* renamed from: h0 */
    private static /* synthetic */ void m88485h0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C13921g getAnnotations() {
        C13921g gVar = this.f62311a;
        if (gVar == null) {
            m88485h0(1);
        }
        return gVar;
    }
}
