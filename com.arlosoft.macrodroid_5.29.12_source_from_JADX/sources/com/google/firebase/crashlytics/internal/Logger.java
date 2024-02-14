package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class Logger {

    /* renamed from: c */
    static final Logger f4850c = new Logger("FirebaseCrashlytics");

    /* renamed from: a */
    private final String f4851a;

    /* renamed from: b */
    private int f4852b = 4;

    public Logger(String str) {
        this.f4851a = str;
    }

    /* renamed from: a */
    private boolean m6524a(int i) {
        return this.f4852b <= i || Log.isLoggable(this.f4851a, i);
    }

    /* renamed from: f */
    public static Logger m6525f() {
        return f4850c;
    }

    /* renamed from: b */
    public void mo22954b(String str) {
        mo22955c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo22955c(String str, Throwable th) {
        m6524a(3);
    }

    /* renamed from: d */
    public void mo22956d(String str) {
        mo22957e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo22957e(String str, Throwable th) {
        if (m6524a(6)) {
            Log.e(this.f4851a, str, th);
        }
    }

    /* renamed from: g */
    public void mo22958g(String str) {
        mo22959h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo22959h(String str, Throwable th) {
        if (m6524a(4)) {
            Log.i(this.f4851a, str, th);
        }
    }

    /* renamed from: i */
    public void mo22960i(String str) {
        mo22961j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo22961j(String str, Throwable th) {
        m6524a(2);
    }

    /* renamed from: k */
    public void mo22962k(String str) {
        mo22963l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo22963l(String str, Throwable th) {
        if (m6524a(5)) {
            Log.w(this.f4851a, str, th);
        }
    }
}
