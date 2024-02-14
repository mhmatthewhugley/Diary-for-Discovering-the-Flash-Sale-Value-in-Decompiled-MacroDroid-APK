package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.Objects;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Throwables {
    /* access modifiers changed from: private */
    @GwtIncompatible

    /* renamed from: a */
    public static final Object f4260a;
    /* access modifiers changed from: private */
    @GwtIncompatible

    /* renamed from: b */
    public static final Method f4261b;
    /* access modifiers changed from: private */
    @GwtIncompatible

    /* renamed from: c */
    public static final Method f4262c;

    /* renamed from: com.google.common.base.Throwables$1 */
    class C17751 extends AbstractList<StackTraceElement> {

        /* renamed from: a */
        final /* synthetic */ Throwable f4263a;

        /* renamed from: c */
        public StackTraceElement get(int i) {
            Method a = Throwables.f4261b;
            Objects.requireNonNull(a);
            Method method = a;
            Object b = Throwables.f4260a;
            Objects.requireNonNull(b);
            return (StackTraceElement) Throwables.m5487j(a, b, this.f4263a, Integer.valueOf(i));
        }

        public int size() {
            Method d = Throwables.f4262c;
            Objects.requireNonNull(d);
            Method method = d;
            Object b = Throwables.f4260a;
            Objects.requireNonNull(b);
            return ((Integer) Throwables.m5487j(d, b, this.f4263a)).intValue();
        }
    }

    static {
        Method method;
        Object f = m5483f();
        f4260a = f;
        Method method2 = null;
        if (f == null) {
            method = null;
        } else {
            method = m5482e();
        }
        f4261b = method;
        if (f != null) {
            method2 = m5485h(f);
        }
        f4262c = method2;
    }

    private Throwables() {
    }

    @GwtIncompatible
    /* renamed from: e */
    private static Method m5482e() {
        return m5484g("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @GwtIncompatible
    /* renamed from: f */
    private static Object m5483f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @GwtIncompatible
    /* renamed from: g */
    private static Method m5484g(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @GwtIncompatible
    /* renamed from: h */
    private static Method m5485h(Object obj) {
        try {
            Method g = m5484g("getStackTraceDepth", Throwable.class);
            if (g == null) {
                return null;
            }
            g.invoke(obj, new Object[]{new Throwable()});
            return g;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @GwtIncompatible
    /* renamed from: i */
    public static String m5486i(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* access modifiers changed from: private */
    @GwtIncompatible
    /* renamed from: j */
    public static Object m5487j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw m5488k(e2.getCause());
        }
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @Deprecated
    /* renamed from: k */
    public static RuntimeException m5488k(Throwable th) {
        m5493p(th);
        throw new RuntimeException(th);
    }

    @GwtIncompatible
    @Deprecated
    /* renamed from: l */
    public static <X extends Throwable> void m5489l(Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            m5492o(th, cls);
        }
    }

    @GwtIncompatible
    @Deprecated
    /* renamed from: m */
    public static void m5490m(Throwable th) {
        if (th != null) {
            m5493p(th);
        }
    }

    @GwtIncompatible
    /* renamed from: n */
    public static <X extends Throwable> void m5491n(Throwable th, Class<X> cls) throws Throwable {
        m5489l(th, cls);
        m5490m(th);
    }

    @GwtIncompatible
    /* renamed from: o */
    public static <X extends Throwable> void m5492o(Throwable th, Class<X> cls) throws Throwable {
        Preconditions.m5392s(th);
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: p */
    public static void m5493p(Throwable th) {
        Preconditions.m5392s(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
