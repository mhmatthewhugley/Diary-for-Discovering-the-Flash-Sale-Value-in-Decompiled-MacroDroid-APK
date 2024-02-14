package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.io.Serializable;
import org.altbeacon.beacon.BeaconManager;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.j */
/* compiled from: RegionMonitoringState */
public class C16019j implements Serializable {

    /* renamed from: a */
    private static final String f65935a = C16019j.class.getSimpleName();
    private final C16010a callback;
    private boolean inside = false;
    private long lastSeenTime = 0;

    public C16019j(C16010a aVar) {
        this.callback = aVar;
    }

    /* renamed from: a */
    public C16010a mo76472a() {
        return this.callback;
    }

    /* renamed from: b */
    public boolean mo76473b() {
        return this.inside;
    }

    /* renamed from: c */
    public boolean mo76474c() {
        this.lastSeenTime = SystemClock.elapsedRealtime();
        if (this.inside) {
            return false;
        }
        this.inside = true;
        return true;
    }

    /* renamed from: d */
    public void mo76475d() {
        this.inside = false;
        this.lastSeenTime = 0;
    }

    /* renamed from: e */
    public boolean mo76476e() {
        if (!this.inside || this.lastSeenTime <= 0 || SystemClock.elapsedRealtime() - this.lastSeenTime <= BeaconManager.m33480H()) {
            return false;
        }
        C7354d.m30376a(f65935a, "We are newly outside the region because the lastSeenTime of %s was %s seconds ago, and that is over the expiration duration of %s", Long.valueOf(this.lastSeenTime), Long.valueOf(SystemClock.elapsedRealtime() - this.lastSeenTime), Long.valueOf(BeaconManager.m33480H()));
        mo76475d();
        return true;
    }
}
