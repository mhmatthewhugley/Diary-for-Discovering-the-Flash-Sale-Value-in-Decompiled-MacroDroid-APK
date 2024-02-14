package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

class RequestLimiter {

    /* renamed from: d */
    private static final long f54917d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f54918e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final Utils f54919a = Utils.m76642c();
    @GuardedBy("this")

    /* renamed from: b */
    private long f54920b;
    @GuardedBy("this")

    /* renamed from: c */
    private int f54921c;

    RequestLimiter() {
    }

    /* renamed from: a */
    private synchronized long m76758a(int i) {
        if (!m76759c(i)) {
            return f54917d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f54921c) + ((double) this.f54919a.mo63243e()), (double) f54918e);
    }

    /* renamed from: c */
    private static boolean m76759c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    private static boolean m76760d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: e */
    private synchronized void m76761e() {
        this.f54921c = 0;
    }

    /* renamed from: b */
    public synchronized boolean mo63309b() {
        return this.f54921c == 0 || this.f54919a.mo63241a() > this.f54920b;
    }

    /* renamed from: f */
    public synchronized void mo63310f(int i) {
        if (m76760d(i)) {
            m76761e();
            return;
        }
        this.f54921c++;
        this.f54920b = this.f54919a.mo63241a() + m76758a(i);
    }
}
