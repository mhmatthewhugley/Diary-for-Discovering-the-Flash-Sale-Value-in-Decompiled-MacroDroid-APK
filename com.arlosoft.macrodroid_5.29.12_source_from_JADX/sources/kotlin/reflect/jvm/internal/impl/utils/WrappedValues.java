package kotlin.reflect.jvm.internal.impl.utils;

import p272gc.C12346c;

public class WrappedValues {

    /* renamed from: a */
    private static final Object f64222a = new C15045a();

    /* renamed from: b */
    public static volatile boolean f64223b = false;

    public static class WrappedProcessCanceledException extends RuntimeException {
        public WrappedProcessCanceledException(Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$a */
    static class C15045a {
        C15045a() {
        }

        public String toString() {
            return "NULL_VALUE";
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$b */
    private static final class C15046b {

        /* renamed from: a */
        private final Throwable f64224a;

        /* synthetic */ C15046b(Throwable th, C15045a aVar) {
            this(th);
        }

        /* renamed from: a */
        private static /* synthetic */ void m93268a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        /* renamed from: b */
        public Throwable mo74298b() {
            Throwable th = this.f64224a;
            if (th == null) {
                m93268a(1);
            }
            return th;
        }

        public String toString() {
            return this.f64224a.toString();
        }

        private C15046b(Throwable th) {
            if (th == null) {
                m93268a(0);
            }
            this.f64224a = th;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m93262a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = "value";
        } else {
            objArr[0] = "throwable";
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: b */
    public static <V> Object m93263b(V v) {
        if (v == null && (v = f64222a) == null) {
            m93262a(1);
        }
        return v;
    }

    /* renamed from: c */
    public static Object m93264c(Throwable th) {
        if (th == null) {
            m93262a(3);
        }
        return new C15046b(th, (C15045a) null);
    }

    /* renamed from: d */
    public static <V> V m93265d(Object obj) {
        if (obj == null) {
            m93262a(4);
        }
        return m93266e(m93267f(obj));
    }

    /* renamed from: e */
    public static <V> V m93266e(Object obj) {
        if (obj == null) {
            m93262a(0);
        }
        if (obj == f64222a) {
            return null;
        }
        return obj;
    }

    /* renamed from: f */
    public static <V> V m93267f(Object obj) {
        if (!(obj instanceof C15046b)) {
            return obj;
        }
        Throwable b = ((C15046b) obj).mo74298b();
        if (!f64223b || !C12346c.m83094a(b)) {
            throw C12346c.m83095b(b);
        }
        throw new WrappedProcessCanceledException(b);
    }
}
