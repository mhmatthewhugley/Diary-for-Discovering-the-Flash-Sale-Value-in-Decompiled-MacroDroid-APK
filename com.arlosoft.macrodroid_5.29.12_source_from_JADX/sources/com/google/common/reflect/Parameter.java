package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

@ElementTypesAreNonnullByDefault
@Beta
public final class Parameter implements AnnotatedElement {

    /* renamed from: a */
    private final Invokable<?, ?> f53284a;

    /* renamed from: c */
    private final int f53285c;

    /* renamed from: d */
    private final TypeToken<?> f53286d;

    /* renamed from: f */
    private final ImmutableList<Annotation> f53287f;

    public boolean equals(Object obj) {
        if (!(obj instanceof Parameter)) {
            return false;
        }
        Parameter parameter = (Parameter) obj;
        if (this.f53285c != parameter.f53285c || !this.f53284a.equals(parameter.f53284a)) {
            return false;
        }
        return true;
    }

    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        Preconditions.m5392s(cls);
        UnmodifiableIterator<Annotation> k = this.f53287f.iterator();
        while (k.hasNext()) {
            Annotation next = k.next();
            if (cls.isInstance(next)) {
                return (Annotation) cls.cast(next);
            }
        }
        return null;
    }

    public Annotation[] getAnnotations() {
        return getDeclaredAnnotations();
    }

    public <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return getDeclaredAnnotationsByType(cls);
    }

    public <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        Preconditions.m5392s(cls);
        return (Annotation) FluentIterable.m27039j(this.f53287f).mo35101h(cls).mo35102i().mo22083f();
    }

    public Annotation[] getDeclaredAnnotations() {
        return (Annotation[]) this.f53287f.toArray(new Annotation[0]);
    }

    public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        return (Annotation[]) FluentIterable.m27039j(this.f53287f).mo35101h(cls).mo35103l(cls);
    }

    public int hashCode() {
        return this.f53285c;
    }

    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return getAnnotation(cls) != null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f53286d);
        int i = this.f53285c;
        StringBuilder sb = new StringBuilder(valueOf.length() + 15);
        sb.append(valueOf);
        sb.append(" arg");
        sb.append(i);
        return sb.toString();
    }
}
