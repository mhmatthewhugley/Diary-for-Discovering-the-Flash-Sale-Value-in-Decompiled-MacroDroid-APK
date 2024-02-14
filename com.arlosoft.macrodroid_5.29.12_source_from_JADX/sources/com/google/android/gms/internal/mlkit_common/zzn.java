package com.google.android.gms.internal.mlkit_common;

import java.io.FileDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzn {

    /* renamed from: a */
    private static final Method f43062a;

    /* renamed from: b */
    private static final Method f43063b;

    /* renamed from: c */
    private static final Method f43064c;

    /* renamed from: d */
    private static final Field f43065d;

    /* renamed from: e */
    private static final Field f43066e;

    /* renamed from: f */
    private static final Field f43067f;

    /* renamed from: g */
    private static final Object f43068g;

    /* renamed from: h */
    private static final Throwable f43069h;

    static {
        Field field;
        Field field2;
        Method method;
        Method method2;
        Method method3;
        Field field3;
        Object obj;
        Throwable th;
        try {
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.StructStat");
            Class<?> cls3 = Class.forName("libcore.io.OsConstants");
            Class<?> cls4 = Class.forName("libcore.io.ForwardingOs");
            method3 = cls3.getDeclaredMethod("S_ISLNK", new Class[]{Integer.TYPE});
            try {
                method3.setAccessible(true);
                method = cls4.getDeclaredMethod("lstat", new Class[]{String.class});
            } catch (Throwable th2) {
                th = th2;
                field3 = null;
                method2 = null;
                method = method2;
                field2 = method;
                field = field2;
                th = th;
                obj = field;
                f43062a = method3;
                f43063b = method;
                f43064c = method2;
                f43065d = field2;
                f43066e = field;
                f43067f = field3;
                f43068g = obj;
                f43069h = th;
            }
            try {
                method2 = cls4.getDeclaredMethod("fstat", new Class[]{FileDescriptor.class});
            } catch (Throwable th3) {
                th = th3;
                field3 = null;
                method2 = null;
                field2 = null;
                field = field2;
                th = th;
                obj = field;
                f43062a = method3;
                f43063b = method;
                f43064c = method2;
                f43065d = field2;
                f43066e = field;
                f43067f = field3;
                f43068g = obj;
                f43069h = th;
            }
            try {
                Field declaredField = cls.getDeclaredField("os");
                declaredField.setAccessible(true);
                obj = declaredField.get(cls);
            } catch (Throwable th4) {
                th = th4;
                field3 = null;
                field2 = null;
                field = field2;
                th = th;
                obj = field;
                f43062a = method3;
                f43063b = method;
                f43064c = method2;
                f43065d = field2;
                f43066e = field;
                f43067f = field3;
                f43068g = obj;
                f43069h = th;
            }
            try {
                field2 = cls2.getField("st_dev");
                try {
                    field = cls2.getField("st_ino");
                    try {
                        field3 = cls2.getField("st_mode");
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        field3 = null;
                        th = th6;
                        f43062a = method3;
                        f43063b = method;
                        f43064c = method2;
                        f43065d = field2;
                        f43066e = field;
                        f43067f = field3;
                        f43068g = obj;
                        f43069h = th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    field = null;
                    th = th;
                    field3 = field;
                    f43062a = method3;
                    f43063b = method;
                    f43064c = method2;
                    f43065d = field2;
                    f43066e = field;
                    f43067f = field3;
                    f43068g = obj;
                    f43069h = th;
                }
                try {
                    field2.setAccessible(true);
                    field.setAccessible(true);
                    field3.setAccessible(true);
                    f43062a = method3;
                    f43063b = method;
                    f43064c = method2;
                    f43065d = field2;
                    f43066e = field;
                    f43067f = field3;
                    f43068g = obj;
                    f43069h = null;
                } catch (Throwable th8) {
                    th = th8;
                    f43062a = method3;
                    f43063b = method;
                    f43064c = method2;
                    f43065d = field2;
                    f43066e = field;
                    f43067f = field3;
                    f43068g = obj;
                    f43069h = th;
                }
            } catch (Throwable th9) {
                th = th9;
                field2 = null;
                field = null;
                th = th;
                field3 = field;
                f43062a = method3;
                f43063b = method;
                f43064c = method2;
                f43065d = field2;
                f43066e = field;
                f43067f = field3;
                f43068g = obj;
                f43069h = th;
            }
        } catch (Throwable th10) {
            th = th10;
            field3 = null;
            method3 = null;
            method2 = null;
            method = method2;
            field2 = method;
            field = field2;
            th = th;
            obj = field;
            f43062a = method3;
            f43063b = method;
            f43064c = method2;
            f43065d = field2;
            f43066e = field;
            f43067f = field3;
            f43068g = obj;
            f43069h = th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static zzp m61539c(Object obj) throws Exception {
        long longValue = ((Long) f43065d.get(obj)).longValue();
        long longValue2 = ((Long) f43066e.get(obj)).longValue();
        int intValue = ((Integer) f43067f.get(obj)).intValue();
        return new zzp(longValue, longValue2, ((Boolean) f43062a.invoke((Object) null, new Object[]{Integer.valueOf(intValue)})).booleanValue());
    }
}
