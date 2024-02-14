package com.google.firebase.crashlytics.internal.stacktrace;

public class TrimmedThrowableData {

    /* renamed from: a */
    public final String f5521a;

    /* renamed from: b */
    public final String f5522b;

    /* renamed from: c */
    public final StackTraceElement[] f5523c;

    /* renamed from: d */
    public final TrimmedThrowableData f5524d;

    public TrimmedThrowableData(Throwable th, StackTraceTrimmingStrategy stackTraceTrimmingStrategy) {
        this.f5521a = th.getLocalizedMessage();
        this.f5522b = th.getClass().getName();
        this.f5523c = stackTraceTrimmingStrategy.mo23532a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f5524d = cause != null ? new TrimmedThrowableData(cause, stackTraceTrimmingStrategy) : null;
    }
}
