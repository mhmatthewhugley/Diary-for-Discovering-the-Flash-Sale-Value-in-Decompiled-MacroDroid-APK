package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

public final class Logging {
    private Logging() {
    }

    /* renamed from: a */
    private static String m1380a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m1381b(String str, String str2, Object obj) {
        if (Log.isLoggable(m1384e(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    /* renamed from: c */
    public static void m1382c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m1384e(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m1383d(String str, String str2, Throwable th) {
        String e = m1384e(str);
        if (Log.isLoggable(e, 6)) {
            Log.e(e, str2, th);
        }
    }

    /* renamed from: e */
    private static String m1384e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m1380a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m1385f(String str, String str2, Object obj) {
        String e = m1384e(str);
        if (Log.isLoggable(e, 4)) {
            Log.i(e, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: g */
    public static void m1386g(String str, String str2, Object obj) {
        String e = m1384e(str);
        if (Log.isLoggable(e, 5)) {
            Log.w(e, String.format(str2, new Object[]{obj}));
        }
    }
}
