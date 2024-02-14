package p292io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: io.grpc.okhttp.internal.e */
/* compiled from: OptionalMethod */
public class C12937e<T> {

    /* renamed from: a */
    private final Class<?> f60604a;

    /* renamed from: b */
    private final String f60605b;

    /* renamed from: c */
    private final Class[] f60606c;

    public C12937e(Class<?> cls, String str, Class... clsArr) {
        this.f60604a = cls;
        this.f60605b = str;
        this.f60606c = clsArr;
    }

    /* renamed from: a */
    private Method m84988a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f60605b;
        if (str == null) {
            return null;
        }
        Method b = m84989b(cls, str, this.f60606c);
        if (b == null || (cls2 = this.f60604a) == null || cls2.isAssignableFrom(b.getReturnType())) {
            return b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m84989b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m84989b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object mo69727c(T t, Object... objArr) throws InvocationTargetException {
        Method a = m84988a(t.getClass());
        if (a != null) {
            try {
                return a.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a);
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f60605b + " not supported for object " + t);
        }
    }

    /* renamed from: d */
    public Object mo69728d(T t, Object... objArr) throws InvocationTargetException {
        Method a = m84988a(t.getClass());
        if (a == null) {
            return null;
        }
        try {
            return a.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object mo69729e(T t, Object... objArr) {
        try {
            return mo69728d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object mo69730f(T t, Object... objArr) {
        try {
            return mo69727c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean mo69731g(T t) {
        return m84988a(t.getClass()) != null;
    }
}
