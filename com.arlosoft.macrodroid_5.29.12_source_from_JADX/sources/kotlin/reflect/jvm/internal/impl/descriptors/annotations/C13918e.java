package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import p253ec.C12187a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.e */
/* compiled from: AnnotationUseSiteTarget.kt */
public enum C13918e {
    FIELD((String) null, 1, (String) null),
    FILE((String) null, 1, (String) null),
    PROPERTY((String) null, 1, (String) null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER((String) null, 1, (String) null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    
    private final String renderName;

    private C13918e(String str) {
        this.renderName = str == null ? C12187a.m82855f(name()) : str;
    }

    /* renamed from: d */
    public final String mo72245d() {
        return this.renderName;
    }
}
