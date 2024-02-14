package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Date;

public class ExponentialBackoff {

    /* renamed from: a */
    private final AsyncQueue f54773a;

    /* renamed from: b */
    private final AsyncQueue.TimerId f54774b;

    /* renamed from: c */
    private final long f54775c;

    /* renamed from: d */
    private final double f54776d;

    /* renamed from: e */
    private final long f54777e;

    /* renamed from: f */
    private long f54778f;

    /* renamed from: g */
    private long f54779g;

    /* renamed from: h */
    private long f54780h;

    /* renamed from: i */
    private AsyncQueue.DelayedTask f54781i;

    public ExponentialBackoff(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId, long j, double d, long j2) {
        this.f54773a = asyncQueue;
        this.f54774b = timerId;
        this.f54775c = j;
        this.f54776d = d;
        this.f54777e = j2;
        this.f54778f = j2;
        this.f54780h = new Date().getTime();
        mo63182e();
    }

    /* renamed from: c */
    private long m76496c() {
        return (long) ((Math.random() - 0.5d) * ((double) this.f54779g));
    }

    /* renamed from: d */
    static /* synthetic */ void m76497d(ExponentialBackoff exponentialBackoff, Runnable runnable) {
        exponentialBackoff.f54780h = new Date().getTime();
        runnable.run();
    }

    /* renamed from: a */
    public void mo63180a(Runnable runnable) {
        mo63181b();
        long c = this.f54779g + m76496c();
        long max = Math.max(0, new Date().getTime() - this.f54780h);
        long max2 = Math.max(0, c - max);
        if (this.f54779g > 0) {
            Logger.m76508a(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(max2), Long.valueOf(this.f54779g), Long.valueOf(c), Long.valueOf(max));
        }
        this.f54781i = this.f54773a.mo63151g(this.f54774b, max2, ExponentialBackoff$$Lambda$1.m76503a(this, runnable));
        long j = (long) (((double) this.f54779g) * this.f54776d);
        this.f54779g = j;
        long j2 = this.f54775c;
        if (j < j2) {
            this.f54779g = j2;
        } else {
            long j3 = this.f54778f;
            if (j > j3) {
                this.f54779g = j3;
            }
        }
        this.f54778f = this.f54777e;
    }

    /* renamed from: b */
    public void mo63181b() {
        AsyncQueue.DelayedTask delayedTask = this.f54781i;
        if (delayedTask != null) {
            delayedTask.mo63157e();
            this.f54781i = null;
        }
    }

    /* renamed from: e */
    public void mo63182e() {
        this.f54779g = 0;
    }

    /* renamed from: f */
    public void mo63183f() {
        this.f54779g = this.f54778f;
    }

    /* renamed from: g */
    public void mo63184g(long j) {
        this.f54778f = j;
    }

    public ExponentialBackoff(AsyncQueue asyncQueue, AsyncQueue.TimerId timerId) {
        this(asyncQueue, timerId, 1000, 1.5d, 60000);
    }
}
