package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.zzby;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class zzkc extends zzf {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f47217c;

    /* renamed from: d */
    protected final zzkb f47218d = new zzkb(this);

    /* renamed from: e */
    protected final zzka f47219e = new zzka(this);

    /* renamed from: f */
    protected final zzjy f47220f = new zzjy(this);

    zzkc(zzfr zzfr) {
        super(zzfr);
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m65997o(zzkc zzkc, long j) {
        zzkc.mo55073e();
        zzkc.m65999q();
        zzkc.f46899a.mo55221z().mo55102t().mo55092b("Activity paused, time", Long.valueOf(j));
        zzkc.f47220f.mo55488a(j);
        if (zzkc.f46899a.mo55219x().mo54921D()) {
            zzkc.f47219e.mo55492b(j);
        }
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m65998p(zzkc zzkc, long j) {
        zzkc.mo55073e();
        zzkc.m65999q();
        zzkc.f46899a.mo55221z().mo55102t().mo55092b("Activity resumed, time", Long.valueOf(j));
        if (zzkc.f46899a.mo55219x().mo54921D() || zzkc.f46899a.mo55189F().f46751r.mo55117b()) {
            zzkc.f47219e.mo55493c(j);
        }
        zzkc.f47220f.mo55489b();
        zzkb zzkb = zzkc.f47218d;
        zzkb.f47216a.mo55073e();
        if (zzkb.f47216a.f46899a.mo55212m()) {
            zzkb.mo55496b(zzkb.f47216a.f46899a.mo55201a().mo21950a(), false);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: q */
    public final void m65999q() {
        mo55073e();
        if (this.f47217c == null) {
            this.f47217c = new zzby(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo55058l() {
        return false;
    }
}
