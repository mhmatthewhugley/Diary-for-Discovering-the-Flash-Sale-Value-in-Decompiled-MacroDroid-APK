package kotlin.reflect.jvm.internal.impl.load.java;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.b */
/* compiled from: AnnotationQualifierApplicabilityType.kt */
public enum C14164b {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");
    
    private final String javaTarget;

    private C14164b(String str) {
        this.javaTarget = str;
    }

    /* renamed from: d */
    public final String mo72681d() {
        return this.javaTarget;
    }
}
