package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C14123z;
import p288ib.C12482b;
import p288ib.C12483b0;
import p288ib.C12503r;
import p362pb.C16157f;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u */
/* compiled from: ReflectJavaMethod.kt */
public final class C14117u extends C14116t implements C12503r {

    /* renamed from: a */
    private final Method f62743a;

    public C14117u(Method method) {
        C13706o.m87929f(method, "member");
        this.f62743a = method;
    }

    /* renamed from: K */
    public boolean mo68996K() {
        return C12503r.C12504a.m83611a(this);
    }

    /* renamed from: S */
    public Method mo72635Q() {
        return this.f62743a;
    }

    /* renamed from: T */
    public C14123z getReturnType() {
        C14123z.C14124a aVar = C14123z.f62749a;
        Type genericReturnType = mo72635Q().getGenericReturnType();
        C13706o.m87928e(genericReturnType, "member.genericReturnType");
        return aVar.mo72656a(genericReturnType);
    }

    /* renamed from: g */
    public List<C12483b0> mo68997g() {
        Type[] genericParameterTypes = mo72635Q().getGenericParameterTypes();
        C13706o.m87928e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = mo72635Q().getParameterAnnotations();
        C13706o.m87928e(parameterAnnotations, "member.parameterAnnotations");
        return mo72642R(genericParameterTypes, parameterAnnotations, mo72635Q().isVarArgs());
    }

    public List<C14081a0> getTypeParameters() {
        TypeVariable[] typeParameters = mo72635Q().getTypeParameters();
        C13706o.m87928e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable a0Var : typeParameters) {
            arrayList.add(new C14081a0(a0Var));
        }
        return arrayList;
    }

    /* renamed from: j */
    public C12482b mo68999j() {
        Object defaultValue = mo72635Q().getDefaultValue();
        if (defaultValue != null) {
            return C14092f.f62720b.mo72613a(defaultValue, (C16157f) null);
        }
        return null;
    }
}
