package p320ld;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: ld.a */
/* compiled from: BoundaryInterfaceReflectionUtil */
public class C15627a {

    @RequiresApi(19)
    /* renamed from: ld.a$a */
    /* compiled from: BoundaryInterfaceReflectionUtil */
    private static class C15628a implements InvocationHandler {

        /* renamed from: a */
        private final Object f64899a;

        public C15628a(@NonNull Object obj) {
            this.f64899a = obj;
        }

        @NonNull
        /* renamed from: a */
        public Object mo74995a() {
            return this.f64899a;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return C15627a.m94881d(method, this.f64899a.getClass().getClassLoader()).invoke(this.f64899a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static <T> T m94878a(@NonNull Class<T> cls, @Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C15627a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m94879b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m94883f()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @RequiresApi(19)
    @Nullable
    /* renamed from: c */
    public static InvocationHandler m94880c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return new C15628a(obj);
    }

    /* renamed from: d */
    public static Method m94881d(Method method, ClassLoader classLoader) throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @Nullable
    /* renamed from: e */
    public static Object m94882e(@Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C15628a) invocationHandler).mo74995a();
    }

    /* renamed from: f */
    private static boolean m94883f() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
