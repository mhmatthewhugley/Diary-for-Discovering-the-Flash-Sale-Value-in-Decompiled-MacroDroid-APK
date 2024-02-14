package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.o */
/* compiled from: Intrinsics */
public class C13706o {
    private C13706o() {
    }

    /* renamed from: a */
    public static boolean m87924a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m87925b(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m87934k(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: c */
    public static void m87926c(Object obj) {
        if (obj == null) {
            m87937n();
        }
    }

    /* renamed from: d */
    public static void m87927d(Object obj, String str) {
        if (obj == null) {
            m87938o(str);
        }
    }

    /* renamed from: e */
    public static void m87928e(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m87934k(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: f */
    public static void m87929f(Object obj, String str) {
        if (obj == null) {
            m87941r(str);
        }
    }

    /* renamed from: g */
    public static void m87930g(Object obj, String str) {
        if (obj == null) {
            m87940q(str);
        }
    }

    /* renamed from: h */
    public static int m87931h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: i */
    private static String m87932i(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: j */
    public static void m87933j(int i, String str) {
        m87942s();
    }

    /* renamed from: k */
    private static <T extends Throwable> T m87934k(T t) {
        return m87935l(t, C13706o.class.getName());
    }

    /* renamed from: l */
    static <T extends Throwable> T m87935l(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: m */
    public static String m87936m(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: n */
    public static void m87937n() {
        throw ((NullPointerException) m87934k(new NullPointerException()));
    }

    /* renamed from: o */
    public static void m87938o(String str) {
        throw ((NullPointerException) m87934k(new NullPointerException(str)));
    }

    /* renamed from: p */
    public static void m87939p() {
        throw ((KotlinNullPointerException) m87934k(new KotlinNullPointerException()));
    }

    /* renamed from: q */
    private static void m87940q(String str) {
        throw ((IllegalArgumentException) m87934k(new IllegalArgumentException(m87932i(str))));
    }

    /* renamed from: r */
    private static void m87941r(String str) {
        throw ((NullPointerException) m87934k(new NullPointerException(m87932i(str))));
    }

    /* renamed from: s */
    public static void m87942s() {
        m87943t("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: t */
    public static void m87943t(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: u */
    public static void m87944u(String str) {
        throw ((UninitializedPropertyAccessException) m87934k(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: v */
    public static void m87945v(String str) {
        m87944u("lateinit property " + str + " has not been initialized");
    }
}
