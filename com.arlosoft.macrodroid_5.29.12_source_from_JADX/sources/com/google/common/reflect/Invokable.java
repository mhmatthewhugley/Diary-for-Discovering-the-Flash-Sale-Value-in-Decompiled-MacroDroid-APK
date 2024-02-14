package com.google.common.reflect;

import com.google.common.annotations.Beta;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
@Beta
public abstract class Invokable<T, R> implements AnnotatedElement, Member {

    /* renamed from: a */
    private final AccessibleObject f53278a;

    /* renamed from: c */
    private final Member f53279c;

    static class ConstructorInvokable<T> extends Invokable<T, T> {

        /* renamed from: d */
        final Constructor<?> f53280d;

        /* renamed from: c */
        private boolean m73700c() {
            Class<?> declaringClass = this.f53280d.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            Method enclosingMethod = declaringClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return !Modifier.isStatic(enclosingMethod.getModifiers());
            }
            if (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Type[] mo61454b() {
            Type[] genericParameterTypes = this.f53280d.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !m73700c()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f53280d.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }
    }

    static class MethodInvokable<T> extends Invokable<T, Object> {
    }

    /* renamed from: a */
    public TypeToken<T> mo61442a() {
        return TypeToken.m73762p(getDeclaringClass());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Invokable)) {
            return false;
        }
        Invokable invokable = (Invokable) obj;
        if (!mo61442a().equals(invokable.mo61442a()) || !this.f53279c.equals(invokable.f53279c)) {
            return false;
        }
        return true;
    }

    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return this.f53278a.getAnnotation(cls);
    }

    public final Annotation[] getAnnotations() {
        return this.f53278a.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f53278a.getDeclaredAnnotations();
    }

    public final Class<? super T> getDeclaringClass() {
        return this.f53279c.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f53279c.getModifiers();
    }

    public final String getName() {
        return this.f53279c.getName();
    }

    public int hashCode() {
        return this.f53279c.hashCode();
    }

    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f53278a.isAnnotationPresent(cls);
    }

    public final boolean isSynthetic() {
        return this.f53279c.isSynthetic();
    }

    public String toString() {
        return this.f53279c.toString();
    }
}
