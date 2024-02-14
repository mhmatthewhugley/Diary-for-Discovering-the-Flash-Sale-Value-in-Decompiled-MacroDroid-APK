package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14123z;
import p288ib.C12479a;
import p288ib.C12491f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.k */
/* compiled from: ReflectJavaArrayType.kt */
public final class C14099k extends C14123z implements C12491f {

    /* renamed from: b */
    private final Type f62724b;

    /* renamed from: c */
    private final C14123z f62725c;

    /* renamed from: d */
    private final Collection<C12479a> f62726d;

    /* renamed from: e */
    private final boolean f62727e;

    public C14099k(Type type) {
        C14123z zVar;
        C13706o.m87929f(type, "reflectType");
        this.f62724b = type;
        Type N = mo72603N();
        if (N instanceof GenericArrayType) {
            C14123z.C14124a aVar = C14123z.f62749a;
            Type genericComponentType = ((GenericArrayType) N).getGenericComponentType();
            C13706o.m87928e(genericComponentType, "genericComponentType");
            zVar = aVar.mo72656a(genericComponentType);
        } else {
            if (N instanceof Class) {
                Class cls = (Class) N;
                if (cls.isArray()) {
                    C14123z.C14124a aVar2 = C14123z.f62749a;
                    Class<?> componentType = cls.getComponentType();
                    C13706o.m87928e(componentType, "getComponentType()");
                    zVar = aVar2.mo72656a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + mo72603N().getClass() + "): " + mo72603N());
        }
        this.f62725c = zVar;
        this.f62726d = C13614t.m87748j();
    }

    /* renamed from: I */
    public boolean mo68962I() {
        return this.f62727e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public Type mo72603N() {
        return this.f62724b;
    }

    /* renamed from: O */
    public C14123z mo68965i() {
        return this.f62725c;
    }

    public Collection<C12479a> getAnnotations() {
        return this.f62726d;
    }
}
