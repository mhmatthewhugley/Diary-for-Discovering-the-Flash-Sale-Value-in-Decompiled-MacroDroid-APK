package org.altbeacon.beacon.service;

import android.os.SystemClock;

/* renamed from: org.altbeacon.beacon.service.b */
/* compiled from: DetectionTracker */
public class C16011b {

    /* renamed from: b */
    private static final C16011b f65920b = new C16011b();

    /* renamed from: a */
    private long f65921a = 0;

    private C16011b() {
    }

    /* renamed from: a */
    public static C16011b m96530a() {
        return f65920b;
    }

    /* renamed from: b */
    public long mo76433b() {
        return this.f65921a;
    }

    /* renamed from: c */
    public void mo76434c() {
        this.f65921a = SystemClock.elapsedRealtime();
    }
}
