package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a */
/* compiled from: ReflectJavaRecordComponent.kt */
final class C14079a {

    /* renamed from: a */
    public static final C14079a f62691a = new C14079a();

    /* renamed from: b */
    private static C14080a f62692b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a$a */
    /* compiled from: ReflectJavaRecordComponent.kt */
    public static final class C14080a {

        /* renamed from: a */
        private final Method f62693a;

        /* renamed from: b */
        private final Method f62694b;

        public C14080a(Method method, Method method2) {
            this.f62693a = method;
            this.f62694b = method2;
        }

        /* renamed from: a */
        public final Method mo72578a() {
            return this.f62694b;
        }

        /* renamed from: b */
        public final Method mo72579b() {
            return this.f62693a;
        }
    }

    private C14079a() {
    }

    /* renamed from: a */
    private final C14080a m89359a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C14080a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C14080a((Method) null, (Method) null);
        }
    }

    /* renamed from: b */
    private final C14080a m89360b(Object obj) {
        C14080a aVar = f62692b;
        if (aVar != null) {
            return aVar;
        }
        C14080a a = m89359a(obj);
        f62692b = a;
        return a;
    }

    /* renamed from: c */
    public final Method mo72576c(Object obj) {
        C13706o.m87929f(obj, "recordComponent");
        Method a = m89360b(obj).mo72578a();
        if (a == null) {
            return null;
        }
        Object invoke = a.invoke(obj, new Object[0]);
        C13706o.m87927d(invoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) invoke;
    }

    /* renamed from: d */
    public final Class<?> mo72577d(Object obj) {
        C13706o.m87929f(obj, "recordComponent");
        Method b = m89360b(obj).mo72579b();
        if (b == null) {
            return null;
        }
        Object invoke = b.invoke(obj, new Object[0]);
        C13706o.m87927d(invoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) invoke;
    }
}
