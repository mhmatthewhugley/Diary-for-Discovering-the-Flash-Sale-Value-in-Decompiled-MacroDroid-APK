package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzbt;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzkf extends zzkh {

    /* renamed from: d */
    private final AlarmManager f47224d = ((AlarmManager) this.f46899a.mo55202c().getSystemService(NotificationCompat.CATEGORY_ALARM));

    /* renamed from: e */
    private zzap f47225e;

    /* renamed from: f */
    private Integer f47226f;

    protected zzkf(zzkt zzkt) {
        super(zzkt);
    }

    /* renamed from: m */
    private final int m66005m() {
        if (this.f47226f == null) {
            this.f47226f = Integer.valueOf("measurement".concat(String.valueOf(this.f46899a.mo55202c().getPackageName())).hashCode());
        }
        return this.f47226f.intValue();
    }

    /* renamed from: n */
    private final PendingIntent m66006n() {
        Context c = this.f46899a.mo55202c();
        return PendingIntent.getBroadcast(c, 0, new Intent().setClassName(c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.f41295a);
    }

    /* renamed from: o */
    private final zzap m66007o() {
        if (this.f47225e == null) {
            this.f47225e = new zzke(this, this.f47227b.mo55525c0());
        }
        return this.f47225e;
    }

    /* renamed from: p */
    private final void m66008p() {
        JobScheduler jobScheduler = (JobScheduler) this.f46899a.mo55202c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m66005m());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo54913j() {
        AlarmManager alarmManager = this.f47224d;
        if (alarmManager != null) {
            alarmManager.cancel(m66006n());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m66008p();
        return false;
    }

    /* renamed from: k */
    public final void mo55501k() {
        mo55503f();
        this.f46899a.mo55221z().mo55102t().mo55091a("Unscheduling upload");
        AlarmManager alarmManager = this.f47224d;
        if (alarmManager != null) {
            alarmManager.cancel(m66006n());
        }
        m66007o().mo54996b();
        if (Build.VERSION.SDK_INT >= 24) {
            m66008p();
        }
    }

    /* renamed from: l */
    public final void mo55502l(long j) {
        mo55503f();
        this.f46899a.mo55207h();
        Context c = this.f46899a.mo55202c();
        if (!zzlb.m66122Y(c)) {
            this.f46899a.mo55221z().mo55097o().mo55091a("Receiver not registered/enabled");
        }
        if (!zzlb.m66123Z(c, false)) {
            this.f46899a.mo55221z().mo55097o().mo55091a("Service not registered/enabled");
        }
        mo55501k();
        this.f46899a.mo55221z().mo55102t().mo55092b("Scheduling upload, millis", Long.valueOf(j));
        long c2 = this.f46899a.mo55201a().mo21952c() + j;
        this.f46899a.mo55219x();
        if (j < Math.max(0, ((Long) zzdu.f46643y.mo55037a((Object) null)).longValue()) && !m66007o().mo54999e()) {
            m66007o().mo54998d(j);
        }
        this.f46899a.mo55207h();
        if (Build.VERSION.SDK_INT >= 24) {
            Context c3 = this.f46899a.mo55202c();
            ComponentName componentName = new ComponentName(c3, "com.google.android.gms.measurement.AppMeasurementJobService");
            int m = m66005m();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            zzbt.m59540a(c3, new JobInfo.Builder(m, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f47224d;
        if (alarmManager != null) {
            this.f46899a.mo55219x();
            alarmManager.setInexactRepeating(2, c2, Math.max(((Long) zzdu.f46634t.mo55037a((Object) null)).longValue(), j), m66006n());
        }
    }
}
