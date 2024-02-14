package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzjt {

    /* renamed from: a */
    private final Context f47195a;

    public zzjt(Context context) {
        Preconditions.m4488k(context);
        this.f47195a = context;
    }

    /* renamed from: k */
    private final zzeh m65974k() {
        return zzfr.m65677H(this.f47195a, (zzcl) null, (Long) null).mo55221z();
    }

    @MainThread
    /* renamed from: a */
    public final int mo55474a(Intent intent, int i, int i2) {
        zzfr H = zzfr.m65677H(this.f47195a, (zzcl) null, (Long) null);
        zzeh z = H.mo55221z();
        if (intent == null) {
            z.mo55103u().mo55091a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo55207h();
        z.mo55102t().mo55093c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo55481h(new zzjq(this, i2, z, intent));
        }
        return 2;
    }

    @MainThread
    /* renamed from: b */
    public final IBinder mo55475b(Intent intent) {
        if (intent == null) {
            m65974k().mo55098p().mo55091a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgj(zzkt.m66034f0(this.f47195a), (String) null);
        }
        m65974k().mo55103u().mo55092b("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo55476c(int i, zzeh zzeh, Intent intent) {
        if (((zzjs) this.f47195a).mo54876f(i)) {
            zzeh.mo55102t().mo55092b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m65974k().mo55102t().mo55091a("Completed wakeful intent.");
            ((zzjs) this.f47195a).mo54874a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo55477d(zzeh zzeh, JobParameters jobParameters) {
        zzeh.mo55102t().mo55091a("AppMeasurementJobService processed last upload request.");
        ((zzjs) this.f47195a).mo54875b(jobParameters, false);
    }

    @MainThread
    /* renamed from: e */
    public final void mo55478e() {
        zzfr H = zzfr.m65677H(this.f47195a, (zzcl) null, (Long) null);
        zzeh z = H.mo55221z();
        H.mo55207h();
        z.mo55102t().mo55091a("Local AppMeasurementService is starting up");
    }

    @MainThread
    /* renamed from: f */
    public final void mo55479f() {
        zzfr H = zzfr.m65677H(this.f47195a, (zzcl) null, (Long) null);
        zzeh z = H.mo55221z();
        H.mo55207h();
        z.mo55102t().mo55091a("Local AppMeasurementService is shutting down");
    }

    @MainThread
    /* renamed from: g */
    public final void mo55480g(Intent intent) {
        if (intent == null) {
            m65974k().mo55098p().mo55091a("onRebind called with null intent");
            return;
        }
        m65974k().mo55102t().mo55092b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo55481h(Runnable runnable) {
        zzkt f0 = zzkt.m66034f0(this.f47195a);
        f0.mo55185B().mo55181x(new zzjr(this, f0, runnable));
    }

    @MainThread
    /* renamed from: i */
    public final boolean mo55482i(JobParameters jobParameters) {
        zzfr H = zzfr.m65677H(this.f47195a, (zzcl) null, (Long) null);
        zzeh z = H.mo55221z();
        String string = jobParameters.getExtras().getString("action");
        H.mo55207h();
        z.mo55102t().mo55092b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo55481h(new zzjp(this, z, jobParameters));
        return true;
    }

    @MainThread
    /* renamed from: j */
    public final boolean mo55483j(Intent intent) {
        if (intent == null) {
            m65974k().mo55098p().mo55091a("onUnbind called with null intent");
            return true;
        }
        m65974k().mo55102t().mo55092b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
