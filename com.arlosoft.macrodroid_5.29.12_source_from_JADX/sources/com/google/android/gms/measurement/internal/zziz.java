package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zziz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zzq f47125a;

    /* renamed from: c */
    final /* synthetic */ zzjm f47126c;

    zziz(zzjm zzjm, zzq zzq) {
        this.f47126c = zzjm;
        this.f47125a = zzq;
    }

    public final void run() {
        zzjm zzjm = this.f47126c;
        zzdx H = zzjm.f47171d;
        if (H == null) {
            zzjm.f46899a.mo55221z().mo55098p().mo55091a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.m4488k(this.f47125a);
            H.mo55046Z6(this.f47125a);
            this.f47126c.m65932E();
        } catch (RemoteException e) {
            this.f47126c.f46899a.mo55221z().mo55098p().mo55092b("Failed to send measurementEnabled to the service", e);
        }
    }
}
