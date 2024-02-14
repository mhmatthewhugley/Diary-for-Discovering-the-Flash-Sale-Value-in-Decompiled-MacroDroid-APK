package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzja implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47131a;

    /* renamed from: c */
    final /* synthetic */ zzjm f47132c;

    zzja(zzjm zzjm, zzq zzq) {
        this.f47132c = zzjm;
        this.f47131a = zzq;
    }

    public final void run() {
        zzjm zzjm = this.f47132c;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.m4488k(this.f47131a);
            H.mo55043O4(this.f47131a);
            this.f47132c.m65932E();
        } catch (RemoteException e) {
            this.f47132c.f46899a.mo55221z().mo55098p().mo55092b("Failed to send consent settings to the service", e);
        }
    }
}
