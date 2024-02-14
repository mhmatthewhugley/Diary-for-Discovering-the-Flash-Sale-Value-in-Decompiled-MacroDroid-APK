package com.facebook.stetho.common;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.commons.p353io.IOUtils;

public class LogRedirector {
    private static volatile Logger sLogger;

    public interface Logger {
        boolean isLoggable(String str, int i);

        void log(int i, String str, String str2);
    }

    /* renamed from: d */
    public static void m25465d(String str, String str2, Throwable th) {
        m25464d(str, str2 + IOUtils.LINE_SEPARATOR_UNIX + formatThrowable(th));
    }

    /* renamed from: e */
    public static void m25467e(String str, String str2, Throwable th) {
        m25466e(str, str2 + IOUtils.LINE_SEPARATOR_UNIX + formatThrowable(th));
    }

    private static String formatThrowable(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    /* renamed from: i */
    public static void m25469i(String str, String str2, Throwable th) {
        m25468i(str, str2 + IOUtils.LINE_SEPARATOR_UNIX + formatThrowable(th));
    }

    public static boolean isLoggable(String str, int i) {
        Logger logger = sLogger;
        if (logger != null) {
            return logger.isLoggable(str, i);
        }
        return Log.isLoggable(str, i);
    }

    private static void log(int i, String str, String str2) {
        Logger logger = sLogger;
        if (logger != null) {
            logger.log(i, str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    public static void setLogger(Logger logger) {
        Util.throwIfNull(logger);
        Util.throwIfNotNull(sLogger);
        sLogger = logger;
    }

    /* renamed from: v */
    public static void m25471v(String str, String str2, Throwable th) {
        m25470v(str, str2 + IOUtils.LINE_SEPARATOR_UNIX + formatThrowable(th));
    }

    /* renamed from: w */
    public static void m25473w(String str, String str2, Throwable th) {
        m25472w(str, str2 + IOUtils.LINE_SEPARATOR_UNIX + formatThrowable(th));
    }

    /* renamed from: d */
    public static void m25464d(String str, String str2) {
        log(3, str, str2);
    }

    /* renamed from: e */
    public static void m25466e(String str, String str2) {
        log(6, str, str2);
    }

    /* renamed from: i */
    public static void m25468i(String str, String str2) {
        log(4, str, str2);
    }

    /* renamed from: v */
    public static void m25470v(String str, String str2) {
        log(2, str, str2);
    }

    /* renamed from: w */
    public static void m25472w(String str, String str2) {
        log(5, str, str2);
    }
}
