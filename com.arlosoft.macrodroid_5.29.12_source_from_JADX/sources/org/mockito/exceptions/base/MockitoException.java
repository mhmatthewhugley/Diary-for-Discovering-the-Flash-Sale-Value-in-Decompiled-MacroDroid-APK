package org.mockito.exceptions.base;

import org.mockito.internal.exceptions.stacktrace.C16075a;

public class MockitoException extends RuntimeException {
    private static final long serialVersionUID = 1;
    private StackTraceElement[] unfilteredStackTrace;

    public MockitoException(String str, Throwable th) {
        super(str, th);
        m96679a();
    }

    /* renamed from: a */
    private void m96679a() {
        this.unfilteredStackTrace = getStackTrace();
        new C16075a().mo78408a(this);
    }

    public MockitoException(String str) {
        super(str);
        m96679a();
    }
}
