package com.facebook.stetho.common;

import java.util.Locale;

public class LogUtil {
    private static final String TAG = "stetho";

    /* renamed from: d */
    public static void m25475d(String str, Object... objArr) {
        m25474d(format(str, objArr));
    }

    /* renamed from: e */
    public static void m25479e(String str, Object... objArr) {
        m25478e(format(str, objArr));
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i */
    public static void m25483i(String str, Object... objArr) {
        m25482i(format(str, objArr));
    }

    public static boolean isLoggable(int i) {
        if (i == 5 || i == 6) {
            return true;
        }
        return LogRedirector.isLoggable(TAG, i);
    }

    /* renamed from: v */
    public static void m25487v(String str, Object... objArr) {
        m25486v(format(str, objArr));
    }

    /* renamed from: w */
    public static void m25491w(String str, Object... objArr) {
        m25490w(format(str, objArr));
    }

    /* renamed from: d */
    public static void m25477d(Throwable th, String str, Object... objArr) {
        m25476d(th, format(str, objArr));
    }

    /* renamed from: e */
    public static void m25481e(Throwable th, String str, Object... objArr) {
        m25480e(th, format(str, objArr));
    }

    /* renamed from: i */
    public static void m25485i(Throwable th, String str, Object... objArr) {
        m25484i(th, format(str, objArr));
    }

    /* renamed from: v */
    public static void m25489v(Throwable th, String str, Object... objArr) {
        m25488v(th, format(str, objArr));
    }

    /* renamed from: w */
    public static void m25493w(Throwable th, String str, Object... objArr) {
        m25492w(th, format(str, objArr));
    }

    /* renamed from: d */
    public static void m25474d(String str) {
        if (isLoggable(3)) {
            LogRedirector.m25464d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m25478e(String str) {
        if (isLoggable(6)) {
            LogRedirector.m25466e(TAG, str);
        }
    }

    /* renamed from: i */
    public static void m25482i(String str) {
        if (isLoggable(4)) {
            LogRedirector.m25468i(TAG, str);
        }
    }

    /* renamed from: v */
    public static void m25486v(String str) {
        if (isLoggable(2)) {
            LogRedirector.m25470v(TAG, str);
        }
    }

    /* renamed from: w */
    public static void m25490w(String str) {
        if (isLoggable(5)) {
            LogRedirector.m25472w(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m25476d(Throwable th, String str) {
        if (isLoggable(3)) {
            LogRedirector.m25465d(TAG, str, th);
        }
    }

    /* renamed from: e */
    public static void m25480e(Throwable th, String str) {
        if (isLoggable(6)) {
            LogRedirector.m25467e(TAG, str, th);
        }
    }

    /* renamed from: i */
    public static void m25484i(Throwable th, String str) {
        if (isLoggable(4)) {
            LogRedirector.m25469i(TAG, str, th);
        }
    }

    /* renamed from: v */
    public static void m25488v(Throwable th, String str) {
        if (isLoggable(2)) {
            LogRedirector.m25471v(TAG, str, th);
        }
    }

    /* renamed from: w */
    public static void m25492w(Throwable th, String str) {
        if (isLoggable(5)) {
            LogRedirector.m25473w(TAG, str, th);
        }
    }
}
