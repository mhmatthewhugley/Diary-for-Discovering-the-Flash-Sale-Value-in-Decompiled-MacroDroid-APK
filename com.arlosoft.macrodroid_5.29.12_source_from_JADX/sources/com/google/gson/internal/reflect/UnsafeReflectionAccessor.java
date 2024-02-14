package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

final class UnsafeReflectionAccessor extends ReflectionAccessor {

    /* renamed from: d */
    private static Class f56048d;

    /* renamed from: b */
    private final Object f56049b = m78727d();

    /* renamed from: c */
    private final Field f56050c = m78726c();

    UnsafeReflectionAccessor() {
    }

    /* renamed from: c */
    private static Field m78726c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m78727d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f56048d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo64304b(AccessibleObject accessibleObject) {
        if (!mo64305e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo64305e(AccessibleObject accessibleObject) {
        if (!(this.f56049b == null || this.f56050c == null)) {
            try {
                long longValue = ((Long) f56048d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f56049b, new Object[]{this.f56050c})).longValue();
                f56048d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f56049b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
