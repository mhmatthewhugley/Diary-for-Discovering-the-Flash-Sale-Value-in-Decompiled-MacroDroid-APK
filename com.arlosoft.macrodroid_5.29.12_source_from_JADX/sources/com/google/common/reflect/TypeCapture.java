package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@ElementTypesAreNonnullByDefault
abstract class TypeCapture<T> {
    TypeCapture() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Type mo61466a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Preconditions.m5385l(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
