package kotlin.reflect.jvm.internal.impl.descriptors;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.f */
/* compiled from: ClassKind.kt */
public enum C13951f {
    CLASS("class"),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY((String) null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");
    
    private final String codeRepresentation;

    private C13951f(String str) {
        this.codeRepresentation = str;
    }

    /* renamed from: d */
    public final boolean mo72288d() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
