package com.google.gson.reflect;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class TypeToken<T> {

    /* renamed from: a */
    final Class<? super T> f56051a;

    /* renamed from: b */
    final Type f56052b;

    /* renamed from: c */
    final int f56053c;

    protected TypeToken() {
        Type d = m78732d(getClass());
        this.f56052b = d;
        this.f56051a = C$Gson$Types.m78411k(d);
        this.f56053c = d.hashCode();
    }

    /* renamed from: a */
    public static <T> TypeToken<T> m78730a(Class<T> cls) {
        return new TypeToken<>(cls);
    }

    /* renamed from: b */
    public static TypeToken<?> m78731b(Type type) {
        return new TypeToken<>(type);
    }

    /* renamed from: d */
    static Type m78732d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C$Gson$Types.m78402b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public final Class<? super T> mo64306c() {
        return this.f56051a;
    }

    /* renamed from: e */
    public final Type mo64307e() {
        return this.f56052b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof TypeToken) && C$Gson$Types.m78406f(this.f56052b, ((TypeToken) obj).f56052b);
    }

    public final int hashCode() {
        return this.f56053c;
    }

    public final String toString() {
        return C$Gson$Types.m78421u(this.f56052b);
    }

    TypeToken(Type type) {
        Type b = C$Gson$Types.m78402b((Type) C$Gson$Preconditions.m78400b(type));
        this.f56052b = b;
        this.f56051a = C$Gson$Types.m78411k(b);
        this.f56053c = b.hashCode();
    }
}
