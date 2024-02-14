package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zziq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47104a;

    /* renamed from: c */
    final /* synthetic */ zzjm f47105c;

    zziq(zzjm zzjm, zzq zzq) {
        this.f47105c = zzjm;
        this.f47104a = zzq;
    }

    public final void run() {
        zzjm zzjm = this.f47105c;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.m4488k(this.f47104a);
            H.mo55052t5(this.f47104a);
        } catch (RemoteException e) {
            this.f47105c.f46899a.mo55221z().mo55098p().mo55092b("Failed to reset data on the service: remote exception", e);
        }
        this.f47105c.m65932E();
    }
}
