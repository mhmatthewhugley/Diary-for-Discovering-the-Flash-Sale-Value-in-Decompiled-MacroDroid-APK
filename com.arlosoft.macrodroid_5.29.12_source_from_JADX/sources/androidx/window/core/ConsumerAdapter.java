package androidx.window.core;

import android.app.Activity;
import androidx.annotation.CheckResult;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;
import p433xa.C16875d;
import p433xa.C16876e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J4\u0010\n\u001a\u00020\u0001\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0015\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJB\u0010\u0011\u001a\u00020\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007JT\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H\u0007R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, mo71668d2 = {"Landroidx/window/core/ConsumerAdapter;", "", "Ljava/lang/Class;", "unsafeConsumerClass", "T", "Lxa/d;", "clazz", "Lkotlin/Function1;", "Lja/u;", "consumer", "buildConsumer", "consumerClassOrNull$window_release", "()Ljava/lang/Class;", "consumerClassOrNull", "obj", "", "methodName", "addConsumer", "addMethodName", "removeMethodName", "Landroid/app/Activity;", "activity", "Landroidx/window/core/ConsumerAdapter$Subscription;", "createSubscription", "Ljava/lang/ClassLoader;", "loader", "Ljava/lang/ClassLoader;", "<init>", "(Ljava/lang/ClassLoader;)V", "ConsumerHandler", "Subscription", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ConsumerAdapter.kt */
public final class ConsumerAdapter {
    private final ClassLoader loader;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ%\u0010\u000b\u001a\u00020\u0007*\u00020\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ%\u0010\f\u001a\u00020\u0007*\u00020\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\tJ2\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, mo71668d2 = {"Landroidx/window/core/ConsumerAdapter$ConsumerHandler;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "Ljava/lang/reflect/Method;", "", "args", "", "isEquals", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z", "isHashCode", "isAccept", "isToString", "obj", "method", "parameters", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parameter", "Lja/u;", "invokeAccept", "(Ljava/lang/Object;)V", "Lxa/d;", "clazz", "Lkotlin/Function1;", "consumer", "<init>", "(Lxa/d;Lqa/l;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: ConsumerAdapter.kt */
    private static final class ConsumerHandler<T> implements InvocationHandler {
        private final C16875d<T> clazz;
        private final C16265l<T, C13339u> consumer;

        public ConsumerHandler(C16875d<T> dVar, C16265l<? super T, C13339u> lVar) {
            C13706o.m87929f(dVar, "clazz");
            C13706o.m87929f(lVar, "consumer");
            this.clazz = dVar;
            this.consumer = lVar;
        }

        private final boolean isAccept(Method method, Object[] objArr) {
            if (C13706o.m87924a(method.getName(), "accept")) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isEquals(Method method, Object[] objArr) {
            if (C13706o.m87924a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE)) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
            }
            return false;
        }

        private final boolean isHashCode(Method method, Object[] objArr) {
            return C13706o.m87924a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean isToString(Method method, Object[] objArr) {
            return C13706o.m87924a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C13706o.m87929f(obj, "obj");
            C13706o.m87929f(method, "method");
            Object obj2 = null;
            boolean z = false;
            if (isAccept(method, objArr)) {
                C16875d<T> dVar = this.clazz;
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                invokeAccept(C16876e.m99929a(dVar, obj2));
                return C13339u.f61331a;
            } else if (isEquals(method, objArr)) {
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                if (obj == obj2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (isHashCode(method, objArr)) {
                return Integer.valueOf(this.consumer.hashCode());
            } else {
                if (isToString(method, objArr)) {
                    return this.consumer.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            }
        }

        public final void invokeAccept(T t) {
            C13706o.m87929f(t, "parameter");
            this.consumer.invoke(t);
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, mo71668d2 = {"Landroidx/window/core/ConsumerAdapter$Subscription;", "", "Lja/u;", "dispose", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: ConsumerAdapter.kt */
    public interface Subscription {
        void dispose();
    }

    public ConsumerAdapter(ClassLoader classLoader) {
        C13706o.m87929f(classLoader, "loader");
        this.loader = classLoader;
    }

    private final <T> Object buildConsumer(C16875d<T> dVar, C16265l<? super T, C13339u> lVar) {
        ConsumerHandler consumerHandler = new ConsumerHandler(dVar, lVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{unsafeConsumerClass()}, consumerHandler);
        C13706o.m87928e(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return newProxyInstance;
    }

    private final Class<?> unsafeConsumerClass() {
        Class<?> loadClass = this.loader.loadClass("java.util.function.Consumer");
        C13706o.m87928e(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    public final <T> void addConsumer(Object obj, C16875d<T> dVar, String str, C16265l<? super T, C13339u> lVar) {
        C13706o.m87929f(obj, "obj");
        C13706o.m87929f(dVar, "clazz");
        C13706o.m87929f(str, "methodName");
        C13706o.m87929f(lVar, "consumer");
        obj.getClass().getMethod(str, new Class[]{unsafeConsumerClass()}).invoke(obj, new Object[]{buildConsumer(dVar, lVar)});
    }

    public final Class<?> consumerClassOrNull$window_release() {
        try {
            return unsafeConsumerClass();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @CheckResult
    public final <T> Subscription createSubscription(Object obj, C16875d<T> dVar, String str, String str2, Activity activity, C16265l<? super T, C13339u> lVar) {
        C13706o.m87929f(obj, "obj");
        C13706o.m87929f(dVar, "clazz");
        C13706o.m87929f(str, "addMethodName");
        C13706o.m87929f(str2, "removeMethodName");
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(lVar, "consumer");
        Object buildConsumer = buildConsumer(dVar, lVar);
        obj.getClass().getMethod(str, new Class[]{Activity.class, unsafeConsumerClass()}).invoke(obj, new Object[]{activity, buildConsumer});
        return new ConsumerAdapter$createSubscription$1(obj.getClass().getMethod(str2, new Class[]{unsafeConsumerClass()}), obj, buildConsumer);
    }
}
