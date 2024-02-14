package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznw;
import com.google.android.gms.internal.measurement.zzpd;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzkb {

    /* renamed from: a */
    final /* synthetic */ zzkc f47216a;

    zzkb(zzkc zzkc) {
        this.f47216a = zzkc;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo55495a() {
        this.f47216a.mo55073e();
        if (this.f47216a.f46899a.mo55189F().mo55134t(this.f47216a.f46899a.mo55201a().mo21950a())) {
            this.f47216a.f46899a.mo55189F().f46745l.mo55116a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f47216a.f46899a.mo55221z().mo55102t().mo55091a("Detected application was in foreground");
                mo55497c(this.f47216a.f46899a.mo55201a().mo21950a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo55496b(long j, boolean z) {
        this.f47216a.mo55073e();
        this.f47216a.m65999q();
        if (this.f47216a.f46899a.mo55189F().mo55134t(j)) {
            this.f47216a.f46899a.mo55189F().f46745l.mo55116a(true);
            zzpd.m61097b();
            if (this.f47216a.f46899a.mo55219x().mo54919A((String) null, zzdu.f46625o0)) {
                this.f47216a.f46899a.mo55184A().mo55066t();
            }
        }
        this.f47216a.f46899a.mo55189F().f46748o.mo55121b(j);
        if (this.f47216a.f46899a.mo55189F().f46745l.mo55117b()) {
            mo55497c(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    /* renamed from: c */
    public final void mo55497c(long j, boolean z) {
        this.f47216a.mo55073e();
        if (this.f47216a.f46899a.mo55212m()) {
            this.f47216a.f46899a.mo55189F().f46748o.mo55121b(j);
            this.f47216a.f46899a.mo55221z().mo55102t().mo55092b("Session started, time", Long.valueOf(this.f47216a.f46899a.mo55201a().mo21952c()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f47216a.f46899a.mo55191I().mo55355M("auto", "_sid", valueOf, j);
            this.f47216a.f46899a.mo55189F().f46749p.mo55121b(valueOf.longValue());
            this.f47216a.f46899a.mo55189F().f46745l.mo55116a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f47216a.f46899a.mo55219x().mo54919A((String) null, zzdu.f46599b0) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f47216a.f46899a.mo55191I().mo55376t("auto", "_s", j, bundle);
            zznw.m61041b();
            if (this.f47216a.f46899a.mo55219x().mo54919A((String) null, zzdu.f46605e0)) {
                String a = this.f47216a.f46899a.mo55189F().f46754u.mo55124a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f47216a.f46899a.mo55191I().mo55376t("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
