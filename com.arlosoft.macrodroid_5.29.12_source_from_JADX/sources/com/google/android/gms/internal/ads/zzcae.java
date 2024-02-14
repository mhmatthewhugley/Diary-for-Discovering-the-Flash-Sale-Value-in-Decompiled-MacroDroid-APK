package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class zzcae implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f28045a;

    /* renamed from: c */
    final /* synthetic */ zzcaf f28046c;

    zzcae(zzcaf zzcaf, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f28046c = zzcaf;
        this.f28045a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f28046c.mo43254e(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f28045a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f28045a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
