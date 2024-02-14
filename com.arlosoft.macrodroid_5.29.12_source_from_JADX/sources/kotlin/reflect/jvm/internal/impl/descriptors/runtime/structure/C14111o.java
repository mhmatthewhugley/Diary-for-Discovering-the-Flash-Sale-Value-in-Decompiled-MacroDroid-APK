package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p288ib.C12483b0;
import p288ib.C12496k;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.o */
/* compiled from: ReflectJavaConstructor.kt */
public final class C14111o extends C14116t implements C12496k {

    /* renamed from: a */
    private final Constructor<?> f62739a;

    public C14111o(Constructor<?> constructor) {
        C13706o.m87929f(constructor, "member");
        this.f62739a = constructor;
    }

    /* renamed from: S */
    public Constructor<?> mo72635Q() {
        return this.f62739a;
    }

    /* renamed from: g */
    public List<C12483b0> mo68988g() {
        Type[] genericParameterTypes = mo72635Q().getGenericParameterTypes();
        C13706o.m87928e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return C13614t.m87748j();
        }
        Class<?> declaringClass = mo72635Q().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) C13593l.m87563j(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = mo72635Q().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                C13706o.m87928e(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) C13593l.m87563j(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            C13706o.m87928e(genericParameterTypes, "realTypes");
            C13706o.m87928e(parameterAnnotations, "realAnnotations");
            return mo72642R(genericParameterTypes, parameterAnnotations, mo72635Q().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + mo72635Q());
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
}
