package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@ElementTypesAreNonnullByDefault
public final class Reflection {
    private Reflection() {
    }

    /* renamed from: a */
    public static <T> T m73714a(Class<T> cls, InvocationHandler invocationHandler) {
        Preconditions.m5392s(invocationHandler);
        Preconditions.m5385l(cls.isInterface(), "%s is not an interface", cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
