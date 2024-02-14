package kotlin.reflect.jvm.internal.impl.renderer;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.a */
/* compiled from: DescriptorRenderer.kt */
public enum C14547a {
    NO_ARGUMENTS(false, false, 3, (boolean) null),
    UNLESS_EMPTY(true, false, 2, (boolean) null),
    ALWAYS_PARENTHESIZED(true, true);
    
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    private C14547a(boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }

    /* renamed from: d */
    public final boolean mo73524d() {
        return this.includeAnnotationArguments;
    }

    /* renamed from: e */
    public final boolean mo73525e() {
        return this.includeEmptyAnnotationArguments;
    }
}
