package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import dalvik.system.DexFile;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nJ\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fJ\"\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/SystemPropertiesProxy;", "", "Landroid/content/Context;", "context", "", "key", "get", "def", "", "getInt", "", "getLong", "", "getBoolean", "value", "Lja/u;", "set", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SystemPropertiesProxy.kt */
public final class SystemPropertiesProxy {
    public static final SystemPropertiesProxy INSTANCE = new SystemPropertiesProxy();

    private SystemPropertiesProxy() {
    }

    public final String get(Context context, String str) throws IllegalArgumentException {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "key");
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            Object invoke = loadClass.getMethod("get", (Class[]) Arrays.copyOf(new Class[]{String.class}, 1)).invoke(loadClass, Arrays.copyOf(new Object[]{str}, 1));
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }

    public final boolean getBoolean(Context context, String str, boolean z) throws IllegalArgumentException {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "key");
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            Object invoke = loadClass.getMethod("getBoolean", (Class[]) Arrays.copyOf(new Class[]{String.class, Boolean.TYPE}, 2)).invoke(loadClass, Arrays.copyOf(new Object[]{str, Boolean.valueOf(z)}, 2));
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) invoke).booleanValue();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return z;
        }
    }

    public final int getInt(Context context, String str, int i) throws IllegalArgumentException {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "key");
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            Object invoke = loadClass.getMethod("getInt", (Class[]) Arrays.copyOf(new Class[]{String.class, Integer.TYPE}, 2)).invoke(loadClass, Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) invoke).intValue();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return i;
        }
    }

    public final long getLong(Context context, String str, long j) throws IllegalArgumentException {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "key");
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            Object invoke = loadClass.getMethod("getLong", (Class[]) Arrays.copyOf(new Class[]{String.class, Long.TYPE}, 2)).invoke(loadClass, Arrays.copyOf(new Object[]{str, Long.valueOf(j)}, 2));
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Long");
            return ((Long) invoke).longValue();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return j;
        }
    }

    public final void set(Context context, String str, String str2) throws IllegalArgumentException {
        Class<String> cls = String.class;
        C13706o.m87929f(context, "context");
        try {
            new DexFile(new File("/system/app/Settings.apk"));
            context.getClassLoader();
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            cls2.getMethod("set", (Class[]) Arrays.copyOf(new Class[]{cls, cls}, 2)).invoke(cls2, Arrays.copyOf(new Object[]{str, str2}, 2));
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public final String get(Context context, String str, String str2) throws IllegalArgumentException {
        Class<String> cls = String.class;
        C13706o.m87929f(context, "context");
        C13706o.m87929f(str, "key");
        C13706o.m87929f(str2, "def");
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            Object invoke = loadClass.getMethod("get", (Class[]) Arrays.copyOf(new Class[]{cls, cls}, 2)).invoke(loadClass, Arrays.copyOf(new Object[]{str, str2}, 2));
            C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return str2;
        }
    }
}
