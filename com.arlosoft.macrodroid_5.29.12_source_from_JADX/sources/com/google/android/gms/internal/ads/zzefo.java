package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzefo {

    /* renamed from: a */
    private long f33897a = 0;

    /* renamed from: b */
    private int f33898b = 0;

    /* renamed from: c */
    private long f33899c = 0;

    /* renamed from: d */
    private long f33900d = 0;

    /* renamed from: e */
    private long f33901e = 0;

    /* renamed from: f */
    private final Object f33902f = new Object();

    /* renamed from: g */
    private final Object f33903g = new Object();

    /* renamed from: h */
    private final Object f33904h = new Object();

    /* renamed from: i */
    private final Object f33905i = new Object();

    /* renamed from: j */
    private final Object f33906j = new Object();

    /* renamed from: a */
    public final int mo45258a() {
        int i;
        synchronized (this.f33903g) {
            i = this.f33898b;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized long mo45259b() {
        long j;
        synchronized (this.f33906j) {
            j = this.f33901e;
        }
        return j;
    }

    /* renamed from: c */
    public final synchronized long mo45260c() {
        long j;
        synchronized (this.f33905i) {
            j = this.f33900d;
        }
        return j;
    }

    /* renamed from: d */
    public final synchronized long mo45261d() {
        long j;
        synchronized (this.f33902f) {
            j = this.f33897a;
        }
        return j;
    }

    /* renamed from: e */
    public final long mo45262e() {
        long j;
        synchronized (this.f33904h) {
            j = this.f33899c;
        }
        return j;
    }

    /* renamed from: f */
    public final synchronized void mo45263f(long j) {
        synchronized (this.f33906j) {
            this.f33901e = j;
        }
    }

    /* renamed from: g */
    public final synchronized void mo45264g(long j) {
        synchronized (this.f33905i) {
            this.f33900d = j;
        }
    }

    /* renamed from: h */
    public final synchronized void mo45265h(long j) {
        synchronized (this.f33902f) {
            this.f33897a = j;
        }
    }

    /* renamed from: i */
    public final void mo45266i(int i) {
        synchronized (this.f33903g) {
            this.f33898b = i;
        }
    }

    /* renamed from: j */
    public final void mo45267j(long j) {
        synchronized (this.f33904h) {
            this.f33899c = j;
        }
    }
}
