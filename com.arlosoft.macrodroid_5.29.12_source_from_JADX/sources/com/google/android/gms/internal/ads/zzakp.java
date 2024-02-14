package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzakp {

    /* renamed from: a */
    public static final String f24908a = "Volley";

    /* renamed from: b */
    public static final boolean f24909b = Log.isLoggable(f24908a, 2);

    /* renamed from: c */
    private static final String f24910c = zzakp.class.getName();

    /* renamed from: a */
    public static void m41660a(String str, Object... objArr) {
        m41664e(str, objArr);
    }

    /* renamed from: b */
    public static void m41661b(String str, Object... objArr) {
        Log.e(f24908a, m41664e(str, objArr));
    }

    /* renamed from: c */
    public static void m41662c(Throwable th, String str, Object... objArr) {
        Log.e(f24908a, m41664e(str, objArr), th);
    }

    /* renamed from: d */
    public static void m41663d(String str, Object... objArr) {
        if (f24909b) {
            m41664e(str, objArr);
        }
    }

    /* renamed from: e */
    private static String m41664e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f24910c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, format});
    }
}
