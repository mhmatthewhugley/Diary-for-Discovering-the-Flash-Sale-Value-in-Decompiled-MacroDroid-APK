package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.EnumMap;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.x */
/* compiled from: JavaTypeQualifiersByElementType.kt */
public final class C14406x {

    /* renamed from: a */
    private final EnumMap<C14164b, C14330q> f63189a;

    public C14406x(EnumMap<C14164b, C14330q> enumMap) {
        C13706o.m87929f(enumMap, "defaultQualifiers");
        this.f63189a = enumMap;
    }

    /* renamed from: a */
    public final C14330q mo73098a(C14164b bVar) {
        return this.f63189a.get(bVar);
    }

    /* renamed from: b */
    public final EnumMap<C14164b, C14330q> mo73099b() {
        return this.f63189a;
    }
}
