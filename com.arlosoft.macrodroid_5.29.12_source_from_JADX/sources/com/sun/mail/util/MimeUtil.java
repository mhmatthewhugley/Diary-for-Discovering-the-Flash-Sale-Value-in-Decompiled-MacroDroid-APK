package com.sun.mail.util;

import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import javax.mail.internet.MimePart;

public class MimeUtil {
    private static final Method cleanContentType;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[SYNTHETIC, Splitter:B:12:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: ClassNotFoundException | NoSuchMethodException | RuntimeException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0003] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "mail.mime.contenttypehandler"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033, all -> 0x002f }
            if (r1 == 0) goto L_0x0033
            java.lang.ClassLoader r2 = getContextClassLoader()     // Catch:{ ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033, all -> 0x002f }
            r3 = 0
            if (r2 == 0) goto L_0x0015
            java.lang.Class r2 = java.lang.Class.forName(r1, r3, r2)     // Catch:{ ClassNotFoundException -> 0x0015, ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033 }
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            if (r2 != 0) goto L_0x001c
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033, all -> 0x002f }
        L_0x001c:
            java.lang.String r1 = "cleanContentType"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033, all -> 0x002f }
            java.lang.Class<javax.mail.internet.MimePart> r5 = javax.mail.internet.MimePart.class
            r4[r3] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033, all -> 0x002f }
            r3 = 1
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r3] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033, all -> 0x002f }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException | RuntimeException -> 0x0033, all -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r1 = move-exception
            cleanContentType = r0
            throw r1
        L_0x0033:
            cleanContentType = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.MimeUtil.<clinit>():void");
    }

    private MimeUtil() {
    }

    public static String cleanContentType(MimePart mimePart, String str) {
        Method method = cleanContentType;
        if (method != null) {
            try {
                return (String) method.invoke((Object) null, new Object[]{mimePart, str});
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private static ClassLoader getContextClassLoader() {
        return (ClassLoader) AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
            public ClassLoader run() {
                try {
                    return Thread.currentThread().getContextClassLoader();
                } catch (SecurityException unused) {
                    return null;
                }
            }
        });
    }
}
