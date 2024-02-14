package org.altbeacon.beacon.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.Nullable;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import p091fd.C7322e;
import p097gd.C7354d;
import p300jd.C13374a;
import p310kd.C13551b;

public class ScanJob extends JobService {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f65908o = ScanJob.class.getSimpleName();

    /* renamed from: p */
    private static int f65909p = -1;

    /* renamed from: s */
    private static int f65910s = -1;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: a */
    public C16029o f65911a = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f65912c = new Handler();
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public C16024m f65913d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f65914f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f65915g = false;

    /* renamed from: org.altbeacon.beacon.service.ScanJob$a */
    class C16006a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JobParameters f65916a;

        /* renamed from: org.altbeacon.beacon.service.ScanJob$a$a */
        class C16007a implements Runnable {

            /* renamed from: org.altbeacon.beacon.service.ScanJob$a$a$a */
            class C16008a implements Runnable {
                C16008a() {
                }

                public void run() {
                    ScanJob.this.m96516q();
                }
            }

            C16007a() {
            }

            public void run() {
                String b = ScanJob.f65908o;
                C7354d.m30379d(b, "Scan job runtime expired: " + ScanJob.this, new Object[0]);
                ScanJob.this.m96519t();
                ScanJob.this.f65911a.mo76525n();
                C16006a aVar = C16006a.this;
                ScanJob.this.jobFinished(aVar.f65916a, false);
                ScanJob.this.f65912c.post(new C16008a());
            }
        }

        C16006a(JobParameters jobParameters) {
            this.f65916a = jobParameters;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x01bf, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                org.altbeacon.beacon.BeaconManager r0 = org.altbeacon.beacon.BeaconManager.m33479A(r0)
                r0.mo37973B()
                org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                boolean r0 = r0.m96514o()
                r1 = 0
                if (r0 != 0) goto L_0x0024
                java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.f65908o
                java.lang.String r2 = "Cannot allocate a scanner to look for beacons.  System resources are low."
                java.lang.Object[] r3 = new java.lang.Object[r1]
                p097gd.C7354d.m30377b(r0, r2, r3)
                org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                android.app.job.JobParameters r2 = r13.f65916a
                r0.jobFinished(r2, r1)
            L_0x0024:
                org.altbeacon.beacon.service.n r0 = org.altbeacon.beacon.service.C16028n.m96632g()
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this
                android.content.Context r2 = r2.getApplicationContext()
                r0.mo76510e(r2)
                android.app.job.JobParameters r0 = r13.f65916a
                int r0 = r0.getJobId()
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this
                int r2 = org.altbeacon.beacon.service.ScanJob.m96511l(r2)
                if (r0 != r2) goto L_0x005c
                java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.f65908o
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Running immediate scan job: instance is "
                r2.append(r3)
                org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r3 = new java.lang.Object[r1]
                p097gd.C7354d.m30379d(r0, r2, r3)
                goto L_0x0078
            L_0x005c:
                java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.f65908o
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Running periodic scan job: instance is "
                r2.append(r3)
                org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r3 = new java.lang.Object[r1]
                p097gd.C7354d.m30379d(r0, r2, r3)
            L_0x0078:
                java.util.ArrayList r0 = new java.util.ArrayList
                org.altbeacon.beacon.service.n r2 = org.altbeacon.beacon.service.C16028n.m96632g()
                java.util.List r2 = r2.mo76509d()
                r0.<init>(r2)
                java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.f65908o
                java.lang.String r3 = "Processing %d queued scan results"
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r5 = r0.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r1] = r5
                p097gd.C7354d.m30376a(r2, r3, r4)
                java.util.Iterator r0 = r0.iterator()
            L_0x009f:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x00e1
                java.lang.Object r2 = r0.next()
                android.bluetooth.le.ScanResult r2 = (android.bluetooth.le.ScanResult) r2
                android.bluetooth.le.ScanRecord r3 = r2.getScanRecord()
                if (r3 == 0) goto L_0x009f
                org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this
                org.altbeacon.beacon.service.m r4 = r4.f65913d
                if (r4 == 0) goto L_0x009f
                org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this
                org.altbeacon.beacon.service.m r5 = r4.f65913d
                android.bluetooth.BluetoothDevice r6 = r2.getDevice()
                int r7 = r2.getRssi()
                byte[] r8 = r3.getBytes()
                long r3 = java.lang.System.currentTimeMillis()
                long r9 = android.os.SystemClock.elapsedRealtime()
                long r3 = r3 - r9
                long r9 = r2.getTimestampNanos()
                r11 = 1000000(0xf4240, double:4.940656E-318)
                long r9 = r9 / r11
                long r9 = r9 + r3
                r5.mo76491r(r6, r7, r8, r9)
                goto L_0x009f
            L_0x00e1:
                java.lang.String r0 = org.altbeacon.beacon.service.ScanJob.f65908o
                java.lang.String r2 = "Done processing queued scan results"
                java.lang.Object[] r3 = new java.lang.Object[r1]
                p097gd.C7354d.m30376a(r0, r2, r3)
                org.altbeacon.beacon.service.ScanJob r0 = org.altbeacon.beacon.service.ScanJob.this
                monitor-enter(r0)
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                boolean r2 = r2.f65915g     // Catch:{ all -> 0x01c0 }
                if (r2 == 0) goto L_0x010b
                java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.f65908o     // Catch:{ all -> 0x01c0 }
                java.lang.String r3 = "Quitting scan job before we even start.  Somebody told us to stop."
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01c0 }
                p097gd.C7354d.m30376a(r2, r3, r4)     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                android.app.job.JobParameters r3 = r13.f65916a     // Catch:{ all -> 0x01c0 }
                r2.jobFinished(r3, r1)     // Catch:{ all -> 0x01c0 }
                monitor-exit(r0)     // Catch:{ all -> 0x01c0 }
                return
            L_0x010b:
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                boolean r2 = r2.f65914f     // Catch:{ all -> 0x01c0 }
                if (r2 == 0) goto L_0x0125
                java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.f65908o     // Catch:{ all -> 0x01c0 }
                java.lang.String r3 = "Scanning already started.  Resetting for current parameters"
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01c0 }
                p097gd.C7354d.m30376a(r2, r3, r4)     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                boolean r2 = r2.m96515p()     // Catch:{ all -> 0x01c0 }
                goto L_0x012b
            L_0x0125:
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                boolean r2 = r2.m96518s()     // Catch:{ all -> 0x01c0 }
            L_0x012b:
                org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                android.os.Handler r3 = r3.f65912c     // Catch:{ all -> 0x01c0 }
                r4 = 0
                r3.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x01c0 }
                if (r2 == 0) goto L_0x0182
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.o r2 = r2.f65911a     // Catch:{ all -> 0x01c0 }
                if (r2 == 0) goto L_0x01be
                java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.f65908o     // Catch:{ all -> 0x01c0 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c0 }
                r3.<init>()     // Catch:{ all -> 0x01c0 }
                java.lang.String r4 = "Scan job running for "
                r3.append(r4)     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.o r4 = r4.f65911a     // Catch:{ all -> 0x01c0 }
                int r4 = r4.mo76524l()     // Catch:{ all -> 0x01c0 }
                r3.append(r4)     // Catch:{ all -> 0x01c0 }
                java.lang.String r4 = " millis"
                r3.append(r4)     // Catch:{ all -> 0x01c0 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c0 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x01c0 }
                p097gd.C7354d.m30379d(r2, r3, r1)     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r1 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                android.os.Handler r1 = r1.f65912c     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob$a$a r2 = new org.altbeacon.beacon.service.ScanJob$a$a     // Catch:{ all -> 0x01c0 }
                r2.<init>()     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r3 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.o r3 = r3.f65911a     // Catch:{ all -> 0x01c0 }
                int r3 = r3.mo76524l()     // Catch:{ all -> 0x01c0 }
                long r3 = (long) r3     // Catch:{ all -> 0x01c0 }
                r1.postDelayed(r2, r3)     // Catch:{ all -> 0x01c0 }
                goto L_0x01be
            L_0x0182:
                java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.f65908o     // Catch:{ all -> 0x01c0 }
                java.lang.String r3 = "Scanning not started so Scan job is complete."
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01c0 }
                p097gd.C7354d.m30379d(r2, r3, r4)     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                r2.m96519t()     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.o r2 = r2.f65911a     // Catch:{ all -> 0x01c0 }
                r2.mo76525n()     // Catch:{ all -> 0x01c0 }
                java.lang.String r2 = org.altbeacon.beacon.service.ScanJob.f65908o     // Catch:{ all -> 0x01c0 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c0 }
                r3.<init>()     // Catch:{ all -> 0x01c0 }
                java.lang.String r4 = "ScanJob Lifecycle STOP (start fail): "
                r3.append(r4)     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r4 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                r3.append(r4)     // Catch:{ all -> 0x01c0 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01c0 }
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x01c0 }
                p097gd.C7354d.m30376a(r2, r3, r4)     // Catch:{ all -> 0x01c0 }
                org.altbeacon.beacon.service.ScanJob r2 = org.altbeacon.beacon.service.ScanJob.this     // Catch:{ all -> 0x01c0 }
                android.app.job.JobParameters r3 = r13.f65916a     // Catch:{ all -> 0x01c0 }
                r2.jobFinished(r3, r1)     // Catch:{ all -> 0x01c0 }
            L_0x01be:
                monitor-exit(r0)     // Catch:{ all -> 0x01c0 }
                return
            L_0x01c0:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x01c0 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.ScanJob.C16006a.run():void");
        }
    }

    /* renamed from: l */
    public static int m96511l(Context context) {
        if (f65909p < 0) {
            return m96512m(context, "immediateScanJobId");
        }
        String str = f65908o;
        C7354d.m30379d(str, "Using ImmediateScanJobId from static override: " + f65909p, new Object[0]);
        return f65909p;
    }

    /* renamed from: m */
    private static int m96512m(Context context, String str) {
        ServiceInfo serviceInfo;
        Bundle bundle;
        try {
            serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, ScanJob.class), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            serviceInfo = null;
        }
        if (serviceInfo == null || (bundle = serviceInfo.metaData) == null || bundle.get(str) == null) {
            throw new RuntimeException("Cannot get job id from manifest.  Make sure that the " + str + " is configured in the manifest for the ScanJob.");
        }
        int i = serviceInfo.metaData.getInt(str);
        String str2 = f65908o;
        C7354d.m30379d(str2, "Using " + str + " from manifest: " + i, new Object[0]);
        return i;
    }

    /* renamed from: n */
    public static int m96513n(Context context) {
        if (f65909p < 0) {
            return m96512m(context, "periodicScanJobId");
        }
        String str = f65908o;
        C7354d.m30379d(str, "Using PeriodicScanJobId from static override: " + f65910s, new Object[0]);
        return f65910s;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m96514o() {
        C16029o m = C16029o.m96640m(this);
        this.f65911a = m;
        if (m == null) {
            return false;
        }
        C16024m mVar = new C16024m(this);
        this.f65911a.mo76526p(System.currentTimeMillis());
        mVar.mo76495v(this.f65911a.mo76521i());
        mVar.mo76496w(this.f65911a.mo76522j());
        mVar.mo76493t(this.f65911a.mo76517e());
        mVar.mo76494u(this.f65911a.mo76518f());
        if (mVar.mo76487j() == null) {
            try {
                mVar.mo76486i(this.f65911a.mo76515c().booleanValue(), (C13551b) null);
            } catch (OutOfMemoryError unused) {
                C7354d.m30381f(f65908o, "Failed to create CycledLeScanner thread.", new Object[0]);
                return false;
            }
        }
        this.f65913d = mVar;
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public boolean m96515p() {
        C16024m mVar;
        if (this.f65911a == null || (mVar = this.f65913d) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            mVar.mo76483A();
        }
        long longValue = (this.f65911a.mo76515c().booleanValue() ? this.f65911a.mo76516d() : this.f65911a.mo76520h()).longValue();
        long longValue2 = (this.f65911a.mo76515c().booleanValue() ? this.f65911a.mo76514b() : this.f65911a.mo76519g()).longValue();
        if (this.f65913d.mo76487j() != null) {
            this.f65913d.mo76487j().mo68799u(longValue, longValue2, this.f65911a.mo76515c().booleanValue());
        }
        this.f65914f = true;
        if (longValue <= 0) {
            C7354d.m30381f(f65908o, "Starting scan with scan period of zero.  Exiting ScanJob.", new Object[0]);
            if (this.f65913d.mo76487j() != null) {
                this.f65913d.mo76487j().mo68803y();
            }
            return false;
        } else if (this.f65913d.mo76489m().size() > 0 || this.f65913d.mo76488l().mo76444i().size() > 0) {
            if (this.f65913d.mo76487j() != null) {
                this.f65913d.mo76487j().mo68801w();
            }
            return true;
        } else {
            if (this.f65913d.mo76487j() != null) {
                this.f65913d.mo76487j().mo68803y();
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m96516q() {
        C16029o oVar = this.f65911a;
        if (oVar == null) {
            return;
        }
        if (!oVar.mo76515c().booleanValue()) {
            C7354d.m30376a(f65908o, "In foreground mode, schedule next scan", new Object[0]);
            C16028n.m96632g().mo76511f(this);
            return;
        }
        m96517r();
    }

    /* renamed from: r */
    private void m96517r() {
        if (this.f65911a != null) {
            String str = f65908o;
            C7354d.m30376a(str, "Checking to see if we need to start a passive scan", new Object[0]);
            if (this.f65911a.mo76521i().mo76442g()) {
                C7354d.m30379d(str, "We are inside a beacon region.  We will not scan between cycles.", new Object[0]);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C16024m mVar = this.f65913d;
                if (mVar != null) {
                    mVar.mo76498y(this.f65911a.mo76517e());
                }
            } else {
                C7354d.m30376a(str, "This is not Android O.  No scanning between cycles when using ScanJob", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public boolean m96518s() {
        BeaconManager A = BeaconManager.m33479A(getApplicationContext());
        A.mo37992c0(true);
        if (A.mo37982Q()) {
            C7354d.m30379d(f65908o, "scanJob version %s is starting up on the main process", "2.19.3");
        } else {
            String str = f65908o;
            C7354d.m30379d(str, "beaconScanJob library version %s is starting up on a separate process", "2.19.3");
            C13374a aVar = new C13374a(this);
            C7354d.m30379d(str, "beaconScanJob PID is " + aVar.mo70788b() + " with process name " + aVar.mo70789c(), new Object[0]);
        }
        Beacon.m33456q(new C7322e(this, BeaconManager.m33500v()));
        return m96515p();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m96519t() {
        this.f65914f = false;
        C16024m mVar = this.f65913d;
        if (mVar != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                mVar.mo76483A();
            }
            if (this.f65913d.mo76487j() != null) {
                this.f65913d.mo76487j().mo68803y();
                this.f65913d.mo76487j().mo68790i();
            }
        }
        C7354d.m30376a(f65908o, "Scanning stopped", new Object[0]);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String str = f65908o;
        C7354d.m30379d(str, "ScanJob Lifecycle START: " + this, new Object[0]);
        new Thread(new C16006a(jobParameters)).start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        String str = f65908o;
        C7354d.m30376a(str, "onStopJob called", new Object[0]);
        synchronized (this) {
            this.f65915g = true;
            if (jobParameters.getJobId() == m96513n(this)) {
                C7354d.m30379d(str, "onStopJob called for periodic scan " + this, new Object[0]);
            } else {
                C7354d.m30379d(str, "onStopJob called for immediate scan " + this, new Object[0]);
            }
            C7354d.m30379d(str, "ScanJob Lifecycle STOP: " + this, new Object[0]);
            this.f65912c.removeCallbacksAndMessages((Object) null);
            BeaconManager.m33479A(this).mo37973B();
            m96519t();
            m96517r();
            C16024m mVar = this.f65913d;
            if (mVar != null) {
                mVar.mo76484B();
            }
        }
        return false;
    }
}
