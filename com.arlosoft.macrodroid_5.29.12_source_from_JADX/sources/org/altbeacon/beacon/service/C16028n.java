package org.altbeacon.beacon.service;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.le.ScanResult;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.C8046c;
import p097gd.C7354d;

@RequiresApi(api = 21)
/* renamed from: org.altbeacon.beacon.service.n */
/* compiled from: ScanJobScheduler */
public class C16028n {

    /* renamed from: e */
    private static final String f65962e = "n";

    /* renamed from: f */
    private static final Object f65963f = new Object();
    @Nullable

    /* renamed from: g */
    private static volatile C16028n f65964g;
    @NonNull

    /* renamed from: a */
    private Long f65965a = 0L;
    @NonNull

    /* renamed from: b */
    private List<ScanResult> f65966b = new ArrayList();
    @Nullable

    /* renamed from: c */
    private C8046c f65967c;
    @NonNull

    /* renamed from: d */
    private boolean f65968d = true;

    private C16028n() {
    }

    /* renamed from: b */
    private void m96631b(Context context, BeaconManager beaconManager, C16029o oVar) {
        oVar.mo76513a(beaconManager);
        String str = f65962e;
        boolean z = false;
        C7354d.m30376a(str, "Applying scan job settings with background mode " + oVar.mo76515c(), new Object[0]);
        if (this.f65968d && oVar.mo76515c().booleanValue()) {
            C7354d.m30376a(str, "This is the first time we schedule a job and we are in background, set immediate scan flag to true in order to trigger the HW filter install.", new Object[0]);
            z = true;
        }
        m96633h(context, oVar, z);
    }

    @NonNull
    /* renamed from: g */
    public static C16028n m96632g() {
        C16028n nVar = f65964g;
        if (nVar == null) {
            synchronized (f65963f) {
                nVar = f65964g;
                if (nVar == null) {
                    nVar = new C16028n();
                    f65964g = nVar;
                }
            }
        }
        return nVar;
    }

    /* renamed from: h */
    private void m96633h(Context context, C16029o oVar, boolean z) {
        mo76510e(context);
        long k = (long) (oVar.mo76523k() - oVar.mo76524l());
        long j = 50;
        if (z) {
            C7354d.m30376a(f65962e, "We just woke up in the background based on a new scan result or first run of the app. Start scan job immediately.", new Object[0]);
            j = 0;
        } else {
            long elapsedRealtime = k > 0 ? SystemClock.elapsedRealtime() % ((long) oVar.mo76523k()) : 0;
            if (elapsedRealtime >= 50) {
                j = elapsedRealtime;
            }
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (oVar.mo76521i().mo76444i().size() + oVar.mo76522j().size() > 0) {
            if (!z && oVar.mo76515c().booleanValue()) {
                C7354d.m30376a(f65962e, "Not scheduling an immediate scan because we are in background mode.   Cancelling existing immediate ScanJob.", new Object[0]);
                jobScheduler.cancel(ScanJob.m96511l(context));
            } else if (j < ((long) (oVar.mo76523k() - 50))) {
                String str = f65962e;
                C7354d.m30376a(str, "Scheduling immediate ScanJob to run in " + j + " millis", new Object[0]);
                int schedule = jobScheduler.schedule(new JobInfo.Builder(ScanJob.m96511l(context), new ComponentName(context, ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle()).setMinimumLatency(j).setOverrideDeadline(j).build());
                if (schedule < 0) {
                    C7354d.m30377b(str, "Failed to schedule an immediate scan job.  Beacons will not be detected. Error: " + schedule, new Object[0]);
                } else if (this.f65968d) {
                    C7354d.m30376a(str, "First immediate scan job scheduled successful, change the flag to false.", new Object[0]);
                    this.f65968d = false;
                }
            } else {
                C7354d.m30376a(f65962e, "Not scheduling immediate scan, assuming periodic is about to run", new Object[0]);
            }
            JobInfo.Builder extras = new JobInfo.Builder(ScanJob.m96513n(context), new ComponentName(context, ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle());
            if (Build.VERSION.SDK_INT >= 24) {
                extras.setPeriodic((long) oVar.mo76523k(), 0).build();
            } else {
                extras.setPeriodic((long) oVar.mo76523k()).build();
            }
            JobInfo build = extras.build();
            String str2 = f65962e;
            C7354d.m30376a(str2, "Scheduling periodic ScanJob " + build + " to run every " + oVar.mo76523k() + " millis", new Object[0]);
            int schedule2 = jobScheduler.schedule(build);
            if (schedule2 < 0) {
                C7354d.m30377b(str2, "Failed to schedule a periodic scan job.  Beacons will not be detected. Error: " + schedule2, new Object[0]);
                return;
            }
            return;
        }
        C7354d.m30376a(f65962e, "We are not monitoring or ranging any regions.  We are going to cancel all scan jobs.", new Object[0]);
        jobScheduler.cancel(ScanJob.m96511l(context));
        jobScheduler.cancel(ScanJob.m96513n(context));
        if (Build.VERSION.SDK_INT >= 26) {
            new C16024m(context).mo76483A();
        }
    }

    /* renamed from: a */
    public void mo76507a(Context context, BeaconManager beaconManager) {
        C7354d.m30376a(f65962e, "Applying settings to ScanJob", new Object[0]);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        m96631b(context, beaconManager, C16029o.m96640m(context));
    }

    /* renamed from: c */
    public void mo76508c(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.cancel(ScanJob.m96511l(context));
        jobScheduler.cancel(ScanJob.m96513n(context));
        C8046c cVar = this.f65967c;
        if (cVar != null) {
            cVar.mo38048c();
        }
        this.f65968d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public List<ScanResult> mo76509d() {
        List<ScanResult> list = this.f65966b;
        this.f65966b = new ArrayList();
        return list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo76510e(Context context) {
        if (this.f65967c == null) {
            this.f65967c = C8046c.m33573a(context);
        }
        this.f65967c.mo38047b();
    }

    /* renamed from: f */
    public void mo76511f(Context context) {
        m96633h(context, C16029o.m96640m(context), false);
    }

    /* renamed from: i */
    public void mo76512i(Context context, List<ScanResult> list) {
        if (list != null) {
            this.f65966b.addAll(list);
        }
        synchronized (this) {
            if (System.currentTimeMillis() - this.f65965a.longValue() > WorkRequest.MIN_BACKOFF_MILLIS) {
                String str = f65962e;
                C7354d.m30376a(str, "scheduling an immediate scan job because last did " + (System.currentTimeMillis() - this.f65965a.longValue()) + "millis ago.", new Object[0]);
                this.f65965a = Long.valueOf(System.currentTimeMillis());
                m96633h(context, C16029o.m96640m(context), true);
                return;
            }
            C7354d.m30376a(f65962e, "Not scheduling an immediate scan job because we just did recently.", new Object[0]);
        }
    }
}
