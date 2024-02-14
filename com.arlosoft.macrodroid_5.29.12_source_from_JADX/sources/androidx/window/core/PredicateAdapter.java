package androidx.window.core;

import android.util.Pair;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p370qa.C16269p;
import p433xa.C16875d;
import p433xa.C16876e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\u0015\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\u0001\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\nJP\u0010\u0012\u001a\u00020\u0001\"\b\b\u0000\u0010\u0007*\u00020\u0001\"\b\b\u0001\u0010\u000e*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000b0\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, mo71668d2 = {"Landroidx/window/core/PredicateAdapter;", "", "Ljava/lang/Class;", "predicateClassOrThrow", "predicateClassOrNull$window_release", "()Ljava/lang/Class;", "predicateClassOrNull", "T", "Lxa/d;", "clazz", "Lkotlin/Function1;", "", "predicate", "buildPredicate", "U", "firstClazz", "secondClazz", "Lkotlin/Function2;", "buildPairPredicate", "Ljava/lang/ClassLoader;", "loader", "Ljava/lang/ClassLoader;", "<init>", "(Ljava/lang/ClassLoader;)V", "BaseHandler", "PairPredicateStubHandler", "PredicateStubHandler", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: PredicateAdapter.kt */
public final class PredicateAdapter {
    private final ClassLoader loader;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\f*\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0007H\u0004¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00020\f*\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0007H\u0004¢\u0006\u0004\b\u0012\u0010\u0011J%\u0010\u0013\u001a\u00020\f*\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0007H\u0004¢\u0006\u0004\b\u0013\u0010\u0011J%\u0010\u0014\u001a\u00020\f*\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0007H\u0004¢\u0006\u0004\b\u0014\u0010\u0011¨\u0006\u0019"}, mo71668d2 = {"Landroidx/window/core/PredicateAdapter$BaseHandler;", "", "T", "Ljava/lang/reflect/InvocationHandler;", "obj", "Ljava/lang/reflect/Method;", "method", "", "parameters", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "parameter", "", "invokeTest", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "args", "isEquals", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Z", "isHashCode", "isTest", "isToString", "Lxa/d;", "clazz", "<init>", "(Lxa/d;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: PredicateAdapter.kt */
    private static abstract class BaseHandler<T> implements InvocationHandler {
        private final C16875d<T> clazz;

        public BaseHandler(C16875d<T> dVar) {
            C13706o.m87929f(dVar, "clazz");
            this.clazz = dVar;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            C13706o.m87929f(obj, "obj");
            C13706o.m87929f(method, "method");
            Object obj2 = null;
            boolean z = false;
            if (isTest(method, objArr)) {
                C16875d<T> dVar = this.clazz;
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                return Boolean.valueOf(invokeTest(obj, C16876e.m99929a(dVar, obj2)));
            } else if (isEquals(method, objArr)) {
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                C13706o.m87926c(obj2);
                if (obj == obj2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else if (isHashCode(method, objArr)) {
                return Integer.valueOf(hashCode());
            } else {
                if (isToString(method, objArr)) {
                    return toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            }
        }

        public abstract boolean invokeTest(Object obj, T t);

        /* access modifiers changed from: protected */
        public final boolean isEquals(Method method, Object[] objArr) {
            C13706o.m87929f(method, "<this>");
            if (C13706o.m87924a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE)) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final boolean isHashCode(Method method, Object[] objArr) {
            C13706o.m87929f(method, "<this>");
            return C13706o.m87924a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        /* access modifiers changed from: protected */
        public final boolean isTest(Method method, Object[] objArr) {
            C13706o.m87929f(method, "<this>");
            if (C13706o.m87924a(method.getName(), "test") && method.getReturnType().equals(Boolean.TYPE)) {
                if (objArr != null && objArr.length == 1) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public final boolean isToString(Method method, Object[] objArr) {
            C13706o.m87929f(method, "<this>");
            return C13706o.m87924a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0004B=\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00012\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0015"}, mo71668d2 = {"Landroidx/window/core/PredicateAdapter$PairPredicateStubHandler;", "", "T", "U", "Landroidx/window/core/PredicateAdapter$BaseHandler;", "Landroid/util/Pair;", "obj", "parameter", "", "invokeTest", "", "hashCode", "", "toString", "Lxa/d;", "clazzT", "clazzU", "Lkotlin/Function2;", "predicate", "<init>", "(Lxa/d;Lxa/d;Lqa/p;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: PredicateAdapter.kt */
    private static final class PairPredicateStubHandler<T, U> extends BaseHandler<Pair<?, ?>> {
        private final C16875d<T> clazzT;
        private final C16875d<U> clazzU;
        private final C16269p<T, U, Boolean> predicate;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PairPredicateStubHandler(C16875d<T> dVar, C16875d<U> dVar2, C16269p<? super T, ? super U, Boolean> pVar) {
            super(C13687e0.m87868b(Pair.class));
            C13706o.m87929f(dVar, "clazzT");
            C13706o.m87929f(dVar2, "clazzU");
            C13706o.m87929f(pVar, "predicate");
            this.clazzT = dVar;
            this.clazzU = dVar2;
            this.predicate = pVar;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public String toString() {
            return this.predicate.toString();
        }

        public boolean invokeTest(Object obj, Pair<?, ?> pair) {
            C13706o.m87929f(obj, "obj");
            C13706o.m87929f(pair, "parameter");
            return this.predicate.invoke(C16876e.m99929a(this.clazzT, pair.first), C16876e.m99929a(this.clazzU, pair.second)).booleanValue();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0013"}, mo71668d2 = {"Landroidx/window/core/PredicateAdapter$PredicateStubHandler;", "", "T", "Landroidx/window/core/PredicateAdapter$BaseHandler;", "obj", "parameter", "", "invokeTest", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "Lxa/d;", "clazzT", "Lkotlin/Function1;", "predicate", "<init>", "(Lxa/d;Lqa/l;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: PredicateAdapter.kt */
    private static final class PredicateStubHandler<T> extends BaseHandler<T> {
        private final C16265l<T, Boolean> predicate;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PredicateStubHandler(C16875d<T> dVar, C16265l<? super T, Boolean> lVar) {
            super(dVar);
            C13706o.m87929f(dVar, "clazzT");
            C13706o.m87929f(lVar, "predicate");
            this.predicate = lVar;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public boolean invokeTest(Object obj, T t) {
            C13706o.m87929f(obj, "obj");
            C13706o.m87929f(t, "parameter");
            return this.predicate.invoke(t).booleanValue();
        }

        public String toString() {
            return this.predicate.toString();
        }
    }

    public PredicateAdapter(ClassLoader classLoader) {
        C13706o.m87929f(classLoader, "loader");
        this.loader = classLoader;
    }

    private final Class<?> predicateClassOrThrow() {
        Class<?> loadClass = this.loader.loadClass("java.util.function.Predicate");
        C13706o.m87928e(loadClass, "loader.loadClass(\"java.util.function.Predicate\")");
        return loadClass;
    }

    public final <T, U> Object buildPairPredicate(C16875d<T> dVar, C16875d<U> dVar2, C16269p<? super T, ? super U, Boolean> pVar) {
        C13706o.m87929f(dVar, "firstClazz");
        C13706o.m87929f(dVar2, "secondClazz");
        C13706o.m87929f(pVar, "predicate");
        PairPredicateStubHandler pairPredicateStubHandler = new PairPredicateStubHandler(dVar, dVar2, pVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, pairPredicateStubHandler);
        C13706o.m87928e(newProxyInstance, "newProxyInstance(loader,…row()), predicateHandler)");
        return newProxyInstance;
    }

    public final <T> Object buildPredicate(C16875d<T> dVar, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(dVar, "clazz");
        C13706o.m87929f(lVar, "predicate");
        PredicateStubHandler predicateStubHandler = new PredicateStubHandler(dVar, lVar);
        Object newProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{predicateClassOrThrow()}, predicateStubHandler);
        C13706o.m87928e(newProxyInstance, "newProxyInstance(loader,…row()), predicateHandler)");
        return newProxyInstance;
    }

    public final Class<?> predicateClassOrNull$window_release() {
        try {
            return predicateClassOrThrow();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
