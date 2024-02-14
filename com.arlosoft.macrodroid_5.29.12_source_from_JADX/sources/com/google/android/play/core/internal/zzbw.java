package com.google.android.play.core.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzbw {
    /* renamed from: a */
    public static zzbu m70884a(Object obj, String str, Class cls) {
        return new zzbu(obj, m70891h(obj, str), cls);
    }

    /* renamed from: b */
    public static zzbv m70885b(Object obj, String str, Class cls) {
        return new zzbv(obj, m70891h(obj, str), cls);
    }

    /* renamed from: c */
    public static Object m70886c(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke default constructor on class %s", new Object[]{cls.getName()}), e);
        }
    }

    /* renamed from: d */
    public static Object m70887d(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(m70892i(obj.getClass(), str, cls2).invoke(obj, new Object[]{obj2}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: e */
    public static Object m70888e(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(m70892i(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, new Object[]{obj2, obj3, obj4}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: f */
    public static Object m70889f(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(m70892i(cls, "isDexOptNeeded", cls3).invoke((Object) null, new Object[]{obj}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    /* renamed from: g */
    public static Object m70890g(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) {
        try {
            return cls2.cast(m70892i(cls, "optimizedPathFor", cls3, cls4).invoke((Object) null, new Object[]{obj, obj2}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
        }
    }

    /* renamed from: h */
    private static Field m70891h(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new zzbx(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: i */
    private static Method m70892i(Class cls, String str, Class... clsArr) {
        Class cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new zzbx(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }
}
