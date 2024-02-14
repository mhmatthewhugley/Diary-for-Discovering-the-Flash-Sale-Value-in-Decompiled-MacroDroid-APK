package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;

public final class InstanceFactory<T> implements Factory<T>, Lazy<T> {

    /* renamed from: b */
    private static final InstanceFactory<Object> f1412b = new InstanceFactory<>((Object) null);

    /* renamed from: a */
    private final T f1413a;

    private InstanceFactory(T t) {
        this.f1413a = t;
    }

    /* renamed from: a */
    public static <T> Factory<T> m1332a(T t) {
        return new InstanceFactory(Preconditions.m1337c(t, "instance cannot be null"));
    }

    public T get() {
        return this.f1413a;
    }
}
