package org.mockito.internal.exceptions.stacktrace;

import p418vd.C16770a;

/* renamed from: org.mockito.internal.exceptions.stacktrace.b */
/* compiled from: DefaultStackTraceCleaner */
public class C16076b implements C16770a {
    /* renamed from: a */
    private static boolean m96681a(String str) {
        return str.startsWith("org.mockito.");
    }

    /* renamed from: b */
    private static boolean m96682b(String str) {
        return str.startsWith("org.mockito.internal.junit.JUnitRule");
    }

    /* renamed from: c */
    private static boolean m96683c(String str) {
        return str.startsWith("org.mockito.internal.runners.") || str.startsWith("org.mockito.runners.") || str.startsWith("org.mockito.junit.");
    }

    /* renamed from: d */
    private static boolean m96684d(String str) {
        return str.contains("$$EnhancerByMockitoWithCGLIB$$") || str.contains("$MockitoMock$");
    }

    public boolean isIn(StackTraceElement stackTraceElement) {
        if (m96683c(stackTraceElement.getClassName()) || m96682b(stackTraceElement.getClassName())) {
            return true;
        }
        if (m96684d(stackTraceElement.getClassName()) || m96681a(stackTraceElement.getClassName())) {
            return false;
        }
        return true;
    }
}
