package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.io.Serializable;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import p097gd.C7354d;

/* renamed from: org.altbeacon.beacon.service.h */
/* compiled from: RangedBeacon */
public class C16017h implements Serializable {

    /* renamed from: c */
    public static long f65931c = 5000;

    /* renamed from: a */
    protected transient C16020k f65932a = null;
    private long firstCycleDetectionTimestamp = 0;
    private long lastCycleDetectionTimestamp = 0;
    protected long lastTrackedTimeMillis = 0;
    Beacon mBeacon;
    private boolean mTracked = true;
    private int packetCount = 0;

    public C16017h(Beacon beacon) {
        mo76468j(beacon);
    }

    /* renamed from: d */
    private C16020k m96569d() {
        if (this.f65932a == null) {
            try {
                this.f65932a = (C16020k) BeaconManager.m33481J().getConstructors()[0].newInstance(new Object[0]);
            } catch (Exception unused) {
                C7354d.m30377b("RangedBeacon", "Could not construct RssiFilterImplClass %s", BeaconManager.m33481J().getName());
            }
        }
        return this.f65932a;
    }

    /* renamed from: a */
    public void mo76460a(Integer num) {
        if (num.intValue() != 127) {
            this.mTracked = true;
            this.lastTrackedTimeMillis = SystemClock.elapsedRealtime();
            m96569d().mo76478b(num);
        }
    }

    /* renamed from: b */
    public void mo76461b() {
        if (!m96569d().mo76480d()) {
            double a = m96569d().mo76477a();
            this.mBeacon.mo37967z(a);
            this.mBeacon.mo37966y(m96569d().mo76479c());
            C7354d.m30376a("RangedBeacon", "calculated new runningAverageRssi: %s", Double.valueOf(a));
        } else {
            C7354d.m30376a("RangedBeacon", "No measurements available to calculate running average", new Object[0]);
        }
        this.mBeacon.mo37964w(this.packetCount);
        this.mBeacon.mo37961t(this.firstCycleDetectionTimestamp);
        this.mBeacon.mo37963v(this.lastCycleDetectionTimestamp);
        this.packetCount = 0;
        this.firstCycleDetectionTimestamp = 0;
        this.lastCycleDetectionTimestamp = 0;
    }

    /* renamed from: c */
    public Beacon mo76462c() {
        return this.mBeacon;
    }

    /* renamed from: e */
    public long mo76463e() {
        return SystemClock.elapsedRealtime() - this.lastTrackedTimeMillis;
    }

    /* renamed from: f */
    public boolean mo76464f() {
        return mo76463e() > f65931c;
    }

    /* renamed from: g */
    public boolean mo76465g() {
        return this.mTracked;
    }

    /* renamed from: h */
    public boolean mo76466h() {
        return m96569d().mo76480d();
    }

    /* renamed from: i */
    public void mo76467i(boolean z) {
        this.mTracked = z;
    }

    /* renamed from: j */
    public void mo76468j(Beacon beacon) {
        this.packetCount++;
        this.mBeacon = beacon;
        if (this.firstCycleDetectionTimestamp == 0) {
            this.firstCycleDetectionTimestamp = beacon.mo37951g();
        }
        this.lastCycleDetectionTimestamp = beacon.mo37955k();
        mo76460a(Integer.valueOf(this.mBeacon.mo37956l()));
    }
}
