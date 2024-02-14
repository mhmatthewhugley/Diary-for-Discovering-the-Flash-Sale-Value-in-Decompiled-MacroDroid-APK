package p272gc;

import kotlin.jvm.internal.C13706o;

/* renamed from: gc.c */
/* compiled from: exceptionUtils.kt */
public final class C12346c {
    /* renamed from: a */
    public static final boolean m83094a(Throwable th) {
        C13706o.m87929f(th, "<this>");
        Class cls = th.getClass();
        while (!C13706o.m87924a(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m83095b(Throwable th) {
        C13706o.m87929f(th, "e");
        throw th;
    }
}
