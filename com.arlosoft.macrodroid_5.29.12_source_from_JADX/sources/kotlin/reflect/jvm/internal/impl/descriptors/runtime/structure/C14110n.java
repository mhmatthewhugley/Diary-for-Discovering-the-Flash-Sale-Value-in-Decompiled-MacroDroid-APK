package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14123z;
import p288ib.C12479a;
import p288ib.C12494i;
import p288ib.C12495j;
import p288ib.C12510x;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.n */
/* compiled from: ReflectJavaClassifierType.kt */
public final class C14110n extends C14123z implements C12495j {

    /* renamed from: b */
    private final Type f62737b;

    /* renamed from: c */
    private final C12494i f62738c;

    public C14110n(Type type) {
        C12494i iVar;
        C13706o.m87929f(type, "reflectType");
        this.f62737b = type;
        Type N = mo72603N();
        if (N instanceof Class) {
            iVar = new C14100l((Class) N);
        } else if (N instanceof TypeVariable) {
            iVar = new C14081a0((TypeVariable) N);
        } else if (N instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) N).getRawType();
            C13706o.m87927d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            iVar = new C14100l((Class) rawType);
        } else {
            throw new IllegalStateException("Not a classifier type (" + N.getClass() + "): " + N);
        }
        this.f62738c = iVar;
    }

    /* renamed from: B */
    public String mo68983B() {
        return mo72603N().toString();
    }

    /* renamed from: D */
    public String mo68984D() {
        throw new UnsupportedOperationException("Type not found: " + mo72603N());
    }

    /* renamed from: H */
    public C12479a mo68961H(C16152c cVar) {
        C13706o.m87929f(cVar, "fqName");
        return null;
    }

    /* renamed from: I */
    public boolean mo68962I() {
        return false;
    }

    /* renamed from: N */
    public Type mo72603N() {
        return this.f62737b;
    }

    /* renamed from: c */
    public C12494i mo68985c() {
        return this.f62738c;
    }

    public Collection<C12479a> getAnnotations() {
        return C13614t.m87748j();
    }

    /* renamed from: r */
    public boolean mo68986r() {
        Type N = mo72603N();
        if (!(N instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) N).getTypeParameters();
        C13706o.m87928e(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    /* renamed from: x */
    public List<C12510x> mo68987x() {
        List<Type> d = C14088d.m89400d(mo72603N());
        C14123z.C14124a aVar = C14123z.f62749a;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(d, 10));
        for (Type a : d) {
            arrayList.add(aVar.mo72656a(a));
        }
        return arrayList;
    }
}
