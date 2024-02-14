package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

@ElementTypesAreNonnullByDefault
public abstract class TypeParameter<T> extends TypeCapture<T> {

    /* renamed from: a */
    final TypeVariable<?> f53288a;

    protected TypeParameter() {
        Type a = mo61466a();
        Preconditions.m5385l(a instanceof TypeVariable, "%s should be a type variable.", a);
        this.f53288a = (TypeVariable) a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeParameter) {
            return this.f53288a.equals(((TypeParameter) obj).f53288a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53288a.hashCode();
    }

    public String toString() {
        return this.f53288a.toString();
    }
}
