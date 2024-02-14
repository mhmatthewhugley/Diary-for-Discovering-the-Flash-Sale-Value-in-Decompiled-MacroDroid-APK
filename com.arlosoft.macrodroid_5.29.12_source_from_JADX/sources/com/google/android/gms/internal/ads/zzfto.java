package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzfto {

    /* renamed from: a */
    private static final Object f36392a;

    /* renamed from: b */
    private static final Method f36393b;

    /* renamed from: c */
    private static final Method f36394c;

    static {
        Method method;
        Object b = m50975b();
        f36392a = b;
        Method method2 = null;
        if (b == null) {
            method = null;
        } else {
            method = m50976c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f36393b = method;
        if (b != null) {
            method2 = m50977d(b);
        }
        f36394c = method2;
    }

    /* renamed from: a */
    public static String m50974a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    private static Object m50975b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m50976c(String str, Class... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m50977d(Object obj) {
        try {
            Method c = m50976c("getStackTraceDepth", Throwable.class);
            if (c == null) {
                return null;
            }
            c.invoke(obj, new Object[]{new Throwable()});
            return c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
