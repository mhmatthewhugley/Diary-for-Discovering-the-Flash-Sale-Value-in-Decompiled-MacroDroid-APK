package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final CrashListener f4984a;

    /* renamed from: c */
    private final SettingsProvider f4985c;

    /* renamed from: d */
    private final Thread.UncaughtExceptionHandler f4986d;

    /* renamed from: f */
    private final CrashlyticsNativeComponent f4987f;

    /* renamed from: g */
    private final AtomicBoolean f4988g = new AtomicBoolean(false);

    interface CrashListener {
        /* renamed from: a */
        void mo23002a(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f4984a = crashListener;
        this.f4985c = settingsProvider;
        this.f4986d = uncaughtExceptionHandler;
        this.f4987f = crashlyticsNativeComponent;
    }

    /* renamed from: b */
    private boolean m6728b(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.m6525f().mo22956d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            Logger.m6525f().mo22956d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f4987f.mo22943b()) {
            return true;
        } else {
            Logger.m6525f().mo22954b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo23039a() {
        return this.f4988g.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f4988g.set(true);
        try {
            if (m6728b(thread, th)) {
                this.f4984a.mo23002a(this.f4985c, thread, th);
            } else {
                Logger.m6525f().mo22954b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            Logger.m6525f().mo22957e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            Logger.m6525f().mo22954b("Completed exception processing. Invoking default exception handler.");
            this.f4986d.uncaughtException(thread, th);
            this.f4988g.set(false);
            throw th2;
        }
        Logger.m6525f().mo22954b("Completed exception processing. Invoking default exception handler.");
        this.f4986d.uncaughtException(thread, th);
        this.f4988g.set(false);
    }
}
