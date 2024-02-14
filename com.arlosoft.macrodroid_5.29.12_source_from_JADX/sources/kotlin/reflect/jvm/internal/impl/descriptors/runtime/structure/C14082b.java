package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b */
/* compiled from: ReflectJavaClass.kt */
final class C14082b {

    /* renamed from: a */
    public static final C14082b f62696a = new C14082b();

    /* renamed from: b */
    private static C14083a f62697b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b$a */
    /* compiled from: ReflectJavaClass.kt */
    public static final class C14083a {

        /* renamed from: a */
        private final Method f62698a;

        /* renamed from: b */
        private final Method f62699b;

        /* renamed from: c */
        private final Method f62700c;

        /* renamed from: d */
        private final Method f62701d;

        public C14083a(Method method, Method method2, Method method3, Method method4) {
            this.f62698a = method;
            this.f62699b = method2;
            this.f62700c = method3;
            this.f62701d = method4;
        }

        /* renamed from: a */
        public final Method mo72591a() {
            return this.f62699b;
        }

        /* renamed from: b */
        public final Method mo72592b() {
            return this.f62701d;
        }

        /* renamed from: c */
        public final Method mo72593c() {
            return this.f62700c;
        }

        /* renamed from: d */
        public final Method mo72594d() {
            return this.f62698a;
        }
    }

    private C14082b() {
    }

    /* renamed from: a */
    private final C14083a m89371a() {
        Class<Class> cls = Class.class;
        try {
            return new C14083a(cls.getMethod("isSealed", new Class[0]), cls.getMethod("getPermittedSubclasses", new Class[0]), cls.getMethod("isRecord", new Class[0]), cls.getMethod("getRecordComponents", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new C14083a((Method) null, (Method) null, (Method) null, (Method) null);
        }
    }

    /* renamed from: b */
    private final C14083a m89372b() {
        C14083a aVar = f62697b;
        if (aVar != null) {
            return aVar;
        }
        C14083a a = m89371a();
        f62697b = a;
        return a;
    }

    /* renamed from: c */
    public final Class<?>[] mo72587c(Class<?> cls) {
        C13706o.m87929f(cls, "clazz");
        Method a = m89372b().mo72591a();
        if (a == null) {
            return null;
        }
        Object invoke = a.invoke(cls, new Object[0]);
        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) invoke;
    }

    /* renamed from: d */
    public final Object[] mo72588d(Class<?> cls) {
        C13706o.m87929f(cls, "clazz");
        Method b = m89372b().mo72592b();
        if (b == null) {
            return null;
        }
        return (Object[]) b.invoke(cls, new Object[0]);
    }

    /* renamed from: e */
    public final Boolean mo72589e(Class<?> cls) {
        C13706o.m87929f(cls, "clazz");
        Method c = m89372b().mo72593c();
        if (c == null) {
            return null;
        }
        Object invoke = c.invoke(cls, new Object[0]);
        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }

    /* renamed from: f */
    public final Boolean mo72590f(Class<?> cls) {
        C13706o.m87929f(cls, "clazz");
        Method d = m89372b().mo72594d();
        if (d == null) {
            return null;
        }
        Object invoke = d.invoke(cls, new Object[0]);
        C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) invoke;
    }
}
