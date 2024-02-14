package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

@ElementTypesAreNonnullByDefault
public abstract class AbstractInvocationHandler implements InvocationHandler {

    /* renamed from: a */
    private static final Object[] f53268a = new Object[0];

    /* renamed from: b */
    private static boolean m73694b(Object obj, Class<?> cls) {
        return cls.isInstance(obj) || (Proxy.isProxyClass(obj.getClass()) && Arrays.equals(obj.getClass().getInterfaces(), cls.getInterfaces()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo61430a(Object obj, Method method, Object[] objArr) throws Throwable;

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (objArr == null) {
            objArr = f53268a;
        }
        if (objArr.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        boolean z = true;
        if (objArr.length == 1 && method.getName().equals("equals") && method.getParameterTypes()[0] == Object.class) {
            Object obj2 = objArr[0];
            if (obj2 == null) {
                return Boolean.FALSE;
            }
            if (obj == obj2) {
                return Boolean.TRUE;
            }
            if (!m73694b(obj2, obj.getClass()) || !equals(Proxy.getInvocationHandler(obj2))) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (objArr.length != 0 || !method.getName().equals("toString")) {
            return mo61430a(obj, method, objArr);
        } else {
            return toString();
        }
    }

    public String toString() {
        return super.toString();
    }
}
