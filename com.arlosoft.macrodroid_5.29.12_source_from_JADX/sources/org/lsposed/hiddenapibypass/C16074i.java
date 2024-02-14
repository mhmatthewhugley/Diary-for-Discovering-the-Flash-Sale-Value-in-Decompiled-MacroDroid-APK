package org.lsposed.hiddenapibypass;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import sun.misc.Unsafe;

@RequiresApi(28)
/* renamed from: org.lsposed.hiddenapibypass.i */
public final class C16074i {

    /* renamed from: a */
    private static final Unsafe f66024a;

    /* renamed from: b */
    private static final long f66025b;

    /* renamed from: c */
    private static final long f66026c;

    /* renamed from: d */
    private static final long f66027d;

    /* renamed from: e */
    private static final long f66028e;

    /* renamed from: f */
    private static final long f66029f;

    /* renamed from: g */
    private static final long f66030g;

    /* renamed from: h */
    private static final long f66031h;

    /* renamed from: i */
    private static final long f66032i;

    /* renamed from: j */
    private static final long f66033j;

    /* renamed from: k */
    private static final long f66034k;

    /* renamed from: l */
    private static final long f66035l;

    /* renamed from: m */
    private static final long f66036m;

    /* renamed from: n */
    private static final Set f66037n = new HashSet();

    static {
        Class<C16068c> cls = C16068c.class;
        Class<C16067b> cls2 = C16067b.class;
        Class<C16073h> cls3 = C16073h.class;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke((Object) null, new Object[0]);
            f66024a = unsafe;
            f66025b = unsafe.objectFieldOffset(cls.getDeclaredField("artMethod"));
            f66026c = unsafe.objectFieldOffset(cls.getDeclaredField("declaringClass"));
            long objectFieldOffset = unsafe.objectFieldOffset(C16071f.class.getDeclaredField("artFieldOrMethod"));
            f66027d = objectFieldOffset;
            f66028e = unsafe.objectFieldOffset(C16072g.class.getDeclaredField("info"));
            long objectFieldOffset2 = unsafe.objectFieldOffset(cls2.getDeclaredField("methods"));
            f66029f = objectFieldOffset2;
            long objectFieldOffset3 = unsafe.objectFieldOffset(cls2.getDeclaredField("iFields"));
            f66030g = objectFieldOffset3;
            f66031h = unsafe.objectFieldOffset(cls2.getDeclaredField("sFields"));
            f66032i = unsafe.objectFieldOffset(C16069d.class.getDeclaredField("member"));
            Method declaredMethod = cls3.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = cls3.getDeclaredMethod("b", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = unsafe.getLong(unreflect, objectFieldOffset);
            long j2 = unsafe.getLong(unreflect2, objectFieldOffset);
            long j3 = unsafe.getLong(cls3, objectFieldOffset2);
            long j4 = j2 - j;
            f66033j = j4;
            f66034k = (j - j3) - j4;
            Field declaredField = cls3.getDeclaredField("i");
            Field declaredField2 = cls3.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle unreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j5 = unsafe.getLong(unreflectGetter, objectFieldOffset);
            long j6 = unsafe.getLong(unreflectGetter2, objectFieldOffset);
            long j7 = unsafe.getLong(cls3, objectFieldOffset3);
            f66035l = j6 - j5;
            f66036m = j5 - j7;
        } catch (ReflectiveOperationException e) {
            Log.e("HiddenApiBypass", "Initialize error", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    static boolean m96676a(Class[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i].isPrimitive()) {
                if (clsArr[i] == Integer.TYPE && !(objArr[i] instanceof Integer)) {
                    return false;
                }
                if (clsArr[i] == Byte.TYPE && !(objArr[i] instanceof Byte)) {
                    return false;
                }
                if (clsArr[i] == Character.TYPE && !(objArr[i] instanceof Character)) {
                    return false;
                }
                if (clsArr[i] == Boolean.TYPE && !(objArr[i] instanceof Boolean)) {
                    return false;
                }
                if (clsArr[i] == Double.TYPE && !(objArr[i] instanceof Double)) {
                    return false;
                }
                if (clsArr[i] == Float.TYPE && !(objArr[i] instanceof Float)) {
                    return false;
                }
                if (clsArr[i] == Long.TYPE && !(objArr[i] instanceof Long)) {
                    return false;
                }
                if (clsArr[i] == Short.TYPE && !(objArr[i] instanceof Short)) {
                    return false;
                }
            } else if (objArr[i] != null && !clsArr[i].isInstance(objArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static Object m96677b(@NonNull Class cls, @Nullable Object obj, @NonNull String str, Object... objArr) {
        Object obj2 = obj;
        Object[] objArr2 = objArr;
        if (obj2 == null || cls.isInstance(obj)) {
            Method declaredMethod = C16070e.class.getDeclaredMethod("invoke", new Class[]{Object[].class});
            declaredMethod.setAccessible(true);
            Unsafe unsafe = f66024a;
            Class cls2 = cls;
            long j = unsafe.getLong(cls, f66029f);
            if (j != 0) {
                int i = unsafe.getInt(j);
                for (int i2 = 0; i2 < i; i2++) {
                    Method method = declaredMethod;
                    f66024a.putLong(method, f66025b, (((long) i2) * f66033j) + j + f66034k);
                    if (str.equals(declaredMethod.getName()) && m96676a(declaredMethod.getParameterTypes(), objArr2)) {
                        return declaredMethod.invoke(obj2, objArr2);
                    }
                }
                throw new NoSuchMethodException("Cannot find matching method");
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }
        throw new IllegalArgumentException("this object is not an instance of the given class");
    }

    /* renamed from: c */
    public static boolean m96678c(@NonNull String... strArr) {
        try {
            m96677b(VMRuntime.class, m96677b(VMRuntime.class, (Object) null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable th) {
            Log.w("HiddenApiBypass", "setHiddenApiExemptions", th);
            return false;
        }
    }
}
