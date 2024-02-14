package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14123z;
import p288ib.C12479a;
import p288ib.C12485c0;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c0 */
/* compiled from: ReflectJavaWildcardType.kt */
public final class C14087c0 extends C14123z implements C12485c0 {

    /* renamed from: b */
    private final WildcardType f62710b;

    /* renamed from: c */
    private final Collection<C12479a> f62711c = C13614t.m87748j();

    /* renamed from: d */
    private final boolean f62712d;

    public C14087c0(WildcardType wildcardType) {
        C13706o.m87929f(wildcardType, "reflectType");
        this.f62710b = wildcardType;
    }

    /* renamed from: I */
    public boolean mo68962I() {
        return this.f62712d;
    }

    /* renamed from: J */
    public boolean mo68959J() {
        Type[] upperBounds = mo72603N().getUpperBounds();
        C13706o.m87928e(upperBounds, "reflectType.upperBounds");
        return !C13706o.m87924a(C13596m.m87578C(upperBounds), Object.class);
    }

    /* renamed from: O */
    public C14123z mo68960v() {
        Type[] upperBounds = mo72603N().getUpperBounds();
        Type[] lowerBounds = mo72603N().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + mo72603N());
        } else if (lowerBounds.length == 1) {
            C14123z.C14124a aVar = C14123z.f62749a;
            C13706o.m87928e(lowerBounds, "lowerBounds");
            Object V = C13596m.m87597V(lowerBounds);
            C13706o.m87928e(V, "lowerBounds.single()");
            return aVar.mo72656a((Type) V);
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            C13706o.m87928e(upperBounds, "upperBounds");
            Type type = (Type) C13596m.m87597V(upperBounds);
            if (C13706o.m87924a(type, Object.class)) {
                return null;
            }
            C14123z.C14124a aVar2 = C14123z.f62749a;
            C13706o.m87928e(type, "ub");
            return aVar2.mo72656a(type);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public WildcardType mo72603N() {
        return this.f62710b;
    }

    public Collection<C12479a> getAnnotations() {
        return this.f62711c;
    }
}
