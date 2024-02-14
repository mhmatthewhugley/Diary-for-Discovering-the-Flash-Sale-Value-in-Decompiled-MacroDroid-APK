package p473rx.internal.util.unsafe;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: rx.internal.util.unsafe.z */
/* compiled from: UnsafeAccess */
public final class C17417z {

    /* renamed from: a */
    public static final Unsafe f69168a;

    /* renamed from: b */
    private static final boolean f69169b = (System.getProperty("rx.unsafe-disable") != null);

    static {
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get((Object) null);
        } catch (Throwable unused) {
        }
        f69168a = unsafe;
    }

    /* renamed from: a */
    public static long m101180a(Class<?> cls, String str) {
        try {
            return f69168a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }

    /* renamed from: b */
    public static boolean m101181b() {
        return f69168a != null && !f69169b;
    }
}
