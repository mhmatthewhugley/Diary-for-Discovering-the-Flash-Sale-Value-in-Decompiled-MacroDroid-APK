package p410ue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.zeroturnaround.zip.ZipException;

/* renamed from: ue.h */
/* compiled from: ZTZipReflectionUtil */
class C16708h {
    /* renamed from: a */
    static <T> Class<? extends T> m99227a(String str, Class<T> cls) {
        try {
            return Class.forName(str).asSubclass(cls);
        } catch (ClassNotFoundException e) {
            throw new ZipException((Exception) e);
        } catch (ClassCastException e2) {
            throw new ZipException((Exception) e2);
        }
    }

    /* renamed from: b */
    static Method m99228b(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new ZipException((Exception) e);
        }
    }

    /* renamed from: c */
    static Object m99229c(Method method, Object obj, Object... objArr) throws ZipException {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new ZipException((Exception) e);
        } catch (InvocationTargetException e2) {
            throw new ZipException((Exception) e2);
        } catch (IllegalArgumentException e3) {
            throw new ZipException((Exception) e3);
        }
    }
}
